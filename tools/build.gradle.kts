plugins {
    kotlin("jvm") version "1.5.30"
    kotlin("plugin.serialization") version "1.5.30"
}

group = "dev.schlaubi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    api("org.jetbrains.kotlinx", "kotlinx-serialization-json", "1.2.2")
}
