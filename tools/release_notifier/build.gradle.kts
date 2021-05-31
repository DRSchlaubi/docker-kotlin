plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
    application
}

group = "dev.schlaubi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://schlaubi.jfrog.io/artifactory/envconf")
}

dependencies {
    implementation(project(":"))
    implementation("dev.schlaubi", "envconf", "1.0")
    implementation(platform("io.ktor:ktor-bom:1.6.0"))
    implementation("io.ktor", "ktor-client-core")
    implementation("io.ktor", "ktor-client-okhttp")
    implementation("io.ktor", "ktor-client-json")
    implementation("io.ktor", "ktor-client-serialization")
    implementation("io.ktor", "ktor-client-auth")
}

application {
    mainClass.set("dev.schlaubi.kotlin_gradle.notifier.ReleaseNotifierKt")
}
