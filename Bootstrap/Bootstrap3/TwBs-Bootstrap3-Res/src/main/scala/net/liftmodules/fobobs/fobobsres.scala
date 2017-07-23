package net.liftmodules

import _root_.net.liftweb._
import util.{Props}
import http._

/**
  * ==FoBo Bootstrap 3 Resource Module==
  *
  * This resource module provides Bootstrap resource components to the FoBo Bootstrap 3 Toolkit module,
  * but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo module see also [[net.liftmodules.fobo]] for setup information.
  *
  */
package object fobobsres {

  override def toString() = fobobsres.Resource.toString()

  /**
    * Initiate FoBo's Bootstrap 3 Resource(s) in you bootstrap liftweb Boot.
    *
    *  @example
    * {{{
    *   import net.liftmodules.{fobobsres => fobo}
    *    :
    *   fobo.Resource.init=fobo.Resource.[Resource Object]
    * }}}
    * '''Note:''' To see available objects click on the round trait icon in the header of this page.
    */
  sealed trait Resource

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
    override def toString() = "fobobsres.Resource = " + store.toString()

    /**
      * Enable usage of FoBo's Bootstrap version 3&#8228;3&#8228;7 resources files in your bootstrap liftweb Boot.
      * @version 3.3.7
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.{fobobsres => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.Bootstrap337
      * }}}
      * @since v1.7
      */
    case object Bootstrap337 extends Resource {
      FoBoResources.init
      FoBoResources.bootstrap337
    }

    /**
      * Enable usage of FoBo's Bootstrap version 3&#8228;2&#8228;0 resources files in your bootstrap liftweb Boot.
      * @version 3.2.0
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.{fobobsres => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.Bootstrap320
      * }}}
      *
      */
    case object Bootstrap320 extends Resource {
      FoBoResources.init
      FoBoResources.bootstrap320
    }

    /**
      * Enable usage of FoBo's Bootstrap version 3&#8228;1&#8228;1 resources files in your bootstrap liftweb Boot.
      * @version 3.1.1
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.{fobobsres => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.Bootstrap311
      * }}}
      *
      */
    case object Bootstrap311 extends Resource {
      FoBoResources.init
      FoBoResources.bootstrap311
    }

    /**
      * Enable usage of FoBo's Bootstrap version 3&#8228;0&#8228;1 resources files in your bootstrap liftweb Boot.
      * @version 3.0.1
      *
      *  @example
      *
      * {{{
      *   import net.liftmodules.{fobobsres => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.Bootstrap301
      * }}}
      *
      */
    case object Bootstrap301 extends Resource {
      FoBoResources.init
      FoBoResources.bootstrap301
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

    lazy val bootstrap337: Unit = {
      ResourceServer.rewrite {
        case "fobo" :: "bootstrap.css" :: Nil if Props.devMode =>
          List("fobo", "bootstrap", "3.3.7", "css", "bootstrap.css")
        case "fobo" :: "bootstrap.css" :: Nil =>
          List("fobo", "bootstrap", "3.3.7", "css", "bootstrap.min.css")
        case "fobo" :: "bootstrap.css.map" :: Nil if Props.devMode =>
          List("fobo", "bootstrap", "3.3.7", "css", "bootstrap.css.map")
        case "fobo" :: "bootstrap.css.map" :: Nil =>
          List("fobo", "bootstrap", "3.3.7", "css", "bootstrap.min.css.map")
        case "fobo" :: "bootstrap-theme.css" :: Nil if Props.devMode =>
          List("fobo", "bootstrap", "3.3.7", "css", "bootstrap-theme.css")
        case "fobo" :: "bootstrap-theme.css" :: Nil =>
          List("fobo", "bootstrap", "3.3.7", "css", "bootstrap-theme.min.css")
        case "fobo" :: "bootstrap-theme.css.map" :: Nil if Props.devMode =>
          List("fobo", "bootstrap", "3.3.7", "css", "bootstrap-theme.css.map")
        case "fobo" :: "bootstrap-theme.css.map" :: Nil =>
          List("fobo",
               "bootstrap",
               "3.3.7",
               "css",
               "bootstrap-theme.min.css.map")
        case "fobo" :: "bootstrap.js" :: Nil if Props.devMode =>
          List("fobo", "bootstrap", "3.3.7", "js", "bootstrap.js")
        case "fobo" :: "bootstrap.js" :: Nil =>
          List("fobo", "bootstrap", "3.3.7", "js", "bootstrap.min.js")
      }
    }

    lazy val bootstrap320: Unit = {
      ResourceServer.rewrite {
        case "fobo" :: "bootstrap.css" :: Nil if Props.devMode =>
          List("fobo", "bootstrap", "3.2.0", "css", "bootstrap.css")
        case "fobo" :: "bootstrap.css" :: Nil =>
          List("fobo", "bootstrap", "3.2.0", "css", "bootstrap.min.css")
        case "fobo" :: "bootstrap.css.map" :: Nil =>
          List("fobo", "bootstrap", "3.2.0", "css", "bootstrap.css.map")
        case "fobo" :: "bootstrap-theme.css" :: Nil if Props.devMode =>
          List("fobo", "bootstrap", "3.2.0", "css", "bootstrap-theme.css")
        case "fobo" :: "bootstrap-theme.css" :: Nil =>
          List("fobo", "bootstrap", "3.2.0", "css", "bootstrap-theme.min.css")
        case "fobo" :: "bootstrap-theme.css.map" :: Nil =>
          List("fobo", "bootstrap", "3.2.0", "css", "bootstrap-theme.css.map")
        case "fobo" :: "bootstrap.js" :: Nil if Props.devMode =>
          List("fobo", "bootstrap", "3.2.0", "js", "bootstrap.js")
        case "fobo" :: "bootstrap.js" :: Nil =>
          List("fobo", "bootstrap", "3.2.0", "js", "bootstrap.min.js")
      }
    }

    lazy val bootstrap311: Unit = {
      ResourceServer.rewrite {
        case "fobo" :: "bootstrap.css" :: Nil if Props.devMode =>
          List("fobo", "bootstrap", "3.1.1", "css", "bootstrap.css")
        case "fobo" :: "bootstrap.css" :: Nil =>
          List("fobo", "bootstrap", "3.1.1", "css", "bootstrap.min.css")
        case "fobo" :: "bootstrap.css.map" :: Nil =>
          List("fobo", "bootstrap", "3.1.1", "css", "bootstrap.css.map")
        case "fobo" :: "bootstrap-theme.css" :: Nil if Props.devMode =>
          List("fobo", "bootstrap", "3.1.1", "css", "bootstrap-theme.css")
        case "fobo" :: "bootstrap-theme.css" :: Nil =>
          List("fobo", "bootstrap", "3.1.1", "css", "bootstrap-theme.min.css")
        case "fobo" :: "bootstrap-theme.css.map" :: Nil =>
          List("fobo", "bootstrap", "3.1.1", "css", "bootstrap-theme.css.map")
        case "fobo" :: "bootstrap.js" :: Nil if Props.devMode =>
          List("fobo", "bootstrap", "3.1.1", "js", "bootstrap.js")
        case "fobo" :: "bootstrap.js" :: Nil =>
          List("fobo", "bootstrap", "3.1.1", "js", "bootstrap.min.js")
      }
    }

    lazy val bootstrap301: Unit = {
      ResourceServer.rewrite {
        case "fobo" :: "bootstrap.css" :: Nil if Props.devMode =>
          List("fobo", "bootstrap", "3.0.1", "css", "bootstrap.css")
        case "fobo" :: "bootstrap.css" :: Nil =>
          List("fobo", "bootstrap", "3.0.1", "css", "bootstrap.min.css")
        case "fobo" :: "bootstrap-theme.css" :: Nil if Props.devMode =>
          List("fobo", "bootstrap", "3.0.1", "css", "bootstrap-theme.css")
        case "fobo" :: "bootstrap-theme.css" :: Nil =>
          List("fobo", "bootstrap", "3.0.1", "css", "bootstrap-theme.min.css")
        case "fobo" :: "bootstrap.js" :: Nil if Props.devMode =>
          List("fobo", "bootstrap", "3.0.1", "js", "bootstrap.js")
        case "fobo" :: "bootstrap.js" :: Nil =>
          List("fobo", "bootstrap", "3.0.1", "js", "bootstrap.min.js")
      }
    }

  }

}
