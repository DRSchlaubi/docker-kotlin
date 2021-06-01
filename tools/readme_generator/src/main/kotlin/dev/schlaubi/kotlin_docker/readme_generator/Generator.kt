package dev.schlaubi.kotlin_docker.readme_generator

import dev.schlaubi.kotlin_gradle.SavedKotlinVersion
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import kotlin.io.path.Path
import kotlin.io.path.readText
import kotlin.io.path.writeText


fun main() {
    val versions =
        Json.decodeFromString<List<SavedKotlinVersion>>(Path("../release_notifier/checked_versions.json").readText())

    val output = buildString {
        versions
            .dropLast(17) // First 17 releases are on old repo and already handled
            .forEach {
                val name = it.name.substringAfter("Kotlin ")
                append("### $name")
                appendLine()

                singleVariant(
                    true,
                    name,
                    "oracle/Dockerfile",
                    "https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile",
                    "openjdk",
                    "-oracle"
                )
                appendLine()
                singleVariant(
                    true,
                    name,
                    "alpine/Dockerfile",
                    "https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile",
                    "adoptopenjdk",
                    "alpine"
                )
                appendLine()
                singleVariant(
                    true,
                    name,
                    "debian/Dockerfile",
                    "https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile",
                    "adoptopenjdk",
                    "debian"
                )
                appendLine()
                singleVariant(
                    true,
                    name,
                    "slim/Dockerfile",
                    "https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile",
                    "adoptopenjdk",
                    "alpineslim"
                )
                appendLine()
            }
    }

    val template = Path("../../templates/README.md").readText()
    val newReadme = template.replace("%RELEASES%", output)
    Path("../../README.md").writeText(newReadme)
}

private fun StringBuilder.singleVariant(
    default: Boolean,
    version: String,
    dockerfileName: String,
    dockerfile: String,
    vendor: String,
    from: String,
    variantClassifier: String? = null
) {
    append("- ")
    if (default) {
        codeBlock(version)
    }

    listOf("jdk16", "jdk11", "jdk8").forEach { jdkVersion ->
        append(", ")
        codeBlock(version + "-" + jdkVersion + (variantClassifier?.let { "-$it" } ?: ""))
    }
    append(" ")

    singleVariantSuffix(dockerfileName, dockerfile, vendor, from)
}

private fun StringBuilder.codeBlock(content: String) = append('`').append(content).append('`')

private fun StringBuilder.singleVariantSuffix(
    dockerfileName: String,
    dockerfile: String,
    vendor: String,
    from: String
) =
    append('[')
        .append(dockerfileName)
        .append("](")
        .append(dockerfile)
        .append(") Based on ")
        .append(vendor)
        .append(" '")
        .append(from)
        .append(" tags")
