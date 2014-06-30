FoBo-KineticJS
=========================

This sub module provides Kinetic to the Fobo Module, but can also be used as-is (see below for setup information).
For more information on how to use Kinetic in the FoBo module see the [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo).

Contributions
------
Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

Update log
----------

For update history see the [History log](https://github.com/karma4u101/FoBo/tree/master/KineticJS#history-log) section

**Latest Module Version:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo)  

**Latest Update:**
- **2014-06-09** -- Added KineticJS v5.1.0.

**Latest Releases:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo) for releas information.


Integration into your project 
-------------------------------

This module is used by the FoBo module to, via [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md) provide [Kinetic](http://kineticjs.com/). 

However the FoBo-Kinetic module can be used separately then apart from the dependency setting the only difference from using it from within the FoBo meta module is the usage of a slightly different package object name in Lift boot. 

For more information on how to use Kinetic see the [FoBo Demo](http://www.media4u101.se/fobo-lift-template-demo/) and [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md).  


### Dependancy settings

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

    "net.liftmodules" %% "fobo-kineticjs_2.6 % "1.3"
      :
    <dependency>
      <groupId>net.liftmodules</groupId>
      <artifactId>fobo-kineticjs_2.6_2.10.4</artifactId>
      <version>1.3</version>
    </dependency>

The example will include a module built for lift 2.6. If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used in the FoBo module)

    import net.liftmodules.FoBo 
    :
    FoBo.InitParam.ToolKit=FoBo.KineticJSXYZ 
    FoBo.init() 

### Lift FoBo boot hooks (when used as stand alone module)

    import net.liftmodules.FoBoKi 
    :
    FoBoKi.InitParam.ToolKit=FoBoKi.KineticJSXYZ 
    FoBoKi.init()   

### Lift FoBo Template hooks

    <script src="/classpath/fobo/kinetic.js" type="text/javascript"></script>

Css files

- None

Script files

- kinetic.js [v5.1.0]

For more information on how to use KineticJS see [KineticJS](http://kineticjs.com/)

### History log
----------------

**Module Version history:**
-

**Updates history:**
- 

**Snapshot Release history:**
- 


