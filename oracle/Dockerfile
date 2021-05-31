ARG SOURCE

FROM $SOURCE

ARG BUILD_DATE
ARG GITHUB_SHA
ARG TAG
ARG COMPILER_URL

LABEL org.label-schema.build-date=$BUILD_DATE \
      org.label-schema.description="Kotlin docker images built upon official openjdk images" \
      org.label-schema.name="kotlin" \
      org.label-schema.schema-version="1.0.0-rc1" \
      org.label-schema.usage="https://github.com/DRSchlaubi/docker-kotlin/blob/master/README.md" \
      org.label-schema.vcs-url="https://github.com/DRSchlaubi/docker-kotlin" \
      org.label-schema.vcs-ref=$GITHUB_SHA \
      org.label-schema.vendor="DRSchlaubi" \
      org.label-schema.version=$TAG

RUN curl -o unzip.rpm http://mirror.centos.org/centos/7/os/x86_64/Packages/unzip-6.0-21.el7.x86_64.rpm && \
    rpm -i unzip.rpm \
    cd /usr/lib && \
    curl --remote-name $COMPILER_URL && \
    unzip kotlin-compiler-*.zip && \
    yum remove -y wget unzip && \
    yum clean -y all && \
    rm kotlin-compiler-*.zip && \
    rm -f kotlinc/bin/*.bat && \
    rm -f unzip.rpm

ENV PATH $PATH:/usr/lib/kotlinc/bin

CMD ["kotlinc"]
