package dev.schlaubi.kotlin_gradle.notifier

import dev.schlaubi.kotlin_gradle.GithubKotlinVersion
import dev.schlaubi.kotlin_gradle.SavedKotlinVersion
import io.ktor.client.*
import io.ktor.client.features.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
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
        header(HttpHeaders.Authorization, "token ${Config.GITHUB_TOKEN}")
    }
}

suspend fun main() {
    println("Fetching releases")
    findVersions().forEach { (_, name, url, preRelease, downloadUrl) ->
        println("Creating issue for release: $name")
        val response = client.post<HttpResponse>(CREATE_ISSUE_ENDPOINT) {
            contentType(ContentType.Application.Json)

            body = GithubIssue(
                "⬆️ New Kotlin release $name",
                "[Kotlin version $name]($url) has been released.${if (preRelease) "\n⚠ This is a pre-release." else ""}\nCompiler: $downloadUrl",
                listOf("Kotlin release")
            )
        }

        println("Github API responded: ${response.readText()} Code: ${response.status} Headers: ${response.headers}")
    }
}

private suspend fun findVersions(): List<SavedKotlinVersion> {
    val versions = client.get<List<GithubKotlinVersion>>(RELEASES_ENDPOINT)
        .asSequence()
        .filter { !it.draft }
        .filter { it.assets.isNotEmpty() }
        .mapNotNull {
            val compiler = it.assets.firstOrNull { version ->
                version.name.contains("kotlin-compiler-")
            } ?: run {
                System.err.println("Could not find compiler asset for version ${it.name}. Available assets: ${it.assets}")
                return@mapNotNull null
            }

            it.toSavedKotlinVersion(compiler)
        }.toList()

    println("Update release fils")
    val file = Path("checked_versions.json")
    @Suppress("BlockingMethodInNonBlockingContext")
    file.writeText(json.encodeToString(versions))
    val previousVersions = Json.decodeFromString<List<SavedKotlinVersion>>(file.readText())

    return versions.filter { it !in previousVersions }.also {
        println("Found unhandled releases: $it")
    }
}
