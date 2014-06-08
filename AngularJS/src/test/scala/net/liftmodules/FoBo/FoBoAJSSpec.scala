package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

@RunWith(classOf[JUnitRunner])
object FoBoAJSSpec extends Specification  {
  "FoBoAJSSpec Specification".title
  
  //OBS! using 'test-only' instead of 'test' will fail some test as 'test-only' 
  //is treated as code is run in "devMode" while 'test' dose not assume this. 
  
  //AngularJS core
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AngularJS106 the ResourceServer.pathRewriter" should {
    "rewrit fobo/angular.js to fobo/angular-js/1.0.6/js/angular.min.js" in {
      rewriteAngularJS106 must_== List("fobo", "angular-js", "1.0.6", "js", "angular.min.js")
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
  
    //AngularJS
  def rewriteAngularJS106 = {
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS106
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


