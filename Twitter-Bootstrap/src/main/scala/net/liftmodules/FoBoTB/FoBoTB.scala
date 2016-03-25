package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

/**
 * ==FoBo Toolkit sub-module==
 * This package object provides Bootstrap 2 integration into your Lift/FoBo application.
 *
 * This package object is only of interest to you if you are using this module
 * as a stand alone artifact dependency in your project (without the FoBo meta artifact).
 * This package object provides information on how to initiate and use it
 * in your project.
 *
 * If you are using this module via the FoBo meta artifact
 * see [[net.liftmodules.FoBo]] for usage information.
 */
package object FoBoTB {

  /**
   * Initiate FoBo's Bootstrap 3 ToolKit(s) in you bootstrap liftweb Boot.
   * Using the ToolKit initiation you will bring in both the
   * toolkit's resources and if present the FoBo API associated
   * with the toolkit.
   *
   *  '''Example:'''
   * {{{
   *   import net.liftmodules.{FoBoBs => FoBo}
   *    :
   *   FoBo.ToolKit.Init=FoBo.ToolKit.[ToolKit Object]
   * }}}
   */
  abstract sealed trait ToolKit

  /**
   * Initiate FoBo's Bootstrap 3 Resource(s) in you bootstrap liftweb Boot.
   *
   *  '''Example:'''
   * {{{
   *   import net.liftmodules.{FoBoBs => FoBo}
   *    :
   *   FoBo.Resource.Init=FoBo.Resource.[Resource Object]
   * }}}
   */
  abstract sealed trait Resource

  /**
   * Initiate FoBo's Bootstrap 3 API in you bootstrap liftweb Boot.
   *
   *  '''Example:'''
   * {{{
   *   import net.liftmodules.{FoBoBs => FoBo}
   *    :
   *   FoBo.API.Init=FoBo.API.[API Object]
   * }}}
   */
  abstract sealed trait API

  /*=== ToolKit ============================================*/

  object ToolKit extends ToolKit {
    var Init: ToolKit = null

    /**
     * Enable usage of Bootstrap API and resources version 2&#8228;3&#8228;2 resource files in your bootstrap liftweb Boot.
     * @version 2.3.2
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoTB => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.Bootstrap232
     * }}}
     *
     */
    case object Bootstrap232 extends ToolKit {
      net.liftmodules.FoBoTBRes.Resource.Bootstrap232
      net.liftmodules.FoBoTBAPI.API.Bootstrap2
    }

  }

  /*=== Resource ============================================*/

  object Resource extends Resource {
    var Init: Resource = null

    /**
     * Enable usage of Bootstrap version 2&#8228;3&#8228;2 resource files in your bootstrap liftweb Boot.
     * @version 2.3.2
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoTB => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Bootstrap232
     * }}}
     *
     */
    case object Bootstrap232 extends Resource {
      net.liftmodules.FoBoTBRes.Resource.Bootstrap232
    }

  }

  /*=== API ============================================*/

  object API extends API {
    var Init: API = null

    /**
     * Enable usage of FoBo's Bootstrap API 2&#8228;x&#8228;x in your bootstrap liftweb Boot.
     * @version 2.x.x
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoTB => FoBo}
     *    :
     *   FoBo.API.Init=FoBo.API.Bootstrap2
     * }}}
     *
     */
    case object Bootstrap2 extends API {
      net.liftmodules.FoBoTBAPI.API.Bootstrap2
    }

  }

  /**
   * Extends your Lift SiteMap with various common bootstrap menu manipulations such
   * as horizontal and vertical menu dividers and menu labels.
   *
   * This object should be used in conjunction with the TB* menu builder objects in [[net.liftmodules.FoBo.snippet.FoBo]] snippet's.
   *
   * '''Example:'''
   * {{{
   *   :
   *  //add a horizontal menu divider
   *  divider1 >> LocGroup(...) >> FoBoTB.TBLocInfo.Divider,
   *   :
   *  //add a vertical menu divider
   *  divider2 >> LocGroup(...) >> FoBoTB.TBLocInfo.DividerVertical,
   *   :
   * }}}
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
    val Divider = new net.liftweb.sitemap.Loc.LocInfo[String] { def apply() = hd.map(x => () => x) }
    /**
     * Add a vertical divider in your bootstrap menu.
     * For a usage example see the Divider val above.
     */
    val DividerVertical = new net.liftweb.sitemap.Loc.LocInfo[String] { def apply() = vd.map(x => () => x) }
    /**
     * Add nav header(s) to your bootstrap nav list.
     * For a usage example see the NavHeader val above.
     */
    val NavHeader = new net.liftweb.sitemap.Loc.LocInfo[String] { def apply() = nh.map(x => () => x) }
    /**
     * Adds target="_blank" to the link
     * @since v1.2
     */
    val LinkTargetBlank = new net.liftweb.sitemap.Loc.LocInfo[String] { def apply() = ltb.map(x => () => x) }
    /**
     * Adds target="_self" to the link
     * @since v1.2
     */
    val LinkTargetSelf = new net.liftweb.sitemap.Loc.LocInfo[String] { def apply() = lts.map(x => () => x) }
    /**
     * Adds target="_parent" to the link
     * @since v1.2
     */
    val LinkTargetParent = new net.liftweb.sitemap.Loc.LocInfo[String] { def apply() = ltp.map(x => () => x) }
    /**
     * Adds target="_top" to the link
     * @since v1.2
     */
    val LinkTargetTop = new net.liftweb.sitemap.Loc.LocInfo[String] { def apply() = ltt.map(x => () => x) }

  }

  /*============== InitParam (deprecated) ===================*/
  /**
   * @example In bootstrap liftweb Boot set
   * {{{
   *   FoBoTB.init()
   * }}}
   * The above example just calls init without specifying fobo init
   * params so default Toolkit and JQuery values will be used.
   */
  @deprecated("Init no longer nessesary as it is now automaticaly done for respective FoBoTB.InitParam", "1.6.0")
  def init() {

  }

  @deprecated("Use FoBoTB.ToolKit or FoBoTB.Resource and FoBoTB.API", "1.6.0")
  abstract sealed trait FoBoToolkit

  /**
   * Enable Toolkit(s)/JQuery options for the FoBo module in your bootstrap liftweb Boot.
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
  @deprecated("Use FoBoTB.ToolKit.Init=FoBoTB.ToolKit.[Toolkit Object]", "1.6.0")
  object InitParam extends FoBoToolkit {
    var ToolKit: FoBoToolkit = null
  }

  /**
   * Enable usage of Twitter Bootstrap version 2&#8228;3&#8228;2 in your bootstrap liftweb Boot.
   * @version 2.3.2
   *
   * '''Example'''
   *
   * {{{
   *   FoBoTB.InitParam.Toolkit=FoBoTB.Bootstrap232
   * }}}
   */
  case object Bootstrap232 extends FoBoToolkit {
    net.liftmodules.FoBoTBRes.Resource.Bootstrap232
    net.liftmodules.FoBoTBAPI.API.Bootstrap2
  }

  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.FoBoAJS")
    }
  }

  /**
   * Object holding internally used FoBo resources.
   */
  private object FoBoResources {

    lazy val init: Unit = {
      ResourceServer.allow {
        case "fobo" :: tail => true
      }
    }

    lazy val bootstrap232: Unit = {
      ResourceServer.rewrite {
        case "fobo" :: "bootstrap.css" :: Nil if Props.devMode            => List("fobo", "bootstrap", "2.3.2", "css", "bootstrap.css")
        case "fobo" :: "bootstrap.css" :: Nil                             => List("fobo", "bootstrap", "2.3.2", "css", "bootstrap-min.css")
        case "fobo" :: "bootstrap-responsive.css" :: Nil if Props.devMode => List("fobo", "bootstrap", "2.3.2", "css", "responsive.css")
        case "fobo" :: "bootstrap-responsive.css" :: Nil                  => List("fobo", "bootstrap", "2.3.2", "css", "responsive-min.css")
        case "fobo" :: "bootstrap.js" :: Nil if Props.devMode             => List("fobo", "bootstrap", "2.3.2", "js", "bootstrap.js")
        case "fobo" :: "bootstrap.js" :: Nil                              => List("fobo", "bootstrap", "2.3.2", "js", "bootstrap-min.js")
      }
    }

  }

}

