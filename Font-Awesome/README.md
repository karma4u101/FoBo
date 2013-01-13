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

For update history see the [History log](href=#history-log) section

**Latest Module Version:**
- **2013-01-12** -- 0.1.0-SNAPSHOT 

**Latest Update:**
- **2013-01-12** -- 0.1.0-SNAPSHOT Adding font-awesome v3.0.0

**Latest Stable Releases:**
- None

**Latest Snapshot Release:**
- **2013-01-10** -- 0.0.4-SNAPSHOT artifacts for Lift 2.5-SNAPSHOTS (Scala 2.10.0, 2.9.1, 2.9.1-1, 2.9.1)

Integration into your project 
-------------------------------

This module is used by the FoBo module to, via [FoBo](http://fortawesome.github.com/FoBo/) provide [Font Awesome](http://fortawesome.github.com/Font-Awesome/). 
However the module can be used separatly, the following describes how to use it as a separate module (without the use of the [FoBo](http://fortawesome.github.com/FoBo/)).

### Dependancy

Put the following in your project build.sbt files lift libraryDependencies section 

    "net.liftmodules" %% "fobo-font-awesome" % (liftVersion+"-[module version]") 

### Lift FoBo boot hooks

    import net.liftmodules.FoBo-Font-Awesome 
    :
    //Use this if you are planing to use font-awesome without twitter bootstrap 
    FoBoFontAwesome.InitParam.ToolKit=FoBoFontAwesome.FontAwesomeXYZ 
    (usage with FoBo is FoBo.InitParam.ToolKit=FoBo.FontAwesomeXYZ)

    //Use this if you are planing to use font-awesome with Twitter Bootstrap version XYZ 
    FoBoFontAwesome.InitParam.ToolKit=FoBoFontAwesome.FontAwesomeXYZTBXYZ 
    (usage with FoBo is FoBo.InitParam.ToolKit=FoBo.FontAwesomeXXXTBXYZ)    

### Lift FoBo Template hooks

    <link rel="stylesheet" type='text/css' href='/classpath/fobo/font-awesome.css'> 
    <link rel="stylesheet" type='text/css' href='[path/to/you/app/specific/css/file/in/the/webapp/dir]'>

For more information on how to use the font awesome fonts see [Font Awesome](http://fortawesome.github.com/Font-Awesome/)


### History log
----------------

**Module Version:**
- **2013-01-10** -- 0.0.4-SNAPSHOT 
- **2013-01-04** -- 0.0.3-SNAPSHOT
- **2013-01-02** -- 0.0.2-SNAPSHOT
- **2012-12-30** -- 0.0.1-SNAPSHOT

**Updates:**
- **2013-01-10** -- 0.0.4-SNAPSHOT Using font-awesome with TB it is no longer needed to explicitly specify a modified bootstrap.css file.
- **2013-01-04** -- 0.0.3-SNAPSHOT Changed package object name and decoupling the module future for use in FoBo.
- **2013-01-02** -- 0.0.2-SNAPSHOT Updated from 2.0 tag data to master/zip from homepage as there was issues on windows.
- **2012-12-30** -- 0.0.1-SNAPSHOT First draft.

**Snapshot Release:**
- **2013-01-02** -- 0.0.3-SNAPSHOT artifacts for Lift-2.5-M3 and Lift 2.5-SNAPSHOTS (Scala 2.9.1, 2.9.1-1, 2.9.1)
- **2013-01-02** -- 0.0.2-SNAPSHOT artifacts for Lift-2.5-M3 and Lift 2.5-SNAPSHOTS (Scala 2.9.1, 2.9.1-1, 2.9.1)
- **2012-12-30** -- 0.0.1-SNAPSHOT artifacts for Lift-2.5-M3 and Lift 2.5-SNAPSHOTS (Scala 2.9.1, 2.9.1-1, 2.9.1)


