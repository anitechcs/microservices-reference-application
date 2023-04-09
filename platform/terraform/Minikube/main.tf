# Configure the Minikube Provider
provider "kubernetes" {
  config_context = "minikube" # Default minikube context name
}