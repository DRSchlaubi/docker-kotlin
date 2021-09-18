package dev.schlaubi.kotlin_gradle.notifier

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@JvmRecord
data class GithubRelease(
    @SerialName("tag_name")
    val tagName: String,
    val name: String,
    val body: String,
    @SerialName("prerelease")
    val preRelease: Boolean,
    val draft: Boolean
) {
    constructor(name: String, body: String, preRelease: Boolean) : this(name, name, body, preRelease, true)
}
