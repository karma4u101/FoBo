# FoBo JQuery Toolkit Module

This FoBo toolkit module provides JQuery to the FoBo / FoBo Module, 
but can also be used as-is, see below for setup information. 

## Components and available versions 

- FoBo-JQuery [v1.7.2, v1.8,2, v1.9.1, v1.10.2, v1.11.0, v1.11.1, v1.11.3, v2.1.1, v2.1.4] - [JQuery](http://jquery.com/)

## Integration into your project 

### Dependency settings

Example setup:

**SBT:**
```scala
"net.liftmodules" %% "fobo-jquery_3.0 % "1.6"
```
**Maven:**
```xml
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-jquery_3.0_2.11.7</artifactId>
  <version>1.6</version>
</dependency>
```
The example will include a module built for lift 3.0.x. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.{FoBoJQ => FoBo} 
  :
FoBo.ToolKit.Init=FoBo.ToolKit.JQueryXYZ
```    
### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.FoBo 
  :
FoBo.ToolKit.Init=FoBo.ToolKit.JQueryXYZ
```    
### Lift FoBo Template hooks
```html
<script src="/classpath/fobo/jquery.js" type="text/javascript"></script>
```    
Note: This module is basicly a simple wrapper around the lift-jquery-module to be able to provide a path with the namespace fobo in it.

For more information on how to use JQuery see [JQuery](http://jquery.com/)

## Contributions

Improvements, contributions and suggestions are welcome! 
Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). 
You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

## Update log

**Latest Update:**
- **2015-08-05** -- Module v1.4-SNAPSHOT Adding JQuery v1.11.3 

### History log


**Updates history:**
- **2015-07-28** -- Module v1.4-SNAPSHOT Adding JQuery v2.1.4
- **2013-10-21** -- Module v1.1-SNAPSHOT Now using v2.5 of lift-jquery-module for all flavours of Lift.
- **2013-08-21** -- Module v1.1-SNAPSHOT Adding JQuery v1.10.2
- **2013-05-01** -- Module v0.9.9-SNAPSHOT ++ One version to rule them all, unified FoBo module and sub-module versions.
- **2013-04-27** -- Module v0.3.0-SNAPSHOT Adding jquery v1.9.1
- **2013-04-06** -- Module v0.2.0-SNAPSHOT Using lift-query-module v2.3 for Lift v2.5 with new version schema.
- **2013-03-29** -- Module v0.1.0-SNAPSHOT Making JQuery a FoBo sub-module/project.
 

