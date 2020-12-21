#!/bin/bash
# This script will launch Swagger-Editor for updating OpenAPI specification file

PORT=8888
SERVICE=$1
SPEC_FILE_NAME='book-openapi-spec.yml' # Default to book service

case "$SERVICE" in 
*book*)
    SPEC_FILE_NAME='book-openapi-spec.yml'
    ;;
*order*)
    SPEC_FILE_NAME='order-openapi-spec.yml'
    ;;
*rating*)
    SPEC_FILE_NAME='rating-openapi-spec.yml'
    ;;
*promotion*)
    SPEC_FILE_NAME='promotion-openapi-spec.yml'
    ;;
esac

echo "Pulling latest version of swagger-editor docker image..."
docker pull swaggerapi/swagger-editor:latest

echo "Swagger-Editor running on port $PORT, Click Ctrl + C(Windows) / Command + C(Mac) to quit!"
docker run -p $PORT:8080 -v $(pwd):/tmp -e SWAGGER_FILE=/tmp/$SPEC_FILE_NAME swaggerapi/swagger-editor