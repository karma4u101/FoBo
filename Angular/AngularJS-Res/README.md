# FoBo AngularJS Resource Module

This resource module provides AngularJS resource components to the FoBo AngularJS module, but can also be used as-is (see below for setup information).
For more information on the AngularJS Resouce module see [FoBo AngularJS Module](https://github.com/karma4u101/AngularJS).

### Lift FoBo boot hooks (when used in the FoBo module)

    import net.liftmodules.FoBo 
    :
    FoBo.Resouce.Init=FoBo.Resouce.AngularJS121      //access to core files 
    FoBo.Resouce.Init=FoBo.Resouce.AngularJS121i18n   //access to angular i18n files 
    FoBo.Resouce.Init=FoBo.Resouce.AJSUIBootstrap070 //Angular UI Bootstrap
    FoBo.Resouce.Init=FoBo.Resouce.AJSMaterial101      //Angular Material
    FoBo.Resouce.Init=FoBo.Resouce.AJSUIGrid307      //Angular UI-Grid
    FoBo.Resouce.Init=FoBo.Resouce.AJSNGGrid207      //Angular NG-Grid

### Lift FoBo boot hooks (when used as stand alone module)

    import net.liftmodules.{FoBoAJSRes => FoBo} 
    :
    FoBo.... //same as above
    
### Lift FoBo Template hooks

See [FoBo AngularJS Module](https://github.com/karma4u101/AngularJS)

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

    "net.liftmodules" %% "fobo-angularjs-res_2.6 % "1.6"
      :
    <dependency>
      <groupId>net.liftmodules</groupId>
      <artifactId>fobo-angularjs-res_2.6_2.10.4</artifactId>
      <version>1.6</version>
    </dependency>

The example will include a module built for lift 2.6. If you are using maven observe that the artifact id also needs the Scala version.

## Contributions
Improvements, contributions and suggestions are welcome! Clone the project and start working on a PR. You can also leave a issue report or drop a question/suggestion to the [Lift's mailing list](http://groups.google.com/group/liftweb/) 


 


