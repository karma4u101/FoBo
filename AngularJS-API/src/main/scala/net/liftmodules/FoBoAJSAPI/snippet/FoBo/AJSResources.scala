package net.liftmodules.FoBoAJSAPI.snippet.FoBo

import scala.xml.{ NodeSeq, Text }
import net.liftweb.util._
import net.liftweb.common._
import net.liftweb.http._
import net.liftweb._
import Helpers._

/**
 * ==AJSResources Snippet==
 * 
 * This snippet class lets you inject FoBo Angular resources into your templates.
 * Instead of hand write the resource tags you can use this helper snippet to inject it for you.  
 * 
 * '''Example''' Invoke with 
 * {{{ data-lift="FoBo.AJSResources.functionName?paramName=paramValue&...." }}} 
 * For more examples see the individual transform functions.
 * @since v1.3
 */
class AJSResources extends StatefulSnippet {
  
  
  def dispatch = {
    case "injectJS" => injectJS
    case "injectCSS" => injectCSS
  } 
  
 
   /**
   * '''Snippet Params:'''
   * 
   *  - '''Param''' ''resources'' - A comma separated list of FoBo managed js resources.
   *   
   * '''Example''' 
   * {{{ <script data-lift="FoBo.AJSResources.injectJS?resources=angular,angular-animate"></script> }}}
   * or making angular.js implicit.
   *  {{{ <script data-lift="FoBo.AJSResources.injectJS?resources=angular-animate"></script> }}}
   *
   * '''Result:''' This example will result in the following being injected in place of the snippet invocation:
   * {{{
   * <script src="/classpath/fobo/angular.js" type="text/javascript"></script>
   * <script src="/classpath/fobo/angular-animate.js" type="text/javascript"></script> 
   * }}}  
   *  
   * @since v1.3         
   */   
  def injectJS:net.liftweb.util.CssSel = {
    def transform(res: List[String]): List[scala.xml.Elem] = {
      val res2 = if(!res.contains("angular")) "angular" :: res else res
      val result:List[scala.xml.Elem] = (for {
        r <- res2
      } yield  <script type="text/javascript" src={ "/classpath/fobo/" + r + ".js" } ></script>  )
      result    
    }
    val res:List[String] = S.attr("resources").map(x => x.split(',').map(x => x.trim).toList.distinct).openOr(List())
    " *" #> transform(res.toList)
  }
  
  /**
   * '''Snippet Params:'''
   * 
   *  - '''Param''' ''resources'' - A comma separated list of FoBo managed Bootstrap3 css resources.
   *   
   * '''Example''' 
   * {{{ <link data-lift="FoBo.AJSResources.injectCSS?resources=ng-grid"></link>  }}}
   * 
   * '''Result:''' This example will result in the following being injected in place of the snippet invocation:
   * {{{
   * <link href="/classpath/fobo/ng-grid.css" rel="stylesheet" type="text/css" />
   * }}}   
   * 
   * @since v1.3         
   */    
  def injectCSS:net.liftweb.util.CssSel = {
    def transform(res: List[String]):List[scala.xml.Elem] = {
      val result:List[scala.xml.Elem] = (for {
        r <- res
      } yield  <link type="text/css" rel="stylesheet" href={ "/classpath/fobo/" + r + ".css" } />  )
      result 
    }      
    val res:List[String] = S.attr("resources").map(x => x.split(',').map(x => x.trim).toList.distinct).openOr(List())
     " *" #> transform(res.toList)
  }  
 
}