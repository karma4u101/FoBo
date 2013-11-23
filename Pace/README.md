FoBo-Pace
=========================

This sub module provides Pace to the Fobo Module, but can also be used as-is (see below for setup information).
For more information on how to use Pace in the FoBo module see the [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo).

Contributions
------
Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

Update log
----------

For update history see the [History log](https://github.com/karma4u101/FoBo/tree/master/Foundation#history-log) section

**Latest Module Version:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo)  

**Latest Update:**
- **2013-05-01** -- Module v0.9.9-SNAPSHOT ++ One version to rule them all, unified FoBo module and sub-module versions.
- **2013-03-29** -- Module v0.1.0-SNAPSHOT Making Google-Code-Prettify a FoBo subproject.

**Latest Releases:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo) for releas information.


Integration into your project 
-------------------------------

This module is used by the FoBo module to, via [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md) provide [Pace](http://github.hubspot.com/pace/docs/welcome/). 

However the FoBo-Pace module can be used separately then apart from the dependency setting the only difference from using it from within the FoBo meta module is the usage of a slightly different package object name in Lift boot. 

For more information on how to use Pace see the [FoBo Demo](http://www.media4u101.se/fobo-lift-template-demo/) and [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md).  


### Dependancy settings

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

For example (when using this module as a separete stand alone module outside of FoBo):

    "net.liftmodules" %% "fobo-pace_2.6 % "1.2"
      :
    <dependency>
      <groupId>net.liftmodules</groupId>
      <artifactId>fobo-pace_2.6_2.9.2</artifactId>
      <version>1.2</version>
    </dependency>

The example will include a module built for lift 2.6. If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used in the FoBo module)

    import net.liftmodules.FoBo 
    :
    FoBo.InitParam.ToolKit=FoBo.PaceXYZ 
    FoBo.init() 

### Lift FoBo boot hooks (when used as stand alone module)

    import net.liftmodules.FoBoPa 
    :
    FoBoPa.InitParam.ToolKit=FoBoPa.PaceXYZ 
    FoBoPa.init()   

### Lift FoBo Template hooks

    <link rel="stylesheet" type="text/css" href="/classpath/fobo/pace-theme-minimal.css">
    <script src="/classpath/fobo/pace.js" type="text/javascript"></script>

Css files

- pace-theme-barber-shop.css [v0.4.15]
- pace-theme-big-counter.css [v0.4.15]
- pace-theme-bounce.css [v0.4.15]
- pace-theme-center-circle.css [v0.4.15]
- pace-theme-corner-indicator.css [v0.4.15]
- pace-theme-fill-left.css [v0.4.15]
- pace-theme-flash.css [v0.4.15]
- pace-theme-flash-red.css [v0.4.15]
- pace-theme-flat-top.css [v0.4.15]
- pace-theme-mac-osx.css [v0.4.15]
- pace-theme-minimal.css [v0.4.15]
- pace-theme-minimal-red.css [v0.4.15]

Script files

- pace.js [v0.4.15]

For more information on how to use Pace see [Pace](http://github.hubspot.com/pace/docs/welcome/)

### History log
----------------

**Module Version history:**
-

**Updates history:**
- 

**Snapshot Release history:**
- 


