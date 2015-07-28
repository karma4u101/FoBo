FoBo-JQuery
=========================

This sub module provides JQuery to the Fobo Module.
For more information on how to use FoBo-JQuery in the FoBo module see the [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo).

Contributions
------
Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

Update log
----------

For update history see the [History log](https://github.com/karma4u101/FoBo/tree/master/Foundation#history-log) section

**Latest Module Version:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo) 

**Latest Update:**
- **2015-07-28** -- Module v1.4-SNAPSHOT Adding JQuery v2.1.4
- **2013-10-21** -- Module v1.1-SNAPSHOT Now using v2.5 of lift-jquery-module for all flavours of Lift.
- **2013-08-21** -- Module v1.1-SNAPSHOT Adding JQuery v1.10.2
- **2013-05-01** -- Module v0.9.9-SNAPSHOT ++ One version to rule them all, unified FoBo module and sub-module versions.
- **2013-04-27** -- Module v0.3.0-SNAPSHOT Adding jquery v1.9.1
- **2013-04-06** -- Module v0.2.0-SNAPSHOT Using lift-query-module v2.3 for Lift v2.5 with new version schema.
- **2013-03-29** -- Module v0.1.0-SNAPSHOT Making JQuery a FoBo sub-module/project.

**Latest Releases:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo) for release information.

Integration into your project 
-------------------------------

This module is used by the FoBo module to, via [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md) provide [JQuery](http://jquery.com/). 

However the FoBo-JQuery module can be used separatly (not recomended see next paragraf) the only difference from using it from within the FoBo meta module is the usage of a slightly different package object name in Lift boot. 

Although it is posible to use this module separatly it is, in that case, recomended to use the lift-jqurey-module as this module basicaly is a wrapper around that module to be able to provide jquery within the FoBo namespace. 

For more information on how to use JQuery see the [FoBo Demo](http://www.media4u101.se/fobo-lift-template-demo/) and [FoBo](https://github.com/karma4u101/FoBo/blob/master/README.md).  

### Lift FoBo boot hooks (when used in the FoBo module)

    import net.liftmodules.FoBo 
    :
    FoBo.InitParam.ToolKit=FoBo.JQueryXYZ
    FoBo.init()
    
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


