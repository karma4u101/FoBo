package net.liftmodules.FoBoTB.snippet.FoBo

import scala.xml.{ NodeSeq, Text }
import net.liftweb.util._
import net.liftweb.common._
import net.liftweb.http._
import net.liftweb._
import Helpers._

/**
 * ==TBResources Snippet==
 * 
 * This snippet class lets you inject FoBo Bootstrap 2.x resources into your templates.
 * Instead of hand write the resource tags you can use this helper snippet to inject it for you.   
 * 
 * '''Example''' Invoke with 
 * {{{ data-lift="FoBo.TBResources.functionName?paramName=paramValue&...." }}} 
 * For more examples see the individual transform functions.
 * @since v1.3
 */
class TBResources extends StatefulSnippet {
  
  def dispatch = {
    case "injectJS" => injectJS
    case "injectCSS" => injectCSS
  }
  
  /**
   * '''Snippet Params:'''
   * 
   *  - '''Param''' ''resources'' - A comma separated list of FoBo managed Bootstrap 2.x js resources.
   *   
   * '''Example''' 
   * {{{ <script data-lift="FoBo.TBResources.injectJS?resources=bootstrap"></script> }}}
   * or making bootstrap.js implicit.
   *  {{{ <script data-lift="FoBo.TBResources.injectJS"></script> }}}
   *
   * '''Result:''' This example will result in the following being injected in place of the snippet invocation:
   * {{{
   * <script src="/classpath/fobo/bootstrap.js" type="text/javascript"></script>
   * 
   * }}}  
   *  
   * @since v1.3         
   */    
  def injectJS:net.liftweb.util.CssSel = {
    val res = S.attr("resources").map(_.split(',').map(_.trim).toList).openOr(List())
     " *" #> jsResources(res)
  }
  
  /**
   * '''Snippet Params:'''
   * 
   *  - '''Param''' ''resources'' - A comma separated list of FoBo managed Bootstrap 2.x css resources.
   *   
   * '''Example''' 
   * {{{ <link data-lift="FoBo.TBResources.injectCSS?resources=bootstrap,bootstrap-theme"></link>  }}}
   * or making bootstrap.css and bootstrap-responsive.css implicit.
   * {{{ <link data-lift="FoBo.TBResources.injectCSS"></link>  }}}
   * 
   * '''Result:''' This example will result in the following being injected in place of the snippet invocation:
   * {{{
   * <link href="/classpath/fobo/bootstrap.css" rel="stylesheet" type="text/css" />
   * <link href="/classpath/fobo/bootstrap-responsive.css" rel="stylesheet" type="text/css" />
   * }}}   
   * 
   * @since v1.3         
   */    
  def injectCSS:net.liftweb.util.CssSel = {
    val res = S.attr("resources").map(_.split(',').map(_.trim).toList).openOr(List())
     " *" #> cssResources(res)
  }
  
  private def jsResources(res: List[String]): List[scala.xml.Elem] = {
    val res2 = if(!res.contains("bootstrap")) "bootstrap" :: res else res
    val result = (for {
      r <- res2
    } yield  <script type="text/javascript" src={ "/classpath/fobo/" + r + ".js" } ></script>  )
    result    
  }
  
  private def cssResources(res: List[String]):List[scala.xml.Elem] = {
    val res2 = if(!res.contains("bootstrap")) "bootstrap" :: res else res
    val res3 = if(!res.contains("bootstrap-responsive")) "bootstrap-responsive" :: res2 else res2
    val result = (for {
      r <- res3
    } yield  <link type="text/css" rel="stylesheet" href={ "/classpath/fobo/" + r + ".css" } />  )
    result 
  }     

}