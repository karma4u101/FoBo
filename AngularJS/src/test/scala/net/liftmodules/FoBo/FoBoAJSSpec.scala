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
  
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AngularJS141 the ResourceServer.pathRewriter" should {
    "rewrit fobo/angular.js to fobo/angular-js/1.4.1/js/angular.min.js" in {
      rewriteAngularJS141 must_== List("fobo", "angular-js", "1.4.1", "js", "angular.min.js")
    }       
  }   
  
  //Angular Material
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AJMaterial100 the ResourceServer.pathRewriter" should {
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.0/js/angular-material.min.js" in {
      rewriteAJMaterial100JS must_== List("fobo", "angular-material", "1.0.0", "js", "angular-material.min.js")
    }      
    "rewrit fobo/angular-material.css to fobo/angular-material/1.0.0/js/angular-material.min.css" in {
      rewriteAJMaterial100CSS must_== List("fobo", "angular-material", "1.0.0", "css", "angular-material.min.css")
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
  
  //Angular Material 
 def rewriteAJMaterial100JS = {
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJMaterial100
    ResourceServer.pathRewriter("fobo"::"angular-material.js"::Nil)
  }
 def rewriteAJMaterial100CSS = {
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJMaterial100
    ResourceServer.pathRewriter("fobo"::"angular-material.css"::Nil)
  } 
  
  //AngularJS
  def rewriteAngularJS141 = {
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS141
    ResourceServer.pathRewriter("fobo"::"angular.js"::Nil)
  }
  
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
   
}


