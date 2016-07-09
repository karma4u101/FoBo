moduleName := "fobo-api"

moduleName <<= (name, liftEdition) { (n, e) =>  n + "_" + e }