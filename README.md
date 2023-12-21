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
- [1.9.22](#1922)
- [2.0.0-Beta2](#200-beta2)
- [1.9.21](#1921)
- [2.0.0-Beta1](#200-beta1)
- [1.9.20](#1920)
- [1.9.20-RC2](#1920-rc2)
- [1.9.20-RC](#1920-rc)
- [1.9.20-Beta2](#1920-beta2)
- [1.9.20-Beta](#1920-beta)
- [1.9.10](#1910)
- [1.9.0](#190)
- [1.9.0-RC](#190-rc)
- [1.8.22](#1822)

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
### 1.9.21
- `1.9.21`, `1.9.21-jdk16`, `1.9.21-jdk11`, `1.9.21-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `1.9.21`, `1.9.21-jdk16-alpine`, `1.9.21-jdk11-alpine`, `1.9.21-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `1.9.21`, `1.9.21-jdk16-debian`, `1.9.21-jdk11-debian`, `1.9.21-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `1.9.21`, `1.9.21-jdk16-slim`, `1.9.21-jdk11-slim`, `1.9.21-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags
### 2.0.0-Beta1
- `2.0.0-Beta1`, `2.0.0-Beta1-jdk16`, `2.0.0-Beta1-jdk11`, `2.0.0-Beta1-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `2.0.0-Beta1`, `2.0.0-Beta1-jdk16-alpine`, `2.0.0-Beta1-jdk11-alpine`, `2.0.0-Beta1-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `2.0.0-Beta1`, `2.0.0-Beta1-jdk16-debian`, `2.0.0-Beta1-jdk11-debian`, `2.0.0-Beta1-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `2.0.0-Beta1`, `2.0.0-Beta1-jdk16-slim`, `2.0.0-Beta1-jdk11-slim`, `2.0.0-Beta1-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags
### 1.9.20
- `1.9.20`, `1.9.20-jdk16`, `1.9.20-jdk11`, `1.9.20-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `1.9.20`, `1.9.20-jdk16-alpine`, `1.9.20-jdk11-alpine`, `1.9.20-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `1.9.20`, `1.9.20-jdk16-debian`, `1.9.20-jdk11-debian`, `1.9.20-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `1.9.20`, `1.9.20-jdk16-slim`, `1.9.20-jdk11-slim`, `1.9.20-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags
### 1.9.20-RC2
- `1.9.20-RC2`, `1.9.20-RC2-jdk16`, `1.9.20-RC2-jdk11`, `1.9.20-RC2-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `1.9.20-RC2`, `1.9.20-RC2-jdk16-alpine`, `1.9.20-RC2-jdk11-alpine`, `1.9.20-RC2-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `1.9.20-RC2`, `1.9.20-RC2-jdk16-debian`, `1.9.20-RC2-jdk11-debian`, `1.9.20-RC2-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `1.9.20-RC2`, `1.9.20-RC2-jdk16-slim`, `1.9.20-RC2-jdk11-slim`, `1.9.20-RC2-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags
### 1.9.20-RC
- `1.9.20-RC`, `1.9.20-RC-jdk16`, `1.9.20-RC-jdk11`, `1.9.20-RC-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `1.9.20-RC`, `1.9.20-RC-jdk16-alpine`, `1.9.20-RC-jdk11-alpine`, `1.9.20-RC-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `1.9.20-RC`, `1.9.20-RC-jdk16-debian`, `1.9.20-RC-jdk11-debian`, `1.9.20-RC-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `1.9.20-RC`, `1.9.20-RC-jdk16-slim`, `1.9.20-RC-jdk11-slim`, `1.9.20-RC-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags
### 1.9.20-Beta2
- `1.9.20-Beta2`, `1.9.20-Beta2-jdk16`, `1.9.20-Beta2-jdk11`, `1.9.20-Beta2-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `1.9.20-Beta2`, `1.9.20-Beta2-jdk16-alpine`, `1.9.20-Beta2-jdk11-alpine`, `1.9.20-Beta2-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `1.9.20-Beta2`, `1.9.20-Beta2-jdk16-debian`, `1.9.20-Beta2-jdk11-debian`, `1.9.20-Beta2-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `1.9.20-Beta2`, `1.9.20-Beta2-jdk16-slim`, `1.9.20-Beta2-jdk11-slim`, `1.9.20-Beta2-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags
### 1.9.20-Beta
- `1.9.20-Beta`, `1.9.20-Beta-jdk16`, `1.9.20-Beta-jdk11`, `1.9.20-Beta-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `1.9.20-Beta`, `1.9.20-Beta-jdk16-alpine`, `1.9.20-Beta-jdk11-alpine`, `1.9.20-Beta-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `1.9.20-Beta`, `1.9.20-Beta-jdk16-debian`, `1.9.20-Beta-jdk11-debian`, `1.9.20-Beta-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `1.9.20-Beta`, `1.9.20-Beta-jdk16-slim`, `1.9.20-Beta-jdk11-slim`, `1.9.20-Beta-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags
### 1.9.10
- `1.9.10`, `1.9.10-jdk16`, `1.9.10-jdk11`, `1.9.10-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `1.9.10`, `1.9.10-jdk16-alpine`, `1.9.10-jdk11-alpine`, `1.9.10-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `1.9.10`, `1.9.10-jdk16-debian`, `1.9.10-jdk11-debian`, `1.9.10-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `1.9.10`, `1.9.10-jdk16-slim`, `1.9.10-jdk11-slim`, `1.9.10-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags
### 1.9.0
- `1.9.0`, `1.9.0-jdk16`, `1.9.0-jdk11`, `1.9.0-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `1.9.0`, `1.9.0-jdk16-alpine`, `1.9.0-jdk11-alpine`, `1.9.0-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `1.9.0`, `1.9.0-jdk16-debian`, `1.9.0-jdk11-debian`, `1.9.0-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `1.9.0`, `1.9.0-jdk16-slim`, `1.9.0-jdk11-slim`, `1.9.0-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags
### 1.9.0-RC
- `1.9.0-RC`, `1.9.0-RC-jdk16`, `1.9.0-RC-jdk11`, `1.9.0-RC-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `1.9.0-RC`, `1.9.0-RC-jdk16-alpine`, `1.9.0-RC-jdk11-alpine`, `1.9.0-RC-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `1.9.0-RC`, `1.9.0-RC-jdk16-debian`, `1.9.0-RC-jdk11-debian`, `1.9.0-RC-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `1.9.0-RC`, `1.9.0-RC-jdk16-slim`, `1.9.0-RC-jdk11-slim`, `1.9.0-RC-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags
### 1.8.22
- `1.8.22`, `1.8.22-jdk16`, `1.8.22-jdk11`, `1.8.22-jdk8` [oracle/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/oracle/Dockerfile) Based on openjdk `-oracle` tags
- `1.8.22`, `1.8.22-jdk16-alpine`, `1.8.22-jdk11-alpine`, `1.8.22-jdk8-alpine` [alpine/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/alpine/Dockerfile) Based on adoptopenjdk `alpine` tags
- `1.8.22`, `1.8.22-jdk16-debian`, `1.8.22-jdk11-debian`, `1.8.22-jdk8-debian` [debian/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/debian/Dockerfile) Based on adoptopenjdk `debian` tags
- `1.8.22`, `1.8.22-jdk16-slim`, `1.8.22-jdk11-slim`, `1.8.22-jdk8-slim` [slim/Dockerfile](https://github.com/DRSchlaubi/docker-kotlin/blob/main/slim/Dockerfile) Based on adoptopenjdk `alpineslim` tags


### 1.4.20 and earlier
For 1.4 and earlier please check this repository: https://github.com/Zenkikat/docker-kotlin
