# FoBo Tooltip Toolkit Module

This FoBo toolkit module provides Tooltip (backed by Popper) to the FoBo / FoBo Module, 
but can also be used as-is, see below for setup information. 

## Components and available versions

- FoBo-Tooltip [v1.1.4] - [Tooltip](https://popper.js.org/) 

## Integration into your project 

### Dependency settings

Example setup:

**SBT:**
```scala
"net.liftmodules" %% "fobo-tooltip_3.3" % "2.1.0"
```
**Maven:**
```xml
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-tooltip_3.3_2.12.7</artifactId>
  <version>2.1.0</version>
</dependency>
```
The example will include a module built for lift 3.3.x. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.{fobotoo => fobo}
  :
fobo.Toolkit.init = fobo.Toolkit.TooltipXYZ 
```
### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.fobo 
  :
fobo.Toolkit.init = fobo.Toolkit.TooltipXYZ 
```
### Lift FoBo Template hooks
```html
<script src="/classpath/fobo/tooltip.js" type="text/javascript"></script>
```
Script files

- tooltip.js [v1.1.4]
- tooltip-map.js [v1.1.4]

For more information on how to use Tooltip see [Tooltip](https://popper.js.org/)

## Contributions

Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 
