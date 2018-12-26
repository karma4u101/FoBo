# FoBo / FoBo API Module

Except from providing som FoBo build info snippet functions the FoBo / FoBo API module brings a resouce injection snippet function.
For more information on resouce injection provided by the FoBo / FoBo API module see
[FoBo Scala doc](http://www.media4u101.se/fobo-lift-template-demo/foboapi/index.html#net.liftmodules.FoBo.snippet.FoBo.Resources)

FoBo / FoBo API provides generic resouce injection functionality but resource injection is also provided by other FoBo API modules.

## Integration into your project 

```scala
import net.liftmodules.fobo
  :
fobo.API.init = fobo.API.FoBo1 
``` 
### Dependency settings 
 
**OBS!** The setup shown below is only needed if used separatly from the FoBo / FoBo module and most likely not 
even then if you are using some of FoBo's other API modules. See the Scala doc for alternatives.

Setup example:

**SBT:**
```scala
"net.liftmodules" %% "fobo-api_3.3" % "2.1.0"
```
**Maven:**
```xml      
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-angularjs-api_3.3_2.12.7</artifactId>
  <version>2.1.0</version>
</dependency>
```
The example will include a module built for lift 3.3.x. 
If you are using maven observe that the artifact id also needs the Scala version.
