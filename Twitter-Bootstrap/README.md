FoBo-Font-Awesome
=================

This sub module provides Twitter Bootstrap to the Fobo Module, but can also be used as-is (see below for setup information).
For more information on how to use Twitter Bootstrap in the FoBo module see the [FoBo - Lift Front-End Toolkit Module](https://github.com/karma4u101/FoBo).

Contributions
------
Improvements, contributions and suggestions are welcome! Please see the [Contribution Document](https://github.com/karma4u101/FoBo/blob/master/CONTRIBUTING.md). You can also leave a issue report or drop a question/suggestion to my priv. e-mail or on [Lift's mailing list](http://groups.google.com/group/liftweb/) 

best regards 
Peter Petersson 

Update log
----------

**Latest Module Version:** 
- **2013-01-10** -- 0.0.1-SNAPSHOT

**Latest Updates:**
- **2013-01-10** -- 0.0.1-SNAPSHOT

**Latest Stable Releases:**
- None

**Latest Snapshot Release:**
- **2013-01-10** -- 0.0.4-SNAPSHOT artifacts for Lift 2.5-SNAPSHOTS (Scala 2.10.0, 2.9.1, 2.9.1-1, 2.9.1)


Integration into your project 
-------------------------------

This module is used by the FoBo module to, via [FoBo](http://fortawesome.github.com/FoBo/) provide [Twitter Bootstrap](http://twitter.github.com/bootstrap/). 
However the module can be used separatly, the following describes how to use it as a separate module (without the use of the [FoBo](http://fortawesome.github.com/FoBo/)).

### Dependancy

Put the following in your project build.sbt files lift libraryDependencies section 

    "net.liftmodules" %% "fobo-twitter-bootstrap" % (liftVersion+"-[module version]") 

### Lift FoBo boot hooks

    import net.liftmodules.FoBo-Twitter-Bootstrap 
    :
    FoBoTB.InitParam.ToolKit=FoBoTB.BootstrapXXX 
    (usage with FoBo is FoBo.InitParam.ToolKit=FoBo.BootstrapXXX)

### Lift FoBo Template hooks

    <link rel="stylesheet" type='text/css' href='/classpath/fobo/bootstrap.css'> 
    <link rel="stylesheet" type='text/css' href='/classpath/fobo/bootstrap-responsive.css'> 
    :
    <link rel="stylesheet" type='text/css' href='[path/to/you/app/specific/css/file/in/the/webapp/dir]'>
    :
    :
    <script type="text/javascript" src="/classpath/fobo/bootstrap.js"></script>

For more information on how to use Twitter Bootstrap see [Twitter Bootstrap](http://twitter.github.com/bootstrap/)


