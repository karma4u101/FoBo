FoBo - Lift Front-End Toolkit Module
====================================

This external/optional Lift module is a love, peace and harmony mix of the [Twitter Bootstrap](http://twitter.github.com/bootstrap/) 
and the [ZURB/Foundation](http://foundation.zurb.com/) toolkits.  

A **live demo** of the use of this demo can be [seen here](http://www.media4u101.se/fobo-lift-template-demo/) and the github repo for 
the lift basic template (demo) using this module can be found [here](https://github.com/karma4u101/FoBo-Lift-Template).

If you do not need the mix of both the toolkits it is also easy to set up this module for use with either of the toolkits separately.    

Lift comes by default, at this writing, bundled with [blueprint](http://blueprintcss.org/) as hooked up CSS toolkit, with this module 
you can replace blueprint with a awesome combination of two cutting edge front-end toolkits that will jazz up your Lift applications 
with a concert mix of the twitter bootstrap:s front-end toolkit brilliance and the rock & roll solid reactive, mobile scalable 
zurb/foundation front-end framework.

The preferred way to work with these toolkits is to leave there files untouched and use application specific css/js files for application 
specific tweaks and overrides, so apart from the benefits outlined above, by using this module you will get a clean separation of the static 
toolkit files and your application specific resources as the module dose not cluttering your applications webapp resources directory. 

After many years of Java EE development I started look at Scala/Lift in May 2011 so there may be some none "best practice" stuff in there 
and if you find something you think could be done in a more Scala/Lift fashion please let me know.

Improvements, contributions and suggestions are welcome! Leave a issue report or drop a question/suggestion to my priv. e-mail or on 
[Lift's mailing list](http://groups.google.com/group/liftweb/) 

best regards 
Peter Petersson     

Toolkit and Module Versions
---------------------------

Current module version: 0.2.2-SNAPSHOT

This module includes the following toolkits and selectable versions.

* FoBo version 0.1 (comprised of foundation 2.1.4,bootstrap 1.4.0,orbit 1.3.0)
* Bootstrap version 1.4.0
* Foundation version 2.1.4
* jquery version [1.6.4, 1.7.1]
    
Quick Start
-----------
The only prerequisites for this Lift module is that you have Git and Java installed and configured on the target 
computer, a suitable Lift template project will also come in handy.
You don't need to use it but this project also includes a Eclipse plug-in for browsing the code, see the Scala 
IDE section below.   


### Get the code

	git clone git@github.com:karma4u101/FoBo.git
	cd FoBo

### Update, package & install 

There is also a sbt.bat for windows users.

	./sbt clean update compile package publish-local

The module should now be in your local ivy repository and available for your local projects	

Integration into your project 
-------------------------------

### Dependancy 
	
Put the following in your project build.sbt files lift libraryDependencies section 

    "net.liftmodules" %% "fobo" % (liftVersion+"-[module version]")
	
now do a sbt clean update .....
	
### Bootstrap hook 

Put the following into your lift Boot

    net.liftmodules.FoBo.FoBo.init()  

### Template hooks

Put something like the following in your Lift templat(s) head section 	
 	
    <link rel="stylesheet" type='text/css' href='/classpath/fobo/css/fobo-[fobo version].css'> 	
    <link rel="stylesheet" type='text/css' href='[path/to/you/app/specific/css/file/in/the/webapp/dir]'>
    <script type="text/javascript" src="/classpath/fobo/js/jquery-[jquery version].js"></script>
Using the included bootstrap scripts, place them at the bottom of the body section

    <script type="text/javascript" src="/classpath/fobo/js/bootstrap-twipsy-[bootstrap version].js"></script>
    <script type="text/javascript" src="/classpath/fobo/js/bootstrap-dropdown-[bootstrap version].js"></script> 
    <script type="text/javascript" src="/classpath/fobo/js/bootstrap-popover-[bootstrap version].js"></script>
    <script type="text/javascript" src="/classpath/fobo/js/bootstrap-scrollspy-[bootstrap version].js"></script> 
    
Alternatively if you like to use only the bootstrap or foundation toolkit use

    <link rel="stylesheet" type='text/css' href='/classpath/fobo/orgin/css/bootstrap-[bootstrap version].css'/>
    or
    <link rel="stylesheet" type='text/css' href='/classpath/fobo/orgin/css/foundation-[foundation version].css'/>    
    
### FoBo front-end toolkits documentation ###

The [ZURB/Foundation](http://foundation.zurb.com/) and the [Twitter Bootstrap](http://twitter.github.com/bootstrap/) 
links contains plenty of documentation so that will be your no.1 resources. I am planing to make a fobo-base template 
project, however in the mean time here is a couple of tips for you to make the most of the FoBo (Foundation/Bootstrap) 
mix.

    1) The only place for using bootstraps container class (bo-container) would be in the topbar structure.
    2) Make use of foundations reactive fluid mobile scalable grid system in favor for bootstrap grids. 

Authors
-------
This FoBo Lift module were written by [Peter Petersson](http://www.media4u101.se). The Lift Module conventions were 
developed by the [Lift community](http://groups.google.com/group/liftweb/).

Scala IDE for Eclipse
---------------------
Sbteclipse provides SBT command to create Eclipse project files

1) Usage

	project$ ./sbt
	> eclipse 

2) In eclipse do: 

	File ==> Import...
	Select General ==> Existing Project into Workspace 
	Use "Brows" to look up the project root ....


User powered Lift module 
========================
**(*)** This is a _unofficial_ user powered Lift module which means it is a work based on the 
sound foundation of Lift and done by a developer who uses Lift for development ;), sharing it with others.

