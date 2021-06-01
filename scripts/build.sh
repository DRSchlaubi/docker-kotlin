#!/bin/sh

docker image build \
  --pull \
  -t "schlaubiboy/kotlin:$TAG" \
  --build-arg SOURCE="$SOURCE" \
  --build-arg GITHUB_SHA="$GITHUB_SHA" \
  --build-arg TAG="$TAG" \
  --build-arg COMPILER_URL="$COMPILER_URL" \
  --build-arg BUILD_DATE="$(date -Ins --utc)" \
  "$BUILD_CONTEXT"

echo Tagging "$ADDITIONAL_TAGS"
docker image tag "$TAG" "$ADDITIONAL_TAGS"

docker images

#echo "$DOCKER_PASSWORD" | docker login --username "$DOCKER_ACCOUNT" --password-stdin

#echo Pushing "$TAG"
#docker image push "$TAG"
#
#for tag in $ADDITIONAL_TAGS; do
#  echo Pushing "$tag"
#  docker image push "$tag"
#done
