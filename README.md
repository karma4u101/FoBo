FoBo - A Comprehensive Front-End Toolkit Module for Lift 
==================================================

[![Build Status](https://secure.travis-ci.org/karma4u101/FoBo.png)](http://travis-ci.org/karma4u101/FoBo)

[![Gitter](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/karma4u101/FoBo?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

FoBo is a [Lift module](http://liftweb.net/lift_modules) that includes industry leading open source front end toolkits for developing mobile scalable responsive web applications that will jazz up your Lift applications with the toolkit(s) of your choice.

A **live demo** and introduction to using this module including API documentation can be [seen here](http://www.media4u101.se/fobo-lift-template-demo/). 

With this Lift module you will get a hassle free inclusion and smooth upgrades of toolkits, you decide what toolkits and versions to enable.
The FoBo module is making development, maintenance, upgrade and fall-back quick and easy (typically a one liner change in lift boot), by simultaneously supporting several versions of the included toolkits and, without code or reference changes, providing debug-able js and css files in development and minimized files otherwise. 

Using this module you will also get a clean separation of the toolkit files and your application specific resources as the module dose not clutter your applications web-app resources directory. 

####FoBo API
The FoBo module also has a evolving API that includes snippet:s and helper object:s (see API documents for usage) that will take care of some common toolkit and component initiation and usage, like lift sitemap to bootstrap menu builders, resource injection, script generation and more.

####FoBo - Lift starter template
**Bootstrap** A Lift v2.6 starter template with FoBo setup using Bootstrap v3.x and FoBo's BootstrapMegaMetaProtoUser (for mapper ProtoUser views) is available from here [Lift v2.6 Template Applications](https://github.com/lift/lift_26_sbt/)

If you have ideas and suggestions let us know!

Contributions
-------------
Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion to the [Lift's mailing list](http://groups.google.com/group/liftweb/) 

> As FoBo is using this [Git branching model](http://nvie.com/posts/a-successful-git-branching-model/) the **main branch** is just updated for releases so make your pull requests against the [Development branch](https://github.com/karma4u101/FoBo/blob/develop)


###Module names 
The following is a list of names that can be used in Lift Boot eather pulled in by the FoBo meta module or as stand alone (sub) modules. 
For more information se respective sub modules readme. 

- BootstrapXYZ 
- FontAwesomeXYZ 
- JQueryXYZ
- JQueryMigrateXYZ
- PrettifyXYZ
- PaceXYZ
- KineticJSXYZ
- AngularJSXYZ with components (AJSUIBootstrapXYZ, AJSNGGridXYZ, AJMaterialXYZ)

Where X is major, Y minor and Z incremental version numbers as seen in the Toolkits list above (for example BootstrapXYZ will be Bootstrap230 for Twitter Bootstrap v2.3.0)
For more information on how to set this up see below. 
    
Quick Start with Lift Template Applications
-------------------------------------------

The only prerequisites for using this Lift module is that you have Git and Java installed and configured on the target computer but a suitable Lift template project will also come in handy.
A Scala v2.11 Lift v2.6.x starter template with FoBo setup using Bootstrap v3.x and FoBo's BootstrapMegaMetaProtoUser (for mapper ProtoUser views) is available from here [Lift v2.6 Template Applications](https://github.com/lift/lift_26_sbt/).

You don't need to use it but this project's also includes a Eclipse (and a IDEA) plug-in for browsing the code, see the Scala IDE section below.   
 
Integration into your project 
-------------------------------

### Dependency settings
	
For module versions >= 0.9.3 put the following in your project build.sbt files lift libraryDependencies section 

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

    "net.liftmodules" %% "fobo_2.6 % "1.5.0-SNAPSHOT"
      :
    <dependency>
      <groupId>net.liftmodules</groupId>
      <artifactId>fobo_2.6_2.11.6</artifactId>
      <version>1.5.0-SNAPSHOT</version>
    </dependency>

The example will include a module built for lift 2.6.x. If you are using maven observe that the artifact id also needs the Scala version.
	
now do a sbt clean update .....
	
### Lift FoBo boot hooks 

Put the following into your lift Boot

    import net.liftmodules.FoBo
    
    //If using defaults FoBo init params can be omitted
    FoBo.InitParam.JQuery=FoBo.[JQueryXYZ module option name]
    FoBo.InitParam.ToolKit=FoBo.[ToolkitXYZ module option name]
    FoBo.InitParam.ToolKit=FoBo.[ev. additional/extra toolkit module name]
       :
    FoBo.init()

### Lift FoBo Template hooks

Put something like the following in your Lift templat(s) head section (see below for available names)	
 	
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

For more information see readme in respective sub module.
You can now also use use FoBo's resource injection snippet to inject all your fobo css and js resources 

    <link data-lift="FoBo.Resources.injectCSS?resources=file name,another file name,a third file name,..."></link>	
    <link rel="stylesheet" type='text/css' href='[path/to/you/app/specific/css/file/in/the/webapp/dir]'>
    <script data-lift="FoBo.Resources.injectJS?resources=file name,another file name,a third file name,..."></script>

For more information see [FoBo API: Resources](http://www.media4u101.se/fobo-lift-template-demo/foboapi/index.html#net.liftmodules.FoBo.snippet.FoBo.Resources)


Available CSS and JavaScript files 
----------------------------------

See the "Lift FoBo Template hooks" section in readme file for respective FoBo module listed above.

Scala IDE for Eclipse
---------------------
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


Sub-Modules -- Toolkit:s and available versions
-----------------------------------------------

FoBo is built up of several sub module that also is available for use separately 
 
FoBo artifacts is available for: Lift 2.4, 2.5, 2.6 and 3.0-SNAPSHOT

The FoBo meta module includes the following sub-modules and supports the following toolkit versions

-   [FoBo-AngularJS](https://github.com/karma4u101/FoBo/tree/master/AngularJS) [v1.0.6, v1.2.11 (and components see [FoBo-AngularJS](https://github.com/karma4u101/FoBo/tree/master/AngularJS) )] - [Angular](http://angularjs.org/)
-   [FoBo-TwBs-Bootstrap3](https://github.com/karma4u101/FoBo/tree/master/TwBs-Bootstrap3) [v3.0.0, v3.0.1] - [Bootstrap 3.x](http://getbootstrap.com/)
-   [FoBo-Twitter-Bootstrap](https://github.com/karma4u101/FoBo/tree/master/Twitter-Bootstrap) [v2.1.0, v2.2.0, v2.2.2, v2.3.0, v2.3.1, v2.3.2] - [Twitter Bootstrap](http://twitter.github.com/bootstrap/)
-   [FoBo-Font-Awesome](https://github.com/karma4u101/FoBo/tree/master/Font-Awesome) [v2.0.0, v3.0.0, v3.2.1, v4.0.1] - [Font Awesome](http://fortawesome.github.com/Font-Awesome/) 
-   [FoBo-JQuery](https://github.com/karma4u101/FoBo/tree/master/JQuery)  [v1.7.2, v1.8,2, v1.9.1, v1.10.2, v1.11.0, v1.11.1, v2.1.1] - [JQuery](http://jquery.com/)
-   FoBo-JQuery also includes JQuery Migrate [v1.2.1] - [JQuery-Migrate](https://github.com/jquery/jquery-migrate/)
-   [FoBo-Google-Code-Prettify](https://github.com/karma4u101/FoBo/tree/master/Google-Code-Prettify) [vJun2011] - [google-code-prettify](http://code.google.com/p/google-code-prettify/)
-   [FoBo-Pace](https://github.com/karma4u101/FoBo/tree/master/Pace) [v0.4.15] - [Pace](http://github.hubspot.com/pace/docs/welcome/) 
-   [FoBo-Kinetic](https://github.com/karma4u101/FoBo/tree/master/Kinetic) [v5.1.0] - [Kinetic](http://kineticjs.com/) 

Modules available but that will be split out of the FoBo meta module starting from FoBo v1.4. 
The modules can still be used as stand alone modules, see respective modules readme for information on how to set them up. 

-   [FoBo-JQuery-Mobile](https://github.com/karma4u101/FoBo/tree/master/JQuery-Mobile) [v1.0.1, v1.1.0] - [JQuery Mobile](http://jquerymobile.com/)
-   [FoBo-DataTables](https://github.com/karma4u101/FoBo/tree/master/DataTables) [v1.9.0] - [DataTables.net](http://datatables.net/)
-   [FoBo-Knockout](https://github.com/karma4u101/FoBo/tree/master/Knockout) [v2.0.0, v2.1.0, v2.2.1] - [KnockoutJS](http://knockoutjs.com/)
-   [FoBo-Foundation](https://github.com/karma4u101/FoBo/tree/master/Foundation) [v2.1.5] - [ZURB/Foundation](http://foundation.zurb.com/)


###Old submodules
Modules available as maven artifacts but that have been split out of the FoBo meta module. 
The modules can still be used as stand alone modules. 
-   Sonatype [FoBo-JQuery-Mobile](https://oss.sonatype.org/#nexus-search;quick~fobo-jquery-mobile) [v1.0.1, v1.1.0] - [JQuery Mobile](http://jquerymobile.com/)
    Usage FoBoJQM.InitParam.ToolKit=FoBoJQM.JQueryMobile110
-   Sonatype [FoBo-DataTables](https://oss.sonatype.org/#nexus-search;quick~fobo-datatables) [v1.9.0] - [DataTables.net](http://datatables.net/)
    Usage FoBoDT.InitParam.ToolKit=FoBoDT.DataTables190
-   Sonatype [FoBo-Knockout](https://oss.sonatype.org/#nexus-search;quick~fobo-knockout) [v2.0.0, v2.1.0, v2.2.1] - [KnockoutJS](http://knockoutjs.com/)
    Usage FoBoKO.InitParam.ToolKit=FoBoKO.Knockout221
-   Sonatype [FoBo-Foundation](https://oss.sonatype.org/#nexus-search;quick~fobo-foundation) [v2.1.5] - [ZURB/Foundation](http://foundation.zurb.com/)
    Usage FoBoFo.InitParam.ToolKit=FoBoFo.Foundation215
 
For feature listings on older releases see 
- [New features in FoBo v1.3](https://github.com/karma4u101/FoBo/blob/master/README.md#New-features-in-FoBo-v1.3) section
- [New features in FoBo v1.2](https://github.com/karma4u101/FoBo/blob/master/README.md#New-features-in-FoBo-v1.2) section
- [New features in FoBo v1.1](https://github.com/karma4u101/FoBo/blob/master/README.md#New-features-in-FoBo-v1.1) section


Authors
-------
This FoBo Lift module were written by [Peter Petersson](http://www.media4u101.se). The Lift Module conventions were 
developed by the [Lift community](http://groups.google.com/group/liftweb/).

After many years of Java EE development I started look at Scala/Lift in May 2011. If you find some none "best practice" stuff in there 
and if you find something you think could be done in a more Scala/Lift fashion please let me know. Improvements, contributions and suggestions are welcome!



