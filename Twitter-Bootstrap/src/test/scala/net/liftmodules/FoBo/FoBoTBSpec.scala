package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

object FoBoTBSpec extends Specification  {
  "FoBoTBSpec Specification".title

  //These tests in not meant to catch all errors but to making sure that the 
  //FoBo InitParam's has got initiated as expected, for instance to ensure that 
  //fobo sub modules is accessible. 
  
  //OBS! using 'test-only' instead of 'test' will fail some test as 'test-only' 
  //is treated as code is run in "devMode" while 'test' dose not assume this. 
  
  "With FoBo.InitParam.ToolKit set to FoBo.Bootstrap232 the ResourceServer.pathRewriter" should {
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.3.2/js/bootstrap-min.js" in {
      rewriteBootstrap232JS must_== List("fobo", "bootstrap", "2.3.2", "js", "bootstrap-min.js")
    }
     "rewrit fobo/bootstrap.css to fobo/bootstrap/2.3.2/css/bootstrap-min.css" in {
      rewriteBootstrap232CSS must_== List("fobo", "bootstrap", "2.3.2", "css", "bootstrap-min.css")
    } 
     "rewrit fobo/bootstrap-responsive.css to fobo/bootstrap/2.3.2/css/responsive-min.css" in {
      rewriteBootstrap232RESPCSS must_== List("fobo", "bootstrap", "2.3.2", "css", "responsive-min.css")
    }      
  }   
  
//  "With FoBo.InitParam.ToolKit set to FoBo.Bootstrap231 the ResourceServer.pathRewriter" should {
//    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.3.1/js/bootstrap-all-min.js" in {
//      rewriteBootstrap231JS must_== List("fobo", "bootstrap", "2.3.1", "js", "bootstrap-all-min.js")
//    }
//     "rewrit fobo/bootstrap.css to fobo/bootstrap/2.3.1/css/bootstrap-min.css" in {
//      rewriteBootstrap231CSS must_== List("fobo", "bootstrap", "2.3.1", "css", "bootstrap-min.css")
//    } 
//     "rewrit fobo/bootstrap-responsive.css to fobo/bootstrap/2.3.1/css/responsive-min.css" in {
//      rewriteBootstrap231RESPCSS must_== List("fobo", "bootstrap", "2.3.1", "css", "responsive-min.css")
//    }      
//  } 
//  
// "With FoBo.InitParam.ToolKit set to FoBo.Bootstrap230 the ResourceServer.pathRewriter" should {
//    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.3.0/js/bootstrap-all-min.js" in {
//      rewriteBootstrap230JS must_== List("fobo", "bootstrap", "2.3.0", "js", "bootstrap-all-min.js")
//    }
//     "rewrit fobo/bootstrap.css to fobo/bootstrap/2.3.0/css/bootstrap-min.css" in {
//      rewriteBootstrap230CSS must_== List("fobo", "bootstrap", "2.3.0", "css", "bootstrap-min.css")
//    } 
//     "rewrit fobo/bootstrap-responsive.css to fobo/bootstrap/2.3.0/css/responsive-min.css" in {
//      rewriteBootstrap230RESPCSS must_== List("fobo", "bootstrap", "2.3.0", "css", "responsive-min.css")
//    }      
//  }   
   
   def rewriteBootstrap232JS = {
    FoBoTB.InitParam.ToolKit=FoBoTB.Bootstrap232
    ResourceServer.pathRewriter("fobo"::"bootstrap.js"::Nil)
  } 
   
   def rewriteBootstrap232CSS = {
    FoBoTB.InitParam.ToolKit=FoBoTB.Bootstrap232
    ResourceServer.pathRewriter("fobo"::"bootstrap.css"::Nil)
  } 
   
   def rewriteBootstrap232RESPCSS = {
    FoBoTB.InitParam.ToolKit=FoBoTB.Bootstrap232
    ResourceServer.pathRewriter("fobo"::"bootstrap-responsive.css"::Nil)
  } 
   
   def rewriteBootstrap231JS = {
    FoBoTB.InitParam.ToolKit=FoBoTB.Bootstrap231
    ResourceServer.pathRewriter("fobo"::"bootstrap.js"::Nil)
  } 
   
   def rewriteBootstrap231CSS = {
    FoBoTB.InitParam.ToolKit=FoBoTB.Bootstrap231
    ResourceServer.pathRewriter("fobo"::"bootstrap.css"::Nil)
  } 
   
   def rewriteBootstrap231RESPCSS = {
    FoBoTB.InitParam.ToolKit=FoBoTB.Bootstrap231
    ResourceServer.pathRewriter("fobo"::"bootstrap-responsive.css"::Nil)
  }   
   
   def rewriteBootstrap230JS = {
    FoBoTB.InitParam.ToolKit=FoBoTB.Bootstrap230
    ResourceServer.pathRewriter("fobo"::"bootstrap.js"::Nil)
  } 
   
   def rewriteBootstrap230CSS = {
    FoBoTB.InitParam.ToolKit=FoBoTB.Bootstrap230
    ResourceServer.pathRewriter("fobo"::"bootstrap.css"::Nil)
  } 
   
   def rewriteBootstrap230RESPCSS = {
    FoBoTB.InitParam.ToolKit=FoBoTB.Bootstrap230
    ResourceServer.pathRewriter("fobo"::"bootstrap-responsive.css"::Nil)
  }      
  
   
}


