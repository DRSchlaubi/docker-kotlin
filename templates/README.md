[![Docker Build Status](https://github.com/DRSchlaubi/docker-kotlin/actions/workflows/release.yaml/badge.svg)](https://github.com/DRSchlaubi/docker-kotlin/actions/workflows/release.yaml) [![Docker Pulls](https://img.shields.io/docker/pulls/schlaubiboy/kotlin)](https://hub.docker.com/r/schlaubiboy/kotlin/)

# Contents
- [Image Variants](#image-variants)
- [What is Kotlin?](#what-is-kotlin)
- [Usage](#usage)
- [Reference](#reference)
- [Versions](#supported-tags-and-respective-dockerfile-links)

### Image Variants
Each image gets build for 3 JDK versions JDK8, JDK11 and JDK16 (or the latest release at the time of publishing the image).
For each JDK version 4 different base images are used: oracle, debian, alpine, alpineslim

Therefore, the tag names are structured in this way:
schlaubiboy/kotlin:<kotlin-version>-jdk\<version>-\<os>

The default jdk version is always the latest at the time of publishing the image so right not it is 16

The default os is oracle so unlike other os images the oracle image is called `schlaubiboy/kotlin:<kotlin-version>-jdk<version>`


### What is Kotlin?

Kotlin is a statically-typed programming language that runs on the Java virtual machine and also can be compiled to JavaScript source code or use the LLVM compiler infrastructure. Its primary development is from a team of JetBrains programmers based in Saint Petersburg, Russia. While the syntax is not compatible with Java, Kotlin is designed to interoperate with Java code and is reliant on Java code from the existing Java Class Library, such as the collections framework.

See https://en.wikipedia.org/wiki/Kotlin_%28programming_language%29 for more information.

![Kotlin Logo](https://github.com/DRSchlaubi/docker-kotlin/raw/main/Kotlin-logo.png)

### Usage

Start using the Kotlin REPL : `docker container run -it --rm schlaubiboy/kotlin`

See Kotlin compiler version : `docker container run -it --rm schlaubiboy/kotlin kotlinc -version`

See Kotlin compiler help : `docker container run -it --rm schlaubiboy/kotlin kotlinc -help`

### Reference

* Kotlin website : https://kotlinlang.org

* Where to file issues : https://github.com/DRSchlaubi/docker-kotlin/issues

* Maintained by : https://schlau.bi

### Supported tags and respective `Dockerfile` links

%RELEASES%

### 1.4.20 and earlier
For 1.4 and earlier please check this repository: https://github.com/Zenkikat/docker-kotlin
