package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

/**
 * ==FoBo Google Code Prettify Resource Module== 
 * 
 * This resource module provides Google Code Prettify resource components to the FoBo Google Code Prettify Toolkit module, 
 * but can also be used as-is, see below for setup information.
 * 
 * If you are using this module via the FoBo/FoBo module see also [[net.liftmodules.FoBo]] for setup information. 
 * 

 */
package object FoBoGCPRes {
  
  override def toString() = FoBoGCPRes.Resource.toString()
  
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
    override def toString() = "FoBoGCPRes.Resource = "+store.toString()
    
    /**
     * Enable usage of FoBo's Google Code Prettify resources version Jun2011 in your bootstrap liftweb Boot.
     * @version Jun2011
     * 
     * '''Example:'''
     * 
     * {{{
     *   import net.liftmodules.{FoBoGCPRes => FoBo}
     *    :
     *   FoBo.Resource.Init=FoBo.Resource.PrettifyJun2011
     * }}}
     */    
     case object PrettifyJun2011 extends Resource {
       FoBoResources.init
       FoBoResources.prettifyJun2011
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
  
    lazy val prettifyJun2011: Unit = {
      ResourceServer.rewrite {
        /*Google code prettify*/
        case "fobo" :: "prettify.css" :: Nil if Props.devMode => List("fobo", "google-code", "css", "prettify.css")
        case "fobo" :: "prettify.css" :: Nil => List("fobo", "google-code", "css", "prettify-min.css")
 
        case "fobo" :: "desert.css" :: Nil if Props.devMode => List("fobo", "google-code", "css", "desert.css")
        case "fobo" :: "desert.css" :: Nil => List("fobo", "google-code", "css", "desert-min.css")

        case "fobo" :: "sunburst.css" :: Nil if Props.devMode => List("fobo", "google-code", "css", "sunburst.css")
        case "fobo" :: "sunburst.css" :: Nil => List("fobo", "google-code", "css", "sunburst-min.css")
      
        /*google code prettify*/
        case "fobo" :: "prettify.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "prettify.js")
        case "fobo" :: "prettify.js" :: Nil => List("fobo", "google-code", "js", "prettify.js")
      
        case "fobo" :: "lang-scala.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-scala.js")
        case "fobo" :: "lang-scala.js" :: Nil => List("fobo", "google-code", "js", "lang-scala.js")      
      
        case "fobo" :: "lang-apollo.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-apollo.js")
        case "fobo" :: "lang-apollo.js" :: Nil => List("fobo", "google-code", "js", "lang-apollo.js")            

        case "fobo" :: "lang-clj.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-clj.js")
        case "fobo" :: "lang-clj.js" :: Nil => List("fobo", "google-code", "js", "lang-clj.js")     

        case "fobo" :: "lang-css.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-css.js")
        case "fobo" :: "lang-css.js" :: Nil => List("fobo", "google-code", "js", "lang-css.js")     

        case "fobo" :: "lang-hs.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-hs.js")
        case "fobo" :: "lang-hs.js" :: Nil => List("fobo", "google-code", "js", "lang-hs.js")     

        case "fobo" :: "lang-lisp.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-lisp.js")
        case "fobo" :: "lang-lisp.js" :: Nil => List("fobo", "google-code", "js", "lang-lisp.js")     

        case "fobo" :: "lang-lua.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-lua.js")
        case "fobo" :: "lang-lua.js" :: Nil => List("fobo", "google-code", "js", "lang-lua.js")     

        case "fobo" :: "lang-ml.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-ml.js")
        case "fobo" :: "lang-ml.js" :: Nil => List("fobo", "google-code", "js", "lang-ml.js")     

        case "fobo" :: "lang-n.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-n.js")
        case "fobo" :: "lang-n.js" :: Nil => List("fobo", "google-code", "js", "lang-n.js")     

        case "fobo" :: "lang-proto.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-proto.js")
        case "fobo" :: "lang-proto.js" :: Nil => List("fobo", "google-code", "js", "lang-proto.js")           

        case "fobo" :: "lang-sql.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-sql.js")
        case "fobo" :: "lang-sql.js" :: Nil => List("fobo", "google-code", "js", "lang-sql.js")     

        case "fobo" :: "lang-tex.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-tex.js")
        case "fobo" :: "lang-tex.js" :: Nil => List("fobo", "google-code", "js", "lang-tex.js")     

        case "fobo" :: "lang-vb.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-vb.js")
        case "fobo" :: "lang-vb.js" :: Nil => List("fobo", "google-code", "js", "lang-vb.js")     

        case "fobo" :: "lang-vhdl.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-vhdl.js")
        case "fobo" :: "lang-vhdl.js" :: Nil => List("fobo", "google-code", "js", "lang-vhdl.js")     

        case "fobo" :: "lang-wiki.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-wiki.js")
        case "fobo" :: "lang-wiki.js" :: Nil => List("fobo", "google-code", "js", "lang-wiki.js")     

        case "fobo" :: "lang-xq.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-xq.js")
        case "fobo" :: "lang-xq.js" :: Nil => List("fobo", "google-code", "js", "lang-xq.js")     

        case "fobo" :: "lang-yaml.js" :: Nil if Props.devMode => List("fobo", "google-code", "js", "lang-yaml.js")
        case "fobo" :: "lang-yaml.js" :: Nil => List("fobo", "google-code", "js", "lang-yaml.js")             
                  
      }
    }
  
  }
}




