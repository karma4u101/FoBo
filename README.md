# FoBo - A Modular Front-End Toolkit module for Lift 

[![Build Status](https://secure.travis-ci.org/karma4u101/FoBo.png)](http://travis-ci.org/karma4u101/FoBo)
[![Stories in Ready](https://badge.waffle.io/karma4u101/FoBo.svg?label=ready&title=Ready)](http://waffle.io/karma4u101/FoBo) 
[![Stories in Progress](https://badge.waffle.io/karma4u101/FoBo.svg?label=In Progress&title=In Progress)](http://waffle.io/karma4u101/FoBo) 
[![Gitter](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/karma4u101/FoBo?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

FoBo is a [Lift module](http://liftweb.net/lift_modules), composed of several Toolkit modules that includes industry leading open source front end 
toolkits for developing mobile scalable responsive web applications that will jazz up your Lift applications with the toolkit(s) of your choice.

The toolkit modules is in it's turn composed of a API module and a Resource module artifact making the usage of FoBo scalable and flexible.

A **live demo** and introduction to using the FoBo module(s), including [unified Scaladoc API documentation](http://www.media4u101.se/fobo-lift-template-demo/foboapi/current/index.html#net.liftmodules.FoBo.package) 
and links to running examples of starter templates and more, can be seen at the [FoBo Template Demo](http://www.media4u101.se/fobo-lift-template-demo/). 

With this Lift module you will get a hassle free inclusion and smooth upgrades of toolkits, you decide what toolkits artifacts and versions to enable.
The FoBo module is making development, maintenance, upgrade and fall-back quick and easy (typically a one liner change in lift boot), by 
simultaneously supporting several versions of the included toolkits and, without code or reference changes, providing debug-able js and css 
files in development and minimized files otherwise. 

Using this module you will also get a clean separation of the toolkit files and your application specific resources as the module dose not 
clutter your applications web-app resources directory. 

#### FoBo API
Some of the FoBo toolkit modules also includes a evolving FoBo/Lift API module that includes snippet:s and helper object:s (see API documents for usage) 
that will take care of some common toolkit and component initiation and usage, like lift site-map to bootstrap or Angular Material menu builders, 
resource injection, script generation and more.

#### FoBo - Lift starter template
**Bootstrap** A Lift v2.6 starter template with FoBo setup using Bootstrap v3.x and FoBo's BootstrapMegaMetaProtoUser (for mapper ProtoUser views) 
is available from here [Lift v2.6 Template Applications](https://github.com/lift/lift_26_sbt/)

**Bootstrap** A Lift v3.0 starter template with FoBo setup using Bootstrap v3.x and FoBo's BootstrapMegaMetaProtoUser (for mapper ProtoUser views) 
is available from here [Lift v3.0 Template Applications](https://github.com/lift/lift_30_sbt/)

**Material Design** A Lift v3.0 starter template with FoBo setup using Angular Material and FoBo's MaterialMegaMetaProtoUser (for mapper ProtoUser 
views) is available from here [FoBo-Demo](https://github.com/karma4u101/FoBo-Demo/)

For more information on how to get started with FoBo's starter templates see [Quick Start with Lift Template Applications](#quick-start-with-lift-template-applications)

If you have ideas and suggestions let us know!

## Contributions

Improvements, contributions and suggestions are welcome! Pick a issue marked as ready by the waffle badge above or open a new issue and start working 
on a PR. Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report 
or drop a question/suggestion to the [Lift's mailing list](http://groups.google.com/group/liftweb/) 

> As FoBo is using this [Git branching model](http://nvie.com/posts/a-successful-git-branching-model/) the **main branch** is just updated for releases 
> so your pull requests will, by default, be against the [Development branch](https://github.com/karma4u101/FoBo/blob/develop)
     
## Integration into your project 

### Dependency settings (General)

This section describes the general naming pattern for using any of FoBo's modules.

**SBT:** Add this to your project build.sbt files libraryDependencies section 
```scala
"net.liftmodules" %% "moduleName_x1.y1" % "x2.y2[.z2][-SNAPSHOT/rcx/mx]"
```
**Maven:** Add this in the dependency section of your pom file.
```xml
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>moduleName_x1.y1_a.b.c</artifactId>
  <version>x2.y2[.z2][-SNAPSHOT/rcx/mx]</version>
</dependency>
```
Where x1.y1 is Lift major and minor version numbers and a.b.c is Scala
version number and x2.y2.[z2] is the module's major x2, minor y2 and
eventual incremental numbers z2 followed by a eventual SNAPSHOT 
release candidate (rcX) or milestone (mX) version part.

### Dependency settings (FoBo's FoBo module)

To get access to **all** FoBo's toolkit, resource and api modules you can use FoBo's FoBo 
module as shown bellow. This is the simplest and probably most common way to use FoBo.
	
Setup example:

**SBT:**
```scala
"net.liftmodules" %% "fobo_3.0 % "1.7"
```      
**Maven:**      
```xml
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo_3.0_2.11.6</artifactId>
  <version>1.7</version>
</dependency>
```
The example shows how to include the FoBo/FoBo module built for lift 3.0.x. 
If you are using maven observe that the artifact id also needs the Scala version.
	
### Dependency setting (Toolkit / API / Resource)

To get access to exactly the FoBo toolkit, resource and/or api module(s) you expect
to use in your project you can use something like the following. 
For more information see respective Toolkit, API or Resource modules readme.  

Setup example using the FoBo/Lift Bootstrap3 API module:

**SBT:**
```scala
"net.liftmodules" %% "fobo-twbs-bootstrap3-api_3.0" % "1.7"
```      
**Maven:**
```xml      
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-twbs-bootstrap3-api_3.0_2.11.6</artifactId>
  <version>1.7</version>
</dependency>
```
The example shows how to include the FoBo Bootstrap3 API module built for lift 3.0.x. 
If you are using maven observe that the artifact id also needs the Scala version. 
	
### Lift FoBo boot hooks 

**Alternative:** Using the FoBo/FoBo module to get access to all FoBo's toolkit, resource and api modules, use 
the following into your lift Boot
```scala
import net.liftmodules.FoBo
  :    
//initiate a toolkit to initiate usage of both resource and api
FoBo.Toolkit.Init=FoBo.Toolkit.[ToolkitObjectXYZ]
FoBo.Toolkit.Init=FoBo.Toolkit.[additional toolkit object name]
//you can also initate one or more resources modules (excluding ev. Lift/FoBo API)
FoBo.Resource.Init=FoBo.Resource.[ResouceObjectXYZ]
FoBo.Resource.Init=FoBo.Resource.[additional resource object name]
//you can also initiate one or more API modules (providing the corresponding resource yourself)
FoBo.API.Init=FoBo.API.[APIObjectXYZ]
FoBo.API.Init=FoBo.API.[additional api object name]
``` 
   
**Alternative:** Using one of FoBo's Toolkit, Resource and/or API modules

```scala
import net.liftmodules.{FoBoXY => FoBo}
  :
//as above if toolkit
FoBo.Toolkit.Init=FoBo.Toolkit.[ToolkitObjectXYZ]
//as above if resource
FoBo.Resource.Init=FoBo.Resource.[ResouceObjectXYZ]
//as above if api
FoBo.API.Init=FoBo.API.[APIObjectXYZ]
```  
    
**Alternative:** Using several independently added FoBo modules (but not all)
```scala       
import net.liftmodules.{FoBoXY1,FoBoXY2}
  :
//toolkits
FoBoXY1.Toolkit.Init=FoBoXY1.Toolkit.[ToolkitObjectXYZ]
FoBoXY2.Toolkit.Init=FoBoXY2.Toolkit.[ToolkitObjectXYZ]
//resource
FoBoXY1.Resource.Init=FoBoXY1.Resource.[ResouceObjectXYZ]
FoBoXY2.Resource.Init=FoBoXY2.Resource.[ResouceObjectXYZ]      
//api
FoBoXY1.API.Init=FoBoXY1.API.[APIObjectXYZ]
FoBoXY2.API.Init=FoBoXY2.API.[APIObjectXYZ]
```   
### Lift FoBo Template hooks

Put something like the following in your Lift template(s) head section (see below for available names)	

```html 	
<link rel="stylesheet" type='text/css' href='/classpath/fobo/[css file name]'>
<link rel="stylesheet" type='text/css' href='/classpath/fobo/[another css file name]'> 
<link rel="stylesheet" type='text/css' href='/classpath/fobo/[a third css file name]'>
  :	
<link rel="stylesheet" type='text/css' href='[path/to/you/app/specific/css/file/in/the/webapp/dir]'>
  :
<script type="text/javascript" src="/classpath/fobo/[script file name]"></script>
<script type="text/javascript" src="/classpath/fobo/[another script file name]"></script>
<script type="text/javascript" src="/classpath/fobo/[a third script file name]"></script>
  :
``` 
For more information see readme in respective toolkit module.
You can now also use use FoBo's resource injection snippet to inject all your FoBo css and js resources 
```html
<link data-lift="FoBo.Resources.injectCSS?resources=file name,another file name,a third file name,..."></link>	
<link rel="stylesheet" type='text/css' href='[path/to/you/app/specific/css/file/in/the/webapp/dir]'>
<script data-lift="FoBo.Resources.injectJS?resources=file name,another file name,a third file name,..."></script>
``` 
For more information see [FoBo API: Resources](http://www.media4u101.se/fobo-lift-template-demo/foboapi/index.html#net.liftmodules.FoBo.snippet.FoBo.Resources)

## Module names 
The following is a list of names that can be used in Lift Boot either pulled in by the FoBo meta module or as stand alone (sub) modules. 
For more information se respective sub modules readme. 

- BootstrapXYZ 
- FontAwesomeXYZ 
- JQueryXYZ
- JQueryMigrateXYZ
- PrettifyXYZ
- HighlightJSXYZ
- PaceXYZ
- KineticJSXYZ
- AngularJSXYZ with components (AJSUIBootstrapXYZ, AJSUIGridXYZ, AJSNGGridXYZ, AJMaterialXYZ)

Where X is major, Y minor and Z incremental version numbers as seen in the Toolkits list above (for example BootstrapXYZ will be Bootstrap230 for 
Twitter Bootstrap v2.3.0) For more information on how to set this up see below. 

## FoBo Modules -- Toolkit:s and available versions

FoBo artifacts is available for: Lift 2.4, 2.5, 2.6.x and 3.0.x

- [FoBo](https://github.com/karma4u101/FoBo/tree/master/FoBo/FoBo) This module conatins all the bellow listed toolkit modules. 

FoBo is built up of several toolkit that in it's turn is built up of corresponding api and resource modules. Appart from 
beeing acessable from the FoBo / FoBo module the toolkit, api and resource modules is also available for use separately. 
 
The FoBo / FoBo module includes the following modules and supports the following toolkit versions

-   [FoBo-AngularJS](https://github.com/karma4u101/FoBo/tree/master/Angular) [v1.0.6, v1.2.11, v1.3.15, v1.4.1, v1.4.8, v1.5.3] (and components see [FoBo-AngularJS](https://github.com/karma4u101/FoBo/tree/master/Angular/AngularJS) )] - [Angular](http://angularjs.org/)
-   [FoBo-TwBs-Bootstrap3](https://github.com/karma4u101/FoBo/tree/master/Bootstrap/Bootstrap3) [v3.0.0, v3.0.1, v3.1.1, v3.2.0, v3.3.5, v3.3.6, v3.3.7] - [Bootstrap 3.x](http://getbootstrap.com/)
-   [FoBo-Twitter-Bootstrap](https://github.com/karma4u101/FoBo/tree/master/Bootstrap/Bootstrap2) [v2.3.2] - [Twitter Bootstrap](http://twitter.github.com/bootstrap/)
-   [FoBo-Font-Awesome](https://github.com/karma4u101/FoBo/tree/master/Font-Awesome) [v2.0.0, v3.0.0, v3.2.1, v4.0.1, v4.0.3, v4.1.0, v4.3.0, v4.5.0] - [Font Awesome](http://fortawesome.github.com/Font-Awesome/) 
-   [FoBo-JQuery](https://github.com/karma4u101/FoBo/tree/master/JQuery)  [v1.7.2, v1.8,2, v1.9.1, v1.10.2, v1.11.0, v1.11.1, v1.11.3, v2.1.1, v2.1.4, v2.2.4, v3.0.0, v3.1.0] - [JQuery](http://jquery.com/)
-   FoBo-JQuery also includes JQuery Migrate [v1.2.1, v1.4.1, v3.0.0] - [JQuery-Migrate](https://github.com/jquery/jquery-migrate/)
-   [FoBo-Google-Code-Prettify](https://github.com/karma4u101/FoBo/tree/master/Google-Code-Prettify) [vJun2011] - [google-code-prettify](https://github.com/google/code-prettify/)
-   [FoBo-Highlight](https://github.com/karma4u101/FoBo/tree/master/Highlight) [v9.3.0] - [highlight.js](https://highlightjs.org/) 
-   [FoBo-Pace](https://github.com/karma4u101/FoBo/tree/master/Pace) [v0.4.15, v1.0.2] - [Pace](http://github.hubspot.com/pace/docs/welcome/) 
-   [FoBo-Kinetic](https://github.com/karma4u101/FoBo/tree/master/Kinetic) [v5.1.0] - [Kinetic](http://kineticjs.com/) 

**Note:** Some of the listed toolkit versions may have been deprecated (and possible removed after having been deprecated in 2 releases).

## Available CSS and JavaScript files 

See the "Lift FoBo Template hooks" section in readme file for respective FoBo toolkit module listed above.

## Quick Start with Lift Template Applications

The only prerequisites for using this Lift module is that you have Git and Java installed and configured on the target computer but a suitable Lift 
template project will also come in handy. A Scala v2.11 Lift v2.6.x starter template with FoBo setup using Bootstrap v3.x and FoBo's 
BootstrapMegaMetaProtoUser (for mapper ProtoUser views) is available from here [Lift v2.6 Template Applications](https://github.com/lift/lift_26_sbt/).

You don't need to use it but this project's also includes a Eclipse (and a IDEA) plug-in for browsing the code, see the Scala IDE section below.   

## Scala IDE for Eclipse

Sbteclipse provides SBT command to create Eclipse project files

1) Usage

	project$ ./sbt
        > compile
	> eclipse 

2) In eclipse do: 

	File ==> Import...
	Select General ==> Existing Project into Workspace 
	Use "Brows" to look up the project root ....

Note: The compile step prior to the eclipse command in (1) is needed for eclipse to recognize the generated BuildInfo.scala file that is part of FoBo's build system.

## Updates 
For a comprehensive list of updates see [Changelog](https://github.com/karma4u101/FoBo/blob/develop/CHANGELOG.md)

## Old submodules
Modules available as maven artifacts but that have been split out of the FoBo / FoBo module. 
The modules can still be used as stand alone modules (Lift version < 3.0). 
-   Sonatype [FoBo-JQuery-Mobile](https://oss.sonatype.org/#nexus-search;quick~fobo-jquery-mobile) [v1.0.1, v1.1.0] - [JQuery Mobile](http://jquerymobile.com/)
    Usage FoBoJQM.InitParam.Toolkit=FoBoJQM.JQueryMobile110
-   Sonatype [FoBo-DataTables](https://oss.sonatype.org/#nexus-search;quick~fobo-datatables) [v1.9.0] - [DataTables.net](http://datatables.net/)
    Usage FoBoDT.InitParam.Toolkit=FoBoDT.DataTables190
-   Sonatype [FoBo-Knockout](https://oss.sonatype.org/#nexus-search;quick~fobo-knockout) [v2.0.0, v2.1.0, v2.2.1] - [KnockoutJS](http://knockoutjs.com/)
    Usage FoBoKO.InitParam.Toolkit=FoBoKO.Knockout221
-   Sonatype [FoBo-Foundation](https://oss.sonatype.org/#nexus-search;quick~fobo-foundation) [v2.1.5] - [ZURB/Foundation](http://foundation.zurb.com/)
    Usage FoBoFo.InitParam.Toolkit=FoBoFo.Foundation215
 
For feature listings on all releases see 
- [Changelog](https://github.com/karma4u101/FoBo/blob/develop/CHANGELOG.md)

## Authors
The FoBo Lift module is mostly written by [Peter Petersson](http://www.media4u101.se). The Lift Module conventions were 
developed by the [Lift community](http://groups.google.com/group/liftweb/).



