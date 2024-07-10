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

#### Versions
- [2.0.20-Beta2](#2020-beta2)
- [2.0.20-Beta1](#2020-beta1)
- [2.0.0](#200)
- [2.0.0-RC3](#200-rc3)
- [1.9.24](#1924)
- [2.0.0-RC2](#200-rc2)
- [2.0.0-RC1](#200-rc1)
- [2.0.0-Beta5](#200-beta5)
- [1.9.23](#1923)
- [2.0.0-Beta4](#200-beta4)
- [2.0.0-Beta3](#200-beta3)
- [1.9.22](#1922)
- [2.0.0-Beta2](#200-beta2)

### 2.0.20-Beta2
- `2.0.20-Beta2`, `2.0.20-Beta2-jdk16`, `2.0.20-Beta2-jdk11`, `2.0.20-Beta2-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `2.0.20-Beta2`, `2.0.20-Beta2-jdk16-alpine`, `2.0.20-Beta2-jdk11-alpine`, `2.0.20-Beta2-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `2.0.20-Beta2`, `2.0.20-Beta2-jdk16-debian`, `2.0.20-Beta2-jdk11-debian`, `2.0.20-Beta2-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `2.0.20-Beta2`, `2.0.20-Beta2-jdk16-slim`, `2.0.20-Beta2-jdk11-slim`, `2.0.20-Beta2-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags
### 2.0.20-Beta1
- `2.0.20-Beta1`, `2.0.20-Beta1-jdk16`, `2.0.20-Beta1-jdk11`, `2.0.20-Beta1-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `2.0.20-Beta1`, `2.0.20-Beta1-jdk16-alpine`, `2.0.20-Beta1-jdk11-alpine`, `2.0.20-Beta1-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `2.0.20-Beta1`, `2.0.20-Beta1-jdk16-debian`, `2.0.20-Beta1-jdk11-debian`, `2.0.20-Beta1-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `2.0.20-Beta1`, `2.0.20-Beta1-jdk16-slim`, `2.0.20-Beta1-jdk11-slim`, `2.0.20-Beta1-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags
### 2.0.0
- `2.0.0`, `2.0.0-jdk16`, `2.0.0-jdk11`, `2.0.0-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `2.0.0`, `2.0.0-jdk16-alpine`, `2.0.0-jdk11-alpine`, `2.0.0-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `2.0.0`, `2.0.0-jdk16-debian`, `2.0.0-jdk11-debian`, `2.0.0-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `2.0.0`, `2.0.0-jdk16-slim`, `2.0.0-jdk11-slim`, `2.0.0-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags
### 2.0.0-RC3
- `2.0.0-RC3`, `2.0.0-RC3-jdk16`, `2.0.0-RC3-jdk11`, `2.0.0-RC3-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `2.0.0-RC3`, `2.0.0-RC3-jdk16-alpine`, `2.0.0-RC3-jdk11-alpine`, `2.0.0-RC3-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `2.0.0-RC3`, `2.0.0-RC3-jdk16-debian`, `2.0.0-RC3-jdk11-debian`, `2.0.0-RC3-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `2.0.0-RC3`, `2.0.0-RC3-jdk16-slim`, `2.0.0-RC3-jdk11-slim`, `2.0.0-RC3-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags
### 1.9.24
- `1.9.24`, `1.9.24-jdk16`, `1.9.24-jdk11`, `1.9.24-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `1.9.24`, `1.9.24-jdk16-alpine`, `1.9.24-jdk11-alpine`, `1.9.24-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `1.9.24`, `1.9.24-jdk16-debian`, `1.9.24-jdk11-debian`, `1.9.24-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `1.9.24`, `1.9.24-jdk16-slim`, `1.9.24-jdk11-slim`, `1.9.24-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags
### 2.0.0-RC2
- `2.0.0-RC2`, `2.0.0-RC2-jdk16`, `2.0.0-RC2-jdk11`, `2.0.0-RC2-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `2.0.0-RC2`, `2.0.0-RC2-jdk16-alpine`, `2.0.0-RC2-jdk11-alpine`, `2.0.0-RC2-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `2.0.0-RC2`, `2.0.0-RC2-jdk16-debian`, `2.0.0-RC2-jdk11-debian`, `2.0.0-RC2-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `2.0.0-RC2`, `2.0.0-RC2-jdk16-slim`, `2.0.0-RC2-jdk11-slim`, `2.0.0-RC2-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags
### 2.0.0-RC1
- `2.0.0-RC1`, `2.0.0-RC1-jdk16`, `2.0.0-RC1-jdk11`, `2.0.0-RC1-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `2.0.0-RC1`, `2.0.0-RC1-jdk16-alpine`, `2.0.0-RC1-jdk11-alpine`, `2.0.0-RC1-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `2.0.0-RC1`, `2.0.0-RC1-jdk16-debian`, `2.0.0-RC1-jdk11-debian`, `2.0.0-RC1-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `2.0.0-RC1`, `2.0.0-RC1-jdk16-slim`, `2.0.0-RC1-jdk11-slim`, `2.0.0-RC1-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags
### 2.0.0-Beta5
- `2.0.0-Beta5`, `2.0.0-Beta5-jdk16`, `2.0.0-Beta5-jdk11`, `2.0.0-Beta5-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `2.0.0-Beta5`, `2.0.0-Beta5-jdk16-alpine`, `2.0.0-Beta5-jdk11-alpine`, `2.0.0-Beta5-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `2.0.0-Beta5`, `2.0.0-Beta5-jdk16-debian`, `2.0.0-Beta5-jdk11-debian`, `2.0.0-Beta5-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `2.0.0-Beta5`, `2.0.0-Beta5-jdk16-slim`, `2.0.0-Beta5-jdk11-slim`, `2.0.0-Beta5-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags
### 1.9.23
- `1.9.23`, `1.9.23-jdk16`, `1.9.23-jdk11`, `1.9.23-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `1.9.23`, `1.9.23-jdk16-alpine`, `1.9.23-jdk11-alpine`, `1.9.23-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `1.9.23`, `1.9.23-jdk16-debian`, `1.9.23-jdk11-debian`, `1.9.23-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `1.9.23`, `1.9.23-jdk16-slim`, `1.9.23-jdk11-slim`, `1.9.23-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags
### 2.0.0-Beta4
- `2.0.0-Beta4`, `2.0.0-Beta4-jdk16`, `2.0.0-Beta4-jdk11`, `2.0.0-Beta4-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `2.0.0-Beta4`, `2.0.0-Beta4-jdk16-alpine`, `2.0.0-Beta4-jdk11-alpine`, `2.0.0-Beta4-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `2.0.0-Beta4`, `2.0.0-Beta4-jdk16-debian`, `2.0.0-Beta4-jdk11-debian`, `2.0.0-Beta4-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `2.0.0-Beta4`, `2.0.0-Beta4-jdk16-slim`, `2.0.0-Beta4-jdk11-slim`, `2.0.0-Beta4-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags
### 2.0.0-Beta3
- `2.0.0-Beta3`, `2.0.0-Beta3-jdk16`, `2.0.0-Beta3-jdk11`, `2.0.0-Beta3-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `2.0.0-Beta3`, `2.0.0-Beta3-jdk16-alpine`, `2.0.0-Beta3-jdk11-alpine`, `2.0.0-Beta3-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `2.0.0-Beta3`, `2.0.0-Beta3-jdk16-debian`, `2.0.0-Beta3-jdk11-debian`, `2.0.0-Beta3-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `2.0.0-Beta3`, `2.0.0-Beta3-jdk16-slim`, `2.0.0-Beta3-jdk11-slim`, `2.0.0-Beta3-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags
### 1.9.22
- `1.9.22`, `1.9.22-jdk16`, `1.9.22-jdk11`, `1.9.22-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `1.9.22`, `1.9.22-jdk16-alpine`, `1.9.22-jdk11-alpine`, `1.9.22-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `1.9.22`, `1.9.22-jdk16-debian`, `1.9.22-jdk11-debian`, `1.9.22-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `1.9.22`, `1.9.22-jdk16-slim`, `1.9.22-jdk11-slim`, `1.9.22-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags
### 2.0.0-Beta2
- `2.0.0-Beta2`, `2.0.0-Beta2-jdk16`, `2.0.0-Beta2-jdk11`, `2.0.0-Beta2-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `2.0.0-Beta2`, `2.0.0-Beta2-jdk16-alpine`, `2.0.0-Beta2-jdk11-alpine`, `2.0.0-Beta2-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `2.0.0-Beta2`, `2.0.0-Beta2-jdk16-debian`, `2.0.0-Beta2-jdk11-debian`, `2.0.0-Beta2-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `2.0.0-Beta2`, `2.0.0-Beta2-jdk16-slim`, `2.0.0-Beta2-jdk11-slim`, `2.0.0-Beta2-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags


### 1.4.20 and earlier
For 1.4 and earlier please check this repository: https://github.com/Zenkikat/docker-kotlin
