package net.liftmodules

import _root_.net.liftweb._
import http._

/**
  * ==FoBo Highlight JS Resource Module==
  *
  * This resource module provides Highlight JS resource components to the FoBo Highlight JS Toolkit module,
  * but can also be used as-is, see below for setup information.
  *
  * If you are using this module via the FoBo/FoBo module see also [[net.liftmodules.fobo]] for setup information.
  *
  *
  */
package object fobohlres {

  override def toString() = fobohlres.Resource.toString()

  /**
    * Initiate FoBo's Highlight JS Resource(s) in you bootstrap liftweb Boot.
    *
    *  '''Example:'''
    * {{{
    *   import net.liftmodules.{FoBoHLRes => FoBo}
    *    :
    *   FoBo.Resource.init=FoBo.Resource.[Resource Object]
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
    override def toString() = "fobohlres.Resource = " + store.toString()

    /**
      * Enable usage of FoBo's Highlight JS resources version 9&#8228;3&#8228;0 in your bootstrap liftweb Boot.
      * @version v9.3.0
      *
      * '''Example:'''
      *
      * {{{
      *   import net.liftmodules.{fobohlres => fobo}
      *    :
      *   fobo.Resource.init=fobo.Resource.HighlightJS930
      * }}}
      */
    case object HighlightJS930 extends Resource {
      FoBoResources.init
      FoBoResources.highlightJS930
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

    lazy val highlightJS930: Unit = {
      ResourceServer.rewrite {
        //this resouce is not avaiable in both min and debugable code js is minifided but css is not
        //case "fobo" :: "prettify.css" :: Nil if Props.devMode => List("fobo", "highlight", "9.3.0", "js", "highlight.pack.js")
        case "fobo" :: "highlight" :: "highlight.pack.js" :: Nil =>
          List("fobo", "highlight", "9.3.0", "js", "highlight.pack.js")

        case "fobo" :: "highlight" :: "agate.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "agate.css")
        case "fobo" :: "highlight" :: "androidstudio.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "androidstudio.css")
        case "fobo" :: "highlight" :: "arduino-light.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "arduino-light.css")
        case "fobo" :: "highlight" :: "arta.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "arta.css")
        case "fobo" :: "highlight" :: "ascetic.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "ascetic.css")
        case "fobo" :: "highlight" :: "atelier-cave-dark.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "atelier-cave-dark.css")
        case "fobo" :: "highlight" :: "atelier-cave-light.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "atelier-cave-light.css")
        case "fobo" :: "highlight" :: "atelier-dune-dark.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "atelier-dune-dark.css")
        case "fobo" :: "highlight" :: "atelier-dune-light.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "atelier-dune-light.css")
        case "fobo" :: "highlight" :: "atelier-estuary-dark.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "atelier-estuary-dark.css")
        case "fobo" :: "highlight" :: "atelier-estuary-light.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "atelier-estuary-light.css")
        case "fobo" :: "highlight" :: "atelier-forest-dark.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "atelier-forest-dark.css")
        case "fobo" :: "highlight" :: "atelier-forest-light.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "atelier-forest-light.css")
        case "fobo" :: "highlight" :: "atelier-heath-dark.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "atelier-heath-dark.css")
        case "fobo" :: "highlight" :: "atelier-heath-light.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "atelier-heath-light.css")
        case "fobo" :: "highlight" :: "atelier-lakeside-dark.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "atelier-lakeside-dark.css")
        case "fobo" :: "highlight" :: "atelier-lakeside-light.css" :: Nil =>
          List("fobo",
               "highlight",
               "9.3.0",
               "css",
               "atelier-lakeside-light.css")
        case "fobo" :: "highlight" :: "atelier-plateau-dark.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "atelier-plateau-dark.css")
        case "fobo" :: "highlight" :: "atelier-plateau-light.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "atelier-plateau-light.css")
        case "fobo" :: "highlight" :: "atelier-savanna-dark.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "atelier-savanna-dark.css")
        case "fobo" :: "highlight" :: "atelier-savanna-light.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "atelier-savanna-light.css")
        case "fobo" :: "highlight" :: "atelier-seaside-dark.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "atelier-seaside-dark.css")
        case "fobo" :: "highlight" :: "atelier-seaside-light.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "atelier-seaside-light.css")
        case "fobo" :: "highlight" :: "atelier-sulphurpool-dark.css" :: Nil =>
          List("fobo",
               "highlight",
               "9.3.0",
               "css",
               "atelier-sulphurpool-dark.css")
        case "fobo" :: "highlight" :: "atelier-sulphurpool-light.css" :: Nil =>
          List("fobo",
               "highlight",
               "9.3.0",
               "css",
               "atelier-sulphurpool-light.css")
        case "fobo" :: "highlight" :: "brown-paper.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "brown-paper.css")
        case "fobo" :: "highlight" :: "codepen-embed.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "codepen-embed.css")
        case "fobo" :: "highlight" :: "color-brewer.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "color-brewer.css")
        case "fobo" :: "highlight" :: "dark.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "dark.css")
        case "fobo" :: "highlight" :: "darkula.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "darkula.css")
        case "fobo" :: "highlight" :: "default.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "default.css")
        case "fobo" :: "highlight" :: "docco.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "docco.css")
        case "fobo" :: "highlight" :: "dracula.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "dracula.css")
        case "fobo" :: "highlight" :: "far.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "far.css")
        case "fobo" :: "highlight" :: "foundation.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "foundation.css")
        case "fobo" :: "highlight" :: "github.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "github.css")
        case "fobo" :: "highlight" :: "github-gist.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "github-gist.css")
        case "fobo" :: "highlight" :: "googlecode.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "googlecode.css")
        case "fobo" :: "highlight" :: "grayscale.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "grayscale.css")
        case "fobo" :: "highlight" :: "gruvbox-dark.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "gruvbox-dark.css")
        case "fobo" :: "highlight" :: "gruvbox-light.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "gruvbox-light.css")
        case "fobo" :: "highlight" :: "hopscotch.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "hopscotch.css")
        case "fobo" :: "highlight" :: "hybrid.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "hybrid.css")
        case "fobo" :: "highlight" :: "idea.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "idea.css")
        case "fobo" :: "highlight" :: "ir-black.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "ir-black.css")
        case "fobo" :: "highlight" :: "kimbie.dark.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "kimbie.dark.css")
        case "fobo" :: "highlight" :: "kimbie.light.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "kimbie.light.css")
        case "fobo" :: "highlight" :: "magula.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "magula.css")
        case "fobo" :: "highlight" :: "mono-blue.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "mono-blue.css")
        case "fobo" :: "highlight" :: "monokai.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "monokai.css")
        case "fobo" :: "highlight" :: "monokai-sublime.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "monokai-sublime.css")
        case "fobo" :: "highlight" :: "obsidian.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "obsidian.css")
        case "fobo" :: "highlight" :: "paraiso-dark.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "paraiso-dark.css")
        case "fobo" :: "highlight" :: "paraiso-light.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "paraiso-light.css")
        case "fobo" :: "highlight" :: "pojoaque.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "pojoaque.css")
        case "fobo" :: "highlight" :: "qtcreator_dark.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "qtcreator_dark.css")
        case "fobo" :: "highlight" :: "qtcreator_light.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "qtcreator_light.css")
        case "fobo" :: "highlight" :: "railscasts.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "railscasts.css")
        case "fobo" :: "highlight" :: "rainbow.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "rainbow.css")
        case "fobo" :: "highlight" :: "school-book.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "school-book.css")
        case "fobo" :: "highlight" :: "solarized-dark.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "solarized-dark.css")
        case "fobo" :: "highlight" :: "solarized-light.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "solarized-light.css")
        case "fobo" :: "highlight" :: "sunburst.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "sunburst.css")
        case "fobo" :: "highlight" :: "tomorrow.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "tomorrow.css")
        case "fobo" :: "highlight" :: "tomorrow-night.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "tomorrow-night.css")
        case "fobo" :: "highlight" :: "tomorrow-night-blue.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "tomorrow-night-blue.css")
        case "fobo" :: "highlight" :: "tomorrow-night-bright.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "tomorrow-night-bright.css")
        case "fobo" :: "highlight" :: "tomorrow-night-eighties.css" :: Nil =>
          List("fobo",
               "highlight",
               "9.3.0",
               "css",
               "tomorrow-night-eighties.css")
        case "fobo" :: "highlight" :: "vs.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "vs.css")
        case "fobo" :: "highlight" :: "xcode.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "xcode.css")
        case "fobo" :: "highlight" :: "xt256.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "xt256.css")
        case "fobo" :: "highlight" :: "zenburn.css" :: Nil =>
          List("fobo", "highlight", "9.3.0", "css", "zenburn.css")

      }
    }

  }
}
