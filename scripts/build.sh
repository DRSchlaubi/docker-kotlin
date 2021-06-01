#!/bin/sh

REPO="hub.docker.com/schlaubiboy/kotlin"
GHCR_REPO="ghcr.io/drschlaubi/docker-kotlin/kotlin"
PUSH_TAG="$REPO:$TAG"

docker image build \
  --pull \
  -t "$PUSH_TAG" \
  --build-arg SOURCE="$SOURCE" \
  --build-arg GITHUB_SHA="$GITHUB_SHA" \
  --build-arg TAG="$TAG" \
  --build-arg COMPILER_URL="$COMPILER_URL" \
  --build-arg BUILD_DATE="$(date -Ins --utc)" \
  "$BUILD_CONTEXT"

if echo "$ADDITIONAL_TAG" | grep 'jdk'; then
  echo Tagging "$ADDITIONAL_TAG"
  docker image tag "$PUSH_TAG" "$REPO:$ADDITIONAL_TAG"
elif [ "$ROOT_TAG" = "true" ]; then
  if echo "$ADDITIONAL_TAG" | grep 'jdk'; then
    echo Tagging "$ADDITIONAL_TAG"
    docker image tag "$PUSH_TAG" "$REPO:$ADDITIONAL_TAG"
  else # only push root to ghcr
    docker image tag "$PUSH_TAG" "$REPO:$ADDITIONAL_TAG"
    docker image tag "$PUSH_TAG" "$GHCR_REPO:$ADDITIONAL_TAG"
  fi
fi

docker images

#echo "$DOCKER_PASSWORD" | docker login --username "$DOCKER_ACCOUNT" --password-stdin

#echo Pushing "$TAG"
#docker image push "$TAG"
#
#for tag in $ADDITIONAL_TAGS; do
#  echo Pushing "$tag"
#  docker image push "$tag"
#done
