moduleName := "fobo-twitter-bootstrap-api"

moduleName <<= (name, liftEdition) { (n, e) =>
  n + "_" + e
}
