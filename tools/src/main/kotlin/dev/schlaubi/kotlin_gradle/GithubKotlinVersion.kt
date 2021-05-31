package dev.schlaubi.kotlin_gradle

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GithubKotlinVersion(
    val id: Int,
    val name: String,
    @SerialName("html_url")
    val htmlUrl: String,
    val prerelease: Boolean,
    val draft: Boolean,
    val assets: List<Asset>
) {
    @Serializable
    data class Asset(
        val name: String,
        @SerialName("browser_download_url")
        val browserDownloadUrl: String
    )

    fun toSavedKotlinVersion(compiler: Asset): SavedKotlinVersion = SavedKotlinVersion(
        id,
        name,
        htmlUrl,
        prerelease,
        compiler.browserDownloadUrl
    )
}
