package dev.schlaubi.kotlin_gradle

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SavedKotlinVersion(
    val id: Int,
    val name: String,
    @SerialName("html_url")
    val htmlUrl: String,
    @SerialName("prerelease")
    val preRelease: Boolean,
    @SerialName("download_url")
    val downloadUrl: String
)
