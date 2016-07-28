package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

/**
 * ==FoBo JQuery Resource Module== 
 * 
 * This resource module provides JQuery resource components to the FoBo JQuery Toolkit module, 
 * but can also be used as-is, see below for setup information.
 * 
 * If you are using this module via the FoBo/FoBo module see also [[net.liftmodules.FoBo]] for setup information. 
 */
package object FoBoJQRes {
  
  override def toString() = FoBoJQRes.Resource.toString()

  /**
   * Initiate FoBo's JQuery Resource(s) in you bootstrap liftweb Boot.
   * 
   *  '''Example:'''
   * {{{
   *   import net.liftmodules.{FoBoJQRes => FoBo}
   *    :
   *   FoBo.Resource.Init=FoBo.Resource.[Resource Object]
   * }}}
   * '''Note:''' To see available objects click on the round trait icon in the header of this page.
   */       
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
    override def toString() = "FoBoJQRes.Resource = "+store.toString()

    /**
     * Enable usage of FoBo's JQuery resources version 2&#8228;2&#8228;4 in your bootstrap liftweb Boot.
     * @version 2.2.4
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQPRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery224
     * }}}
     */    
     case object JQuery224 extends Resource {
       FoBoResources.init
       FoBoResources.jquery224
     } 
    
    /**
     * Enable usage of FoBo's JQuery resources version 1&#8228;2&#8228;1 in your bootstrap liftweb Boot.
     * @version 1.2.1
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQPRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQueryMigrate121
     * }}}
     */    
     case object JQueryMigrate121 extends Resource {
       FoBoResources.init
       FoBoResources.jqueryMigrate121
     }     
    
    /**
     * Enable usage of FoBo's JQuery resources version 2&#8228;1&#8228;4 in your bootstrap liftweb Boot.
     * @version 2.1.4
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQPRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery214
     * }}}
     */    
     case object JQuery214 extends Resource {
       FoBoResources.init
       FoBoResources.jquery214
     } 
     
    /**
     * Enable usage of FoBo's JQuery resources version 2&#8228;1&#8228;1 in your bootstrap liftweb Boot.
     * @version 2.1.1
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQPRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery211
     * }}}
     */    
     case object JQuery211 extends Resource {
       FoBoResources.init
       FoBoResources.jquery211
     }      
    
    /**
     * Enable usage of FoBo's JQuery resources version 1&#8228;11&#8228;3 in your bootstrap liftweb Boot.
     * @version 1.11.3
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQPRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery1113
     * }}}
     */    
     case object JQuery1113 extends Resource {
       FoBoResources.init
       FoBoResources.jquery1113
     }  
     
    /**
     * Enable usage of FoBo's JQuery resources version 1&#8228;11&#8228;3 in your bootstrap liftweb Boot.
     * @version 1.10.2
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQPRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery1102
     * }}}
     */    
     case object JQuery1102 extends Resource {
       FoBoResources.init
       FoBoResources.jquery1102
     } 
     
    /**
     * Enable usage of FoBo's JQuery resources version 1&#8228;9&#8228;1 in your bootstrap liftweb Boot.
     * @version 1.9.1
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQPRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery191
     * }}}
     */    
     case object JQuery191 extends Resource {
       FoBoResources.init
       FoBoResources.jquery191
     }
     
   /**
     * Enable usage of FoBo's JQuery resources version 1&#8228;8&#8228;2 in your bootstrap liftweb Boot.
     * @version 1.8.2
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQPRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery182
     * }}}
     */    
     case object JQuery182 extends Resource {
       FoBoResources.init
       FoBoResources.jquery182
     } 
     
   /**
     * Enable usage of FoBo's JQuery resources version 1&#8228;7&#8228;2 in your bootstrap liftweb Boot.
     * @version 1.7.2
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQPRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery172
     * }}}
     */    
     case object JQuery172 extends Resource {
       FoBoResources.init
       FoBoResources.jquery172
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
  
  lazy val jquery224 = {
    ResourceServer.rewrite {//fetched from the jquery module ("adding" fobo to the modules path)
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "2.2.4", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "2.2.4", "js", "jquery-min.js")
    }
  }  
  
  lazy val jqueryMigrate121 = {
    ResourceServer.rewrite {
      case "fobo" :: "jquery-migrate.js" :: Nil if Props.devMode => List("jquery-migrate", "1.2.1", "js", "jquery-migrate.js")
      case "fobo" :: "jquery-migrate.js" :: Nil => List("jquery-migrate", "1.2.1", "js", "jquery-migrate-min.js")
    }
  }    
    
  
  lazy val jquery214 = {
    ResourceServer.rewrite {//fetched from the jquery module ("adding" fobo to the modules path)
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "2.1.4", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "2.1.4", "js", "jquery-min.js")
    }
  }
  
  lazy val jquery211 = {
    ResourceServer.rewrite {//fetched from the jquery module ("adding" fobo to the modules path)
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "2.1.1", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "2.1.1", "js", "jquery-min.js")
    }
  } 
  
  lazy val jquery1113 = {
    ResourceServer.rewrite {//fetched from the jquery module ("adding" fobo to the modules path)
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "1.11.3", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "1.11.3", "js", "jquery-min.js")
    }
  } 
  
  lazy val jquery1111 = {
    ResourceServer.rewrite {//fetched from the jquery module ("adding" fobo to the modules path)
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "1.11.1", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "1.11.1", "js", "jquery-min.js")
    }
  } 
  
  lazy val jquery1110 = {
    ResourceServer.rewrite {//fetched from the jquery module ("adding" fobo to the modules path)
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "1.11.0", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "1.11.0", "js", "jquery-min.js")
    }
  } 
  
  lazy val jquery1102 = {
    ResourceServer.rewrite {//fetched from the jquery module ("adding" fobo to the modules path)
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "1.10.2", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "1.10.2", "js", "jquery-min.js")
    }
  }     
    
  lazy val jquery191 = {
    ResourceServer.rewrite {//fetched from the jquery module ("adding" fobo to the modules path)
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "1.9.1", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "1.9.1", "js", "jquery-min.js")
    }
  } 
  
  lazy val jquery182 = {
    ResourceServer.rewrite {//fetched from the jquery module ("adding" fobo to the modules path)
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "1.8.2", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "1.8.2", "js", "jquery-min.js")
    }
  }   
   
  lazy val jquery172 = {
    ResourceServer.rewrite {
      case "fobo" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "1.7.2", "js", "jquery.js")
      case "fobo" :: "jquery.js" :: Nil => List("jquery", "1.7.2", "js", "jquery-min.js")
    }
  }
  
  }
}




