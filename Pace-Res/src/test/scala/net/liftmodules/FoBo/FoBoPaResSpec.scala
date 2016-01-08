package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

object FoBoPaResSpec extends Specification {
  "FoBoPaResSpec Specification".title

  sequential
  
  
  "With FoBoPaRes.Resource.Init set to FoBoPaRes.Resource.Pace0415 the ResourceServer" should {
    "allow  fobo/pace.js" in {
      allowResourcePace0415 must_== true 
    }     
    "rewrit fobo/pace.js to fobo/pace/0.4.15/js/pace.min.js" in {
      rewriteResourcePace0415JS must_== List("fobo", "pace", "0.4.15", "js", "pace.min.js")
    }       
  }   
  
  def allowResourcePace0415 = {
    ResourceServer 
    FoBoPaRes.Resource.Init = FoBoPaRes.Resource.Pace0415
    ResourceServer.allowedPaths("fobo"::"pace.js"::Nil)
  }   
  def rewriteResourcePace0415JS = {
    FoBoPaRes.Resource.Init = FoBoPaRes.Resource.Pace0415
    ResourceServer.pathRewriter("fobo"::"pace.js"::Nil)
  }   
}