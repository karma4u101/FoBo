moduleName := "fobo-highlightjs"

moduleName <<= (name, liftEdition) { (n, e) =>  n + "_" + e }

libraryDependencies <++= (liftVersion,liftEdition,version) { (v,e,mv) =>
    "net.liftmodules"  %% ("fobo-highlightjs-res"+"_"+e)   % mv         % "provided" :: 
    "net.liftmodules"  %% ("fobo-highlightjs-api"+"_"+e)   % mv         % "provided" ::
    Nil
}