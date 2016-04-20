package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._


/**
 * ==FoBo Bootstrap 3 Toolkit Module==
 * 
 * This FoBo toolkit module provides Bootstrap v3.x API and Resource components to the 
 * FoBo / FoBo Module, but can also be used as-is, see below for setup information.
 *
 * If you are using this module via the FoBo/FoBo artifact module see also [[net.liftmodules.FoBo]] for setup information.
 * 
 *
 * @example To initiate this module for usage in your Lift project set something like the following in 
 * your projects Lift bootstrap.liftweb.Boot boot method. 
 * {{{
 *    import net.liftmodules.{FoBoBs => FoBo}
 *     :
 *     :
 *    FoBo.ToolKit.Init=FoBo.ToolKit.Bootstrap336 //or any other companion toolkit object
 * }}}
 * You may substitute ToolKit for Resource or API and if you wish also adjust the artifact dependencies 
 * accordingly to include just the FoBo modules you use. 
 */
package object FoBoBs {

  override def toString() = {
    FoBoBs.ToolKit.toString()+" "+FoBoBs.Resource.toString()+" "+FoBoBs.API.toString()
  }
  
  /**
   * Initiate FoBo's Bootstrap 3 ToolKit(s) in you bootstrap liftweb Boot.
   * Using the ToolKit initiation you will bring in both the 
   * toolkit's resources and FoBo/Lift API associated 
   * with the toolkit.  
   * 
   *  '''Example:'''
   * {{{
   *   import net.liftmodules.{FoBoBs => FoBo}
   *    :
   *   FoBo.ToolKit.Init=FoBo.ToolKit.[ToolKit Companion Object]
   * }}}
   * '''Note:''' To see available companion objects click on the round trait icon in the header of this page.
   */
  abstract sealed trait ToolKit
  
  /**
   * Initiate FoBo's Bootstrap 3 Resource(s) in you bootstrap liftweb Boot.
   * 
   *  '''Example:'''
   * {{{
   *   import net.liftmodules.{FoBoBs => FoBo}
   *    :
   *   FoBo.Resource.Init=FoBo.Resource.[Resource Companion Object]
   * }}}
   * '''Note:''' To see available companion objects click on the round trait icon in the header of this page.
   */  
  abstract sealed trait Resource
  
  /**
   * Initiate FoBo's Bootstrap 3 API in you bootstrap liftweb Boot.
   * 
   *  '''Example:'''
   * {{{
   *   import net.liftmodules.{FoBoBs => FoBo}
   *    :
   *   FoBo.API.Init=FoBo.API.[API Companion Object]
   * }}}
   * '''Note:''' To see available companion objects click on the round trait icon in the header of this page.
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
    override def toString() = "FoBoBs.ToolKit = "+store.toString()
    
    /**
     * Enable usage of Bootstrap API and resources version 3&#8228;3&#8228;6 resource files in your bootstrap liftweb Boot.
     * @version 3.3.6
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoBs => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.Bootstrap336
     * }}}
     *
     */
    case object Bootstrap336 extends ToolKit {
      net.liftmodules.FoBoBsAPI.API.Bootstrap3
      net.liftmodules.FoBoBsRes.Resource.Bootstrap336
    }    
    
    /**
     * Enable usage of Bootstrap API and resources version 3&#8228;3&#8228;5 resource files in your bootstrap liftweb Boot.
     * @version 3.3.5
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoBs => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.Bootstrap335
     * }}}
     *
     */
    case object Bootstrap335 extends ToolKit {
      net.liftmodules.FoBoBsAPI.API.Bootstrap3
      net.liftmodules.FoBoBsRes.Resource.Bootstrap335
    }    
    
    /**
     * Enable usage of Bootstrap API and resources version 3&#8228;2&#8228;0 resource files in your bootstrap liftweb Boot.
     * @version 3.2.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoBs => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.Bootstrap320
     * }}}
     *
     */
    case object Bootstrap320 extends ToolKit {
      net.liftmodules.FoBoBsAPI.API.Bootstrap3
      net.liftmodules.FoBoBsRes.Resource.Bootstrap320
    } 
    
    /**
     * Enable usage of Bootstrap API and resources version 3&#8228;1&#8228;1 resource files in your bootstrap liftweb Boot.
     * @version 3.1.1
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoBs => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.Bootstrap311
     * }}}
     *
     */
    case object Bootstrap311 extends ToolKit {
      net.liftmodules.FoBoBsAPI.API.Bootstrap3
      net.liftmodules.FoBoBsRes.Resource.Bootstrap311
    } 
    
    /**
     * Enable usage of Bootstrap API and resources version 3&#8228;0&#8228;1 resource files in your bootstrap liftweb Boot.
     * @version 3.0.1
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoBs => FoBo}
     *    :
     *   FoBo.ToolKit.Init=FoBo.ToolKit.Bootstrap301
     * }}}
     *
     */
    case object Bootstrap301 extends ToolKit {
      net.liftmodules.FoBoBsAPI.API.Bootstrap3
      net.liftmodules.FoBoBsRes.Resource.Bootstrap301
    }     
      
  }
  
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
    override def toString() = "FoBoBs.Resource = "+store.toString()
    /**
     * Enable usage of Bootstrap version 3&#8228;3&#8228;6 resource files in your bootstrap liftweb Boot.
     * @version 3.3.6
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoBs => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Bootstrap336
     * }}}
     *
     */
    case object Bootstrap336 extends Resource {
      FoBoBsRes.Resource.Bootstrap336
    }    
    
    /**
     * Enable usage of Bootstrap version 3&#8228;3&#8228;5 resource files in your bootstrap liftweb Boot.
     * @version 3.3.5
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoBs => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Bootstrap335
     * }}}
     *
     */
    case object Bootstrap335 extends Resource {
      FoBoBsRes.Resource.Bootstrap335
    }    
    
    /**
     * Enable usage of Bootstrap version 3&#8228;2&#8228;0 resource files in your bootstrap liftweb Boot.
     * @version 3.2.0
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoBs => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Bootstrap320
     * }}}
     *
     */
    case object Bootstrap320 extends Resource {
      FoBoBsRes.Resource.Bootstrap320
    } 
    
    /**
     * Enable usage of Bootstrap version 3&#8228;1&#8228;1 resource files in your bootstrap liftweb Boot.
     * @version 3.1.1
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoBs => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Bootstrap311
     * }}}
     *
     */
    case object Bootstrap311 extends Resource {
      FoBoBsRes.Resource.Bootstrap311
    } 
    
    /**
     * Enable usage of Bootstrap version 3&#8228;0&#8228;1 resource files in your bootstrap liftweb Boot.
     * @version 3.0.1
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoBs => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.Bootstrap301
     * }}}
     *
     */
    case object Bootstrap301 extends Resource {
      FoBoBsRes.Resource.Bootstrap301
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
    override def toString() = "FoBoBs.API = "+store.toString()
    /**
     * Enable usage of FoBo's Bootstrap API 3&#8228;x&#8228;x in your bootstrap liftweb Boot.
     * @version 3.x.x
     *
     *  '''Example:'''
     *
     * {{{
     *   import net.liftmodules.{FoBoBs => FoBo}
     *    :
     *   FoBo.API.Init=FoBo.API.Bootstrap3
     * }}}
     *
     */    
    case object Bootstrap3 extends API {
      FoBoBsAPI.API.Bootstrap3
    }      
    
  }
  
  
/**
 * Extends your Lift SiteMap with various common bootstrap menu manipulations such 
 * as horizontal and vertical menu dividers and menu labels (labels coming soon).
 *  
 * This object should be used in conjunction with the TB* menu builder objects in [[net.liftmodules.FoBo.snippet.FoBo]] snippet's.
 * 
 * '''Example:'''
 * {{{ 
 *   : 
 *  //add a horizontal menu divider 
 *  divider1 >> LocGroup(...) >> FoBoBs.BsLocInfo.Divider,
 *   :
 *  //add a vertical menu divider 
 *  divider2 >> LocGroup(...) >> FoBoBs.BsLocInfo.DividerVertical,
 *   : 
 * }}} 
 */
object BSLocInfo {
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
   *   navHeader1 >> LocGroup("nl1") >> FoBoBs.BSLocInfo.NavHeader,
   *   index >> LocGroup("top","nl1",...),
   *    :
   *   ddLabel >> LocGroup("top",...)  >> PlaceHolder submenus(
   *       about ,
   *       divider2 >> FoBoBs.BSLocInfo.Divider,
   *       contact,
   *       feedback  
   *       )
   * )      
   * }}} 
   */
  val Divider = new net.liftweb.sitemap.Loc.LocInfo[String]{def apply() = hd.map(x => () => x) }
  /**
   * Add a vertical divider in your bootstrap menu.
   * For a usage example see the Divider val above. 
   */
  val DividerVertical = new net.liftweb.sitemap.Loc.LocInfo[String]{def apply() = vd.map(x => () => x) }  
  /**
   * Add nav header(s) to your bootstrap nav list.
   * For a usage example see the NavHeader val above. 
   */
  val NavHeader = new net.liftweb.sitemap.Loc.LocInfo[String]{def apply() = nh.map(x => () => x) } 
  
  /**
   * Adds target="_blank" to the link
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
  
  
/*============== InitParam (deprecated) ===================*/
  
  /**
   * @example In bootstrap liftweb Boot set
   * {{{
   *   FoBoBs.init()
   * }}}
   * The above example just calls init without specifying fobo init 
   * params so default Toolkit and JQuery values will be used. 
   */
  @deprecated("Init no longer nessesary as it is now automaticaly done for respective FoBoBs.InitParam","1.6.0")
  def init():Unit = {

  }


@deprecated("Use FoBoBs.ToolKit or FoBoBs.Resource and FoBoBs.API","1.6.0")
abstract sealed trait FoBoToolkit



/**
 * Enable Toolkit(s)/JQuery options for the FoBo module in your bootstrap liftweb Boot
 *
 * '''Example:'''
 *  
 * {{{
 *   FoBoBs.InitParam.JQuery=FoBoBs.JQuery192
 *   FoBoBs.InitParam.Toolkit=FoBoBs.Bootstrap301
 * }}}
 * This example uses the Bootstrap v3.0.1 option.  
 *   
 */
@deprecated("Use FoBoBs.ToolKit.Init=FoBoBs.ToolKit.[Toolkit Object]","1.6.0")
object InitParam extends FoBoToolkit {
  var ToolKit: FoBoToolkit = null 
}

/**
 * Enable usage of Bootstrap version 3&#8228;3&#8228;6 in your bootstrap liftweb Boot.
 * @version 3.3.6
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBoBs.InitParam.Toolkit=FoBoBs.Bootstrap336
 * }}}
 * @since v1.5
 */
@deprecated("Use FoBoBs.ToolKit.Init=FoBoBs.ToolKit.Bootstrap336","1.6.0")
case object Bootstrap336 extends FoBoToolkit {
  net.liftmodules.FoBoBsRes.Resource.Bootstrap336
  net.liftmodules.FoBoBsAPI.API.Bootstrap3
  //FoBoAPI.init
  //FoBoResources.init
  //FoBoResources.bootstrap336
}

/**
 * Enable usage of Bootstrap version 3&#8228;3&#8228;5 in your bootstrap liftweb Boot.
 * @version 3.3.5
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBoBs.InitParam.Toolkit=FoBoBs.Bootstrap335
 * }}}
 * @since v1.4
 */
@deprecated("Use Bootstrap336 or later","1.5.0")
case object Bootstrap335 extends FoBoToolkit {
  net.liftmodules.FoBoBsRes.Resource.Bootstrap335
  net.liftmodules.FoBoBsAPI.API.Bootstrap3  
}

/**
 * Enable usage of Bootstrap version 3&#8228;2&#8228;0 in your bootstrap liftweb Boot.
 * @version 3.2.0
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBoBs.InitParam.Toolkit=FoBoBs.Bootstrap320
 * }}}
 */
@deprecated("Use FoBoBs.ToolKit.Init=FoBoBs.ToolKit.Bootstrap320","1.6.0")
case object Bootstrap320 extends FoBoToolkit {
  net.liftmodules.FoBoBsRes.Resource.Bootstrap320
  net.liftmodules.FoBoBsAPI.API.Bootstrap3    
}

/**
 * Enable usage of Bootstrap version 3&#8228;1&#8228;1 in your bootstrap liftweb Boot.
 * @version 3.1.1
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBoBs.InitParam.Toolkit=FoBoBs.Bootstrap311
 * }}}
 */
@deprecated("Use FoBoBs.ToolKit.Init=FoBoBs.ToolKit.Bootstrap311","1.6.0")
case object Bootstrap311 extends FoBoToolkit {
  net.liftmodules.FoBoBsRes.Resource.Bootstrap311
  net.liftmodules.FoBoBsAPI.API.Bootstrap3   
}


/**
 * Enable usage of Bootstrap version 3&#8228;0&#8228;1 in your bootstrap liftweb Boot.
 * @version 3.0.1
 * 
 * '''Example'''
 * 
 * {{{
 *   FoBoBs.InitParam.Toolkit=FoBoBs.Bootstrap301
 * }}}
 */
@deprecated("Use FoBoBs.ToolKit.Init=FoBoBs.ToolKit.Bootstrap301","1.6.0")
case object Bootstrap301 extends FoBoToolkit {
  net.liftmodules.FoBoBsRes.Resource.Bootstrap301
  net.liftmodules.FoBoBsAPI.API.Bootstrap3     
}

  
}

