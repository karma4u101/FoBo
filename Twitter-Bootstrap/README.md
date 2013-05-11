FoBo-Twitter-Bootstrap
======================

This sub module provides Twitter Bootstrap to the Fobo Module, but can also be used as-is (see below for setup information).
For more information on how to use Twitter Bootstrap in the FoBo module see the [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo).

Components and available versions 
---------------------------------
- Bootstrap [v2.1.0, v2.2.0, v2.2.2, v2.3.0, v2.3.1] - [Bootstrap](http://twitter.github.com/bootstrap/)

Contributions
------
Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion to my priv. e-mail or on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

best regards 
Peter Petersson 

Update log
----------

For update history see the [History log](https://github.com/karma4u101/FoBo/tree/master/Twitter-Bootstrap#history-log) section

**Latest Module Version:** 
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo)

**Latest Updates:**
- **2013-05-11** -- 1.0-SNAPSHOT Added bootstrap v2.3.1
- **2013-05-01** -- 0.9.9-SNAPSHOT ++ One version to rule them all, unified FoBo module and sub-module versions.
- **2013-02-24** -- 0.2.0-SNAPSHOT Completed module transaction. Now using FoBo.XXXX namespace for snippets.
- **2013-01-22** -- 0.1.1-SNAPSHOT Fixing serving of minified bootstrap.js when not in development.

**Latest Releases:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo) for release information.



Integration into your project 
-------------------------------

This module is internaly used by the FoBo module to, via [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md) provide [Twitter Bootstrap](http://twitter.github.com/bootstrap/). 

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

