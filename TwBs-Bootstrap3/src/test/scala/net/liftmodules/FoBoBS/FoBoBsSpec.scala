
package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

object FoBoBsSpec extends Specification {
  "FoBoBsSpec Specification".title
  sequential
  
  "With FoBoBs.InitParam.ToolKit set to FoBoBs.Bootstrap336 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowBootstrap336 must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.6/js/bootstrap-min.js" in {
      rewriteBootstrap336JS must_== List("fobo", "bootstrap", "3.3.6", "js", "bootstrap.min.js")
    }       
  }
  
  
  "With FoBoBs.InitParam.ToolKit set to FoBoBs.Bootstrap320 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowBootstrap320 must_== true 
    } 
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.2.0/js/bootstrap-min.js" in {
      rewriteBootstrap320JS must_== List("fobo", "bootstrap", "3.2.0", "js", "bootstrap.min.js")
    }       
  }  
  
  "With FoBoBs.InitParam.ToolKit set to FoBoBs.Bootstrap311 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowBootstrap311 must_== true 
    } 
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.1.1/js/bootstrap-min.js" in {
      rewriteBootstrap311JS must_== List("fobo", "bootstrap", "3.1.1", "js", "bootstrap.min.js")
    }       
  }  
  
  "With FoBoBs.InitParam.ToolKit set to FoBoBs.Bootstrap301 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowBootstrap301 must_== true 
    } 
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.0.1/js/bootstrap-min.js" in {
      rewriteBootstrap301JS must_== List("fobo", "bootstrap", "3.0.1", "js", "bootstrap.min.js")
    }       
  }    
  
  def allowBootstrap336 = {
    ResourceServer 
    FoBoBs.InitParam.ToolKit=FoBoBs.Bootstrap336
    ResourceServer.allowedPaths("fobo"::"bootstrap.js"::Nil)
  }
  
  def rewriteBootstrap336JS = {
    ResourceServer
    FoBoBs.InitParam.ToolKit=FoBoBs.Bootstrap336
    ResourceServer.pathRewriter("fobo"::"bootstrap.js"::Nil)
  }
   
  def allowBootstrap320 = {
    ResourceServer
    FoBoBs.InitParam.ToolKit=FoBoBs.Bootstrap320
    ResourceServer.allowedPaths("fobo"::"bootstrap.js"::Nil)
  }
  
  def rewriteBootstrap320JS = {
    ResourceServer
    FoBoBs.InitParam.ToolKit=FoBoBs.Bootstrap320
    ResourceServer.pathRewriter("fobo"::"bootstrap.js"::Nil)
  } 
  
  def allowBootstrap311 = {
    ResourceServer
    FoBoBs.InitParam.ToolKit=FoBoBs.Bootstrap311
    ResourceServer.allowedPaths("fobo"::"bootstrap.js"::Nil)
  }
  
  def rewriteBootstrap311JS = {
    ResourceServer
    FoBoBs.InitParam.ToolKit=FoBoBs.Bootstrap311
    ResourceServer.pathRewriter("fobo"::"bootstrap.js"::Nil)
  } 
  
  def allowBootstrap301 = {
    ResourceServer
    FoBoBs.InitParam.ToolKit=FoBoBs.Bootstrap301
    ResourceServer.allowedPaths("fobo"::"bootstrap.js"::Nil)
  }
  
  def rewriteBootstrap301JS = {
    ResourceServer
    FoBoBs.InitParam.ToolKit=FoBoBs.Bootstrap301
    ResourceServer.pathRewriter("fobo"::"bootstrap.js"::Nil)
  }   
  
}