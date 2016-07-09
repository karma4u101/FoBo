moduleName := "fobo-jquery"

moduleName <<= (name, liftEdition) { (n, e) =>  n + "_" + e }

libraryDependencies <++= (liftVersion,liftEdition,version) { (v,e,mv) =>
    "net.liftmodules"  %% ("fobo-jquery-api"+"_"+e)    % mv      % "provided" ::
    "net.liftmodules"  %% ("fobo-jquery-res"+"_"+e)    % mv      % "provided" ::
    Nil
}
