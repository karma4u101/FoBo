package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

object FoBoHLResSpec extends Specification {
  "FoBoHLResSpec Specification".title

  sequential
  
  //HighlightJS930
  "With FoBoHLRes.Resource.Init set to FoBoHLRes.Resource.HighlightJS930 the ResourceServer" should {
    "allow  fobo/highlight/highlight.pack.js" in {
      allowResource(FoBoHLRes.Resource.HighlightJS930,"fobo"::"highlight"::"highlight.pack.js"::Nil) must_== true 
    }     
    "rewrit rewrit fobo/highlight/highlight.pack.js to fobo/highlight/9.3.0/js/highlight.pack.js" in {
      rewriteResource(FoBoHLRes.Resource.HighlightJS930,"fobo"::"highlight"::"highlight.pack.js"::Nil) must_== 
        List("fobo", "highlight", "9.3.0", "js", "highlight.pack.js")
    }        
  }   
  
  //=== Resource.Init ===============//
  def allowResource(resource:FoBoHLRes.Resource,path:List[String]) = {
    FoBoHLRes.Resource.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteResource(resource:FoBoHLRes.Resource,path:List[String]) = {
    FoBoHLRes.Resource.Init=resource 
    ResourceServer.pathRewriter(path)
  }   
  
  
}