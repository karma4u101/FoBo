moduleName := "fobo-highlightjs-res"

moduleName <<= (name, liftEdition) { (n, e) =>  n + "_" + e }
