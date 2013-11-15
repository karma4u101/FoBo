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
package object FoBoTB {
  
  /**
   * @example In bootstrap liftweb Boot set
   * {{{
   *   FoBoTB.init()
   * }}}
   * The above example just calls init without specifying fobo init 
   * params so default Toolkit and JQuery values will be used. 
   */
  def init() {
    LiftRules.addToPackages("net.liftmodules.FoBoTB")
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
 */
object TBLocInfo {
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
 *   FoBoTB.InitParam.JQuery=FoBoTB.JQuery172
 *   FoBoTB.InitParam.Toolkit=FoBoTB.Bootstrap232
 * }}}
 * This example uses the Bootstrap v2.3.2 option.  
 *   
 */
object InitParam extends FoBoToolkit with FoBoJQuery {
  var ToolKit: FoBoToolkit = null //Bootstrap222
}

/**
 * Enable usage of Twitter Bootstrap version 2_1_0 in your bootstrap liftweb Boot.
 * @version 2.1.0
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBoTB.InitParam.Toolkit=FoBoTB.Bootstrap210
 * }}}
 */
case object Bootstrap210 extends FoBoToolkit {
  FoBoResources.bootstrap210
}

/**
 * Enable usage of Twitter Bootstrap version 2_2_0 in your bootstrap liftweb Boot.
 * @version 2.2.0
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBoTB.InitParam.Toolkit=FoBoTB.Bootstrap220
 * }}}
 */
case object Bootstrap220 extends FoBoToolkit {
  FoBoResources.bootstrap220
}

/**
 * Enable usage of Twitter Bootstrap version 2_2_2 in your bootstrap liftweb Boot.
 * @version 2.2.2
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBoTB.InitParam.Toolkit=FoBoTB.Bootstrap222
 * }}}
 */
case object Bootstrap222 extends FoBoToolkit {
  FoBoResources.bootstrap222
}

/**
 * Enable usage of Twitter Bootstrap version 2_3_0 in your bootstrap liftweb Boot.
 * @version 2.3.0
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBoTB.InitParam.Toolkit=FoBoTB.Bootstrap230
 * }}}
 */
case object Bootstrap230 extends FoBoToolkit {
  FoBoResources.bootstrap230
}

/**
 * Enable usage of Twitter Bootstrap version 2_3_1 in your bootstrap liftweb Boot.
 * @version 2.3.1
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBoTB.InitParam.Toolkit=FoBoTB.Bootstrap231
 * }}}
 */
case object Bootstrap231 extends FoBoToolkit {
  FoBoResources.bootstrap231
}

/**
 * Enable usage of Twitter Bootstrap version 2_3_2 in your bootstrap liftweb Boot.
 * @version 2.3.2
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBoTB.InitParam.Toolkit=FoBoTB.Bootstrap232
 * }}}
 */
case object Bootstrap232 extends FoBoToolkit {
  FoBoResources.bootstrap232
}

/**
 * Object holding internally used FoBo resources. 
 */
private object FoBoResources { 

  lazy val bootstrap232: Unit = {
    ResourceServer.rewrite {
      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap","2.3.2", "css", "bootstrap.css")
      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "bootstrap","2.3.2", "css", "bootstrap-min.css")
      case "fobo" :: "bootstrap-responsive.css" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.2", "css", "responsive.css")
      case "fobo" :: "bootstrap-responsive.css" :: Nil => List("fobo", "bootstrap","2.3.2","css", "responsive-min.css")
      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.2", "js", "bootstrap.js")
      case "fobo" :: "bootstrap.js" :: Nil => List("fobo",  "bootstrap","2.3.2", "js", "bootstrap-min.js")   
    }
  }   
    
  
  lazy val bootstrap231: Unit = {
    ResourceServer.rewrite {
      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap","2.3.1", "css", "bootstrap.css")
      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "bootstrap","2.3.1", "css", "bootstrap-min.css")
      case "fobo" :: "bootstrap-responsive.css" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.1", "css", "responsive.css")
      case "fobo" :: "bootstrap-responsive.css" :: Nil => List("fobo", "bootstrap","2.3.1","css", "responsive-min.css")
      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-all.js")
      case "fobo" :: "bootstrap.js" :: Nil => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-all-min.js")   
      /*js splitt*/
      case "fobo" :: "bootstrap-affix.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-affix.js")
      case "fobo" :: "bootstrap-affix.js" :: Nil => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-affix.js")   

      case "fobo" :: "bootstrap-alert.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-alert.js")
      case "fobo" :: "bootstrap-alert.js" :: Nil => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-alert.js")   

      case "fobo" :: "bootstrap-button.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-button.js")
      case "fobo" :: "bootstrap-button.js" :: Nil => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-button.js")   

      case "fobo" :: "bootstrap-carousel.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-carousel.js")
      case "fobo" :: "bootstrap-carousel.js" :: Nil => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-carousel.js")   
      
      case "fobo" :: "bootstrap-collapse.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-collapse.js")
      case "fobo" :: "bootstrap-collapse.js" :: Nil => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-collapse.js")   

      case "fobo" :: "bootstrap-dropdown.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-dropdown.js")
      case "fobo" :: "bootstrap-dropdown.js" :: Nil => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-dropdown.js")   

      case "fobo" :: "bootstrap-modal.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-modal.js")
      case "fobo" :: "bootstrap-modal.js" :: Nil => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-modal.js")   

      case "fobo" :: "bootstrap-popover.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-popover.js")
      case "fobo" :: "bootstrap-popover.js" :: Nil => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-popover.js")   

      case "fobo" :: "bootstrap-scrollspy.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-scrollspy.js")
      case "fobo" :: "bootstrap-scrollspy.js" :: Nil => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-scrollspy.js")   

      case "fobo" :: "bootstrap-tab.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-tab.js")
      case "fobo" :: "bootstrap-tab.js" :: Nil => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-tab.js")   
 
      case "fobo" :: "bootstrap-tooltip.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-tooltip.js")
      case "fobo" :: "bootstrap-tooltip.js" :: Nil => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-tooltip.js")   

      case "fobo" :: "bootstrap-transition.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-transition.js")
      case "fobo" :: "bootstrap-transition.js" :: Nil => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-transition.js")   

      case "fobo" :: "bootstrap-typeahead.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-typeahead.js")
      case "fobo" :: "bootstrap-typeahead.js" :: Nil => List("fobo",  "bootstrap","2.3.1", "js", "bootstrap-typeahead.js")   
      
    }
  }   
  
  lazy val bootstrap230: Unit = {
    ResourceServer.rewrite {
      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap","2.3.0", "css", "bootstrap.css")
      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "bootstrap","2.3.0", "css", "bootstrap-min.css")
      case "fobo" :: "bootstrap-responsive.css" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.0", "css", "responsive.css")
      case "fobo" :: "bootstrap-responsive.css" :: Nil => List("fobo", "bootstrap","2.3.0","css", "responsive-min.css")
      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-all.js")
      case "fobo" :: "bootstrap.js" :: Nil => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-all-min.js")   
      /*js splitt*/
      case "fobo" :: "bootstrap-affix.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-affix.js")
      case "fobo" :: "bootstrap-affix.js" :: Nil => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-affix.js")   

      case "fobo" :: "bootstrap-alert.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-alert.js")
      case "fobo" :: "bootstrap-alert.js" :: Nil => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-alert.js")   

      case "fobo" :: "bootstrap-button.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-button.js")
      case "fobo" :: "bootstrap-button.js" :: Nil => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-button.js")   

      case "fobo" :: "bootstrap-carousel.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-carousel.js")
      case "fobo" :: "bootstrap-carousel.js" :: Nil => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-carousel.js")   
      
      case "fobo" :: "bootstrap-collapse.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-collapse.js")
      case "fobo" :: "bootstrap-collapse.js" :: Nil => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-collapse.js")   

      case "fobo" :: "bootstrap-dropdown.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-dropdown.js")
      case "fobo" :: "bootstrap-dropdown.js" :: Nil => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-dropdown.js")   

      case "fobo" :: "bootstrap-modal.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-modal.js")
      case "fobo" :: "bootstrap-modal.js" :: Nil => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-modal.js")   

      case "fobo" :: "bootstrap-popover.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-popover.js")
      case "fobo" :: "bootstrap-popover.js" :: Nil => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-popover.js")   

      case "fobo" :: "bootstrap-scrollspy.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-scrollspy.js")
      case "fobo" :: "bootstrap-scrollspy.js" :: Nil => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-scrollspy.js")   

      case "fobo" :: "bootstrap-tab.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-tab.js")
      case "fobo" :: "bootstrap-tab.js" :: Nil => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-tab.js")   
 
      case "fobo" :: "bootstrap-tooltip.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-tooltip.js")
      case "fobo" :: "bootstrap-tooltip.js" :: Nil => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-tooltip.js")   

      case "fobo" :: "bootstrap-transition.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-transition.js")
      case "fobo" :: "bootstrap-transition.js" :: Nil => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-transition.js")   

      case "fobo" :: "bootstrap-typeahead.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-typeahead.js")
      case "fobo" :: "bootstrap-typeahead.js" :: Nil => List("fobo",  "bootstrap","2.3.0", "js", "bootstrap-typeahead.js")   
      
    }
  }     
  
  lazy val bootstrap222: Unit = {
    ResourceServer.rewrite {
      case "fobo" :: "bootstrap-no-icons.css" :: Nil if Props.devMode => List("fobo", "bootstrap","2.2.2", "css", "bootstrap-no-icons.css")
      case "fobo" :: "bootstrap-no-icons.css" :: Nil => List("fobo", "bootstrap","2.2.2", "css", "bootstrap-no-icons-min.css")      
      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap","2.2.2", "css", "bootstrap.css")
      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "bootstrap","2.2.2", "css", "bootstrap-min.css")
      case "fobo" :: "bootstrap-responsive.css" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "css", "responsive.css")
      case "fobo" :: "bootstrap-responsive.css" :: Nil => List("fobo", "bootstrap","2.2.2","css", "responsive-min.css")
      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-all.js")
      case "fobo" :: "bootstrap.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-all.js")   
      /*js splitt*/
      case "fobo" :: "bootstrap-affix.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-affix.js")
      case "fobo" :: "bootstrap-affix.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-affix.js")   

      case "fobo" :: "bootstrap-alert.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-alert.js")
      case "fobo" :: "bootstrap-alert.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-alert.js")   

      case "fobo" :: "bootstrap-button.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-button.js")
      case "fobo" :: "bootstrap-button.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-button.js")   

      case "fobo" :: "bootstrap-carousel.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-carousel.js")
      case "fobo" :: "bootstrap-carousel.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-carousel.js")   
      
      case "fobo" :: "bootstrap-collapse.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-collapse.js")
      case "fobo" :: "bootstrap-collapse.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-collapse.js")   

      case "fobo" :: "bootstrap-dropdown.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-dropdown.js")
      case "fobo" :: "bootstrap-dropdown.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-dropdown.js")   

      case "fobo" :: "bootstrap-modal.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-modal.js")
      case "fobo" :: "bootstrap-modal.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-modal.js")   

      case "fobo" :: "bootstrap-popover.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-popover.js")
      case "fobo" :: "bootstrap-popover.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-popover.js")   

      case "fobo" :: "bootstrap-scrollspy.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-scrollspy.js")
      case "fobo" :: "bootstrap-scrollspy.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-scrollspy.js")   

      case "fobo" :: "bootstrap-tab.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-tab.js")
      case "fobo" :: "bootstrap-tab.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-tab.js")   
 
      case "fobo" :: "bootstrap-tooltip.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-tooltip.js")
      case "fobo" :: "bootstrap-tooltip.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-tooltip.js")   

      case "fobo" :: "bootstrap-transition.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-transition.js")
      case "fobo" :: "bootstrap-transition.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-transition.js")   

      case "fobo" :: "bootstrap-typeahead.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-typeahead.js")
      case "fobo" :: "bootstrap-typeahead.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-typeahead.js")   
      
    }
  }      
  
  lazy val bootstrap220: Unit = {
    ResourceServer.rewrite {
      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap","2.2.0", "css", "bootstrap.css")
      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "bootstrap","2.2.0", "css", "bootstrap-min.css")
      case "fobo" :: "bootstrap-responsive.css" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "css", "responsive.css")
      case "fobo" :: "bootstrap-responsive.css" :: Nil => List("fobo", "bootstrap","2.2.0","css", "responsive-min.css")
      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-all.js")
      case "fobo" :: "bootstrap.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-all.js")   
      /*js splitt*/
      case "fobo" :: "bootstrap-affix.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-affix.js")
      case "fobo" :: "bootstrap-affix.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-affix.js")   

      case "fobo" :: "bootstrap-alert.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-alert.js")
      case "fobo" :: "bootstrap-alert.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-alert.js")   

      case "fobo" :: "bootstrap-button.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-button.js")
      case "fobo" :: "bootstrap-button.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-button.js")   

      case "fobo" :: "bootstrap-carousel.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-carousel.js")
      case "fobo" :: "bootstrap-carousel.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-carousel.js")   
      
      case "fobo" :: "bootstrap-collapse.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-collapse.js")
      case "fobo" :: "bootstrap-collapse.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-collapse.js")   

      case "fobo" :: "bootstrap-dropdown.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-dropdown.js")
      case "fobo" :: "bootstrap-dropdown.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-dropdown.js")   

      case "fobo" :: "bootstrap-modal.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-modal.js")
      case "fobo" :: "bootstrap-modal.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-modal.js")   

      case "fobo" :: "bootstrap-popover.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-popover.js")
      case "fobo" :: "bootstrap-popover.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-popover.js")   

      case "fobo" :: "bootstrap-scrollspy.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-scrollspy.js")
      case "fobo" :: "bootstrap-scrollspy.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-scrollspy.js")   

      case "fobo" :: "bootstrap-tab.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-tab.js")
      case "fobo" :: "bootstrap-tab.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-tab.js")   
 
      case "fobo" :: "bootstrap-tooltip.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-tooltip.js")
      case "fobo" :: "bootstrap-tooltip.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-tooltip.js")   

      case "fobo" :: "bootstrap-transition.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-transition.js")
      case "fobo" :: "bootstrap-transition.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-transition.js")   

      case "fobo" :: "bootstrap-typeahead.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-typeahead.js")
      case "fobo" :: "bootstrap-typeahead.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-typeahead.js")   
      
    }
  }    

  lazy val bootstrap210: Unit = {
    ResourceServer.rewrite {
      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap","2.1.0", "css", "bootstrap.css")
      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "bootstrap","2.1.0", "css", "bootstrap-min.css")
      case "fobo" :: "bootstrap-responsive.css" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "css", "responsive.css")
      case "fobo" :: "bootstrap-responsive.css" :: Nil => List("fobo", "bootstrap","2.1.0","css", "responsive-min.css")
      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-all.js")
      case "fobo" :: "bootstrap.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-all.js")   
      /*js splitt*/
      case "fobo" :: "bootstrap-affix.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-affix.js")
      case "fobo" :: "bootstrap-affix.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-affix.js")   

      case "fobo" :: "bootstrap-alert.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-alert.js")
      case "fobo" :: "bootstrap-alert.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-alert.js")   

      case "fobo" :: "bootstrap-button.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-button.js")
      case "fobo" :: "bootstrap-button.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-button.js")   

      case "fobo" :: "bootstrap-carousel.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-carousel.js")
      case "fobo" :: "bootstrap-carousel.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-carousel.js")   
      
      case "fobo" :: "bootstrap-collapse.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-collapse.js")
      case "fobo" :: "bootstrap-collapse.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-collapse.js")   

      case "fobo" :: "bootstrap-dropdown.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-dropdown.js")
      case "fobo" :: "bootstrap-dropdown.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-dropdown.js")   

      case "fobo" :: "bootstrap-modal.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-modal.js")
      case "fobo" :: "bootstrap-modal.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-modal.js")   

      case "fobo" :: "bootstrap-popover.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-popover.js")
      case "fobo" :: "bootstrap-popover.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-popover.js")   

      case "fobo" :: "bootstrap-scrollspy.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-scrollspy.js")
      case "fobo" :: "bootstrap-scrollspy.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-scrollspy.js")   

      case "fobo" :: "bootstrap-tab.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-tab.js")
      case "fobo" :: "bootstrap-tab.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-tab.js")   
 
      case "fobo" :: "bootstrap-tooltip.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-tooltip.js")
      case "fobo" :: "bootstrap-tooltip.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-tooltip.js")   

      case "fobo" :: "bootstrap-transition.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-transition.js")
      case "fobo" :: "bootstrap-transition.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-transition.js")   

      case "fobo" :: "bootstrap-typeahead.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-typeahead.js")
      case "fobo" :: "bootstrap-typeahead.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-typeahead.js")   
      
    }
  }   


}
  
}

