package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

object FoBoPaResSpec extends Specification {
  "FoBoPaResSpec Specification".title

  sequential
  
  //Pace0415
  "With FoBoPaRes.Resource.Init set to FoBoPaRes.Resource.Pace0415 the ResourceServer" should {
    "allow  fobo/pace.js" in {
      allowResource(FoBoPaRes.Resource.Pace0415,"fobo"::"pace.js"::Nil) must_== true 
    }     
    "rewrit fobo/pace.js to fobo/pace/0.4.15/js/pace.min.js" in {
      rewriteResource(FoBoPaRes.Resource.Pace0415,"fobo"::"pace.js"::Nil) must_== 
        List("fobo", "pace", "0.4.15", "js", "pace.min.js")
    }        
  }   
  
  //=== Resource.Init ===============//
  def allowResource(resource:FoBoPaRes.Resource,path:List[String]) = {
    FoBoPaRes.Resource.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteResource(resource:FoBoPaRes.Resource,path:List[String]) = {
    FoBoPaRes.Resource.Init=resource 
    ResourceServer.pathRewriter(path)
  }   
  
}