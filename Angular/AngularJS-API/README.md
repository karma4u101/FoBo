# FoBo AngularJS API Module

This FoBo API module provides FoBo/Lift API components for the AngularJS Toolkit Module, 
but can also be used as-is, see below for setup information.

## Integration into your project 

### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.fobo 
  :
fobo.API.init=fobo.API.AngularJS1 
```    
### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.{foboajsapi => fobo}
  :
fobo.API.init=fobo.API.AngularJS1 
```     
### Dependency settings

Setup example:

**SBT:**
```scala
"net.liftmodules" %% "fobo-angularjs-api_3.3" % "2.1.0"
```
**Maven:**
```xml      
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-angularjs-api_3.3_2.12.7</artifactId>
  <version>2.0</version>
</dependency>
```
The example will include a module built for lift 3.3.x. 
If you are using maven observe that the artifact id also needs the Scala version.

For more information on the AngularJS API module see [FoBo AngularJS Toolkit Module](https://github.com/karma4u101/Angular/AngularJS).

## Contributions
Improvements, contributions and suggestions are welcome! Clone the project and start working on a PR. You can also leave a issue report or drop a question/suggestion to the [Lift's mailing list](http://groups.google.com/group/liftweb/) 

