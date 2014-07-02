FoBo - A Comprehensive Front-End Toolkit Module for Lift [![Build Status](https://secure.travis-ci.org/karma4u101/FoBo.png)](http://travis-ci.org/karma4u101/FoBo)
==================================================

FoBo is a [Lift module](http://liftweb.net/lift_modules) that includes industry leading open source front end toolkits for developing mobile scalable responsive web applications that will jazz up your Lift applications with the toolkit(s) of your choice.   

A **live demo** and introduction to using this module including API documentation can be [seen here](http://www.media4u101.se/fobo-lift-template-demo/). 

With this Lift module you will get a hassle free inclusion and smooth upgrades, you decide what toolkits and versions to enable.  
The FoBo module is making development, maintenance, upgrade and fall-back quick and easy (typically a one liner change in lift boot), by simultaneously supporting several versions of the included toolkits and, without code or reference changes, providing debug-able js and css files in development and minimized files otherwise. 

The FoBo module also has a evolving API that includes snippet:s and helper object:s (see API documents for usage) that will take care of some common toolkit and component initiation and usage, like lift sitemap to bootstrap menu builders, resource injection, script generation and more.  

Using this module you will also get a clean separation of the toolkit files and your application specific resources as the module dose not clutter your applications web-app resources directory. 

A Lift v2.6 starter template with FoBo setup using Bootstrap v3.x and FoBo's BootstrapMegaMetaProtoUser (for mapper ProtoUser views) is available from here [Lift v2.6 Template Applications](https://github.com/lift/lift_26_sbt/)

If you have ideas and suggestions let us know!

Contributions
-------------
Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion to the [Lift's mailing list](http://groups.google.com/group/liftweb/) 

> As FoBo is using this [Git branching model](http://nvie.com/posts/a-successful-git-branching-model/) the **main branch** is just updated for releases so make your pull requests against the [Development branch](https://github.com/karma4u101/FoBo/blob/develop)

Update log
----------

For update history see the [History log](https://github.com/karma4u101/FoBo/blob/master/README.md#history-log) section

**Latest Updates:**
- **2014-07-02** -- Module v1.3-SNAPSHOT Adding bootstrap v3.2.0 
- **2014-07-02** -- Module v1.3-SNAPSHOT Cleaning out usage of bind and BindHelper functions, replacing it with css selectors.
- **2014-06-22** -- Module v1.3-SNAPSHOT Added JQuery-Migrate v1.2.1 
- **2014-06-09** -- Module v1.3-SNAPSHOT Added KineticJS v5.1.0
- **2014-06-08** -- Module v1.3-SNAPSHOT Scala 2.11 artifact released for Lift v2.6
- **2014-05-24** -- Module v1.3-M1 artifact released for Lift 3.0-M1
- **2014-05-24** -- Module v1.3-SNAPSHOT Adding JQuery v1.11.1 and v2.1.1
- **2014-05-17** -- Module v1.3-SNAPSHOT Adding resource injection snippets to FoBo, Angular, Bootstrap 3.x and Bootstrap 2.x 
- **2014-05-15** -- Module v1.3-SNAPSHOT Adding Font Awesome 4.1.0 to v1.3-SNAPSHOT 
- **2014-04-18** -- Module v1.3-SNAPSHOT Bumping sbt to v0.13.1. Removing dependency on yui-compression and upgraded to use sbt-0.13 

**Latest Snapshot Release:**
- **2014-07-02** -- Module v1.3-SNAPSHOT's released for Lift v2.6 (Scala 2.11.x, 2.10.x, 2.9.2, 2.9.1-1, 2.9.1) and Lift v3.0
- **2014-06-08** -- Module v1.3 Scala 2.11 artifact released for Lift v2.6
- **2014-05-24** -- Module v1.3-M1 artifact released for Lift 3.0-M1
- **2014-05-15** -- Module v1.3-SNAPSHOT
- **2014-04-18** -- Module v1.3-SNAPSHOT

**Latest Stable Releases:**
- **2014-03-15** -- Module v1.2
- **2013-10-11** -- Module v1.1


New upcoming features in FoBo v1.3
---------------------------

###FoBo v1.3 has the following new sub modules
-   [KineticJS](https://github.com/karma4u101/FoBo/tree/master/KineticJS) v5.1.0 - See [KineticJS](http://kineticjs.com/) 
    KineticJS is an HTML5 Canvas JavaScript framework that enables high performance animations, transitions, node nesting, layering, filtering, caching, event handling for desktop and mobile applications, and much more. 

###FoBo v1.3 has updates to the following sub modules
-   [FoBo-JQuery](https://github.com/karma4u101/FoBo/tree/master/JQuery) Adds v1.11.1 - [JQuery](http://jquery.com/)
-   [FoBo-JQuery](https://github.com/karma4u101/FoBo/tree/master/JQuery) also adds JQuery-Migrate v1.2.1 [JQuery-Migrate](https://github.com/jquery/jquery-migrate/) 
    JQuery-Migrate is useful for migrating older jQuery code to jQuery 1.9+ it can be used for detecting and restoring APIs or features that have been deprecated in jQuery
-   [FoBo-Font-Awesome](https://github.com/karma4u101/FoBo/tree/master/Font-Awesome) Adds v4.1.0 - [Font Awesome](http://fortawesome.github.com/Font-Awesome/)

###FoBo v1.3 FoBo API updates
-   Added resource injection snippets to FoBo, AngularJS, Bootstrap 3.x and Bootstrap 2.x 


New features in FoBo v1.2
---------------------------

###FoBo v1.2 has the following new sub modules
-   [FoBo-Pace](https://github.com/karma4u101/FoBo/tree/master/Pace) [v0.4.15] - See [Pace](http://github.hubspot.com/pace/docs/welcome/) 
    Automatic page load progress bar, you get a beautiful progress indicator for your page load and ajax navigation.    

###FoBo v1.2 has updates to the following sub modules
-   [FoBo-AngularJS core modules](https://github.com/karma4u101/FoBo/tree/master/AngularJS) Adds [v.1.2.11] - [AngularJS](http://angularjs.org/).
    FoBo v1.2 adds AngularJS core v1.2.11 to it's Angular module.
-   [FoBo-AngularUI Bootstrap](https://github.com/karma4u101/FoBo/tree/master/AngularJS) Adds [v0.10.0, v0.7.0] - [AngularUI](http://angular-ui.github.io/).
    FoBo v1.2 adds AngularUI Bootstrap v0.7.0 and v0.10.0 to it's Angular module. v0.10.0 is Bootstrap version 3.x compatible. 
-   [FoBo-AngularUI NG-Grid](https://github.com/karma4u101/FoBo/tree/master/AngularJS) Adds [v2.0.7] - [AngularUI](http://angular-ui.github.io/).
    FoBo v1.2 adds AngularUI NG-Grid v2.0.7 to it's Angular module.
-   [FoBo-JQuery](https://github.com/karma4u101/FoBo/tree/master/JQuery) Adds [v1.11.0] 
-   [FoBo-TwBs-Bootstrap3](https://github.com/karma4u101/FoBo/tree/master/TwBs-Bootstrap3) Adds [v3.1.1] - [Bootstrap 3.x](http://getbootstrap.com/)
-   [FoBo-Font-Awesome](https://github.com/karma4u101/FoBo/tree/master/Font-Awesome) Adds [v4.0.3] - [Font Awesome](http://fortawesome.github.com/Font-Awesome/)

###FoBo v1.2 FoBo API and other updates
-   FoBo v1.2 API has updates related to the Bootstrap included v2.x and v3.x series modules.
    -    Extending FoBo LocInfo functionality with link target attributes.
    -    Adding a new flexible bootstrap nav li list snippet. 
-   [FoBo-Demo](https://github.com/karma4u101/FoBo-Demo) Most of the FoBo related demos have been moved into the top level project FoBo-Demo. 
-   Deprecations -- FoBo v1.2 adds some sub module deprecations that can be categorized in two different sets
    -    A "normal" deprecation that have one or more alternative sub module that could be uses in place of the deprecated module version without introducing any errors or bugs.
    -    A (couple of) deprecations that is meant to signal that this sub modules is not actively used and there has not been any (pull) requests for/with updates by users of FoBo. If you are a user of such a module you can keep using it as a separate module (FoBoXX.init) or if you feel strongly that deprecation is wrong you can ping me and maybe help out with updates.

For feature listings on older releases see 
- [New features in FoBo v1.1](https://github.com/karma4u101/FoBo/blob/master/README.md#New-features-in-FoBo-v1.1) section


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
 


Module names that can bee used in boot corresponding to the toolkit version above is

- BootstrapXYZ 
- FontAwesomeXYZ 
- FoundationXYZ
- DataTablesXYZ
- JQueryMobileXYZ 
- JQueryXYZ
- JQueryMigrateXYZ
- PrettifyXYZ
- KnockoutXYZ
- PaceXYZ
- KineticJSXYZ
- AngularJSXYZ with components (AJSUIBootstrapXYZ, AJSNGGridXYZ)

Where X is major, Y minor and Z incremental version numbers as seen in the Toolkits list above (for example BootstrapXYZ will be Bootstrap230 for Twitter Bootstrap v2.3.0)
For more information on how to set this up see below. 
    
Quick Start with Lift Template Applications
-------------------------------------------

The only prerequisites for using this Lift module is that you have Git and Java installed and configured on the target computer but a suitable Lift template project will also come in handy.
A Scala v2.10 Lift v2.6 starter template with FoBo setup using Bootstrap v3.x and FoBo's BootstrapMegaMetaProtoUser (for mapper ProtoUser views) is available from here [Lift v2.6 Template Applications](https://github.com/lift/lift_26_sbt/) and another one using Twitter Bootstrap v2.x is available here [Templating With Twitter Bootstrap](https://github.com/karma4u101/Templating-With-Twitter-Bootstrap) 

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

    "net.liftmodules" %% "fobo_2.5 % "0.1.0-SNAPSHOT"
      :
    <dependency>
      <groupId>net.liftmodules</groupId>
      <artifactId>fobo_2.5_2.9.2</artifactId>
      <version>1.0</version>
    </dependency>

The example will include a module built for lift 2.5. If you are using maven observe that the artifact id also needs the Scala version.

For older versions <= 0.9.2 put the following in your project build.sbt files lift libraryDependencies section 

    "net.liftmodules" %% "fobo" % (liftVersion+"-[module version]") 
	
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
    <link rel="stylesheet" type='text/css' href='[path/to/you/app/specific/css/file/in/the/webapp/dir]'>
    <script type="text/javascript" src="/classpath/fobo/[script file name]"></script>

For more information see readme in respective sub module.

Available CSS and JavaScript files 
----------------------------------

See the "Lift FoBo Template hooks" section in readme file for respective FoBo module listed above.

Scala IDE for Eclipse
---------------------
Sbteclipse provides SBT command to create Eclipse project files

1) Usage

	project$ ./sbt
	> eclipse 

2) In eclipse do: 

	File ==> Import...
	Select General ==> Existing Project into Workspace 
	Use "Brows" to look up the project root ....


New features in FoBo v1.1
---------------------------

###FoBo v1.1 has the following new sub modules

-   [FoBo-TwBs-Bootstrap3](https://github.com/karma4u101/FoBo/tree/master/TwBs-Bootstrap3) [v3.0.0, v3.0.1] - [Bootstrap 3.x](http://getbootstrap.com/)
    The Bootstrap v3.x series is a major leap forward. Bootstrap is now Mobile first and always responsive with improved customization adding the notion of theme's.
    The v3.x series is NOT compatible with the v2.x series of Bootstrap hence the use of a new sub module including new Lift snippets. 
  
    One of the new Bootstrap v3 snippets is the BootstrapMegaMetaProtoUser snippet for used with (mapper) ProtoUser form views to give them a reactive mobile 
    scalable Bootstrap v3.x style.  

    As Nav-lists have been dropped in Bootstrap v3.x and the nearest equivalent is list groups the "side" menu snippet TBNavList used in Bootstrap v2.x has been 
    replaces in Bootstrap v3.x by a new snippet Bs3LinkedListGroup. Those snippets is not equivalent but can be used for the same purpose of mapping Lift's 
    menu location groups into Bootstrap list's.   

    The Bs3Navbar is the Bootstrap v3.x equivalent of the Boostrap v2.x TBNavbar used for horizontal top and/or bottom navigation bars. 

A live demo showing some of FoBo's Bootstrap v3.x snippet functions is referred to on the more general [FoBo Bootstrap demo](http://www.media4u101.se/fobo-lift-template-demo/libo) page.   

###FoBo v1.1 has updates to the following sub modules

-   [FoBo-Twitter-Bootstrap](https://github.com/karma4u101/FoBo/tree/master/Twitter-Bootstrap) adding v2.3.2 - [Twitter Bootstrap](http://twitter.github.com/bootstrap/)
    v2.3.2 is the last version in the Bootstrap v2.x series
 
-   [FoBo-Font-Awesome](https://github.com/karma4u101/FoBo/tree/master/Font-Awesome) adding v3.2.1, v4.0.1 - [Font Awesome](http://fortawesome.github.com/Font-Awesome/) 
    Here v3.2.1 is the last version compatible with the Bootstrap v2.x series and v4.0.1 is the first with Bootstrap v3.x support

-   [FoBo-JQuery](https://github.com/karma4u101/FoBo/tree/master/JQuery) adding v1.10.2 - [JQuery](http://jquery.com/)

A live demo showing some of FoBo's sub module features, including API documentation, can seen at the [FoBo demo](http://www.media4u101.se/fobo-lift-template-demo/)


### History log
----------------

**Stable Release history:**
- **2013-05-19** -- Module v1.0 

**Updates history:**
- **2014-03-09** -- Module v1.2-SNAPSHOT Adding Bootstrap v3.1.1 and Font Awesome v4.0.3
- **2014-02-21** -- Module v1.2-SNAPSHOT Adding JQuery v1.11.0 Removing Angular v1.2.1 and v1.2.2 never release in FoBo and superseded by v1.2.11 
- **2014-02-05** -- Module v1.2-SNAPSHOT Adding Angular UI Bootstrap v0.10.0 (for use with bootstrap v3.x css)
- **2014-02-04** -- Module v1.2-SNAPSHOT Added AngularJS v1.2.11 core modules
- **2013-12-16** -- Module v1.2-SNAPSHOT Fixing Bs3NavLiList target usage, fixing Bs3/TB LinkedListGroup
- **2013-12-13** -- Module v1.2-SNAPSHOT Adding a new flexible bootstrap (2.x,3.x) nav li list snippet.
- **2013-12-13** -- Module v1.2-SNAPSHOT Extending FoBo LocInfo functionality with link target attributes 
- **2013-11-27** -- Module v1.2-SNAPSHOT Adding Angular UI Bootstrap v0.7.0 and Angular NG-Grid v2.0.7
- **2013-11-24** -- Module v1.2-SNAPSHOT Added AngularJS v1.2.2 core modules
- **2013-11-20** -- Module v1.2-SNAPSHOT Added Pace v0.4.15
- **2013-11-18** -- Module v1.2-SNAPSHOT Added AngularJS v1.2.1 core modules (ng, ngRoute, ngAnimate, ngResource, ngCookies, ngTouch, ngSanitize, ngMock) and i18n files.
- **2013-11-03** -- Module v1.1-SNAPSHOT adding Bootstrap v3.0.1 and Font Awesome v4.0.1 suitable for user with Bootstrap v3.x
- **2013-11-02** -- Module v1.1-SNAPSHOT renaming of Bootstrap v3.x Snippets. Bootstrap v3 snippet names now start with "Bs3*"
- **2013-11-01** -- Module v1.1-SNAPSHOT renaming of Bootstrap v3.x Snippets. TB3 snippet names now start with "TB3*"
- **2013-10-30** -- Module v1.1-SNAPSHOT release for lift v2.6/v3.0 Scala 2.10, lift v2.5 Scala 2.10, 2.9.2, 2.9.1-1, 2.9.1 (Java 1.6)
- **2013-10-26** -- Module v1.1-SNAPSHOT Added BootstrapMegaMetaProtoUser for mapper with Bootstrap3 styled views. 
- **2013-08-25** -- Module v1.1-SNAPSHOT Added Bootstrap v3.0.0 (new sub project). Imp TBLinkedListGroup (new), TBNavbar (TBNavlist is not yet imp.)
- **2013-08-09** -- Module v1.1-SNAPSHOT Added Bootstrap v3.0.0-RC1. Open up the TBNav* imp. for user extensions. 
- **2013-07-29** -- Module v1.1-SNAPSHOT Added bootstrap v2.3.2 and Font Awesome v3.2.1. 
- **2013-05-13** -- Module v1.0-SNAPSHOT artifacts release for Lift v2.6/v3.0 
- **2013-05-09** -- Module v1.0-SNAPSHOT Removing one of the newly added Angular component (Angular UI v0.4.0) as it has been broken up into sub modules by upstream.
- **2013-05-03** -- Module v1.0-SNAPSHOT Adding unified api documentation and improved the build system.
- **2013-05-01** -- Module v0.9.9-SNAPSHOT One version to rule them all, unified FoBo module and sub-module versions.
- **2013-04-28** -- Module v0.9.8-SNAPSHOT Updated FoBo-JQuery with support for jquery v1.9.1
- **2013-04-13** -- Module v0.9.7-SNAPSHOT Added AngularJS components as a FoBo module.
- **2013-03-29** -- Module v0.9.6-SNAPSHOT FoBo-JQuery dependency update. 
- **2013-03-29** -- Module v0.9.5-SNAPSHOT Google-Code-Prettify and JQuery is moved to sub FoBo modules
- **2013-03-27** -- Module v0.9.4-SNAPSHOT New version schema see [Dependency settings](https://github.com/karma4u101/FoBo/blob/master/README.md#dependency-settings) foundation is moved to sub module. 
- **2013-02-27** -- Module v0.9.3-SNAPSHOT Adding knockout.js v2.2.1 and moving knockout to sub module/proj fobo-knockout. 
- **2013-02-24** -- Module v0.9.2-SNAPSHOT Completed fobo-twitter-bootstrap and fobo-datatables module transaction.
- **2013-02-22** -- Module v0.9.1-SNAPSHOT Using fobo-twitter-bootstrap v0.1.1 that fixes serving of minified bootstrap.js when not in development.
- **2013-01-17** -- Module v0.9.0-SNAPSHOT Added support for Bootstrap v2.3.0 
- **2013-01-17** -- Module v0.9.0-SNAPSHOT Added support for Bootstrap v2.3.0 
- **2013-01-13** -- Module v0.8.0-SNAPSHOT Added support for Font-Awesome v3.0.0 in FoBo-Font-Awesome v0.1.0 included in this build. 
- **2013-01-10** -- Module v0.7.11-SNAPSHOT Now internally using the FoBo-Twitter-Bootstrap module (v0.0.1) and added Scala version 2.10 build. 
- **2013-01-04** -- Module v0.7.10-SNAPSHOT Decoupling the FoBo-Font-Awesome module future (v0.0.3)
- **2013-01-92** -- Module v0.7.9-SNAPSHOT Updated dep. on FoBo-Font-Awesome to v0.0.2.
- **2012-12-30** -- Module v0.7.8-SNAPSHOT Adding "Font Awesome" Bootstrap extras and a bootstrap-no-icons.css to TB v2.2.2.
- **2012-12-29** -- Module v0.7.7-SNAPSHOT Added support for JQuery v1.8.2
- **2012-12-26** -- Module v0.7.6-SNAPSHOT Extended the FoBo API with a new Bootstrap menu builder that transforms Lift SiteMap's LocGroup(s) to bootstrap navlist's.
- **2012-12-15** -- Module v0.7.5-SNAPSHOT Added Bootstrap v2.2.2
- **2012-12-13** -- Module v0.7.4-SNAPSHOT Extended the FoBo API with a new Bootstrap menu builder that transforms Lift SiteMap's LocGroup(s) to bootstrap navbar's. 
- **2012-11-18** -- Module v0.7.3-SNAPSHOT Added Bootstrap v2.2.0 and released artifacts
- **2012-11-11** -- Module v0.7.2-SNAPSHOT Lift 2.5-SNAPSHOT artifacts (for the inpatient) published to oss.sonatype.org
- **2012-11-10** -- Module v0.7.2-SNAPSHOT Lift 2.5-M3 released to oss.sonatype.org

**Snapshot Release history:**
- **2014-03-09** -- Module v1.2-SNAPSHOT for Lift 2.5, 2.6 and 3.0
- **2014-02-21** -- Module v1.2-SNAPSHOT for Lift 2.5, 2.6 and 3.0
- **2014-02-06** -- Module v1.2-SNAPSHOT for Lift 2.5, 2.6 and 3.0
- **2013-12-16** -- Module v1.2-SNAPSHOT for Lift 2.5, 2.6 and 3.0
- **2013-12-13** -- Module v1.2-SNAPSHOT for Lift 2.5, 2.6 and 3.0
- **2013-11-28** -- Module v1.2-SNAPSHOT for Lift 2.5, 2.6 and 3.0
- **2013-11-24** -- Module v1.2-SNAPSHOT for Lift 2.5, 2.6 and 3.0
- **2013-11-23** -- Module v1.2-SNAPSHOT for Lift 2.5, 2.6 and 3.0
- **2013-11-18** -- Module v1.2-SNAPSHOT for Lift 2.5, 2.6 and 3.0
- **2013-11-06** -- Module v1.1-SNAPSHOT for lift 2.5, 2.6 and 3.0
- **2013-11-02** -- Module v1.1-SNAPSHOT for lift 2.5, 2.6 and 3.0
- **2013-11-01** -- Module v1.1-SNAPSHOT for lift 2.5, 2.6 and 3.0
- **2013-10-30** -- Module v1.1-SNAPSHOT artifacts release for Lift v2.5/v2.6/v3.0 Java 1.6
- **2013-08-29** -- Module v1.1-SNAPSHOT artifacts release for Lift v2.5/v2.6/v3.0
- **2013-08-09** -- Module v1.1-SNAPSHOT artifacts release for Lift v2.5/v2.6/v3.0
- **2013-07-29** -- Module v1.1-SNAPSHOT artifacts release for Lift v2.5/v2.6/v3.0
- **2013-05-13** -- Module v1.0-SNAPSHOT artifacts release for Lift v2.6/v3.0 
- **2013-05-03** -- Module v1.0-SNAPSHOT artifacts for Lift 2.5 and 3.0
- **2013-05-01** -- Module v0.9.9-SNAPSHOT artifacts for Lift 2.5 and 3.0
- **2013-04-28** -- Module v0.9.8-SNAPSHOT artifacts for Lift 2.5 and 3.0
- **2013-04-13** -- Module v0.9.7-SNAPSHOT artifacts for Lift 2.5 and 3.0 is published.
- **2013-04-06** -- Module v0.9.6-SNAPSHOT artifacts for Lift 2.5
- **2013-03-29** -- Module v0.9.5-SNAPSHOT artifacts for Lift 2.5 and 3.0 is published.
- **2013-03-27** -- Module v0.9.4-SNAPSHOT artifacts for Lift 2.5 and 3.0 see [Dependency settings](https://github.com/karma4u101/FoBo/blob/master/README.md#dependency-settings) for more information.
- **2013-03-08** -- Module v0.9.3-SNAPSHOT artifacts for Lift 2.5-RC2 and Lift 3.0-SNAPSHOT
- **2013-02-24** -- Module v0.9.2-SNAPSHOT artifacts for Lift 2.5-RC1 and 2.5-SNAPSHOT (Scala 2.10, 2.9.2, 2.9.1-1, 2.9.1) and Lift 3.0 -SNAPSHOT (Scala 2.10)
- **2013-02-22** -- Module v0.9.1-SNAPSHOT artifacts for Lift 2.5-RC1 (Scala 2.10, 2.9.2, 2.9.1-1, 2.9.1) and Lift 3.0-SNAPSHOT (Scala 2.10)
- **2013-02-17** -- Module v0.9.0-SNAPSHOT artifacts for Lift 3.0-SNAPSHOT / Scala 2.10, Lift 2.5-SNAPSHOT 
- **2013-02-15** -- Module v0.8.0-SNAPSHOT artifacts for Lift 3.0-SNAPSHOT / Scala 2.10
- **2013-01-13** -- Module v0.8.0-SNAPSHOT artifacts for Lift 2.5-M4 and Lift 2.5-SNAPSHOT (Scala 2.10, 2.9.1, 2.9.1-1, 2.9.2) 
- **2013-01-10** -- Module v0.7.11-SNAPSHOT artifacts for Lift 2.5-SNAPSHOTS (Scala 2.10, 2.9.1, 2.9.1-1, 2.9.2) 
- **2013-01-04** -- Module v0.7.10-SNAPSHOT artifacts for Lift-2.5-M3 and Lift 2.5-SNAPSHOTS (Scala 2.9.1, 2.9.1-1, 2.9.2)
- **2013-01-02** -- Module v0.7.8-SNAPSHOT artifacts for Lift-2.5-M3 and Lift 2.5-SNAPSHOTS (Scala 2.9.1, 2.9.1-1, 2.9.2)
- **2012-12-30** -- Module v0.7.8-SNAPSHOT artifacts for Lift-2.5-M3 and Lift 2.5-SNAPSHOTS (Scala 2.9.1, 2.9.1-1, 2.9.2)
- **2012-12-29** -- Module v0.7.7-SNAPSHOT artifacts for Lift-2.5-M3 and Lift 2.5-SNAPSHOTS (Scala 2.9.1, 2.9.1-1, 2.9.2)

  
Authors
-------
This FoBo Lift module were written by [Peter Petersson](http://www.media4u101.se). The Lift Module conventions were 
developed by the [Lift community](http://groups.google.com/group/liftweb/).

After many years of Java EE development I started look at Scala/Lift in May 2011. If you find some none "best practice" stuff in there 
and if you find something you think could be done in a more Scala/Lift fashion please let me know. Improvements, contributions and suggestions are welcome!



