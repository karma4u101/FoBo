moduleName := "fobo"

moduleName <<= (name, liftEdition) { (n, e) =>  n + "_" + e }


libraryDependencies <++= (liftVersion,liftEdition,version) { (v,e,mv) =>
    "net.liftmodules"  %% ("fobo-api"+"_"+e)                  % mv      % "compile" ::   
    "net.liftmodules"  %% ("fobo-pace"+"_"+e)                 % mv      % "compile" ::       
    "net.liftmodules"  %% ("fobo-jquery"+"_"+e)               % mv      % "compile" :: 
    "net.liftmodules"  %% ("fobo-kineticjs"+"_"+e)            % mv      % "compile" ::      
    "net.liftmodules"  %% ("fobo-angularjs"+"_"+e)            % mv      % "compile" :: 
    "net.liftmodules"  %% ("fobo-highlightjs"+"_"+e)          % mv      % "compile" ::     
    "net.liftmodules"  %% ("fobo-font-awesome"+"_"+e)         % mv      % "compile" :: 
    "net.liftmodules"  %% ("fobo-twbs-bootstrap3"+"_"+e)      % mv      % "compile" ::    
    "net.liftmodules"  %% ("fobo-twitter-bootstrap"+"_"+e)    % mv      % "compile" :: 
    "net.liftmodules"  %% ("fobo-google-code-prettify"+"_"+e) % mv      % "compile" ::
    Nil
}