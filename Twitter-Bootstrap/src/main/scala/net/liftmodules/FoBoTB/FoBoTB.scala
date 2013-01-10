package net.liftmodules

import _root_.net.liftweb._
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
 *  - due to a small footprint and uniform declaration and integration points across toolkit versions only a 
 *    small amount of changes will bee needed for a up/down-grading of a used Toolkit, optimally, if the toolkit 
 *    has no breaking changes it will just be a version change of the FoBo.Initparam in Lift bootstrap.liftweb.Boot. 
 *  - the modules included lib Classes and Snippet helpers will ease you from writing some commonly used toolkit 
 *    component integration scripts making it a simple snippet invocation. 
 *    At this writing the snippet helpers is few but expect the numbers to grow as the module matures. 
 *  - Great mobile scalablity with some mobile enabled toolkits.  
 *  - As more front-end toolkits and JQuery plugins will be available to you just a FoBo.Initparam away you will, 
 *    when needed, be able to quick and easy test out and use nifty features like the Google code Prettify kit, 
 *    DataTables and more.   
 *  - FoBo uses Less to build (using the FoBo-Less project) the bootstrap css files so if you like you 
 *    can (if you fork the module source) easily tweak your bootstrap css (via variables.less) see bootstrap 
 *    documentation form more information.       
 *
 * ===FoBo supported toolkits and plugins=== 
 * 
 * The following is a list of available toolkits and plugins 
 *  
 *  - JQuery  [v1.6.4, v1.7.1, v1.7.2] 
 *  - Bootstrap [v2.1.0, v2.2.0, v2.2.2]
 *  - Foundation [v2.1.4, v2.1.5]
 *  - DataTables [v1.9.0]
 *  - JQuery-mobile [v1.0.1, v1.1.0]
 *  - Google Code Prettify [vJun2011]
 *  - Knockout JS [v2.0.0, v2.1.0]
 *  - FoBo v0.2.0 (comprised of foundation v2.1.5,bootstrap v2.0.0,orbit v1.4.0)
 *  - FoBo v0.1.0 (comprised of foundation v2.1.4,bootstrap v1.4.0,orbit v1.3.0)
 *  
 * ===Okey, okey I get it, now take me to the most interesting stuff===
 * From a user perspective, the most interesting stuff is probably in the snippet classes in [[net.liftmodules.FoBo.snippet.FoBo]].
 * Great care has been taken to explain and illustrate how to use the snippet methods so that you can use them 
 * even if you are not a Lift expert, to show you what I am talking about '''here is a example showing one way to use the tooltip function:'''
 * 
 * ------------------------
 * def '''tooltip''' : CssSel
 * 
   * This function sets a tooltip action on a element.
   *
   * '''Snippet Params:'''
   * 
   *  - '''Param''' ''id'' - The element id 
   *  - '''Param''' ''option'' - The option string see bootstrap documentation for available options.
   * 
   * '''Example''' Showing a example element using the tooltip and the actual snippet invocation  
   * {{{
   *  <a id="aId" 
   *     title="The most powerful, most secure web framework available today. It simply rocks!" 
   *     href="http://liftweb.net/">Lift</a> 
   *  <script data-lift="FoBo.Bootstrap.tooltip?id=#aId&option=placement:'bottom'"></script> 
   * }}}
   * 
   * '''Result:''' The script tag with the snippet invocation will result in the following being injected in place of the snippet invocation:
   * {{{
   *  <a id="aId" 
   *     title="The most powerful, most secure web framework available today. It simply rocks!" 
   *     href="http://liftweb.net/">Lift</a>  
   *   <script type="text/javascript">
   *     // <![CDATA[
   *       $(function () { $('#aId').tooltip({placement:'bottom'}); }); ;
   *     // ]]>
   *   </script> 
   * }}}
 *    
 * ------------------------
 * 
 * ===Small heads up usage warning===
 * 
 * This API is very young (with only snapshot releases) so if you make direct usage of some FoBoHelpers in lib 
 * chances is that things change. 
 * If you want to stay a bit more on the safe side usage of FoBo snippets and init operations should be fairly safe. 
 * After a stable release (we are not there yet) changes to a API method will be announced as deprecated 
 * at least one release cycle before method signature changes or removal.  
 *  
 * ===Help out!===
 * 
 * There is a lot more that can be done within the boundaries of this API and the FoBo module as a hole so  
 * your help, suggestions, encouragement, engagement, patches (pull requests) bug-fixes/reports are highly appreciated.     
 *      
 * ===Setup===     
 * 
 *  - The module is known to work with Lift v2.4/v2.5-SNAPSHOT and Scala v2.9.2 but expect it to work with other versions as well.  
 *  - For a demonstration of this module see the live [[http://www.media4u101.se/fobo-lift-template-demo/ FoBo demo]] the 
 *    FoBo demo source is available [[https://github.com/karma4u101/FoBo-Lift-Template  here]] 
 *
 * @example To initiate this module for usage in your Lift project 
 * set something like the following in the projects Lift bootstrap.liftweb.Boot  
 * {{{
 *    import net.liftmodules.FoBo
 *     :
 *     :
 *    //If using defaults FoBo init params can be omitted
 *    FoBo.InitParam.JQuery=FoBo.JQueryXXX  //one jquery version
 *    FoBo.InitParam.ToolKit=FoBo.TheFirstToolkitXXX //one or more toolkits 
 *    FoBo.InitParam.ToolKit=FoBo.TheSecondToolkitYYY
 *     : 
 *    FoBo.init() //now do init
 * }}}
 * 
 * @version v0.7.6
 * @author Peter Petersson (Github karma4u101), The Lift community  
 * 
 */
package object FoBoTB {
  
  /**
   * @example In bootstrap liftweb Boot set
   * {{{
   *   FoBo.init()
   * }}}
   * The above example just calls init without specifying fobo init 
   * params so default Toolkit and JQuery values will be used. 
   */
  def init() {
    LiftRules.addToPackages("net.liftmodules.FoBo")
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
 *   FoBo.InitParam.JQuery=FoBo.JQuery172
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap222
 *   FoBo.InitParam.Toolkit=FoBo.PrettifyJun2011
 * }}}
 * This example uses the Bootstrap v2.2.2 option and adds the Google code Prettify vJun2011 
 * to the enabled toolkits.  
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
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap210
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
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap220
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
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap222
 * }}}
 */
case object Bootstrap222 extends FoBoToolkit {
  FoBoResources.bootstrap222
}

/**
 * Object holding internally used FoBo resources. 
 */
private object FoBoResources { 
  
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

