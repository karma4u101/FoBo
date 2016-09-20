package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

/**
  * ==FoBo Twitter Bootstrap API Module==
  *
  * This FoBo API module provides FoBo/Lift API components for the Twitter Bootstrap v2.x Toolkit Module,
  * but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo artifact module see also [[net.liftmodules.FoBo]] for setup information.
  *
  */
package object FoBoTBAPI {

  override def toString() = FoBoTBAPI.API.toString()

  /**
    * Initiate FoBo's Bootstrap 3 API in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoTBAPI => FoBo}
    *    :
    *   FoBo.API.Init=FoBo.API.[API Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  abstract sealed trait API

  object API extends API {

    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[API]
    private var store: Store = List()
    def Init: Store = store
    def Init_=(t: API): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "FoBoTBAPI.API = " + store.toString()

    /**
      * Enable usage of FoBo's Angular API for Bootstrap version 2&#8228;X&#8228;X in your bootstrap liftweb Boot.
      * @version 2.X.X
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoTBAPI => FoBo}
      *    :
      *   FoBo.API.Init=FoBo.API.Bootstrap2
      * }}}
      *
      */
    case object Bootstrap2 extends API {
      FoBoAPI.init
    }

  }

  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.FoBoTB")
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
    val Divider = new net.liftweb.sitemap.Loc.LocInfo[String] {
      def apply() = hd.map(x => () => x)
    }

    /**
      * Add a vertical divider in your bootstrap menu.
      * For a usage example see the Divider val above.
      */
    val DividerVertical = new net.liftweb.sitemap.Loc.LocInfo[String] {
      def apply() = vd.map(x => () => x)
    }

    /**
      * Add nav header(s) to your bootstrap nav list.
      * For a usage example see the NavHeader val above.
      */
    val NavHeader = new net.liftweb.sitemap.Loc.LocInfo[String] {
      def apply() = nh.map(x => () => x)
    }

    /**
      * Adds target="_blank" to the link
      * @since v1.2
      */
    val LinkTargetBlank = new net.liftweb.sitemap.Loc.LocInfo[String] {
      def apply() = ltb.map(x => () => x)
    }

    /**
      * Adds target="_self" to the link
      * @since v1.2
      */
    val LinkTargetSelf = new net.liftweb.sitemap.Loc.LocInfo[String] {
      def apply() = lts.map(x => () => x)
    }

    /**
      * Adds target="_parent" to the link
      * @since v1.2
      */
    val LinkTargetParent = new net.liftweb.sitemap.Loc.LocInfo[String] {
      def apply() = ltp.map(x => () => x)
    }

    /**
      * Adds target="_top" to the link
      * @since v1.2
      */
    val LinkTargetTop = new net.liftweb.sitemap.Loc.LocInfo[String] {
      def apply() = ltt.map(x => () => x)
    }

  }

}
