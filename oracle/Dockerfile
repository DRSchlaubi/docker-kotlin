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

RUN curl -o unzip.rpm http://mirror.centos.org/centos/7/os/x86_64/Packages/unzip-6.0-21.el7.x86_64.rpm
RUN rpm -i unzip.rpm
RUN cd /usr/lib
RUN curl -L -o kotlin.zip $COMPILER_URL
RUN unzip kotlin.zip
RUN rm kotlin-compiler-*.zip
RUN rm -f kotlinc/bin/*.bat
RUN rm -f unzip.rpm

ENV PATH $PATH:/usr/lib/kotlinc/bin

CMD ["kotlinc"]
