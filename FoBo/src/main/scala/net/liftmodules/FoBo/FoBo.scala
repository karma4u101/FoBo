package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._


/**
 * ==Welcome to FoBo - A Comprehensive Front-End Toolkit Lift Module== 
 * 
 * The [[net.liftmodules.FoBo]] Package is the starting point for this API. 
 * The FoBo modules Github home is [[https://github.com/karma4u101/FoBo here]]
 *
 *===What FoBo will do for you===
 *
 * This module gives you quick and easy integration of some of the industry leading web-centric open source 
 * front-end toolkits. 
 * 
 * Among the benefits is:
 *  - Due to uniform declaration and integration points across toolkit versions only a small amount of changes 
 *    is needed for a up/down-grading of a used Toolkit, optimally, if the toolkit has no breaking changes 
 *    it will just be a version change of the FoBo.Initparam in Lift bootstrap.liftweb.Boot. 
 *  - The module provides debug-able js and css files in development and minimized files otherwise.
 *  - FoBo is simultaneously supporting several versions of each toolkit which makes development, maintenance, 
 *    upgrade and fall-back quick and easy.      
 *  - Most of the FoBo toolkit modules provides Snippet helpers and lib classes that will ease you from writing 
 *    some commonly used toolkit component integration scripts making it a simple snippet invocation.  
 *  - Great responsive scalability with responsive toolkits.   
 *  - FoBo strives to be modular. FoBo is built up by independent sub-modules (artefacts) that can be used 
 *    independant of the FoBo assembly module.  
 *   
 *
 * ===FoBo supported toolkits and plugins=== 
 * 
 * The following is a list of available toolkits and plugins 
 *  
 *  - JQuery [v1.7.2, v1.8.2, v1.9.1, v1.10.2, v1.11.1, v1.11.3, v.2.1.1, v.2.1.4] [[net.liftmodules.FoBoJQ]]
 *  - Bootstrap v3.x series [v3.0.1, v3.1.1, v3.2.0, v3.3.5, v3.3.6] [[net.liftmodules.FoBoBs]]
 *  - Bootstrap v2.x series [v2.3.2] [[net.liftmodules.FoBoTB]]
 *  - Font Awesome [v3.2.1, v4.0.3, v4.1.0, v4.3.0] [[net.liftmodules.FoBoFA]]
 *  - Kinetic JS [v5.1.0]
 *  - Google Code Prettify [vJun2011]
 *  - Angular JS [v1.0.6, v1.2.11, v1.2.19, v1.3.15, v1.4.1, v1.4.8] (angular core modules)
 *  - Angular UI Bootstrap [v0.2.0, v0.7.0, v0.10.0] (angular component)
 *  - Angular NG-Grid [v2.0.4, v2.0.7] (angular component)
 *  - Angular UI-Grid [v3.0.7] (angular component)
 *  - Angular Material design [v0.10.0, v1.0.1] (angular component)
 *  
 *  
 * ===Help out!===
 * 
 * There is a lot more that can be done within the boundaries of this API and the FoBo module as a hole so  
 * your help, suggestions, encouragement, engagement, patches (pull requests) bug-fixes/reports are highly appreciated.     
 *      
 * ===Setup===     
 * 
 *  - This module has published artifacts for Lift v2.6 and v3.0 and it's supported Scala versions.
 *    Older versions of FoBo also supports Lift v2.4/v2.5  
 *  - For a demonstration of this module see the live [[http://www.media4u101.se/fobo-lift-template-demo/ FoBo demo]] 
 *
 * @example To initiate this module for usage in your Lift project set something like the following in 
 * your projects Lift bootstrap.liftweb.Boot boot method. Here the FoBoToolkitNameXYZ 
 * represent one of FoBo's available FoBoTolkit objects listed below.
 * {{{
 *    import net.liftmodules.FoBo
 *     :
 *     :
 *    FoBo.InitParam.JQuery=FoBo.JQueryXYZ  //one jquery version
 *    FoBo.InitParam.ToolKit=FoBo.FoBoToolkitNameXYZ //one or more toolkits 
 *    FoBo.InitParam.ToolKit=FoBo.FoBoToolkitNameXYZ
 *     : 
 *    FoBo.init() 
 * }}}
 * 
 * @version v1.5
 * @author Peter Petersson (Github karma4u101) and the Lift community  
 * 
 */
package object FoBo {
  
  /**
   * When your Lift application first starts up, it executes the code in Boot.scala
   * By calling FoBo.init() in Boot.scala the FoBo API packages and toolkit resources 
   * will be available in your Lift application.
   * @example In method boot in the Boot class of package bootstrap.liftweb set
   * {{{
   *    FoBo.InitParam.JQuery=FoBo.JQueryXYZ  //one jquery version
   *    FoBo.InitParam.ToolKit=FoBo.FoBoToolkitNameXYZ //one or more toolkits 
   *    FoBo.InitParam.ToolKit=FoBo.FoBoToolkitNameXYZ 
   *     : 
   *    FoBo.init()
   * }}}
   */
  @deprecated("Init no longer nessesary as it is now automaticaly done for respective FoBo.InitParam","1.6.0")
  def init() {
    //add packages for modules with snippets 
    //LiftRules.addToPackages("net.liftmodules.FoBo")
    //the rest of the packages could probably 
    //be moved into it's respective case objects.
    //LiftRules.addToPackages("net.liftmodules.FoBoAJS")
    //LiftRules.addToPackages("net.liftmodules.FoBoBs")
    //LiftRules.addToPackages("net.liftmodules.FoBoTB")
    
//    ResourceServer.allow {
//      case "fobo" :: tail => true
//    }
  }


  //@deprecated("","1.6.0")
  abstract sealed trait FoBoJQuery
  //@deprecated("","1.6.0")
  abstract sealed trait FoBoToolkit
  
  /**
   * Initiate FoBo's ToolKit(s) in you bootstrap liftweb Boot.
   * Using the ToolKit initiation you will bring in both the 
   * toolkit's resources and if present the FoBo API associated 
   * with the toolkit.  
   * 
   *  '''Example:'''
   * {{{
   *   import net.liftmodules.FoBo
   *    :
   *   FoBo.ToolKit.Init=FoBo.ToolKit.[ToolKit Object]
   * }}}
   */
  abstract sealed trait ToolKit
  
  /**
   * Initiate the toolkit's associated resources in you bootstrap liftweb Boot.
   * You can use this if you only want to initiate the FoBo provided toolkit 
   * resources but not the FoBo API associated with the toolkit.
   * 
   *  '''Example:'''
   * {{{
   *   import net.liftmodules.FoBo
   *    :
   *   FoBo.Resource.Init=FoBo.Resource.[Resource Object]
   * }}}
   */    
  abstract sealed trait Resource
  /**
   * Initiate a toolkit's associated FoBo API in you bootstrap liftweb Boot.
   * You can use this if you want to use FoBo's API for the toolkit but
   * want to provide the toolkit resources yourself. 
   *  
   *  '''Example:'''
   * {{{
   *   import net.liftmodules.FoBo
   *    :
   *   FoBo.API.Init=FoBo.API.[API Object]
   * }}}
   */   
  abstract sealed trait API
  
  /* */
  object ToolKit extends ToolKit {
    var Init: ToolKit = null 
    
    /*===Angular ToolKit===============================================================*/
    /**
     * Enable usage of FoBo's AngularJS API and resources version 1&#8228;4&#8228;8 in your bootstrap liftweb Boot.
     * @version 1.4.8
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS148
     * }}}
     *
     */
    case object AngularJS148 extends ToolKit {
      net.liftmodules.FoBoAJS.API.Angular1
      net.liftmodules.FoBoAJS.Resource.AngularJS148
    } 
    
    /**
     * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
     * @version 1.4.8 i18n
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS148i18n
     * }}}
     *
     */
    case object AngularJS148i18n extends ToolKit {
      net.liftmodules.FoBoAJS.API.Angular1
      net.liftmodules.FoBoAJS.Resource.AngularJS148i18n
    } 
  
    /**
     * Enable usage of FoBo's AngularJS API and resources version 1&#8228;4&#8228;1 in your bootstrap liftweb Boot.
     * @version 1.4.1
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS148
     * }}}
     *
     */
    case object AngularJS141 extends ToolKit {
      net.liftmodules.FoBoAJS.API.Angular1
      net.liftmodules.FoBoAJS.Resource.AngularJS141
    }    
    
    /**
     * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
     * @version 1.4.1 i18n
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS141i18n
     * }}}
     *
     */
    case object AngularJS141i18n extends ToolKit {
      net.liftmodules.FoBoAJS.API.Angular1
      net.liftmodules.FoBoAJS.Resource.AngularJS141i18n
    }
    
    /**
     * Enable usage of FoBo's AngularJS API and resources version 1&#8228;3&#8228;15 in your bootstrap liftweb Boot.
     * @version 1.3.15
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS1315
     * }}}
     *
     */
    case object AngularJS1315 extends ToolKit {
      net.liftmodules.FoBoAJS.API.Angular1
      net.liftmodules.FoBoAJS.Resource.AngularJS1315
    } 

     /**
     * Enable usage of AngularJS i18n resource files in your bootstrap liftweb Boot.
     * @version 1.3.15 i18n
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS1315i18n
     * }}}
     *
     */
    case object AngularJS1315i18n extends ToolKit {
      net.liftmodules.FoBoAJS.API.Angular1
      net.liftmodules.FoBoAJS.Resource.AngularJS1315i18n
    }     
    
    /**
     * Enable usage of FoBo's AngularJS API and resources version 1&#8228;2&#8228;19 in your bootstrap liftweb Boot.
     * @version 1.2.19
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS1219
     * }}}
     *
     */
    case object AngularJS1219 extends ToolKit {
      net.liftmodules.FoBoAJS.API.Angular1
      net.liftmodules.FoBoAJS.Resource.AngularJS1219
    }     
    
     /**
     * Enable usage of AngularJS i18n resource files in your bootstrap liftweb Boot.
     * @version 1.2.19 i18n
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS1219i18n
     * }}}
     *
     */
    case object AngularJS1219i18n extends ToolKit {
      net.liftmodules.FoBoAJS.API.Angular1
      net.liftmodules.FoBoAJS.Resource.AngularJS1219i18n
    }
  
     /**
     * Enable usage of FoBo's Angular Material API and resources version 0&#8228;10&#8228;0 in your bootstrap liftweb Boot.
     * @version 0.10.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AJMaterial0100
     * }}}
     *
     */
    @deprecated("Use AJMaterial101 or later","1.5.0")
    case object AJMaterial0100 extends ToolKit {
      net.liftmodules.FoBoAJS.API.Angular1
      net.liftmodules.FoBoAJS.Resource.AJMaterial0100
    }

     /**
     * Enable usage of FoBo's Angular Material API and resources version 1&#8228;0&#8228;1 in your bootstrap liftweb Boot.
     * @version 1.0.1
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AJMaterial101
     * }}}
     *
     */
    case object AJMaterial101 extends ToolKit {
      net.liftmodules.FoBoAJS.API.Angular1
      net.liftmodules.FoBoAJS.Resource.AJMaterial101
    }     
    
     /**
     * Enable usage of FoBo's Angular API and AngularUI-Bootstrap resources version 0&#8228;10&#8228;0 in your bootstrap liftweb Boot.
     * @version 0.10.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AJSUIBootstrap0100
     * }}}
     *
     */
    case object AJSUIBootstrap0100 extends ToolKit {
      net.liftmodules.FoBoAJS.API.Angular1
      net.liftmodules.FoBoAJS.Resource.AJSUIBootstrap0100
    }  
 
     /**
     * Enable usage of FoBo's Angular API and AngularUI-Bootstrap resources version 0&#8228;7&#8228;0 in your bootstrap liftweb Boot.
     * @version 0.7.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    : 
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AJSUIBootstrap070
     * }}}
     *
     */
    case object AJSUIBootstrap070 extends ToolKit {
      net.liftmodules.FoBoAJS.API.Angular1
      net.liftmodules.FoBoAJS.Resource.AJSUIBootstrap070
    }

    /**
     * Enable usage of FoBo's Angular API and AngularUI-Bootstrap resources version 0&#8228;2&#8228;0 in your bootstrap liftweb Boot.
     * @version 0.2.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AJSUIBootstrap020
     * }}}
     *
     */
    case object AJSUIBootstrap020 extends ToolKit {
      net.liftmodules.FoBoAJS.API.Angular1
      net.liftmodules.FoBoAJS.Resource.AJSUIBootstrap020
    }    
    
    /**
     * Enable usage of FoBo's Angular API and NG-Grid resources version 2&#8228;0&#8228;7 in your bootstrap liftweb Boot.
     * @version 2.0.7
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AJSNGGrid207
     * }}}
     *
     */
    case object AJSNGGrid207 extends ToolKit {
      net.liftmodules.FoBoAJS.API.Angular1
      net.liftmodules.FoBoAJS.Resource.AJSNGGrid207
    }
  
    /**
     * Enable usage of FoBo's Angular API and UI-Grid resources version 3&#8228;0&#8228;7 in your bootstrap liftweb Boot.
     * @version 3.0.7
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AJSUIGrid307
     * }}}
     *
     */
    case object AJSUIGrid307 extends ToolKit {
      net.liftmodules.FoBoAJS.API.Angular1
      net.liftmodules.FoBoAJS.Resource.AJSUIGrid307
    }         
    /*===Bootstrap ToolKit===============================================================*/
    
    /*===Font Awesome ToolKit===============================================================*/
    
    /*===Google Code Prettify ToolKit===============================================================*/
    
    /*===Kinetic ToolKit===============================================================*/
    
    /*===Pace ToolKit===============================================================*/
   /**
     * Enable usage of FoBo's Pace API and resources version 0&#8228;4&#8228;15 in your bootstrap liftweb Boot.
     * @version 0.4.15
     * 
     * '''Example:'''
     * 
     * {{{
     *   FoBo.ToolKit.Init=FoBo.ToolKit.Pace0415
     * }}}
     */    
     case object Pace0415 extends ToolKit {
      net.liftmodules.FoBoPa.ToolKit.Pace0415
     }    
     
  }//end ToolKit
  
  
  object Resource extends Resource {
    var Init: Resource = null
    
    /*===Angular Resource===============================================================*/
    /**
     * Enable usage of FoBo's AngularJS version 1&#8228;4&#8228;8 resources files in your bootstrap liftweb Boot.
     * @version 1.4.8
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AngularJS148
     * }}}
     *
     */
    case object AngularJS148 extends ToolKit {
      net.liftmodules.FoBoAJS.Resource.AngularJS148
    } 
    
    /**
     * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
     * @version 1.4.8 i18n
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AngularJS148i18n
     * }}}
     *
     */
    case object AngularJS148i18n extends ToolKit {
      net.liftmodules.FoBoAJS.Resource.AngularJS148i18n
    } 
  
    /**
     * Enable usage of AngularJS version 1&#8228;4&#8228;1 resource files in your bootstrap liftweb Boot.
     * @version 1.4.1
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resources.Init=FoBo.Resouces.AngularJS148
     * }}}
     *
     */
    case object AngularJS141 extends ToolKit {
      net.liftmodules.FoBoAJS.Resource.AngularJS141
    }    
    
    /**
     * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
     * @version 1.4.1 i18n
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resources.Init=FoBo.Resources.AngularJS141i18n
     * }}}
     *
     */
    case object AngularJS141i18n extends ToolKit {
      net.liftmodules.FoBoAJS.Resource.AngularJS141i18n
    }
    
    /**
     * Enable usage of AngularJS version 1&#8228;3&#8228;15 resource files in your bootstrap liftweb Boot.
     * @version 1.3.15
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resources.Init=FoBo.Resources.AngularJS1315
     * }}}
     *
     */
    case object AngularJS1315 extends ToolKit {
      net.liftmodules.FoBoAJS.Resource.AngularJS1315
    } 

     /**
     * Enable usage of AngularJS i18n resource files in your bootstrap liftweb Boot.
     * @version 1.3.15 i18n
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resources.Init=FoBo.Resources.AngularJS1315i18n
     * }}}
     *
     */
    case object AngularJS1315i18n extends ToolKit {
      net.liftmodules.FoBoAJS.Resource.AngularJS1315i18n
    }     
    
    /**
     * Enable usage of AngularJS version 1&#8228;2&#8228;19 resource files in your bootstrap liftweb Boot.
     * @version 1.2.19
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AngularJS1219
     * }}}
     *
     */
    case object AngularJS1219 extends ToolKit {
      net.liftmodules.FoBoAJS.Resource.AngularJS1219
    }     
    
     /**
     * Enable usage of AngularJS i18n resource files in your bootstrap liftweb Boot.
     * @version 1.2.19 i18n
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AngularJS1219i18n
     * }}}
     *
     */
    case object AngularJS1219i18n extends ToolKit {
      net.liftmodules.FoBoAJS.Resource.AngularJS1219i18n
    }
  
     /**
     * Enable usage of Angular Material version 0&#8228;10&#8228;0 resource files in your bootstrap liftweb Boot.
     * @version 0.10.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AJMaterial0100
     * }}}
     *
     */
    @deprecated("Use AJMaterial101 or later","1.5.0")
    case object AJMaterial0100 extends ToolKit {
      net.liftmodules.FoBoAJS.Resource.AJMaterial0100
    }

     /**
     * Enable usage of Angular Material version 1&#8228;0&#8228;1 resource files in your bootstrap liftweb Boot.
     * @version 1.0.1
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AJMaterial101
     * }}}
     *
     */
    case object AJMaterial101 extends ToolKit {
      net.liftmodules.FoBoAJS.Resource.AJMaterial101
    }     
    
     /**
     * Enable usage of AngularUI-Bootstrap version 0&#8228;10&#8228;0 resource files in your bootstrap liftweb Boot.
     * @version 0.10.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AJSUIBootstrap0100
     * }}}
     *
     */
    case object AJSUIBootstrap0100 extends ToolKit {
      net.liftmodules.FoBoAJS.Resource.AJSUIBootstrap0100
    }  
 
     /**
     * Enable usage of AngularUI-Bootstrap version 0&#8228;7&#8228;0 resource files in your bootstrap liftweb Boot.
     * @version 0.7.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    : 
     *   FoBo.Resource.Init=FoBo.Resource.AJSUIBootstrap070
     * }}}
     *
     */
    case object AJSUIBootstrap070 extends ToolKit {
      net.liftmodules.FoBoAJS.Resource.AJSUIBootstrap070
    }

    /**
     * Enable usage of AngularUI-Bootstrap version 0&#8228;2&#8228;0 resource files in your bootstrap liftweb Boot.
     * @version 0.2.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AJSUIBootstrap020
     * }}}
     *
     */
    case object AJSUIBootstrap020 extends ToolKit {
      net.liftmodules.FoBoAJS.Resource.AJSUIBootstrap020
    }    
    
    /**
     * Enable usage of NG-Grid version 2&#8228;0&#8228;7 resource files in your bootstrap liftweb Boot.
     * @version 2.0.7
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AJSNGGrid207
     * }}}
     *
     */
    case object AJSNGGrid207 extends ToolKit {
      net.liftmodules.FoBoAJS.Resource.AJSNGGrid207
    }
  
    /**
     * Enable usage of UI-Grid version 3&#8228;0&#8228;7 resource files in your bootstrap liftweb Boot.
     * @version 3.0.7
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AJSUIGrid307
     * }}}
     *
     */
    case object AJSUIGrid307 extends ToolKit {
      net.liftmodules.FoBoAJS.Resource.AJSUIGrid307
    }      
    
    /*===Bootstrap Resource===============================================================*/
    
    /*===Font Awesome Resource===============================================================*/
    
    /*===Google Code Prettify Resource===============================================================*/
    
    /*===Kinetic Resource===============================================================*/
    
    /*===Pace Resource===============================================================*/    
    /**
     * Enable usage of FoBo's Pace resources version 0&#8228;4&#8228;15 in your bootstrap liftweb Boot.
     * @version 0.4.15
     * 
     * '''Example:'''
     * 
     * {{{
     *   FoBo.Resource.Init=FoBo.Resource.Pace0415
     * }}}
     */    
     case object Pace0415 extends Resource {
       net.liftmodules.FoBoPa.Resource.Pace0415
     }      
  }  

  object API extends API {
    var Init: API = null
    
    /*===Angular API===============================================================*/
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
      net.liftmodules.FoBoAJS.API.Angular1
    }
    
    /*===Bootstrap API===============================================================*/
    
    /*===Font Awesome API===============================================================*/
    
    /*===Google Code Prettify API===============================================================*/
    
    /*===Kinetic API===============================================================*/
    
    /*===Pace API===============================================================*/      
    
  }

/**
 * Extends your Lift SiteMap with various common bootstrap menu manipulations such 
 * as horizontal and vertical menu dividers and menu labels (labels coming soon).
 *  
 * This object should be used in conjunction with the TB* or BS3* menu builder objects in 
 * [[net.liftmodules.FoBoTB.snippet.FoBo]] or [[net.liftmodules.FoBoBs.snippet.FoBo]] snippet's.
 * 
 * 
 * '''Example:'''
 * {{{ 
 *   : 
 *  //add a horizontal menu divider 
 *  divider1 >> LocGroup(...) >> FoBo.TBLocInfo.Divider,
 *   :
 *  //add a vertical menu divider 
 *  divider2 >> LocGroup(...) >> FoBo.TBLocInfo.DividerVertical,
 *   : 
 *  //open link in new tab 
 *  ... FoBo.TBLocInfo.LinkTargetBlank
 *   : 
 * }}} 
 * @since v1.0
 */
@deprecated("Use the TBLocInfo provided by FoBoBs or FoBoTB","1.6.0")
object TBLocInfo {
  private val hd: Box[String] = Full("divider")
  private val vd: Box[String] = Full("divider-vertical")  
  private val nh: Box[String] = Full("nav-header") 
  private val ltb: Box[String] = Full("_blank")
  private val lts: Box[String] = Full("_self")
  private val ltp: Box[String] = Full("_parent")
  private val ltt: Box[String] = Full("_top")
  /**
   * Provides a way to specify a horizontal divider for your bootstrap menu in Lift's SiteMap.
   * 
   * '''Example:'''
   * {{{
   * val index            = Menu.i("Home") / "index"
   *      : 
   * val about            = Menu.i("About") / "about"
   * val divider2         = Menu("divider2") / "divider2" //dummy entry only showing a menu divider 
   * val navHeader1       = Menu.i("navHeader1") / "navHeader1" //Adds a header (label) to your FoBo.NavList
   * 
   * def sitemap = SiteMap(
   *   navHeader1 >> LocGroup("nl1") >> FoBo.TBLocInfo.NavHeader,
   *   index >> LocGroup("top","nl1",...),
   *    :
   *   ddLabel >> LocGroup("top",...)  >> PlaceHolder submenus(
   *       about ,
   *       divider2 >> FoBo.TBLocInfo.Divider,
   *       contact,
   *       feedback  
   *       )
   * )      
   * }}} 
   * @since v1.0
   */
  val Divider = new net.liftweb.sitemap.Loc.LocInfo[String]{def apply() = hd.map(x => () => x) }
  /**
   * Add a vertical divider in your bootstrap menu.
   * For a usage example see the Divider val above. 
   * @since v1.0
   */
  val DividerVertical = new net.liftweb.sitemap.Loc.LocInfo[String]{def apply() = vd.map(x => () => x) }  
  /**
   * Add nav header(s) to your bootstrap nav list. A NavHeader is a text label that can be used to label a navbar 
   * or a section of the navbar. 
   * For a usage example see the NavHeader val above.  
   * @since v1.0
   */
  val NavHeader = new net.liftweb.sitemap.Loc.LocInfo[String]{def apply() = nh.map(x => () => x) } 
  /**
   * Adds target="_blank" to the link
   * 
   * {{{
   * val AngularJS       = Menu(Loc("AngularJS", 
   *     ExtLink("http://angularjs.org/"), 
   *     S.loc("AngularJS" , scala.xml.Text("AngularJS")),
   *     LocGroup("lg2"),
   *     FoBo.TBLocInfo.LinkTargetBlank  )) 
   * }}}
   * @since v1.2
   */   
  val LinkTargetBlank = new net.liftweb.sitemap.Loc.LocInfo[String]{def apply() = ltb.map(x => () => x) } 
  /**
   * Adds target="_self" to the link
   * @since v1.2
   */ 
  val LinkTargetSelf = new net.liftweb.sitemap.Loc.LocInfo[String]{def apply() = lts.map(x => () => x) }
  /**
   * Adds target="_parent" to the link
   * @since v1.2
   */  
  val LinkTargetParent = new net.liftweb.sitemap.Loc.LocInfo[String]{def apply() = ltp.map(x => () => x) }
  /**
   * Adds target="_top" to the link
   * @since v1.2
   */
  val LinkTargetTop = new net.liftweb.sitemap.Loc.LocInfo[String]{def apply() = ltt.map(x => () => x) }

}


/**
 * Enable Toolkit(s)/JQuery options for the FoBo module in your bootstrap liftweb Boot.
 * 
 * '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.JQuery=FoBo.JQuery182
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap336
 *   FoBo.InitParam.Toolkit=FoBo.PrettifyJun2011
 * }}}
 * This example uses the Bootstrap v3.3.6 option and adds the Google code Prettify vJun2011 
 * to the enabled toolkits.  
 */
@deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.[Toolkit case object name]","1.6.0")
object InitParam extends FoBoToolkit with FoBoJQuery {
  var JQuery: FoBoJQuery = JQuery182
  var ToolKit: FoBoToolkit = _ 
}


  /**
   * Enable usage of KineticJS version 5&#8228;1&#8228;0 in your bootstrap liftweb Boot.
   * @version 5.1.0
   *
   *  '''Lift Boot:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.KineticJS510
   *   FoBo.init()
   * }}}
   * @since v1.3
   */
  case object KineticJS510 extends FoBoToolkit {
    FoBoAPI.init
    net.liftmodules.FoBoKi.KineticJS510
  }
  
  /**
   * Enable usage of Pace version 0&#8228;4&#8228;15 in your bootstrap liftweb Boot.
   * @version 0.4.15
   *
   *  '''Lift Boot:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.Pace0415
   *   FoBo.init()
   * }}}
   * @since v1.2
   */
  case object Pace0415 extends FoBoToolkit {
    net.liftmodules.FoBoPa.ToolKit.Pace0415
  }

   /**
   * Enable usage of AngularJS version 1&#8228;4&#8228;8 in your bootstrap liftweb Boot.
   *
   * @version 1.4.8
   *
   *  '''Lift Boot:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AngularJS148
   *   FoBo.init()
   * }}}
   * @since v1.5
   */  
  case object AngularJS148 extends FoBoToolkit {
    net.liftmodules.FoBoAJS.ToolKit.AngularJS148
  }  
  
   /**
   * Enable usage of i18n files for AngularJS version 1&#8228;4&#8228;8 in your bootstrap liftweb Boot.
   * @version 1.4.8
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AngularJS148i18n
   * }}}
   * @since v1.5
   */
  case object AngularJS148i18n extends FoBoToolkit {
    net.liftmodules.FoBoAJS.ToolKit.AngularJS148i18n
  } 
  
  /**
   * Enable usage of AngularJS version 1&#8228;4&#8228;1 in your bootstrap liftweb Boot.
   *
   * @version 1.4.1
   *
   *  '''Lift Boot:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AngularJS141
   *   FoBo.init()
   * }}}
   * @since v1.4
   */       
  case object AngularJS141 extends FoBoToolkit {
    net.liftmodules.FoBoAJS.ToolKit.AngularJS141
  }
  
   /**
   * Enable usage of i18n files for AngularJS version 1&#8228;4&#8228;1 in your bootstrap liftweb Boot.
   * @version 1.4.1
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AngularJS141i18n
   * }}}
   * @since v1.4
   */
  case object AngularJS141i18n extends FoBoToolkit {
    net.liftmodules.FoBoAJS.ToolKit.AngularJS141i18n
  }
  
  
   /**
   * Enable usage of AngularJS version 1&#8228;3&#8228;15 in your bootstrap liftweb Boot.
   *
   * @version 1.3.15
   *
   *  '''Lift Boot:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AngularJS1315
   *   FoBo.init()
   * }}}
   * @since v1.4
   */
  case object AngularJS1315 extends FoBoToolkit {
    net.liftmodules.FoBoAJS.ToolKit.AngularJS1315
  }
  
   /**
   * Enable usage of i18n files for AngularJS version 1&#8228;3&#8228;15 in your bootstrap liftweb Boot.
   * @version 1.3.15
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AngularJS1315i18n
   * }}}
   * @since v1.4
   */
  case object AngularJS1315i18n extends FoBoToolkit {
    net.liftmodules.FoBoAJS.ToolKit.AngularJS1315i18n
  }    
  
   /**
   * Enable usage of AngularJS version 1&#8228;2&#8228;19 in your bootstrap liftweb Boot.
   *
   * @version 1.2.19
   *
   *  '''Lift Boot:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AngularJS1219
   *   FoBo.init()
   * }}}
   * @since v1.3
   */
  case object AngularJS1219 extends FoBoToolkit {
    net.liftmodules.FoBoAJS.ToolKit.AngularJS1219
  }
  
   /**
   * Enable usage of i18n files for AngularJS version 1&#8228;2&#8228;19 in your bootstrap liftweb Boot.
   * @version 1.2.19
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AngularJS1219i18n
   * }}}
   * @since v1.3
   */
  case object AngularJS1219i18n extends FoBoToolkit {
    net.liftmodules.FoBoAJS.ToolKit.AngularJS1219i18n
  }   
  

  /**
   * Enable usage of Angular-Material version 1&#8228;0&#8228;1 in your bootstrap liftweb Boot.
   * @version 1.0.1
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AJMaterial101
   * }}}
   * @since v1.5
   */  
  case object AJMaterial101 extends FoBoToolkit {
    net.liftmodules.FoBoAJS.ToolKit.AJMaterial101
  }
  
  /**
   * Enable usage of Angular-Material version 0&#8228;10&#8228;0 in your bootstrap liftweb Boot.
   * @version 0.10.0
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AJMaterial0100
   * }}}
   * @since v1.4
   */  
  @deprecated("Use AJMaterial101 or later","1.5.0")
  case object AJMaterial0100 extends FoBoToolkit {
    net.liftmodules.FoBoAJS.ToolKit.AJMaterial0100
  } 
  
  /**
   * Enable usage of AngularUI-Bootstrap version 0&#8228;10&#8228;0 in your bootstrap liftweb Boot.
   * @version 0.10.0
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AJSUIBootstrap0100
   * }}}
   * @since v1.2
   */
  case object AJSUIBootstrap0100 extends FoBoToolkit {
    net.liftmodules.FoBoAJS.ToolKit.AJSUIBootstrap0100
  }  
  
  /**
   * Enable usage of AngularUI-Bootstrap version 0&#8228;7&#8228;0 in your bootstrap liftweb Boot.
   * @version 0.7.0
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AJSUIBootstrap070
   * }}}
   * @since v1.2
   */
  case object AJSUIBootstrap070 extends FoBoToolkit {
    net.liftmodules.FoBoAJS.ToolKit.AJSUIBootstrap070
  }   

  /**
   * Enable usage of AngularUI-Bootstrap version 0&#8228;2&#8228;0 in your bootstrap liftweb Boot.
   * @version 0.2.0
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AJSUIBootstrap020
   * }}}
   * @since v1.0
   */
  case object AJSUIBootstrap020 extends FoBoToolkit {
    net.liftmodules.FoBoAJS.ToolKit.AJSUIBootstrap020
  }   
 
  
  /**
   * Enable usage of NG-Grid version 2&#8228;0&#8228;7 in your bootstrap liftweb Boot.
   * @version 2.0.7
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AJSNGGrid207
   * }}}
   * @since v1.2
   */
  case object AJSNGGrid207 extends FoBoToolkit {
    net.liftmodules.FoBoAJS.ToolKit.AJSNGGrid207
  } 
  
  /**
   * Enable usage of UI-Grid version 3&#8228;0&#8228;7 in your bootstrap liftweb Boot.
   * @version 3.0.7
   *
   *  '''Example:'''
   *
   * {{{
   *   FoBo.InitParam.Toolkit=FoBo.AJSUIGrid307
   * }}}
   * @since v1.5
   */
  case object AJSUIGrid307 extends FoBoToolkit {
    net.liftmodules.FoBoAJS.ToolKit.AJSUIGrid307
  }   

/**
 * Enable usage of Prettify version Jun2011 in your bootstrap liftweb Boot.
 * @version Jun2011
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.PrettifyJun2011
 * }}}
 * @since v0.7
 */
  case object PrettifyJun2011 extends FoBoToolkit {
    FoBoAPI.init
    net.liftmodules.FoBoGCP.PrettifyJun2011
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
   * @since v2.7
   */
  case object JQueryMigrate121 extends FoBoJQuery {
    net.liftmodules.FoBoJQ.JQueryMigrate121
  }

  /**
   * Enable usage of JQuery version 2&#8228;1&#8228;4 in your bootstrap liftweb Boot.
   * @version 2.1.4
   * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery214
   * }}}
   * @since v1.4
   */
  case object JQuery214 extends FoBoJQuery {
    net.liftmodules.FoBoJQ.JQuery214
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
  case object JQuery211 extends FoBoJQuery {
    net.liftmodules.FoBoJQ.JQuery211
  }  

  
/**
 * Enable usage of JQuery version 1&#8228;11&#8228;3 in your bootstrap liftweb Boot.
 * @version 1.11.3
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.JQuery=FoBo.JQuery1113
 * }}}
 * @since v1.4
 */
  case object JQuery1113 extends FoBoJQuery {
    net.liftmodules.FoBoJQ.JQuery1113
  }

/**
 * Enable usage of JQuery version 1&#8228;11&#8228;1 in your bootstrap liftweb Boot.
 * @version 1.11.1
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.JQuery=FoBo.JQuery1111
 * }}}
 * @since v1.3
 */
  @deprecated("Use v1.11.3 or later","1.4") 
  case object JQuery1111 extends FoBoJQuery {
    net.liftmodules.FoBoJQ.JQuery1111
  }

 /**
 * Enable usage of JQuery version 1&#8228;11&#8228;0 in your bootstrap liftweb Boot.
 * @version 1.11.0
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.JQuery=FoBo.JQuery1110
 * }}}
 * @since v1.2
 */
  @deprecated("Use v1.11.1 or later","1.3") 
  case object JQuery1110 extends FoBoJQuery {
    net.liftmodules.FoBoJQ.JQuery1110
  }

 /**
 * Enable usage of JQuery version 1&#8228;10&#8228;2 in your bootstrap liftweb Boot.
 * @version 1.10.2
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.JQuery=FoBo.JQuery1102
 * }}}
 * @since v1.1
 */
  case object JQuery1102 extends FoBoJQuery {
    net.liftmodules.FoBoJQ.JQuery1102
  }

/**
 * Enable usage of JQuery version 1&#8228;9&#8228;1 in your bootstrap liftweb Boot.
 * @version 1.9.1
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.JQuery=FoBo.JQuery191
 * }}}
 * @since v1.0
 */
  case object JQuery191 extends FoBoJQuery {
    net.liftmodules.FoBoJQ.JQuery191 
  }

/**
 * Enable usage of JQuery version 1&#8228;8&#8228;2 in your bootstrap liftweb Boot.
 * @version 1.8.2
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.JQuery=FoBo.JQuery182
 * }}}
 * @since v0.7
 */
  case object JQuery182 extends FoBoJQuery {
    net.liftmodules.FoBoJQ.JQuery182
  }

/**
 * Enable usage of JQuery version 1&#8228;7&#8228;2 in your bootstrap liftweb Boot.
 * @version 1.7.2
 * 
 * '''Example:'''
 * 
 * {{{
 *   FoBo.InitParam.JQuery=FoBo.JQuery172
 * }}}
 * @since v0.7
 */
  case object JQuery172 extends FoBoJQuery {
    net.liftmodules.FoBoJQ.JQuery172
  }

/**
 * Enable usage of Font-Awesome version 4&#8228;3&#8228;0 in your bootstrap liftweb Boot.
 * @version 4.3.0
 * 
 *  '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.FontAwesome430
 * }}}
 * @since v1.4 
 */
  case object FontAwesome430 extends FoBoToolkit {
    FoBoAPI.init
    net.liftmodules.FoBoFA.FontAwesome430
  }


/**
 * Enable usage of Font-Awesome version 4&#8228;1&#8228;0 in your bootstrap liftweb Boot.
 * @version 4.1.0
 * 
 *  '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.FontAwesome410
 * }}}
 * @since v1.3 
 */
  case object FontAwesome410 extends FoBoToolkit {
    FoBoAPI.init
    net.liftmodules.FoBoFA.FontAwesome410
  }

/**
 * Enable usage of Font-Awesome version 4&#8228;0&#8228;3 in your bootstrap liftweb Boot.
 * @version 4.0.3
 * 
 *  '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.FontAwesome403
 * }}}
 * @since v1.2 
 */
  case object FontAwesome403 extends FoBoToolkit {
    FoBoAPI.init
    net.liftmodules.FoBoFA.FontAwesome403
  }


/**
 * Enable usage of Font-Awesome version 3&#8228;2&#8228;1 in your bootstrap liftweb Boot.
 * @version 3.2.1
 * 
 *  '''Example:'''
 *  
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.FontAwesome321
 * }}}
 * @since v1.0 
 */
  case object FontAwesome321 extends FoBoToolkit {
    FoBoAPI.init
    net.liftmodules.FoBoFA.FontAwesome321
  }


/**
 * Enable usage of Twitter Bootstrap version 2&#8228;3&#8228;2 in your bootstrap liftweb Boot.
 * @version 2.3.2
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap232
 * }}}
 * @since v1.1
 */
  case object Bootstrap232 extends FoBoToolkit {
    FoBoAPI.init
    net.liftmodules.FoBoTB.Bootstrap232
  }


/**
 * Enable usage of Twitter Bootstrap version 3&#8228;0&#8228;1 in your bootstrap liftweb Boot.
 * @version 3.0.1
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap301
 * }}}
 * @since v1.1
 */
  @deprecated("Use Bootstrap311 or later","1.5.0")
  case object Bootstrap301 extends FoBoToolkit {
    FoBoAPI.init
    net.liftmodules.FoBoBs.Bootstrap301
  }

/**
 * Enable usage of Twitter Bootstrap version 3&#8228;1&#8228;1 in your bootstrap liftweb Boot.
 * @version 3.1.1
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap311
 * }}}
 * @since v1.2
 */
  case object Bootstrap311 extends FoBoToolkit {
    FoBoAPI.init
    net.liftmodules.FoBoBs.Bootstrap311 
  }

/**
 * Enable usage of Twitter Bootstrap version 3&#8228;2&#8228;0 in your bootstrap liftweb Boot.
 * @version 3.2.0
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap320
 * }}}
 * @since v1.3
 */
  case object Bootstrap320 extends FoBoToolkit {
    FoBoAPI.init
    net.liftmodules.FoBoBs.Bootstrap320
  }

/**
 * Enable usage of Twitter Bootstrap version 3&#8228;3&#8228;5 in your bootstrap liftweb Boot.
 * @version 3.3.5
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap335
 * }}}
 * @since v1.4
 */
@deprecated("Use Bootstrap336 or later","1.5.0")
  case object Bootstrap335 extends FoBoToolkit {
    FoBoAPI.init
    net.liftmodules.FoBoBs.Bootstrap335
  }

/**
 * Enable usage of Twitter Bootstrap version 3&#8228;3&#8228;6 in your bootstrap liftweb Boot.
 * @version 3.3.6
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBo.InitParam.Toolkit=FoBo.Bootstrap335
 * }}}
 * @since v1.5
 */
  case object Bootstrap336 extends FoBoToolkit {
    FoBoAPI.init
    net.liftmodules.FoBoBs.Bootstrap336
  }

/**
 * Object for initiating FoBo API packages. 
 */
  private object FoBoAPI {
    lazy val init: Unit = {
      LiftRules.addToPackages("net.liftmodules.FoBo")  
    }
  }
  
/**
 * Object holding internally used FoBo resources. 
 */
//private object FoBoResources {
//  
//   //resource settings moved to respective sub-module
//}
//  
}

