# FoBo AngularJS API Module

This API module provides FoBo/Lift API functions for the AngularJS Module.
For more information on the AngularJS API module see [FoBo AngularJS Module](https://github.com/karma4u101/AngularJS).

### Lift FoBo boot hooks (when used in the FoBo module)

    import net.liftmodules.FoBo 
    :
    FoBo.API.Init=FoBo.API.AngularJS1 
    
### Lift FoBo boot hooks (when used as stand alone module)

    import net.liftmodules.{FoBoAJS => FoBo} 
    :
    FoBo.API.Init=FoBo.API.AngularJS1 
    
### Dependancy settings

Put the following in your project build.sbt files lift libraryDependencies section 

    "net.liftmodules" %% "moduleName_x1.y1 % "x2.y2[.z2][-SNAPSHOT/rcx/mx]"

or if you are using Maven

    <dependency>
      <groupId>net.liftmodules</groupId>
      <artifactId>moduleName_x1.y1_a.b.c</artifactId>
      <version>x2.y2[.z2][-SNAPSHOT/rcx/mx]</version>
    </dependency>

Where x1.y1 is Lift major and minor version numbers and a.b.c is Scala
version number and x2.y2.[z2] is the module's major x2, minor y2 and
eventual incremental numbers z2 followed by a eventual SNAPSHOT 
release candidate (rcX) or milestone (mX) version part.

For example (when using this module as a separete stand alone module outside of FoBo):

    "net.liftmodules" %% "fobo-angularjs-api_2.6 % "1.6"
      :
    <dependency>
      <groupId>net.liftmodules</groupId>
      <artifactId>fobo-angularjs-api_2.6_2.10.4</artifactId>
      <version>1.6</version>
    </dependency>

The example will include a module built for lift 2.6. If you are using maven observe that the artifact id also needs the Scala version.

## Contributions
Improvements, contributions and suggestions are welcome! Clone the project and start working on a PR. You can also leave a issue report or drop a question/suggestion to the [Lift's mailing list](http://groups.google.com/group/liftweb/) 

