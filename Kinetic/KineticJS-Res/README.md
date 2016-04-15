# FoBo KineticJS Resource Module

This module provides KineticJS resouces to the KineticJS Toolkit module, 
but can also be used as-is see below for setup information. 

## Components and available versions

- FoBo-Kinetic [v5.1.0] - [Kinetic](http://kineticjs.com/) 

## Integration into your project 

### Dependancy settings

Example setup:

**SBT:**
```scala
"net.liftmodules" %% "fobo-kineticjs-res_3.0 % "1.6"
```
**Maven:**
```xml
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-kineticjs-res_3.0_2.11.7</artifactId>
  <version>1.6</version>
</dependency>
```
The example will include a module built for lift 3.0.x. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.{FoBoKiRes => FoBo}
  :
FoBo.Resource.Init=FoBo.Resource.KineticJSXYZ 
```
### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.FoBo 
  :
FoBo.Resource.Init=FoBo.Resource.KineticJSXYZ 
```
### Lift FoBo Template hooks
```html
<script src="/classpath/fobo/kinetic.js" type="text/javascript"></script>
```
Css files

- None

Script files

- kinetic.js [v5.1.0]

For more information on how to use KineticJS see [KineticJS](http://kineticjs.com/)

## Contributions

Improvements, contributions and suggestions are welcome! 
Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). 
You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

