# FoBo Font Awesome Toolkit Module

This FoBo toolkit module provides Font Awesome to the FoBo / FoBo Module, 
but can also be used as-is, see below for setup information. 

## Components and available versions 

- Font Awesome [v3.2.1, v4.0.3, v4.1.0, v4.3.0, v4.6.3, v5.5.0] - [Font Awesome](http://fortawesome.github.com/Font-Awesome/)

## Integration into your project 

### Dependency settings

Example setup:

**SBT:**
```scala
"net.liftmodules" %% "fobo-font-awesome_3.3" % "2.1.0"
```
**Maven:**
```xml
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-font-awesome_3.3_2.12.7</artifactId>
  <version>2.1.0</version>
</dependency>
```
The example will include a module built for lift 3.3.x. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.{fobofa => fobo}
  :
fobo.Toolkit.init = fobo.Toolkit.FontAwesomeXYZ 
```
### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.fobo 
  :
fobo.Toolkit.init = fobo.Toolkit.FontAwesomeXYZ 
```
### Lift FoBo Template hooks
#### FoBo >= v2.1 and FontAwesome >= 5.5.0
FoBo >= v2.1 adds */font-awesome/* to the fobo classpath to avoid future name clashes with other FoBo included resources.
```html
<link rel="stylesheet" type='text/css' href='/classpath/fobo/font-awesome/all.css'>
<link rel="stylesheet" type='text/css' href='[path/to/you/app/specific/css/file/in/the/webapp/dir]'>

<script src="/classpath/fobo/font-awesome/all.js"></script>
```
##### Available css files are 
  - [solid.css, regular.css, brands.css, all.css, fontawesome.css]

##### Available js files are 
  - [solid.js, regular.js, brands.js, all.js, fontawesome.js]

For more information on how to use the font awesome fonts see [Font Awesome](http://fortawesome.github.com/Font-Awesome/)

### FoBo < v2.1 
```html
<link rel="stylesheet" type='text/css' href='/classpath/fobo/font-awesome.css'> 
<link rel="stylesheet" type='text/css' href='[path/to/you/app/specific/css/file/in/the/webapp/dir]'>
```
For more information on how to use the font awesome fonts see [Font Awesome](http://fortawesome.github.com/Font-Awesome/)

## Contributions

Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). 
You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 


