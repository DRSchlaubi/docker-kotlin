package dev.schlaubi.kotlin_gradle.notifier

import dev.schlaubi.kotlin_gradle.GithubKotlinVersion
import dev.schlaubi.kotlin_gradle.SavedKotlinVersion
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlin.io.path.Path
import kotlin.io.path.readText
import kotlin.io.path.writeText

const val RELEASES_ENDPOINT = "https://api.github.com/repos/JetBrains/kotlin/releases"
const val REPOSITORY_ENDPOINT = "https://api.github.com/repos/DRSchlaubi/docker-kotlin/"
const val CREATE_ISSUE_ENDPOINT = "${REPOSITORY_ENDPOINT}issues"
const val CREATE_RELEASE_ENDPOINT = "${REPOSITORY_ENDPOINT}releases"

val json = Json {
    ignoreUnknownKeys = true
}

val client = HttpClient {
    install(ContentNegotiation) {
        json(json)
    }

    defaultRequest {
        header(HttpHeaders.Authorization, "token ${Config.GITHUB_TOKEN}")
    }
}

suspend fun main() {
    println("Fetching releases")
    findVersions().forEach { (_, name, url, preRelease, downloadUrl) ->
        createIssue(name, url, preRelease, downloadUrl)
        createReleaseDraft(name.substringAfterLast(" "), url, preRelease)
    }

    client.close()
}

private suspend fun createReleaseDraft(
    name: String,
    url: String,
    preRelease: Boolean
) {
    postJson(CREATE_RELEASE_ENDPOINT, GithubRelease(name, """Kotlin release: $url""", preRelease))
}

private suspend fun createIssue(
    name: String,
    url: String,
    preRelease: Boolean,
    downloadUrl: String
) {
    println("Creating issue for release: $name")
    postJson(
        CREATE_ISSUE_ENDPOINT, GithubIssue(
            "⬆️ New Kotlin release $name",
            "[Kotlin version $name]($url) has been released.${if (preRelease) "\n⚠ This is a pre-release." else ""}\nCompiler: $downloadUrl",
            listOf("Kotlin release")
        )
    )
}

private suspend fun postJson(url: String, body: Any) {
    val response = client.post(url) {
        contentType(ContentType.Application.Json)

        setBody(body)
    }

    println("Github API responded: ${response.bodyAsText()} Code: ${response.status} Headers: ${response.headers}")
}

private suspend fun findVersions(): List<SavedKotlinVersion> {
    val versions = client.get(RELEASES_ENDPOINT)
        .body<List<GithubKotlinVersion>>()
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

    println("Update release files")
    val file = Path("checked_versions.json")
    val previousVersions = Json.decodeFromString<List<SavedKotlinVersion>>(file.readText())
    file.writeText(json.encodeToString(versions))

    return versions.filter { it !in previousVersions }.also {
        println("Found unhandled releases: $it")
    }
}
