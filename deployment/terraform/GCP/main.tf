# Configure the GCP & Kubernetes Provider
terraform {
  required_providers {
    google = {
      source = "hashicorp/google"
      version = "3.5.0"
    }
    kubernetes = {
      source = "hashicorp/kubernetes"
      version = "1.13.3"
    }
  }
}

provider "google" {
  # Point to your credential file here before running the script
  credentials = file("<NAME>.json")

  project = var.project_id
  region  = var.region
  zone    = var.zone
}

# Retrieve an access token as the Terraform runner
data "google_client_config" "provider" {}

provider "kubernetes" {
  load_config_file = false

  host  = "https://${google_container_cluster.primary.endpoint}"
  token = data.google_client_config.provider.access_token
  cluster_ca_certificate = base64decode(
    google_container_cluster.primary.master_auth[0].cluster_ca_certificate,
  )
}