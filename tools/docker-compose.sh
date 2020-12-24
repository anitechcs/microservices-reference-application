#!/bin/bash
# This script will make docker-compose up / down
# Usage: ./tools/docker-compose.sh up

COMMAND=down # Default to down
$COMMAND=$1

echo "Command: $COMMAND"
if [ $COMMAND = *up* ] || [ $COMMAND = *down* ]
then
    docker-compose -f ../deployment/docker-compose/docker-compose.yaml $COMMAND -d
else
    echo "ERROR: Docker compose only accepts up / down parameter"
fi