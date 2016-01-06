package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

object FoBoKiSpec extends Specification {
  "FoBoKiSpec Specification".title

  sequential 
  
  "With FoBoKi.InitParam.ToolKit set to FoBoKi.KineticJS510 the ResourceServer" should {
    "allow  fobo/kinetic.js" in {
      allowKineticJS510 must_== true 
    }     
    "rewrit fobo/kinetic.js to fobo/kinetic/5.1.0/js/kineti.min.js" in {
      rewriteKineticJS510 must_== List("fobo", "kinetic", "5.1.0", "js", "kinetic.min.js")
    }       
  } 
  
  def allowKineticJS510 = {
    ResourceServer
    FoBoKi.InitParam.ToolKit=FoBoKi.KineticJS510
    ResourceServer.allowedPaths("fobo"::"kinetic.js"::Nil)
  }  
  def rewriteKineticJS510 = {
    FoBoKi.InitParam.ToolKit=FoBoKi.KineticJS510
    ResourceServer.pathRewriter("fobo"::"kinetic.js"::Nil)
  }  
  
}