package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._
/**
 * ==FoBo Toolkit sub-module== 
 * This package object provides Angular integration into your Lift/FoBo application.
 * 
 * This package object is only of interest to you if you are using this module 
 * as a stand alone artifact dependency in your project (without the FoBo meta artifact).
 * This package object provides information on how to initiate and use it 
 * in your project. 
 * 
 * If you are using this module via the FoBo meta artifact 
 * see [[net.liftmodules.FoBo]] for usage information. 
 */
package object FoBoAJS {

  @deprecated("Init is no longer nessesary as it is now automaticaly done for respective FoBoAJS.InitParam","1.6.0")
  def init() {
  }

  
  @deprecated("Use FoBoAJS.ToolKit or FoBoAJS.Resource and FoBoAJS.API","1.6.0")
  abstract sealed trait FoBoToolkit
  
  /**
   * Initiate FoBo's Angular ToolKit(s) in you bootstrap liftweb Boot.
   * Using the ToolKit initiation you will bring in both the 
   * toolkit's resources and if present the FoBo API associated 
   * with the toolkit.  
   * 
   *  '''Example:'''
   * {{{
   *   import net.liftmodules.{FoBoAJS => FoBo}
   *    :
   *   FoBo.ToolKit.Init=FoBo.ToolKit.[ToolKit Object]
   * }}}
   */
  abstract sealed trait ToolKit
  
  /**
   * Initiate FoBo's Angular Resource(s) in you bootstrap liftweb Boot.
   * 
   *  '''Example:'''
   * {{{
   *   import net.liftmodules.{FoBoAJS => FoBo}
   *    :
   *   FoBo.Resource.Init=FoBo.Resource.[Resource Object]
   * }}}
   */  
  abstract sealed trait Resource
  
  /**
   * Initiate FoBo's Angular API in you bootstrap liftweb Boot.
   * 
   *  '''Example:'''
   * {{{
   *   import net.liftmodules.{FoBoAJS => FoBo}
   *    :
   *   FoBo.API.Init=FoBo.API.[API Object]
   * }}}
   */    
  abstract sealed trait API
  
  
  /*=== ToolKit ============================================*/
  object ToolKit extends ToolKit {
    var Init: ToolKit = null 
   
    /**
     * Enable usage of FoBo's AngularJS API and resources version 1&#8228;4&#8228;8 in your bootstrap liftweb Boot.
     * @version 1.4.8
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS148
     * }}}
     *
     */
    case object AngularJS148 extends ToolKit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AngularJS148
    } 
    
    /**
     * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
     * @version 1.4.8 i18n
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS148i18n
     * }}}
     *
     */
    case object AngularJS148i18n extends ToolKit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AngularJS148i18n
    } 
  
    /**
     * Enable usage of FoBo's AngularJS API and resources version 1&#8228;4&#8228;1 in your bootstrap liftweb Boot.
     * @version 1.4.1
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS148
     * }}}
     *
     */
    case object AngularJS141 extends ToolKit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AngularJS141
    }    
    
    /**
     * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
     * @version 1.4.1 i18n
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS141i18n
     * }}}
     *
     */
    case object AngularJS141i18n extends ToolKit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AngularJS141i18n
    }
    
    /**
     * Enable usage of FoBo's AngularJS API and resources version 1&#8228;3&#8228;15 in your bootstrap liftweb Boot.
     * @version 1.3.15
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS1315
     * }}}
     *
     */
    case object AngularJS1315 extends ToolKit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AngularJS1315
    } 

     /**
     * Enable usage of AngularJS i18n resource files in your bootstrap liftweb Boot.
     * @version 1.3.15 i18n
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS1315i18n
     * }}}
     *
     */
    case object AngularJS1315i18n extends ToolKit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AngularJS1315i18n
    }     
    
    /**
     * Enable usage of FoBo's AngularJS API and resources version 1&#8228;2&#8228;19 in your bootstrap liftweb Boot.
     * @version 1.2.19
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS1219
     * }}}
     *
     */
    case object AngularJS1219 extends ToolKit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AngularJS1219
    }     
    
     /**
     * Enable usage of AngularJS i18n resource files in your bootstrap liftweb Boot.
     * @version 1.2.19 i18n
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS1219i18n
     * }}}
     *
     */
    case object AngularJS1219i18n extends ToolKit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AngularJS1219i18n
    }
  
     /**
     * Enable usage of FoBo's Angular Material API and resources version 0&#8228;10&#8228;0 in your bootstrap liftweb Boot.
     * @version 0.10.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AJMaterial0100
     * }}}
     *
     */
    @deprecated("Use AJMaterial101 or later","1.5.0")
    case object AJMaterial0100 extends ToolKit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AJMaterial0100
    }

     /**
     * Enable usage of FoBo's Angular Material API and resources version 1&#8228;0&#8228;1 in your bootstrap liftweb Boot.
     * @version 1.0.1
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AJMaterial101
     * }}}
     *
     */
    case object AJMaterial101 extends ToolKit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AJMaterial101
    }     
    
     /**
     * Enable usage of FoBo's Angular API and AngularUI-Bootstrap resources version 0&#8228;10&#8228;0 in your bootstrap liftweb Boot.
     * @version 0.10.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AJSUIBootstrap0100
     * }}}
     *
     */
    case object AJSUIBootstrap0100 extends ToolKit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AJSUIBootstrap0100
    }  
 
     /**
     * Enable usage of FoBo's Angular API and AngularUI-Bootstrap resources version 0&#8228;7&#8228;0 in your bootstrap liftweb Boot.
     * @version 0.7.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    : 
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AJSUIBootstrap070
     * }}}
     *
     */
    case object AJSUIBootstrap070 extends ToolKit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AJSUIBootstrap070
    }

    /**
     * Enable usage of FoBo's Angular API and AngularUI-Bootstrap resources version 0&#8228;2&#8228;0 in your bootstrap liftweb Boot.
     * @version 0.2.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AJSUIBootstrap020
     * }}}
     *
     */
    case object AJSUIBootstrap020 extends ToolKit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AJSUIBootstrap020
    }    
    
    /**
     * Enable usage of FoBo's Angular API and NG-Grid resources version 2&#8228;0&#8228;7 in your bootstrap liftweb Boot.
     * @version 2.0.7
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AJSNGGrid207
     * }}}
     *
     */
    case object AJSNGGrid207 extends ToolKit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AJSNGGrid207
    }
  
    /**
     * Enable usage of FoBo's Angular API and UI-Grid resources version 3&#8228;0&#8228;7 in your bootstrap liftweb Boot.
     * @version 3.0.7
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AJSUIGrid307
     * }}}
     *
     */
    case object AJSUIGrid307 extends ToolKit {
      FoBoAJSAPI.API.Angular1
      FoBoAJSRes.Resource.AJSUIGrid307
    }        
  }
      
  
  /*=== Resource ============================================*/
  object Resource extends Resource {
    var Init: Resource = null

    /**
     * Enable usage of FoBo's AngularJS version 1&#8228;4&#8228;8 resources files in your bootstrap liftweb Boot.
     * @version 1.4.8
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AngularJS148
     * }}}
     *
     */
    case object AngularJS148 extends Resource {
      FoBoAJSRes.Resource.AngularJS148
    } 
    
    /**
     * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
     * @version 1.4.8 i18n
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AngularJS148i18n
     * }}}
     *
     */
    case object AngularJS148i18n extends Resource {
      FoBoAJSRes.Resource.AngularJS148i18n
    } 
  
    /**
     * Enable usage of AngularJS version 1&#8228;4&#8228;1 resource files in your bootstrap liftweb Boot.
     * @version 1.4.1
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.Resources.Init=FoBo.Resouces.AngularJS148
     * }}}
     *
     */
    case object AngularJS141 extends Resource {
      FoBoAJSRes.Resource.AngularJS141
    }    
    
    /**
     * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
     * @version 1.4.1 i18n
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.Resources.Init=FoBo.Resources.AngularJS141i18n
     * }}}
     *
     */
    case object AngularJS141i18n extends Resource {
      FoBoAJSRes.Resource.AngularJS141i18n
    }
    
    /**
     * Enable usage of AngularJS version 1&#8228;3&#8228;15 resource files in your bootstrap liftweb Boot.
     * @version 1.3.15
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.Resources.Init=FoBo.Resources.AngularJS1315
     * }}}
     *
     */
    case object AngularJS1315 extends Resource {
      FoBoAJSRes.Resource.AngularJS1315
    } 

     /**
     * Enable usage of AngularJS i18n resource files in your bootstrap liftweb Boot.
     * @version 1.3.15 i18n
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.Resources.Init=FoBo.Resources.AngularJS1315i18n
     * }}}
     *
     */
    case object AngularJS1315i18n extends Resource {
      FoBoAJSRes.Resource.AngularJS1315i18n
    }     
    
    /**
     * Enable usage of AngularJS version 1&#8228;2&#8228;19 resource files in your bootstrap liftweb Boot.
     * @version 1.2.19
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AngularJS1219
     * }}}
     *
     */
    case object AngularJS1219 extends Resource {
      FoBoAJSRes.Resource.AngularJS1219
    }     
    
     /**
     * Enable usage of AngularJS i18n resource files in your bootstrap liftweb Boot.
     * @version 1.2.19 i18n
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AngularJS1219i18n
     * }}}
     *
     */
    case object AngularJS1219i18n extends Resource {
      FoBoAJSRes.Resource.AngularJS1219i18n
    }
  
     /**
     * Enable usage of Angular Material version 0&#8228;10&#8228;0 resource files in your bootstrap liftweb Boot.
     * @version 0.10.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AJMaterial0100
     * }}}
     *
     */
    @deprecated("Use AJMaterial101 or later","1.5.0")
    case object AJMaterial0100 extends Resource {
      FoBoAJSRes.Resource.AJMaterial0100
    }

     /**
     * Enable usage of Angular Material version 1&#8228;0&#8228;1 resource files in your bootstrap liftweb Boot.
     * @version 1.0.1
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AJMaterial101
     * }}}
     *
     */
    case object AJMaterial101 extends Resource {
      FoBoAJSRes.Resource.AJMaterial101
    }     
    
     /**
     * Enable usage of AngularUI-Bootstrap version 0&#8228;10&#8228;0 resource files in your bootstrap liftweb Boot.
     * @version 0.10.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AJSUIBootstrap0100
     * }}}
     *
     */
    case object AJSUIBootstrap0100 extends Resource {
      FoBoAJSRes.Resource.AJSUIBootstrap0100
    }  
 
     /**
     * Enable usage of AngularUI-Bootstrap version 0&#8228;7&#8228;0 resource files in your bootstrap liftweb Boot.
     * @version 0.7.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    : 
     *   FoBo.Resource.Init=FoBo.Resource.AJSUIBootstrap070
     * }}}
     *
     */
    case object AJSUIBootstrap070 extends Resource {
      FoBoAJSRes.Resource.AJSUIBootstrap070
    }

    /**
     * Enable usage of AngularUI-Bootstrap version 0&#8228;2&#8228;0 resource files in your bootstrap liftweb Boot.
     * @version 0.2.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AJSUIBootstrap020
     * }}}
     *
     */
    case object AJSUIBootstrap020 extends Resource {
      FoBoAJSRes.Resource.AJSUIBootstrap020
    }    
    
    /**
     * Enable usage of NG-Grid version 2&#8228;0&#8228;7 resource files in your bootstrap liftweb Boot.
     * @version 2.0.7
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AJSNGGrid207
     * }}}
     *
     */
    case object AJSNGGrid207 extends Resource {
      FoBoAJSRes.Resource.AJSNGGrid207
    }
  
    /**
     * Enable usage of UI-Grid version 3&#8228;0&#8228;7 resource files in your bootstrap liftweb Boot.
     * @version 3.0.7
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AJSUIGrid307
     * }}}
     *
     */
    case object AJSUIGrid307 extends Resource {
      FoBoAJSRes.Resource.AJSUIGrid307
    }      
    
  }

  /*=== API ============================================*/
  
  object API extends API {
    var Init: API = null
    
    /**
     * Enable usage of FoBo's AngularJS API 1&#8228;x&#8228;x in your bootstrap liftweb Boot.
     * @version 1.4.8
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoAJS => FoBo}
     *    :
     *   FoBo.API.Init=FoBo.API.Angular1
     * }}}
     *
     */    
    case object Angular1 extends API {
      FoBoAJSAPI.API.Angular1
    }
  }
  
  
  /*=== InitParam (deprecated) ============================================*/
  /**
   *
   */
  @deprecated("Use FoBoAJS.ToolKit.Init=FoBoAJS.ToolKit.[Toolkit Object]","1.6.0")
  object InitParam extends FoBoToolkit {
    var ToolKit: FoBoToolkit = null 
  }
 
  /**
   * Enable usage of AngularJS version 1&#8228;4&#8228;8 in your bootstrap liftweb Boot.
   * @version 1.4.8
   *
   *  '''Example:'''
   *
   * {{{
   *   import net.liftmodules.{FoBoAJS => FoBo}
   *    : 
   *   FoBo.InitParam.Toolkit=FoBo.AngularJS148
   * }}}
   * @since v1.5
   */
  @deprecated("Use FoBoAJS.ToolKit.Init=FoBoAJS.ToolKit.AngularJS148","1.6.0")
  case object AngularJS148 extends FoBoToolkit {
    ToolKit.AngularJS148
  } 
  
    /**
   * Enable usage of AngularJS i18n files in your bootstrap liftweb Boot.
   * @version 1.4.8 i18n
   *
   *  '''Example:'''
   *
   * {{{
   *   import net.liftmodules.{FoBoAJS => FoBo}
   *    :
   *   FoBo.InitParam.Toolkit=FoBo.AngularJS148i18n
   * }}}
   * @since v1.5
   */
  @deprecated("Use FoBoAJS.ToolKit.Init=FoBoAJS.ToolKit.AngularJS148i18n","1.6.0")
  case object AngularJS148i18n extends FoBoToolkit {
    ToolKit.AngularJS148i18n
  } 
  
  
    /**
   * Enable usage of AngularJS version 1&#8228;4&#8228;1 in your bootstrap liftweb Boot.
   * @version 1.4.1
   *
   *  '''Example:'''
   *
   * {{{
   *   import net.liftmodules.{FoBoAJS => FoBo}
   *    :
   *   FoBo.InitParam.Toolkit=FoBo.AngularJS141
   * }}}
   * @since v1.4
   */
  @deprecated("Use FoBoAJS.ToolKit.Init=FoBoAJS.ToolKit.AngularJS141","1.6.0")
  case object AngularJS141 extends FoBoToolkit {
    ToolKit.AngularJS141
  } 
  
    /**
   * Enable usage of AngularJS i18n files in your bootstrap liftweb Boot.
   * @version 1.4.1 i18n
   *
   *  '''Example:'''
   *
   * {{{
   *   import net.liftmodules.{FoBoAJS => FoBo}
   *    :
   *   FoBo.InitParam.Toolkit=FoBo.AngularJS141i18n
   * }}}
   * @since v1.4
   */
  @deprecated("Use FoBoAJS.ToolKit.Init=FoBoAJS.ToolKit.AngularJS141i18n","1.6.0")
  case object AngularJS141i18n extends FoBoToolkit {
    ToolKit.AngularJS141i18n
  } 
   
  /**
   * Enable usage of AngularJS version 1&#8228;3&#8228;15 in your bootstrap liftweb Boot.
   * @version 1.3.15
   *
   *  '''Example:'''
   *
   * {{{
   *   import net.liftmodules.{FoBoAJS => FoBo}
   *    :
   *   FoBo.InitParam.Toolkit=FoBo.AngularJS1315
   * }}}
   * @since v1.4
   */
  @deprecated("Use FoBoAJS.ToolKit.Init=FoBoAJS.ToolKit.AngularJS1315","1.6.0")
  case object AngularJS1315 extends FoBoToolkit {
    ToolKit.AngularJS1315
  } 
  
   /**
   * Enable usage of AngularJS i18n files in your bootstrap liftweb Boot.
   * @version 1.3.15 i18n
   *
   *  '''Example:'''
   *
   * {{{
   *   import net.liftmodules.{FoBoAJS => FoBo}
   *    :
   *   FoBo.InitParam.Toolkit=FoBo.AngularJS1315i18n
   * }}}
   * @since v1.4
   */
  @deprecated("Use FoBoAJS.ToolKit.Init=FoBoAJS.ToolKit.AngularJS1315i18n","1.6.0")
  case object AngularJS1315i18n extends FoBoToolkit {
    ToolKit.AngularJS1315i18n
  }   
  
  
  /**
   * Enable usage of AngularJS version 1&#8228;2&#8228;19 in your bootstrap liftweb Boot.
   * @version 1.2.19
   *
   *  '''Example:'''
   *
   * {{{
   *   import net.liftmodules.{FoBoAJS => FoBo}
   *    :
   *   FoBo.InitParam.Toolkit=FoBo.AngularJS1219
   * }}}
   * @since v1.3
   */
  @deprecated("Use FoBoAJS.ToolKit.Init=FoBoAJS.ToolKit.AngularJS1219","1.6.0")
  case object AngularJS1219 extends FoBoToolkit {
    ToolKit.AngularJS1219
  } 
  
   /**
   * Enable usage of AngularJS i18n files in your bootstrap liftweb Boot.
   * @version 1.2.19 i18n
   *
   *  '''Example:'''
   *
   * {{{
   *   import net.liftmodules.{FoBoAJS => FoBo}
   *    :
   *   FoBo.InitParam.Toolkit=FoBo.AngularJS1219i18n
   * }}}
   * @since v1.3
   */
  @deprecated("Use FoBoAJS.ToolKit.Init=FoBoAJS.ToolKit.AngularJS1219i18n","1.6.0")
  case object AngularJS1219i18n extends FoBoToolkit {
    ToolKit.AngularJS1219i18n
  } 
  
   /**
   * Enable usage of Angular Material version 0&#8228;10&#8228;0 in your bootstrap liftweb Boot.
   * @version 0.10.0
   *
   *  '''Example:'''
   *
   * {{{
   *   import net.liftmodules.{FoBoAJS => FoBo}
   *    :
   *   FoBo.InitParam.Toolkit=FoBo.AJMaterial0100
   * }}}
   * @since v1.4
   */
  @deprecated("Use AJMaterial101 or later","1.5.0")
  case object AJMaterial0100 extends FoBoToolkit {
    ToolKit.AJMaterial0100
  }
  

   /**
   * Enable usage of Angular Material version 1&#8228;0&#8228;1 in your bootstrap liftweb Boot.
   * @version 1.0.1
   *
   *  '''Example:'''
   *
   * {{{
   *   import net.liftmodules.{FoBoAJS => FoBo}
   *    :
   *   FoBo.InitParam.Toolkit=FoBo.AJMaterial101
   * }}}
   * @since v1.5
   */
  @deprecated("Use FoBoAJS.ToolKit.Init=FoBoAJS.ToolKit.AJMaterial101","1.6.0")
  case object AJMaterial101 extends FoBoToolkit {
    ToolKit.AJMaterial101
  }  
  
   /**
   * Enable usage of AngularUI-Bootstrap version 0&#8228;10&#8228;0 in your bootstrap liftweb Boot.
   * @version 0.10.0
   *
   *  '''Example:'''
   *
   * {{{
   *   import net.liftmodules.{FoBoAJS => FoBo}
   *    :
   *   FoBo.InitParam.Toolkit=FoBo.AJSUIBootstrap0100
   * }}}
   * @since v1.2
   */
  @deprecated("Use FoBoAJS.ToolKit.Init=FoBoAJS.ToolKit.AJSUIBootstrap0100","1.6.0")
  case object AJSUIBootstrap0100 extends FoBoToolkit {
    ToolKit.AJSUIBootstrap0100
  }   
  
  /**
   * Enable usage of AngularUI-Bootstrap version 0&#8228;7&#8228;0 in your bootstrap liftweb Boot.
   * @version 0.7.0
   *
   *  '''Example:'''
   *
   * {{{
   *   import net.liftmodules.{FoBoAJS => FoBo}
   *    :
   *   FoBo.InitParam.Toolkit=FoBo.AJSUIBootstrap070
   * }}}
   * @since v1.2
   */
  @deprecated("Use FoBoAJS.ToolKit.Init=FoBoAJS.ToolKit.AJSUIBootstrap070","1.6.0")
  case object AJSUIBootstrap070 extends FoBoToolkit {
    ToolKit.AJSUIBootstrap070
  }   

  /**
   * Enable usage of AngularUI-Bootstrap version 0&#8228;2&#8228;0 in your bootstrap liftweb Boot.
   * @version 0.2.0
   *
   *  '''Example:'''
   *
   * {{{
   *   import net.liftmodules.{FoBoAJS => FoBo}
   *    :
   *   FoBo.InitParam.Toolkit=FoBo.AJSUIBootstrap020
   * }}}
   * @since v1.0
   */
  @deprecated("Use FoBoAJS.ToolKit.Init=FoBoAJS.ToolKit.AJSUIBootstrap020","1.6.0")
  case object AJSUIBootstrap020 extends FoBoToolkit {
    ToolKit.AJSUIBootstrap020
  }   
 
  /**
   * Enable usage of NG-Grid version 2&#8228;0&#8228;7 in your bootstrap liftweb Boot.
   * @note FoBo also supports UI-Grid the successor of NG-Grid.
   * @version 2.0.7
   *
   *  '''Example:'''
   *
   * {{{
   *   import net.liftmodules.{FoBoAJS => FoBo}
   *    :
   *   FoBo.InitParam.Toolkit=FoBo.AJSNGGrid207
   * }}}
   * @since v1.2
   */
  @deprecated("Use FoBoAJS.ToolKit.Init=FoBoAJS.ToolKit.AJSNGGrid207","1.6.0")
  case object AJSNGGrid207 extends FoBoToolkit {
    ToolKit.AJSNGGrid207
  }
  
  /**
   * Enable usage of UI-Grid version 3&#8228;0&#8228;7 in your bootstrap liftweb Boot.
   * @version 3.0.7
   *
   *  '''Example:'''
   *
   * {{{
   *   import net.liftmodules.{FoBoAJS => FoBo}
   *    :
   *   FoBo.InitParam.Toolkit=FoBo.AJSUIGrid307
   * }}}
   * @since v1.5
   */
  @deprecated("Use FoBoAJS.ToolKit.Init=FoBoAJS.ToolKit.AJSUIGrid307","1.6.0")
  case object AJSUIGrid307 extends FoBoToolkit {
    ToolKit.AJSUIGrid307
  }  
   
}




