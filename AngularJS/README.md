FoBo-AngularJS
=================

This sub module provides AngularJS components to the Fobo Module, but can also be used as-is (see below for setup information).
For more information on how to use AngularJS in the FoBo module see the [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo).

Components
----------
- AngularJS core (v1.0.6)
- Angular UI (v0.4.0)
- Angular UI Bootstrap (v0.2.0)
- Angular NG-Grid (v2.0.4)

Contributions
-------------
Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion to my priv. e-mail or on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

best regards 
Peter Petersson 

Update log
----------

For update history see the [History log](https://github.com/karma4u101/FoBo/tree/master/AngularJS#history-log) section

**Latest Module Version:**
- **2013-04-13** -- 0.1.0-SNAPSHOT 

**Latest Update:**
- **2013-04-13** -- 0.1.0-SNAPSHOT Making AngularJS a FoBo subproject.

**Latest Releases:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo) for releas information.


Integration into your project 
-------------------------------

This module is used by the FoBo module to, via [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md) provide [AngularJS](http://angularjs.org/) and angular components. 

However the FoBo-AngularJS module can be used separatly the only difference from using it from within the FoBo meta module is the usage of a slightly different package object name in Lift boot. 

The following describes how to set up the module in your project **as a separate module** (without using the [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md) meta module). For setup in FoBo see the FoBo documentation.

For more information on how to use AngularJS see the [FoBo Demo](http://www.media4u101.se/fobo-lift-template-demo/) and [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md).  


### Dependancy

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

For example:

    "net.liftmodules" %% "fobo-angularjs_2.5 % "0.1.0-SNAPSHOT"
      :
    <dependency>
      <groupId>net.liftmodules</groupId>
      <artifactId>fobo-angularjs_2.5_2.9.2</artifactId>
      <version>0.1.0-SNAPSHOT</version>
    </dependency>

The example will include a module built for lift 2.5. If you are using maven observe that the artifact id also needs the Scala version.


### Lift FoBo boot hooks

    import net.liftmodules.FoBoAJS 
    :
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS106      //The core files 
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSUI040          //Angular UI
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSUIBootstrap020 //Angular UI Bootstrap
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSNGGrid204      //Angular NG-Grid

    FoBoAJS.init()
    (usage with FoBo is FoBo.InitParam.ToolKit=FoBo.AngularJS106 //The core files) 

### Lift FoBo Template hooks

    <!-- AngularJS core files-->
    <script type="text/javascript" src="/classpath/fobo/angular.js"></script>
    <!-- ui-bootstrap with templats -->
    <script type="text/javascript" src="/classpath/fobo/ui-bootstrap-tpls.js"></script>
    <!-- ui-bootstrap barbones -->
    <script type="text/javascript" src="/classpath/fobo/ui-bootstrap.js"></script>
    <!-- angular ui -->
    <script type="text/javascript" src="/classpath/fobo/angular-ui.js"></script>
    <script type="text/javascript" src="/classpath/fobo/angular-ui-ieshiv.js"></script>
    <!-- angular ng-grid -->
    <script type="text/javascript" src="/classpath/fobo/ng-grid.js"></script>
    <link rel="stylesheet" type='text/css' href='/classpath/fobo/ng-grid.css'>

For more information on how to use AngularJS and included components:
- AngularJS see [AngularJS](http://angularjs.org/)
- Angular UI see [Angular UI](http://angular-ui.github.io/)
- Angular UI Bootstrap see [Angular UI Bootstrap](http://angular-ui.github.io/bootstrap/)
- Angular Angular NG-Grid see [Angular NG-Grid](http://angular-ui.github.io/ng-grid/)

### History log
----------------

**Module Version history:**
-

**Updates history:**
- 

**Snapshot Release history:**
- 


