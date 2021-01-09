# Getting Started Guide

This guide will help you to setup and run this application in local system. Please make sure you have already installed following prerequisites before proceding further.

## Prerequsites

Before proceeding with setup, make sure you have following tools installed in your machine:

- Java v11+
- NodeJS v12+
- Docker
- Docker-Compose
- Python 3
- Maven
- Terraform

NOTE: Please refer to official installation guide for above tools installation.

## Code Checkout

Clone the source code from GitHub repository:

```bash
git clone git@github.com:anitechcs/microservices-reference-application.git
```

Open the code in Visual Studio Code:

```bash
cd microservices-reference-application
code .
```

## Understanding Directory Structure

Once you open the code in VS Code, you shoud see following structure:

```
microservices-reference-application/
├── .github/                        -> Github actions CI/CD config
├── book-service/                   -> Book service code
│   ├── src/                        -> Source folder
│   ├── README.md                   -> Readme file
│   ├── pom.xml                     -> Maven pom file
│   ├── Dockerfile                  -> Docker file for building image
│   ├── .dockerignore               -> Docker ignore file
│   └── .openapi-generator-ignore   -> OpenAPI ignore file
├── bookstore/                      -> Frontend Angular UI application
│   ├── e2e/                        -> End to end test cases
│   ├── nginx/                      -> NGINX server config
│   ├── src/                        -> Source folder
│   ├── README.md                   -> Readme file
│   ├── .browserslistrc             -> Supported browser list
│   ├── angular.json                -> Angular CLI config
│   ├── karma.conf.js               -> Karma test config
│   ├── package-lock.json           -> Package Json lock file
│   ├── package.json                -> Package JSON
│   ├── tsconfig.app.json           -> App tsconfig
│   ├── tsconfig.json               -> Base tsconfig
│   ├── tsconfig.spec.json          -> Spec tsconfig
│   ├── tslint.json                 -> Tslint config file
│   ├── Dockerfile                  -> Dockerfile for containerization
│   ├── .dockerignore               -> Docker ignore file
│   └── .editorconfig               -> Editor config file
├── deployment/                     -> Infrastructure and Deployment scripts
│   ├── docker-compose/             -> Doker compose scripts for running application locally
│   ├── kubernetes/                 -> Kubernetes scripts for deployment
│   └── terraform/                  -> Terraform scripts to provision infrastructure
├── docs/                           -> Documents folder
│   ├── images/                     -> Images used in docs
│   ├── architecture.md             -> Architecture document
│   ├── deployment.md               -> Deployment document
│   ├── getting-started.md          -> Getting started guide
│   └── infrastructure.md           -> Infrastructure document
├── order-service/                  -> Order service code
│   ├── src/                        -> Source folder
│   ├── README.md                   -> Readme file
│   ├── pom.xml                     -> Maven pom file
│   ├── Dockerfile                  -> Docker file for containerization
│   ├── .dockerignore               -> Docker ignore file
│   └── .openapi-generator-ignore   -> OpenAPI ignore file
├── promotion-service/              -> Promotion service code
│   ├── promotionservice/           -> Source folder
│   ├── README.md                   -> Readme file
│   ├── .travis.yml                 -> Travis config(Not used)
│   ├── git_push.sh                 -> Git push script(Not used)
│   ├── requirements.txt            -> Library Dependencies
│   ├── setup.py                    -> Setup file
│   ├── test-requirements.txt       -> Library Dependencies for tests
│   ├── tox.ini                     -> Tox config
│   ├── Dockerfile                  -> Docker file for containerization
│   ├── .dockerignore               -> Docker ignore file
│   └── .openapi-generator-ignore   -> OpenAPI ignore file
├── rating-service/                 -> Rating service code
│   ├── api/                        -> API folder
│   ├── controllers/                -> Controllers folder
│   ├── services/                   -> Services folder
│   ├── utils/                      -> Utils folder
│   ├── README.md                   -> Readme file
│   ├── .eslintrc.json              -> Eslint config
│   ├── config.js                   -> Application config
│   ├── expressServer.js            -> Express server
│   ├── index.js                    -> Entry point
│   ├── logger.js                   -> Logger implementation
│   ├── package-lock.json           -> Package JSON lock file
│   ├── package.json                -> Package JSON file
│   ├── Dockerfile                  -> Docker file for containerization
│   ├── .dockerignore               -> Docker ignore file
│   └── .openapi-generator-ignore   -> OpenAPI ignore file
├── tools/                          -> Contains few utility tools
│   ├── build-docker-image.sh       -> Build all docker images locally
│   ├── docker-compose.sh           -> Run all services locally
│   ├── openapi-codegen.sh          -> OpenAPI codegen script
│   └── swagger-editor.sh           -> Launch Swagger Editor script
├── .gitignore                      -> Git ignore file
├── book-openapi-spec.yml           -> Book service Open-API specification
├── LICENSE                         -> License file
├── order-openapi-spec.yml          -> Order service Open-API specification
├── promotion-openapi-spec.yml      -> Promotion service Open-API specification
├── rating-openapi-spec.yml         -> Rating service Open-API specification
└── README.md                       -> Global Readme file
```

## Running Applications Locally

In order to run application in local machine, you have to start postgres database. The docker-compose file has been provided inside deployment folder.

```bash
# Run the postgres database
docker-compose -f deployment/docker-compose/postgres.yaml up -d

# Connect to database if you want to check (Optional)
psql -h localhost -p 5432 -U postgres bookstore
```

Once database is up, you can go to indivisual service directory and excute following command to start the service in dev profile:

```bash
# Run Book Service
cd book-service
mvn spring-boot:run

# open your browser to here:
http://localhost:8080/
```

```bash
# Run Order Service
cd order-service
mvn spring-boot:run

# open your browser to here:
http://localhost:8080/
```

```bash
# Run Rating Service
cd rating-service
npm start

# open your browser to here:
http://localhost:8080/api-docs/
```

```bash
# Run Promotion Service
cd promotion-service
pip3 install -r requirements.txt
python3 -m promotionservice

# open your browser to here:
http://localhost:8080/v1/ui/
```

Finally run the frontend UI bookstore application:

```bash
# Run Frontend application
cd bookstore
ng serve

# open your browser to here:
http://localhost:4200/
```

> For more details, please follow indivisual README document available inside each service folder.

## Tools

We have provided few utility tools for developers to use while developing application locally. Make sure you make all the scripts as executable using following command from root folder.

```bash
cd microservices-reference-application
chmod +x tools/*.sh
```

### build-docker-image.sh

This script will help to build docker image all the services at once. If you pass service name it will build specic service otherwise it will build all 4 services and frontend application.

```bash
cd microservices-reference-application

# Build specific service
./tools/build-docker-image.sh book-service

# Build image for all services
./tools/build-docker-image.sh
```

### docker-compose.sh

This script will help to run all services and required tools like postgres database, keycloak etc in local. Make sure you execute previous step to build all images locally before running this step.

```bash
cd microservices-reference-application

# Build image for all services
./tools/build-docker-image.sh

# Run all services locally with required tools
./tools/docker-compose.sh up

# Stop all services running locally
./tools/docker-compose.sh down
```

### swagger-editor.sh

We are using API First micro services approch with OpenAPI specification. You can find specification yaml files at root of the project. This tool helps you to modify those API Spec files in Swagger Editer with live preview.

```bash
cd microservices-reference-application

# Open Book service spec file in Swagger Editor
./tools/swagger-editor.sh book-service

# Open Order service spec file in Swagger Editor
./tools/swagger-editor.sh order-service

# Open Rating service spec file in Swagger Editor
./tools/swagger-editor.sh rating-service

# Open Promotion service spec file in Swagger Editor
./tools/swagger-editor.sh promotion-service
```

### openapi-codegen.sh

This script will generate server code from provided OpenAPI specification file. You can generate single service code by passing service name as parameter otherwise it will generate code for all 4 services.

If you make any changes to OpenAPI spec file, make you run this script to generate corresponding code.

```bash
cd microservices-reference-application

# Generate code for book service
./tools/openapi-codegen.sh book-service

# Generate code for order service
./tools/openapi-codegen.sh order-service

# Generate code for rating service
./tools/openapi-codegen.sh rating-service

# Generate code for promotion service
./tools/openapi-codegen.sh promotion-service

# Generate code for all services
./tools/openapi-codegen.sh
```
