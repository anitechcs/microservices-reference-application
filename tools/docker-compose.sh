#!/bin/bash
# This script will make docker-compose up / down
# Usage: ./tools/docker-compose.sh up

COMMAND=$1

if [ $# -eq 0 ]
  then
    COMMAND=down # Default to down
fi

# Launch Docker-Compose
echo "Command: $COMMAND"
if [ "$COMMAND" == 'up' ] || [ "$COMMAND" == 'up' ]
then
    docker-compose -f deployment/docker-compose/docker-compose.yaml up -d
elif [ "$COMMAND" == 'down' ] || [ "$COMMAND" == 'DOWN' ]
then 
    docker-compose -f deployment/docker-compose/docker-compose.yaml down
else
    echo "ERROR: Docker compose only accepts up / down parameter"
fi