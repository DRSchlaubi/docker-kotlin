package dev.schlaubi.kotlin_gradle.notifier

import dev.schlaubi.kotlin_gradle.GithubKotlinVersion
import dev.schlaubi.kotlin_gradle.SavedKotlinVersion
import io.ktor.client.*
import io.ktor.client.features.*
import io.ktor.client.features.auth.*
import io.ktor.client.features.auth.providers.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlin.io.path.Path
import kotlin.io.path.readText
import kotlin.io.path.writeText

const val RELEASES_ENDPOINT = "https://api.github.com/repos/JetBrains/kotlin/releases"
const val CREATE_ISSUE_ENDPOINT = "https://api.github.com/repos/DRSchlaubi/docker-kotlin/issues"

val json = Json {
    ignoreUnknownKeys = true
}

val client = HttpClient {
    install(JsonFeature) {
        serializer = KotlinxSerializer(json)
    }

    defaultRequest {
        header(HttpHeaders.Authorization, "Bearer ${Config.GITHUB_TOKEN}")
    }
}

suspend fun main() {
    findVersions().forEach { (_, name, url, preRelease, downloadUrl) ->
        client.put(CREATE_ISSUE_ENDPOINT) {
            body = GithubIssue(
                "⬆️ New Kotlin release $name",
                "[Kotlin version $name]($url) has been released.${if (preRelease) "\n⚠ This is a pre-release." else ""}\\nCompiler: $downloadUrl",
                listOf("Kotlin release")
            )
        }
    }
}

private suspend fun findVersions(): List<SavedKotlinVersion> {
    val versions = client.get<List<GithubKotlinVersion>>(RELEASES_ENDPOINT)
        .filter { !it.draft }
        .map {
            val compiler = it.assets.firstOrNull { version ->
                version.name.contains("kotlin-compiler-")
            } ?: run {
                error("Could not find compiler version. Available assets: ${it.assets}")
            }

            it.toSavedKotlinVersion(compiler)
        }

    val file = Path("previous.json")
    val previousVersions = Json.decodeFromString<List<SavedKotlinVersion>>(file.readText())
    file.writeText(json.encodeToString(versions))

    return versions.filter { it !in previousVersions }
}
