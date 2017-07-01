# FoBo Popper Toolkit Module

This FoBo toolkit module provides Popper to the FoBo / FoBo Module, 
but can also be used as-is, see below for setup information. 

## Components and available versions

- FoBo-Popper [v1.9.9] - [Popper](https://popper.js.org/) 

## Integration into your project 

### Dependency settings

Example setup:

**SBT:**
```scala
"net.liftmodules" %% "fobo-popper_3.1 % "2.0"
```
**Maven:**
```xml
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-popper_3.1_2.12.1</artifactId>
  <version>2.0</version>
</dependency>
```
The example will include a module built for lift 3.1.x. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.{FoBoPop => FoBo}
  :
FoBo.Toolkit.Init=FoBo.Toolkit.PopperXYZ 
```
### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.FoBo
  :
FoBo.Toolkit.Init=FoBo.Toolkit.PopperXYZ 
```
### Lift FoBo Template hooks
```html
<script src="/classpath/fobo/popper.js" type="text/javascript"></script>
```

Script files

- popper.js [v1.9.9]
- popper-utils.js [v1.9.9]
- popper-map.js [v1.9.9]

For more information on how to use Popper see [Popper](https://popper.js.org/)

FoBo 
## Contributions

Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 



