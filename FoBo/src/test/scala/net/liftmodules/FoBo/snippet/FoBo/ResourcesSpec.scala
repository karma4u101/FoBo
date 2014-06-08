package net.liftmodules.FoBo.snippet.FoBo

import xml._
import org.specs2.mutable.Specification

import net.liftweb.http._
import net.liftweb.common._
import net.liftweb.util.Helpers._


 object ResourceSpecs extends Specification {
  val session = new LiftSession("", randomString(20), Empty)

  "FoBo Resource Snippet" should {
    "with FoBo.Resources.injectJS?resources=d,c,b,a produce (in order) d.js, c.js, b.js, a.js toserve script tags" in {
      //different correkt ansvers in different versions of Scala
      val res1 = """<script src="/classpath/fobo/d.js" type="text/javascript"/><script src="/classpath/fobo/c.js" type="text/javascript"/><script src="/classpath/fobo/b.js" type="text/javascript"/><script src="/classpath/fobo/a.js" type="text/javascript"/>""";
      val res2 = """<script src="/classpath/fobo/d.js" type="text/javascript"></script><script src="/classpath/fobo/c.js" type="text/javascript"></script><script src="/classpath/fobo/b.js" type="text/javascript"></script><script src="/classpath/fobo/a.js" type="text/javascript"></script>""";

      val m = collection.immutable.HashMap("resources" -> "d,c,b,a") 
      val out = 
        S.statelessInit(Req.nil) {
          S.withAttrs(S.mapToAttrs(m)){
            val snippet = new Resources()
            snippet.injectJS(<div></div>).toString
          }
        }
      //converting to string to make sure we are really comparing 
      (out must ==/(res1)) or (out must ==/(res2))
    }
    
    "with FoBo.Resources.injectJS?resources=a,a only produce one toserve script tag, a.js" in {
      
      val res1 = """<script src="/classpath/fobo/a.js" type="text/javascript"/>""";
      val res2 = """<script src="/classpath/fobo/a.js" type="text/javascript"></script>""";
      
      val m = collection.immutable.HashMap("resources" -> "a,a") 
      val out = 
        S.statelessInit(Req.nil) {
          S.withAttrs(S.mapToAttrs(m)){
            val snippet = new Resources()
            snippet.injectJS(<div></div>).toString
          }
        }
      (out must ==/( res1 )) or (out must ==/( res2 ))
    }      
    
    "with FoBo.Resources.injectCSS?resources=b,c,a,d produce in order b.css, c.css, a.css, d.css toserve css link tags" in {
      
      val res1 = """<link href="/classpath/fobo/b.css" rel="stylesheet" type="text/css"/><link href="/classpath/fobo/c.css" rel="stylesheet" type="text/css"/><link href="/classpath/fobo/a.css" rel="stylesheet" type="text/css"/><link href="/classpath/fobo/d.css" rel="stylesheet" type="text/css"/>"""; 
      val res2 = """<link href="/classpath/fobo/b.css" rel="stylesheet" type="text/css"></link><link href="/classpath/fobo/c.css" rel="stylesheet" type="text/css"></link><link href="/classpath/fobo/a.css" rel="stylesheet" type="text/css"></link><link href="/classpath/fobo/d.css" rel="stylesheet" type="text/css"></link>"""; 
      
      val m = collection.immutable.HashMap("resources" -> "b,c,a,d") 
      val out = 
        S.statelessInit(Req.nil) {
          S.withAttrs(S.mapToAttrs(m)){
            val snippet = new Resources()
            snippet.injectCSS(<div></div>).toString
          }
        }
      (out must ==/( res1 )) or (out must ==/( res2 ))
    } 
        
    "with FoBo.Resources.injectCSS?resources=a,a only produce one toserve css link tag, a.css" in {
      
      val res1 = """<link href="/classpath/fobo/a.css" rel="stylesheet" type="text/css"/>""";
      val res2 = """<link href="/classpath/fobo/a.css" rel="stylesheet" type="text/css"></link>""";
      
      val m = collection.immutable.HashMap("resources" -> "a,a") 
      val out = 
        S.statelessInit(Req.nil) {
          S.withAttrs(S.mapToAttrs(m)){
            val snippet = new Resources()
            snippet.injectCSS(<div></div>).toString
          }
        }
      (out must ==/( res1 )) or (out must ==/( res2 ))
    }        
  }

}