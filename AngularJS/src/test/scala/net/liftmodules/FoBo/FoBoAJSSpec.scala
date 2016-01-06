package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.{Specification}
//import org.specs2.mutable.BeforeAfter

//@RunWith(classOf[JUnitRunner])
object FoBoAJSSpec extends Specification  {
  "FoBoAJSSpec Specification".title
  sequential
  
  //OBS! using 'test-only' instead of 'test' will fail some test as 'test-only' 
  //is treated as code is run in "devMode" while 'test' dose not assume this. 
  
  //AngularJS core
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AngularJS148 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowAngularJS148 must_== true 
    } 
    "rewrit fobo/angular.js to fobo/angular-js/1.4.8/js/angular.min.js" in {
      rewriteAngularJS148 must_== List("fobo", "angular-js", "1.4.8", "js", "angular.min.js")
    }       
  } 
  
    //Testing two instances of the same toolkit could cause test errors as they are executed in parralell 
    //Two instances of the same toolkit should never be used in code anyway so removing this test in favour 
    //for the one above.
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AngularJS141 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowAngularJS141 must_== true 
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.4.1/js/angular.min.js" in {
      rewriteAngularJS141 must_== List("fobo", "angular-js", "1.4.1", "js", "angular.min.js")
    }       
  }  
  
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AngularJS1315 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowAngularJS1315 must_== true 
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.3.15/js/angular.min.js" in {
      rewriteAngularJS1315 must_== List("fobo", "angular-js", "1.3.15", "js", "angular.min.js")
    }       
  } 
  
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AngularJS1219 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowAngularJS1219 must_== true 
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.2.19/js/angular.min.js" in {
      rewriteAngularJS1219 must_== List("fobo", "angular-js", "1.2.19", "js", "angular.min.js")
    }       
  }   
  
  //Angular Material
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AJMaterial101 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowAJMaterial101 must_== true 
    }     
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.1/js/angular-material.min.js" in {
      rewriteAJMaterial101JS must_== List("fobo", "angular-material", "1.0.1", "js", "angular-material.min.js")
    }      
    "rewrit fobo/angular-material.css to fobo/angular-material/1.0.1/js/angular-material.min.css" in {
      rewriteAJMaterial101CSS must_== List("fobo", "angular-material", "1.0.1", "css", "angular-material.min.css")
    }    
  }  
  
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AJMaterial0100 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowAJMaterial0100 must_== true 
    }     
    "rewrit fobo/angular-material.js to fobo/angular-material/0.10.0/js/angular-material.min.js" in {
      rewriteAJMaterial0100JS must_== List("fobo", "angular-material", "0.10.0", "js", "angular-material.min.js")
    }      
    "rewrit fobo/angular-material.css to fobo/angular-material/0.10.0/js/angular-material.css" in {
      rewriteAJMaterial0100CSS must_== List("fobo", "angular-material", "0.10.0", "css", "angular-material.css")
    }    
  }    
  
  //AngularJS UI Bootatrap
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AJSUIBootstrap020 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowAJSUIBootstrap020 must_== true 
    }      
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.2.0/js/ui-bootstrap-0.2.0.min.js" in {
      rewriteAJSUIBootstrap020 must_== List("fobo", "angular-ui", "bootstrap", "0.2.0", "js", "ui-bootstrap-0.2.0.min.js")
    }      
    "rewrit fobo/ui-bootstrap-tpls.js to fobo/angular-ui/bootstrap/0.2.0/js/ui-bootstrap-tpls-0.2.0.min.js" in {
      rewriteAJSUIBootstrap020TPLS must_== List("fobo", "angular-ui", "bootstrap", "0.2.0", "js", "ui-bootstrap-tpls-0.2.0.min.js")
    }    
  }
  
 "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AJSUIBootstrap070 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowAJSUIBootstrap070 must_== true 
    }      
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.7.0/js/ui-bootstrap-0.7.0.min.js" in {
      rewriteAJSUIBootstrap070 must_== List("fobo", "angular-ui", "bootstrap", "0.7.0", "js", "ui-bootstrap-0.7.0.min.js")
    }      
    "rewrit fobo/ui-bootstrap-tpls.js to fobo/angular-ui/bootstrap/0.7.0/js/ui-bootstrap-tpls-0.7.0.min.js" in {
      rewriteAJSUIBootstrap070TPLS must_== List("fobo", "angular-ui", "bootstrap", "0.7.0", "js", "ui-bootstrap-tpls-0.7.0.min.js")
    }    
  } 
 
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AJSUIBootstrap0100 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowAJSUIBootstrap0100 must_== true 
    }      
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.10.0/js/ui-bootstrap-0.10.0.min.js" in {
      rewriteAJSUIBootstrap0100 must_== List("fobo", "angular-ui", "bootstrap", "0.10.0", "js", "ui-bootstrap-0.10.0.min.js")
    }      
    "rewrit fobo/ui-bootstrap-tpls.js to fobo/angular-ui/bootstrap/0.10.0/js/ui-bootstrap-tpls-0.10.0.min.js" in {
      rewriteAJSUIBootstrap0100TPLS must_== List("fobo", "angular-ui", "bootstrap", "0.10.0", "js", "ui-bootstrap-tpls-0.10.0.min.js")
    }    
  } 
  
  //AngularJS UI Grid
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AJSUIGrid307 the ResourceServer" should {
    "allow  fobo/ui-grid.js" in {
      allowAJSUIGrid307 must_== true 
    }    
    "rewrit fobo/ui-grid.js to fobo/angular-ui/ui-grid/3.0.7/js/ui-grid.min.js" in {
      rewriteAJSUIGrid307Js must_== List("fobo", "angular-ui", "ui-grid", "3.0.7", "js", "ui-grid.min.js")
    }      
    "rewrit fobo/ui-grid.css to fobo/angular-ui/ui-grid/3.0.7/css/ui-grid.min.css" in {
      rewriteAJSUIGrid307Css must_== List("fobo", "angular-ui", "ui-grid", "3.0.7", "css", "ui-grid.min.css")
    }    
  }  
  
  //i18n
 "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AngularJS148i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowAngularJS148i18n must_== true 
    }    
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.8/i18n/angular-locale_sv-se.js" in {
      rewriteAngularJS148i18nJs must_== List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sv-se.js")
    }         
  }
 
 "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AngularJS141i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowAngularJS141i18n must_== true 
    }    
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.1/i18n/angular-locale_sv-se.js" in {
      rewriteAngularJS141i18nJs must_== List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sv-se.js")
    }         
  } 
 
 "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AngularJS1315i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowAngularJS1315i18n must_== true 
    }    
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.3.15/i18n/angular-locale_sv-se.js" in {
      rewriteAngularJS1315i18nJs must_== List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sv-se.js")
    }         
  }
 
 "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AngularJS1219i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowAngularJS1219i18n must_== true 
    }    
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.2.19/i18n/angular-locale_sv-se.js" in {
      rewriteAngularJS1219i18nJs must_== List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sv-se.js")
    }         
  } 
  
  
  //Angular Material 
  def allowAJMaterial101 = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJMaterial101
    ResourceServer.allowedPaths("fobo"::"angular-material.js"::Nil)
  }  
  
  def rewriteAJMaterial101JS = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJMaterial101
    ResourceServer.pathRewriter("fobo"::"angular-material.js"::Nil)
  }
  
  def rewriteAJMaterial101CSS = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJMaterial101
    ResourceServer.pathRewriter("fobo"::"angular-material.css"::Nil)
  }
  
  def allowAJMaterial0100 = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJMaterial0100
    ResourceServer.allowedPaths("fobo"::"angular-material.js"::Nil)
  }  
  
  def rewriteAJMaterial0100JS = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJMaterial0100
    ResourceServer.pathRewriter("fobo"::"angular-material.js"::Nil)
  }
  
  def rewriteAJMaterial0100CSS = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJMaterial0100
    ResourceServer.pathRewriter("fobo"::"angular-material.css"::Nil)
  }  
  
  //AngularJS
  def allowAngularJS1219 = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS1219
    ResourceServer.allowedPaths("fobo"::"angular.js"::Nil)
  }
  
  def rewriteAngularJS1219 = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS1219
    ResourceServer.pathRewriter("fobo"::"angular.js"::Nil)
  }  
  
  def allowAngularJS1315 = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS1315
    ResourceServer.allowedPaths("fobo"::"angular.js"::Nil)
  }
  
  def rewriteAngularJS1315 = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS1315
    ResourceServer.pathRewriter("fobo"::"angular.js"::Nil)
  }
  
  def allowAngularJS141 = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS141
    ResourceServer.allowedPaths("fobo"::"angular.js"::Nil)
  }
  
  def rewriteAngularJS141 = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS141
    ResourceServer.pathRewriter("fobo"::"angular.js"::Nil)
  }
  
  def allowAngularJS148 = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS148
    ResourceServer.allowedPaths("fobo"::"angular.js"::Nil)
  }
  
  def rewriteAngularJS148 = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS148
    ResourceServer.pathRewriter("fobo"::"angular.js"::Nil)
  }
  
  def allowAJSUIBootstrap020 = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSUIBootstrap020
    ResourceServer.allowedPaths("fobo"::"ui-bootstrap.js"::Nil)
  }
  
  def rewriteAJSUIBootstrap020 = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSUIBootstrap020
    ResourceServer.pathRewriter("fobo"::"ui-bootstrap.js"::Nil)
  } 
  
  def rewriteAJSUIBootstrap020TPLS = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSUIBootstrap020
    ResourceServer.pathRewriter("fobo"::"ui-bootstrap-tpls.js"::Nil)
  }
  
  def allowAJSUIBootstrap070 = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSUIBootstrap070
    ResourceServer.allowedPaths("fobo"::"ui-bootstrap.js"::Nil)
  }
  
  def rewriteAJSUIBootstrap070 = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSUIBootstrap070
    ResourceServer.pathRewriter("fobo"::"ui-bootstrap.js"::Nil)
  } 
  
  def rewriteAJSUIBootstrap070TPLS = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSUIBootstrap070
    ResourceServer.pathRewriter("fobo"::"ui-bootstrap-tpls.js"::Nil)
  }
  
  def allowAJSUIBootstrap0100 = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSUIBootstrap0100
    ResourceServer.allowedPaths("fobo"::"ui-bootstrap.js"::Nil)
  }
  
  def rewriteAJSUIBootstrap0100 = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSUIBootstrap0100
    ResourceServer.pathRewriter("fobo"::"ui-bootstrap.js"::Nil)
  } 
  
  def rewriteAJSUIBootstrap0100TPLS = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSUIBootstrap0100
    ResourceServer.pathRewriter("fobo"::"ui-bootstrap-tpls.js"::Nil)
  }  
  
  //Angular UI Grid
  def allowAJSUIGrid307 = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSUIGrid307
    ResourceServer.allowedPaths("fobo"::"ui-grid.js"::Nil)
  }
  
  def rewriteAJSUIGrid307Js = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSUIGrid307
    ResourceServer.pathRewriter("fobo"::"ui-grid.js"::Nil)
  }  
   
  def allowAJSUIGrid307Css = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSUIGrid307
    ResourceServer.allowedPaths("fobo"::"ui-grid.css"::Nil)
  }
  
  def rewriteAJSUIGrid307Css = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AJSUIGrid307
    ResourceServer.pathRewriter("fobo"::"ui-grid.css"::Nil)
  }
  
  //i18n
  def allowAngularJS148i18n = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS148i18n
    ResourceServer.allowedPaths("fobo"::"angular-locale_sv-se.js"::Nil)
  }  
  
  def rewriteAngularJS148i18nJs = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS148i18n
    ResourceServer.pathRewriter("fobo"::"angular-locale_sv-se.js"::Nil)
  }
  
  def allowAngularJS141i18n = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS141i18n
    ResourceServer.allowedPaths("fobo"::"angular-locale_sv-se.js"::Nil)
  }  
  
  def rewriteAngularJS141i18nJs = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS141i18n
    ResourceServer.pathRewriter("fobo"::"angular-locale_sv-se.js"::Nil)
  } 
  
  def allowAngularJS1315i18n = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS1315i18n
    ResourceServer.allowedPaths("fobo"::"angular-locale_sv-se.js"::Nil)
  }  
  
  def rewriteAngularJS1315i18nJs = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS1315i18n
    ResourceServer.pathRewriter("fobo"::"angular-locale_sv-se.js"::Nil)
  }   
  
  def allowAngularJS1219i18n = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS1219i18n
    ResourceServer.allowedPaths("fobo"::"angular-locale_sv-se.js"::Nil)
  }  
  
  def rewriteAngularJS1219i18nJs = {
    ResourceServer
    FoBoAJS.InitParam.ToolKit=FoBoAJS.AngularJS1219i18n
    ResourceServer.pathRewriter("fobo"::"angular-locale_sv-se.js"::Nil)
  }   
  
}


