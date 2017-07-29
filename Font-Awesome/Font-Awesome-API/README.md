# FoBo-Font-Awesome API Module

This FoBo API module provides FoBo/Lift API components to the FoBo Font Awesome Toolkit Module, 
but can also be used as-is, see below for setup information.

## Integration into your project 

### Dependency settings

Example setup:

**SBT:**
```scala
"net.liftmodules" %% "fobo-font-awesome-api_3.1 % "2.0"
```
**Maven:**
```xml
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-font-awesome_3.1_2.12.2</artifactId>
  <version>2.0</version>
</dependency>
```
The example will include a module built for lift 3.1.x. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.{fobofaapi => fobo}
  :
fobo.API.init = fobo.API.FontAwesomeX 
```
### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.fobo 
  :
fobo.API.init = fobo.API.FontAwesomeX 
```
Contributions
------
Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

