# FoBo Highlight Toolkit Module

This FoBo toolkit module provides Highlight JS to the FoBo / FoBo Module, 
but can also be used as-is, see below for setup information. 

## Components and available versions 

- FoBo-Highlight [v9.3.0] - [highlight.js](https://highlightjs.org/) 

## Integration into your project 

### Dependency settings

Example setup:

**SBT:**
```scala
"net.liftmodules" %% "fobo-highlightjs_3.3" % "2.1.0"
```
**Maven:**
```xml
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo-highlightjs_3.3_2.12.7</artifactId>
  <version>2.1.0</version>
</dependency>
```
The example will include a module built for lift 3.3.x. 
If you are using maven observe that the artifact id also needs the Scala version.

### Lift FoBo boot hooks (when used as stand alone module)
```scala
import net.liftmodules.{fobohl => fobo}
  :
fobo.Toolkit.init = fobo.Toolkit.HighlightJSXYZ    
```
### Lift FoBo boot hooks (when used in the FoBo module)
```scala
import net.liftmodules.fobo 
  :
fobo.Toolkit.init = fobo.Toolkit.HighlightJSXYZ 
```
### Lift FoBo Template hooks

```html
<link rel="stylesheet" type="text/css" href="/classpath/fobo/higlight/default.css">
<script src="/classpath/fobo/highlight/highlight.pack.js" type="text/javascript"></script>
<!-- Lift 3.x only. This will add the highlight initiation to the onload section of lifts page script-->
<script data-lift="FoBo.HLJS.initHighlightingOnLoad"></script>
```

Css styles files

- agate.css [v9.3.0]
- androidstudio.css [v9.3.0]
- arduino-light.css [v9.3.0]
- arta.css [v9.3.0]
- ascetic.css [v9.3.0]
- atelier-cave-dark.css, atelier-cave-light.css [v9.3.0]
- atelier-dune-dark.css, atelier-dune-light.css [v9.3.0]
- atelier-estuary-dark.css, atelier-estuary-light.css [v9.3.0]
- atelier-forest-dark.css, atelier-forest-light.css [v9.3.0]
- atelier-heath-dark.css, atelier-heath-light.css [v9.3.0]
- atelier-lakeside-dark.css, atelier-lakeside-light.css [v9.3.0]
- atelier-plateau-dark.css, atelier-plateau-light.css [v9.3.0]
- atelier-savanna-dark.css, atelier-savanna-light.css [v9.3.0]
- atelier-seaside-dark.css, atelier-seaside-light.css [v9.3.0]
- atelier-sulphurpool-dark.css, atelier-sulphurpool-light.css [v9.3.0]
- brown-paper.css [v9.3.0]
- codepen-embed.css [v9.3.0]
- color-brewer.css [v9.3.0]
- dark.css [v9.3.0]
- darkula.css [v9.3.0]
- default.css [v9.3.0]
- docco.css [v9.3.0]
- dracula.css [v9.3.0]
- far.css [v9.3.0]
- foundation.css [v9.3.0]
- github.css [v9.3.0]
- github-gist.css [v9.3.0]
- googlecode.css [v9.3.0]
- grayscale.css [v9.3.0]
- gruvbox-dark.css, gruvbox-light.css [v9.3.0]
- hopscotch.css [v9.3.0]
- hybrid.css [v9.3.0]
- idea.css [v9.3.0]
- ir-black.css [v9.3.0]
- kimbie.dark.css, kimbie.light.css [v9.3.0]
- magula.css [v9.3.0]
- mono-blue.css [v9.3.0]
- monokai.css [v9.3.0]
- monokai-sublime.css [v9.3.0]
- obsidian.css [v9.3.0]
- paraiso-dark.css, paraiso-light.css [v9.3.0]
- pojoaque.css [v9.3.0]
- qtcreator_dark.css, qtcreator_light.css [v9.3.0]
- railscasts.css [v9.3.0]
- rainbow.css [v9.3.0]
- school-book.css [v9.3.0]
- solarized-dark.css, solarized-light.css [v9.3.0]
- sunburst.css [v9.3.0]
- tomorrow.css, tomorrow-night-blue.css, tomorrow-night-bright.css, tomorrow-night.css, tomorrow-night-eighties.css [v9.3.0]
- vs.css [v9.3.0]
- xcode.css [v9.3.0]
- xt256.css [v9.3.0]
- zenburn.css [v9.3.0]

Script files

- highlight.pack.js [v9.3.0]

Supported languages

- Apache [v9.3.0]
- Bash [v9.3.0]
- C# [v9.3.0]
- C++ [v9.3.0]
- CSS [v9.3.0]
- CoffeeScript [v9.3.0]
- Diff [v9.3.0]
- HTML, XML [v9.3.0]
- HTTP [v9.3.0]
- Ini [v9.3.0]
- JSON [v9.3.0]
- Java [v9.3.0]
- JavaScript [v9.3.0]
- Makefile [v9.3.0]
- Markdown [v9.3.0]
- Nginx [v9.3.0]
- Objective-C [v9.3.0]
- PHP [v9.3.0]
- Perl [v9.3.0]
- Python [v9.3.0]
- Ruby [v9.3.0]
- Scala [v9.3.0]
- SQL [v9.3.0]


For more information on how to use Highlight see [higlight.js](https://highlightjs.org/)


## Contributions

Improvements, contributions and suggestions are welcome! 
Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). 
You can also leave a issue report or drop a question/suggestion on [Lift's mailing list](http://groups.google.com/group/liftweb/) 
