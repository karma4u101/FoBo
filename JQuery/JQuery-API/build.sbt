moduleName := "fobo-jquery-api"

moduleName <<= (name, liftEdition) { (n, e) =>  n + "_" + e }
