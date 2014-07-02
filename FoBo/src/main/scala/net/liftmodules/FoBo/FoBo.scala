package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._


/**
 * ==Welcome to FoBo - A generic Front-End Toolkit Lift Module== 
 * 
 * The [[net.liftmodules.FoBo]] Package is the starting point for this API. 
 * The FoBo modules Github home is [[https://github.com/karma4u101/FoBo here]]
 *
 *===What FoBo will do for you===
 *
 * This module gives you quick and easy integration of some of the industry leading web-centric open source 
 * front-end toolkits with some carefully thought throw Scala/Lift inherit extra benefits. 
 * 
 * Among the benefits is:
 *  - Due to a small footprint and uniform declaration and integration points across toolkit versions only a 
 *    small amount of changes will bee needed for a up/down-grading of a used Toolkit, optimally, if the toolkit 
 *    has no breaking changes it will just be a version change of the FoBo.Initparam in Lift bootstrap.liftweb.Boot. 
 *  - The module provides debug-able js and css files in development and minimized files otherwise and simultaneously 
 *    supporting several versions, makes development, maintenance, upgrade and fall-back quick and easy.      
 *  - The modules included lib Classes and Snippet helpers will ease you from writing some commonly used toolkit 
 *    component integration scripts making it a simple snippet invocation. 
 *    At this writing the snippet helpers is few but expect the numbers to grow as the module matures. 
 *  - Great mobile scalability with some mobile enabled toolkits.  
 *  - With FoBo great toolkits and toolsets for building the framework most suited to your application development
 *    will be available to you just a FoBo.Initparam away.   
 *
 * ===FoBo supported toolkits and plugins=== 
 * 
 * The following is a list of available toolkits and plugins 
 *  
 *  - JQuery [v1.7.2, v1.8.2, v1.9.1, v1.10.2, v1.11.0] [[net.liftmodules.FoBoJQ]]
 *  - Bootstrap v3.x serie [v3.0.0, v3.0.1, v3.1.1, v3.2.0] [[net.liftmodules.FoBoBs]]
 *  - Bootstrap v2.x serie [v2.1.0, v2.2.0, v2.2.2, v2.3.0, v2.3.1, v2.3.2] [[net.liftmodules.FoBoTB]]
 *  - Font Awesome [v2.0.0, v3.0.0, v3.2.1, v4.0.1, v4.0.3] [[net.liftmodules.FoBoFA]]
 *  - Kinetic JS [v5.1.0]
 *  - Foundation [v2.1.5] 
 *  - DataTables [v1.9.0]
 *  - JQuery-mobile [v1.0.1, v1.1.0]
 *  - Google Code Prettify [vJun2011]
 *  - Knockout JS [v2.0.0, v2.1.0, v]2.2.1]
 *  - Angular JS [v1.0.6, v1.2.11] (angular core modules)
 *  - Angular UI Bootstrap [v0.2.0, v0.7.0, v0.10.0] (angular component)
 *  - Angular NG-Grid [v2.0.4, v2.0.7] (angular component)
 *  
 * 
 * ===Heads up===
 * 
 * This API is young so if you make direct usage of some FoBoHelpers in lib chances is that things change. 
 * If you want to stay a bit more on the safe side usage of FoBo snippets and init operations should be fairly safe. 
 * After a stable release changes to a API method will be announced as deprecated at least one release cycle before 
 * method signature changes or removal.  
 *  
 * ===Help out!===
 * 
 * There is a lot more that can be done within the boundaries of this API and the FoBo module as a hole so  
 * your help, suggestions, encouragement, engagement, patches (pull requests) bug-fixes/reports are highly appreciated.     
 *      
 * ===Setup===     
 * 
 *  - The module is known to work with Lift v2.4/v2.5/v2.6 and v3.0-SNAPSHOT and it's supported Scala versions.  
 *  - For a demonstration of this module see the live [[http://www.media4u101.se/fobo-lift-template-demo/ FoBo demo]] 
 *
 * @example To initiate this module for usage in your Lift project 
 * set something like the following in the projects Lift bootstrap.liftweb.Boot. For information on FoBoToolkitName see 
 * respective toolkit below.
 * {{{
 *    import net.liftmodules.FoBo
 *     :
 *     :
 *    //If using defaults FoBo init params can be omitted
 *    FoBo.InitParam.JQuery=FoBo.JQueryXYZ  //one jquery version
 *    FoBo.InitParam.ToolKit=FoBo.FoBoToolkitNameXYZ //one or more toolkits 
 *    FoBo.InitParam.ToolKit=FoBo.FoBoToolkitNameXYZ
 *     : 
 *    FoBo.init() //now do init
 * }}}
 * 
 * @version v1.3
 * @author Peter Petersson (Github karma4u101) and the Lift community  
 * 
 */
package object FoBo {
  
  /**
   * @example In bootstrap liftweb Boot set
   * {{{
   *   FoBo.init()
   * }}}
   * The above example just calls init without specifying fobo init 
   * params so default Toolkit and JQuery values will be used. 
   */
  def init() {
    //add package for module with snippets 
    LiftRules.addToPackages("net.liftmodules.FoBo")
    LiftRules.addToPackages("net.liftmodules.FoBoAJS")
    LiftRules.addToPackages("net.liftmodules.FoBoDT")
    LiftRules.addToPackages("net.liftmodules.FoBoBs")
    LiftRules.addToPackages("net.liftmodules.FoBoTB")
    //LiftRules.addToPackages("net.liftmodules.FoBoKi")
    
    ResourceServer.allow {
      case "fobo" :: tail => true
    }
  }


abstract trait FoBoJQuery
abstract trait FoBoToolkit

/**
 * Extends your Lift SiteMap with various common bootstrap menu manipulations such 
 * as horizontal and vertical menu dividers and menu labels (labels coming soon).
 *  
 * This object should be used in conjunction with the TB* menu builder objects in [[net.liftmodules.FoBo.snippet.FoBo]] snippet's.
 * 
 * '''Example:'''
 * {{{ 
 *   : 
 *  //add a horizontal menu divider 
 *  divider1 >> LocGroup(...) >> FoBo.TBLocInfo.Divider,
 *   :
 *  //add a vertical menu divider 
 *  divider2 >> LocGroup(...) >> FoBo.TBLocInfo.DividerVertical,
 *   : 
 * }}} 
 * @since v1.0
 */
object TBLocInfo {
  private val hd: Box[String] = Full("divider")
  private val vd: Box[String] = Full("divider-vertical")  
  private val nh: Box[String] = Full("nav-header") 
  private val ltb: Box[String] = Full("_blank")
  private val lts: Box[String] = Full("_self")
  private val ltp: Box[String] = Full("_parent")
  private val ltt: Box[String] = Full("_top")
  /**
   * Provides a way to specify a horizontal divider for your bootstrap menu in Lift's SiteMap.
   * 
   * '''Example:'''
   * {{{
   * val index            = Menu.i("Home") / "index"
   *      : 
   * val about            = Menu.i("About") / "about"
   * val divider2         = Menu("divider2") / "divider2" //dummy entry only showing a menu divider 
   * val navHeader1       = Menu.i("navHeader1") / "navHeader1" //Adds a header (label) to your FoBo.NavList
   * 
   * def sitemap = SiteMap(
   *   navHeader1 >> LocGroup("nl1") >> FoBo.TBLocInfo.NavHeader,
   *   index >> LocGroup("top","nl1",...),
   *    :
   *   ddLabel >> LocGroup("top",...)  >> PlaceHolder submenus(
   *       about ,
   *       divider2 >> FoBo.TBLocInfo.Divider,
   *       contact,
   *       feedback  
   *       )
   * )      
   * }}} 
   * @since v1.0
   */
  val Divider = new net.liftweb.sitemap.Loc.LocInfo[String]{def apply() = hd.map(x => () => x) }
  /**
   * Add a vertical divider in your bootstrap menu.
   * For a usage example see the Divider val above. 
   * @since v1.0
   */
  val DividerVertical = new net.liftweb.sitemap.Loc.LocInfo[String]{def apply() = vd.map(x => () => x) }  
  /**
   * Add nav header(s) to your bootstrap nav list.
   * For a usage example see the NavHeader val above. 
   * @since v1.0
   */
  val NavHeader = new net.liftweb.sitemap.Loc.LocInfo[String]{def apply() = nh.map(x => () => x) } 
  /**
   * Adds target="_blank" to the link
   * @since v1.2
   */   
  val LinkTargetBlank = new net.liftweb.sitemap.Loc.LocInfo[String]{def apply() = ltb.map(x => () => x) } 
  /**
   * Adds target="_self" to the link
   * @since v1.2
   */ 
  val LinkTargetSelf = new net.liftweb.sitemap.Loc.LocInfo[String]{def apply() = lts.map(x => () => x) }
  /**
   * Adds target="_parent" to the link
   * @since v1.2
   */  
  val LinkTargetParent = new net.liftweb.sitemap.Loc.LocInfo[String]{def apply() = ltp.map(x => () => x) }
  /**
   * Adds target="_top" to the link
   * @since v1.2
   */
  val LinkTargetTop = new net.liftweb.sitemap.Loc.LocInfo[String]{def apply() = ltt.map(x => () => x) }

}

/**
 * Enable Toolkit(s)/JQuery options for the FoBo module in your bootstrap liftweb Boot
 * 
 * '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.JQuery=FoBo.JQuery182
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap230
 *   FoBo.InitParam.Toolkit=FoBo.PrettifyJun2011
 * }}}
 * This example uses the Bootstrap v2.2.2 option and adds the Google code Prettify vJun2011 
 * to the enabled toolkits.  
 */
object InitParam extends FoBoToolkit with FoBoJQuery {
  var JQuery: FoBoJQuery = JQuery182
  var ToolKit: FoBoToolkit = _ 
}


  /**
   * Enable usage of KineticJS version 5.1.0 in your bootstrap liftweb Boot.
   * @version 5.1.0
   *
   *  '''Lift Boot:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.KineticJS510
   *   FoBo.init()
   * }}}
   * @since v1.3
   */
  case object KineticJS510 extends FoBoToolkit {
    net.liftmodules.FoBoKi.KineticJS510
  }
  
  /**
   * Enable usage of Pace version 0.4.15 in your bootstrap liftweb Boot.
   * @version 0.4.15
   *
   *  '''Lift Boot:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.Pace0415
   *   FoBo.init()
   * }}}
   * @since v1.2
   */
  case object Pace0415 extends FoBoToolkit {
    net.liftmodules.FoBoPa.Pace0415
  }

   /**
   * Enable usage of AngularJS version 1.2.11 in your bootstrap liftweb Boot.
   *
   * @version 1.2.11
   *
   *  '''Lift Boot:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AngularJS1211
   *   FoBo.init()
   * }}}
   * @since v1.2
   */
  case object AngularJS1211 extends FoBoToolkit {
    net.liftmodules.FoBoAJS.AngularJS1211
  }
  
   /**
   * Enable usage of AngularJS i18n files in your bootstrap liftweb Boot.
   * @version 1.2.11
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AngularJS1211i18n
   * }}}
   * @since v1.2
   */
  case object AngularJS1211i18n extends FoBoToolkit {
    net.liftmodules.FoBoAJS.AngularJS1211i18n
  } 

  /**
   * Enable usage of AngularJS version 1.0.6 in your bootstrap liftweb Boot.
   * @version 1.0.6
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AngularJS106
   * }}}
   * @since v1.0
   */
  @deprecated("Use AngularJS122 or later","FoBo v1.2.0")
  case object AngularJS106 extends FoBoToolkit {
    net.liftmodules.FoBoAJS.AngularJS106
  }
  
  /**
   * Enable usage of AngularUI-Bootstrap version 0.10.0 in your bootstrap liftweb Boot.
   * @version 0.10.0
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AJSUIBootstrap0100
   * }}}
   * @since v1.2
   */
  case object AJSUIBootstrap0100 extends FoBoToolkit {
    net.liftmodules.FoBoAJS.AJSUIBootstrap0100
  }  
  
  /**
   * Enable usage of AngularUI-Bootstrap version 0.7.0 in your bootstrap liftweb Boot.
   * @version 0.7.0
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AJSUIBootstrap070
   * }}}
   * @since v1.2
   */
  case object AJSUIBootstrap070 extends FoBoToolkit {
    net.liftmodules.FoBoAJS.AJSUIBootstrap070
  }   

  /**
   * Enable usage of AngularUI-Bootstrap version 0.2.0 in your bootstrap liftweb Boot.
   * @version 0.2.0
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AJSUIBootstrap020
   * }}}
   * @since v1.0
   */
  case object AJSUIBootstrap020 extends FoBoToolkit {
    net.liftmodules.FoBoAJS.AJSUIBootstrap020
  }   
 
  
  /**
   * Enable usage of NG-Grid version 2.0.7 in your bootstrap liftweb Boot.
   * @version 2.0.7
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AJSNGGrid207
   * }}}
   * @since v1.2
   */
  case object AJSNGGrid207 extends FoBoToolkit {
    net.liftmodules.FoBoAJS.AJSNGGrid207
  } 
  
  /**
   * Enable usage of NG-Grid version 2.0.4 in your bootstrap liftweb Boot.
   * @version 2.0.4
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AJSNGGrid204
   * }}}
   * @since v1.0
   */
  @deprecated("Use AJSNGGrid207 or later","FoBo v1.2.0")
  case object AJSNGGrid204 extends FoBoToolkit {
    net.liftmodules.FoBoAJS.AJSNGGrid204
  }  
   
/**
 * Enable usage of KnockOut version 2.2.1 in your bootstrap liftweb Boot.
 * @version 2.2.1
 * 
 *  '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.KnockOut221
 * }}}
 * @since v1.0 
 */
@deprecated("Use the FoBoKO.Knockout210 sub module outside of the FoBo module, see the Knockout sub module readme for more information.","FoBo v1.2.0")
case object Knockout221 extends FoBoToolkit {
  net.liftmodules.FoBoKo.Knockout221
}

/**
 * Enable usage of KnockOut version 2.0.0 in your bootstrap liftweb Boot.
 * @version 2.0.0
 * 
 *  '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.KnockOut200
 * }}}
 * @since v1.0 
 */
@deprecated("Use Knockout221 or later","FoBo v1.2.0")
case object Knockout210 extends FoBoToolkit {
  net.liftmodules.FoBoKo.Knockout210
}
/**
 * Enable usage of KnockOut version 2.1.0 in your bootstrap liftweb Boot.
 * @version 2.1.0
 * 
 *  '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.KnockOut210
 * }}}
 * @since v0.7 
 */
@deprecated("Use Knockout221 or later","FoBo v1.2.0")
case object Knockout200 extends FoBoToolkit {
  net.liftmodules.FoBoKo.Knockout200
}

/**
 * Enable usage of Prettify version Jun2011 in your bootstrap liftweb Boot.
 * @version Jun2011
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.PrettifyJun2011
 * }}}
 * @since v0.7
 */
case object PrettifyJun2011 extends FoBoToolkit {
   net.liftmodules.FoBoGCP.PrettifyJun2011
}

   /**
   * Enable usage of JQuery-migrate version 1.2.1 in your bootstrap liftweb Boot.
   * @version 1.2.1
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQueryMigrate121
   * }}}
   * @since v2.7
   */
  case object JQueryMigrate121 extends FoBoJQuery {
    net.liftmodules.FoBoJQ.JQueryMigrate121
  }

  /**
   * Enable usage of JQuery version 2.1.1 in your bootstrap liftweb Boot.
   * @version 2.1.1
   * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery211
   * }}}
   * @since v1.3
   */
  case object JQuery211 extends FoBoJQuery {
    net.liftmodules.FoBoJQ.JQuery211
  }  

/**
 * Enable usage of JQuery version 1.11.1 in your bootstrap liftweb Boot.
 * @version 1.11.1
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.JQuery=FoBo.JQuery1111
 * }}}
 * @since v1.3
 */
case object JQuery1111 extends FoBoJQuery {
  net.liftmodules.FoBoJQ.JQuery1111
}

/**
 * Enable usage of JQuery version 1.11.0 in your bootstrap liftweb Boot.
 * @version 1.11.0
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.JQuery=FoBo.JQuery1110
 * }}}
 * @since v1.2
 */
@deprecated("Use v1.11.1 or later","Sins v1.3") 
case object JQuery1110 extends FoBoJQuery {
  net.liftmodules.FoBoJQ.JQuery1110
}

/**
 * Enable usage of JQuery version 1.10.2 in your bootstrap liftweb Boot.
 * @version 1.10.2
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.JQuery=FoBo.JQuery1102
 * }}}
 * @since v1.1
 */
case object JQuery1102 extends FoBoJQuery {
  net.liftmodules.FoBoJQ.JQuery1102
}

/**
 * Enable usage of JQuery version 1.9.1 in your bootstrap liftweb Boot.
 * @version 1.9.1
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.JQuery=FoBo.JQuery191
 * }}}
 * @since v1.0
 */
case object JQuery191 extends FoBoJQuery {
  net.liftmodules.FoBoJQ.JQuery191
}

/**
 * Enable usage of JQuery version 1.8.2 in your bootstrap liftweb Boot.
 * @version 1.8.2
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.JQuery=FoBo.JQuery182
 * }}}
 * @since v0.7
 */
case object JQuery182 extends FoBoJQuery {
  net.liftmodules.FoBoJQ.JQuery182
}

/**
 * Enable usage of JQuery version 1.7.2 in your bootstrap liftweb Boot.
 * @version 1.7.2
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.JQuery=FoBo.JQuery172
 * }}}
 * @since v0.7
 */
case object JQuery172 extends FoBoJQuery {
  net.liftmodules.FoBoJQ.JQuery172
}

/**
 * Enable usage of JQueryMobile version 1.1.0 in your liftweb Boot.
 * 
 * @version 1.0.1
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.JQueryMobile110
 * }}}
 * @since v1.0
 */
@deprecated("Use the FoBoJQM.JQueryMobile110 sub module outside of the FoBo module, see the JQuery-Mobile sub module readme for more information.","FoBo v1.2.0")
case object JQueryMobile110 extends FoBoToolkit {
  net.liftmodules.FoBoJQM.JQueryMobile110
}

/**
 * Enable usage of Font-Awesome version 4.1.0 in your bootstrap liftweb Boot.
 * @version 4.1.0
 * 
 *  '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.FontAwesome410
 * }}}
 * @since v1.2 
 */
case object FontAwesome410 extends FoBoToolkit {
  net.liftmodules.FoBoFA.FontAwesome410
}

/**
 * Enable usage of Font-Awesome version 4.0.3 in your bootstrap liftweb Boot.
 * @version 4.0.3
 * 
 *  '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.FontAwesome403
 * }}}
 * @since v1.2 
 */
case object FontAwesome403 extends FoBoToolkit {
  net.liftmodules.FoBoFA.FontAwesome403
}


/**
 * Enable usage of Font-Awesome version 4.0.1 in your bootstrap liftweb Boot.
 * @version 4.0.1
 * 
 *  '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.FontAwesome401
 * }}}
 * @since v1.1 
 */
@deprecated("Use FontAwesome403 or later","FoBo v1.3.0")
case object FontAwesome401 extends FoBoToolkit {
  net.liftmodules.FoBoFA.FontAwesome401
}

/**
 * Enable usage of Font-Awesome version 3.2.1 in your bootstrap liftweb Boot.
 * @version 3.2.1
 * 
 *  '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.FontAwesome321
 * }}}
 * @since v1.0 
 */
case object FontAwesome321 extends FoBoToolkit {
  net.liftmodules.FoBoFA.FontAwesome321
}

/**
 * Enable usage of Font-Awesome version 3.0.0 in your bootstrap liftweb Boot.
 * @version 3.0.0
 * 
 *  '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.FontAwesome300
 * }}}
 * @since v1.0 
 */
@deprecated("Use FontAwesome321 or later","FoBo v1.2.0")
case object FontAwesome300 extends FoBoToolkit {
  net.liftmodules.FoBoFA.FontAwesome300
}

/**
 * Enable usage of Font-Awesome version 2.0.0 in your bootstrap liftweb Boot.
 * @version 2.0.0
 * 
 *  '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.FontAwesome200
 * }}}
 * @since v1.0 
 */
@deprecated("Use FontAwesome321 or later","FoBo v1.2.0")
case object FontAwesome200 extends FoBoToolkit {
  net.liftmodules.FoBoFA.FontAwesome200
}

/**
 * Enable usage of Font-Awesome version 2.0.0 in your bootstrap liftweb Boot.
 * 
 * This TB222 variant is optimized for use with FoBo.Bootstrap222. 
 * The effect of using this TB222 variant is that you can keep using the  
 * /classpath/fobo/bootstrap.css path in your template i.e there is 
 * no need to explicitly set the no icon css variant as  
 * /classpath/fobo/bootstrap-no-icons.css in your template FoBo will 
 * load a FontAwesome modified icon less bootstrap css for you. 
 * @version 2.0.0
 * 
 *  '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.FontAwesome200TB222
 * }}}
 * @since v1.0 
 */
@deprecated("Use FontAwesome321 or later","FoBo v1.2.0")
case object FontAwesome200TB222 extends FoBoToolkit {
  net.liftmodules.FoBoFA.FontAwesome200TB222
}

/**
 * Enable usage of Twitter Bootstrap version 2.1.0 in your bootstrap liftweb Boot.
 * @version 2.1.0
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap210
 * }}}
 * @since v1.0
 */
@deprecated("Use Bootstrap232 or later","FoBo v1.2.0")
case object Bootstrap210 extends FoBoToolkit {
  net.liftmodules.FoBoTB.Bootstrap210
}

/**
 * Enable usage of Twitter Bootstrap version 2.2.0 in your bootstrap liftweb Boot.
 * @version 2.2.0
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap220
 * }}}
 * @since v1.0
 */
@deprecated("Use Bootstrap232 or later","FoBo v1.2.0")
case object Bootstrap220 extends FoBoToolkit {
  net.liftmodules.FoBoTB.Bootstrap220
}


/**
 * Enable usage of Twitter Bootstrap version 2.2.2 in your bootstrap liftweb Boot.
 * @version 2.2.2
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap222
 * }}}
 * @since v1.0
 */
@deprecated("Use Bootstrap232 or later","FoBo v1.2.0")
case object Bootstrap222 extends FoBoToolkit {
  net.liftmodules.FoBoTB.Bootstrap222
}

/**
 * Enable usage of Twitter Bootstrap version 2.3.0 in your bootstrap liftweb Boot.
 * @version 2.3.0
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap230
 * }}}
 * @since v1.0
 */
@deprecated("Use Bootstrap232 or later","FoBo v1.2.0")
case object Bootstrap230 extends FoBoToolkit {
  net.liftmodules.FoBoTB.Bootstrap230
}

/**
 * Enable usage of Twitter Bootstrap version 2.3.1 in your bootstrap liftweb Boot.
 * @version 2.3.1
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap231
 * }}}
 * @since v1.0
 */
@deprecated("Use Bootstrap232 or later","FoBo v1.2.0")
case object Bootstrap231 extends FoBoToolkit {
  net.liftmodules.FoBoTB.Bootstrap231
}

/**
 * Enable usage of Twitter Bootstrap version 2.3.2 in your bootstrap liftweb Boot.
 * @version 2.3.2
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap232
 * }}}
 * @since v1.1
 */
case object Bootstrap232 extends FoBoToolkit {
  net.liftmodules.FoBoTB.Bootstrap232
}


/**
 * Enable usage of Twitter Bootstrap version 3.0.0 in your bootstrap liftweb Boot.
 * @version 3.0.0
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap300
 * }}}
 * @since v1.1
 */
@deprecated("Use Bootstrap301 or later","FoBo v1.2.0")
case object Bootstrap300 extends FoBoToolkit {
  net.liftmodules.FoBoBs.Bootstrap300
}

/**
 * Enable usage of Twitter Bootstrap version 3.0.1 in your bootstrap liftweb Boot.
 * @version 3.0.1
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap301
 * }}}
 * @since v1.1
 */
case object Bootstrap301 extends FoBoToolkit {
  net.liftmodules.FoBoBs.Bootstrap301
}

/**
 * Enable usage of Twitter Bootstrap version 3.1.1 in your bootstrap liftweb Boot.
 * @version 3.1.1
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap311
 * }}}
 * @since v1.2
 */
case object Bootstrap311 extends FoBoToolkit {
  net.liftmodules.FoBoBs.Bootstrap311
}

/**
 * Enable usage of Twitter Bootstrap version 3.2.0 in your bootstrap liftweb Boot.
 * @version 3.2.0
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap320
 * }}}
 * @since v1.3
 */
case object Bootstrap320 extends FoBoToolkit {
  net.liftmodules.FoBoBs.Bootstrap320
}

/**
 * Enable usage of DataTables version 1.9.0 in your bootstrap liftweb Boot.
 * @version 1.9.0
 * 
 *  '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.DataTables190
 * }}}
 * @since v0.7 
 */
@deprecated("Use the FoBoDT.DataTables190 sub module outside of the FoBo module, see the DataTables sub module readme for more information.","FoBo v1.2.0")
case object DataTables190 extends FoBoToolkit {
  net.liftmodules.FoBoDT.DataTables190
}


/**
 * Enable usage of Foundation version 2.1.5 in your bootstrap liftweb Boot.
 * @version 2.1.5
 * 
 * '''Example'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.Foundation215
 * }}}
 * @since v0.7
 */
@deprecated("Use the FoBoFo.Foundation215 sub module outside of the FoBo module, see the Foundation sub module readme for more information.","FoBo v1.2.0")
case object Foundation215 extends FoBoToolkit {
  net.liftmodules.FoBoFo.Foundation215
}


/**
 * Object holding internally used FoBo resources. 
 */
private object FoBoResources {
   //moved to respective sub-modules
}
  
}

