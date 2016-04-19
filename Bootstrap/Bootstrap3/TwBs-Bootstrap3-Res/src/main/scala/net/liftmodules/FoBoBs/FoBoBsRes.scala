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
 * This module provides toolkit resources for the Bootstrap3 module.
 *  
 * For more information on how to set up and use the FoBo modules see the FoBo readme.
 */
package object FoBoBsRes {
  
  override def toString() = FoBoBsRes.Resource.toString()
  
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
    override def toString() = "FoBoBsRes.Resource = "+store.toString()
    
    /**
     * Enable usage of FoBo's Bootstrap version 3&#8228;3&#8228;6 resources files in your bootstrap liftweb Boot.
     * @version 3.3.6
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoBsRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Bootstrap336
     * }}}
     * @since v1.5
     */
    case object Bootstrap336 extends Resource {
      FoBoResources.init    
      FoBoResources.bootstrap336
    }    
    
    /**
     * Enable usage of FoBo's Bootstrap version 3&#8228;3&#8228;5 resources files in your bootstrap liftweb Boot.
     * @version 3.3.5
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoBsRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Bootstrap335
     * }}}
     * @since v1.4
     */
    @deprecated("Use Bootstrap336 or later","1.5.0")
    case object Bootstrap335 extends Resource {
      FoBoResources.init    
      FoBoResources.bootstrap335
    }      
    
    /**
     * Enable usage of FoBo's Bootstrap version 3&#8228;2&#8228;0 resources files in your bootstrap liftweb Boot.
     * @version 3.2.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoBsRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Bootstrap320
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
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoBsRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Bootstrap311
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
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoBsRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Bootstrap301
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
  
  lazy val bootstrap336: Unit = {
    ResourceServer.rewrite {
      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap", "3.3.6", "css", "bootstrap.css")
      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "bootstrap", "3.3.6", "css", "bootstrap.min.css")
      case "fobo" :: "bootstrap.css.map" :: Nil if Props.devMode => List("fobo", "bootstrap", "3.3.6", "css", "bootstrap.css.map")
      case "fobo" :: "bootstrap.css.map" :: Nil => List("fobo", "bootstrap", "3.3.6", "css", "bootstrap.min.css.map")
      case "fobo" :: "bootstrap-theme.css" :: Nil if Props.devMode => List("fobo", "bootstrap", "3.3.6", "css", "bootstrap-theme.css")
      case "fobo" :: "bootstrap-theme.css" :: Nil => List("fobo", "bootstrap", "3.3.6", "css", "bootstrap-theme.min.css")
      case "fobo" :: "bootstrap-theme.css.map" :: Nil if Props.devMode => List("fobo", "bootstrap", "3.3.6", "css", "bootstrap-theme.css.map")
      case "fobo" :: "bootstrap-theme.css.map" :: Nil => List("fobo", "bootstrap", "3.3.6", "css", "bootstrap-theme.min.css.map")
      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo", "bootstrap", "3.3.6", "js", "bootstrap.js")
      case "fobo" :: "bootstrap.js" :: Nil => List("fobo", "bootstrap", "3.3.6", "js", "bootstrap.min.js") 
    }
  }
  
  lazy val bootstrap335: Unit = {
    ResourceServer.rewrite {
      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap","3.3.5", "css", "bootstrap.css")
      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "bootstrap","3.3.5", "css", "bootstrap.min.css")
      case "fobo" :: "bootstrap.css.map" :: Nil => List("fobo", "bootstrap","3.3.5", "css", "bootstrap.css.map")
      case "fobo" :: "bootstrap-theme.css" :: Nil if Props.devMode => List("fobo", "bootstrap","3.3.5", "css", "bootstrap-theme.css")
      case "fobo" :: "bootstrap-theme.css" :: Nil => List("fobo", "bootstrap","3.3.5", "css", "bootstrap-theme.min.css")
      case "fobo" :: "bootstrap-theme.css.map" :: Nil => List("fobo", "bootstrap","3.3.5", "css", "bootstrap-theme.css.map")
      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","3.3.5", "js", "bootstrap.js")
      case "fobo" :: "bootstrap.js" :: Nil => List("fobo",  "bootstrap","3.3.5", "js", "bootstrap.min.js") 
    }
  }
  
  lazy val bootstrap320: Unit = {
    ResourceServer.rewrite {
      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap","3.2.0", "css", "bootstrap.css")
      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "bootstrap","3.2.0", "css", "bootstrap.min.css")
      case "fobo" :: "bootstrap.css.map" :: Nil => List("fobo", "bootstrap","3.2.0", "css", "bootstrap.css.map")
      case "fobo" :: "bootstrap-theme.css" :: Nil if Props.devMode => List("fobo", "bootstrap","3.2.0", "css", "bootstrap-theme.css")
      case "fobo" :: "bootstrap-theme.css" :: Nil => List("fobo", "bootstrap","3.2.0", "css", "bootstrap-theme.min.css")
      case "fobo" :: "bootstrap-theme.css.map" :: Nil => List("fobo", "bootstrap","3.2.0", "css", "bootstrap-theme.css.map")
      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","3.2.0", "js", "bootstrap.js")
      case "fobo" :: "bootstrap.js" :: Nil => List("fobo",  "bootstrap","3.2.0", "js", "bootstrap.min.js") 
    }
  }
  
  lazy val bootstrap311: Unit = {
    ResourceServer.rewrite {
      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap","3.1.1", "css", "bootstrap.css")
      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "bootstrap","3.1.1", "css", "bootstrap.min.css")
      case "fobo" :: "bootstrap.css.map" :: Nil => List("fobo", "bootstrap","3.1.1", "css", "bootstrap.css.map")
      case "fobo" :: "bootstrap-theme.css" :: Nil if Props.devMode => List("fobo", "bootstrap","3.1.1", "css", "bootstrap-theme.css")
      case "fobo" :: "bootstrap-theme.css" :: Nil => List("fobo", "bootstrap","3.1.1", "css", "bootstrap-theme.min.css")
      case "fobo" :: "bootstrap-theme.css.map" :: Nil => List("fobo", "bootstrap","3.1.1", "css", "bootstrap-theme.css.map")
      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","3.1.1", "js", "bootstrap.js")
      case "fobo" :: "bootstrap.js" :: Nil => List("fobo",  "bootstrap","3.1.1", "js", "bootstrap.min.js") 
    }
  }
  
  lazy val bootstrap301: Unit = {
    ResourceServer.rewrite {
      case "fobo" :: "bootstrap.css" :: Nil if Props.devMode => List("fobo", "bootstrap","3.0.1", "css", "bootstrap.css")
      case "fobo" :: "bootstrap.css" :: Nil => List("fobo", "bootstrap","3.0.1", "css", "bootstrap.min.css")
      case "fobo" :: "bootstrap-theme.css" :: Nil if Props.devMode => List("fobo", "bootstrap","3.0.1", "css", "bootstrap-theme.css")
      case "fobo" :: "bootstrap-theme.css" :: Nil => List("fobo", "bootstrap","3.0.1", "css", "bootstrap-theme.min.css")
      case "fobo" :: "bootstrap.js" :: Nil if Props.devMode => List("fobo",  "bootstrap","3.0.1", "js", "bootstrap.js")
      case "fobo" :: "bootstrap.js" :: Nil => List("fobo",  "bootstrap","3.0.1", "js", "bootstrap.min.js")   
    }
  }
    

}
  
}

