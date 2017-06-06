package net.liftmodules

import _root_.net.liftweb._
import util.{Props}
import http._
import common._

/**
  * ==FoBo Tooltip Toolkit Module==
  *
  * This FoBo toolkit module provides Tooltip API and Resource components to the
  * FoBo / FoBo Module, but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo artifact module see also [[net.liftmodules.FoBo]] for setup information.
  *
  */
package object FoBoToo {

  override def toString() = {
    FoBoToo.Toolkit.toString() + " " + FoBoToo.Resource
      .toString() + " " + FoBoToo.API.toString()
  }

  /**
    * Initiate FoBo's Tooltip Toolkit(s) in you bootstrap liftweb Boot.
    * Using the Toolkit initiation you will bring in both the
    * toolkit's resources and FoBo/Lift API associated
    * with the toolkit.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoToo => FoBo}
    *    :
    *   FoBo.Toolkit.Init=FoBo.Toolkit.[Toolkit Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  abstract sealed trait Toolkit

  /**
    * Initiate FoBo's Tooltip Resource(s) in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoToo => FoBo}
    *    :
    *   FoBo.Resource.Init=FoBo.Resource.[Resource Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  abstract sealed trait Resource

  /**
    * Initiate FoBo's Tooltip API in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoToo => FoBo}
    *    :
    *   FoBo.API.Init=FoBo.API.[API Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  abstract sealed trait API

  /*===Tooltip Toolkit===============================================================*/

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
    override def toString() = "FoBoToo.Toolkit = " + store.toString()

    /**
      * Enable usage FoBo's Tooltip API and resources version 1&#8228;1&#8228;4 in your bootstrap liftweb Boot.
      * @version 1.1.4
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoToo => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.Tooltip114
      * }}}
      * @since v2.0
      */
    case object Tooltip114 extends Toolkit {
      FoBoTooRes.Resource.Tooltip114
    }

  }

  /*===Tooltip Resource===============================================================*/

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
    override def toString() = "FoBoToo.Resource = " + store.toString()

    /**
      * Enable usage FoBo's Tooltip resources version 1&#8228;1&#8228;4 in your bootstrap liftweb Boot.
      * @version 1.1.4
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoToo => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.Tooltip114
      * }}}
      * @since v2.0
      */
    case object Tooltip114 extends Resource {
      FoBoTooRes.Resource.Tooltip114
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
    override def toString() = "FoBoToo.API = " + store.toString()

    /**
      * Enable usage of FoBo's Tooltip API version 1&#8228;X&#8228;X in your bootstrap liftweb Boot.
      * @version 1.X.X
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoToo => FoBo}
      *    :
      *   FoBo.API.Init=FoBo.API.Tooltip1
      * }}}
      */
    case object Tooltip1 extends API {
      FoBoTooAPI.API.Tooltip1
    }
  }

}
