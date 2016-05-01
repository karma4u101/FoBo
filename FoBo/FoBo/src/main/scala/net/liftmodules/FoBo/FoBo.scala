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
 * The FoBo/FoBo module gives you quick and easy integration of some of the industry leading web-centric open source 
 * front-end toolkits. FoBo is highly modular, all FoBo toolkit modules are built up of a resource module and possibly 
 * a FoBo/Lift API module.
 * You can depend on the FoBo/FoBo module to get access to all FoBo's toolkit/resource/api modules or you can pick the
 * module(s) you need, for example, just the bootstrap API module where you provide your own resources or you may chose 
 * any combination of modules.  
 * 
 * Usage benefits:
 *  - Due to uniform declaration and integration points across toolkit versions only a small amount of changes 
 *    is needed for a up/down-grading of a used Toolkit/resource, optimally, if the toolkit has no breaking changes 
 *    it will just be a version change of the FoBo.Initparam in Lift bootstrap.liftweb.Boot. 
 *  - The module provides debug-able js and css files in development and minimized files otherwise.
 *  - FoBo is simultaneously supporting several versions of each toolkit which makes development, maintenance, 
 *    upgrade and fall-back quick and easy.      
 *  - Most of the FoBo toolkit modules provides a API sub-module with Snippet helpers and lib classes that will 
 *    ease you from writing some commonly used toolkit component integration scripts making it a simple snippet invocation.  
 *  - Great responsive scalability with responsive toolkits.   
 *  - FoBo strives to be highly modular. FoBo is built up by independent toolkit/resource/api module artifacts that 
 *    can be used independent of the FoBo/FoBo assembly module.  
 *   
 *
 * ===FoBo supported toolkits/resources=== 
 * 
 * The following is a list of available toolkits resources 
 *  
 *  - JQuery [v1.7.2, v1.8.2, v1.9.1, v1.10.2, v1.11.3, v.2.1.1, v.2.1.4] [[net.liftmodules.FoBoJQ]]
 *  - JQueryMigrate [v1.2.1] [[net.liftmodules.FoBoJQ]]
 *  - Bootstrap v3.x series [v3.0.1, v3.1.1, v3.2.0, v3.3.5, v3.3.6] [[net.liftmodules.FoBoBs]]
 *  - Bootstrap v2.x series [v2.3.2] [[net.liftmodules.FoBoTB]]
 *  - Font Awesome [v3.2.1, v4.0.3, v4.1.0, v4.3.0, v4.5.0] [[net.liftmodules.FoBoFA]]
 *  - Kinetic JS [v5.1.0] [[net.liftmodules.FoBoKi]]
 *  - Google Code Prettify [vJun2011] [[net.liftmodules.FoBoGCP]]
 *  - Highlight JS [v9.3.0] [[net.liftmodules.FoBoHL]]
 *  - Pace [v0.4.15, v1.0.2] [[net.liftmodules.FoBoPa]]
 *  - Angular JS [v1.0.6, v1.2.11, v1.2.19, v1.3.15, v1.4.1, v1.4.8, v1.5.3] (angular core modules) [[net.liftmodules.FoBoAJS]]
 *  - Angular UI Bootstrap [v0.2.0, v0.7.0, v0.10.0] (angular component) [[net.liftmodules.FoBoAJS]]
 *  - Angular NG-Grid [v2.0.4, v2.0.7] (angular component) [[net.liftmodules.FoBoAJS]]
 *  - Angular UI-Grid [v3.0.7] (angular component) [[net.liftmodules.FoBoAJS]]
 *  - Angular Material design [v0.10.0, v1.0.1, v1.0.8] (angular component) [[net.liftmodules.FoBoAJS]]
 *  
 *  
 * ===Help out!===
 * 
 * There is a lot more that can be done within the boundaries of the FoBo API modules and the FoBo modules as a hole so  
 * your help, suggestions, encouragement, engagement, patches (pull requests) bug-fixes/reports are highly appreciated.     
 *      
 * ===Setup===     
 * 
 *  - This module has published artifacts for Lift v2.6 and v3.0 and it's supported Scala versions.
 *    Older versions of FoBo also supports Lift v2.4/v2.5  
 *  - For a introduction to FoBo see [[http://www.media4u101.se/fobo-lift-template-demo/ FoBo introduction]] 
 *
 * @example To initiate this module for usage in your Lift project set something like the following in 
 * your projects Lift bootstrap.liftweb.Boot boot method. Here the FoBo ToolkitObjectNameXYZ 
 * represent one of FoBo's available FoBo ToolKit objects.
 * {{{
 *    import net.liftmodules.FoBo
 *     :
 *     :
 *    FoBo.ToolKit.Init=FoBo.ToolKit.JQueryXYZ  //the fobo jquery module, version xyz
 *    FoBo.ToolKit.Init=FoBo.ToolKit.ToolkitObjectNameXYZ //one or more fobo toolkits 
 *    FoBo.ToolKit.Init=FoBo.ToolKit.ToolkitObjectNameXYZ
 * }}}
 * 
 * You may substitute ToolKit for Resource or API and if you wish also adjust the artifact dependencies 
 * accordingly to include just the FoBo modules you use, but if size is not a issue using the FoBo/FoBo 
 * module is convenient and gives you a lot to pick from.
 * 
 * @version v1.6
 * @author Peter Petersson (Github karma4u101) and the Lift community  
 * 
 */
package object FoBo {
    
  override def toString() = {
    FoBo.ToolKit.toString()+" "+FoBo.Resource.toString()+" "+FoBo.API.toString()
  }
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
   * '''Note:''' To see available objects click on the round trait icon in the header of this page.
   */
  abstract sealed trait ToolKit
  
  /**
   * Initiate the toolkit's associated resources in you bootstrap liftweb Boot.
   * You should use this if you only want to initiate the FoBo provided toolkit 
   * resources but not the FoBo API associated with the toolkit.
   * 
   *  '''Example:'''
   * {{{
   *   import net.liftmodules.FoBo
   *    :
   *   FoBo.Resource.Init=FoBo.Resource.[Resource Object]
   * }}}
   * '''Note:''' To see available objects click on the round trait icon in the header of this page.
   */    
  abstract sealed trait Resource
  
  /**
   * Initiate a toolkit's associated FoBo API in you bootstrap liftweb Boot.
   * You should use this if you want to use FoBo's API for the toolkit but
   * want to provide the toolkit resources yourself. 
   *  
   *  '''Example:'''
   * {{{
   *   import net.liftmodules.FoBo
   *    :
   *   FoBo.API.Init=FoBo.API.[API Object]
   * }}}
   * '''Note:''' To see available objects click on the round trait icon in the header of this page.
   */   
  abstract sealed trait API
  
  /*=== ToolKit ============================================*/
  
  object ToolKit extends ToolKit {
    //we don't actually need to store the objects (for now) so lets just save 
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[ToolKit]
    private var store:Store = List()
    def Init:Store = store
    def Init_=(t:ToolKit):Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    }   
    override def toString() = "FoBo.ToolKit = "+store.toString()
    
    /*===Angular ToolKit===============================================================*/
    
    /**
     * Enable usage of FoBo's AngularJS API and resources version 1&#8228;5&#8228;3 in your bootstrap liftweb Boot.
     * @version 1.5.3
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS153
     * }}}
     * @since v1.6
     */
    case object AngularJS153 extends ToolKit {
      net.liftmodules.FoBoAJS.ToolKit.AngularJS153
    }  
    
    /**
     * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
     * @version 1.5.3 i18n
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS153i18n
     * }}}
     *
     */
    case object AngularJS153i18n extends ToolKit {
      net.liftmodules.FoBoAJS.ToolKit.AngularJS153i18n
    }     
    
    
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
      net.liftmodules.FoBoAJS.ToolKit.AngularJS148
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
      net.liftmodules.FoBoAJS.ToolKit.AngularJS148i18n
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
      net.liftmodules.FoBoAJS.ToolKit.AngularJS141
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
      net.liftmodules.FoBoAJS.ToolKit.AngularJS141i18n
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
      net.liftmodules.FoBoAJS.ToolKit.AngularJS1315
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
      net.liftmodules.FoBoAJS.ToolKit.AngularJS1315i18n
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
      net.liftmodules.FoBoAJS.ToolKit.AngularJS1219
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
      net.liftmodules.FoBoAJS.ToolKit.AngularJS1219i18n
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
    @deprecated("Use AJMaterial108 or later","1.5.0")
    case object AJMaterial0100 extends ToolKit {
      net.liftmodules.FoBoAJS.ToolKit.AJMaterial0100
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
    @deprecated("Use AJMaterial108 or later","1.6.0")
    case object AJMaterial101 extends ToolKit {
      net.liftmodules.FoBoAJS.ToolKit.AJMaterial101
    }     
    
     /**
     * Enable usage of FoBo's Angular Material API and resources version 1&#8228;0&#8228;8 in your bootstrap liftweb Boot.
     * @version 1.0.8
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AJMaterial108
     * }}}
     *
     */
    case object AJMaterial108 extends ToolKit {
      net.liftmodules.FoBoAJS.ToolKit.AJMaterial108
    }  
    
     /**
     * Enable usage of FoBo's Angular Material API and resources version 1&#8228;1&#8228;0 in your bootstrap liftweb Boot.
     * @version 1.1.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.AJMaterial110
     * }}}
     *
     */
    case object AJMaterial110 extends ToolKit {
      net.liftmodules.FoBoAJS.ToolKit.AJMaterial110
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
      net.liftmodules.FoBoAJS.ToolKit.AJSUIBootstrap0100
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
      net.liftmodules.FoBoAJS.ToolKit.AJSUIBootstrap070
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
      net.liftmodules.FoBoAJS.ToolKit.AJSUIBootstrap020
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
      net.liftmodules.FoBoAJS.ToolKit.AJSNGGrid207
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
      net.liftmodules.FoBoAJS.ToolKit.AJSUIGrid307
    }         
    
    /*===Font Awesome ToolKit===============================================================*/
    
   /**
     * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;5&#8228;0 in your bootstrap liftweb Boot.
     * @version 4.5.0
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.FontAwesome450
     * }}}
     */    
     case object FontAwesome450 extends ToolKit {
       net.liftmodules.FoBoFA.ToolKit.FontAwesome450
     } 
     
   /**
     * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;3&#8228;0 in your bootstrap liftweb Boot.
     * @version 4.3.0
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.FontAwesome430
     * }}}
     */    
     case object FontAwesome430 extends ToolKit {
       net.liftmodules.FoBoFA.ToolKit.FontAwesome430
     }  
    
    /**
     * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;1&#8228;0 in your bootstrap liftweb Boot.
     * @version 4.1.0
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.FontAwesome410
     * }}}
     */    
     case object FontAwesome410 extends ToolKit {
       net.liftmodules.FoBoFA.ToolKit.FontAwesome410
     }  
     
    /**
     * Enable usage of FoBo's FontAwesome resources and API version 4&#8228;0&#8228;3 in your bootstrap liftweb Boot.
     * @version 4.0.3
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.FontAwesome403
     * }}}
     */    
     case object FontAwesome403 extends ToolKit {
       net.liftmodules.FoBoFA.ToolKit.FontAwesome403
     }   
     
    /**
     * Enable usage of FoBo's FontAwesome resources and API version 3&#8228;2&#8228;1 in your bootstrap liftweb Boot.
     * @version 3.2.1
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.FontAwesome321
     * }}}
     */    
     case object FontAwesome321 extends ToolKit {
       net.liftmodules.FoBoFA.ToolKit.FontAwesome321
     }         
    
    /*===Google Code Prettify ToolKit===============================================================*/
    
   /**
     * Enable usage of FoBo's Google Code Prettify API and resources version Jun2011 in your bootstrap liftweb Boot.
     * @version Jun2011
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.PrettifyJun2011
     * }}}
     */    
     case object PrettifyJun2011 extends ToolKit {
       net.liftmodules.FoBoGCP.ToolKit.PrettifyJun2011
     }  
     
    /*===JQuery ToolKit===============================================================*/
   
   /**
     * Enable usage of FoBo's JQuery-Migrate API and resources version 1&#8228;2&#8228;1 in your bootstrap liftweb Boot.
     * @version 1.2.1
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.JQueryMigrate121
     * }}}
     */    
     case object JQueryMigrate121 extends ToolKit {
       net.liftmodules.FoBoJQ.ToolKit.JQueryMigrate121
     } 
    
   /**
     * Enable usage of FoBo's JQuery API and resources version 2&#8228;1&#8228;4 in your bootstrap liftweb Boot.
     * @version 2.1.4
     * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.JQuery214
     * }}}
     */    
     case object JQuery214 extends ToolKit {
       net.liftmodules.FoBoJQ.ToolKit.JQuery214
     }     
     
   /**
     * Enable usage of FoBo's JQuery API and resources version 2&#8228;1&#8228;1 in your bootstrap liftweb Boot.
     * @version 2.1.1
     * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.JQuery211
     * }}}
     */    
     case object JQuery211 extends ToolKit {
       net.liftmodules.FoBoJQ.ToolKit.JQuery211
     }  
     
   /**
     * Enable usage of FoBo's JQuery API and resources version 1&#8228;11&#8228;3 in your bootstrap liftweb Boot.
     * @version 1.11.3
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.JQuery1113
     * }}}
     */    
     case object JQuery1113 extends ToolKit {
       net.liftmodules.FoBoJQ.ToolKit.JQuery1113
     }   
     
   /**
     * Enable usage of FoBo's JQuery API and resources version 1&#8228;10&#8228;2 in your bootstrap liftweb Boot.
     * @version 1.10.2
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.JQuery1102
     * }}}
     */    
     case object JQuery1102 extends ToolKit {
       net.liftmodules.FoBoJQ.ToolKit.JQuery1102
     }   
     
   /**
     * Enable usage of FoBo's JQuery API and resources version 1&#8228;9&#8228;1 in your bootstrap liftweb Boot.
     * @version 1.9.1
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.JQuery191
     * }}}
     */    
     case object JQuery191 extends ToolKit {
       net.liftmodules.FoBoJQ.ToolKit.JQuery191
     }  
     
   /**
     * Enable usage of FoBo's JQuery API and resources version 1&#8228;8&#8228;2 in your bootstrap liftweb Boot.
     * @version 1.8.2
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.JQuery182
     * }}}
     */    
     case object JQuery182 extends ToolKit {
       net.liftmodules.FoBoJQ.ToolKit.JQuery182
     }  
     
   /**
     * Enable usage of FoBo's JQuery API and resources version 1&#8228;7&#8228;2 in your bootstrap liftweb Boot.
     * @version 1.7.2
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.JQuery172
     * }}}
     */    
     case object JQuery172 extends ToolKit {
       net.liftmodules.FoBoJQ.ToolKit.JQuery172
     }       
     
    /*===Kinetic ToolKit===============================================================*/
    
    /**
     * Enable usage FoBo's KineticJS API and resources version 5&#8228;1&#8228;0 in your bootstrap liftweb Boot.
     * @version 5.1.0
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.KineticJS510 
     * }}}
     *
     */
      case object KineticJS510 extends ToolKit {
        net.liftmodules.FoBoKi.ToolKit.KineticJS510
      }       
     
    /*===Pace ToolKit===============================================================*/
    
   /**
     * Enable usage of FoBo's Pace API and resources version 1&#8228;0&#8228;2 in your bootstrap liftweb Boot.
     * @version 1.0.2
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.Pace102
     * }}}
     */    
     case object Pace102 extends ToolKit {
       net.liftmodules.FoBoPa.ToolKit.Pace102
     } 
     
   /**
     * Enable usage of FoBo's Pace API and resources version 0&#8228;4&#8228;15 in your bootstrap liftweb Boot.
     * @version 0.4.15
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.Pace0415
     * }}}
     */    
     case object Pace0415 extends ToolKit {
       net.liftmodules.FoBoPa.ToolKit.Pace0415
     }    
     
     /*===Bootstrap3 ToolKit===============================================================*/     
     
    /**
     * Enable usage of Bootstrap API and resources version 3&#8228;3&#8228;6 in your bootstrap liftweb Boot.
     * @version 3.3.6
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.Bootstrap336
     * }}}
     *
     */
    case object Bootstrap336 extends ToolKit {
      net.liftmodules.FoBoBs.ToolKit.Bootstrap336
    }    
    
    /**
     * Enable usage of Bootstrap API and resources version 3&#8228;3&#8228;5 in your bootstrap liftweb Boot.
     * @version 3.3.5
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.Bootstrap335
     * }}}
     *
     */
    case object Bootstrap335 extends ToolKit {
      net.liftmodules.FoBoBs.ToolKit.Bootstrap335
    }    
    
    /**
     * Enable usage of Bootstrap API and resources version 3&#8228;2&#8228;0 in your bootstrap liftweb Boot.
     * @version 3.2.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.Bootstrap320
     * }}}
     *
     */
    case object Bootstrap320 extends ToolKit {
      net.liftmodules.FoBoBs.ToolKit.Bootstrap320
    } 
    
    /**
     * Enable usage of Bootstrap API and resources version 3&#8228;1&#8228;1 in your bootstrap liftweb Boot.
     * @version 3.1.1
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.Bootstrap311
     * }}}
     *
     */
    case object Bootstrap311 extends ToolKit {
      net.liftmodules.FoBoBs.ToolKit.Bootstrap311
    } 
    
    /**
     * Enable usage of Bootstrap API and resources version 3&#8228;0&#8228;1 in your bootstrap liftweb Boot.
     * @version 3.0.1
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.Bootstrap301
     * }}}
     *
     */
    case object Bootstrap301 extends ToolKit {
      net.liftmodules.FoBoBs.ToolKit.Bootstrap301
    }          
     
    /*===Bootstrap2 ToolKit===============================================================*/     
     
    /**
     * Enable usage of Bootstrap API and resources version 2&#8228;3&#8228;2 in your bootstrap liftweb Boot.
     * @version 2.3.2
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.Bootstrap232
     * }}}
     *
     */
    case object Bootstrap232 extends ToolKit {
      net.liftmodules.FoBoTB.ToolKit.Bootstrap232
    }  
    
    
    /*===Highlight ToolKit===============================================================*/ 
    
    /**
     * Enable usage of FoBo's Highlight JS API and resources version 9&#8228;3&#8228;0 in your bootstrap liftweb Boot.
     * @version v9.3.0
     *
     * '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.HighlightJS930
     * }}}
     */
    case object HighlightJS930 extends ToolKit {
      net.liftmodules.FoBoHL.ToolKit.HighlightJS930
    }    
    
  }//end ToolKit
  
  
  
  /*=== Resource ============================================*/
  
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
    override def toString() = "FoBo.Resource = "+store.toString()
       
    /*===Angular Resource===============================================================*/
    
    /**
     * Enable usage of FoBo's AngularJS version 1&#8228;5&#8228;3 resources files in your bootstrap liftweb Boot.
     * @version 1.5.3
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AngularJS153
     * }}}
     *
     */
    case object AngularJS153 extends Resource {
      net.liftmodules.FoBoAJS.Resource.AngularJS153
    } 
    
    /**
     * Enable usage of AngularJS i18n resources files in your bootstrap liftweb Boot.
     * @version 1.5.3 i18n
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AngularJS153i18n
     * }}}
     *
     */
    case object AngularJS153i18n extends Resource {
      net.liftmodules.FoBoAJS.Resource.AngularJS153i18n
    }     
    
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
    case object AngularJS148 extends Resource {
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
    case object AngularJS148i18n extends Resource {
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
    case object AngularJS141 extends Resource {
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
    case object AngularJS141i18n extends Resource {
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
    case object AngularJS1315 extends Resource {
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
    case object AngularJS1315i18n extends Resource {
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
    case object AngularJS1219 extends Resource {
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
    case object AngularJS1219i18n extends Resource {
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
    @deprecated("Use AJMaterial108 or later","1.5.0")
    case object AJMaterial0100 extends Resource {
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
     @deprecated("Use AJMaterial108 or later","1.6.0")
    case object AJMaterial101 extends Resource {
      net.liftmodules.FoBoAJS.Resource.AJMaterial101
    } 
    
     /**
     * Enable usage of Angular Material version 1&#8228;0&#8228;8 resource files in your bootstrap liftweb Boot.
     * @version 1.0.8
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AJMaterial108
     * }}}
     *
     */
    case object AJMaterial108 extends Resource {
      net.liftmodules.FoBoAJS.Resource.AJMaterial108
    }    
    
     /**
     * Enable usage of Angular Material version 1&#8228;1&#8228;0 resource files in your bootstrap liftweb Boot.
     * @version 1.1.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.AJMaterial110
     * }}}
     *
     */
    case object AJMaterial110 extends Resource {
      net.liftmodules.FoBoAJS.Resource.AJMaterial110
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
    case object AJSUIBootstrap0100 extends Resource {
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
    case object AJSUIBootstrap070 extends Resource {
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
    case object AJSUIBootstrap020 extends Resource {
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
    case object AJSNGGrid207 extends Resource {
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
    case object AJSUIGrid307 extends Resource {
      net.liftmodules.FoBoAJS.Resource.AJSUIGrid307
    }      
    
    /*===Font Awesome Resource===============================================================*/

    /**
     * Enable usage of FoBo's FontAwesome resources version 4&#8228;5&#8228;0 in your bootstrap liftweb Boot.
     * @version 4.5.0
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.FontAwesome450
     * }}}
     */    
     case object FontAwesome450 extends Resource {
       net.liftmodules.FoBoFA.Resource.FontAwesome450
     }
     
    /**
     * Enable usage of FoBo's FontAwesome resources version 4&#8228;3&#8228;0 in your bootstrap liftweb Boot.
     * @version 4.3.0
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.FontAwesome430
     * }}}
     */    
     case object FontAwesome430 extends Resource {
       net.liftmodules.FoBoFA.Resource.FontAwesome430
     } 
    
    /**
     * Enable usage of FoBo's FontAwesome resources version 4&#8228;1&#8228;0 in your bootstrap liftweb Boot.
     * @version 4.1.0
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.FontAwesome410
     * }}}
     */    
     case object FontAwesome410 extends Resource {
       net.liftmodules.FoBoFA.Resource.FontAwesome410
     }  
     
    /**
     * Enable usage of FoBo's FontAwesome resources version 4&#8228;0&#8228;3 in your bootstrap liftweb Boot.
     * @version 4.0.3
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.FontAwesome403
     * }}}
     */    
     case object FontAwesome403 extends Resource {
       net.liftmodules.FoBoFA.Resource.FontAwesome403
     }   
     
    /**
     * Enable usage of FoBo's FontAwesome resources version 3&#8228;2&#8228;1 in your bootstrap liftweb Boot.
     * @version 3.2.1
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.FontAwesome321
     * }}}
     */    
     case object FontAwesome321 extends Resource {
       net.liftmodules.FoBoFA.Resource.FontAwesome321
     }  
     
    /*===Google Code Prettify Resource===============================================================*/
     
   /**
     * Enable usage of FoBo's Google Code Prettify API and resources version Jun2011 in your bootstrap liftweb Boot.
     * @version Jun2011
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.PrettifyJun2011
     * }}}
     */    
     case object PrettifyJun2011 extends Resource {
       net.liftmodules.FoBoGCP.Resource.PrettifyJun2011
     }       
    
    /*===JQuery Resource===============================================================*/
    
   /**
     * Enable usage of FoBo's JQuery-Migrate resources version 1&#8228;2&#8228;1 in your bootstrap liftweb Boot.
     * @version 1.2.1
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQueryMigrate121
     * }}}
     */    
     case object JQueryMigrate121 extends Resource {
       net.liftmodules.FoBoJQ.Resource.JQueryMigrate121
     } 
    
   /**
     * Enable usage of FoBo's JQuery resources version 2&#8228;1&#8228;4 in your bootstrap liftweb Boot.
     * @version 2.1.4
     * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery214
     * }}}
     */    
     case object JQuery214 extends Resource {
       net.liftmodules.FoBoJQ.Resource.JQuery214
     }     
     
   /**
     * Enable usage of FoBo's JQuery resources version 2&#8228;1&#8228;1 in your bootstrap liftweb Boot.
     * @version 2.1.1
     * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery211
     * }}}
     */    
     case object JQuery211 extends Resource {
       net.liftmodules.FoBoJQ.Resource.JQuery211
     }  
     
   /**
     * Enable usage of FoBo's JQuery resources version 1&#8228;11&#8228;3 in your bootstrap liftweb Boot.
     * @version 1.11.3
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery1113
     * }}}
     */    
     case object JQuery1113 extends Resource {
       net.liftmodules.FoBoJQ.Resource.JQuery1113
     }   
     
   /**
     * Enable usage of FoBo's JQuery resources version 1&#8228;10&#8228;2 in your bootstrap liftweb Boot.
     * @version 1.10.2
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery1102
     * }}}
     */    
     case object JQuery1102 extends Resource {
       net.liftmodules.FoBoJQ.Resource.JQuery1102
     }   
     
   /**
     * Enable usage of FoBo's JQuery resources version 1&#8228;9&#8228;1 in your bootstrap liftweb Boot.
     * @version 1.9.1
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery191
     * }}}
     */    
     case object JQuery191 extends Resource {
       net.liftmodules.FoBoJQ.Resource.JQuery191
     }  
     
   /**
     * Enable usage of FoBo's JQuery resources version 1&#8228;8&#8228;2 in your bootstrap liftweb Boot.
     * @version 1.8.2
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery182
     * }}}
     */    
     case object JQuery182 extends Resource {
       net.liftmodules.FoBoJQ.Resource.JQuery182
     }  
     
   /**
     * Enable usage of FoBo's JQuery resources version 1&#8228;7&#8228;2 in your bootstrap liftweb Boot.
     * @version 1.7.2
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.JQuery172
     * }}}
     */    
     case object JQuery172 extends Resource {
       net.liftmodules.FoBoJQ.Resource.JQuery172
     }  
     
    /*===Kinetic Resource===============================================================*/
    
    /**
     * Enable usage FoBo's KineticJS resources version 5&#8228;1&#8228;0 in your bootstrap liftweb Boot.
     * @version 5.1.0
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.KineticJS510 
     * }}}
     *
     */
      case object KineticJS510 extends Resource {
        net.liftmodules.FoBoKi.Resource.KineticJS510
      }      
     
    /*===Pace Resource===============================================================*/  
    /**
     * Enable usage of FoBo's Pace resources version 1&#8228;0&#8228;2 in your bootstrap liftweb Boot.
     * @version 1.0.2
     * 
     * '''Example:'''
     * 
     * {{{
     *   FoBo.Resource.Init=FoBo.Resource.Pace102
     * }}}
     */    
     case object Pace102 extends Resource {
       net.liftmodules.FoBoPa.Resource.Pace102
     }
     
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
     
     /*===Bootstrap3 Resource===============================================================*/
     
    /**
     * Enable usage of Bootstrap version 3&#8228;3&#8228;6 resource files in your bootstrap liftweb Boot.
     * @version 3.3.6
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Bootstrap336
     * }}}
     *
     */
    case object Bootstrap336 extends Resource {
      net.liftmodules.FoBoBs.Resource.Bootstrap336
    }    
    
    /**
     * Enable usage of Bootstrap version 3&#8228;3&#8228;5 resource files in your bootstrap liftweb Boot.
     * @version 3.3.5
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Bootstrap335
     * }}}
     *
     */
    case object Bootstrap335 extends Resource {
      net.liftmodules.FoBoBs.Resource.Bootstrap335
    }    
    
    /**
     * Enable usage of Bootstrap version 3&#8228;2&#8228;0 resource files in your bootstrap liftweb Boot.
     * @version 3.2.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Bootstrap320
     * }}}
     *
     */
    case object Bootstrap320 extends Resource {
      net.liftmodules.FoBoBs.Resource.Bootstrap320
    } 
    
    /**
     * Enable usage of Bootstrap version 3&#8228;1&#8228;1 resource files in your bootstrap liftweb Boot.
     * @version 3.1.1
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Bootstrap311
     * }}}
     *
     */
    case object Bootstrap311 extends Resource {
      net.liftmodules.FoBoBs.Resource.Bootstrap311
    } 
    
    /**
     * Enable usage of Bootstrap version 3&#8228;0&#8228;1 resource files in your bootstrap liftweb Boot.
     * @version 3.0.1
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Bootstrap301
     * }}}
     *
     */
    case object Bootstrap301 extends Resource {
      net.liftmodules.FoBoBs.Resource.Bootstrap301
    }        
     
     /*===Bootstrap2 Resource===============================================================*/
     
    /**
     * Enable usage of Bootstrap version 3&#8228;0&#8228;1 resource files in your bootstrap liftweb Boot.
     * @version 2.3.2
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Bootstrap232
     * }}}
     *
     */
    case object Bootstrap232 extends Resource {
      net.liftmodules.FoBoTB.Resource.Bootstrap232
    }  
    
    /*===Highlight Resource===============================================================*/ 
    
    /**
     * Enable usage of FoBo's Highlight JS version 9&#8228;3&#8228;0 resource files in your bootstrap liftweb Boot.
     * @version v9.3.0
     *
     * '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.HighlightJS930
     * }}}
     */
    case object HighlightJS930 extends Resource {
      net.liftmodules.FoBoHL.Resource.HighlightJS930
    }        
    
  }  

  
  
  /*=== API ============================================*/
  
  object API extends API {
    //we don't actually need to store the objects (for now) so lets just save 
    //the object name, we can easily change this if we need to
    private type Store = List[String] //List[API]
    private var store:Store = List()
    def Init:Store = store
    def Init_=(t:API):Store = {
      store = if (store contains t.toString) store else t.toString :: store
      store
    } 
    override def toString() = "FoBo.API = "+store.toString()
        
    /*===Angular API===============================================================*/
    /**
     * Enable usage of FoBo's AngularJS API 1&#8228;x&#8228;x in your bootstrap liftweb Boot.
     * @version 1.4.8
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.API.Init=FoBo.API.Angular1
     * }}}
     *
     */    
    case object Angular1 extends API {
      net.liftmodules.FoBoAJS.API.Angular1
    }
    
    /*===Bootstrap API===============================================================*/
    
    /**
     * Enable usage of FoBo's Bootstrap API 3&#8228;x&#8228;x in your bootstrap liftweb Boot.
     * @version 3.x.x
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.API.Init=FoBo.API.Bootstrap3
     * }}}
     *
     */    
    case object Bootstrap3 extends API {
      net.liftmodules.FoBoBs.API.Bootstrap3
    } 
    
    /**
     * Enable usage of FoBo's Bootstrap API 2&#8228;x&#8228;x in your bootstrap liftweb Boot.
     * @version 2.x.x
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.API.Init=FoBo.API.Bootstrap2
     * }}}
     *
     */    
    case object Bootstrap2 extends API {
      net.liftmodules.FoBoTB.API.Bootstrap2
    }     
    
    /*===Font Awesome API===============================================================*/
    
    /*===Google Code Prettify API===============================================================*/
    
    /*===Kinetic API===============================================================*/
    
    /*===Pace API===============================================================*/      
    
    /*===FoBo API ==============================================================*/
    
    /**
     * Enable usage of FoBo's FoBo API 1&#8228;x&#8228;x in your bootstrap liftweb Boot.
     * @version 1.x.x
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.FoBo
     *    :
     *   FoBo.API.Init=FoBo.API.FoBo1
     * }}}
     *
     */      
    case object FoBo1 extends API {
      net.liftmodules.FoBoAPI.API.FoBo1
    }         
    
  }

  
  /*=============InitParam (deprecated)=====================*/
  
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
  }


  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.JQueryXXX","1.6.0")
  abstract sealed trait FoBoJQuery
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.[Toolkit case object name]","1.6.0")
  abstract sealed trait FoBoToolkit
  
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
@deprecated("Use BSLocInfo or TBLocInfo provided by FoBoBs or FoBoTB ","1.6.0")
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.KineticJS510","1.6.0")
  case object KineticJS510 extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.Pace0415","1.6.0")
  case object Pace0415 extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS148","1.6.0")
  case object AngularJS148 extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS148i18n","1.6.0")
  case object AngularJS148i18n extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS141","1.6.0")
  case object AngularJS141 extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS141i18n","1.6.0")
  case object AngularJS141i18n extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS1315","1.6.0")
  case object AngularJS1315 extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS1315i18n","1.6.0")
  case object AngularJS1315i18n extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS1219","1.6.0")
  case object AngularJS1219 extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.AngularJS1219i18n","1.6.0")
  case object AngularJS1219i18n extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.AJMaterial101","1.6.0")
  case object AJMaterial101 extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.AJSUIBootstrap0100","1.6.0")
  case object AJSUIBootstrap0100 extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.AJSUIBootstrap070","1.6.0")
  case object AJSUIBootstrap070 extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.AJSUIBootstrap020","1.6.0")
  case object AJSUIBootstrap020 extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.AJSNGGrid207","1.6.0")
  case object AJSNGGrid207 extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.AJSUIGrid307","1.6.0")
  case object AJSUIGrid307 extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.PrettifyJun2011","1.6.0")
  case object PrettifyJun2011 extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.JQueryMigrate121","1.6.0")
  case object JQueryMigrate121 extends FoBoJQuery {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.JQuery214","1.6.0")
  case object JQuery214 extends FoBoJQuery {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.JQuery211","1.6.0")
  case object JQuery211 extends FoBoJQuery {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.JQuery1113","1.6.0")
  case object JQuery1113 extends FoBoJQuery {
    net.liftmodules.FoBoAPI.API.FoBo1    
    net.liftmodules.FoBoJQ.JQuery1113
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.JQuery1102","1.6.0")
  case object JQuery1102 extends FoBoJQuery {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.JQuery191","1.6.0")
  case object JQuery191 extends FoBoJQuery {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.JQuery182","1.6.0")
  case object JQuery182 extends FoBoJQuery {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.JQuery172","1.6.0")
  case object JQuery172 extends FoBoJQuery {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.FontAwesome430","1.6.0")
  case object FontAwesome430 extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.FontAwesome410","1.6.0")
  case object FontAwesome410 extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.FontAwesome403","1.6.0")
  case object FontAwesome403 extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.FontAwesome321","1.6.0")
  case object FontAwesome321 extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.Bootstrap232","1.6.0")
  case object Bootstrap232 extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.Bootstrap311","1.6.0")
  case object Bootstrap311 extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.Bootstrap320","1.6.0")
  case object Bootstrap320 extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1    
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
    net.liftmodules.FoBoAPI.API.FoBo1  
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
  @deprecated("Use FoBo.ToolKit.Init=FoBo.ToolKit.Bootstrap336","1.6.0")
  case object Bootstrap336 extends FoBoToolkit {
    net.liftmodules.FoBoAPI.API.FoBo1
    net.liftmodules.FoBoBs.Bootstrap336
  }
  
}

