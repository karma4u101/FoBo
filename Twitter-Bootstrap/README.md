FoBo-Twitter-Bootstrap
======================

This sub module provides Twitter Bootstrap to the Fobo Module, but can also be used as-is (see below for setup information).
For more information on how to use Twitter Bootstrap in the FoBo module see the [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo).

Contributions
------
Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion to my priv. e-mail or on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

best regards 
Peter Petersson 

Update log
----------

For update history see the [History log](https://github.com/karma4u101/FoBo/tree/master/Twitter-Bootstrap#history-log) section

**Latest Module Version:** 
- **2013-02-24** -- 0.2.0-SNAPSHOT 
- **2013-01-22** -- 0.1.1-SNAPSHOT

**Latest Updates:**
- **2013-02-24** -- 0.2.0-SNAPSHOT Completed module transaction. Now using FoBo.XXXX namespace for snippets.
- **2013-01-22** -- 0.1.1-SNAPSHOT Fixing serving of minified bootstrap.js when not in development.

**Latest Releases:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo) for releas information.



Integration into your project 
-------------------------------

This module is internaly used by the FoBo module to, via [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md) provide [Twitter Bootstrap](http://twitter.github.com/bootstrap/). 

However the FoBo-Twitter-Bootstrap module can be used separatly the only difference from using it from within the FoBo meta module is the usage of a slightly different package object name in Lift boot. 

The following describes how to set up the module in your project **as a separate module** (without using the [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md) meta module). For setup in FoBo see the FoBo documentation.

For more information on how to use this module see the [FoBo Demo](http://www.media4u101.se/fobo-lift-template-demo/libo) and [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md).  

### Dependancy

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

    "net.liftmodules" %% "fobo-twitter-bootstrap_2.5 % "0.1.0-SNAPSHOT"
      :
    <dependency>
      <groupId>net.liftmodules</groupId>
      <artifactId>fobo-twitter-bootstrap_2.5_2.9.2</artifactId>
      <version>0.1.0-SNAPSHOT</version>
    </dependency>

The example will include a module built for lift 2.5. If you are using maven observe that the artifact id also needs the Scala version.


For older versions <= 0.9.2 put the following in your project build.sbt files lift libraryDependencies section

    "net.liftmodules" %% "fobo-twitter-bootstrap" % (liftVersion+"-[module version]") 

### Lift FoBo boot hooks

    import net.liftmodules.FoBo-Twitter-Bootstrap 
    :
    FoBoTB.InitParam.ToolKit=FoBoTB.BootstrapXXX 
    FoBoTB.init()
    (usage with FoBo is FoBo.InitParam.ToolKit=FoBo.BootstrapXXX)

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

