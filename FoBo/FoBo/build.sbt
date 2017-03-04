moduleName := "fobo"

moduleName := { name.value + "_" + liftEdition.value }

libraryDependencies ++= {
  "net.liftmodules" %% ("fobo-api" + "_" + liftEdition.value) % version.value % "compile" ::
    "net.liftmodules" %% ("fobo-pace" + "_" + liftEdition.value) % version.value % "compile" ::
      "net.liftmodules" %% ("fobo-jquery" + "_" + liftEdition.value) % version.value % "compile" ::
        "net.liftmodules" %% ("fobo-kineticjs" + "_" + liftEdition.value) % version.value % "compile" ::
          "net.liftmodules" %% ("fobo-angularjs" + "_" + liftEdition.value) % version.value % "compile" ::
            "net.liftmodules" %% ("fobo-highlightjs" + "_" + liftEdition.value) % version.value % "compile" ::
              "net.liftmodules" %% ("fobo-font-awesome" + "_" + liftEdition.value) % version.value % "compile" ::
                "net.liftmodules" %% ("fobo-twbs-bootstrap3" + "_" + liftEdition.value) % version.value % "compile" ::
                  "net.liftmodules" %% ("fobo-twitter-bootstrap" + "_" + liftEdition.value) % version.value % "compile" ::
                    "net.liftmodules" %% ("fobo-google-code-prettify" + "_" + liftEdition.value) % version.value % "compile" ::
                      Nil
}
