# FoBo TwBs Bootstrap4 Resource Module

This resource module provides Bootstrap 4.x resource components to the FoBo TwBs Bootstrap3 Toolkit Module, 
but can also be used as-is (see below for setup information).

## Components and available versions 

- Bootstrap [v4.0.0, v4.1.3] - [Bootstrap 4.1](https://getbootstrap.com/docs/4.1)

## Integration into your project 

### Dependency settings

Example setup:

**SBT:**
```scala
    "net.liftmodules" %% "fobo-twitter-bootstrap-res_3.3 % "2.1"
```      
**Maven:**
 ```xml         
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-twitter-bootstrap-res_3.3_2.12.6</artifactId>
  <version>2.1</version>
</dependency>
``` 
The example will include a module built for lift 3.3.x. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.fobo 
  :
fobo.Resource.init = fobo.Resource.BootstrapXXX 
```
### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.{fobobsres => fobo}
  :
fobo.Resource.init = fobo.Resource.BootstrapXXX 
```
### Lift FoBo Template hooks
```html
<link href='/classpath/fobo/bootstrap.css' rel="stylesheet" type='text/css'>  
  :
<link href='[path/to/you/app/specific/css/file/in/the/webapp/dir]' rel="stylesheet" type='text/css'>
  :
  :
<script src="/classpath/fobo/bootstrap.js" type="text/javascript"></script>
```
Here the resources starting with /classpath/fobo/ is the ones provided by the FoBo module. 
The FoBo js and css files will, without any name change, be served debug-able in development and minimized otherwise. 

### More information

For more information on how to use Twitter Bootstrap in the FoBo module see the [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo).
For more information on how to use Twitter Bootstrap see [Twitter Bootstrap](http://twitter.github.com/bootstrap/)

## Contributions

Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

