# FoBo Tether Toolkit Module

This FoBo toolkit module provides Tether to the FoBo / FoBo Module, 
but can also be used as-is, see below for setup information. 

## Components and available versions

- FoBo-Tether [v1.4.0] - [Tether](http://tether.io/) 

## Integration into your project 

### Dependency settings

Example setup:

**SBT:**
```scala
"net.liftmodules" %% "fobo-tether_3.0 % "2.0"
```
**Maven:**
```xml
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-tether_3.0_2.12.1</artifactId>
  <version>2.0</version>
</dependency>
```
The example will include a module built for lift 3.0.x. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.{FoBoTet => FoBo}
  :
FoBo.Toolkit.Init=FoBo.Toolkit.TetherXYZ 
```
### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.FoBo 
  :
FoBo.Toolkit.Init=FoBo.Toolkit.TetherXYZ 
```
### Lift FoBo Template hooks
```html
<script src="/classpath/fobo/tether.js" type="text/javascript"></script>
```
Css files

- tether.css [v1.4.0]
- tether-theme-arrows.css [v1.4.0]
- tether-theme-arrows-dark.css [v1.4.0]
- tether-theme-basic.css [v1.4.0]

Script files

- tether.js [v1.4.0]

For more information on how to use Tether see [Tether](http://tether.io/)

## Contributions

Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

## Update log

**Latest Update:**
- **2017-02-19** -- Added Tether v1.4.0.



