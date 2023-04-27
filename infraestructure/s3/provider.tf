terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "4.51.0"
    }
  }
}

# Configure the AWS Provider
provider "aws" {
  access_key                  = "teste"
  secret_key                  = "teste"
  skip_credentials_validation = true
  skip_requesting_account_id  = true
  skip_metadata_api_check     = true
  region = "sa-east-1"
}