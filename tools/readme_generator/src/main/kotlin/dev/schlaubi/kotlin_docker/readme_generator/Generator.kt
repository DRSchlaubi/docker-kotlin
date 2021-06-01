package dev.schlaubi.kotlin_docker.readme_generator

import dev.schlaubi.kotlin_gradle.SavedKotlinVersion
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import kotlin.io.path.*


fun main() {
    val root = Path(System.getProperty("user.dir")).absolute().parent.parent
    val tools = root / "tools"
    val readmeTemplate = root / "templates" / "README.md"
    val readme = root / "README.md"
    val versionsFile = tools / "release_notifier" / "checked_versions.json"

    val versionsRaw =
        Json.decodeFromString<List<SavedKotlinVersion>>(versionsFile.readText())

    val output = buildString {
        val versions = versionsRaw.dropLast(17) // First 17 releases are on old repo and already handled
        // Header
        append("#### Versions")
        appendLine()
        versions.forEach {
            append("- [").append(it.versionName).append("](#")
                .append(it.versionName.lowercase().replace(".", ""))
                .append(')')
            appendLine()
        }

        appendLine()

        versions.forEach {
            val name = it.versionName
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
                "alpine",
                "alpine"
            )
            appendLine()
            singleVariant(
                true,
                name,
                "debian/Dockerfile",
                "https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile",
                "adoptopenjdk",
                "debian",
                "debian"
            )
            appendLine()
            singleVariant(
                true,
                name,
                "slim/Dockerfile",
                "https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile",
                "adoptopenjdk",
                "alpineslim",
                "slim"
            )
            appendLine()
        }
    }

    val template = readmeTemplate.readText()
    val newReadme = template.replace("%RELEASES%", output)
    readme.writeText(newReadme)
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
) {
    append('[')
        .append(dockerfileName)
        .append("](")
        .append(dockerfile)
        .append(") Based on ")
        .append(vendor)
        .append(' ')
        .codeBlock(from)
        .append(" tags")
}

val SavedKotlinVersion.versionName: String
    get() = name.substringAfter("Kotlin ")