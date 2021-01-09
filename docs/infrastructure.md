# Infrastructure

> This document explain how to provision infrastructure for running BookStore application along with all dependent services.

In order to deploy this `micro services application` to any cloud provider kubernetes cluster, we have to provision required infrastructure such as VPC, Subnets, VMs and kubernetes cluster itself. We use `Terraform` to define infrastructure as code to manage the full lifecycle — create new resources, manage existing ones, and destroy those no longer needed. You can find corresponding `terraform` scripts for your selected cloud vendor at [deployment/terraform](deployment/terraform) directory.

As a pre requisite, you need to have access to any specific cloud provider. In this case we are showing `Google Cloud Platform (GCP)` as an example. But you can follow similar steps for your corresponding cloud provider.

Inoredr to `terraform` connect to your Cloud account, You need to download a `credential` json file from from GCP console.

>NOTE: Never commit this credential file to Git. It should be in your local system and can be accessible by you only.

```bash

1. Update the path to the file in `main.tf` before proceeding.
2. Update `terraform.tfvars` file with your project specific details

# Provision Infrastructure in GCP
cd microservices-reference-application/deploy/terraform/GCP

# Initialize terraform
terraform init

# Verify the output which services are going to be created
terraform plan

# Provision required resouces, kubernetes cluster and create bookstore namespace
terraform apply --auto-approve
```

You can check from the GCP console, above services should have running already. For the next step you can refer to [Deployment Guide](deployment.md).
