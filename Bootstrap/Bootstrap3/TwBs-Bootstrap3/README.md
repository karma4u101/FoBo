# FoBo TwBs Bootstrap3 Toolkit Module

This FoBo toolkit module provides Bootstrap 3.x API and Resource components to the FoBo / FoBo Module, 
but can also be used as-is, see below for setup information. 

## Components and available versions 

- Bootstrap [v3.0.0, v3.0.1, v3.1.1, v3.2.0, v3.3.5, v3.3.6] - [Bootstrap 3.x](http://getbootstrap.com/)

## Integration into your project 

### Dependency settings

Example setup:

**SBT:**
```scala
"net.liftmodules" %% "fobo-twbs-bootstrap3_3.0 % "1.6"
```
**Maven:**
```xml
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-twbs-bootstrap3_3.0_2.11.7</artifactId>
  <version>1.6</version>
</dependency>
```
The example will include the FoBo Bootstrap3 toolkit module built for lift 3.0. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.FoBo 
  :
FoBo.Toolkit.Init=FoBo.Toolkit.BootstrapXXX 
```    

### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.{FoBoBs => FoBo}
  :
FoBo.Toolkit.Init=FoBo.Toolkit.BootstrapXXX 
```
### Lift FoBo Template hooks
```html
<link href='/classpath/fobo/bootstrap.css' rel="stylesheet" type='text/css'> 
<link href='/classpath/fobo/bootstrap-responsive.css' rel="stylesheet" type='text/css'> 
  :
<link href='[path/to/you/app/specific/css/file/in/the/webapp/dir]' rel="stylesheet" type='text/css'>
  :
  :
<script src="/classpath/fobo/bootstrap.js" type="text/javascript" ></script>
```
Here the resources starting with /classpath/fobo/ is the ones provided by the FoBo module. 
The FoBo js and css files will, without any name change, be served debug-able in development and minimized otherwise. 

For more information on how to use Twitter Bootstrap see [Twitter Bootstrap](http://twitter.github.com/bootstrap/)

## Contributions

Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

## Update log

For update history see the [History log](https://github.com/karma4u101/FoBo/tree/master/Bootstrap#history-log) (master) section

**Latest Module Version:** 
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo/tree/master) (master)

**Latest Updates:**
- **2015-12-02** -- Module v1.5-SNAPSHOT Adding Bootstrap v3.3.6
- **2015-07-28** -- Module v1.4-SNAPSHOT Adding Bootstrap v3.3.5
- **2014-07-02** -- Module v1.3-SNAPSHOT Adding bootstrap v3.2.0
- **2014-03-09** -- Module v1.2-SNAPSHOT Adding bootstrap v3.1.1
- **2013-11-03** -- Module v1.1-SNAPSHOT Adding bootstrap v3.0.1 
- **2013-11-01** -- Module v1.1-SNAPSHOT renaming of Bootstrap v3.x Snippets. Snippet names now start with "Bs3*"
- **2013-10-26** -- Module v1.1-SNAPSHOT Added BootstrapMegaMetaProtoUser for mapper with Bootstrap3 styled views. 
- **2013-08-29** -- Module v1.1-SNAPSHOT Added bootstrap v3.0.0 deprecated v3.0-RC1
- **2013-07-29** -- Module v1.1-SNAPSHOT Added bootstrap v3.0-RC1 

**Latest Releases:**
- See [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo/tree/master) (master) for release information.

### History log

**Module Version history:**
- **2013-01-17** -- 0.1.0-SNAPSHOT
- **2013-01-10** -- 0.0.1-SNAPSHOT

**Updates history:**
- **2013-01-10** -- 0.0.1-SNAPSHOT First Draft

**Snapshot Release history:**

