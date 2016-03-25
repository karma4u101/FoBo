package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

object FoBoKiResSpec extends Specification {
  "FoBoKiResSpec Specification".title

  sequential 
  
  //KineticJS510
  "With FoBoKiRes.Resource.Init set to FoBoKiRes.Resource.KineticJS510 the ResourceServer" should {
    "allow  fobo/kinetic.js" in {
      allowResource(FoBoKiRes.Resource.KineticJS510,"fobo"::"kinetic.js"::Nil) must_== true 
    }     
    "rewrit fobo/kinetic.js to fobo/kinetic/5.1.0/js/kinetic.min.js" in {
      rewriteResource(FoBoKiRes.Resource.KineticJS510,"fobo"::"kinetic.js"::Nil) must_== 
        List("fobo", "kinetic", "5.1.0", "js", "kinetic.min.js")
    }        
  } 
   
  
  //=== Resource.Init ===============//
  def allowResource(resource:FoBoKiRes.Resource,path:List[String]) = {
    FoBoKiRes.Resource.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteResource(resource:FoBoKiRes.Resource,path:List[String]) = {
    FoBoKiRes.Resource.Init=resource 
    ResourceServer.pathRewriter(path)
  }   
  
}