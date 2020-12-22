#!/bin/bash
# This script will build docker images for all services

SERVICE=$1
SERVICE_NAME=('book-service' 'order-service' 'rating-service' 'promotion-service', 'bookstore') # Default to all service
ROOT_DIR=$PWD

case $SERVICE in 
*book-service*)
    SERVICE_NAME=('book-service')
    ;;
*order-service*)
    SERVICE_NAME=('order-service')
    ;;
*rating-service*)
    SERVICE_NAME=('rating-service')
    ;;
*promotion-service*)
    SERVICE_NAME=('promotion-service')
    ;;
*bookstore*)
    SERVICE_NAME=('bookstore')
    ;;
esac

for SERVC in "${SERVICE_NAME[@]}"
do
    echo "Building $SERVC docker image..."
    if [[ $SERVC == *book-service* ]]
    then
        cd $ROOT_DIR
        cd book-service
        mvn clean package -Dmaven.test.skip
        mkdir target/docker-packaging && (cd target/docker-packaging; jar -xf ../*.jar)
        docker build -t bookservice .

    elif [[ $SERVC == *order-service* ]]
    then
        cd $ROOT_DIR
        cd order-service
        mvn clean package -Dmaven.test.skip
        mkdir target/docker-packaging && (cd target/docker-packaging; jar -xf ../*.jar)
        docker build -t orderservice .

    elif [[ $SERVC == *rating-service* ]]
    then
        cd $ROOT_DIR
        cd rating-service
        docker build -t ratingservice .

    elif [[ $SERVC == *promotion-service* ]]
    then
        cd $ROOT_DIR
        cd promotion-service
        docker build -t promotionservice .

    elif [[ $SERVC == *bookstore* ]]
    then
        cd $ROOT_DIR
        cd bookstore
        docker build -t bookstore .

    fi
done