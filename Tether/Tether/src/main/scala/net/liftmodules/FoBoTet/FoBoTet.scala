package net.liftmodules

import _root_.net.liftweb._
import util.{Props}
import http._
import common._

/**
  * ==FoBo Tether Toolkit Module==
  *
  * This FoBo toolkit module provides Tether API and Resource components to the
  * FoBo / FoBo Module, but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo artifact module see also [[net.liftmodules.FoBo]] for setup information.
  *
  */
package object FoBoTet {

  override def toString() = {
    FoBoTet.Toolkit.toString() + " " + FoBoTet.Resource
      .toString() + " " + FoBoTet.API.toString()
  }

  /**
    * Initiate FoBo's Tether Toolkit(s) in you bootstrap liftweb Boot.
    * Using the Toolkit initiation you will bring in both the
    * toolkit's resources and FoBo/Lift API associated
    * with the toolkit.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoTet => FoBo}
    *    :
    *   FoBo.Toolkit.Init=FoBo.Toolkit.[Toolkit Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  abstract sealed trait Toolkit

  /**
    * Initiate FoBo's Tether Resource(s) in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoTet => FoBo}
    *    :
    *   FoBo.Resource.Init=FoBo.Resource.[Resource Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  abstract sealed trait Resource

  /**
    * Initiate FoBo's Tether API in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoTet => FoBo}
    *    :
    *   FoBo.API.Init=FoBo.API.[API Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  abstract sealed trait API

  /*===Tether Toolkit===============================================================*/

  object Toolkit extends Toolkit {

    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[Toolkit]
    private var store: Store = List()
    def Init: Store          = store
    def Init_=(t: Toolkit): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "FoBoTet.Toolkit = " + store.toString()

    /**
      * Enable usage FoBo's Tether API and resources version 1&#8228;4&#8228;0 in your bootstrap liftweb Boot.
      * @version 1.4.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoTet => FoBo}
      *    :
      *   FoBo.Toolkit.Init=FoBo.Toolkit.Tether140
      * }}}
      *
      */
    case object Tether140 extends Toolkit {
      FoBoTetRes.Resource.Tether140
    }

  }

  /*===Tether Resource===============================================================*/

  object Resource extends Resource {

    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[Resource]
    private var store: Store = List()
    def Init: Store          = store
    def Init_=(t: Resource): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "FoBoTet.Resource = " + store.toString()

    /**
      * Enable usage FoBo's Tether resources version 1&#8228;4&#8228;0 in your bootstrap liftweb Boot.
      * @version 1.4.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoTet => FoBo}
      *    :
      *   FoBo.Resource.Init=FoBo.Resource.Tether140
      * }}}
      *
      */
    case object Tether140 extends Resource {
      FoBoTetRes.Resource.Tether140
    }

  }

  /*=== API ============================================*/

  object API extends API {

    //we don't actually need to store the objects (for now) so lets just save
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[API]
    private var store: Store = List()
    def Init: Store          = store
    def Init_=(t: API): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "FoBoTet.API = " + store.toString()

    /**
      * Enable usage of FoBo's Tether API version 1&#8228;X&#8228;X in your bootstrap liftweb Boot.
      * @version 1.X.X
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{FoBoTet => FoBo}
      *    :
      *   FoBo.API.Init=FoBo.API.Tether1
      * }}}
      */
    case object Tether1 extends API {
      FoBoTetAPI.API.Tether1
    }
  }

}
