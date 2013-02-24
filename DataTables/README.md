FoBo-DataTables
=================

This sub module provides DataTables to the Fobo Module, but can also be used as-is (see below for setup information).
For more information on how to use DataTables in the FoBo module see the [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo).

Contributions
------
Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion to my priv. e-mail or on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

best regards 
Peter Petersson 

Update log
----------

For update history see the [History log](https://github.com/karma4u101/FoBo/tree/master/Font-Awesome#history-log) section

**Latest Module Version:**
- **2013-02-24** -- 0.1.0-SNAPSHOT 

**Latest Update:**
- **2013-02-24** -- 0.1.0-SNAPSHOT Initial split of DataTables into this sub project

**Latest Stable Releases:**
- None

**Latest Snapshot Release:**
- **2013-02-24** -- 0.1.0-SNAPSHOT published artifacts for Lift 2.5-RC1, 2.5-SNAPSHOT (Scala 2.10.0, 2.9.1, 2.9.1-1, 2.9.1) and Lift 3.0-SNAPSHOT


Integration into your project 
-------------------------------

This module is used by the FoBo module to, via [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md) provide [DataTables.net](http://datatables.net/). 

However the FoBo-DataTables module can be used separatly the only difference from using it from within the FoBo meta module is the usage of a slightly different package object name in Lift boot. 

The following describes how to set up the module in your project **as a separate module** (without using the [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md) meta module). For setup in FoBo see the FoBo documentation.

For more information on how to use DataTables see the [FoBo Demo](http://www.media4u101.se/fobo-lift-template-demo/) and [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md).  


### Dependancy

Put the following in your project build.sbt files lift libraryDependencies section 

    "net.liftmodules" %% "fobo-datatables" % (liftVersion+"-[module version]") 

### Lift FoBo boot hooks

    import net.liftmodules.FoBo-DataTables 
    :
    //Use this if you are planing to use the FoBo DataTables sub module without using the FoBo meta module. 
    FoBoDT.InitParam.ToolKit=FoBoDT.DataTablesXYZ 
    FoBoDT.init()
    (usage with FoBo is FoBo.InitParam.ToolKit=FoBo.DataTablesXYZ)   

### Lift FoBo Template hooks

    <script src="/classpath/fobo/jquery.dataTables.js" charset="utf-8" type="text/javascript"></script>
    <link rel="stylesheet" type="text/css" href="/classpath/fobo/themes/smoothness.css">
    <link rel="stylesheet" type="text/css" href="/classpath/fobo/jquery.dataTables_themeroller.css">

For more information on how to use datatables see [DataTables.net](http://datatables.net/)


### History log
----------------

**Module Version history:**
- 

**Updates history:**
- 

**Snapshot Release history:**
- 


