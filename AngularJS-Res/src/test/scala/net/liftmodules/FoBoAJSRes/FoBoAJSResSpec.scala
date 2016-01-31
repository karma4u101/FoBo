package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.{Specification}
//import org.specs2.mutable.BeforeAfter

object FoBoAJSResSpec extends Specification  {
  "FoBoAJSResSpec Specification".title
  
  sequential
  
  //OBS! using 'test-only' instead of 'test' will fail some test as 'test-only' 
  //is treated as code is run in "devMode" while 'test' dose not assume this. 
  //var list148JS = List("fobo", "angular-js", "1.4.8", "js", "angular.min.js")
  
  //AngularJS core
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AngularJS148 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowResource(FoBoAJSRes.Resource.AngularJS148,"fobo"::"angular.js"::Nil) must_== true 
    } 
    "rewrit fobo/angular.js to fobo/angular-js/1.4.8/js/angular.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AngularJS148,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.8", "js", "angular.min.js")
    }       
  } 
  
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AngularJS141 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowResource(FoBoAJSRes.Resource.AngularJS141,"fobo"::"angular.js"::Nil) must_== true 
     // allowAngularJS141 must_== true 
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.4.1/js/angular.min.js" in {
      //rewriteAngularJS141 
      rewriteResource(FoBoAJSRes.Resource.AngularJS141,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.1", "js", "angular.min.js")
    }       
  }  
  
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AngularJS1315 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      //allowAngularJS1315 
      allowResource(FoBoAJSRes.Resource.AngularJS1315,"fobo"::"angular.js"::Nil) must_== true 
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.3.15/js/angular.min.js" in {
      //rewriteAngularJS1315 
      rewriteResource(FoBoAJSRes.Resource.AngularJS1315,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.3.15", "js", "angular.min.js")
    }       
  } 
  
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AngularJS1219 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      //allowAngularJS1219
      allowResource(FoBoAJSRes.Resource.AngularJS1219,"fobo"::"angular.js"::Nil) must_== true 
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.2.19/js/angular.min.js" in {
      //rewriteAngularJS1219 
      rewriteResource(FoBoAJSRes.Resource.AngularJS1219,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.2.19", "js", "angular.min.js")
    }       
  }   
  
  //Angular Material
  //AJMaterial101
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AJMaterial101 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      //allowAJMaterial101 
      allowResource(FoBoAJSRes.Resource.AJMaterial101,"fobo"::"angular-material.js"::Nil) must_== true 
    }     
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.1/js/angular-material.min.js" in {
      //rewriteAJMaterial101JS 
      rewriteResource(FoBoAJSRes.Resource.AJMaterial101,"fobo"::"angular-material.js"::Nil) must_== 
        List("fobo", "angular-material", "1.0.1", "js", "angular-material.min.js")
    }      
    "rewrit fobo/angular-material.css to fobo/angular-material/1.0.1/js/angular-material.min.css" in {
      //rewriteAJMaterial101CSS 
      rewriteResource(FoBoAJSRes.Resource.AJMaterial101,"fobo"::"angular-material.css"::Nil) must_== 
        List("fobo", "angular-material", "1.0.1", "css", "angular-material.min.css")
    }    
  }  
  
  //AJMaterial0100
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AJMaterial0100 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowResource(FoBoAJSRes.Resource.AJMaterial0100,"fobo"::"angular-material.js"::Nil) must_== true 
    }     
    "rewrit fobo/angular-material.js to fobo/angular-material/0.10.0/js/angular-material.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AJMaterial0100,"fobo"::"angular-material.js"::Nil) must_== 
        List("fobo", "angular-material", "0.10.0", "js", "angular-material.min.js")
    }      
    "rewrit fobo/angular-material.css to fobo/angular-material/0.10.0/js/angular-material.css" in {
      rewriteResource(FoBoAJSRes.Resource.AJMaterial0100,"fobo"::"angular-material.css"::Nil) must_== 
        List("fobo", "angular-material", "0.10.0", "css", "angular-material.css")
    }    
  }  
  
  //AJSUIBootstrap020
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AJSUIBootstrap020 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowResource(FoBoAJSRes.Resource.AJSUIBootstrap020,"fobo"::"ui-bootstrap.js"::Nil) must_== true 
    }     
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.2.0/js/ui-bootstrap-0.2.0.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AJSUIBootstrap020,"fobo"::"ui-bootstrap.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.2.0", "js", "ui-bootstrap-0.2.0.min.js")
    }      
    "rewrit fobo/ui-bootstrap-tpls.js to fobo/angular-ui/bootstrap/0.2.0/js/ui-bootstrap-tpls-0.2.0.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AJSUIBootstrap020,"fobo"::"ui-bootstrap-tpls.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.2.0", "js", "ui-bootstrap-tpls-0.2.0.min.js")
    }    
  }      
  
  //AJSUIBootstrap070
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AJSUIBootstrap070 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowResource(FoBoAJSRes.Resource.AJSUIBootstrap070,"fobo"::"ui-bootstrap.js"::Nil) must_== true 
    }     
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.7.0/js/ui-bootstrap-0.7.0.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AJSUIBootstrap070,"fobo"::"ui-bootstrap.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.7.0", "js", "ui-bootstrap-0.7.0.min.js")
    }      
    "rewrit fobo/ui-bootstrap-tpls.js to fobo/angular-ui/bootstrap/0.7.0/js/ui-bootstrap-tpls-0.7.0.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AJSUIBootstrap070,"fobo"::"ui-bootstrap-tpls.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.7.0", "js", "ui-bootstrap-tpls-0.7.0.min.js")
    }    
  } 
  
  //AJSUIBootstrap0100
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AJSUIBootstrap0100 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowResource(FoBoAJSRes.Resource.AJSUIBootstrap0100,"fobo"::"ui-bootstrap.js"::Nil) must_== true 
    }     
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.10.0/js/ui-bootstrap-0.10.0.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AJSUIBootstrap0100,"fobo"::"ui-bootstrap.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.10.0", "js", "ui-bootstrap-0.10.0.min.js")
    }      
    "rewrit fobo/ui-bootstrap-tpls.js to fobo/angular-ui/bootstrap/0.10.0/js/ui-bootstrap-tpls-0.10.0.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AJSUIBootstrap0100,"fobo"::"ui-bootstrap-tpls.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.10.0", "js", "ui-bootstrap-tpls-0.10.0.min.js")
    }    
  }   
   
  //AJSNGGrid207
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AJSNGGrid207 the ResourceServer" should {
    "allow  fobo/ng-grid.js" in {
      allowResource(FoBoAJSRes.Resource.AJSNGGrid207,"fobo"::"ng-grid.js"::Nil) must_== true 
    }     
    "rewrit fobo/ng-grid.js to fobo/angular-ui/ng-grid/2.0.7/js/ng-grid-2.0.7.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AJSNGGrid207,"fobo"::"ng-grid.js"::Nil) must_== 
        List("fobo", "angular-ui", "ng-grid", "2.0.7", "js", "ng-grid-2.0.7.min.js")
    }      
    "rewrit fobo/ng-grid.css to fobo/angular-ui/ng-grid/2.0.7/css/ng-grid.min.css" in {
      rewriteResource(FoBoAJSRes.Resource.AJSNGGrid207,"fobo"::"ng-grid.css"::Nil) must_== 
        List("fobo", "angular-ui", "ng-grid", "2.0.7", "css", "ng-grid.min.css")
    }    
  }  
  
  //AJSUIGrid307
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AJSUIGrid307 the ResourceServer" should {
    "allow  fobo/ui-grid.js" in {
      allowResource(FoBoAJSRes.Resource.AJSUIGrid307,"fobo"::"ui-grid.js"::Nil) must_== true 
    }     
    "rewrit fobo/ui-grid.js to fobo/angular-ui/ui-grid/3.0.7/js/ui-grid.min.js" in {
      rewriteResource(FoBoAJSRes.Resource.AJSUIGrid307,"fobo"::"ui-grid.js"::Nil) must_== 
        List("fobo", "angular-ui", "ui-grid", "3.0.7", "js", "ui-grid.min.js")
    }      
    "rewrit fobo/ui-grid.css to fobo/angular-ui/ui-grid/3.0.7/css/ui-grid.min.css" in {
      rewriteResource(FoBoAJSRes.Resource.AJSUIGrid307,"fobo"::"ui-grid.css"::Nil) must_== 
        List("fobo", "angular-ui", "ui-grid", "3.0.7", "css", "ui-grid.min.css")
    }    
  }   
   
  //AngularJS148i18n
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AngularJS148i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(FoBoAJSRes.Resource.AngularJS148i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== true 
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.8/i18n/angular-locale_sv-se.js" in {
      rewriteResource(FoBoAJSRes.Resource.AngularJS148i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sv-se.js")
    }        
  } 
  
  //AngularJS141i18n
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AngularJS141i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(FoBoAJSRes.Resource.AngularJS141i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== true 
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.1/i18n/angular-locale_sv-se.js" in {
      rewriteResource(FoBoAJSRes.Resource.AngularJS141i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sv-se.js")
    }        
  }
  
  //AngularJS1315i18n
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AngularJS1315i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(FoBoAJSRes.Resource.AngularJS1315i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== true 
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.3.15/i18n/angular-locale_sv-se.js" in {
      rewriteResource(FoBoAJSRes.Resource.AngularJS1315i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sv-se.js")
    }        
  }  
  
  //AngularJS1219i18n
  "With FoBoAJSRes.Resource.Init set to FoBoAJSRes.Resource.AngularJS1219i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowResource(FoBoAJSRes.Resource.AngularJS1219i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== true 
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.2.19/i18n/angular-locale_sv-se.js" in {
      rewriteResource(FoBoAJSRes.Resource.AngularJS1219i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sv-se.js")
    }        
  }
  
  
  //=== Resource.Init ===============//
  def allowResource(resource:FoBoAJSRes.Resource,path:List[String]) = {
    FoBoAJSRes.Resource.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteResource(resource:FoBoAJSRes.Resource,path:List[String]) = {
    FoBoAJSRes.Resource.Init=resource 
    ResourceServer.pathRewriter(path)
  }  
  
  //Angular Material 
  def allowAJMaterial101 = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AJMaterial101
    ResourceServer.allowedPaths("fobo"::"angular-material.js"::Nil)
  }  
  
  def rewriteAJMaterial101JS = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AJMaterial101
    ResourceServer.pathRewriter("fobo"::"angular-material.js"::Nil)
  }
  
  def rewriteAJMaterial101CSS = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AJMaterial101
    ResourceServer.pathRewriter("fobo"::"angular-material.css"::Nil)
  }
  
  def allowAJMaterial0100 = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AJMaterial0100
    ResourceServer.allowedPaths("fobo"::"angular-material.js"::Nil)
  }  
  
  def rewriteAJMaterial0100JS = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AJMaterial0100
    ResourceServer.pathRewriter("fobo"::"angular-material.js"::Nil)
  }
  
  def rewriteAJMaterial0100CSS = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AJMaterial0100
    ResourceServer.pathRewriter("fobo"::"angular-material.css"::Nil)
  }  
  
  //AngularJS
  def allowAngularJS1219 = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AngularJS1219
    ResourceServer.allowedPaths("fobo"::"angular.js"::Nil)
  }
  
  def rewriteAngularJS1219 = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AngularJS1219
    ResourceServer.pathRewriter("fobo"::"angular.js"::Nil)
  }  
  
  def allowAngularJS1315 = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AngularJS1315
    ResourceServer.allowedPaths("fobo"::"angular.js"::Nil)
  }
  
  def rewriteAngularJS1315 = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AngularJS1315
    ResourceServer.pathRewriter("fobo"::"angular.js"::Nil)
  }
  
  def allowAngularJS141 = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AngularJS141
    ResourceServer.allowedPaths("fobo"::"angular.js"::Nil)
  }
  
  def rewriteAngularJS141 = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AngularJS141
    ResourceServer.pathRewriter("fobo"::"angular.js"::Nil)
  }
  
  def allowAngularJS148 = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AngularJS148
    ResourceServer.allowedPaths("fobo"::"angular.js"::Nil)
  }
  
  def rewriteAngularJS148 = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AngularJS148
    ResourceServer.pathRewriter("fobo"::"angular.js"::Nil)
  }
  
  def allowAJSUIBootstrap020 = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AJSUIBootstrap020
    ResourceServer.allowedPaths("fobo"::"ui-bootstrap.js"::Nil)
  }
  
  def rewriteAJSUIBootstrap020 = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AJSUIBootstrap020
    ResourceServer.pathRewriter("fobo"::"ui-bootstrap.js"::Nil)
  } 
  
  def rewriteAJSUIBootstrap020TPLS = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AJSUIBootstrap020
    ResourceServer.pathRewriter("fobo"::"ui-bootstrap-tpls.js"::Nil)
  }
  
  def allowAJSUIBootstrap070 = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AJSUIBootstrap070
    ResourceServer.allowedPaths("fobo"::"ui-bootstrap.js"::Nil)
  }
  
  def rewriteAJSUIBootstrap070 = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AJSUIBootstrap070
    ResourceServer.pathRewriter("fobo"::"ui-bootstrap.js"::Nil)
  } 
  
  def rewriteAJSUIBootstrap070TPLS = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AJSUIBootstrap070
    ResourceServer.pathRewriter("fobo"::"ui-bootstrap-tpls.js"::Nil)
  }
  
  def allowAJSUIBootstrap0100 = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AJSUIBootstrap0100
    ResourceServer.allowedPaths("fobo"::"ui-bootstrap.js"::Nil)
  }
  
  def rewriteAJSUIBootstrap0100 = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AJSUIBootstrap0100
    ResourceServer.pathRewriter("fobo"::"ui-bootstrap.js"::Nil)
  } 
  
  def rewriteAJSUIBootstrap0100TPLS = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AJSUIBootstrap0100
    ResourceServer.pathRewriter("fobo"::"ui-bootstrap-tpls.js"::Nil)
  }  
  
  //Angular NG Grid
  def allowAJSNGGrid207 = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AJSNGGrid207
    ResourceServer.allowedPaths("fobo"::"ng-grid.js"::Nil)
  }
  
  def rewriteAJSNGGrid207Js = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AJSNGGrid207
    ResourceServer.pathRewriter("fobo"::"ng-grid.js"::Nil)
  }  

  def rewriteAJSNGGrid207Css = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AJSNGGrid207
    ResourceServer.pathRewriter("fobo"::"ng-grid.css"::Nil)
  }
  
  //Angular UI Grid
  def allowAJSUIGrid307 = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AJSUIGrid307
    ResourceServer.allowedPaths("fobo"::"ui-grid.js"::Nil)
  }
  
  def rewriteAJSUIGrid307Js = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AJSUIGrid307
    ResourceServer.pathRewriter("fobo"::"ui-grid.js"::Nil)
  }  

  def rewriteAJSUIGrid307Css = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AJSUIGrid307
    ResourceServer.pathRewriter("fobo"::"ui-grid.css"::Nil)
  }
  
//  def allowAJSUIGrid307Css = {
//    ResourceServer
//    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AJSUIGrid307
//    ResourceServer.allowedPaths("fobo"::"ui-grid.css"::Nil)
//  }
  

  
  
  
  //i18n
  def allowAngularJS148i18n = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AngularJS148i18n
    ResourceServer.allowedPaths("fobo"::"angular-locale_sv-se.js"::Nil)
  }  
  
  def rewriteAngularJS148i18nJs = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AngularJS148i18n
    ResourceServer.pathRewriter("fobo"::"angular-locale_sv-se.js"::Nil)
  }
  
  def allowAngularJS141i18n = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AngularJS141i18n
    ResourceServer.allowedPaths("fobo"::"angular-locale_sv-se.js"::Nil)
  }  
  
  def rewriteAngularJS141i18nJs = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AngularJS141i18n
    ResourceServer.pathRewriter("fobo"::"angular-locale_sv-se.js"::Nil)
  } 
  
  def allowAngularJS1315i18n = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AngularJS1315i18n
    ResourceServer.allowedPaths("fobo"::"angular-locale_sv-se.js"::Nil)
  }  
  
  def rewriteAngularJS1315i18nJs = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AngularJS1315i18n
    ResourceServer.pathRewriter("fobo"::"angular-locale_sv-se.js"::Nil)
  }   
  
  def allowAngularJS1219i18n = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AngularJS1219i18n
    ResourceServer.allowedPaths("fobo"::"angular-locale_sv-se.js"::Nil)
  }  
  
  def rewriteAngularJS1219i18nJs = {
    ResourceServer
    FoBoAJSRes.Resource.Init=FoBoAJSRes.Resource.AngularJS1219i18n
    ResourceServer.pathRewriter("fobo"::"angular-locale_sv-se.js"::Nil)
  }   
  
}


