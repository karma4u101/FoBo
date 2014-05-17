package net.liftmodules.FoBoBs.snippet.FoBo

import scala.xml.{ NodeSeq, Text }
import net.liftweb.util._
import net.liftweb.common._
import net.liftweb.http._
import net.liftweb._
import Helpers._

/**
 * ==BS3Resources Snippet==
 * 
 * This snippet class lets you inject FoBo Bootstrap3 resources into your templates.
 * 
 * '''Example''' Invoke with 
 * {{{ data-lift="FoBo.BS3Resources.functionName?paramName=paramValue&...." }}} 
 * For more examples see the individual transform functions.
 * @since v1.3
 */
class BS3Resources extends StatefulSnippet  {

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
   * {{{ <script data-lift="FoBo.BS3Resources.injectJS?resources=bootstrap"></script> }}}
   * or making bootstrap.js implicit.
   *  {{{ <script data-lift="FoBo.BS3Resources.injectJS"></script> }}}
   *
   * '''Result:''' This example will result in the following being injected in place of the snippet invocation:
   * {{{
   * <script src="/classpath/fobo/bootstrap.js" type="text/javascript"></script>
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
   *  - '''Param''' ''resources'' - A comma separated list of FoBo managed Bootstrap3 css resources.
   *   
   * '''Example''' 
   * {{{ <link data-lift="FoBo.BS3Resources.injectCSS?resources=bootstrap,bootstrap-theme"></link>  }}}
   * or making bootstrap.css implicit.
   * {{{ <link data-lift="FoBo.BS3Resources.injectCSS?resources=bootstrap-theme"></link>  }}}
   * 
   * '''Result:''' This example will result in the following being injected in place of the snippet invocation:
   * {{{
   * <link href="/classpath/fobo/bootstrap.css" rel="stylesheet" type="text/css" />
   * <link href="/classpath/fobo/bootstrap-theme.css" rel="stylesheet" type="text/css" />
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
    val result = (for {
      r <- res2
    } yield  <link type="text/css" rel="stylesheet" href={ "/classpath/fobo/" + r + ".css" } />  )
    result 
  }   
  
}