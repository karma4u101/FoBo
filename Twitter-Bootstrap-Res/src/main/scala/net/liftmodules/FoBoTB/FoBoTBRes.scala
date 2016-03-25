package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

/**
 * ==FoBo Resource sub-module==
 * This package object provides module initiation in FoBo's most fine grain level.
 *
 * This is useful if you want to depend on a small subset of FoBo's functionality
 * by only pulling in some specific FoBo artifact(s) that provides toolkit resources
 * or FoBo API functions.
 *
 * This module provides toolkit resources for the Bootstrap v2.x module.
 *
 * For more information on how to set up and use the FoBo modules see the FoBo readme.
 */
package object FoBoTBRes {

  abstract sealed trait Resource

  object Resource extends Resource {
    var Init: Resource = null

    /**
     * Enable usage of FoBo's Bootstrap version 2&#8228;3&#8228;2 resources files in your bootstrap liftweb Boot.
     * @version 2.3.2
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoTBRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Bootstrap232
     * }}}
     *
     */
    case object Bootstrap232 extends Resource {
      FoBoResources.init
      FoBoResources.bootstrap232
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

