# FoBo AngularJS Resource Module

This resource module provides AngularJS resource components to the FoBo AngularJS Toolkit module, 
but can also be used as-is, see below for setup information.

## Core modules 

- AngularJS core [v1.0.6, v1.2.11, v1.3.15, v1.4.1, v1.4.8, v1.5.3]

## Components

- Angular UI Bootstrap [v0.2.0, v0.7.0, v0.10.0]
- Angular NG-Grid [v2.0.4, v2.0.7]
- Angular UI-Grid [v3.0.7]
- Angular Material Design [v0.10.0, v1.0.1, v1.0.8]

### Lift FoBo boot hooks (when used in the FoBo module)

```scala
import net.liftmodules.FoBo 
  :
FoBo.Resouce.Init=FoBo.Resouce.AngularJS153        //access to v1.5.3 core files 
FoBo.Resouce.Init=FoBo.Resouce.AngularJS153i18n    //access to angular i18n files 
FoBo.Resouce.Init=FoBo.Resouce.AJSUIBootstrap0100  //Angular UI Bootstrap
FoBo.Resouce.Init=FoBo.Resouce.AJSMaterial108      //Angular Material
FoBo.Resouce.Init=FoBo.Resouce.AJSUIGrid307        //Angular UI-Grid
FoBo.Resouce.Init=FoBo.Resouce.AJSNGGrid207        //Angular NG-Grid
```
### Lift FoBo boot hooks (when used as stand alone module)

Using a import alias
```scala
    import net.liftmodules.{FoBoAJSRes => FoBo} 
    :
    FoBo.... //same as above
```
or 
```scala
    import net.liftmodules.FoBoAJSRes 
    :
    FoBoAJSRes.Resouce.Init=FoBoAJSRes.Resouce.AngularJS121      //access to core files
    : 
```
    
### Lift FoBo Template hooks

See [FoBo AngularJS Toolkit Module](https://github.com/karma4u101/Angular/AngularJS)

### Dependency settings

**SBT:**
Put the following in your project build.sbt files lift libraryDependencies section 
```scala
"net.liftmodules" %% "moduleName_x1.y1 % "x2.y2[.z2][-SNAPSHOT/rcx/mx]"
```
**Maven:** Put the following in the dependency section of your pom.
```xml
    <dependency>
      <groupId>net.liftmodules</groupId>
      <artifactId>moduleName_x1.y1_a.b.c</artifactId>
      <version>x2.y2[.z2][-SNAPSHOT/rcx/mx]</version>
    </dependency>
```
Where x1.y1 is Lift major and minor version numbers and a.b.c is Scala
version number and x2.y2.[z2] is the module's major x2, minor y2 and
eventual incremental numbers z2 followed by a eventual SNAPSHOT 
release candidate (rcX) or milestone (mX) version part.

For example (when using this module as a separete stand alone module outside of FoBo):

**SBT:**
```scala
    "net.liftmodules" %% "fobo-angularjs-res_3.0 % "1.6"
```
**Maven:**
```xml
    <dependency>
      <groupId>net.liftmodules</groupId>
      <artifactId>fobo-angularjs-res_3.0_2.10.4</artifactId>
      <version>1.6</version>
    </dependency>
```
The example will include a module built for lift 3.0.x. 
If you are using maven observe that the artifact id also needs the Scala version.

## Contributions
Improvements, contributions and suggestions are welcome! Clone the project and start working on a PR. You can also leave a issue report 
or drop a question/suggestion to the [Lift's mailing list](http://groups.google.com/group/liftweb/) 
