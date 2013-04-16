FoBo - A Generic Front-End Toolkit Module for Lift [![Build Status](https://secure.travis-ci.org/karma4u101/FoBo.png)](http://travis-ci.org/karma4u101/FoBo)
==================================================

A **live demo** and introduction of this module including API documentation can be [seen here](http://www.media4u101.se/fobo-lift-template-demo/). 
A Lift basic template with FoBo setup for Twitter Bootstrap usage can be found here [Templating With Twitter Bootstrap](https://github.com/karma4u101/Templating-With-Twitter-Bootstrap)  

With this Lift module you can chose among some of the industry leading web-centric open source front-end toolkits. 
The module is simultaneously supporting several versions of the included toolkits, providing debug-able js and css files in development and minimized files otherwise, 
making development, maintenance, upgrade and fall-back quick and easy (typically a one liner change in lift boot) and will ultimately jazz up your 
Lift applications with the toolkit(s) of your choice.    

Another benefit of using this module is the small but growing API that includes helper object:s and snippet:s (see API documents for usage) 
that will take care of some common toolkit and component initiation, script generation and more. 
At this writing the helpers are few but as the module mature it will provide plenty of useful help functions see the demo for a teaser and potential. 
If you have ideas and suggestions let me know! contact me or add a issue and/or contribute a patch.      

A third benefit of using this module is that you will get a clean separation of the toolkit files and your application specific resources as 
the module dose not cluttering your applications web-app resources directory. 

The Github repository for the demo can be found [here](https://github.com/karma4u101/FoBo-Lift-Template).

**OBS!** Note that as of Apr 2013 there is a new version schema for Lift modules and FoBo module version >= 0.9.3 
See the [Dependency settings](https://github.com/karma4u101/FoBo/blob/master/README.md#dependency-settings) section for more information.

Contributions
------
Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion to my priv. e-mail or on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

best regards 
Peter Petersson     

Update log
----------

For update history see the [History log](https://github.com/karma4u101/FoBo/blob/master/README.md#history-log) section

**Latest Module Version:** 
- **2013-04-06** -- 0.9.6-SNAPSHOT
- **2013-03-29** -- 0.9.5-SNAPSHOT
- **2013-03-27** -- 0.9.4-SNAPSHOT


**Latest Updates:**
- **2013-03-29** -- 0.9.6-SNAPSHOT FoBo-JQuery dependency update. 
- **2013-03-29** -- 0.9.5-SNAPSHOT Google-Code-Prettify and JQuery is moved to sub FoBo modules
- **2013-03-27** -- 0.9.4-SNAPSHOT New version schema see [Dependency settings](https://github.com/karma4u101/FoBo/blob/master/README.md#dependency-settings) foundation is moved to sub module. 


**Latest Stable Releases:**
- None

**Latest Snapshot Release:**
- **2013-04-06** -- 0.9.6-SNAPSHOT artifacts for Lift 2.5
- **2013-03-29** -- 0.9.5-SNAPSHOT artifacts for Lift 2.5 and 3.0 is published.
- **2013-03-27** -- 0.9.4-SNAPSHOT artifacts for Lift 2.5 and 3.0 see [Dependency settings](https://github.com/karma4u101/FoBo/blob/master/README.md#dependency-settings) for more information.

Toolkit:s and available versions
--------------------------------

Artifacts is available for: Lift 2.4, 2.5-M1 to M4, RC1 and 2.5, 3.0 SNAPSHOT

This module includes the following toolkits versions

- Bootstrap [v2.1.0, v2.2.0, v2.2.2, v2.3.0] - [Twitter Bootstrap](http://twitter.github.com/bootstrap/)
- Font Awesome [v2.0.0, v3.0.0] [Font Awesome](http://fortawesome.github.com/Font-Awesome/) 
- Foundation [v2.1.5] - [ZURB/Foundation](http://foundation.zurb.com/)
- DataTables [v1.9.0] - [DataTables.net](http://datatables.net/)
- JQuery Mobile [v1.0.1, v1.1.0] - [JQuery Mobile](http://jquerymobile.com/)
- JQuery  [v1.7.2, v1.8,2] - [JQuery](http://jquery.com/)
- Google Code Prettify [vJun2011] - [google-code-prettify](http://code.google.com/p/google-code-prettify/)
- Knockout JS [v2.0.0, v2.1.0, v2.2.1] - [Knockout](http://knockoutjs.com/)

Module names that can bee used in boot corresponding to the toolkit version above is

- Bootstrap140, Bootstrap200, Bootstrap204, Bootstrap210, Bootstrap222 
- FontAwesome200, FontAwesome200TB222 
- Foundation214, Foundation215
- DataTables190
- JQueryMobile101 JQueryMobile101
- JQuery164,JQuery171,JQuery172,JQuery182 
- JQueryModule.JQuery182 
- PrettifyJun2011
- Knockout200, Knockout210, Knockout221

For more information on how to set this up see below.

Deprecated
----------

**2012-11-18**
As of v0.7.3-SNAPSHOT the following artifacts has been deprecated and will bee removed before v.1.0.0 release 

- Bootstrap v1.4.0 to v2.0.4  -- Use v2.1.0 or newer (removed in 0.8.0-SNAPSHOT)
- Foundation v2.1.4           -- Use v2.1.5 or newer
- JQuery v1.6.4               -- Use v1.7.2 or newer
- JQuery-Mobile v1.0.1        -- Use v1.1.0 
- FoBo                        -- Use Bootstrap or Foundation (removed in 0.8.0-SNAPSHOT)
    
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

### Dependency settings
	
For module versions >= 0.9.3 put the following in your project build.sbt files lift libraryDependencies section 

    "net.liftmodules" %% "moduleName_x1.y1 % "x2.y2[.z2][-SNAPSHOT/rcx/mx]"

or if you are using Maven

    <dependency>
      <groupId>net.liftmodules</groupId>
      <artifactId>moduleName_x1.y1_a.b.c</artifactId>
      <version>x2.y2[.z2][-SNAPSHOT/rcx/mx]</version>
    </dependency>

Where x1.y1 is Lift major and minor version numbers and a.b.c is Scala
version number and x2.y2.[z2] is the module's major x2, minor y2 and
eventual incremental numbers z2 followed by a eventual SNAPSHOT 
release candidate (rcX) or milestone (mX) version part.

For example:

    "net.liftmodules" %% "fobo_2.5 % "0.1.0-SNAPSHOT"
      :
    <dependency>
      <groupId>net.liftmodules</groupId>
      <artifactId>fobo_2.5_2.9.2</artifactId>
      <version>0.1.0-SNAPSHOT</version>
    </dependency>

The example will include a module built for lift 2.5. If you are using maven observe that the artifact id also needs the Scala version.

For older versions <= 0.9.2 put the following in your project build.sbt files lift libraryDependencies section 

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
- bootstrap-no-icons.css (v2.2.2+ used by font-awesome to override default icons)

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

###Font Awesome

FoBo.InitParam.ToolKit=FoBo.FontAwesomeXXX 

Add the following to your template

	<link rel="stylesheet" href="/classpath/fobo/font-awesome.css">

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

### History log
----------------

**Module Version history:**
- **2013-02-27** -- 0.9.3-SNAPSHOT
- **2013-02-24** -- 0.9.2-SNAPSHOT
- **2013-02-22** -- 0.9.1-SNAPSHOT
- **2013-01-17** -- 0.9.0-SNAPSHOT
- **2013-01-13** -- 0.8.0-SNAPSHOT
- **2013-01-10** -- 0.7.11-SNAPSHOT
- **2013-01-04** -- 0.7.10-SNAPSHOT
- **2013-01-02** -- 0.7.9-SNAPSHOT
- **2012-12-30** -- 0.7.8-SNAPSHOT
- **2012-12-29** -- 0.7.7-SNAPSHOT

**Updates history:**
- **2013-02-27** -- 0.9.3-SNAPSHOT Adding knockout.js v2.2.1 and moving knockout to sub module/proj fobo-knockout. 
- **2013-02-24** -- 0.9.2-SNAPSHOT Completed fobo-twitter-bootstrap and fobo-datatables module transaction.
- **2013-02-22** -- 0.9.1-SNAPSHOT Using fobo-twitter-bootstrap v0.1.1 that fixes serving of minified bootstrap.js when not in development.
- **2013-01-17** -- 0.9.0-SNAPSHOT Added support for Bootstrap v2.3.0 
- **2013-01-17** -- 0.9.0-SNAPSHOT Added support for Bootstrap v2.3.0 
- **2013-01-13** -- 0.8.0-SNAPSHOT Added support for Font-Awesome v3.0.0 in FoBo-Font-Awesome v0.1.0 included in this build. 
- **2013-01-10** -- 0.7.11-SNAPSHOT Now internally using the FoBo-Twitter-Bootstrap module (v0.0.1) and added Scala version 2.10 build. 
- **2013-01-04** -- 0.7.10-SNAPSHOT Decoupling the FoBo-Font-Awesome module future (v0.0.3)
- **2013-01-92** -- 0.7.9-SNAPSHOT Updated dep. on FoBo-Font-Awesome to v0.0.2.
- **2012-12-30** -- 0.7.8-SNAPSHOT Adding "Font Awesome" Bootstrap extras and a bootstrap-no-icons.css to TB v2.2.2.
- **2012-12-29** -- 0.7.7-SNAPSHOT Added support for JQuery v1.8.2
- **2012-12-26** -- 0.7.6-SNAPSHOT Extended the FoBo API with a new Bootstrap menu builder that transforms Lift SiteMap's LocGroup(s) to bootstrap navlist's.
- **2012-12-15** -- 0.7.5-SNAPSHOT Added Bootstrap v2.2.2
- **2012-12-13** -- 0.7.4-SNAPSHOT Extended the FoBo API with a new Bootstrap menu builder that transforms Lift SiteMap's LocGroup(s) to bootstrap navbar's. 
- **2012-11-18** -- 0.7.3-SNAPSHOT Added Bootstrap v2.2.0 and released artifacts
- **2012-11-11** -- 0.7.2-SNAPSHOT Lift 2.5-SNAPSHOT artifacts (for the inpatient) published to oss.sonatype.org
- **2012-11-10** -- 0.7.2-SNAPSHOT Lift 2.5-M3 released to oss.sonatype.org

**Stable Release history:**
- None

**Snapshot Release history:**
- **2013-03-08** -- 0.9.3-SNAPSHOT artifacts for Lift 2.5-RC2 and Lift 3.0-SNAPSHOT
- **2013-02-24** -- 0.9.2-SNAPSHOT artifacts for Lift 2.5-RC1 and 2.5-SNAPSHOT (Scala 2.10, 2.9.2, 2.9.1-1, 2.9.1) and Lift 3.0 -SNAPSHOT (Scala 2.10)
- **2013-02-22** -- 0.9.1-SNAPSHOT artifacts for Lift 2.5-RC1 (Scala 2.10, 2.9.2, 2.9.1-1, 2.9.1) and Lift 3.0-SNAPSHOT (Scala 2.10)
- **2013-02-17** -- 0.9.0-SNAPSHOT artifacts for Lift 3.0-SNAPSHOT / Scala 2.10, Lift 2.5-SNAPSHOT 
- **2013-02-15** -- 0.8.0-SNAPSHOT artifacts for Lift 3.0-SNAPSHOT / Scala 2.10
- **2013-01-13** -- 0.8.0-SNAPSHOT artifacts for Lift 2.5-M4 and Lift 2.5-SNAPSHOT (Scala 2.10, 2.9.1, 2.9.1-1, 2.9.2) 
- **2013-01-10** -- 0.7.11-SNAPSHOT artifacts for Lift 2.5-SNAPSHOTS (Scala 2.10, 2.9.1, 2.9.1-1, 2.9.2) 
- **2013-01-04** -- 0.7.10-SNAPSHOT artifacts for Lift-2.5-M3 and Lift 2.5-SNAPSHOTS (Scala 2.9.1, 2.9.1-1, 2.9.2)
- **2013-01-02** -- 0.7.8-SNAPSHOT artifacts for Lift-2.5-M3 and Lift 2.5-SNAPSHOTS (Scala 2.9.1, 2.9.1-1, 2.9.2)
- **2012-12-30** -- 0.7.8-SNAPSHOT artifacts for Lift-2.5-M3 and Lift 2.5-SNAPSHOTS (Scala 2.9.1, 2.9.1-1, 2.9.2)
- **2012-12-29** -- 0.7.7-SNAPSHOT artifacts for Lift-2.5-M3 and Lift 2.5-SNAPSHOTS (Scala 2.9.1, 2.9.1-1, 2.9.2)

  
Authors
-------
This FoBo Lift module were written by [Peter Petersson](http://www.media4u101.se). The Lift Module conventions were 
developed by the [Lift community](http://groups.google.com/group/liftweb/).

After many years of Java EE development I started look at Scala/Lift in May 2011 so there may be some none "best practice" stuff in there 
and if you find something you think could be done in a more Scala/Lift fashion please let me know.


User powered Lift module 
========================
**(*)** This is a Lift user community powered Lift module which means it is a work based on the 
sound foundation of Lift done by Lift user community developers too share it with others

