package net.liftmodules.FoBo.snippet.FoBo

import scala.xml.{ NodeSeq, Text }
import net.liftweb.util._
import net.liftweb.common._
import net.liftweb.http._
import net.liftweb._
import Helpers._

/**
 * ==Resources Snippet==
 * 
 * This snippet class lets you inject FoBo resources into your templates.
 * 
 * '''Example''' Invoke with 
 * {{{ data-lift="FoBo.Resources.functionName?paramName=paramValue&...." }}} 
 * For more examples see the individual transform functions.
 * @since v1.3
 */
class Resources extends StatefulSnippet {
  
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
   * {{{ <script data-lift="FoBo.Resources.injectJS?resources=prettify,lang-scala,jquery,bootstrap,angular,angular-animate,ui-bootstrap-tpls,ng-grid"></script> }}}
   * 
   * '''Result:''' This example will result in the following being injected in place of the snippet invocation:
   * {{{
   * <script src="/classpath/fobo/prettify.js" type="text/javascript"></script>
   * <script src="/classpath/fobo/lang-scala.js" type="text/javascript"></script>     
   * <script src="/classpath/fobo/jquery.js" id="jquery" type="text/javascript"></script>
   * <script src="/classpath/fobo/bootstrap.js" type="text/javascript"></script>
   * <script src="/classpath/fobo/angular.js" type="text/javascript"></script>
   * <script src="/classpath/fobo/angular-animate.js" type="text/javascript"></script>
   * <script src="/classpath/fobo/ui-bootstrap-tpls.js" type="text/javascript"></script>
   * <script src="/classpath/fobo/ng-grid.js" type="text/javascript"></script>
   * }}}  
   *  
   * @since v1.3         
   */
  def injectJS:net.liftweb.util.CssSel = {
    def transform(res: List[String]): List[scala.xml.Elem] = {
      val result = (for {
        r <- res
      } yield  <script type="text/javascript" src={ "/classpath/fobo/" + r + ".js" } ></script>  )
      result    
    }    
    val res = S.attr("resources").map(_.split(',').map(_.trim).toSet).openOr(Set())
     " *" #> transform(res.toList)
  }
  

  /**
   * '''Snippet Params:'''
   * 
   *  - '''Param''' ''resources'' - A comma separated list of FoBo managed css resources.
   *   
   * '''Example''' 
   * {{{ <link data-lift="FoBo.Resources.injectCSS?resources=bootstrap,bootstrap-theme,font-awesome,ng-grid,prettify"></link>  }}}
   * 
   * '''Result:''' This example will result in the following being injected in place of the snippet invocation:
   * {{{
   * <link href="/classpath/fobo/bootstrap.css" rel="stylesheet" type="text/css" />
   * <link href="/classpath/fobo/bootstrap-theme.css" rel="stylesheet" type="text/css" />
   * <link href="/classpath/fobo/font-awesome.css" rel="stylesheet" type="text/css"/>
   * <link href='/classpath/fobo/ng-grid.css' rel="stylesheet" type='text/css' />
   * <link href="/classpath/fobo/prettify.css" rel="stylesheet" type="text/css" /> 
   * }}}   
   * 
   * @since v1.3         
   */  
  def injectCSS:net.liftweb.util.CssSel = {
    def transform(res: List[String]):List[scala.xml.Elem] = {
      val result = (for {
        r <- res
      } yield  <link type="text/css" rel="stylesheet" href={ "/classpath/fobo/" + r + ".css" } />  )
      result 
    }     
    val res = S.attr("resources").map(_.split(',').map(_.trim).toSet).openOr(Set())
     " *" #> transform(res.toList)
  }
  
//  private def jsResources(res: List[String]): List[scala.xml.Elem] = {
//    val result = (for {
//      r <- res
//    } yield  <script type="text/javascript" src={ "/classpath/fobo/" + r + ".js" } ></script>  )
//    result    
//  }
//  
//  private def cssResources(res: List[String]):List[scala.xml.Elem] = {
//    val result = (for {
//      r <- res
//    } yield  <link type="text/css" rel="stylesheet" href={ "/classpath/fobo/" + r + ".css" } />  )
//    result 
//  }   
}