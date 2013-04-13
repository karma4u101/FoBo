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
  var ToolKit: FoBoToolkit = null 
}

  /**
   * Enable usage of AngularJS version 1_0_6 in your bootstrap liftweb Boot.
   * @version 1.0.6
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AngularJS106
   * }}}
   *
   */
  case object AngularJS106 extends FoBoToolkit {
    net.liftmodules.FoBoAJS.AngularJS106
  }

  /**
   * Enable usage of AngularUI-Bootstrap version 0_2_0 in your bootstrap liftweb Boot.
   * @version 0.2.0
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AJSUIBootstrap020
   * }}}
   *
   */
  case object AJSUIBootstrap020 extends FoBoToolkit {
    net.liftmodules.FoBoAJS.AJSUIBootstrap020
  }   
 
  /**
   * Enable usage of NG-Grid version 2_0_4 in your bootstrap liftweb Boot.
   * @version 2.0.4
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AJSNGGrid204
   * }}}
   *
   */
  case object AJSNGGrid204 extends FoBoToolkit {
    net.liftmodules.FoBoAJS.AJSNGGrid204
  }  
  
  /**
   * Enable usage of Angular-UI version 0_4_0 in your bootstrap liftweb Boot.
   * @version 0.4.0
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AJSUI040
   * }}}
   *
   */
  case object AJSUI040 extends FoBoToolkit {
    net.liftmodules.FoBoAJS.AJSUI040
  }   

/**
 * Enable usage of KnockOut version 2_2_1 in your bootstrap liftweb Boot.
 * @version 2.2.1
 * 
 *  '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.KnockOut221
 * }}}
 *  
 */
case object Knockout221 extends FoBoToolkit {
  net.liftmodules.FoBoKO.Knockout221
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
  net.liftmodules.FoBoKO.Knockout210
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
  net.liftmodules.FoBoKO.Knockout200
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
   net.liftmodules.FoBoGCP.PrettifyJun2011
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
  net.liftmodules.FoBoJQ.JQuery182
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
  net.liftmodules.FoBoJQ.JQuery172
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
  net.liftmodules.FoBoJQM.JQueryMobile110
}

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
  net.liftmodules.FoBoDT.DataTables190
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
  net.liftmodules.FoBoFo.Foundation215
}



/**
 * Object holding internally used FoBo resources. 
 */
private object FoBoResources {
   
}
  
}

