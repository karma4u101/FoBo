# FoBo Twitter Bootstrap Toolkit Module

This FoBo toolkit module provides Twitter Bootstrap v2.x API and Resource components to the FoBo / FoBo Module, 
but can also be used as-is, see below for setup information. 

## Components and available versions 

- Bootstrap [v2.3.2] - [Bootstrap](http://twitter.github.com/bootstrap/)

## Integration into your project 

### Dependency settings

Example setup:

**SBT:**
```scala
"net.liftmodules" %% "fobo-twitter-bootstrap_3.0 % "1.6"
```
**Maven:**
```xml
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-twitter-bootstrap_3.0_2.11.7</artifactId>
  <version>1.6</version>
</dependency>
```
The example will include a module built for lift 3.0.x. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.FoBo 
  :
FoBo.ToolKit.Init=FoBo.ToolKit.Bootstrap232 
```
### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.FoBoTB 
  :
FoBoTB.ToolKit.Init=FoBoTB.ToolKit.Bootstrap323 
```
### Lift FoBo Template hooks
```html
<link rel="stylesheet" type='text/css' href='/classpath/fobo/bootstrap.css'> 
<link rel="stylesheet" type='text/css' href='/classpath/fobo/bootstrap-responsive.css'> 
  :
<link rel="stylesheet" type='text/css' href='[path/to/you/app/specific/css/file/in/the/webapp/dir]'>
  :
  :
<script type="text/javascript" src="/classpath/fobo/bootstrap.js"></script>
```
For more information on how to use Twitter Bootstrap see [Twitter Bootstrap](http://twitter.github.com/bootstrap/)
For more information on how to use Twitter Bootstrap in the FoBo module see the [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo).

## Contributions

Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

## Update log

For update history see the [History log](https://github.com/karma4u101/FoBo/tree/master/Bootstrap/Bootstrap2/Twitter-Bootstrap#history-log) section

**Latest Module Version:** 
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo)

**Latest Updates:**
- **2013-07-29** -- Module v1.1-SNAPSHOT Added bootstrap v2.3.2 

**Latest Releases:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo) for release information.

### History log

**Module Version history:**
- **2013-05-11** -- Module v1.0-SNAPSHOT Added bootstrap v2.3.1
- **2013-05-01** -- Module v0.9.9-SNAPSHOT ++ One version to rule them all, unified FoBo module and sub-module versions.
- **2013-02-24** -- Module v0.2.0-SNAPSHOT Completed module transaction. Now using FoBo.XXXX namespace for snippets.
- **2013-01-22** -- Module v0.1.1-SNAPSHOT Fixing serving of minified bootstrap.js when not in development.
- **2013-01-17** -- 0.1.0-SNAPSHOT
- **2013-01-10** -- 0.0.1-SNAPSHOT


