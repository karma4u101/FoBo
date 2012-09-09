FoBo - Generic Front-End Toolkit Module for Lift
================================================

With this external/optional Lift module you can chose among some of the industry leading web-centric open source front-end 
toolkits. The module is simultaneously supporting several versions of the included toolkits, making maintenance, upgrade and 
fall-back quick and easy (typically a one liner change in lift boot) and will ultimately jazz up your Lift applications with the toolkit(s) of 
your choice.    

Another benefit of using this module is the small but growing API that includes helper object:s and snippet:s (see API documents for usage) 
that will take care of some common toolkit and component initiation, script generation and more. 
At this writing the helpers are few but as the module mature it will provide plenty of useful help functions see the demo for a teaser and potential. 
If you have ideas and suggestions let me know! contact me or add a issue and/or contribute a patch.      

A third benefit of using this module is that you will get a clean separation of the toolkit files and your application specific resources as 
the module dose not cluttering your applications webapp resources directory. 

A **live demo** of the use of this module including API documentation can be [seen here](http://www.media4u101.se/fobo-lift-template-demo/) 
and the Github repository for the demo can be found [here](https://github.com/karma4u101/FoBo-Lift-Template).
A Lift basic template with FoBo setup for bootstrap usage can be found here [Templating With Twitter Bootstrap](https://github.com/karma4u101/Templating-With-Twitter-Bootstrap)  

Improvements, contributions and suggestions are welcome! Leave a issue report or drop a question/suggestion to my priv. e-mail or on 
[Lift's mailing list](http://groups.google.com/group/liftweb/) 

best regards 
Peter Petersson     

Toolkit:s and available versions
--------------------------------

Current snapshot module version: 0.7.2-SNAPSHOT

This module includes the following toolkits versions

- Bootstrap [v1.4.0, v2.0.0, v2.0.4, v2.1.0] - [Twitter Bootstrap](http://twitter.github.com/bootstrap/)
- Foundation [v2.1.4, v2.1.5] - [ZURB/Foundation](http://foundation.zurb.com/)
- DataTables [v1.9.0] - [DataTables.net](http://datatables.net/)
- JQuery Mobile [v1.0.1, v1.1.0] - [JQuery Mobile](http://jquerymobile.com/)
- JQuery  [v1.6.4, v1.7.1, v1.7.2] - [JQuery](http://jquery.com/)
- Google Code Prettify [vJun2011] - [google-code-prettify](http://code.google.com/p/google-code-prettify/)
- Knockout JS [v2.0.0, v2.1.0] - [Knockout](http://knockoutjs.com/)
- FoBo v0.2 (comprised of foundation v2.1.5,bootstrap v2.0.0,orbit v1.4.0)
- FoBo v0.1 (comprised of foundation v2.1.4,bootstrap v1.4.0,orbit v1.3.0)

Module names that can bee used in boot corresponding to the toolkit version above is

- Bootstrap140, Bootstrap200, Bootstrap204, Bootstrap210 
- Foundation214, Foundation215
- DataTables190
- JQueryMobile101 JQueryMobile101
- FoBo.JQuery164, FoBo.JQuery171, FoBo.JQuery172 
- JQueryModule.JQuery172 (A alt. jquery-module setup for FoBo is to use the [lift-jquery-module](https://github.com/karma4u101/lift-jquery-module))
- PrettifyJun2011
- Knockout200, Knockout210
- FoBo010, FoBo020

For more information on how to set this up see below. 
    
Quick Start
-----------
The only prerequisites for this Lift module is that you have Git and Java installed and configured on the target 
computer, a suitable Lift template project will also come in handy if you like you can use [Templating-With-Twitter-Bootstrap](https://github.com/karma4u101/Templating-With-Twitter-Bootstrap) it comes with a FoBo setup. 
You don't need to use it but this project also includes a Eclipse plug-in for browsing the code, see the Scala 
IDE section below.   


### Get the code

	git clone git://github.com/karma4u101/FoBo.git
	cd FoBo

### Cmd-line update, package & publish-local (with optional override of liftVersion)  

There is also a sbt*.bat for windows users.

    ./sbt-publish-local
     or 
    ./sbt clean update compile package publish-local
     or override default lift version (currently 2.4) like this
    ./sbt "set liftVersion:=\"2.5-SNAPSHOT\"" clean update less compile package publish-local

The module should now be in your local ivy repository and available for your local projects	

If you like to **customize your FoBo bootstrap css files** you can tweak the overrides/variables.less file in the FoBo-Less project. 
Just less compile it and copy the resulting files over to FoBo.


Integration into your project 
-------------------------------

### Dependancy 
	
Add the following resolver or clone the project and do a local-publish (tweaks, suggestions and contributions are welcome) 

    resolvers += "Media4u101 SNAPSHOT Repository" at "http://www.media4u101.se:8081/nexus/content/repositories/snapshots/"
    alt.
    resolvers += "Media4u101 Repository" at "http://www.media4u101.se:8081/nexus/content/repositories/releases/"    

Put the following in your project build.sbt files lift libraryDependencies section 

    "net.liftmodules" %% "fobo" % (liftVersion+"-[module version]")
	
now do a sbt clean update .....
	
### Lift FoBo boot hooks 

Put the following into your lift Boot

    import net.liftmodules.FoBo
    
    //If using defaults FoBo init params can be omitted
    FoBo.InitParam.JQuery=FoBo.[JQueryXX module option name]  
    FoBo.InitParam.ToolKit=FoBo.[ToolkitXXX module option name]
    FoBo.InitParam.ToolKit=FoBo.[ev. additional/extra toolkit module name]
       :
    FoBo.init()  

### Lift FoBo Template hooks

Put something like the following in your Lift templat(s) head section (see below for available names)	
 	
    <link rel="stylesheet" type='text/css' href='/classpath/fobo/[css file name]'> 	
    <link rel="stylesheet" type='text/css' href='[path/to/you/app/specific/css/file/in/the/webapp/dir]'>
    <script type="text/javascript" src="/classpath/fobo/[script file name]"></script>
    
Available CSS and JavaScript files 
----------------------------------

The following is a list of **css file** and **script file**-name:s available in each toolkit for used as 
[script/css file name] -hooks in your Lift templates. 

###Bootstrap Toolkit

FoBo.InitParam.ToolKit=FoBo.BootstrapXXX

Base css file

- bootstrap.css (all versions)

Extra css files

- bootstrap-responsive.css (all versions except v1.4.0)

All in one Script

- bootstrap.js (all versions)

Alternative separate script files (not supported in v2.0.4)

- bootstrap-affix.js (v2.1.0+)
- bootstrap-alerts.js (v1.4.0+)
- bootstrap-buttons.js (v1.4.0+)
- bootstrap-carousel.js (v2.0.0+)
- bootstrap-collapse.js (v2.0.0+)
- bootstrap-dropdown.js (v1.4.0+)
- bootstrap-modal.js (v1.4.0+)
- bootstrap-popover.js (v1.4.0+)
- bootstrap-scrollspy.js (v1.4.0+)
- bootstrap-tabs.js (v1.4.0+)
- bootstrap-tab.js (v2.0.0+)
- bootstrap-twipsy.js (v1.4.0+)
- bootstrap-tooltip.js (v2.0.0+)
- bootstrap-transition.js (v2.0.0+)
- bootstrap-typeahead.js (v2.0.0+)

###Foundation Toolkit

FoBo.InitParam.ToolKit=FoBo.FoundationXXX

Base css file

- foundation.css

Extra css files

- foundation-ie.css 
- orbit.css

Script files

- foundation.js
- modernizr.foundation.js (only in 2.1.5)
- orbit.js
    
###JQuery Mobile Toolkit

FoBo.InitParam.ToolKit=FoBo.JQueryMobileXXX

Css files

- jquery.mobile.css
- jquery.mobile.structure.css
- jquery.mobile.theme.css (only in 1.1.0)

Script files

- jquery.mobile.js
- jquery.mobile.themeswitcher.js 

###DataTables JQuery-plugin

FoBo.InitParam.ToolKit=FoBo.DataTablesXXX

Css files

- jquery.dataTables.css
- jquery.dataTables_themeroller.css
- AutoFill.css
- ColReorder.css
- ColVis.css
- ColVisAlt.css
- TableTools_JUI.css
- TableTools.css

Script files

- jquery.dataTables.js
- AutoFill.js
- ColReorder.js
- ColVis.js
- FixedColumns.js
- FixedHeader.js
- KeyTable.js
- Scroller.js
- TableTools.js
- ZeroClipboard.js

Themes files

- themes/smoothness.css 
- themes/ui-lightness.css

swf files

- copy_cvs_xls_pdf.swf
- copy_cvs_xls.swf
    
    
### Google Code Prettify

FoBo.InitParam.ToolKit=FoBo.PrettifyJun2011

Css files

- prettify.css

Script files

- prettify.js
- lang-xxx.js where xxx=[apollo,clj,css,go,hs,listp,lua,ml,n,proto,scala,sql,tex,vb,vhdl,wiki,xq,yaml]

###Knockout

Fobo.InitParam.ToolKit=FoBo.KnockoutXXX

Script files

- knockout.js

    
FoBo front-end toolkits documentation
-------------------------------------

The [ZURB/Foundation](http://foundation.zurb.com/) and the [Twitter Bootstrap](http://twitter.github.com/bootstrap/) 
and the [JQuery Mobile](http://jquerymobile.com/) links contains plenty of documentation so that will be your no.1 resources. 
There is also a fobo lift demo [project](https://github.com/karma4u101/FoBo-Lift-Template) 
containing bootstrap and foundation and jquery mobile documentation. 

FoBo Bootstrap and Less
-----------------------

The [FoBo-Less project](https://github.com/karma4u101/FoBo-Less) allows you to tweak your generated bootstrap.css this is available 
for bootstrap >= v2.0.0 via variables.less, see bootstrap documentation for available tweaks. Put the file to tweek in the 
bootstrap/version/orverrides library, tweaks is normally done in the overrides/variables.less file already available in the overrides lib.

Authors
-------
This FoBo Lift module were written by [Peter Petersson](http://www.media4u101.se). The Lift Module conventions were 
developed by the [Lift community](http://groups.google.com/group/liftweb/).

After many years of Java EE development I started look at Scala/Lift in May 2011 so there may be some none "best practice" stuff in there 
and if you find something you think could be done in a more Scala/Lift fashion please let me know.

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
**(*)** This is a _optional_ Lift user community powered Lift module which means it is a work based on the 
sound foundation of Lift done by developers who uses Lift for development, sharing it with others.

