# FoBo Pace API Module

This FoBo API module provides FoBo/Lift API components for the Pace Toolkit Module, 
but can also be used as-is, see below for setup information. 

## Integration into your project 

### Dependancy settings

Example setup:

**SBT:**
```scala
"net.liftmodules" %% "fobo-pace-api_3.0 % "1.6"
```
**Maven:**
```xml
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-pace-api_3.0_2.11.7</artifactId>
  <version>1.6</version>
</dependency>
```
The example will include a module built for lift 3.0.x. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.{FoBoPaAPI => FoBo}
  :
FoBo.API.Init=FoBo.API.PaceX    
```
### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.FoBo 
  :
FoBo.API.Init=FoBo.API.PaceX
```
## Contributions

Improvements, contributions and suggestions are welcome! 
Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). 
You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 




