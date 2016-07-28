moduleName := "fobo-kineticjs-api"

moduleName <<= (name, liftEdition) { (n, e) =>  n + "_" + e }