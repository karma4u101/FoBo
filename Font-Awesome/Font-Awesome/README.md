# FoBo Font Awesome Toolkit Module

This FoBo toolkit module provides Font Awesome to the FoBo / FoBo Module, 
but can also be used as-is, see below for setup information. 

## Components and available versions 

- Font Awesome [v3.2.1, v4.0.3, v4.1.0, v4.3.0, v4.5.0] - [Font Awesome](http://fortawesome.github.com/Font-Awesome/)

## Integration into your project 

### Dependency settings

Example setup:

**SBT:**
```scala
"net.liftmodules" %% "fobo-font-awesome_3.0 % "1.6"
```
**Maven:**
```xml
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-font-awesome_3.0_2.11.7</artifactId>
  <version>1.6</version>
</dependency>
```
The example will include a module built for lift 3.0.x. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.{FoBoFA => FoBo}
  :
FoBo.ToolKit.Init=FoBo.ToolKit.FontAwesomeXYZ 
```
### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.FoBo 
  :
FoBo.ToolKit.Init=FoBo.ToolKit.FontAwesomeXYZ 
```
### Lift FoBo Template hooks
```html
<link rel="stylesheet" type='text/css' href='/classpath/fobo/font-awesome.css'> 
<link rel="stylesheet" type='text/css' href='[path/to/you/app/specific/css/file/in/the/webapp/dir]'>
```
For more information on how to use the font awesome fonts see [Font Awesome](http://fortawesome.github.com/Font-Awesome/)

## Contributions

Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). 
You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

## Update log

For update history see the [History log](https://github.com/karma4u101/FoBo/tree/master/Font-Awesome#history-log) section

**Latest Update:**
- **2016-03-20** -- Module v1.4-SNAPSHOT Adding Font-Awesome v4.5.0

### History log

**Updates history:**
- **2015-07-28** -- Module v1.4-SNAPSHOT Adding Font-Awesome v4.3.0
- **2014-03-09** -- Module v1.2-SNAPSHOT Adding Font Awesome v4.0.3 suitable for use with Bootstrap v3.x 
- **2013-11-03** -- Module v1.1-SNAPSHOT Adding Font Awesome v4.0.1 suitable for use with Bootstrap v3.x 
- **2013-07-29** -- Module v1.1-SNAPSHOT Added bootstrap v2.3.2 and Font Awesome v3.2.1
- **2013-01-12** -- Module v0.1.0-SNAPSHOT Adding font-awesome v3.0.0
- **2013-01-10** -- 0.0.4-SNAPSHOT Using font-awesome with TB it is no longer needed to explicitly specify a modified bootstrap.css file.
- **2013-01-04** -- 0.0.3-SNAPSHOT Changed package object name and decoupling the module future for use in FoBo.
- **2013-01-02** -- 0.0.2-SNAPSHOT Updated from 2.0 tag data to master/zip from homepage as there was issues on windows.
- **2012-12-30** -- 0.0.1-SNAPSHOT First draft.


