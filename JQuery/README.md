FoBo-JQuery
=========================

This sub module provides JQuery to the Fobo Module.
For more information on how to use FoBo-JQuery in the FoBo module see the [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo).

Contributions
------
Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion to my priv. e-mail or on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

best regards 
Peter Petersson 

Update log
----------

For update history see the [History log](https://github.com/karma4u101/FoBo/tree/master/Foundation#history-log) section

**Latest Module Version:**
- **2013-04-06** -- 0.2.0-SNAPSHOT
- **2013-03-29** -- 0.1.0-SNAPSHOT 

**Latest Update:**
- **2013-04-06** -- 0.2.0-SNAPSHOT Using lift-query-module v2.3 for Lift v2.5 with new version schema.
- **2013-03-29** -- 0.1.0-SNAPSHOT Making JQuery a FoBo sub-module/project.

**Latest Releases:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo) for releas information.



Integration into your project 
-------------------------------

This module is used by the FoBo module to, via [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md) provide [JQuery](http://jquery.com/). 

However the FoBo-JQuery module can be used separatly (not recomended see next paragraf) the only difference from using it from within the FoBo meta module is the usage of a slightly different package object name in Lift boot. 

Although it is posible to use this module separatly it is, in that case, recomended to use the lift-jqurey-module as this module basicaly is a wrapper around that module to be able to provide jquery within the FoBo namespace. 

The following describes how to set up the module in your project **as a separate module** (without using the [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md) meta module). For setup in FoBo see the FoBo documentation.

For more information on how to use JQuery see the [FoBo Demo](http://www.media4u101.se/fobo-lift-template-demo/) and [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md).  


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

    "net.liftmodules" %% "fobo-jquery_2.5 % "0.1.0-SNAPSHOT"
      :
    <dependency>
      <groupId>net.liftmodules</groupId>
      <artifactId>fobo-jquery_2.5_2.9.2</artifactId>
      <version>0.1.0-SNAPSHOT</version>
    </dependency>

The example will include a module built for lift 2.5. If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks

    import net.liftmodules.FoBoJQ 
    :
    FoBoJQ.InitParam.ToolKit=FoBoJQ.JQueryXYZ
    FoBoGCP.init()
    (usage with FoBo is FoBo.InitParam.ToolKit=FoBo.JQueryXYZ)   

### Lift FoBo Template hooks

    <script src="/classpath/fobo/jquery.js" type="text/javascript"></script>
    
Note: This module is basicly a simple wrapper around the lift-jquery-module to be able to provide a path with the namespace fobo in it.

For more information on how to use JQuery see [JQuery](http://jquery.com/)


### History log
----------------

**Module Version history:**
-

**Updates history:**
- 

**Snapshot Release history:**
- 


