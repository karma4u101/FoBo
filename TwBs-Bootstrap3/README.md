FoBo-TwBs-Bootstrap3
======================

This sub module provides Bootstrap 3.x to the Fobo Module, but can also be used as-is (see below for setup information).
For more information on how to use Twitter Bootstrap in the FoBo module see the [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo).

Components and available versions 
---------------------------------
- Bootstrap [v3.0.0, v3.0.1] - [Bootstrap 3.x](http://getbootstrap.com/)

Example Lift FoBo Template hooks
----------------------------------

    <link href="/classpath/fobo/bootstrap.css" rel="stylesheet" type="text/css" />
    <link href="/classpath/fobo/bootstrap-theme.css" rel="stylesheet" type="text/css" />
    <link href="/assets/css/app-bs-theme.css" rel="stylesheet" type="text/css" />
    <script src="/classpath/fobo/jquery.js" id="jquery" type="text/javascript"></script>
    <script src="/classpath/fobo/bootstrap.js" type="text/javascript"></script>

Here the resources starting with /classpath/fobo/ is the ones provided by the FoBo module. 
The FoBo js and css files will, without anny name change, be served debug-able in development and minimized otherwise. 

Contributions
---------------
Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

Update log
------------

For update history see the [History log](https://github.com/karma4u101/FoBo/tree/master/Bootstrap#history-log) (master) section

**Latest Module Version:** 
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo/tree/master) (master)

**Latest Updates:**
- **2013-11-03** -- Module v1.1-SNAPSHOT Adding bootstrap v3.0.1 
- **2013-11-01** -- Module v1.1-SNAPSHOT renaming of Bootstrap v3.x Snippets. Snippet names now start with "Bs3*"
- **2013-10-26** -- Module v1.1-SNAPSHOT Added BootstrapMegaMetaProtoUser for mapper with Bootstrap3 styled views. 
- **2013-08-29** -- Module v1.1-SNAPSHOT Added bootstrap v3.0.0 deprecated v3.0-RC1
- **2013-07-29** -- Module v1.1-SNAPSHOT Added bootstrap v3.0-RC1 

**Latest Releases:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo/tree/master) (master) for release information.



Integration into your project 
-------------------------------

This module is internaly used by the FoBo module to, via [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md) provide [Bootstrap 3.x](http://getbootstrap.com/). 

However the FoBo-Twitter-Bootstrap module can be used separatly then apart from the dependency setting the only difference from using it from within the FoBo meta module is the usage of a slightly different package object name in Lift boot. 

For more information on how to use this module see the [FoBo Demo](http://www.media4u101.se/fobo-lift-template-demo/libo) and [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md).  

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

For example:

    "net.liftmodules" %% "fobo-twitter-bootstrap_2.5 % "1.0"
      :
    <dependency>
      <groupId>net.liftmodules</groupId>
      <artifactId>fobo-twitter-bootstrap_2.5_2.9.2</artifactId>
      <version>1.0</version>
    </dependency>

The example will include a module built for lift 2.5. If you are using maven observe that the artifact id also needs the Scala version.

For older versions <= 0.9.2 put the following in your project build.sbt files lift libraryDependencies section

    "net.liftmodules" %% "fobo-twitter-bootstrap" % (liftVersion+"-[module version]") 

### Lift FoBo boot hooks (when used in the FoBo module)

    import net.liftmodules.FoBo 
    :
    FoBo.InitParam.ToolKit=FoBo.BootstrapXXX 
    FoBo.init()

### Lift FoBo boot hooks (when used as stand alone module)

    import net.liftmodules.FoBoTB 
    :
    FoBoTB.InitParam.ToolKit=FoBoTB.BootstrapXXX 
    FoBoTB.init()

### Lift FoBo Template hooks

    <link rel="stylesheet" type='text/css' href='/classpath/fobo/bootstrap.css'> 
    <link rel="stylesheet" type='text/css' href='/classpath/fobo/bootstrap-responsive.css'> 
    :
    <link rel="stylesheet" type='text/css' href='[path/to/you/app/specific/css/file/in/the/webapp/dir]'>
    :
    :
    <script type="text/javascript" src="/classpath/fobo/bootstrap.js"></script>

For more information on how to use Twitter Bootstrap see [Twitter Bootstrap](http://twitter.github.com/bootstrap/)

### History log
----------------

**Module Version history:**
- **2013-01-17** -- 0.1.0-SNAPSHOT
- **2013-01-10** -- 0.0.1-SNAPSHOT

**Updates history:**
- **2013-01-10** -- 0.0.1-SNAPSHOT First Draft

**Snapshot Release history:**

