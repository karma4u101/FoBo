# FoBo Twitter Bootstrap API Module

This FoBo API module provides FoBo/Lift API components for the Twitter Bootstrap v2.x Toolkit Module, 
but can also be used as-is, see below for setup information.
 
## Integration into your project 

### Dependency settings 

Example setup:

**SBT:**
```scala
"net.liftmodules" %% "fobo-twitter-bootstrap-api_3.0 % "1.6"
```    
**Maven:**
```xml
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-twitter-bootstrap-api_3.0_2.11.7</artifactId>
  <version>1.6</version>
</dependency>
``` 
The example will include the Bootstrap2 Lift/FoBo API module built for Lift 3.0. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.FoBo 
  :
FoBo.API.Init=FoBo.API.Bootstrap2 
```
### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.{FoBoTBAPI => FoBo} 
  :
FoBo.API.Init=FoBo.API.Bootstrap2 
```
### More information

For more information on how to use Twitter Bootstrap see [Twitter Bootstrap](http://twitter.github.com/bootstrap/)
For more information on the Twitter Bootstrap v2.x module see [FoBo Twitter Bootstrap v2.x Toolkit Module](https://github.com/karma4u101/Bootstrap/Bootstrap2/Twitter-Bootstrap).
For more information on how to use Twitter Bootstrap in the FoBo module see the [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo).

## Contributions

Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

