# FoBo-Google-Code-Prettify API Module

This FoBo API module provides FoBo/Lift API components to the FoBo Google-Code-Prettify Toolkit Module, 
but can also be used as-is, see below for setup information.

## Integration into your project 

### Dependancy settings

**SBT:**
```scala
"net.liftmodules" %% "fobo-google-code-prettify-api_3.1 % "2.0"
```
**Maven:**
```xml  
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-google-code-prettify-api_3.1_2.12.2</artifactId>
  <version>2.0</version>
</dependency>
```
The example will include a module built for lift 3.1.x. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.{fobogcpapi => fobo} 
  :
FoBo.API.Init=FoBo.API.PrettifyX 
```   

### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.FoBo 
  :
FoBo.API.Init=FoBo.API.PrettifyX 
```
## Contributions

Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). 
You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

