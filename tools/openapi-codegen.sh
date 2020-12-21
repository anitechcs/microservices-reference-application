#!/bin/bash
# This script will generate APIs code based on OpenAPI specification file

SERVICE=$1
SPEC_FILE_NAME=('book-openapi-spec.yml' 'order-openapi-spec.yml' 'rating-openapi-spec.yml' 'promotion-openapi-spec.yml') # Default to all service

case $SERVICE in 
*book*)
    SPEC_FILE_NAME=('book-openapi-spec.yml')
    ;;
*order*)
    SPEC_FILE_NAME=('order-openapi-spec.yml')
    ;;
*rating*)
    SPEC_FILE_NAME=('rating-openapi-spec.yml')
    ;;
*promotion*)
    SPEC_FILE_NAME=('promotion-openapi-spec.yml')
    ;;
esac

echo "Pulling latest version of openapi-generator-cli docker image..."
docker pull openapitools/openapi-generator-cli:latest

for SERVC in "${SPEC_FILE_NAME[@]}"
do
    echo "Generating $SERVC server code using openapi-generator-cli docker image..."
    if [[ $SERVC == *book* ]]
    then
        docker run --rm -v ${PWD}:/local openapitools/openapi-generator-cli generate \
            -i /local/$SERVC \
            -o /local/book-service \
            -g spring \
            --library spring-boot \
            --api-package com.anitechcs.bookservice.api \
            --model-package com.anitechcs.bookservice.model \
            --invoker-package com.anitechcs.bookservice \
            --group-id com.anitechcs \
            --artifact-id book-service \

    elif [[ $SERVC == *order* ]]
    then
        docker run --rm -v ${PWD}:/local openapitools/openapi-generator-cli generate \
            -i /local/$SERVC \
            -o /local/order-service \
            -g spring \
            --library spring-boot \
            --api-package com.anitechcs.orderservice.api \
            --model-package com.anitechcs.orderservice.model \
            --invoker-package com.anitechcs.orderservice \
            --group-id com.anitechcs \
            --artifact-id order-service \

    elif [[ $SERVC == *rating* ]]
    then
        docker run --rm -v ${PWD}:/local openapitools/openapi-generator-cli generate \
            -i /local/$SERVC \
            -o /local/rating-service \
            -g nodejs-express-server \

    elif [[ $SERVC == *promotion* ]]
    then
        docker run --rm -v ${PWD}:/local openapitools/openapi-generator-cli generate \
            -i /local/$SERVC \
            -o /local/promotion-service \
            -g python-flask \
            --package-name promotionservice\

    fi
done

