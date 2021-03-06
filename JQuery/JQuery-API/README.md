# FoBo JQuery API Module

This FoBo API module provides the FoBo/Lift API components to the FoBo JQuery Toolkit Module, 
but can also be used as-is, see below for setup information. 

## Integration into your project 

### Dependency settings

Example setup:

**SBT:**
```scala
"net.liftmodules" %% "fobo-jquery-api_3.3" % "2.1.0"
```
**Maven:**
```xml
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-jquery-api_3.3_2.12.7</artifactId>
  <version>2.1.0</version>
</dependency>
```
The example will include a module built for lift 3.3.x. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.{fobojqapi => fobo} 
  :
fobo.API.init = fobo.API.JQueryX
```    
### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.fobo 
  :
fobo.API.init = fobo.API.JQueryX
```    
## Contributions

Improvements, contributions and suggestions are welcome! 
Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). 
You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 
