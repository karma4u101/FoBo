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
 * This module provides toolkit resources for the Pace module.
 *
 * For more information on how to set up and use the FoBo modules see the FoBo readme.
 */
package object FoBoPaRes {

  override def toString() = FoBoPaRes.Resource.toString()
  
  abstract sealed trait Resource

  object Resource extends Resource {
   
    //we don't actually need to store the objects (for now) so lets just save 
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[Resource]
    private var store:Store = List()
    def Init:Store = store
    def Init_=(t:Resource):Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    } 
    override def toString() = "FoBoPaRes.Resource = "+store.toString()
    
    /**
     * Enable usage of FoBo's Pace resources version 1&#8228;0&#8228;2 in your bootstrap liftweb Boot.
     * @version 1.0.2
     *
     * '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoPaRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Pace102
     * }}}
     */
    case object Pace102 extends Resource {
      FoBoResources.init
      FoBoResources.Pace102
    }
    
    /**
     * Enable usage of FoBo's Pace resources version 0&#8228;4&#8228;15 in your bootstrap liftweb Boot.
     * @version 0.4.15
     *
     * '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoPaRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Pace0415
     * }}}
     */
    case object Pace0415 extends Resource {
      FoBoResources.init
      FoBoResources.Pace0415
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

    lazy val Pace102: Unit = {
      ResourceServer.rewrite {    
    
        case "fobo" :: "pace.js" :: Nil if Props.devMode => List("fobo", "pace", "1.0.2", "js", "pace.js")
        case "fobo" :: "pace.js" :: Nil                  => List("fobo", "pace", "1.0.2", "js", "pace.min.js")        
        //black
        case "fobo" :: "black" :: "pace-theme-barber-shop.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "black" , "pace-theme-barber-shop-min.css")
        case "fobo" :: "black" :: "pace-theme-big-counter.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "black" , "pace-theme-big-counter.css")
        case "fobo" :: "black" :: "pace-theme-bounce.css" :: Nil           => List("fobo", "pace", "1.0.2", "css", "themes", "black" , "pace-theme-bounce.css")
        case "fobo" :: "black" :: "pace-theme-center-atom.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "black" , "pace-theme-center-atom.css")
        case "fobo" :: "black" :: "pace-theme-center-circle.css" :: Nil    => List("fobo", "pace", "1.0.2", "css", "themes", "black" , "pace-theme-center-circle.css")
        case "fobo" :: "black" :: "pace-theme-center-radar.css" :: Nil     => List("fobo", "pace", "1.0.2", "css", "themes", "black" , "pace-theme-center-radar.css")
        case "fobo" :: "black" :: "pace-theme-center-simple.css" :: Nil    => List("fobo", "pace", "1.0.2", "css", "themes", "black" , "pace-theme-center-simple.css")
        case "fobo" :: "black" :: "pace-theme-corner-indicator.css" :: Nil => List("fobo", "pace", "1.0.2", "css", "themes", "black" , "pace-theme-corner-indicator.css")
        case "fobo" :: "black" :: "pace-theme-fill-left.css" :: Nil        => List("fobo", "pace", "1.0.2", "css", "themes", "black" , "pace-theme-fill-left.css")
        case "fobo" :: "black" :: "pace-theme-flash.css" :: Nil            => List("fobo", "pace", "1.0.2", "css", "themes", "black" , "pace-theme-flash.css")
        case "fobo" :: "black" :: "pace-theme-flat-top.css" :: Nil         => List("fobo", "pace", "1.0.2", "css", "themes", "black" , "pace-theme-flat-top.css")
        case "fobo" :: "black" :: "pace-theme-loading-bar.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "black" , "pace-theme-loading-bar.css")
        case "fobo" :: "black" :: "pace-theme-mac-osx.css" :: Nil          => List("fobo", "pace", "1.0.2", "css", "themes", "black" , "pace-theme-mac-osx.css")
        case "fobo" :: "black" :: "pace-theme-minimal.css" :: Nil          => List("fobo", "pace", "1.0.2", "css", "themes", "black" , "pace-theme-minimal.css")
        //blue
        case "fobo" :: "blue" :: "pace-theme-barber-shop.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "blue" , "pace-theme-barber-shop-min.css")
        case "fobo" :: "blue" :: "pace-theme-big-counter.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "blue" , "pace-theme-big-counter.css")
        case "fobo" :: "blue" :: "pace-theme-bounce.css" :: Nil           => List("fobo", "pace", "1.0.2", "css", "themes", "blue" , "pace-theme-bounce.css")
        case "fobo" :: "blue" :: "pace-theme-center-atom.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "blue" , "pace-theme-center-atom.css")
        case "fobo" :: "blue" :: "pace-theme-center-circle.css" :: Nil    => List("fobo", "pace", "1.0.2", "css", "themes", "blue" , "pace-theme-center-circle.css")
        case "fobo" :: "blue" :: "pace-theme-center-radar.css" :: Nil     => List("fobo", "pace", "1.0.2", "css", "themes", "blue" , "pace-theme-center-radar.css")
        case "fobo" :: "blue" :: "pace-theme-center-simple.css" :: Nil    => List("fobo", "pace", "1.0.2", "css", "themes", "blue" , "pace-theme-center-simple.css")
        case "fobo" :: "blue" :: "pace-theme-corner-indicator.css" :: Nil => List("fobo", "pace", "1.0.2", "css", "themes", "blue" , "pace-theme-corner-indicator.css")
        case "fobo" :: "blue" :: "pace-theme-fill-left.css" :: Nil        => List("fobo", "pace", "1.0.2", "css", "themes", "blue" , "pace-theme-fill-left.css")
        case "fobo" :: "blue" :: "pace-theme-flash.css" :: Nil            => List("fobo", "pace", "1.0.2", "css", "themes", "blue" , "pace-theme-flash.css")
        case "fobo" :: "blue" :: "pace-theme-flat-top.css" :: Nil         => List("fobo", "pace", "1.0.2", "css", "themes", "blue" , "pace-theme-flat-top.css")
        case "fobo" :: "blue" :: "pace-theme-loading-bar.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "blue" , "pace-theme-loading-bar.css")
        case "fobo" :: "blue" :: "pace-theme-mac-osx.css" :: Nil          => List("fobo", "pace", "1.0.2", "css", "themes", "blue" , "pace-theme-mac-osx.css")
        case "fobo" :: "blue" :: "pace-theme-minimal.css" :: Nil          => List("fobo", "pace", "1.0.2", "css", "themes", "blue" , "pace-theme-minimal.css")
        //green
        case "fobo" :: "green" :: "pace-theme-barber-shop.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "green" , "pace-theme-barber-shop-min.css")
        case "fobo" :: "green" :: "pace-theme-big-counter.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "green" , "pace-theme-big-counter.css")
        case "fobo" :: "green" :: "pace-theme-bounce.css" :: Nil           => List("fobo", "pace", "1.0.2", "css", "themes", "green" , "pace-theme-bounce.css")
        case "fobo" :: "green" :: "pace-theme-center-atom.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "green" , "pace-theme-center-atom.css")
        case "fobo" :: "green" :: "pace-theme-center-circle.css" :: Nil    => List("fobo", "pace", "1.0.2", "css", "themes", "green" , "pace-theme-center-circle.css")
        case "fobo" :: "green" :: "pace-theme-center-radar.css" :: Nil     => List("fobo", "pace", "1.0.2", "css", "themes", "green" , "pace-theme-center-radar.css")
        case "fobo" :: "green" :: "pace-theme-center-simple.css" :: Nil    => List("fobo", "pace", "1.0.2", "css", "themes", "green" , "pace-theme-center-simple.css")
        case "fobo" :: "green" :: "pace-theme-corner-indicator.css" :: Nil => List("fobo", "pace", "1.0.2", "css", "themes", "green" , "pace-theme-corner-indicator.css")
        case "fobo" :: "green" :: "pace-theme-fill-left.css" :: Nil        => List("fobo", "pace", "1.0.2", "css", "themes", "green" , "pace-theme-fill-left.css")
        case "fobo" :: "green" :: "pace-theme-flash.css" :: Nil            => List("fobo", "pace", "1.0.2", "css", "themes", "green" , "pace-theme-flash.css")
        case "fobo" :: "green" :: "pace-theme-flat-top.css" :: Nil         => List("fobo", "pace", "1.0.2", "css", "themes", "green" , "pace-theme-flat-top.css")
        case "fobo" :: "green" :: "pace-theme-loading-bar.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "green" , "pace-theme-loading-bar.css")
        case "fobo" :: "green" :: "pace-theme-mac-osx.css" :: Nil          => List("fobo", "pace", "1.0.2", "css", "themes", "green" , "pace-theme-mac-osx.css")
        case "fobo" :: "green" :: "pace-theme-minimal.css" :: Nil          => List("fobo", "pace", "1.0.2", "css", "themes", "green" , "pace-theme-minimal.css")   
        //orange
        case "fobo" :: "orange" :: "pace-theme-barber-shop.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "orange" , "pace-theme-barber-shop-min.css")
        case "fobo" :: "orange" :: "pace-theme-big-counter.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "orange" , "pace-theme-big-counter.css")
        case "fobo" :: "orange" :: "pace-theme-bounce.css" :: Nil           => List("fobo", "pace", "1.0.2", "css", "themes", "orange" , "pace-theme-bounce.css")
        case "fobo" :: "orange" :: "pace-theme-center-atom.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "orange" , "pace-theme-center-atom.css")
        case "fobo" :: "orange" :: "pace-theme-center-circle.css" :: Nil    => List("fobo", "pace", "1.0.2", "css", "themes", "orange" , "pace-theme-center-circle.css")
        case "fobo" :: "orange" :: "pace-theme-center-radar.css" :: Nil     => List("fobo", "pace", "1.0.2", "css", "themes", "orange" , "pace-theme-center-radar.css")
        case "fobo" :: "orange" :: "pace-theme-center-simple.css" :: Nil    => List("fobo", "pace", "1.0.2", "css", "themes", "orange" , "pace-theme-center-simple.css")
        case "fobo" :: "orange" :: "pace-theme-corner-indicator.css" :: Nil => List("fobo", "pace", "1.0.2", "css", "themes", "orange" , "pace-theme-corner-indicator.css")
        case "fobo" :: "orange" :: "pace-theme-fill-left.css" :: Nil        => List("fobo", "pace", "1.0.2", "css", "themes", "orange" , "pace-theme-fill-left.css")
        case "fobo" :: "orange" :: "pace-theme-flash.css" :: Nil            => List("fobo", "pace", "1.0.2", "css", "themes", "orange" , "pace-theme-flash.css")
        case "fobo" :: "orange" :: "pace-theme-flat-top.css" :: Nil         => List("fobo", "pace", "1.0.2", "css", "themes", "orange" , "pace-theme-flat-top.css")
        case "fobo" :: "orange" :: "pace-theme-loading-bar.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "orange" , "pace-theme-loading-bar.css")
        case "fobo" :: "orange" :: "pace-theme-mac-osx.css" :: Nil          => List("fobo", "pace", "1.0.2", "css", "themes", "orange" , "pace-theme-mac-osx.css")
        case "fobo" :: "orange" :: "pace-theme-minimal.css" :: Nil          => List("fobo", "pace", "1.0.2", "css", "themes", "orange" , "pace-theme-minimal.css")
        //pink
        case "fobo" :: "pink" :: "pace-theme-barber-shop.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "pink" , "pace-theme-barber-shop-min.css")
        case "fobo" :: "pink" :: "pace-theme-big-counter.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "pink" , "pace-theme-big-counter.css")
        case "fobo" :: "pink" :: "pace-theme-bounce.css" :: Nil           => List("fobo", "pace", "1.0.2", "css", "themes", "pink" , "pace-theme-bounce.css")
        case "fobo" :: "pink" :: "pace-theme-center-atom.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "pink" , "pace-theme-center-atom.css")
        case "fobo" :: "pink" :: "pace-theme-center-circle.css" :: Nil    => List("fobo", "pace", "1.0.2", "css", "themes", "pink" , "pace-theme-center-circle.css")
        case "fobo" :: "pink" :: "pace-theme-center-radar.css" :: Nil     => List("fobo", "pace", "1.0.2", "css", "themes", "pink" , "pace-theme-center-radar.css")
        case "fobo" :: "pink" :: "pace-theme-center-simple.css" :: Nil    => List("fobo", "pace", "1.0.2", "css", "themes", "pink" , "pace-theme-center-simple.css")
        case "fobo" :: "pink" :: "pace-theme-corner-indicator.css" :: Nil => List("fobo", "pace", "1.0.2", "css", "themes", "pink" , "pace-theme-corner-indicator.css")
        case "fobo" :: "pink" :: "pace-theme-fill-left.css" :: Nil        => List("fobo", "pace", "1.0.2", "css", "themes", "pink" , "pace-theme-fill-left.css")
        case "fobo" :: "pink" :: "pace-theme-flash.css" :: Nil            => List("fobo", "pace", "1.0.2", "css", "themes", "pink" , "pace-theme-flash.css")
        case "fobo" :: "pink" :: "pace-theme-flat-top.css" :: Nil         => List("fobo", "pace", "1.0.2", "css", "themes", "pink" , "pace-theme-flat-top.css")
        case "fobo" :: "pink" :: "pace-theme-loading-bar.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "pink" , "pace-theme-loading-bar.css")
        case "fobo" :: "pink" :: "pace-theme-mac-osx.css" :: Nil          => List("fobo", "pace", "1.0.2", "css", "themes", "pink" , "pace-theme-mac-osx.css")
        case "fobo" :: "pink" :: "pace-theme-minimal.css" :: Nil          => List("fobo", "pace", "1.0.2", "css", "themes", "pink" , "pace-theme-minimal.css")
        //purple
        case "fobo" :: "purple" :: "pace-theme-barber-shop.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "purple" , "pace-theme-barber-shop-min.css")
        case "fobo" :: "purple" :: "pace-theme-big-counter.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "purple" , "pace-theme-big-counter.css")
        case "fobo" :: "purple" :: "pace-theme-bounce.css" :: Nil           => List("fobo", "pace", "1.0.2", "css", "themes", "purple" , "pace-theme-bounce.css")
        case "fobo" :: "purple" :: "pace-theme-center-atom.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "purple" , "pace-theme-center-atom.css")
        case "fobo" :: "purple" :: "pace-theme-center-circle.css" :: Nil    => List("fobo", "pace", "1.0.2", "css", "themes", "purple" , "pace-theme-center-circle.css")
        case "fobo" :: "purple" :: "pace-theme-center-radar.css" :: Nil     => List("fobo", "pace", "1.0.2", "css", "themes", "purple" , "pace-theme-center-radar.css")
        case "fobo" :: "purple" :: "pace-theme-center-simple.css" :: Nil    => List("fobo", "pace", "1.0.2", "css", "themes", "purple" , "pace-theme-center-simple.css")
        case "fobo" :: "purple" :: "pace-theme-corner-indicator.css" :: Nil => List("fobo", "pace", "1.0.2", "css", "themes", "purple" , "pace-theme-corner-indicator.css")
        case "fobo" :: "purple" :: "pace-theme-fill-left.css" :: Nil        => List("fobo", "pace", "1.0.2", "css", "themes", "purple" , "pace-theme-fill-left.css")
        case "fobo" :: "purple" :: "pace-theme-flash.css" :: Nil            => List("fobo", "pace", "1.0.2", "css", "themes", "purple" , "pace-theme-flash.css")
        case "fobo" :: "purple" :: "pace-theme-flat-top.css" :: Nil         => List("fobo", "pace", "1.0.2", "css", "themes", "purple" , "pace-theme-flat-top.css")
        case "fobo" :: "purple" :: "pace-theme-loading-bar.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "purple" , "pace-theme-loading-bar.css")
        case "fobo" :: "purple" :: "pace-theme-mac-osx.css" :: Nil          => List("fobo", "pace", "1.0.2", "css", "themes", "purple" , "pace-theme-mac-osx.css")
        case "fobo" :: "purple" :: "pace-theme-minimal.css" :: Nil          => List("fobo", "pace", "1.0.2", "css", "themes", "purple" , "pace-theme-minimal.css")
        //red
        case "fobo" :: "red" :: "pace-theme-barber-shop.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "red" , "pace-theme-barber-shop-min.css")
        case "fobo" :: "red" :: "pace-theme-big-counter.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "red" , "pace-theme-big-counter.css")
        case "fobo" :: "red" :: "pace-theme-bounce.css" :: Nil           => List("fobo", "pace", "1.0.2", "css", "themes", "red" , "pace-theme-bounce.css")
        case "fobo" :: "red" :: "pace-theme-center-atom.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "red" , "pace-theme-center-atom.css")
        case "fobo" :: "red" :: "pace-theme-center-circle.css" :: Nil    => List("fobo", "pace", "1.0.2", "css", "themes", "red" , "pace-theme-center-circle.css")
        case "fobo" :: "red" :: "pace-theme-center-radar.css" :: Nil     => List("fobo", "pace", "1.0.2", "css", "themes", "red" , "pace-theme-center-radar.css")
        case "fobo" :: "red" :: "pace-theme-center-simple.css" :: Nil    => List("fobo", "pace", "1.0.2", "css", "themes", "red" , "pace-theme-center-simple.css")
        case "fobo" :: "red" :: "pace-theme-corner-indicator.css" :: Nil => List("fobo", "pace", "1.0.2", "css", "themes", "red" , "pace-theme-corner-indicator.css")
        case "fobo" :: "red" :: "pace-theme-fill-left.css" :: Nil        => List("fobo", "pace", "1.0.2", "css", "themes", "red" , "pace-theme-fill-left.css")
        case "fobo" :: "red" :: "pace-theme-flash.css" :: Nil            => List("fobo", "pace", "1.0.2", "css", "themes", "red" , "pace-theme-flash.css")
        case "fobo" :: "red" :: "pace-theme-flat-top.css" :: Nil         => List("fobo", "pace", "1.0.2", "css", "themes", "red" , "pace-theme-flat-top.css")
        case "fobo" :: "red" :: "pace-theme-loading-bar.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "red" , "pace-theme-loading-bar.css")
        case "fobo" :: "red" :: "pace-theme-mac-osx.css" :: Nil          => List("fobo", "pace", "1.0.2", "css", "themes", "red" , "pace-theme-mac-osx.css")
        case "fobo" :: "red" :: "pace-theme-minimal.css" :: Nil          => List("fobo", "pace", "1.0.2", "css", "themes", "red" , "pace-theme-minimal.css")
        //silver
        case "fobo" :: "silver" :: "pace-theme-barber-shop.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "silver" , "pace-theme-barber-shop-min.css")
        case "fobo" :: "silver" :: "pace-theme-big-counter.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "silver" , "pace-theme-big-counter.css")
        case "fobo" :: "silver" :: "pace-theme-bounce.css" :: Nil           => List("fobo", "pace", "1.0.2", "css", "themes", "silver" , "pace-theme-bounce.css")
        case "fobo" :: "silver" :: "pace-theme-center-atom.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "silver" , "pace-theme-center-atom.css")
        case "fobo" :: "silver" :: "pace-theme-center-circle.css" :: Nil    => List("fobo", "pace", "1.0.2", "css", "themes", "silver" , "pace-theme-center-circle.css")
        case "fobo" :: "silver" :: "pace-theme-center-radar.css" :: Nil     => List("fobo", "pace", "1.0.2", "css", "themes", "silver" , "pace-theme-center-radar.css")
        case "fobo" :: "silver" :: "pace-theme-center-simple.css" :: Nil    => List("fobo", "pace", "1.0.2", "css", "themes", "silver" , "pace-theme-center-simple.css")
        case "fobo" :: "silver" :: "pace-theme-corner-indicator.css" :: Nil => List("fobo", "pace", "1.0.2", "css", "themes", "silver" , "pace-theme-corner-indicator.css")
        case "fobo" :: "silver" :: "pace-theme-fill-left.css" :: Nil        => List("fobo", "pace", "1.0.2", "css", "themes", "silver" , "pace-theme-fill-left.css")
        case "fobo" :: "silver" :: "pace-theme-flash.css" :: Nil            => List("fobo", "pace", "1.0.2", "css", "themes", "silver" , "pace-theme-flash.css")
        case "fobo" :: "silver" :: "pace-theme-flat-top.css" :: Nil         => List("fobo", "pace", "1.0.2", "css", "themes", "silver" , "pace-theme-flat-top.css")
        case "fobo" :: "silver" :: "pace-theme-loading-bar.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "silver" , "pace-theme-loading-bar.css")
        case "fobo" :: "silver" :: "pace-theme-mac-osx.css" :: Nil          => List("fobo", "pace", "1.0.2", "css", "themes", "silver" , "pace-theme-mac-osx.css")
        case "fobo" :: "silver" :: "pace-theme-minimal.css" :: Nil          => List("fobo", "pace", "1.0.2", "css", "themes", "silver" , "pace-theme-minimal.css")
        //white
        case "fobo" :: "white" :: "pace-theme-barber-shop.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "white" , "pace-theme-barber-shop-min.css")
        case "fobo" :: "white" :: "pace-theme-big-counter.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "white" , "pace-theme-big-counter.css")
        case "fobo" :: "white" :: "pace-theme-bounce.css" :: Nil           => List("fobo", "pace", "1.0.2", "css", "themes", "white" , "pace-theme-bounce.css")
        case "fobo" :: "white" :: "pace-theme-center-atom.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "white" , "pace-theme-center-atom.css")
        case "fobo" :: "white" :: "pace-theme-center-circle.css" :: Nil    => List("fobo", "pace", "1.0.2", "css", "themes", "white" , "pace-theme-center-circle.css")
        case "fobo" :: "white" :: "pace-theme-center-radar.css" :: Nil     => List("fobo", "pace", "1.0.2", "css", "themes", "white" , "pace-theme-center-radar.css")
        case "fobo" :: "white" :: "pace-theme-center-simple.css" :: Nil    => List("fobo", "pace", "1.0.2", "css", "themes", "white" , "pace-theme-center-simple.css")
        case "fobo" :: "white" :: "pace-theme-corner-indicator.css" :: Nil => List("fobo", "pace", "1.0.2", "css", "themes", "white" , "pace-theme-corner-indicator.css")
        case "fobo" :: "white" :: "pace-theme-fill-left.css" :: Nil        => List("fobo", "pace", "1.0.2", "css", "themes", "white" , "pace-theme-fill-left.css")
        case "fobo" :: "white" :: "pace-theme-flash.css" :: Nil            => List("fobo", "pace", "1.0.2", "css", "themes", "white" , "pace-theme-flash.css")
        case "fobo" :: "white" :: "pace-theme-flat-top.css" :: Nil         => List("fobo", "pace", "1.0.2", "css", "themes", "white" , "pace-theme-flat-top.css")
        case "fobo" :: "white" :: "pace-theme-loading-bar.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "white" , "pace-theme-loading-bar.css")
        case "fobo" :: "white" :: "pace-theme-mac-osx.css" :: Nil          => List("fobo", "pace", "1.0.2", "css", "themes", "white" , "pace-theme-mac-osx.css")
        case "fobo" :: "white" :: "pace-theme-minimal.css" :: Nil          => List("fobo", "pace", "1.0.2", "css", "themes", "white" , "pace-theme-minimal.css")
        //yellow
        case "fobo" :: "yellow" :: "pace-theme-barber-shop.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "yellow" , "pace-theme-barber-shop-min.css")
        case "fobo" :: "yellow" :: "pace-theme-big-counter.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "yellow" , "pace-theme-big-counter.css")
        case "fobo" :: "yellow" :: "pace-theme-bounce.css" :: Nil           => List("fobo", "pace", "1.0.2", "css", "themes", "yellow" , "pace-theme-bounce.css")
        case "fobo" :: "yellow" :: "pace-theme-center-atom.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "yellow" , "pace-theme-center-atom.css")
        case "fobo" :: "yellow" :: "pace-theme-center-circle.css" :: Nil    => List("fobo", "pace", "1.0.2", "css", "themes", "yellow" , "pace-theme-center-circle.css")
        case "fobo" :: "yellow" :: "pace-theme-center-radar.css" :: Nil     => List("fobo", "pace", "1.0.2", "css", "themes", "yellow" , "pace-theme-center-radar.css")
        case "fobo" :: "yellow" :: "pace-theme-center-simple.css" :: Nil    => List("fobo", "pace", "1.0.2", "css", "themes", "yellow" , "pace-theme-center-simple.css")
        case "fobo" :: "yellow" :: "pace-theme-corner-indicator.css" :: Nil => List("fobo", "pace", "1.0.2", "css", "themes", "yellow" , "pace-theme-corner-indicator.css")
        case "fobo" :: "yellow" :: "pace-theme-fill-left.css" :: Nil        => List("fobo", "pace", "1.0.2", "css", "themes", "yellow" , "pace-theme-fill-left.css")
        case "fobo" :: "yellow" :: "pace-theme-flash.css" :: Nil            => List("fobo", "pace", "1.0.2", "css", "themes", "yellow" , "pace-theme-flash.css")
        case "fobo" :: "yellow" :: "pace-theme-flat-top.css" :: Nil         => List("fobo", "pace", "1.0.2", "css", "themes", "yellow" , "pace-theme-flat-top.css")
        case "fobo" :: "yellow" :: "pace-theme-loading-bar.css" :: Nil      => List("fobo", "pace", "1.0.2", "css", "themes", "yellow" , "pace-theme-loading-bar.css")
        case "fobo" :: "yellow" :: "pace-theme-mac-osx.css" :: Nil          => List("fobo", "pace", "1.0.2", "css", "themes", "yellow" , "pace-theme-mac-osx.css")
        case "fobo" :: "yellow" :: "pace-theme-minimal.css" :: Nil          => List("fobo", "pace", "1.0.2", "css", "themes", "yellow" , "pace-theme-minimal.css")    
      }
    }
    
    
    lazy val Pace0415: Unit = {
      ResourceServer.rewrite {

        case "fobo" :: "pace.js" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "js", "pace.js")
        case "fobo" :: "pace.js" :: Nil => List("fobo", "pace", "0.4.15", "js", "pace.min.js")

        case "fobo" :: "pace-theme-barber-shop.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-barber-shop.css")
        case "fobo" :: "pace-theme-barber-shop.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-barber-shop-min.css")

        case "fobo" :: "pace-theme-big-counter.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-big-counter.css")
        case "fobo" :: "pace-theme-big-counter.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-big-counter-min.css")

        case "fobo" :: "pace-theme-bounce.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-bounce.css")
        case "fobo" :: "pace-theme-bounce.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-bounce-min.css")

        case "fobo" :: "pace-theme-center-circle.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-center-circle.css")
        case "fobo" :: "pace-theme-center-circle.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-center-circle-min.css")

        case "fobo" :: "pace-theme-corner-indicator.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-corner-indicator.css")
        case "fobo" :: "pace-theme-corner-indicator.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-corner-indicator-min.css")

        case "fobo" :: "pace-theme-fill-left.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-fill-left.css")
        case "fobo" :: "pace-theme-fill-left.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-fill-left-min.css")

        case "fobo" :: "pace-theme-flash.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-flash.css")
        case "fobo" :: "pace-theme-flash.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-flash-min.css")

        case "fobo" :: "pace-theme-flash-red.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-flash-red.css")
        case "fobo" :: "pace-theme-flash-red.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-flash-red-min.css")

        case "fobo" :: "pace-theme-flat-top.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-flat-top.css")
        case "fobo" :: "pace-theme-flat-top.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-flat-top-min.css")

        case "fobo" :: "pace-theme-mac-osx.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-mac-osx.css")
        case "fobo" :: "pace-theme-mac-osx.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-mac-osx-min.css")

        case "fobo" :: "pace-theme-minimal.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-minimal.css")
        case "fobo" :: "pace-theme-minimal.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-minimal-min.css")

        case "fobo" :: "pace-theme-minimal-red.css" :: Nil if Props.devMode => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-minimal-red.css")
        case "fobo" :: "pace-theme-minimal-red.css" :: Nil => List("fobo", "pace", "0.4.15", "css", "themes", "pace-theme-minimal-red-min.css")

      }
    }

  }
}




