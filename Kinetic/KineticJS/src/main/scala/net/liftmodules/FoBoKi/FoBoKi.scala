package net.liftmodules

import _root_.net.liftweb._
import util.{Props}
import http._
import common._

/**
  * ==FoBo KineticJs Toolkit Module==
  * 
  * This FoBo toolkit module provides KineticJs API and Resource components to the 
  * FoBo / FoBo Module, but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo artifact module see also [[net.liftmodules.FoBo]] for setup information.
  *
  */
package object FoBoKi {

  override def toString() = {
    FoBoKi.Toolkit.toString() + " " + FoBoKi.Resource
      .toString() + " " + FoBoKi.API.toString()
  }

  /**
    * Initiate FoBo's KineticJs Toolkit(s) in you bootstrap liftweb Boot.
    * Using the Toolkit initiation you will bring in both the 
    * toolkit's resources and FoBo/Lift API associated 
    * with the toolkit.  
    * 
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoKi => FoBo}
    *    :
    *   FoBo.Toolkit.Init=FoBo.Toolkit.[Toolkit Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  abstract sealed trait Toolkit

  /**
    * Initiate FoBo's KineticJs Resource(s) in you bootstrap liftweb Boot.
    * 
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoKi => FoBo}
    *    :
    *   FoBo.Resource.Init=FoBo.Resource.[Resource Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  abstract sealed trait Resource

  /**
    * Initiate FoBo's KineticJs API in you bootstrap liftweb Boot.
    * 
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoKi => FoBo}
    *    :
    *   FoBo.API.Init=FoBo.API.[API Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  abstract sealed trait API

  /*===Kinetic Toolkit===============================================================*/

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
    override def toString() = "FoBoKi.Toolkit = " + store.toString()

    /**
      * Enable usage FoBo's KineticJS API and resources version 5&#8228;1&#8228;0 in your bootstrap liftweb Boot.
      * @version 5.1.0
      * 
      * '''Example:'''
      * 
      * {{{
      *   import net.liftmodules.{FoBoKi => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.KineticJS510 
      * }}}
      *
      */
    case object KineticJS510 extends Toolkit {
      FoBoKiRes.Resource.KineticJS510
    }

  }

  /*===Kinetic Resource===============================================================*/

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
    override def toString() = "FoBoKi.Resource = " + store.toString()

    /**
      * Enable usage FoBo's KineticJS resources version 5&#8228;1&#8228;0 in your bootstrap liftweb Boot.
      * @version 5.1.0
      * 
      * '''Example:'''
      * 
      * {{{
      *   import net.liftmodules.{FoBoKi => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.KineticJS510 
      * }}}
      *
      */
    case object KineticJS510 extends Resource {
      FoBoKiRes.Resource.KineticJS510
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
    override def toString() = "FoBoKi.API = " + store.toString()

    /**
      * Enable usage of FoBo's KineticJs API version 5&#8228;X&#8228;X in your bootstrap liftweb Boot.
      * @version 5.X.X
      * 
      * '''Example:'''
      * 
      * {{{
      *   import net.liftmodules.{FoBoKi => FoBo}
      *    :
      *   FoBo.API.Init=FoBo.API.KineticJS0
      * }}}
      */
    case object KineticJS0 extends API {
      //ToDo get from module fobo-kineticjs-api in KinetciJSAPI
      //FoBoKiAPI.API.KineticJS0
      FoBoAPI.init
    }
  }

  /*=== InitParam (deprecated) ============================================*/

  @deprecated(
      "Init no longer nessesary as it is now automaticaly done for respective FoBoKi.InitParam",
      "1.6.0")
  def init() {}

  //@deprecated("","1.6.0")
  abstract sealed trait FoBoToolkit

  /**
    *
    */
  @deprecated("Use FoBoKi.Toolkit.Init=FoBoKi.Toolkit.[Toolkit Object]",
              "1.6.0")
  object InitParam extends FoBoToolkit {
    var ToolKit: FoBoToolkit = null
  }

  /**
    * Enable usage of KineticJS version 5&#8228;1&#8228;0 in your bootstrap liftweb Boot.
    * @version 5.1.0
    * 
    * '''Example:'''
    * 
    * {{{
    *   FoBoKi.InitParam.ToolKit=FoBoKi.KineticJS510
    * }}}
    * @since v1.3
    */
  @deprecated("Use FoBoKi.Toolkit.Init=FoBoKi.Toolkit.KineticJS510", "1.6.0")
  case object KineticJS510 extends FoBoToolkit {
    Toolkit.KineticJS510
    //API.KineticJS510
  }

//ToDo this should be fetched from KineticJSAPI
  /**
    * Object for initiating FoBo API packages.
    * 
    */
  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.FoBoKi")
    }
  }

}
