# FoBo / FoBo Module

Using and depending on the FoBo / FoBo module will make all FoBo's Toolkit, Resource and API modules available 
for initiation in your Lift application. 

This is the easiest way to get started with using FoBo and if you do not have application size constraints there 
is no drawbacks from keep using but if you for some reason late decide you would like a smaller footprint it is 
trivial to change and start to instead use one or more of FoBo's Toolkit, Resource or API modules. 
To get a smaller footprint the alternative is to depend on and use exactly the FoBo Toolkit, Resource and or API 
modules your application needs, how to do this and what eventual changes needs to be made in our dependency and 
application setup is described in the respective modules readme. 

For more information on what FoBo is and what it brings to your project see [the main readme](https://github.com/karma4u101/FoBo/blob/master/README.md).

## Integration into your project 

### Dependency settings

Example setup:

**SBT:**
```scala
"net.liftmodules" %% "fobo_3.1 % "2.0"
```
**Maven:**
```xml
<dependency>
  <groupId>net.liftmodules</groupId>
  <artifactId>fobo_3.1_2.12.2</artifactId>
  <version>2.0</version>
</dependency>
```
The example will include the FoBo module built for lift 3.1.x. 
If you are using maven observe that the artifact id also needs the Scala version.


