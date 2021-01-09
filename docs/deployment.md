# Deployment Strategy

> This document describes different approaches avaialble for deploying BookStore application.

There are mainly 2 types of deployment approach currently supported:

## 1. Run Locally Using Docker Compose

Docker Compose is right approach if you want to run the application locally to see all the components in action. We recommended this approach for learning / evaluation only. We have provided Docker-Compose scripts for this task which can be found under [deployment/docker-compose](../deployment/docker-compose).

Following script will help to run all services and required tools like postgres database, redis, grafana, keycloak etc in local.

```bash
cd microservices-reference-application

# Build image for all services
./build-docker-image.sh

# Run all services locally with required tools
./docker-compose.sh up

# Stop all services running locally
./docker-compose.sh down
```

## 2. Deploying to Kubernetes Cluster

You can find the `kubernetes` yaml file under [deployment/kubernetes](../deployment/kubernetes) folder to deploy each and every components required for this application.

Before starting deployment make sure your kubectl is pointing to the right kubernetes cluster. All the resources will be created on a separate namespace called `bookstore`. If you use provided `terraform` scripts, it will automatically create this namespace after provision kubernetes cluster. Make sure you create this namespace manually, if you are not using terraform script.

```bash
# Check what namespaces are available
kubectl get namespace

# Create namespace manually
kubectl create namespace bookstore
```

### Deploy Postgres Database

Following step will deploy all required kubernetes resources for postgres such as volumes, volume claims, storageclass, service, configmap and StatefulSet.

```bash
cd microservices-reference-application/deployment/kubernetes/postgres

# Create kubernetes resources for postgres
kubectl apply -f *.yaml
```

### Deploy Keycloak (Auth Server)

Following step will deploy postgres database and keycloak auth server with initial Realm `Bookstore` configuration.

```bash
cd microservices-reference-application/deployment/kubernetes/keycloak

Replace KEYCLOAK_URL in keycloak-ingress.yaml with your kubernetes URL.

# Create kubernetes resources for keycloak
kubectl apply -f *.yaml

Access your keycloak instance with your configured domain name:
e.g. https://keycloak.192.168.49.2.nip.io/
```

### Deploy Redis

TODO

### Deploy Grafana

TODO

### Deploy Loki

TODO

### Deploy Tempo

TODO

### Deploy Ambasador

TODO

### Deploy Elastic Search

TODO

### Deploy Prometheus

TODO

### Deploy Vault

TODO
