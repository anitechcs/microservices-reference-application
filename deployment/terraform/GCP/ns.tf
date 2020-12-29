# namespaces
resource "kubernetes_namespace" "ns1" {
  metadata {
    annotations = {
      name = "mra-bookstore"
    }

    labels = {
      project = "mra-bookstore"
    }

    name = "bookstore"
  }

  depends_on = [
    google_container_node_pool.primary_preemptible_nodes
  ]
}