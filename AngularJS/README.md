FoBo-AngularJS
=================

This sub module provides AngularJS components to the FoBo Module, but can also be used as-is (see below for setup information).
For more information on how to use AngularJS in the FoBo module see the [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo).

Core modules 
---------------------------------
- AngularJS core [v1.0.6, v1.2.11, v1.3.15, v1.4.1, v1.4.8]

Components
----------
- Angular UI Bootstrap [v0.2.0, v0.7.0, v0.10.0]
- Angular NG-Grid [v2.0.4, v2.0.7]


Contributions
-------------
Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

Update log
----------

For update history see the [History log](https://github.com/karma4u101/FoBo/tree/master/AngularJS#history-log) section

**Latest Module Version:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo)  

**Latest Update:**
- **2015-11-22** -- Module v1.5-SNAPSHOT Adding AngularJS core v1.4.8 
- **2015-07-28** -- Module v1.4-SNAPSHOT Adding Angular-Material design v0.10.0
- **2015-06-21** -- Module v1.4-SNAPSHOT Adding AngularJS core v1.4.1
- **2015-06-04** -- Module v1.4-SNAPSHOT Adding AngularJS core v1.4.0 
- **2015-05-22** -- Module v1.4-SNAPSHOT Adding AngularJS core v1.3.15
- **2014-02-21** -- Module v1.2-SNAPSHOT Removing FoBo unpublished AngularJS v.1.2.1 and v1.2.2 in favor for v1.2.11
- **2014-02-05** -- Module v1.2-SNAPSHOT Adding Angular UI Bootstrap v0.10.0 (for use with bootstrap v3.x css)
- **2014-02-04** -- Module v1.2-SNAPSHOT Adding AngularJS core v1.2.11
- **2013-11-27** -- Module v1.2-SNAPSHOT Adding Angular UI Bootstrap v0.7.0 and Angular NG-Grid v2.0.7
- **2013-11-24** -- Module v1.2-SNAPSHOT Adding AngularJS core v1.2.2
- **2013-11-18** -- Module v1.2-SNAPSHOT Adding AngularJS core v1.2.1
- **2013-05-09** -- Module v1.0-SNAPSHOT Removing one of the newly added Angular component (Angular UI v0.4.0) as it has been broken up into sub modules by upstream. 
- **2013-05-01** -- Module v0.9.9-SNAPSHOT One version to rule them all, unified FoBo module and sub-module versions.
- **2013-04-13** -- Module v0.1.0-SNAPSHOT Making AngularJS a FoBo subproject.

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

    "net.liftmodules" %% "fobo-angularjs_2.6 % "1.3"
      :
    <dependency>
      <groupId>net.liftmodules</groupId>
      <artifactId>fobo-angularjs_2.6_2.10.4</artifactId>
      <version>1.3</version>
    </dependency>

The example will include a module built for lift 2.6. If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used in the FoBo module)

    import net.liftmodules.FoBo 
    :
    FoBo.InitParam.ToolKit=FoBo.AngularJS121      //access to core files 
    FoBo.InitParam.ToolKit=FoBo.AngularJS121i18n   //access to angular i18n files 
    FoBo.InitParam.ToolKit=FoBo.AJSUIBootstrap070 //Angular UI Bootstrap
    FoBo.InitParam.ToolKit=FoBo.AJSNGGrid207      //Angular NG-Grid
    FoBo.init()

### Lift FoBo boot hooks (when used as stand alone module)

    import net.liftmodules.FoBoAJS 
    :
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS106      //The core files 
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSUIBootstrap070 //Angular UI Bootstrap
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSNGGrid207      //Angular NG-Grid
    FoBoAJS.init()

### Lift FoBo Template hooks

Note FoBo is taking care of serving minimized files and coresponing hocks to map files (in production) so you do not have to worry about it. 

    <!-- AngularJS core files-->
    <script type="text/javascript" src="/classpath/fobo/angular.js"></script>
    <!-- localization file-->
    <script type="text/javascript" src="/classpath/fobo/angular-locale_en-us.js"></script>
    <!-- ui-bootstrap with templats -->
    <script type="text/javascript" src="/classpath/fobo/ui-bootstrap-tpls.js"></script>
    <!-- ui-bootstrap barbones -->
    <script type="text/javascript" src="/classpath/fobo/ui-bootstrap.js"></script>
    <!-- angular ng-grid -->
    <script type="text/javascript" src="/classpath/fobo/ng-grid.js"></script>
    <link rel="stylesheet" type='text/css' href='/classpath/fobo/ng-grid.css'>

Core Css files

- angular-csp.css [v1.2.1, v1.3.15,v1.4.8]

Core Script files

- angular.js [v1.0.6, v1.2.1, v1.2.2, v1.3.15, v1.4.8]
- angular-animate.js [v1.2.1, v1.2.2, v1.3.15, v1.4.8]
- angular-aria.js [v1.3.15, v1.4.0, v1.4.8]
- angular-cookies.js [v1.2.1, v1.2.2, v1.3.15, v1.4.8]
- angular-loader.js [v1.2.1, v1.2.2, v1.3.15, v1.4.8]
- angular-message-format.js [v1.4.0, v1.4.8]
- angular-messages.js [v1.3.15, v1.4.8]
- angular-mocks.js (for test, only available in development) [v1.2.1, v1.2.2, v1.3.15, v1.4.8]
- angular-resource.js [v1.2.1, v1.2.2, v1.3.15, v1.4.8]
- angular-route.js [v1.2.1, v1.2.2, v1.3.15, v1.4.8]
- angular-sanitize.js [v1.2.1, v1.2.2, v1.3.15, v1.4.8]
- angular-scenario.js (for test, only available in development) [v1.2.1, v1.2.2, v1.3.15, v1.4.8] 
- angular-touch.js [v1.2.1, v1.2.2, v1.3.15, v1.4.8]

Components Css files

- ng-grid.css [v1.2.1, v1.2.2]
- angular-material.css 
- angular-material.layouts.css

Components Script files

- ui-bootstrap-tpls.js [v0.2.0, v0.7.0]
- ui-bootstrap.js [v0.2.0, v0.7.0]
- ng-grid.js [v2.0.4, v2.0.7]
- angular-material.js
 
i18n files

- angular-locale_[Locale ID].js [v1.2.1, v1.2.2, v1.3.15, v1.4.8]

where Locale ID = {af,af-na,af-za,am,am-et,ar,ar-001,ar-ae,ar-bh,ar-dz,.........,zu-za}
You will find more information about available locales at [Angular Guide i18n](http://docs.angularjs.org/guide/i18n)

For more information on how to use AngularJS and included components:
- AngularJS see [AngularJS](http://angularjs.org/)
- Angular UI Bootstrap see [Angular UI Bootstrap](http://angular-ui.github.io/bootstrap/)
- Angular Angular NG-Grid see [Angular NG-Grid](http://angular-ui.github.io/ng-grid/)

### History log
----------------

**Updates history:**
- 

 


