package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

//@RunWith(classOf[JUnitRunner])
object FoBoAJSSpec extends Specification  {
  "FoBoAJSSpec Specification".title
  
  //OBS! using 'test-only' instead of 'test' will fail some test as 'test-only' 
  //is treated as code is run in "devMode" while 'test' dose not assume this. 
  
  //AngularJS core
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AngularJS148 the ResourceServer.pathRewriter" should {
    "rewrit fobo/angular.js to fobo/angular-js/1.4.8/js/angular.min.js" in {
      rewriteAngularJS148 must_== List("fobo", "angular-js", "1.4.8", "js", "angular.min.js")
    }       
  } 
  
    //Testing two instances of the same toolkit could cause test errors as they are executed in parralell 
    //Two instances of the same toolkit should never be used in code anyway so removing this test in favour 
    //for the one above.
//  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AngularJS141 the ResourceServer.pathRewriter" should {
//    "rewrit fobo/angular.js to fobo/angular-js/1.4.1/js/angular.min.js" in {
//      rewriteAngularJS141 must_== List("fobo", "angular-js", "1.4.1", "js", "angular.min.js")
//    }       
//  }   
  
  //Angular Material
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AJMaterial101 the ResourceServer.pathRewriter" should {
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.1/js/angular-material.min.js" in {
      rewriteAJMaterial101JS must_== List("fobo", "angular-material", "1.0.1", "js", "angular-material.min.js")
    }      
    "rewrit fobo/angular-material.css to fobo/angular-material/1.0.1/js/angular-material.min.css" in {
      rewriteAJMaterial101CSS must_== List("fobo", "angular-material", "1.0.1", "css", "angular-material.min.css")
    }    
  }  
  
  //AngularJS UI Bootatrap
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AJSUIBootstrap020 the ResourceServer.pathRewriter" should {
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.2.0/js/ui-bootstrap-0.2.0.min.js" in {
      rewriteAJSUIBootstrap020 must_== List("fobo", "angular-ui", "bootstrap", "0.2.0", "js", "ui-bootstrap-0.2.0.min.js")
    }      
    "rewrit fobo/ui-bootstrap-tpls.js to fobo/angular-ui/bootstrap/0.2.0/js/ui-bootstrap-tpls-0.2.0.min.js" in {
      rewriteAJSUIBootstrap020TPLS must_== List("fobo", "angular-ui", "bootstrap", "0.2.0", "js", "ui-bootstrap-tpls-0.2.0.min.js")
    }    
  }
  
  //AngularJS UI Grid
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AJSUIGrid307 the ResourceServer.pathRewriter" should {
    "rewrit fobo/ui-grid.js to fobo/angular-ui/ui-grid/3.0.7/js/ui-grid.min.js" in {
      rewriteAJSUIGrid307Js must_== List("fobo", "angular-ui", "ui-grid", "3.0.7", "js", "ui-grid.min.js")
    }      
    "rewrit fobo/ui-grid.css to fobo/angular-ui/ui-grid/3.0.7/css/ui-grid.min.css" in {
      rewriteAJSUIGrid307Css must_== List("fobo", "angular-ui", "ui-grid", "3.0.7", "css", "ui-grid.min.css")
    }    
  }  
  
  
  
  //Angular Material 
 def rewriteAJMaterial101JS = {
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJMaterial101
    ResourceServer.pathRewriter("fobo"::"angular-material.js"::Nil)
  }
 def rewriteAJMaterial101CSS = {
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJMaterial101
    ResourceServer.pathRewriter("fobo"::"angular-material.css"::Nil)
  } 
  
  //AngularJS
//  def rewriteAngularJS141 = {
//    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS141
//    ResourceServer.pathRewriter("fobo"::"angular.js"::Nil)
//  }
  
  def rewriteAngularJS148 = {
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS148
    ResourceServer.pathRewriter("fobo"::"angular.js"::Nil)
  }
  
  def rewriteAJSUIBootstrap020 = {
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSUIBootstrap020
    ResourceServer.pathRewriter("fobo"::"ui-bootstrap.js"::Nil)
  } 
  
  def rewriteAJSUIBootstrap020TPLS = {
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSUIBootstrap020
    ResourceServer.pathRewriter("fobo"::"ui-bootstrap-tpls.js"::Nil)
  }
  
  //Angular UI Grid
  def rewriteAJSUIGrid307Js = {
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSUIGrid307
    ResourceServer.pathRewriter("fobo"::"ui-grid.js"::Nil)
  }  
   
  def rewriteAJSUIGrid307Css = {
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSUIGrid307
    ResourceServer.pathRewriter("fobo"::"ui-grid.css"::Nil)
  }   
}


