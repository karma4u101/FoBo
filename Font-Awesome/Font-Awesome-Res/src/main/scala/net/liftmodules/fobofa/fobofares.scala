package net.liftmodules

import _root_.net.liftweb._
import util.Props
import http._

/**
  * ==FoBo Font Awesome Resource Module==
  *
  * This resource module provides Font Awesome resource components to the FoBo Font Awesome Toolkit module,
  * but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo module see also [[net.liftmodules.fobo]] for setup information.
  */
package object fobofares {

  override def toString() = fobofares.Resource.toString()

  /**
    * Initiate FoBo's Font Awesome Resource(s) in you bootstrap liftweb Boot.
    *
    *  @example
    * {{{
    *   import net.liftmodules.{FoBoFARes => fobo}
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
    def init: Store          = store
    def init_=(t: Resource): Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }
    override def toString() = "fobofares.Resource = " + store.toString()

    /**
      * Enable usage of FoBo's FontAwesome resources version 5&#8228;5&#8228;5 in your bootstrap liftweb Boot.
      * @version 5.5.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobofares => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome550
      * }}}
      * @since v2.1
      */
    case object FontAwesome550 extends Resource {
      FoBoResources.init
      FoBoResources.fontAwesome550
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;7&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.7.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobofares => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome470
      * }}}
      * @since v2.0
      */
    case object FontAwesome470 extends Resource {
      FoBoResources.init
      FoBoResources.fontAwesome470
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;6&#8228;3 in your bootstrap liftweb Boot.
      * @version 4.6.3
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobofares => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome463
      * }}}
      */
    case object FontAwesome463 extends Resource {
      FoBoResources.init
      FoBoResources.fontAwesome463
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;3&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.3.0
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobofares => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome430
      * }}}
      */
    case object FontAwesome430 extends Resource {
      FoBoResources.init
      FoBoResources.fontAwesome430
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;1&#8228;0 in your bootstrap liftweb Boot.
      * @version 4.1.0
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobofares => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome410
      * }}}
      */
    @deprecated("Use FontAwesome463 or later", "2.0.0")
    case object FontAwesome410 extends Resource {
      FoBoResources.init
      FoBoResources.fontAwesome410
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 4&#8228;0&#8228;3 in your bootstrap liftweb Boot.
      * @version 4.0.3
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobofares => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome403
      * }}}
      */
    @deprecated("Use FontAwesome463 or later", "2.0.0")
    case object FontAwesome403 extends Resource {
      FoBoResources.init
      FoBoResources.fontAwesome403
    }

    /**
      * Enable usage of FoBo's FontAwesome resources version 3&#8228;2&#8228;1 in your bootstrap liftweb Boot.
      * @version 3.2.1
      *
      * @example
      *
      * {{{
      *   import net.liftmodules.{fobofares => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.FontAwesome321
      * }}}
      */
    case object FontAwesome321 extends Resource {
      FoBoResources.init
      FoBoResources.fontAwesome321
    }

  } //end Resource object

  /**
    * Object holding internally used FoBo resources.
    */
  private object FoBoResources {

    lazy val init: Unit = {
      ResourceServer.allow {
        case "fobo" :: tail => true
      }
    }

    lazy val fontAwesome550 = {
      ResourceServer.rewrite {
        case "fobo" :: "font-awesome" :: "all.css" :: Nil if Props.devMode =>
          List("fobo", "font-awesome", "5.5.0", "css", "all.css")
        case "fobo" :: "font-awesome" :: "all.css" :: Nil =>
          List("fobo", "font-awesome", "5.5.0", "css", "all.min.css")

        case "fobo" :: "font-awesome" :: "brands.css" :: Nil if Props.devMode =>
          List("fobo", "font-awesome", "5.5.0", "css", "brands.css")
        case "fobo" :: "font-awesome" :: "brands.css" :: Nil =>
          List("fobo", "font-awesome", "5.5.0", "css", "brands.min.css")

        case "fobo" :: "font-awesome" :: "fontawesome.css" :: Nil
            if Props.devMode =>
          List("fobo", "font-awesome", "5.5.0", "css", "fontawesome.css")
        case "fobo" :: "font-awesome" :: "fontawesome.css" :: Nil =>
          List("fobo", "font-awesome", "5.5.0", "css", "fontawesome.min.css")

        case "fobo" :: "font-awesome" :: "regular.css" :: Nil
            if Props.devMode =>
          List("fobo", "font-awesome", "5.5.0", "css", "regular.css")
        case "fobo" :: "font-awesome" :: "regular.css" :: Nil =>
          List("fobo", "font-awesome", "5.5.0", "css", "regular.min.css")

        case "fobo" :: "font-awesome" :: "solid.css" :: Nil if Props.devMode =>
          List("fobo", "font-awesome", "5.5.0", "css", "solid.css")
        case "fobo" :: "font-awesome" :: "solid.css" :: Nil =>
          List("fobo", "font-awesome", "5.5.0", "css", "solid.min.css")

        case "fobo" :: "font-awesome" :: "svg-with-js.css" :: Nil
            if Props.devMode =>
          List("fobo", "font-awesome", "5.5.0", "css", "svg-with-js.css")
        case "fobo" :: "font-awesome" :: "svg-with-js.css" :: Nil =>
          List("fobo", "font-awesome", "5.5.0", "css", "svg-with-js.min.css")

        case "fobo" :: "font-awesome" :: "v4-shims.css" :: Nil
            if Props.devMode =>
          List("fobo", "font-awesome", "5.5.0", "css", "v4-shims.css")
        case "fobo" :: "font-awesome" :: "v4-shims.css" :: Nil =>
          List("fobo", "font-awesome", "5.5.0", "css", "v4-shims.min.css")

        case "fobo" :: "font-awesome" :: "all.js" :: Nil if Props.devMode =>
          List("fobo", "font-awesome", "5.5.0", "js", "all.js")
        case "fobo" :: "font-awesome" :: "all.js" :: Nil =>
          List("fobo", "font-awesome", "5.5.0", "js", "all.min.js")

        case "fobo" :: "font-awesome" :: "brand.js" :: Nil if Props.devMode =>
          List("fobo", "font-awesome", "5.5.0", "js", "brand.js")
        case "fobo" :: "font-awesome" :: "brand.js" :: Nil =>
          List("fobo", "font-awesome", "5.5.0", "js", "brand.min.js")

        case "fobo" :: "font-awesome" :: "fontawesome.js" :: Nil
            if Props.devMode =>
          List("fobo", "font-awesome", "5.5.0", "js", "fontawesome.js")
        case "fobo" :: "font-awesome" :: "fontawesome.js" :: Nil =>
          List("fobo", "font-awesome", "5.5.0", "js", "fontawesome.min.js")

        case "fobo" :: "font-awesome" :: "regular.js" :: Nil if Props.devMode =>
          List("fobo", "font-awesome", "5.5.0", "js", "regular.js")
        case "fobo" :: "font-awesome" :: "regular.js" :: Nil =>
          List("fobo", "font-awesome", "5.5.0", "js", "regular.min.js")

        case "fobo" :: "font-awesome" :: "solid.js" :: Nil if Props.devMode =>
          List("fobo", "font-awesome", "5.5.0", "js", "solid.js")
        case "fobo" :: "font-awesome" :: "solid.js" :: Nil =>
          List("fobo", "font-awesome", "5.5.0", "js", "solid.min.js")

        case "fobo" :: "font-awesome" :: "v4-shims.js" :: Nil
            if Props.devMode =>
          List("fobo", "font-awesome", "5.5.0", "js", "v4-shims.js")
        case "fobo" :: "font-awesome" :: "v4-shims.js" :: Nil =>
          List("fobo", "font-awesome", "5.5.0", "js", "v4-shims.min.js")
      }
    }

    lazy val fontAwesome470 = {
      ResourceServer.rewrite {
        case "fobo" :: "font-awesome.css" :: Nil if Props.devMode =>
          List("fobo", "font-awesome", "4.7.0", "css", "font-awesome.css")
        case "fobo" :: "font-awesome.css" :: Nil =>
          List("fobo", "font-awesome", "4.7.0", "css", "font-awesome.min.css")
      }
    }

    lazy val fontAwesome463 = {
      ResourceServer.rewrite {
        case "fobo" :: "font-awesome.css" :: Nil if Props.devMode =>
          List("fobo", "font-awesome", "4.6.3", "css", "font-awesome.css")
        case "fobo" :: "font-awesome.css" :: Nil =>
          List("fobo", "font-awesome", "4.6.3", "css", "font-awesome.min.css")
      }
    }

    lazy val fontAwesome430 = {
      ResourceServer.rewrite {
        case "fobo" :: "font-awesome.css" :: Nil if Props.devMode =>
          List("fobo", "font-awesome", "4.3.0", "css", "font-awesome.css")
        case "fobo" :: "font-awesome.css" :: Nil =>
          List("fobo", "font-awesome", "4.3.0", "css", "font-awesome.min.css")
      }
    }

    lazy val fontAwesome410 = {
      ResourceServer.rewrite {
        case "fobo" :: "font-awesome.css" :: Nil if Props.devMode =>
          List("fobo", "font-awesome", "4.1.0", "css", "font-awesome.css")
        case "fobo" :: "font-awesome.css" :: Nil =>
          List("fobo", "font-awesome", "4.1.0", "css", "font-awesome.min.css")
      }
    }

    lazy val fontAwesome403 = {
      ResourceServer.rewrite {
        case "fobo" :: "font-awesome.css" :: Nil if Props.devMode =>
          List("fobo", "font-awesome", "4.0.3", "css", "font-awesome.css")
        case "fobo" :: "font-awesome.css" :: Nil =>
          List("fobo", "font-awesome", "4.0.3", "css", "font-awesome.min.css")
      }
    }

    lazy val fontAwesome321 = {
      ResourceServer.rewrite {
        case "fobo" :: "font-awesome.css" :: Nil if Props.devMode =>
          List("fobo", "font-awesome", "3.2.1", "css", "font-awesome.css")
        case "fobo" :: "font-awesome.css" :: Nil =>
          List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-min.css")
        case "fobo" :: "font-awesome-ie7.css" :: Nil if Props.devMode =>
          List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-ie7.css")
        case "fobo" :: "font-awesome-ie7.css" :: Nil =>
          List("fobo",
               "font-awesome",
               "3.2.1",
               "css",
               "font-awesome-ie7-min.css")

      }
    }

  }

}
