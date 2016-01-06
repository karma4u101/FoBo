package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

object FoBoPaSpec extends Specification {
  "FoBoPaSpec Specification".title

  sequential
  
  "With FoBoPa.InitParam.ToolKit set to FoBoPa.Pace0415 the ResourceServer" should {
    "allow  fobo/pace.js" in {
      allowPace0415 must_== true 
    }     
    "rewrit fobo/pace.js to fobo/pace/0.4.15/js/pace.min.js" in {
      rewritePace0415JS must_== List("fobo", "pace", "0.4.15", "js", "pace.min.js")
    }       
  }
  
  def allowPace0415 = {
    ResourceServer 
    FoBoPa.InitParam.ToolKit=FoBoPa.Pace0415
    ResourceServer.allowedPaths("fobo"::"pace.js"::Nil)
  }   
  def rewritePace0415JS = {
    FoBoPa.InitParam.ToolKit=FoBoPa.Pace0415
    ResourceServer.pathRewriter("fobo"::"pace.js"::Nil)
  }   
}