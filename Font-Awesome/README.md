FoBo-Font-Awesome
=================

This sub module provides Font Awesome to the Fobo Module, but can also be used as-is with or without bootsrap or the FoBo module (see below for setup information).
For more information on how to use Font-Awesome in the FoBo module see the [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo).

Contributions
------
Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion to my priv. e-mail or on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

best regards 
Peter Petersson 

Update log
----------

For update history see the [History log](https://github.com/karma4u101/FoBo/tree/master/Font-Awesome#history-log) section

**Latest Module Version:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo)  

**Latest Update:**
- **2013-05-01** -- 0.9.9-SNAPSHOT ++ One version to rule them all, unified FoBo module and sub-module versions.
- **2013-01-12** -- 0.1.0-SNAPSHOT Adding font-awesome v3.0.0

**Latest Releases:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo) for releas information.


Integration into your project 
-------------------------------

This module is used by the FoBo module to, via [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md) provide [Font Awesome](http://fortawesome.github.com/Font-Awesome/). 

However the FoBo-Font-Awesome module can be used separately then apart from the dependency setting the only difference from using it from within the FoBo meta module is the usage of a slightly different package object name in Lift boot. 

For more information on how to use Font-Awesome see the [FoBo Demo](http://www.media4u101.se/fobo-lift-template-demo/libo) and [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md).  


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

For example (when using this module as a separete stand alone module outside of FoBo):

    "net.liftmodules" %% "fobo-font-awesome_2.5 % "1.0"
      :
    <dependency>
      <groupId>net.liftmodules</groupId>
      <artifactId>fobo-font-awesome_2.5_2.9.2</artifactId>
      <version>1.0</version>
    </dependency>

The example will include a module built for lift 2.5. If you are using maven observe that the artifact id also needs the Scala version.


For older versions <= 0.9.2 put the following in your project build.sbt files lift libraryDependencies section 

    "net.liftmodules" %% "fobo-font-awesome" % (liftVersion+"-[module version]") 

### Lift FoBo boot hooks (when used in the FoBo module)

    import net.liftmodules.FoBo 
    :
    FoBo.InitParam.ToolKit=FoBo.FontAwesomeXYZ 
    FoBo.init()

### Lift FoBo boot hooks (when used as stand alone module)

    import net.liftmodules.FoBoFA 
    :
    FoBoFA.InitParam.ToolKit=FoBoFA.FontAwesomeXYZ 
    FoBoFA.init()

### Lift FoBo Template hooks

    <link rel="stylesheet" type='text/css' href='/classpath/fobo/font-awesome.css'> 
    <link rel="stylesheet" type='text/css' href='[path/to/you/app/specific/css/file/in/the/webapp/dir]'>

For more information on how to use the font awesome fonts see [Font Awesome](http://fortawesome.github.com/Font-Awesome/)


### History log
----------------

**Module Version history:**
- **2013-01-10** -- 0.0.4-SNAPSHOT 
- **2013-01-04** -- 0.0.3-SNAPSHOT
- **2013-01-02** -- 0.0.2-SNAPSHOT
- **2012-12-30** -- 0.0.1-SNAPSHOT

**Updates history:**
- **2013-01-10** -- 0.0.4-SNAPSHOT Using font-awesome with TB it is no longer needed to explicitly specify a modified bootstrap.css file.
- **2013-01-04** -- 0.0.3-SNAPSHOT Changed package object name and decoupling the module future for use in FoBo.
- **2013-01-02** -- 0.0.2-SNAPSHOT Updated from 2.0 tag data to master/zip from homepage as there was issues on windows.
- **2012-12-30** -- 0.0.1-SNAPSHOT First draft.

**Snapshot Release history:**
- **2013-01-10** -- 0.0.4-SNAPSHOT artifacts for Lift 2.5-SNAPSHOTS (Scala 2.10.0, 2.9.1, 2.9.1-1, 2.9.1)
- **2013-01-02** -- 0.0.3-SNAPSHOT artifacts for Lift-2.5-M3 and Lift 2.5-SNAPSHOTS (Scala 2.9.1, 2.9.1-1, 2.9.1)
- **2013-01-02** -- 0.0.2-SNAPSHOT artifacts for Lift-2.5-M3 and Lift 2.5-SNAPSHOTS (Scala 2.9.1, 2.9.1-1, 2.9.1)
- **2012-12-30** -- 0.0.1-SNAPSHOT artifacts for Lift-2.5-M3 and Lift 2.5-SNAPSHOTS (Scala 2.9.1, 2.9.1-1, 2.9.1)


