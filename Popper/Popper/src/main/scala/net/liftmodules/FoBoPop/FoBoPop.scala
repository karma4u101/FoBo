package net.liftmodules

import _root_.net.liftweb._
import util.{Props}
import http._
import common._

/**
  * ==FoBo Popper Toolkit Module==
  *
  * This FoBo toolkit module provides Popper API and Resource components to the
  * FoBo / FoBo Module, but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo artifact module see also [[net.liftmodules.FoBo]] for setup information.
  *
  */
package object FoBoPop {

  override def toString() = {
    FoBoPop.Toolkit.toString() + " " + FoBoPop.Resource
      .toString() + " " + FoBoPop.API.toString()
  }

  /**
    * Initiate FoBo's Popper Toolkit(s) in you bootstrap liftweb Boot.
    * Using the Toolkit initiation you will bring in both the
    * toolkit's resources and FoBo/Lift API associated
    * with the toolkit.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoPop => FoBo}
    *    :
    *   FoBo.Toolkit.Init=FoBo.Toolkit.[Toolkit Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  abstract sealed trait Toolkit

  /**
    * Initiate FoBo's Popper Resource(s) in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoPop => FoBo}
    *    :
    *   FoBo.Resource.Init=FoBo.Resource.[Resource Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  abstract sealed trait Resource

  /**
    * Initiate FoBo's Popper API in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoPop => FoBo}
    *    :
    *   FoBo.API.Init=FoBo.API.[API Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  abstract sealed trait API

  /*===Popper Poplkit===============================================================*/

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
    override def toString() = "FoBoPop.Toolkit = " + store.toString()

    /**
      * Enable usage FoBo's Popper API and resources version 1&#8228;9&#8228;9 in your bootstrap liftweb Boot.
      * @version 1.9.9
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoPop => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.Popper199
      * }}}
      * @since v2.0
      */
    case object Popper199 extends Toolkit {
      FoBoPopRes.Resource.Popper199
    }

  }

  /*===Popper Resource===============================================================*/

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
    override def toString() = "FoBoPop.Resource = " + store.toString()

    /**
      * Enable usage FoBo's Popper resources version 1&#8228;9&#8228;9 in your bootstrap liftweb Boot.
      * @version 1.9.9
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoPop => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.Popper199
      * }}}
      * @since v2.0
      */
    case object Popper199 extends Resource {
      FoBoPopRes.Resource.Popper199
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
    override def toString() = "FoBoPop.API = " + store.toString()

    /**
      * Enable usage of FoBo's Popper API version 1&#8228;X&#8228;X in your bootstrap liftweb Boot.
      * @version 1.X.X
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoPop => FoBo}
      *    :
      *   FoBo.API.Init=FoBo.API.Popper1
      * }}}
      */
    case object Popper1 extends API {
      FoBoPopAPI.API.Popper1
    }
  }

}
