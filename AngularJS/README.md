FoBo-AngularJS
=================

This sub module provides AngularJS components to the FoBo Module, but can also be used as-is (see below for setup information).
For more information on how to use AngularJS in the FoBo module see the [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo).

Components and available versions 
---------------------------------
- AngularJS core [v1.0.6]
- Angular UI Bootstrap [v0.2.0]
- Angular NG-Grid [v2.0.4]

Contributions
-------------
Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion to my priv. e-mail or on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

best regards 
Peter Petersson 

Update log
----------

For update history see the [History log](https://github.com/karma4u101/FoBo/tree/master/AngularJS#history-log) section

**Latest Module Version:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo)  

**Latest Update:**
- **2013-05-09** -- 1.0-SNAPSHOT Removing one of the newly added Angular component (Angular UI v0.4.0) as it has been broken up into sub modules by upstream. 
- **2013-05-01** -- 0.9.9-SNAPSHOT One version to rule them all, unified FoBo module and sub-module versions.
- **2013-04-13** -- 0.1.0-SNAPSHOT Making AngularJS a FoBo subproject.

**Latest Releases:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo) for releas information.


Integration into your project 
-------------------------------

This module is included and used by the FoBo module to, via [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md) provide [AngularJS](http://angularjs.org/) and angular components. 

However the FoBo-AngularJS module can be used separately then apart from the dependency setting the only difference from using it from within the FoBo meta module is the usage of a slightly different package object name in Lift boot. 

For more information on how to use AngularJS see the [FoBo Demo](http://www.media4u101.se/fobo-lift-template-demo/) and [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md).  

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

    "net.liftmodules" %% "fobo-angularjs_2.5 % "1.0"
      :
    <dependency>
      <groupId>net.liftmodules</groupId>
      <artifactId>fobo-angularjs_2.5_2.9.2</artifactId>
      <version>1.0</version>
    </dependency>

The example will include a module built for lift 2.5. If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used in the FoBo module)

    import net.liftmodules.FoBo 
    :
    FoBo.InitParam.ToolKit=FoBo.AngularJS106      //The core files 
    FoBo.InitParam.ToolKit=FoBo.AJSUIBootstrap020 //Angular UI Bootstrap
    FoBo.InitParam.ToolKit=FoBo.AJSNGGrid204      //Angular NG-Grid
    FoBo.init()

### Lift FoBo boot hooks (when used as stand alone module)

    import net.liftmodules.FoBoAJS 
    :
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS106      //The core files 
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSUIBootstrap020 //Angular UI Bootstrap
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSNGGrid204      //Angular NG-Grid
    FoBoAJS.init()

### Lift FoBo Template hooks

    <!-- AngularJS core files-->
    <script type="text/javascript" src="/classpath/fobo/angular.js"></script>
    <!-- ui-bootstrap with templats -->
    <script type="text/javascript" src="/classpath/fobo/ui-bootstrap-tpls.js"></script>
    <!-- ui-bootstrap barbones -->
    <script type="text/javascript" src="/classpath/fobo/ui-bootstrap.js"></script>
    <!-- angular ng-grid -->
    <script type="text/javascript" src="/classpath/fobo/ng-grid.js"></script>
    <link rel="stylesheet" type='text/css' href='/classpath/fobo/ng-grid.css'>

For more information on how to use AngularJS and included components:
- AngularJS see [AngularJS](http://angularjs.org/)
- Angular UI Bootstrap see [Angular UI Bootstrap](http://angular-ui.github.io/bootstrap/)
- Angular Angular NG-Grid see [Angular NG-Grid](http://angular-ui.github.io/ng-grid/)

### History log
----------------

**Updates history:**
- 

 


