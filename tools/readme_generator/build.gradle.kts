plugins {
    kotlin("jvm")
    application
}

group = "dev.schlaubi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":"))
}

application {
    mainClass.set("dev.schlaubi.kotlin_docker.readme_generator.GeneratorKt")
}
