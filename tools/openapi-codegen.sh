#!/bin/sh
# This script will generate APIs code based on OpenAPI specification file

echo "Pulling latest version of openapi-generator-cli docker image..."
docker pull openapitools/openapi-generator-cli:latest

echo "Generating server code using openapi-generator-cli docker image..."
docker run --rm -v ${PWD}:/local openapitools/openapi-generator-cli generate \
    -i /local/sample.yml \
    -o /local/petstore \
    -g spring \
    --library spring-boot \
    --api-package com.anitechcs.bookstore.api \
    --model-package com.anitechcs.bookstore.model \
    --invoker-package com.anitechcs.bookstore \
    --group-id com.anitechcs \
    --artifact-id bookstore \
