package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._



/**
 * ==FoBo - Sub-module== 
 * This package object is only of interest to you if you are using this module 
 * as a stand alone artifact dependency in your project (without FoBo).
 * This package object provides information on how to initiate and use this module 
 * in your project. If you are using this module in FoBo see [[net.liftmodules.FoBo]] 
 * for usage information. 
 */
package object FoBoBs {
  
  /**
   * @example In bootstrap liftweb Boot set
   * {{{
   *   FoBoBs.init()
   * }}}
   * The above example just calls init without specifying fobo init 
   * params so default Toolkit and JQuery values will be used. 
   */
  def init() {
    LiftRules.addToPackages("net.liftmodules.FoBoBs")
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
 *  divider1 >> LocGroup(...) >> FoBoBs.BsLocInfo.Divider,
 *   :
 *  //add a vertical menu divider 
 *  divider2 >> LocGroup(...) >> FoBoBs.BsLocInfo.DividerVertical,
 *   : 
 * }}} 
 */
object BsLocInfo {
  private val hd: Box[String] = Full("divider")
  private val vd: Box[String] = Full("divider-vertical")  
  private val nh: Box[String] = Full("nav-header") 
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
   *   navHeader1 >> LocGroup("nl1") >> FoBoTB.TBLocInfo.NavHeader,
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
   */
  val Divider = new net.liftweb.sitemap.Loc.LocInfo[String]{def apply() = hd.map(x => () => x) }
  /**
   * Add a vertical divider in your bootstrap menu.
   * For a usage example see the Divider val above. 
   */
  val DividerVertical = new net.liftweb.sitemap.Loc.LocInfo[String]{def apply() = vd.map(x => () => x) }  
  /**
   * Add nav header(s) to your bootstrap nav list.
   * For a usage example see the NavHeader val above. 
   */
  val NavHeader = new net.liftweb.sitemap.Loc.LocInfo[String]{def apply() = nh.map(x => () => x) } 
}

/**
 * Enable Toolkit(s)/JQuery options for the FoBo module in your bootstrap liftweb Boot
 *
 * '''Example:'''
 *  
 * {{{
 *   FoBoBs.InitParam.JQuery=FoBoBs.JQuery172
 *   FoBoBs.InitParam.Toolkit=FoBoBs.Bootstrap232
 * }}}
 * This example uses the Bootstrap v2.3.2 option.  
 *   
 */
object InitParam extends FoBoToolkit with FoBoJQuery {
  var ToolKit: FoBoToolkit = null 
}

/**
 * Enable usage of Bootstrap version 3_0_0 in your bootstrap liftweb Boot.
 * @version 3.0.0
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBoBs.InitParam.Toolkit=FoBoBs.Bootstrap300RC1
 * }}}
 */
@deprecated("Use Bootstrap300 or later","FoBo v1.1.0")
case object Bootstrap300RC1 extends FoBoToolkit {
  FoBoResources.bootstrap300RC1
}

/**
 * Enable usage of Bootstrap version 3_0_0 in your bootstrap liftweb Boot.
 * @version 3.0.0
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBoBs.InitParam.Toolkit=FoBoBs.Bootstrap300
 * }}}
 */
case object Bootstrap300 extends FoBoToolkit {
  FoBoResources.bootstrap300
}

/**
 * Enable usage of Bootstrap version 3_0_1 in your bootstrap liftweb Boot.
 * @version 3.0.1
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBoBs.InitParam.Toolkit=FoBoBs.Bootstrap301
 * }}}
 */
case object Bootstrap301 extends FoBoToolkit {
  FoBoResources.bootstrap301
}


/**
 * Object holding internally used FoBo resources. 
 */
private object FoBoResources { 

  lazy val bootstrap301: Unit = {
    ResourceServer.rewrite {
      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap","3.0.1", "css", "bootstrap.css")
      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "bootstrap","3.0.1", "css", "bootstrap.min.css")
      case "fobo" :: "bootstrap-theme.css" :: Nil if Props.devMode => List("fobo", "bootstrap","3.0.1", "css", "bootstrap-theme.css")
      case "fobo" :: "bootstrap-theme.css" :: Nil => List("fobo", "bootstrap","3.0.1", "css", "bootstrap-theme.min.css")
      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","3.0.1", "js", "bootstrap.js")
      case "fobo" :: "bootstrap.js" :: Nil => List("fobo",  "bootstrap","3.0.1", "js", "bootstrap.min.js")   
    }
  }
  
  lazy val bootstrap300: Unit = {
    ResourceServer.rewrite {
      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap","3.0.0", "css", "bootstrap.css")
      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "bootstrap","3.0.0", "css", "bootstrap.min.css")
      case "fobo" :: "bootstrap-theme.css" :: Nil if Props.devMode => List("fobo", "bootstrap","3.0.0", "css", "bootstrap-theme.css")
      case "fobo" :: "bootstrap-theme.css" :: Nil => List("fobo", "bootstrap","3.0.0", "css", "bootstrap-theme.min.css")
      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","3.0.0", "js", "bootstrap.js")
      case "fobo" :: "bootstrap.js" :: Nil => List("fobo",  "bootstrap","3.0.0", "js", "bootstrap.min.js")   
    }
  }
  
  @deprecated("Use bootstrap300 or later","FoBo v1.1.0")
  lazy val bootstrap300RC1: Unit = {
    ResourceServer.rewrite {
      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap","3.0.0-RC1", "css", "bootstrap.css")
      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "bootstrap","3.0.0-RC1", "css", "bootstrap.min.css")
      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","3.0.0-RC1", "js", "bootstrap.js")
      case "fobo" :: "bootstrap.js" :: Nil => List("fobo",  "bootstrap","3.0.0-RC1", "js", "bootstrap.min.js")   
    }
  }   
    

}
  
}

