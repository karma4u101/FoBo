package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

/**
 * ==FoBo API sub-module== 
 * This package object provides module initiation in FoBo's most fine grain level. 
 * 
 * This is useful if you want to depend on a small subset of FoBo's functionality 
 * by only pulling in some specific FoBo artifact(s) that provides toolkit resources
 * or FoBo API functions.
 * 
 * This module provides initiation of API functions for the JQuery module.
 *  
 * For more information on how to set up and use the FoBo modules see the FoBo readme. 
 */ usage information. 
 */
package object FoBoJQAPI {

  abstract sealed trait API
  
  object API extends API {
    var Init: API = null
    /**
     * Enable usage of FoBo's JQuery API version 1 in your bootstrap liftweb Boot.
     * @version 1.X.X
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQAPI => FoBo}
     *    :
     *   FoBo.API.Init=FoBo.API.JQuery1
     * }}}
     */    
     case object JQuery1 extends API {
       FoBoAPI.init
     } 
    
    /**
     * Enable usage of FoBo's JQuery API version 1 in your bootstrap liftweb Boot.
     * @version 2.X.X
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoJQAPI => FoBo}
     *    :
     *   FoBo.API.Init=FoBo.API.JQuery2
     * }}}
     */    
     case object JQuery2 extends API {
       FoBoAPI.init
     }     
    
    
  }

  /**
   * Object for initiating FoBo API packages. 
   */
  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.FoBoJQ")      
    }
  }   
  
//old stuff  
  
  def init() {
    LiftRules.addToPackages("net.liftmodules.FoBoJQ")
    ResourceServer.allow {
      case "fobo" :: tail => true
    }
  }

 
  abstract sealed trait FoBoJQ

  /**
   *
   */
  object InitParam extends FoBoJQ {
    var JQuery: FoBoJQ = null
  }
 
  
   /**
   * Enable usage of JQuery-migrate version 1&#8228;2&#8228;1 in your bootstrap liftweb Boot.
   * @version 1.2.1
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQueryMigrate121
   * }}}
   * @since v1.3
   */
  case object JQueryMigrate121 extends FoBoJQ {
    FoBoResources.init
    FoBoResources.jqueryMigrate121
  }  

  
  /**
   * Enable usage of JQuery version 2&#8228;1&#8228;4 in your bootstrap liftweb Boot.
   * @version 2.1.4
   * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery211
   * }}}
   * @since v1.3
   */
case object JQuery214 extends FoBoJQ {
  FoBoResources.init
  FoBoResources.jquery214
}

  /**
   * Enable usage of JQuery version 2&#8228;1&#8228;1 in your bootstrap liftweb Boot.
   * @version 2.1.1
   * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery211
   * }}}
   * @since v1.3
   */
case object JQuery211 extends FoBoJQ {
  FoBoResources.init
  FoBoResources.jquery211
} 


/**
 * Enable usage of JQuery version 1&#8228;11&#8228;3 in your bootstrap liftweb Boot.
 * @version 1.11.3
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBoJQ.InitParam.JQuery=FoBoJQ.JQuery1113
 * }}}
 * @since v1.4 
 */
case object JQuery1113 extends FoBoJQ {
  FoBoResources.init
  FoBoResources.jquery1113
}

/**
 * Enable usage of JQuery version 1&#8228;11&#8228;1 in your bootstrap liftweb Boot.
 * @version 1.11.1
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBoJQ.InitParam.JQuery=FoBoJQ.JQuery1111
 * }}}
 * @since v1.3 
 */
@deprecated("Use v1.11.3 or later","1.4") 
case object JQuery1111 extends FoBoJQ {
  FoBoResources.init
  FoBoResources.jquery1111
}

/**
 * Enable usage of JQuery version 1&#8228;11&#8228;0 in your bootstrap liftweb Boot.
 * @version 1.11.0
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBoJQ.InitParam.JQuery=FoBoJQ.JQuery1110
 * }}}
 * @since v1.2 
 */
@deprecated("Use v1.11.1 or later","1.3")  
case object JQuery1110 extends FoBoJQ {
  FoBoResources.init
  FoBoResources.jquery1110
}

/**
 * Enable usage of JQuery version 1&#8228;10&#8228;2 in your bootstrap liftweb Boot.
 * @version 1.10.2
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBoJQ.InitParam.JQuery=FoBoJQ.JQuery1102
 * }}}
 */
case object JQuery1102 extends FoBoJQ {
  FoBoResources.init
  FoBoResources.jquery1102
}

/**
 * Enable usage of JQuery version 1&#8228;9&#8228;1 in your bootstrap liftweb Boot.
 * @version 1.9.1
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBoJQ.InitParam.JQuery=FoBoJQ.JQuery191
 * }}}
 */
case object JQuery191 extends FoBoJQ {
  FoBoResources.init
  FoBoResources.jquery191
}  
  
/**
 * Enable usage of JQuery version 1&#8228;8&#8228;2 in your bootstrap liftweb Boot.
 * @version 1.8.2
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBoJQ.InitParam.JQuery=FoBoJQ.JQuery182
 * }}}
 */
case object JQuery182 extends FoBoJQ {
  FoBoResources.init
  FoBoResources.jquery182
}

/**
 * Enable usage of JQuery version 1&#8228;7&#8228;2 in your bootstrap liftweb Boot.
 * @version 1.7.2
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBoJQ.InitParam.JQuery=FoBoJQ.JQuery172
 * }}}
 */
case object JQuery172 extends FoBoJQ {
  FoBoResources.init
  FoBoResources.jquery172
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




