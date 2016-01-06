package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

object FoBoGCPSpec extends Specification {
  "FoBoGCPSpec Specification".title

  sequential
  
  "With FoBoGCP.InitParam.ToolKit set to FoBoGCP.PrettifyJun2011 the ResourceServer" should {
    "allow  fobo/prettify.js" in {
      allowPrettifyJun2011 must_== true 
    }     
    "rewrit fobo/prettify.js to fobo/google-code/js/prettify.js" in {
      rewritePrettifyJun2011JS must_== List("fobo", "google-code", "js", "prettify.js")
    }       
  }
  
  def allowPrettifyJun2011 = {
    ResourceServer 
    FoBoGCP.InitParam.ToolKit=FoBoGCP.PrettifyJun2011
    ResourceServer.allowedPaths("fobo"::"prettify.js"::Nil)
  }   
  def rewritePrettifyJun2011JS = {
    FoBoGCP.InitParam.ToolKit=FoBoGCP.PrettifyJun2011
    ResourceServer.pathRewriter("fobo"::"prettify.js"::Nil)
  }  
  
}