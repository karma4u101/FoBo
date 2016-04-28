package net.liftmodules.FoBoHL.snippet.FoBo

import xml._
import org.specs2.mutable.Specification

import net.liftweb.http._
import net.liftweb.common._
import net.liftweb.util.Helpers._


 object HLResourcesSpec extends Specification {
  val session = new LiftSession("", randomString(20), Empty)

  "Hightlight Resource Snippet" should {
    "with FoBo.HLResources.injectJS?resources=highlight.pack produce highlight.pack.js toserve script tags" in {
      //different correkt ansvers in different versions of Scala
      val res1 = """<script src="/classpath/fobo/highlight/highlight.pack.js" type="text/javascript"/>""";
      val res2 = """<script src="/classpath/fobo/highlight/highlight.pack.js" type="text/javascript"></script>""";

      val m = collection.immutable.HashMap("resources" -> "highlight.pack") 
      val out = 
        S.statelessInit(Req.nil) {
          S.withAttrs(S.mapToAttrs(m)){
            val snippet = new HLResources()
            snippet.injectJS(<div></div>).toString
          }
        }
      //converting to string to make sure we are really comparing 
      (out must ==/(res1)) or (out must ==/(res2))
    }
    
    "with FoBo.HLResources.injectJS?resources=highlight.pack,highlight.pack only produce one toserve script tag, highlight.pack.js" in {
      
      val res1 = """<script src="/classpath/fobo/highlight/highlight.pack.js" type="text/javascript"/>""";
      val res2 = """<script src="/classpath/fobo/highlight/highlight.pack.js" type="text/javascript"></script>""";
      
      val m = collection.immutable.HashMap("resources" -> "highlight.pack,highlight.pack") 
      val out = 
        S.statelessInit(Req.nil) {
          S.withAttrs(S.mapToAttrs(m)){
            val snippet = new HLResources()
            snippet.injectJS(<div></div>).toString
          }
        }
      (out must ==/( res1 )) or (out must ==/( res2 ))
    } 
    
     
    
    "with FoBo.HLResources.injectCSS?resources=a,b,c,d produce in order ,a.css, b.css, c.css, d.css toserve css link tags" in {
      
      val res1 = """<link href="/classpath/fobo/highlight/a.css" rel="stylesheet" type="text/css"/><link href="/classpath/fobo/highlight/b.css" rel="stylesheet" type="text/css"/><link href="/classpath/fobo/highlight/c.css" rel="stylesheet" type="text/css"/><link href="/classpath/fobo/highlight/d.css" rel="stylesheet" type="text/css"/>"""; 
      val res2 = """<link href="/classpath/fobo/highlight/a.css" rel="stylesheet" type="text/css"></link><link href="/classpath/fobo/highlight/b.css" rel="stylesheet" type="text/css"></link><link href="/classpath/fobo/highlight/c.css" rel="stylesheet" type="text/css"></link><link href="/classpath/fobo/highlight/d.css" rel="stylesheet" type="text/css"></link>"""; 
      
      val m = collection.immutable.HashMap("resources" -> "a,b,c,d") 
      val out = 
        S.statelessInit(Req.nil) {
          S.withAttrs(S.mapToAttrs(m)){
            val snippet = new HLResources()
            snippet.injectCSS(<div></div>).toString
          }
        }
      (out must ==/( res1 )) or (out must ==/( res2 ))
    } 
        
    "with FoBo.HLResources.injectCSS?resources=a,a only produce one toserve css link tag, a.css" in {
      
      val res1 = """<link href="/classpath/fobo/highlight/a.css" rel="stylesheet" type="text/css"/>""";
      val res2 = """<link href="/classpath/fobo/highlight/a.css" rel="stylesheet" type="text/css"></link>""";
      
      val m = collection.immutable.HashMap("resources" -> "a,a") 
      val out = 
        S.statelessInit(Req.nil) {
          S.withAttrs(S.mapToAttrs(m)){
            val snippet = new HLResources()
            snippet.injectCSS(<div></div>).toString
          }
        }
      (out must ==/( res1 )) or (out must ==/( res2 ))
    }        
  }

}
