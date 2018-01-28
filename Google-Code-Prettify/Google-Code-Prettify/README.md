# FoBo Google Code Prettify Toolkit Module

This FoBo toolkit module provides Google-Code-Prettify to the FoBo / FoBo Module, 
but can also be used as-is, see below for setup information. 

## Components and available versions 

- Google Code Prettify [vJun2011] - [google-code-prettify](https://github.com/google/code-prettify/)

## Integration into your project 

### Dependancy settings

**SBT:**
```scala
"net.liftmodules" %% "fobo-google-code-prettify_3.1 % "2.0"
```
**Maven:**
```xml      
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-google-code-prettify_3.1_2.12.2</artifactId>
  <version>2.0</version>
</dependency>
```
The example will include a module built for lift 3.1.x. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.{fobogcp => fobo}
  :
fobo.Toolkit.init = fobo.Toolkit.PrettifyMMYYYY 
```
### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.fobo 
  :
fobo.Toolkit.init = fobo.Toolkit.PrettifyMMYYYY 
```    
### Lift FoBo Template hooks
```html
<link rel="stylesheet" type="text/css" href="/classpath/fobo/prettify.css">

<script src="/classpath/fobo/prettify.js" type="text/javascript"></script>
//for example scala code style 
<script src="/classpath/fobo/lang-scala.js" type="text/javascript"></script>
```
Available lang-xxx.js is xxx=[apollo,clj,css,go,hs,listp,lua,ml,n,proto,scala,sql,tex,vb,vhdl,wiki,xq,yaml]

For more information on how to use Google-Code-Prettify see [Google-Code-Prettify](http://code.google.com/p/google-code-prettify/)

## Contributions

Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 



