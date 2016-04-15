# FoBo AngularJS Toolkit Module

This FoBo toolkit module provides AngularJS API and Resource components to the FoBo Module, 
but can also be used as-is, see below for setup information.

## Core modules 

- AngularJS core [v1.0.6, v1.2.11, v1.3.15, v1.4.1, v1.4.8, v1.5.3]

## Components

- Angular UI Bootstrap [v0.2.0, v0.7.0, v0.10.0]
- Angular NG-Grid [v2.0.4, v2.0.7]
- Angular UI-Grid [v3.0.7]
- Angular Material Design [v0.10.0, v1.0.1, v1.0.7]

## Integration into your project 

This module is included and used by the FoBo / FoBo module to, via [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md) 
provide [AngularJS](http://angularjs.org/) and angular components. 

This module can however be used separately i.e without dependence on the FoBo / FoBo module. 
Then apart from the dependency setting (see bellow) the only difference from using it from within the 
FoBo / FoBo module is the usage of a slightly different package object name in Lift boot (see bellow). 

### Dependency settings

**SBT:**
Put the following in your project build.sbt file libraryDependencies section 
```scala
"net.liftmodules" %% "moduleName_x1.y1 % "x2.y2[.z2][-SNAPSHOT/rcx/mx]"
```
**Maven:** 
Put the following in your project pom file dependencies section 
```xml
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>moduleName_x1.y1_a.b.c</artifactId>
  <version>x2.y2[.z2][-SNAPSHOT/rcx/mx]</version>
</dependency>
```
Here x1.y1 is Lift major and minor version numbers and a.b.c is Scala
version number and x2.y2.[z2] is the module's major x2, minor y2 and
eventual incremental numbers z2 followed by a eventual SNAPSHOT 
release candidate (rcX) or milestone (mX) version part.

For example when using this module as a stand alone module i.e without using the FoBo/FoBo module:

**SBT:**
```scala
"net.liftmodules" %% "fobo-angularjs_3.0 % "1.6"
``` 
**Maven:**
```xml      
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-angularjs_3.0_2.11.7</artifactId>
  <version>1.6</version>
</dependency>
```
The example will include the FoBo AngularJS Toolkit module v1.6 built for Lift 3.0.x. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used in the FoBo / FoBo module)
```scala
import net.liftmodules.FoBo 
  :
FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS153        //access to core files 
FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS153i18n    //access to angular i18n files 
FoBo.ToolKit.Init=FoBo.ToolKit.AJSUIBootstrap0100  //Angular UI Bootstrap
FoBo.ToolKit.Init=FoBo.ToolKit.AJSMaterial107      //Angular Material
FoBo.ToolKit.Init=FoBo.ToolKit.AJSUIGrid307        //Angular UI-Grid
FoBo.ToolKit.Init=FoBo.ToolKit.AJSNGGrid207        //Angular NG-Grid
```
### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.FoBoAJS 
  :
FoBoAJS.ToolKit.Init=FoBoAJS.ToolKit.AngularJS106      //The core files 
  :
```
### Lift FoBo Template hooks

Note FoBo is taking care of serving minimized files and corresponding hooks to map files (in production) so you 
do not have to worry about it. 
```html
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
```

For more information on how to use AngularJS see the [FoBo Demo](http://www.media4u101.se/fobo-lift-template-demo/) and [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md).  

### Core files

#### Core Css files

- angular-csp.css [v1.2.1, v1.3.15,v1.4.8, v1.5.3]

#### Core Script files

- angular.js [v1.0.6, v1.2.1, v1.2.2, v1.3.15, v1.4.8, v1.5.3]
- angular-animate.js [v1.2.1, v1.2.2, v1.3.15, v1.4.8, v1.5.3]
- angular-aria.js [v1.3.15, v1.4.0, v1.4.8, v1.5.3]
- angular-cookies.js [v1.2.1, v1.2.2, v1.3.15, v1.4.8, v1.5.3]
- angular-loader.js [v1.2.1, v1.2.2, v1.3.15, v1.4.8, v1.5.3]
- angular-message-format.js [v1.4.0, v1.4.8, v1.5.3]
- angular-messages.js [v1.3.15, v1.4.8, v1.5.3]
- angular-mocks.js (for test, only available in development) [v1.2.1, v1.2.2, v1.3.15, v1.4.8, v1.5.3]
- angular-resource.js [v1.2.1, v1.2.2, v1.3.15, v1.4.8, v1.5.3]
- angular-route.js [v1.2.1, v1.2.2, v1.3.15, v1.4.8, v1.5.3]
- angular-sanitize.js [v1.2.1, v1.2.2, v1.3.15, v1.4.8, v1.5.3]
- angular-scenario.js (for test, only available in development) [v1.2.1, v1.2.2, v1.3.15, v1.4.8] 
- angular-touch.js [v1.2.1, v1.2.2, v1.3.15, v1.4.8, v1.5.3]
- ngAnimateMock.js [v1.5.3]
- ngMock.js [v1.5.3]
- ngMockE2E [v1.5.3]

#### Components Css files

- ng-grid.css [v1.2.1, v1.2.2]
- angular-material.css [v0.10.0,v1.0.1,v1.0.7]
- angular-material.layouts.css [v1.0.1]
- ui-grid.css [v3.0.7]


#### Components Script files

- ui-bootstrap-tpls.js [v0.2.0, v0.7.0]
- ui-bootstrap.js [v0.2.0, v0.7.0]
- ng-grid.js [v2.0.4, v2.0.7]
- ui-grid.js [v3.0.7]
- angular-material.js [v0.10.0,v1.0.1,v1.0.7]
- angular-material-mocks.js [v1.0.1,v1.0.7]
 
#### i18n files

- angular-locale_[Locale ID].js [v1.2.1, v1.2.2, v1.3.15, v1.4.8]

Here Locale ID is = {af,af-na,af-za,am,am-et,ar,ar-001,ar-ae,ar-bh,ar-dz,.........,zu-za}
You will find more information about available locales at [Angular Guide i18n](http://docs.angularjs.org/guide/i18n)

#### More information
 
For more information on how to use AngularJS and included components:
- AngularJS see [AngularJS](http://angularjs.org/)
- Angular UI Bootstrap see [Angular UI Bootstrap](http://angular-ui.github.io/bootstrap/)
- Angular Angular NG-Grid see [Angular NG-Grid](http://angular-ui.github.io/ng-grid/)
- FoBo AngularJS Resouces module see [FoBo AngularJSRes](https://github.com/karma4u101/FoBo/Angular/AngularJSRes).
- FoBo AngularJS API module see [FoBo AngularJSAPI](https://github.com/karma4u101/FoBo/Angular/AngularJSAPI).
- FoBo AngularJS in the FoBo module see the [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo).

#### Update log

For update history see the [History log](https://github.com/karma4u101/FoBo/tree/master/CHANGELOG.md#history-log) section

**Latest Module Version:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo)  

**Latest Update:**
see [Changelog](https://github.com/karma4u101/FoBo/blob/develop/CHANGELOG.md)

**Latest Releases:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo) for releas information.

## Contributions
Improvements, contributions and suggestions are welcome! Clone the project and start working on a PR. You can also leave a issue report or drop a question/suggestion to the [Lift's mailing list](http://groups.google.com/group/liftweb/) 

 


