FoBo-DataTables
=================

This sub module provides DataTables to the Fobo Module, but can also be used as-is (see below for setup information).
For more information on how to use DataTables in the FoBo module see the [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo).

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
- **2013-02-24** -- Module v0.1.0-SNAPSHOT Initial split of DataTables into this sub project

**Latest Releases:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo) for releas information.


Integration into your project 
-------------------------------

This module is used by the FoBo module to, via [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md) provide [DataTables.net](http://datatables.net/). 

However the FoBo-DataTables module can be used separately then apart from the dependency setting the only difference from using it from within the FoBo meta module is the usage of a slightly different package object name in Lift boot. 

For more information on how to use DataTables see the [FoBo Demo](http://www.media4u101.se/fobo-lift-template-demo/) and [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md).  

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

    "net.liftmodules" %% "fobo-datatables_2.5 % "1.0"
      :
    <dependency>
      <groupId>net.liftmodules</groupId>
      <artifactId>fobo-datatables_2.5_2.9.2</artifactId>
      <version>1.0</version>
    </dependency>

The example will include a module built for lift 2.5. If you are using maven observe that the artifact id also needs the Scala version.


For older versions <= 0.9.2 put the following in your project build.sbt files lift libraryDependencies section 

    "net.liftmodules" %% "fobo-datatables" % (liftVersion+"-[module version]") 

### Lift FoBo boot hooks (when used in the FoBo module)

    import net.liftmodules.FoBo
    :
    //Use this if you are planing to use the FoBo DataTables sub module without using the FoBo meta module. 
    FoBo.InitParam.ToolKit=FoBo.DataTablesXYZ 
    FoBo.init()

### Lift FoBo boot hooks (when used as stand alone module)

    import net.liftmodules.FoBoDT
    :
    //Use this if you are planing to use the FoBo DataTables sub module without using the FoBo meta module. 
    FoBoDT.InitParam.ToolKit=FoBoDT.DataTablesXYZ 
    FoBoDT.init()  

### Lift FoBo Template hooks

    <link rel="stylesheet" type="text/css" href="/classpath/fobo/themes/smoothness.css">
    <link rel="stylesheet" type="text/css" href="/classpath/fobo/jquery.dataTables_themeroller.css">
    <script src="/classpath/fobo/jquery.dataTables.js" charset="utf-8" type="text/javascript"></script>

For more information on how to use datatables see [DataTables.net](http://datatables.net/)

###Available Css files

- jquery.dataTables.css
- jquery.dataTables_themeroller.css
- AutoFill.css
- ColReorder.css
- ColVis.css
- ColVisAlt.css
- TableTools_JUI.css
- TableTools.css

Script files

- jquery.dataTables.js
- AutoFill.js
- ColReorder.js
- ColVis.js
- FixedColumns.js
- FixedHeader.js
- KeyTable.js
- Scroller.js
- TableTools.js
- ZeroClipboard.js

Themes files

- themes/smoothness.css 
- themes/ui-lightness.css

swf files

- copy_cvs_xls_pdf.swf
- copy_cvs_xls.swf

### History log
----------------

**Module Version history:**
- 

**Updates history:**
- 




