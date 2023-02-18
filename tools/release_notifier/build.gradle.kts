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
    implementation("dev.schlaubi", "stdx-envconf", "1.2.1")
    implementation(platform("io.ktor:ktor-bom:2.2.3"))
    implementation("io.ktor", "ktor-client-core")
    implementation("io.ktor", "ktor-client-okhttp")
    implementation("io.ktor", "ktor-client-content-negotiation")
    implementation("io.ktor", "ktor-serialization-kotlinx-json")
    implementation("io.ktor", "ktor-client-auth")
}

application {
    mainClass.set("dev.schlaubi.kotlin_gradle.notifier.ReleaseNotifierKt")
}

tasks {
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "16"
            freeCompilerArgs = listOf("-Xopt-in=kotlinx.serialization.ExperimentalSerializationApi","-Xopt-in=kotlin.io.pathExperimentalPathApi")
        }
    }
}
