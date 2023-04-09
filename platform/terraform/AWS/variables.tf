variable "project_id" {
  description = "project id"
}

variable "region" {
  description = "region"
}

variable "zone" {
  description = "zone"
}

variable "vpc_name" {
  description = "Anitech VPC Name"
}

variable "subnet_name" {
  description = "Anitech VPC Subnet Name"
}

variable "gke_username" {
  default     = ""
  description = "gke username"
}

variable "gke_password" {
  default     = ""
  description = "gke password"
}

variable "gke_num_nodes" {
  default     = 1
  description = "number of gke nodes"
}

variable "gke_cluster_name" {
  default     = ""
  description = "GKE cluster name"
}