package net.liftmodules

import _root_.net.liftweb._
import util.Props
import http._
import common._

/**
  * ==FoBo Twitter Bootstrap Toolkit Module==
  *
  * This FoBo toolkit module provides Twitter Bootstrap v2.x API and Resource components to the
  * FoBo / FoBo Module, but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo artifact module see also [[net.liftmodules.fobo]] for setup information.
  *
  * @example To initiate this module for usage in your Lift project set something like the following in
  * your projects Lift bootstrap.liftweb.Boot boot method.
  * {{{
  *    import net.liftmodules.{fobotb => fobo}
  *     :
  *     :
  *    fobo.Toolkit.init=fobo.Toolkit.Bootstrap232 //or any other toolkit object
  * }}}
  * You may substitute Toolkit for Resource or API and if you wish also adjust the artifact dependencies
  * accordingly to include just the FoBo modules you use.
  */
package object fobotb {

  override def toString() = {
    fobotb.Toolkit.toString() + " " + fobotb.Resource
      .toString() + " " + fobotb.API.toString()
  }

  /**
    * Initiate FoBo's Bootstrap 2 Toolkit in you bootstrap liftweb Boot.
    * Using the Toolkit initiation you will bring in both the
    * toolkit's resources and the FoBo/Lift API associated
    * with the toolkit.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{fobotb => fobo}
    *    :
    *   fobo.Toolkit.init=fobo.Toolkit.[Toolkit Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    *
    */
  sealed trait Toolkit

  /**
    * Initiate FoBo's Bootstrap 2 Resource(s) in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{fobotb => fobo}
    *    :
    *   fobo.Resource.init=fobo.Resource.[Resource Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Resource

  /**
    * Initiate FoBo's Bootstrap 3 API in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{fobotb => fobo}
    *    :
    *   fobo.API.init=fobo.API.[API Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait API

  /*=== Toolkit ============================================*/

  object Toolkit extends Toolkit {

    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[Toolkit]
    private var store: Store = List()
    def init: Store = store
    def init_=(t: Toolkit): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "fobotb.Toolkit = " + store.toString()

    /**
      * Enable usage of Bootstrap API and resources version 2&#8228;3&#8228;2 resource files in your bootstrap liftweb Boot.
      * @version 2.3.2
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobotb => fobo}
      *    :
      *   fobo.Toolkit.init=fobo.Toolkit.Bootstrap232
      * }}}
      *
      */
    case object Bootstrap232 extends Toolkit {
      net.liftmodules.FoBoTBRes.Resource.Bootstrap232
      net.liftmodules.fobotbapi.API.Bootstrap2
    }

  }

  /*=== Resource ============================================*/

  object Resource extends Resource {

    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[Resource]
    private var store: Store = List()
    def init: Store = store
    def init_=(t: Resource): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "fobotb.Resource = " + store.toString()

    /**
      * Enable usage of Bootstrap version 2&#8228;3&#8228;2 resource files in your bootstrap liftweb Boot.
      * @version 2.3.2
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobotb => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.Bootstrap232
      * }}}
      *
      */
    case object Bootstrap232 extends Resource {
      net.liftmodules.FoBoTBRes.Resource.Bootstrap232
    }

  }

  /*=== API ============================================*/

  object API extends API {

    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[API]
    private var store: Store = List()
    def init: Store = store
    def init_=(t: API): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "fobotb.API = " + store.toString()

    /**
      * Enable usage of FoBo's Bootstrap API 2&#8228;x&#8228;x in your bootstrap liftweb Boot.
      * @version 2.x.x
      *
      *  '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobotb => fobo}
      *    :
      *   fobo.API.init=fobo.API.Bootstrap2
      * }}}
      *
      */
    case object Bootstrap2 extends API {
      net.liftmodules.fobotbapi.API.Bootstrap2
    }

  }

  /**
    * Extends your Lift SiteMap with various common bootstrap menu manipulations such
    * as horizontal and vertical menu dividers and menu labels.
    *
    * This object should be used in conjunction with the TB* menu builder objects in [[net.liftmodules.fobo.snippet.FoBo]] snippet's.
    *
    * '''Example:'''
    * {{{
    *   :
    *  //add a horizontal menu divider
    *  divider1 >> LocGroup(...) >> fobotb.TBLocInfo.Divider,
    *   :
    *  //add a vertical menu divider
    *  divider2 >> LocGroup(...) >> fobotb.TBLocInfo.DividerVertical,
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
      *   navHeader1 >> LocGroup("nl1") >> fobotb.TBLocInfo.NavHeader,
      *   index >> LocGroup("top","nl1",...),
      *    :
      *   ddLabel >> LocGroup("top",...)  >> PlaceHolder submenus(
      *       about ,
      *       divider2 >> fobo.TBLocInfo.Divider,
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
