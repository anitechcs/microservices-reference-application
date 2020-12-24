#!/bin/bash
# This script will make docker-compose up / down
# Usage: ./tools/docker-compose.sh up

COMMAND=down # Default to down
COMMAND=$1

# Launch Docker-Compose
echo "Command: $COMMAND"
if [ $COMMAND == 'up' ] || [ $COMMAND == 'up' ]
then
    docker-compose -f deployment/docker-compose/docker-compose.yaml up -d
elif [ $COMMAND == 'down' ] || [ $COMMAND == 'DOWN' ]
then 
    docker-compose -f deployment/docker-compose/docker-compose.yaml down
else
    echo "ERROR: Docker compose only accepts up / down parameter"
fi