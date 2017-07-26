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
"net.liftmodules" %% "fobo-twitter-bootstrap_3.1 % "2.0"
```
**Maven:**
```xml
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-twitter-bootstrap_3.1_2.12.2</artifactId>
  <version>2.0</version>
</dependency>
```
The example will include a module built for lift 3.1.x. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.fobo 
  :
fobo.Toolkit.init = fobo.Toolkit.Bootstrap232 
```
### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.fobotb
  :
fobotb.Toolkit.init = fobotb.Toolkit.Bootstrap323 
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



