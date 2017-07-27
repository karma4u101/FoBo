# Changelog


For update history see the [History log](https://github.com/karma4u101/FoBo/tree/master/CHANGELOG.md#history-log) 
section

**Latest Stable Releases:**
- **2016-10-04** -- FoBo Module v1.7
- **2016-06-25** -- FoBo Module v1.6
- **2015-12-30** -- FoBo Module v1.5.1

**Latest Updates:**
- **2017-07-25** -- [PR #145](https://github.com/karma4u101/FoBo/pull/145) FoBo v2.0 -- Adding Angular material v1.1.4
- **2017-07-23** -- [PR #143](https://github.com/karma4u101/FoBo/pull/143) FoBo v2.0 -- Removing Kinetic
- **2017-07-19** -- [PR #141](https://github.com/karma4u101/FoBo/pull/141) FoBo v2.0 -- Naming convention fix
- **2017-07-17** -- [PR #132](https://github.com/karma4u101/FoBo/pull/132) FoBo v2.0 -- Adding popper and tooltip 
  modules from Popper.js
- **2017-02-19** -- [PR #129](https://github.com/karma4u101/FoBo/pull/129) FoBo v2.0 -- Adding the Tether toolkit 
  library to FoBo
- **2017-01-07** -- [PR #124](https://github.com/karma4u101/FoBo/pull/124) FoBo v2.0 -- Adding UI Bootstrap v2.4.0
- **2016-10-08** -- [Issue #116](https://github.com/karma4u101/FoBo/issues/116) FoBo v2.0 -- Remove FoBoToolkit and 
  FoBoJQuery deprecations 

See [Development branch](https://github.com/karma4u101/FoBo/tree/develop/CHANGELOG.md)


## FoBo v2.0

### Braking changes
- **Naming convention correction** -- As this is a major number release there was a opportunity to correct the package 
  object naming and init function naming mistakes present in previous releases of FoBo. This means that the module 
  initiation has changed from:
   ```scala
   FoBo.Toolkit.Init = FoBo.Toolkit.ToolkitXXX
   ```
   to
   ```scala
   fobo.Toolkit.init = fobo.Toolkit.ToolkitXXX
   ```   
   For more information about Scala's naming conventions see the 
   [Scala naming conventions -- Style guide](http://docs.scala-lang.org/style/naming-conventions.html)
- **Removing Kinetic** -- The motivation of removing this module is:
  - This has been a very unfrequented used FoBo module and as FoBo does not have anny API hooks 
    for this module it will be farly easy to replace the usage of this FoBo module with its javascript resources.
  - The author of kineticjs has moved on to other ventures, kineticjs is stable but has not seen any updates in 3+ 
    years. The author recommends using the more lightweight http://www.concretejs.com/ library. 

### Deprecations 
In order to cleanup and improve the API the old style FoBoTolkit and FoBoJQuery initiation functions have been removed after 
some time of deprecation. v1.7 is the last version having FoBoTolkit and FoBoJQuery so if you have not already switched to
use the Toolkit, Resource and API objects in favour for the old init style, v1.7 is a good pit stop on the way to v2.0 as it
(and v1.6) provides a easy migration path. 

  
### New modules
-   [Popper](https://github.com/karma4u101/FoBo/tree/master/Popper) [1.10.8] - [Popper](https://popper.js.org/)
-   [Tether](https://github.com/karma4u101/FoBo/tree/master/Tether) [v1.4.0] - [Tether](http://tether.io/)

### Updated modules
- [FoBo-AngularJS Material Design](https://github.com/karma4u101/FoBo/tree/master/AngularJS) Adds v1.1.4 - [Angular Material](https://material.angularjs.org/)
- [FoBo-AngularJS UI Bootstrap](https://github.com/karma4u101/FoBo/tree/master/AngularJS) Adds v2.4.0 - [UI Bootstrap](https://angular-ui.github.io/bootstrap/)


## FoBo v1.7

### Build system update
As SBT 1.0 won't support Build.scala usage see [sbt/sbt#2524](https://github.com/sbt/sbt/pull/2524) 
the *'object XXXX extend Build {...}'* usage has been greatly reduced and is now using the build.sbt 
multi-project build style the only thing left dependant on Build is two lift module specific settings keys. 
The build system is now much cleaner and easier to work with. 

- [Multi-project build](http://www.scala-sbt.org/0.13/docs/Multi-Project.html) now using build.sbt style
- [unidoc](https://github.com/sbt/sbt-unidoc) is now a proper sbt plugin
- [scalafmt](https://olafurpg.github.io/scalafmt/) FoBo is now using the Scalafmt code formatter sbt plugin  

### Updated modules
- [FoBo-AngularJS Material Design](https://github.com/karma4u101/FoBo/tree/master/AngularJS) Adds v1.1.1 - [Angular Material](https://material.angularjs.org/)
- [FoBo-TwBs-Bootstrap3](https://github.com/karma4u101/FoBo/tree/master/TwBs-Bootstrap3) Adds v3.3.7 - [Bootstrap 3.x](http://getbootstrap.com/)
- [FoBo-JQuery](https://github.com/karma4u101/FoBo/tree/master/JQuery) Adds v2.2.4, v3.0.0, v3.1.0 - [JQuery](http://jquery.com/)
- [FoBo-JQuery-Migrate](https://github.com/karma4u101/FoBo/tree/master/JQuery) Adds v1.4.1, v3.0.0 - [JQuery-Migrate](https://github.com/jquery/jquery-migrate/)



## FoBo v1.6

### New Features
Splitting FoBo modules into **Toolkit modules** composed of a **Resource module** and a **API module**. 
Making it possible to, in your project depend on artifacts including everything from a single FoBo 
provided resource module one or more API or resource module(s) or as before one or more Toolkit 
modules or via the FoBo/FoBo module get access to all of FoBo's Toolkit, Resource and API modules.   

The *FoBoToolkit* and *FoBoJQuery* trait's has been **deprecated** in favour for using the new *Toolkit*, 
*API* and *Resource* trait's and case objects.  

To aide in Lift 3 enhanced support for a strong [CSP](https://developer.mozilla.org/en-US/docs/Web/Security/CSP) (Content Security Policy) 
FoBo future utilize Lifts page script file's, to avoid inlining of javascript, by providing new or alternative API functions for script injection.  

### New modules
-   [FoBo-HighlightJS](https://github.com/karma4u101/FoBo/tree/master/Highlight) Adds v9.3.0 - [highlight.js](https://highlightjs.org/) 
    Syntax highlighting for the Web - Packaged with 21 languages (inc Scala) and 70+ styles.
    
### Updated modules
-   [FoBo-Pace](https://github.com/karma4u101/FoBo/tree/master/Pace) Adds v1.0.2 - [Pace](http://github.hubspot.com/pace/docs/welcome/)
-   [FoBo-Font-Awesome](https://github.com/karma4u101/FoBo/tree/master/Font-Awesome) Adds v4.6.3 - [Font Awesome](http://fortawesome.github.com/Font-Awesome/)
-   [FoBo-AngularJS core modules](https://github.com/karma4u101/FoBo/tree/master/AngularJS) Adds v1.5.3 - [AngularJS](http://angularjs.org/)
-   [FoBo-AngularJS Material Design](https://github.com/karma4u101/FoBo/tree/master/AngularJS) Adds v1.0.8 - [Angular Material](https://material.angularjs.org/)

## FoBo v1.5.1

### Bug Fixes
- Missing context in path for recover password link in login form (closes [#60](https://github.com/karma4u101/FoBo/issues/60))

## FoBo v1.5

### FoBo v1.5 has the following new sub modules
-   [FoBo-AngularJS UI Grid](https://github.com/karma4u101/FoBo/tree/master/AngularJS) Adds v3.0.7 - [Angular UI Grid](http://ui-grid.info/)
    A data grid for AngularJS. Native AngularJS implementation, no jQuery. This is the successor of NG Grid (also available via FoBo) 

### FoBo v1.5 has updates to the following sub modules
-   [FoBo-AngularJS Material Design](https://github.com/karma4u101/FoBo/tree/master/AngularJS) Adds v1.0.1 - [Angular Material](https://material.angularjs.org/)

-   [FoBo-TwBs-Bootstrap3](https://github.com/karma4u101/FoBo/tree/master/TwBs-Bootstrap3) Adds v3.3.6 - [Bootstrap 3.x](http://getbootstrap.com/)
-   [FoBo-AngularJS core modules](https://github.com/karma4u101/FoBo/tree/master/AngularJS) Adds v1.4.8 - [AngularJS](http://angularjs.org/)
 
For a list of already available toolkit versions see respective sub modules README.
You can see a running demo of a Lift Template application using Material Design [here](http://www.media4u101.se/lift-advanced-md/)

### FoBo v1.5 API updates
-   FoBo v1.5 adds API integration with the **MaterialMegaMetaProtoUser** trait that adds Material Design styling to the ProtoUser form views. 
-   FoBo v1.5 adds a integration of angular material design tosts component with lift messages.
-   For Lift 3.0 users FoBo has added complementary functions for handling script injection (bootstrap poppover,tooltip,...) and to avoid in-lining. 
    To aid in supporting a strong CSP (Content Security Policy) with LiftRules.securityRules settings those complementary functions **avoids in-lining** 
    of javascript by utilizing the Lift page script file's (new feature in Lift 3.0). FoBo API functions that utilize this mechanism has 
    names that ends with AppendJs or AppendGlobalJs. 

## FoBo v1.4

### FoBo v1.4 has the following new sub modules
-   [FoBo-AngularJS Material Design](https://github.com/karma4u101/FoBo/tree/master/AngularJS) Adds v0.10.0 - [Angular Material](https://material.angularjs.org/)
    The Angular Material project is an implementation of Material Design in Angular.js. This project provides a set of reusable, well-tested, and accessible UI components based on the Material Design system.

### FoBo v1.4 has updates to the following sub modules
-   [FoBo-TwBs-Bootstrap3](https://github.com/karma4u101/FoBo/tree/master/TwBs-Bootstrap3) Adds v3.3.5 - [Bootstrap 3.x](http://getbootstrap.com/)
-   [FoBo-AngularJS core modules](https://github.com/karma4u101/FoBo/tree/master/AngularJS) Adds v1.4.1 - [AngularJS](http://angularjs.org/)
-   [FoBo-AngularJS core modules](https://github.com/karma4u101/FoBo/tree/master/AngularJS) Adds v1.3.5 - [AngularJS](http://angularjs.org/)
-   [FoBo-Font-Awesome](https://github.com/karma4u101/FoBo/tree/master/Font-Awesome) Adds v4.3.0 - [Font Awesome](http://fortawesome.github.com/Font-Awesome/)
-   [FoBo-JQuery](https://github.com/karma4u101/FoBo/tree/master/JQuery) Adds v.1.11.3, v2.1.4 - [JQuery](http://jquery.com/)


### FoBo v1.4 deprications
-   Deprecations -- Some long time deprecations has been removed from the build.


##FoBo v1.3

### FoBo v1.3 has the following new sub modules
-   [KineticJS](https://github.com/karma4u101/FoBo/tree/master/KineticJS) v5.1.0 - See [KineticJS](http://kineticjs.com/) 
    KineticJS is an HTML5 Canvas JavaScript framework that enables high performance animations, transitions, node nesting, layering, filtering, caching, event handling for desktop and mobile applications, and much more. 

### FoBo v1.3 has updates to the following sub modules
-   [FoBo-AngularJS core modules](https://github.com/karma4u101/FoBo/tree/master/AngularJS) Adds v1.2.19 - [AngularJS](http://angularjs.org/)
-   [FoBo-TwBs-Bootstrap3](https://github.com/karma4u101/FoBo/tree/master/TwBs-Bootstrap3) Adds v3.2.0 - [Bootstrap 3.x](http://getbootstrap.com/)
-   [FoBo-Font-Awesome](https://github.com/karma4u101/FoBo/tree/master/Font-Awesome) Adds v4.1.0 - [Font Awesome](http://fortawesome.github.com/Font-Awesome/)
-   [FoBo-JQuery](https://github.com/karma4u101/FoBo/tree/master/JQuery) Adds v1.11.1 - [JQuery](http://jquery.com/)
-   [FoBo-JQuery](https://github.com/karma4u101/FoBo/tree/master/JQuery) also adds JQuery-Migrate v1.2.1 [JQuery-Migrate](https://github.com/jquery/jquery-migrate/) 
    JQuery-Migrate is useful for migrating older jQuery code to jQuery 1.9+ it can be used for detecting and restoring APIs or features that have been deprecated in jQuery

### FoBo v1.3 FoBo API updates
-   Added resource injection snippets to FoBo, AngularJS, Bootstrap 3.x and Bootstrap 2.x see [FoBo API documentation](http://www.media4u101.se/fobo-lift-template-demo/foboapi/index.html#net.liftmodules.FoBo.package) for more information.


## FoBo v1.2

### FoBo v1.2 has the following new sub modules
-   [FoBo-Pace](https://github.com/karma4u101/FoBo/tree/master/Pace) [v0.4.15] - See [Pace](http://github.hubspot.com/pace/docs/welcome/) 
    Automatic page load progress bar, you get a beautiful progress indicator for your page load and ajax navigation.    

### FoBo v1.2 has updates to the following sub modules
-   [FoBo-AngularJS core modules](https://github.com/karma4u101/FoBo/tree/master/AngularJS) Adds [v1.2.11] - [AngularJS](http://angularjs.org/)
    FoBo v1.2 adds AngularJS core v1.2.11 to it's Angular module.
-   [FoBo-AngularUI Bootstrap](https://github.com/karma4u101/FoBo/tree/master/AngularJS) Adds [v0.10.0, v0.7.0] - [AngularUI](http://angular-ui.github.io/)
    FoBo v1.2 adds AngularUI Bootstrap v0.7.0 and v0.10.0 to it's Angular module. v0.10.0 is Bootstrap version 3.x compatible. 
-   [FoBo-AngularUI NG-Grid](https://github.com/karma4u101/FoBo/tree/master/AngularJS) Adds [v2.0.7] - [AngularUI](http://angular-ui.github.io/)
    FoBo v1.2 adds AngularUI NG-Grid v2.0.7 to it's Angular module.
-   [FoBo-JQuery](https://github.com/karma4u101/FoBo/tree/master/JQuery) Adds [v1.11.0] 
-   [FoBo-TwBs-Bootstrap3](https://github.com/karma4u101/FoBo/tree/master/TwBs-Bootstrap3) Adds [v3.1.1] - [Bootstrap 3.x](http://getbootstrap.com/)
-   [FoBo-Font-Awesome](https://github.com/karma4u101/FoBo/tree/master/Font-Awesome) Adds [v4.0.3] - [Font Awesome](http://fortawesome.github.com/Font-Awesome/)

### FoBo v1.2 FoBo API and other updates
-   FoBo v1.2 API has updates related to the Bootstrap included v2.x and v3.x series modules.
    -    Extending FoBo LocInfo functionality with link target attributes.
    -    Adding a new flexible bootstrap nav li list snippet. 
-   [FoBo-Demo](https://github.com/karma4u101/FoBo-Demo) Most of the FoBo related demos have been moved into the top level project FoBo-Demo. 
-   Deprecations -- FoBo v1.2 adds some sub module deprecations that can be categorized in two different sets
    -    A "normal" deprecation that have one or more alternative sub module that could be uses in place of the deprecated module version without introducing any errors or bugs.
    -    A (couple of) deprecations that is meant to signal that this sub modules is not actively used and there has not been any (pull) requests for/with updates by users of FoBo. If you are a user of such a module you can keep using it as a separate module (FoBoXX.init) or if you feel strongly that deprecation is wrong you can ping me and maybe help out with updates.


## FoBo v1.1

### FoBo v1.1 has the following new sub modules

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

### FoBo v1.1 has updates to the following sub modules

-   [FoBo-Twitter-Bootstrap](https://github.com/karma4u101/FoBo/tree/master/Twitter-Bootstrap) adding v2.3.2 - [Twitter Bootstrap](http://twitter.github.com/bootstrap/)
    v2.3.2 is the last version in the Bootstrap v2.x series
 
-   [FoBo-Font-Awesome](https://github.com/karma4u101/FoBo/tree/master/Font-Awesome) adding v3.2.1, v4.0.1 - [Font Awesome](http://fortawesome.github.com/Font-Awesome/) 
    Here v3.2.1 is the last version compatible with the Bootstrap v2.x series and v4.0.1 is the first with Bootstrap v3.x support

-   [FoBo-JQuery](https://github.com/karma4u101/FoBo/tree/master/JQuery) adding v1.10.2 - [JQuery](http://jquery.com/)

A live demo showing some of FoBo's sub module features, including API documentation, can seen at the [FoBo demo](http://www.media4u101.se/fobo-lift-template-demo/)


## History log

**Stable Release history:**
- **2015-12-28** -- Module v1.5
- **2015-08-09** -- Module v1.4
- **2014-07-15** -- Module v1.3
- **2014-03-15** -- Module v1.2
- **2013-10-11** -- Module v1.1
- **2013-05-19** -- Module v1.0 

**Updates history:**
- **2016-09-23** -- [Issue #75](https://github.com/karma4u101/FoBo/issues/75) Adding Angular Material Design v1.1.1
- **2016-07-31** -- [Issue #91](https://github.com/karma4u101/FoBo/issues/91) Adding Bootstrap v3.3.7
- **2016-07**    -- [Issue #92](https://github.com/karma4u101/FoBo/issues/92),[#93](https://github.com/karma4u101/FoBo/issues/93),[#94](https://github.com/karma4u101/FoBo/issues/94),[#96](https://github.com/karma4u101/FoBo/issues/96),[#98](https://github.com/karma4u101/FoBo/issues/98),[#99](https://github.com/karma4u101/FoBo/issues/99),[#100](https://github.com/karma4u101/FoBo/issues/100) JQuery additions. 
- **2016-07-09** -- [Issue #71](https://github.com/karma4u101/FoBo/issues/71) Extensive buildsystem update
- **2016-07-09** -- [Issue #37](https://github.com/karma4u101/FoBo/issues/37) Unidoc is now a propper plugin
- **2016-07-09** -- [Issue #85](https://github.com/karma4u101/FoBo/issues/85) Adding the scalafmt code formatter plugin
- **2016-05-14** -- [Issue #80](https://github.com/karma4u101/FoBo/issues/80) Adding Font-Awesome v4.6.3 (removing unreleased v4.5.0)
- **2016-04-30** -- [Issue #78](https://github.com/karma4u101/FoBo/issues/78) Adding Angular Material v1.0.8 (removing unreleased v1.0.7)
- **2016-04-29** -- [Issue #76](https://github.com/karma4u101/FoBo/issues/76) Adding HighlightJS v9.3.0
- **2016-03-30** -- [Issue #70](https://github.com/karma4u101/FoBo/issues/70) Adding Pace v1.0.2
- **2016-03-29** -- [Issue #69](https://github.com/karma4u101/FoBo/issues/69) Adding AngularJS v1.5.3
- **2016-03-25** -- Adding Font-Awesome v4.5.0
- **2016-03-25** -- [PR #61](https://github.com/karma4u101/FoBo/pull/61) Re-factoring modules  
- **2015-12-24** -- Module v1.5-SNAPSHOT Adding Angular Material Design v1.0.1 (removing unreleased v1.0.0)
- **2015-12-20** -- Module v1.5-SNAPSHOT Adding Angular UI Grid v3.0.7
- **2015-12-15** -- Module v1.5-SNAPSHOT Adding Angular Material Design v1.0.0 (removing rc's)
- **2015-12-13** -- Module v1.5-SNAPSHOT Adding Angular Material Design v1.0.0-rc7
- **2015-12-03** -- Module v1.5-SNAPSHOT Adding Angular Material Design v1.0.0-rc6
- **2015-12-02** -- Module v1.5-SNAPSHOT Adding Bootstrap v3.3.6
- **2015-12-02** -- Module v1.5-SNAPSHOT Adding Angular Material Design v1.0.0-rc5
- **2015-11-24** -- Module v1.5-SNAPSHOT Integrating angular material design tosts component with lift messages. 
- **2015-11-22** -- Module v1.5-SNAPSHOT Adding AngularJS core v1.4.8 
- **2015-07-28** -- Module v1.4-SNAPSHOT Adding JQuery v2.1.4
- **2015-07-28** -- Module v1.4-SNAPSHOT Adding Font-Awesome v4.3.0
- **2015-07-28** -- Module v1.4-SNAPSHOT Adding Bootstrap v3.3.5
- **2015-07-28** -- Module v1.4-SNAPSHOT Adding Angular-Material design v0.10.0 
- **2015-07-28** -- Module v1.4-SNAPSHOT Removed AngularJS core v1.4.0 in favour v1.4.1 
- **2015-06-21** -- Module v1.4-SNAPSHOT Adding AngularJS core v1.4.1
- **2015-06-04** -- Module v1.4-SNAPSHOT Adding AngularJS core v1.4.0
- **2015-05-22** -- Module v1.4-SNAPSHOT Adding AngularJS core v1.3.15
- **2014-07-08** -- Module v1.3-SNAPSHOT Adding AngularJS v1.2.19
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

