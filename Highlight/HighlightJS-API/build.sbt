moduleName := "fobo-highlightjs-api"

moduleName <<= (name, liftEdition) { (n, e) =>  n + "_" + e }
