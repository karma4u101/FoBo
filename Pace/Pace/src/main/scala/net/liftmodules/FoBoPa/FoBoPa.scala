package net.liftmodules

import _root_.net.liftweb._
import util.{Props}
import http._
import common._

/**
  * ==FoBo Pace Toolkit Module==
  *
  * This FoBo toolkit module provides Pace API and Resource components to the
  * FoBo / FoBo Module, but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo artifact module see also [[net.liftmodules.FoBo]] for setup information.
  *
  */
package object FoBoPa {

  override def toString() = {
    FoBoPa.Toolkit.toString() + " " + FoBoPa.Resource
      .toString() + " " + FoBoPa.API.toString()
  }

  /**
    * Initiate FoBo's Pace Toolkit(s) in you bootstrap liftweb Boot.
    * Using the Toolkit initiation you will bring in both the
    * toolkit's resources and FoBo/Lift API associated
    * with the toolkit.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoPa => FoBo}
    *    :
    *   FoBo.Toolkit.Init=FoBo.Toolkit.[Toolkit Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  abstract sealed trait Toolkit

  /**
    * Initiate FoBo's Pace Resource(s) in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoPa => FoBo}
    *    :
    *   FoBo.Resource.Init=FoBo.Resource.[Resource Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  abstract sealed trait Resource

  /**
    * Initiate FoBo's Pace API in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoPa => FoBo}
    *    :
    *   FoBo.API.Init=FoBo.API.[API Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  abstract sealed trait API

  /*=== Toolkit ============================================*/

  object Toolkit extends Toolkit {

    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[Toolkit]
    private var store: Store = List()
    def Init: Store = store
    def Init_=(t: Toolkit): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "FoBoPa.Toolkit = " + store.toString()

    /**
      * Enable usage of FoBo's Pace API and resources version 1&#8228;0&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.0.2
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoPa => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.Pace102
      * }}}
      */
    case object Pace102 extends Toolkit {
      FoBoPaRes.Resource.Pace102
    }

    /**
      * Enable usage of FoBo's Pace API and resources version 0&#8228;4&#8228;15 in your bootstrap liftweb Boot.
      * @version 0.4.15
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoPa => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.Pace0415
      * }}}
      */
    case object Pace0415 extends Toolkit {
      FoBoPaRes.Resource.Pace0415
    }
  }

  /*=== Resource ============================================*/

  object Resource extends Resource {

    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[Resource]
    private var store: Store = List()
    def Init: Store = store
    def Init_=(t: Resource): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "FoBoPa.Resource = " + store.toString()

    /**
      * Enable usage of FoBo's Pace resources version 1&#8228;0&#8228;2 in your bootstrap liftweb Boot.
      * @version 1.0.2
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoPa => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.Pace102
      * }}}
      */
    case object Pace102 extends Resource {
      FoBoPaRes.Resource.Pace102
    }

    /**
      * Enable usage of FoBo's Pace resources version 0&#8228;4&#8228;15 in your bootstrap liftweb Boot.
      * @version 0.4.15
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoPa => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.Pace0415
      * }}}
      */
    case object Pace0415 extends Resource {
      FoBoPaRes.Resource.Pace0415
    }
  }

  /*=== API ============================================*/

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
    override def toString() = "FoBoPa.API = " + store.toString()

    /**
      * Enable usage of FoBo's Pace API version 0&#8228;X&#8228;X in your bootstrap liftweb Boot.
      * @version 0.X.X
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoPa => FoBo}
      *    :
      *   FoBo.API.Init=FoBo.API.Pace0
      * }}}
      */
    case object Pace0 extends API {
      //ToDo get from module fobo-pace-api in PaceAPI
      //FoBoPaAPI.API.Pace0
      FoBoAPI.init
    }
  }

  /*=== InitParam (deprecated) ============================================*/

  @deprecated(
    "Init no longer nessesary as it is now automaticaly done for respective FoBoPa.InitParam",
    "1.6.0")
  def init() {}

  @deprecated("Use Toolkit or Resouce", "1.6.0")
  abstract sealed trait PaToolkit

  /**
    *
    */
  @deprecated("Use FoBoPa.Toolkit.Init=FoBoPa.Toolkit.[Toolkit Object]",
              "1.6.0")
  object InitParam extends PaToolkit {
    var ToolKit: PaToolkit = null
  }

  /**
    * Enable usage of Pace version 0&#8228;4&#8228;15 in your bootstrap liftweb Boot.
    * @version 0.4.15
    *
    * '''Example:'''
    *
    * {{{
    *   import net.liftmodules.{FoBoPa => FoBo}
    *    :
    *   FoBo.InitParam.ToolKit=FoBo.Pace0415
    * }}}
    */
  @deprecated("Use FoBoPa.Toolkit.Init=FoBoPa.Toolkit.Pace0415", "1.6.0")
  case object Pace0415 extends PaToolkit {
    Toolkit.Pace0415
  }

  /**
    * Object for initiating FoBo API packages.
    */
  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.FoBoPa")

    }
  }

}
