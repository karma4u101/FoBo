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
 *  - Bootstrap [v1.4.0, v2.0.0, v2.0.4, v2.1.0, v2.2.0, v2.2.2]
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
  var JQuery: FoBoJQuery = JQuery182
  var ToolKit: FoBoToolkit = null //Bootstrap222
}


/**
 * Enable usage of KnockOut version 2_0_0 in your bootstrap liftweb Boot.
 * @version 2.0.0
 * 
 *  '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.KnockOut200
 * }}}
 *  
 */
case object Knockout210 extends FoBoToolkit {
  FoBoResources.knockout210
}
/**
 * Enable usage of KnockOut version 2_1_0 in your bootstrap liftweb Boot.
 * @version 2.1.0
 * 
 *  '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.KnockOut210
 * }}}
 *  
 */
case object Knockout200 extends FoBoToolkit {
  FoBoResources.knockout200
}
/**
 * Enable usage of DataTables version 1_9_0 in your bootstrap liftweb Boot.
 * @version 1.9.0
 * 
 *  '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.DataTables190
 * }}}
 *  
 */
case object DataTables190 extends FoBoToolkit {
   FoBoResources.dataTables190
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
 */
case object PrettifyJun2011 extends FoBoToolkit {
   FoBoResources.googleCodePrettify
}

/**
 * Enable usage of JQuery version 1_8_2 in your bootstrap liftweb Boot.
 * @version 1.8.2
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.JQuery=FoBo.JQuery182
 * }}}
 */
case object JQuery182 extends FoBoJQuery {
  FoBoResources.jquery182
}

/**
 * Enable usage of JQuery version 1_7_2 in your bootstrap liftweb Boot.
 * @version 1.7.2
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.JQuery=FoBo.JQuery172
 * }}}
 */
case object JQuery172 extends FoBoJQuery {
  FoBoResources.jquery172
}

/**
 * Enable usage of JQuery version 1_7_1 in your bootstrap liftweb Boot.
 * @version 1.7.1
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.JQuery=FoBo.JQuery171
 * }}}
 */
@deprecated("Use JQuery172 or the Lift-JQuery-Module","FoBo v0.7.3") 
case object JQuery171 extends FoBoJQuery {
  FoBoResources.jquery171
}

/**
 * 
 * Enable usage of JQuery version 1_6_4 in your bootstrap liftweb Boot.
 * 
 * @version 1.6.4 
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.JQuery=FoBo.JQuery164
 * }}}
 */ 
@deprecated("Use JQuery172 or the Lift-JQuery-Module","FoBo v0.7.3") 
case object JQuery164 extends FoBoJQuery {
  FoBoResources.jquery164
}

/**
 * Enable usage of JQueryMobile version 1_0_1 in your liftweb Boot.
 * 
 * @version 1.0.1
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.JQueryMobile101
 * }}}
 */
@deprecated("Use JQueryMobile110","FoBo v0.7.3") 
case object JQueryMobile101 extends FoBoToolkit {
  FoBoResources.jquerymobile101
}

/**
 * Enable usage of JQueryMobile version 1_1_0 in your liftweb Boot.
 * 
 * @version 1.0.1
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.JQueryMobile110
 * }}}
 */
case object JQueryMobile110 extends FoBoToolkit {
  FoBoResources.jquerymobile110
}

///**
// * Enable usage of FoBo version 0_2_0 in your bootstrap liftweb Boot.
// * 
// * @version 0.2.0
// * 
// * '''Example'''
// * 
// * {{{
// *   FoBo.InitParam.Toolkit=FoBo.FoBo020
// * }}}
// */
//@deprecated("Use Bootstrap210 or newer","FoBo v0.7.3") 
//case object FoBo020 extends FoBoToolkit {
//  FoBoResources.fobo020
//  FoBoResources.bootstrap200
//  FoBoResources.foundation215
//}

///**
// * Enable usage of FoBo version 0_1_0 in your bootstrap liftweb Boot.
// * 
// * @version 0.1.0
// * 
// * '''Example'''
// * 
// * {{{
// *   FoBo.InitParam.Toolkit=FoBo.FoBo010
// * }}}
// */
//@deprecated("Use Bootstrap210 or newer","FoBo v0.7.3") 
//case object FoBo010 extends FoBoToolkit {
//  FoBoResources.fobo010
//  FoBoResources.bootstrap140
//  FoBoResources.foundation214
//}

//
///**
// * Enable usage of Twitter Bootstrap version 1_4_0 in your bootstrap liftweb Boot.
// * 
// * @version 1.4.0
// * 
// * '''Example'''
// * 
// * {{{
// *   FoBo.InitParam.Toolkit=FoBo.Bootstrap140
// * }}}
// */
//@deprecated("Use Bootstrap210 or newer","FoBo v0.7.3") 
//case object Bootstrap140 extends FoBoToolkit {
//  net.liftmodules.FoBoTB.Bootstrap140
//}

///**
// * Enable usage of Twitter Bootstrap version 2_0_0 in your bootstrap liftweb Boot.
// * @version 2.0.0
// * 
// * '''Example'''
// * 
// * {{{
// *   FoBo.InitParam.Toolkit=FoBo.Bootstrap200
// * }}}
// */
//@deprecated("Use Bootstrap210 or newer","FoBo v0.7.3") 
//case object Bootstrap200 extends FoBoToolkit {
//  net.liftmodules.FoBoTB.Bootstrap200
//}

///**
// * Enable usage of Twitter Bootstrap version 2_0_4 in your bootstrap liftweb Boot.
// * @version 2.0.4
// * 
// * '''Example'''
// * 
// * {{{
// *   FoBo.InitParam.Toolkit=FoBo.Bootstrap204
// * }}}
// */
//@deprecated("Use Bootstrap210 or newer","FoBo v0.7.3")
//case object Bootstrap204 extends FoBoToolkit {
//  net.liftmodules.FoBoTB.Bootstrap204
//}


/**
 * Enable usage of Font-Awesome version 3_0_0 in your bootstrap liftweb Boot.
 * @version 3.0.0
 * 
 *  '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.FontAwesome300
 * }}}
 *  
 */
case object FontAwesome300 extends FoBoToolkit {
   net.liftmodules.FoBoFA.FontAwesome300
}

/**
 * Enable usage of Font-Awesome version 2_0_0 in your bootstrap liftweb Boot.
 * @version 2.0.0
 * 
 *  '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.FontAwesome200
 * }}}
 *  
 */
case object FontAwesome200 extends FoBoToolkit {
   net.liftmodules.FoBoFA.FontAwesome200
}

/**
 * Enable usage of Font-Awesome version 2_0_0 in your bootstrap liftweb Boot.
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
 *  
 */
case object FontAwesome200TB222 extends FoBoToolkit {
   net.liftmodules.FoBoFA.FontAwesome200TB222
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
  net.liftmodules.FoBoTB.Bootstrap210
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
  net.liftmodules.FoBoTB.Bootstrap220
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
  net.liftmodules.FoBoTB.Bootstrap222
}

/**
 * Enable usage of Twitter Bootstrap version 2_3_0 in your bootstrap liftweb Boot.
 * @version 2.3.0
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap230
 * }}}
 */
case object Bootstrap230 extends FoBoToolkit {
  net.liftmodules.FoBoTB.Bootstrap230
}

/**
 * Enable usage of Foundation version 2_1_4 in your bootstrap liftweb Boot.
 * @version 2.1.4
 * 
 * '''Example'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.Foundation214
 * }}}
 */
@deprecated("Use Foundation215","FoBo v0.7.3") 
case object Foundation214 extends FoBoToolkit {
  FoBoResources.foundation214
}

/**
 * Enable usage of Foundation version 2_1_5 in your bootstrap liftweb Boot.
 * @version 2.1.5
 * 
 * '''Example'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.Foundation215
 * }}}
 */
case object Foundation215 extends FoBoToolkit {
  FoBoResources.foundation215
}


/**
 * Object holding internally used FoBo resources. 
 */
private object FoBoResources {
   
  lazy val knockout200 = {
    ResourceServer.rewrite {
      case "fobo" :: "knockout.js" :: Nil if Props.devMode => List("fobo", "knockout", "2.0.0", "js", "knockout-2.0.0.debug.js")
      case "fobo" :: "knockout.js" :: Nil => List("fobo", "knockout", "2.0.0", "js", "knockout-2.0.0.js")         
    }
  }
  lazy val knockout210 = {
    ResourceServer.rewrite {
      case "fobo" :: "knockout.js" :: Nil if Props.devMode => List("fobo", "knockout", "2.1.0", "js", "knockout-2.1.0.debug.js")
      case "fobo" :: "knockout.js" :: Nil => List("fobo", "knockout", "2.1.0", "js", "knockout-2.1.0.js")         
    }
  }  
  
  lazy val dataTables190 = {
    ResourceServer.rewrite {

      case "fobo" :: "jquery.dataTables.css" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "css", "jquery.dataTables.css")
      case "fobo" :: "jquery.dataTables.css" :: Nil => List("fobo", "datatables", "1.9.0", "css", "jquery.dataTables-min.css")          
      
      case "fobo" :: "jquery.dataTables_themeroller.css" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "css", "jquery.dataTables_themeroller.css")
      case "fobo" :: "jquery.dataTables_themeroller.css" :: Nil => List("fobo", "datatables", "1.9.0", "css", "jquery.dataTables_themeroller-min.css")          
            
      case "fobo" :: "AutoFill.css" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "css", "AutoFill.css")
      case "fobo" :: "AutoFill.css" :: Nil => List("fobo", "datatables", "1.9.0", "css", "AutoFill-min.css")
      
      case "fobo" :: "ColReorder.css" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "css", "ColReorder.css")
      case "fobo" :: "ColReorder.css" :: Nil => List("fobo", "datatables", "1.9.0", "css", "ColReorder-min.css")

      case "fobo" :: "ColVis.css" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "css", "ColVis.css")
      case "fobo" :: "ColVis.css" :: Nil => List("fobo", "datatables", "1.9.0", "css", "ColVis-min.css")
      
      case "fobo" :: "ColVisAlt.css" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "css", "ColVisAlt.css")
      case "fobo" :: "ColVisAlt.css" :: Nil => List("fobo", "datatables", "1.9.0", "css", "ColVisAlt-min.css")    
      
      case "fobo" :: "TableTools_JUI.css" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "css", "TableTools_JUI.css")
      case "fobo" :: "TableTools_JUI.css" :: Nil => List("fobo", "datatables", "1.9.0", "css", "TableTools_JUI-min.css")    

      case "fobo" :: "TableTools.css" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "css", "TableTools.css")
      case "fobo" :: "TableTools.css" :: Nil => List("fobo", "datatables", "1.9.0", "css", "TableTools-min.css")    

      
      case "fobo" :: "themes" :: "smoothness.css" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "themes", "smoothness", "jquery-ui-1.8.4.custom.css") 
      case "fobo" :: "themes" :: "smoothness.css" :: Nil => List("fobo", "datatables", "1.9.0", "themes", "smoothness", "jquery-ui-1.8.4.custom-min.css") 

      case "fobo" :: "themes" :: "ui-lightness.css" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "themes", "ui-lightness", "jquery-ui-1.8.4.custom.css") 
      case "fobo" :: "themes" :: "ui-lightness.css" :: Nil => List("fobo", "datatables", "1.9.0", "themes", "ui-lightness", "jquery-ui-1.8.4.custom-min.css") 
      
      
      case "fobo" :: "jquery.dataTables.js" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "js", "jquery.dataTables.js")
      case "fobo" :: "jquery.dataTables.js" :: Nil => List("fobo", "datatables", "1.9.0", "js", "jquery.dataTables.js")
      
      case "fobo" :: "AutoFill.js" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "js", "AutoFill.js")
      case "fobo" :: "AutoFill.js" :: Nil => List("fobo", "datatables", "1.9.0", "js", "AutoFill.js")    
      
      case "fobo" :: "ColReorder.js" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "js", "ColReorder.js")
      case "fobo" :: "ColReorder.js" :: Nil => List("fobo", "datatables", "1.9.0", "js", "ColReorder.js")    

      case "fobo" :: "ColVis.js" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "js", "ColVis.js")
      case "fobo" :: "ColVis.js" :: Nil => List("fobo", "datatables", "1.9.0", "js", "ColVis.js")    

      case "fobo" :: "FixedColumns.js" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "js", "FixedColumns.js")
      case "fobo" :: "FixedColumns.js" :: Nil => List("fobo", "datatables", "1.9.0", "js", "FixedColumns.js")   
      
      case "fobo" :: "FixedHeader.js" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "js", "FixedHeader.js")
      case "fobo" :: "FixedHeader.js" :: Nil => List("fobo", "datatables", "1.9.0", "js", "FixedHeader.js")   

      case "fobo" :: "KeyTable.js" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "js", "KeyTable.js")
      case "fobo" :: "KeyTable.js" :: Nil => List("fobo", "datatables", "1.9.0", "js", "KeyTable.js")   

      case "fobo" :: "Scroller.js" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "js", "Scroller.js")
      case "fobo" :: "Scroller.js" :: Nil => List("fobo", "datatables", "1.9.0", "js", "Scroller.js")   

      case "fobo" :: "TableTools.js" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "js", "TableTools.js")
      case "fobo" :: "TableTools.js" :: Nil => List("fobo", "datatables", "1.9.0", "js", "TableTools.js")   

      case "fobo" :: "ZeroClipboard.js" :: Nil if Props.devMode => List("fobo", "datatables", "1.9.0", "js", "ZeroClipboard.js")
      case "fobo" :: "ZeroClipboard.js" :: Nil => List("fobo", "datatables", "1.9.0", "js", "ZeroClipboard.js")   
      
      
      case "fobo" :: "copy_cvs_xls_pdf.swf" :: Nil => List("fobo", "datatables", "1.9.0", "swf", "copy_cvs_xls_pdf.swf") 
      case "fobo" :: "copy_cvs_xls.swf" :: Nil => List("fobo", "datatables", "1.9.0", "swf", "copy_cvs_xls.swf") 
      
    }
  }
  
//  lazy val fobo020 = {
//    ResourceServer.rewrite {
//      /*includes foundation bootstrap and orbit css*/
//      /*All in on fobo tweaked css (except ie)*/
//      case "fobo" :: "fobo.css" :: Nil if Props.devMode => List("fobo", "fobo", "0.2", "css", "fobo.css")
//      case "fobo" :: "fobo.css" :: Nil => List("fobo", "fobo", "0.2", "css", "fobo-min.css")
//    }
//  }
//
//  lazy val fobo010 = {
//    ResourceServer.rewrite {
//      /*includes foundation bootstrap and orbit css*/
//      /*All in on fobo tweaked css (except ie)*/
//      case "fobo" :: "fobo.css" :: Nil if Props.devMode => List("fobo", "fobo", "0.1", "css", "fobo.css")
//      case "fobo" :: "fobo.css" :: Nil => List("fobo", "fobo", "0.1", "css", "fobo-min.css")
//    }
//  }

  lazy val jquerymobile101 = {
    ResourceServer.rewrite {
      case "fobo" :: "jquery.mobile.css" :: Nil if Props.devMode => List("fobo", "jquery-mobile", "1.0.1", "css", "jquery.mobile-1.0.1.css")
      case "fobo" :: "jquery.mobile.css" :: Nil => List("fobo", "jquery-mobile", "1.0.1", "css", "jquery.mobile-1.0.1-min.css")

      case "fobo" :: "jquery.mobile.structure.css" :: Nil if Props.devMode => List("fobo", "jquery-mobile", "1.0.1", "css", "jquery.mobile.structure-1.0.1.css")
      case "fobo" :: "jquery.mobile.structure.css" :: Nil => List("fobo", "jquery-mobile", "1.0.1", "css", "jquery.mobile.structure-1.0.1-min.css")
      
      case "fobo" :: "jquery.mobile.js" :: Nil if Props.devMode => List("fobo", "jquery-mobile", "1.0.1", "js", "jquery.mobile-1.0.1.js")
      case "fobo" :: "jquery.mobile.js" :: Nil => List("fobo", "jquery-mobile", "1.0.1", "js", "jquery.mobile-1.0.1.js") 

      case "fobo" :: "jquery.mobile.themeswitcher.js" :: Nil if Props.devMode => List("fobo", "jquery-mobile", "1.0.1", "js", "jquery.mobile.themeswitcher.js")
      case "fobo" :: "jquery.mobile.themeswitcher.js" :: Nil => List("fobo", "jquery-mobile", "1.0.1", "js", "jquery.mobile.themeswitcher.js") 

    }
  }
  
   lazy val jquerymobile110 = {
    ResourceServer.rewrite {
      case "fobo" :: "jquery.mobile.css" :: Nil if Props.devMode => List("fobo", "jquery-mobile", "1.1.0", "css", "jquery.mobile-1.1.0.css")
      case "fobo" :: "jquery.mobile.css" :: Nil => List("fobo", "jquery-mobile", "1.1.0", "css", "jquery.mobile-1.1.0-min.css")

      case "fobo" :: "jquery.mobile.structure.css" :: Nil if Props.devMode => List("fobo", "jquery-mobile", "1.1.0", "css", "jquery.mobile.structure-1.1.0.css")
      case "fobo" :: "jquery.mobile.structure.css" :: Nil => List("fobo", "jquery-mobile", "1.1.0", "css", "jquery.mobile.structure-1.1.0-min.css")
      
      case "fobo" :: "jquery.mobile.theme.css" :: Nil if Props.devMode => List("fobo", "jquery-mobile", "1.1.0", "css", "jquery.mobile.theme-1.1.0.css")
      case "fobo" :: "jquery.mobile.theme.css" :: Nil => List("fobo", "jquery-mobile", "1.1.0", "css", "jquery.mobile.theme-1.1.0-min.css")
      
      case "fobo" :: "jquery.mobile.js" :: Nil if Props.devMode => List("fobo", "jquery-mobile", "1.1.0", "js", "jquery.mobile-1.1.0.js")
      case "fobo" :: "jquery.mobile.js" :: Nil => List("fobo", "jquery-mobile", "1.1.0", "js", "jquery.mobile-1.1.0.js") 
      
      case "fobo" :: "jquery.mobile.themeswitcher.js" :: Nil if Props.devMode => List("fobo", "jquery-mobile", "1.1.0", "js", "jquery.mobile.themeswitcher.js")
      case "fobo" :: "jquery.mobile.themeswitcher.js" :: Nil => List("fobo", "jquery-mobile", "1.1.0", "js", "jquery.mobile.themeswitcher.js") 
    
    }
  }
   
  lazy val jquery182 = {
    ResourceServer.rewrite {//fetched from the jquery module
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "1.8.2", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "1.8.2", "js", "jquery-min.js")
    }
  }   
   
  lazy val jquery172 = {
    ResourceServer.rewrite {
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "1.7.2", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "1.7.2", "js", "jquery-min.js")
    }
  }
  
  lazy val jquery171 = {
    ResourceServer.rewrite {
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "1.7.1", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "1.7.1", "js", "jquery-min.js")
    }
  }

  lazy val jquery164 = {
    ResourceServer.rewrite {
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "1.6.4", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "1.6.4", "js", "jquery-min.js")
    }
  }

  lazy val googleCodePrettify: Unit = {
    ResourceServer.rewrite {
      /*Google code prettify*/
      case "fobo" :: "prettify.css" :: Nil if Props.devMode => List("fobo", "google-code", "css", "prettify.css")
      case "fobo" :: "prettify.css" :: Nil => List("fobo", "google-code", "css", "prettify-min.css")
 
      case "fobo" :: "desert.css" :: Nil if Props.devMode => List("fobo", "google-code", "css", "desert.css")
      case "fobo" :: "desert.css" :: Nil => List("fobo", "google-code", "css", "desert-min.css")

      case "fobo" :: "sunburst.css" :: Nil if Props.devMode => List("fobo", "google-code", "css", "sunburst.css")
      case "fobo" :: "sunburst.css" :: Nil => List("fobo", "google-code", "css", "sunburst-min.css")
      
      /*google code prettify*/
      case "fobo" :: "prettify.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "prettify.js")
      case "fobo" :: "prettify.js" :: Nil => List("fobo", "google-code", "js", "prettify.js")
      
      case "fobo" :: "lang-scala.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-scala.js")
      case "fobo" :: "lang-scala.js" :: Nil => List("fobo", "google-code", "js", "lang-scala.js")      
      
      case "fobo" :: "lang-apollo.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-apollo.js")
      case "fobo" :: "lang-apollo.js" :: Nil => List("fobo", "google-code", "js", "lang-apollo.js")            

      case "fobo" :: "lang-clj.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-clj.js")
      case "fobo" :: "lang-clj.js" :: Nil => List("fobo", "google-code", "js", "lang-clj.js")     

      case "fobo" :: "lang-css.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-css.js")
      case "fobo" :: "lang-css.js" :: Nil => List("fobo", "google-code", "js", "lang-css.js")     

      case "fobo" :: "lang-hs.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-hs.js")
      case "fobo" :: "lang-hs.js" :: Nil => List("fobo", "google-code", "js", "lang-hs.js")     

      case "fobo" :: "lang-lisp.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-lisp.js")
      case "fobo" :: "lang-lisp.js" :: Nil => List("fobo", "google-code", "js", "lang-lisp.js")     

      case "fobo" :: "lang-lua.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-lua.js")
      case "fobo" :: "lang-lua.js" :: Nil => List("fobo", "google-code", "js", "lang-lua.js")     

      case "fobo" :: "lang-ml.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-ml.js")
      case "fobo" :: "lang-ml.js" :: Nil => List("fobo", "google-code", "js", "lang-ml.js")     

      case "fobo" :: "lang-n.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-n.js")
      case "fobo" :: "lang-n.js" :: Nil => List("fobo", "google-code", "js", "lang-n.js")     

      case "fobo" :: "lang-proto.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-proto.js")
      case "fobo" :: "lang-proto.js" :: Nil => List("fobo", "google-code", "js", "lang-proto.js")           

      case "fobo" :: "lang-sql.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-sql.js")
      case "fobo" :: "lang-sql.js" :: Nil => List("fobo", "google-code", "js", "lang-sql.js")     

      case "fobo" :: "lang-tex.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-tex.js")
      case "fobo" :: "lang-tex.js" :: Nil => List("fobo", "google-code", "js", "lang-tex.js")     

      case "fobo" :: "lang-vb.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-vb.js")
      case "fobo" :: "lang-vb.js" :: Nil => List("fobo", "google-code", "js", "lang-vb.js")     

      case "fobo" :: "lang-vhdl.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-vhdl.js")
      case "fobo" :: "lang-vhdl.js" :: Nil => List("fobo", "google-code", "js", "lang-vhdl.js")     

      case "fobo" :: "lang-wiki.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-wiki.js")
      case "fobo" :: "lang-wiki.js" :: Nil => List("fobo", "google-code", "js", "lang-wiki.js")     

      case "fobo" :: "lang-xq.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-xq.js")
      case "fobo" :: "lang-xq.js" :: Nil => List("fobo", "google-code", "js", "lang-xq.js")     

      case "fobo" :: "lang-yaml.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-yaml.js")
      case "fobo" :: "lang-yaml.js" :: Nil => List("fobo", "google-code", "js", "lang-yaml.js")             
           
    }
  }
  
//  lazy val fontAwesome200 = {
//    ResourceServer.rewrite {
//      case "fobo" :: "font-awesome.css" :: Nil if Props.devMode => List("fobo", "font-awesome", "2.0.0", "css", "font-awesome.css")
//      case "fobo" :: "font-awesome.css" :: Nil => List("fobo", "font-awesome", "2.0.0", "css", "font-awesome-min.css")         
//    }
//  }  
  
//  lazy val bootstrap222: Unit = {
//    ResourceServer.rewrite {
//      case "fobo" :: "bootstrap-no-icons.css" :: Nil if Props.devMode => List("fobo", "bootstrap","2.2.2", "css", "bootstrap-no-icons.css")
//      case "fobo" :: "bootstrap-no-icons.css" :: Nil => List("fobo", "bootstrap","2.2.2", "css", "bootstrap-no-icons-min.css")      
//      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap","2.2.2", "css", "bootstrap.css")
//      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "bootstrap","2.2.2", "css", "bootstrap-min.css")
//      case "fobo" :: "bootstrap-responsive.css" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "css", "responsive.css")
//      case "fobo" :: "bootstrap-responsive.css" :: Nil => List("fobo", "bootstrap","2.2.2","css", "responsive-min.css")
//      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-all.js")
//      case "fobo" :: "bootstrap.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-all.js")   
//      /*js splitt*/
//      case "fobo" :: "bootstrap-affix.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-affix.js")
//      case "fobo" :: "bootstrap-affix.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-affix.js")   
//
//      case "fobo" :: "bootstrap-alert.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-alert.js")
//      case "fobo" :: "bootstrap-alert.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-alert.js")   
//
//      case "fobo" :: "bootstrap-button.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-button.js")
//      case "fobo" :: "bootstrap-button.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-button.js")   
//
//      case "fobo" :: "bootstrap-carousel.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-carousel.js")
//      case "fobo" :: "bootstrap-carousel.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-carousel.js")   
//      
//      case "fobo" :: "bootstrap-collapse.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-collapse.js")
//      case "fobo" :: "bootstrap-collapse.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-collapse.js")   
//
//      case "fobo" :: "bootstrap-dropdown.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-dropdown.js")
//      case "fobo" :: "bootstrap-dropdown.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-dropdown.js")   
//
//      case "fobo" :: "bootstrap-modal.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-modal.js")
//      case "fobo" :: "bootstrap-modal.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-modal.js")   
//
//      case "fobo" :: "bootstrap-popover.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-popover.js")
//      case "fobo" :: "bootstrap-popover.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-popover.js")   
//
//      case "fobo" :: "bootstrap-scrollspy.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-scrollspy.js")
//      case "fobo" :: "bootstrap-scrollspy.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-scrollspy.js")   
//
//      case "fobo" :: "bootstrap-tab.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-tab.js")
//      case "fobo" :: "bootstrap-tab.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-tab.js")   
// 
//      case "fobo" :: "bootstrap-tooltip.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-tooltip.js")
//      case "fobo" :: "bootstrap-tooltip.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-tooltip.js")   
//
//      case "fobo" :: "bootstrap-transition.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-transition.js")
//      case "fobo" :: "bootstrap-transition.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-transition.js")   
//
//      case "fobo" :: "bootstrap-typeahead.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-typeahead.js")
//      case "fobo" :: "bootstrap-typeahead.js" :: Nil => List("fobo",  "bootstrap","2.2.2", "js", "bootstrap-typeahead.js")   
//      
//    }
//  }      
  
//  lazy val bootstrap220: Unit = {
//    ResourceServer.rewrite {
//      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap","2.2.0", "css", "bootstrap.css")
//      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "bootstrap","2.2.0", "css", "bootstrap-min.css")
//      case "fobo" :: "bootstrap-responsive.css" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "css", "responsive.css")
//      case "fobo" :: "bootstrap-responsive.css" :: Nil => List("fobo", "bootstrap","2.2.0","css", "responsive-min.css")
//      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-all.js")
//      case "fobo" :: "bootstrap.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-all.js")   
//      /*js splitt*/
//      case "fobo" :: "bootstrap-affix.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-affix.js")
//      case "fobo" :: "bootstrap-affix.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-affix.js")   
//
//      case "fobo" :: "bootstrap-alert.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-alert.js")
//      case "fobo" :: "bootstrap-alert.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-alert.js")   
//
//      case "fobo" :: "bootstrap-button.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-button.js")
//      case "fobo" :: "bootstrap-button.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-button.js")   
//
//      case "fobo" :: "bootstrap-carousel.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-carousel.js")
//      case "fobo" :: "bootstrap-carousel.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-carousel.js")   
//      
//      case "fobo" :: "bootstrap-collapse.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-collapse.js")
//      case "fobo" :: "bootstrap-collapse.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-collapse.js")   
//
//      case "fobo" :: "bootstrap-dropdown.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-dropdown.js")
//      case "fobo" :: "bootstrap-dropdown.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-dropdown.js")   
//
//      case "fobo" :: "bootstrap-modal.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-modal.js")
//      case "fobo" :: "bootstrap-modal.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-modal.js")   
//
//      case "fobo" :: "bootstrap-popover.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-popover.js")
//      case "fobo" :: "bootstrap-popover.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-popover.js")   
//
//      case "fobo" :: "bootstrap-scrollspy.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-scrollspy.js")
//      case "fobo" :: "bootstrap-scrollspy.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-scrollspy.js")   
//
//      case "fobo" :: "bootstrap-tab.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-tab.js")
//      case "fobo" :: "bootstrap-tab.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-tab.js")   
// 
//      case "fobo" :: "bootstrap-tooltip.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-tooltip.js")
//      case "fobo" :: "bootstrap-tooltip.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-tooltip.js")   
//
//      case "fobo" :: "bootstrap-transition.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-transition.js")
//      case "fobo" :: "bootstrap-transition.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-transition.js")   
//
//      case "fobo" :: "bootstrap-typeahead.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-typeahead.js")
//      case "fobo" :: "bootstrap-typeahead.js" :: Nil => List("fobo",  "bootstrap","2.2.0", "js", "bootstrap-typeahead.js")   
//      
//    }
//  }    

//  lazy val bootstrap210: Unit = {
//    ResourceServer.rewrite {
//      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap","2.1.0", "css", "bootstrap.css")
//      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "bootstrap","2.1.0", "css", "bootstrap-min.css")
//      case "fobo" :: "bootstrap-responsive.css" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "css", "responsive.css")
//      case "fobo" :: "bootstrap-responsive.css" :: Nil => List("fobo", "bootstrap","2.1.0","css", "responsive-min.css")
//      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-all.js")
//      case "fobo" :: "bootstrap.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-all.js")   
//      /*js splitt*/
//      case "fobo" :: "bootstrap-affix.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-affix.js")
//      case "fobo" :: "bootstrap-affix.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-affix.js")   
//
//      case "fobo" :: "bootstrap-alert.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-alert.js")
//      case "fobo" :: "bootstrap-alert.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-alert.js")   
//
//      case "fobo" :: "bootstrap-button.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-button.js")
//      case "fobo" :: "bootstrap-button.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-button.js")   
//
//      case "fobo" :: "bootstrap-carousel.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-carousel.js")
//      case "fobo" :: "bootstrap-carousel.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-carousel.js")   
//      
//      case "fobo" :: "bootstrap-collapse.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-collapse.js")
//      case "fobo" :: "bootstrap-collapse.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-collapse.js")   
//
//      case "fobo" :: "bootstrap-dropdown.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-dropdown.js")
//      case "fobo" :: "bootstrap-dropdown.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-dropdown.js")   
//
//      case "fobo" :: "bootstrap-modal.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-modal.js")
//      case "fobo" :: "bootstrap-modal.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-modal.js")   
//
//      case "fobo" :: "bootstrap-popover.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-popover.js")
//      case "fobo" :: "bootstrap-popover.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-popover.js")   
//
//      case "fobo" :: "bootstrap-scrollspy.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-scrollspy.js")
//      case "fobo" :: "bootstrap-scrollspy.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-scrollspy.js")   
//
//      case "fobo" :: "bootstrap-tab.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-tab.js")
//      case "fobo" :: "bootstrap-tab.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-tab.js")   
// 
//      case "fobo" :: "bootstrap-tooltip.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-tooltip.js")
//      case "fobo" :: "bootstrap-tooltip.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-tooltip.js")   
//
//      case "fobo" :: "bootstrap-transition.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-transition.js")
//      case "fobo" :: "bootstrap-transition.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-transition.js")   
//
//      case "fobo" :: "bootstrap-typeahead.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-typeahead.js")
//      case "fobo" :: "bootstrap-typeahead.js" :: Nil => List("fobo",  "bootstrap","2.1.0", "js", "bootstrap-typeahead.js")   
//      
//    }
//  }  
  
//  lazy val bootstrap204: Unit = {
//    ResourceServer.rewrite {
//      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap","2.0.4", "css", "bootstrap.css")
//      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "bootstrap","2.0.4", "css", "bootstrap-min.css")
//      case "fobo" :: "bootstrap-responsive.css" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.0.4", "css", "responsive.css")
//      case "fobo" :: "bootstrap-responsive.css" :: Nil => List("fobo", "bootstrap","2.0.4","css", "responsive-min.css")
//      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.0.4", "js", "bootstrap.js")
//      case "fobo" :: "bootstrap.js" :: Nil => List("fobo",  "bootstrap","2.0.4", "js", "bootstrap.js")      
//    }
//  }
    
//  lazy val bootstrap200: Unit = {
//    ResourceServer.rewrite {
//      /*Separate orgin css*/
//      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap","2.0.0", "css", "bootstrap.css")
//      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "bootstrap","2.0.0", "css", "bootstrap-min.css")
//      case "fobo" :: "bootstrap-responsive.css" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.0.0", "css", "responsive.css")
//      case "fobo" :: "bootstrap-responsive.css" :: Nil => List("fobo", "orgin", "bootstrap","2.0.0", "css", "responsive-min.css")
//      /*All in one script*/
//      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-all.js")
//      case "fobo" :: "bootstrap.js" :: Nil => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-all.js")
//      /*split from all script*/
//      case "fobo" :: "bootstrap-alert.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-alert.js")
//      case "fobo" :: "bootstrap-alert.js" :: Nil => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-alert.js")
//      case "fobo" :: "bootstrap-button.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-button.js")
//      case "fobo" :: "bootstrap-button.js" :: Nil => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-button.js")
//      case "fobo" :: "bootstrap-carousel.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-carousel.js")
//      case "fobo" :: "bootstrap-carousel.js" :: Nil => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-carousel.js")
//      case "fobo" :: "bootstrap-collapse.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-collapse.js")
//      case "fobo" :: "bootstrap-collapse.js" :: Nil => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-collapse.js")
//      case "fobo" :: "bootstrap-dropdown.js" :: Nil if Props.devMode => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-dropdown.js")
//      case "fobo" :: "bootstrap-dropdown.js" :: Nil => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-dropdown.js")
//      case "fobo" :: "bootstrap-modal.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-modal.js")
//      case "fobo" :: "bootstrap-modal.js" :: Nil => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-modal.js")
//      case "fobo" :: "bootstrap-popover.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","2.0.0", "js", "bootstrap-popover.js")
//      case "fobo" :: "bootstrap-popover.js" :: Nil => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-popover.js")
//      case "fobo" :: "bootstrap-scrollspy.js" :: Nil if Props.devMode => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-scrollspy.js")
//      case "fobo" :: "bootstrap-scrollspy.js" :: Nil => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-scrollspy.js")
//      case "fobo" :: "bootstrap-tab.js" :: Nil if Props.devMode => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-tab.js")
//      case "fobo" :: "bootstrap-tab.js" :: Nil => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-tab.js")
//      case "fobo" :: "bootstrap-tooltip.js" :: Nil if Props.devMode => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-tooltip.js")
//      case "fobo" :: "bootstrap-tooltip.js" :: Nil => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-tooltip.js")
//
//      case "fobo" :: "bootstrap-transition.js" :: Nil if Props.devMode => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-transition.js")
//      case "fobo" :: "bootstrap-transition.js" :: Nil => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-transition.js")
//
//      case "fobo" :: "bootstrap-typeahead.js" :: Nil if Props.devMode => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-typeahead.js")
//      case "fobo" :: "bootstrap-typeahead.js" :: Nil => List("fobo", "bootstrap","2.0.0", "js", "bootstrap-typeahead.js")
//
//    }
//  }

//  lazy val bootstrap140: Unit = {
//    ResourceServer.rewrite {
//      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap", "1.4.0", "css", "bootstrap.css")
//      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "orgin", "css", "bootstrap-min.css")
//      /*All in one script*/
//      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-all.js")
//      case "fobo" :: "bootstrap.js" :: Nil => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-all.js")
//      /*split from all script*/
//      case "fobo" :: "bootstrap-alerts.js" :: Nil if Props.devMode => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-alerts.js")
//      case "fobo" :: "bootstrap-alerts.js" :: Nil => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-alerts.js")
//      case "fobo" :: "bootstrap-buttons.js" :: Nil if Props.devMode => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-buttons.js")
//      case "fobo" :: "bootstrap-buttons.js" :: Nil => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-buttons.js")
//      case "fobo" :: "bootstrap-dropdown.js" :: Nil if Props.devMode => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-dropdown.js")
//      case "fobo" :: "bootstrap-dropdown.js" :: Nil => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-dropdown.js")
//      case "fobo" :: "bootstrap-modal.js" :: Nil if Props.devMode => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-modal.js")
//      case "fobo" :: "bootstrap-modal.js" :: Nil => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-modal.js")
//      case "fobo" :: "bootstrap-popover.js" :: Nil if Props.devMode => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-popover.js")
//      case "fobo" :: "bootstrap-popover.js" :: Nil => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-popover.js")
//      case "fobo" :: "bootstrap-scrollspy.js" :: Nil if Props.devMode => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-scrollspy.js")
//      case "fobo" :: "bootstrap-scrollspy.js" :: Nil => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-scrollspy.js")
//      case "fobo" :: "bootstrap-tabs.js" :: Nil if Props.devMode => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-tabs.js")
//      case "fobo" :: "bootstrap-tabs.js" :: Nil => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-tabs.js")
//      case "fobo" :: "bootstrap-twipsy.js" :: Nil if Props.devMode => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-twipsy.js")
//      case "fobo" :: "bootstrap-twipsy.js" :: Nil => List("fobo", "bootstrap", "1.4.0", "js", "bootstrap-twipsy.js")
//    }
//  }

  lazy val foundation215: Unit = {
    ResourceServer.rewrite {
      case "fobo" :: "foundation.css" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.5", "css", "foundation.css")
      case "fobo" :: "foundation.css" :: Nil => List("fobo", "foundation", "2.1.5", "css", "foundation-min.css")
      case "fobo" :: "foundation-ie.css" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.5", "css", "foundation-ie.css")
      case "fobo" :: "foundation-ie.css" :: Nil => List("fobo", "foundation", "2.1.5", "css", "foundation-ie-min.css")

      case "fobo" :: "orbit.css" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.5", "css", "orbit.css")
      case "fobo" :: "orbit.css" :: Nil => List("fobo", "foundation", "2.1.5", "css", "orbit-min.css")

      /*All in one script*/
      case "fobo" :: "foundation.js" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.5", "js", "foundation.js")
      case "fobo" :: "foundation.js" :: Nil => List("fobo", "foundation", "2.1.5", "js", "foundation.js")

      /*detect touch-enabled devices*/
      case "fobo" :: "modernizr.foundation.js" :: Nil if Props.devMode => List("fobo","foundation", "2.1.5", "js", "modernizr.foundation.js")
      case "fobo" :: "modernizr.foundation.js" :: Nil => List("fobo", "foundation", "2.1.5", "js", "modernizr.foundation.js")
      /*orbit scripts*/
      case "fobo" :: "orbit.js" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.5", "js", "jquery.orbit.js")
      case "fobo" :: "orbit.js" :: Nil => List("fobo", "foundation", "2.1.5", "js", "jquery.orbit.js")
    }
  }

  lazy val foundation214: Unit = {
    ResourceServer.rewrite {
      case "fobo" :: "foundation.css" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.4", "css", "foundation.css")
      case "fobo" :: "foundation.css" :: Nil => List("fobo", "foundation", "2.1.4", "css", "foundation-min.css")
      case "fobo" :: "foundation-ie.css" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.4", "css", "foundation-ie.css")
      case "fobo" :: "foundation-ie.css" :: Nil => List("fobo", "foundation", "2.1.4", "css", "foundation-ie-min.css")

      case "fobo" :: "orbit.css" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.4", "css", "orbit.css")
      case "fobo" :: "orbit.css" :: Nil => List("fobo", "orgin", "foundation", "2.1.4", "css", "orbit-min.css")

      case "fobo" :: "foundation.js" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.4", "js", "foundation.js")
      case "fobo" :: "foundation.js" :: Nil => List("fobo", "foundation", "2.1.4", "js", "foundation.js")

      case "fobo" :: "orbit.js" :: Nil if Props.devMode => List("fobo", "foundation", "2.1.4", "js", "jquery.orbit.js")
      case "fobo" :: "orbit.js" :: Nil => List("fobo", "foundation", "2.1.4", "js", "jquery.orbit.js")
    }
  }

}
  
}

