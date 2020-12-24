### Getting Started Guide

## Prerequsites

Before proceeding with setup, make sure you have following tools installed in your machine:

```
- Java v11+
- NodeJS v12+
- Docker
- Docker-Compose
- Python 3
- Maven
```

## Permission for Tools
```
chmod +x tools/*.sh
```

## Running Postgres on Docker
```
docker run --name pg-docker --rm -p 5400:5432 -e POSTGRES_PASSWORD=docker -e POSTGRES_USER=docker -d postgres

psql -h localhost -p 5400 -U docker postgres
```

