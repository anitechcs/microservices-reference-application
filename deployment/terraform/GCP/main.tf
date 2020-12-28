# Configure the GCP Provider
terraform {
  required_providers {
    google = {
      source = "hashicorp/google"
      version = "3.5.0"
    }
  }
}

provider "google" {

  credentials = file("<NAME>.json")

  project = var.project_id
  region  = var.region
  zone    = var.zone
}

