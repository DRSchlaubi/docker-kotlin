package dev.schlaubi.kotlin_gradle.notifier

import dev.schlaubi.envconf.environment

object Config {
    val GITHUB_TOKEN by environment
}
