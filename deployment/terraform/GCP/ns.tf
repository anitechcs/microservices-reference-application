# namespaces
resource "kubernetes_namespace" "bookstore" {
  metadata {
    annotations = {
      name = "mra-bookstore"
    }

    labels = {
      project = "mra-bookstore"
    }

    name = "bookstore"
  }
}