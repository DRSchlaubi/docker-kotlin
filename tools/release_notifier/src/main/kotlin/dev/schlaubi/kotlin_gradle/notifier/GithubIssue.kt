package dev.schlaubi.kotlin_gradle.notifier

import kotlinx.serialization.Serializable

@Serializable
data class GithubIssue(
    val title: String,
    val body: String,
    val labels: List<String>
)