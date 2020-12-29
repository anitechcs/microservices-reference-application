# Create namepsace
resource "kubernetes_namespace" "bookstore-ns" {
  metadata {
    name = var.namespace_name
  }
}