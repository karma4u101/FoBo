FoBo-JQuery-Mobile
=================

This sub module provides JQuery-Mobile to the Fobo Module, but can also be used as-is (see below for setup information).
For more information on how to use JQuery-Mobile in the FoBo module see the [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo).

Contributions
------
Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

Update log
----------

For update history see the [History log](https://github.com/karma4u101/FoBo/tree/master/Font-Awesome#history-log) section

**Latest Module Version:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo) 

**Latest Update:**
- **2013-05-01** -- Module v0.9.9-SNAPSHOT ++ One version to rule them all, unified FoBo module and sub-module versions.
- **2013-03-24** -- Module v0.1.0-SNAPSHOT Making FoBo-JQuery-Mobile a FoBo subproject.

**Latest Releases:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo) for release information.


Integration into your project 
-------------------------------

This module is used by the FoBo module to, via [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md) provide [JQuery-Mobile](http://jquerymobile.com/). 

However the FoBo-JQuery-Mobile module can be used separately then apart from the dependency setting the only difference from using it from within the FoBo meta module is the usage of a slightly different package object name in Lift boot. 

For more information on how to use JQuery-Mobile see the [FoBo Demo](http://www.media4u101.se/fobo-lift-template-demo/) and [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md).  


### Dependency settings

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

    "net.liftmodules" %% "fobo-jquery-mobile_2.5 % "1.0"
      :
    <dependency>
      <groupId>net.liftmodules</groupId>
      <artifactId>fobo-jquery-mobile_2.5_2.9.2</artifactId>
      <version>1.0</version>
    </dependency>

The example will include a module built for lift 2.5. If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used in the FoBo module)

    import net.liftmodules.FoBo 
    :
    FoBo.InitParam.ToolKit=FoBo.JQueryMobileXYZ 
    FoBo.init() 

### Lift FoBo boot hooks

    import net.liftmodules.FoBoJQM 
    :
    FoBoJQM.InitParam.ToolKit=FoBoJQM.JQueryMobileXYZ 
    FoBoJQM.init()

### Lift FoBo Template hooks (when used as stand alone module)

Css files

- jquery.mobile.css
- jquery.mobile.structure.css
- jquery.mobile.theme.css (in jquery-mobile v1.1.0)

Script files

- jquery.mobile.js
- jquery.mobile.themeswitcher.js 

    <link rel="stylesheet" type="text/css" href="/classpath/fobo/[css file name]"> 
    <script type="text/javascript" src="/classpath/fobo/[script file name]"></script>

For more information on how to use JQuery-Mobile see [JQuery-Mobile](http://jquerymobile.com/)


### History log
----------------

**Module Version history:**
-

**Updates history:**
- 

**Snapshot Release history:**
- 


