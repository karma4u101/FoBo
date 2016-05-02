package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._
import org.specs2._

class FoBoAJSSpec extends mutable.Specification {
  "FoBoAJSToolKitSpec Specification".title
  sequential
  
  //OBS! using 'test-only' instead of 'test' will fail some test as 'test-only' 
  //is treated as code is run in "devMode" while 'test' dose not assume this. 
  
  //AngularJS153
  "With FoBoAJS.ToolKit.Init set to FoBoAJS.ToolKit.AngularJS153 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowToolKitInit(FoBoAJS.ToolKit.AngularJS153,"fobo"::"angular.js"::Nil) must_== true 
    } 
    "rewrit fobo/angular.js to fobo/angular-js/1.5.3/js/angular.min.js" in {
      rewriteToolKitInit(FoBoAJS.ToolKit.AngularJS153,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.5.3", "js", "angular.min.js")
    }       
  } 
    
  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AngularJS153 the ResourceServer" should {    
    "allow  fobo/angular.js" in {
      allowResource(FoBoAJS.Resource.AngularJS153,"fobo"::"angular.js"::Nil)  must_== true 
    } 
    "rewrit fobo/angular.js to fobo/angular-js/1.5.3/js/angular.min.js" in {
      rewriteResource(FoBoAJS.Resource.AngularJS153,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.5.3", "js", "angular.min.js")
    }       
  }  
  
  //AngularJS148
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AngularJS148 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowInitParam(FoBoAJS.AngularJS148,"fobo"::"angular.js"::Nil) must_== true 
    } 
    "rewrit fobo/angular.js to fobo/angular-js/1.4.8/js/angular.min.js" in {
      rewriteInitParam(FoBoAJS.AngularJS148,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.8", "js", "angular.min.js")
    }       
  } 
  
  "With FoBoAJS.ToolKit.Init set to FoBoAJS.ToolKit.AngularJS148 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowToolKitInit(FoBoAJS.ToolKit.AngularJS148,"fobo"::"angular.js"::Nil) must_== true 
    } 
    "rewrit fobo/angular.js to fobo/angular-js/1.4.8/js/angular.min.js" in {
      rewriteToolKitInit(FoBoAJS.ToolKit.AngularJS148,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.8", "js", "angular.min.js")
    }       
  } 
    
  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AngularJS148 the ResourceServer" should {    
    "allow  fobo/angular.js" in {
      allowResource(FoBoAJS.Resource.AngularJS148,"fobo"::"angular.js"::Nil)  must_== true 
    } 
    "rewrit fobo/angular.js to fobo/angular-js/1.4.8/js/angular.min.js" in {
      rewriteResource(FoBoAJS.Resource.AngularJS148,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.8", "js", "angular.min.js")
    }       
  }   
  
  //AngularJS141
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AngularJS141 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowInitParam(FoBoAJS.AngularJS141,"fobo"::"angular.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.4.1/js/angular.min.js" in  {
      rewriteInitParam(FoBoAJS.AngularJS141,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.1", "js", "angular.min.js")      
    }       
  } 
  
  "With FoBoAJS.ToolKit.Init set to FoBoAJS.ToolKit.AngularJS141 the ResourceServer" should {    
    "allow  fobo/angular.js" in {
      allowToolKitInit(FoBoAJS.ToolKit.AngularJS141,"fobo"::"angular.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.4.1/js/angular.min.js" in {
      rewriteToolKitInit(FoBoAJS.ToolKit.AngularJS141,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.1", "js", "angular.min.js")      
    }       
  }   
  
  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AngularJS141 the ResourceServer" should { 
    "allow  fobo/angular.js" in  {
      allowResource(FoBoAJS.Resource.AngularJS141,"fobo"::"angular.js"::Nil)  must_== true 
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.4.1/js/angular.min.js" in  {
     rewriteResource(FoBoAJS.Resource.AngularJS141,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.1", "js", "angular.min.js")      
    }       
  } 
   
  
  //AngularJS1315
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AngularJS1315 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowInitParam(FoBoAJS.AngularJS1315,"fobo"::"angular.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.3.15/js/angular.min.js" in  {
      rewriteInitParam(FoBoAJS.AngularJS1315,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.3.15", "js", "angular.min.js")      
    }       
  } 
  
  "With FoBoAJS.ToolKit.Init set to FoBoAJS.ToolKit.AngularJS1315 the ResourceServer" should {    
    "allow  fobo/angular.js" in {
      allowToolKitInit(FoBoAJS.ToolKit.AngularJS1315,"fobo"::"angular.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.3.15/js/angular.min.js" in {
      rewriteToolKitInit(FoBoAJS.ToolKit.AngularJS1315,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.3.15", "js", "angular.min.js")      
    }       
  } 
  
  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AngularJS1315 the ResourceServer" should { 
    "allow  fobo/angular.js" in  {
      allowResource(FoBoAJS.Resource.AngularJS1315,"fobo"::"angular.js"::Nil)  must_== true 
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.3.15/js/angular.min.js" in  {
     rewriteResource(FoBoAJS.Resource.AngularJS1315,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.3.15", "js", "angular.min.js")      
    }       
  }
  
    
  //AngularJS1219
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AngularJS1219 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowInitParam(FoBoAJS.AngularJS1219,"fobo"::"angular.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.2.19/js/angular.min.js" in  {
      rewriteInitParam(FoBoAJS.AngularJS1219,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.2.19", "js", "angular.min.js")      
    }       
  } 
  
  "With FoBoAJS.ToolKit.Init set to FoBoAJS.ToolKit.AngularJS1219 the ResourceServer" should {    
    "allow  fobo/angular.js" in {
      allowToolKitInit(FoBoAJS.ToolKit.AngularJS1219,"fobo"::"angular.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.2.19/js/angular.min.js" in {
      rewriteToolKitInit(FoBoAJS.ToolKit.AngularJS1219,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.2.19", "js", "angular.min.js")      
    }       
  } 
  
  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AngularJS1219 the ResourceServer" should { 
    "allow  fobo/angular.js" in  {
      allowResource(FoBoAJS.Resource.AngularJS1219,"fobo"::"angular.js"::Nil)  must_== true 
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.2.19/js/angular.min.js" in  {
     rewriteResource(FoBoAJS.Resource.AngularJS1219,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.2.19", "js", "angular.min.js")      
    }       
  }  
  
  //AJMaterial110
//  "With FoBoAJS.ToolKit.Init set to FoBoAJS.ToolKit.AJMaterial110 the ResourceServer" should {    
//    "allow  fobo/angular-material.js" in {
//      allowToolKitInit(FoBoAJS.ToolKit.AJMaterial110,"fobo"::"angular-material.js"::Nil) must_== true       
//    }     
//    "rewrit fobo/angular-material.js to fobo/angular-material/1.1.0/js/angular-material.min.js" in {
//      rewriteToolKitInit(FoBoAJS.ToolKit.AJMaterial110,"fobo"::"angular-material.js"::Nil) must_== 
//        List("fobo", "angular-material", "1.1.0", "js", "angular-material.min.js")      
//    }       
//  } 
//  
//  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AJMaterial110 the ResourceServer" should { 
//    "allow  fobo/angular-material.js" in  {
//      allowResource(FoBoAJS.Resource.AJMaterial110,"fobo"::"angular-material.js"::Nil)  must_== true 
//    }     
//    "rewrit fobo/angular-material.js to fobo/angular-material/1.1.0/js/angular-material.min.js" in  {
//     rewriteResource(FoBoAJS.Resource.AJMaterial110,"fobo"::"angular-material.js"::Nil) must_== 
//        List("fobo", "angular-material", "1.1.0", "js", "angular-material.min.js")      
//    }       
//  }  
  
  //AJMaterial108
  "With FoBoAJS.ToolKit.Init set to FoBoAJS.ToolKit.AJMaterial108 the ResourceServer" should {    
    "allow  fobo/angular-material.js" in {
      allowToolKitInit(FoBoAJS.ToolKit.AJMaterial108,"fobo"::"angular-material.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.8/js/angular-material.min.js" in {
      rewriteToolKitInit(FoBoAJS.ToolKit.AJMaterial108,"fobo"::"angular-material.js"::Nil) must_== 
        List("fobo", "angular-material", "1.0.8", "js", "angular-material.min.js")      
    }       
  } 
  
  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AJMaterial108 the ResourceServer" should { 
    "allow  fobo/angular-material.js" in  {
      allowResource(FoBoAJS.Resource.AJMaterial108,"fobo"::"angular-material.js"::Nil)  must_== true 
    }     
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.8/js/angular-material.min.js" in  {
     rewriteResource(FoBoAJS.Resource.AJMaterial108,"fobo"::"angular-material.js"::Nil) must_== 
        List("fobo", "angular-material", "1.0.8", "js", "angular-material.min.js")      
    }       
  }   
   
  //AJMaterial101
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AJMaterial101 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowInitParam(FoBoAJS.AJMaterial101,"fobo"::"angular-material.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.1/js/angular-material.min.js" in  {
      rewriteInitParam(FoBoAJS.AJMaterial101,"fobo"::"angular-material.js"::Nil) must_== 
        List("fobo", "angular-material", "1.0.1", "js", "angular-material.min.js")      
    }       
  } 
  
  "With FoBoAJS.ToolKit.Init set to FoBoAJS.ToolKit.AJMaterial101 the ResourceServer" should {    
    "allow  fobo/angular-material.js" in {
      allowToolKitInit(FoBoAJS.ToolKit.AJMaterial101,"fobo"::"angular-material.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.1/js/angular-material.min.js" in {
      rewriteToolKitInit(FoBoAJS.ToolKit.AJMaterial101,"fobo"::"angular-material.js"::Nil) must_== 
        List("fobo", "angular-material", "1.0.1", "js", "angular-material.min.js")      
    }       
  } 
  
  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AJMaterial101 the ResourceServer" should { 
    "allow  fobo/angular-material.js" in  {
      allowResource(FoBoAJS.Resource.AJMaterial101,"fobo"::"angular-material.js"::Nil)  must_== true 
    }     
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.1/js/angular-material.min.js" in  {
     rewriteResource(FoBoAJS.Resource.AJMaterial101,"fobo"::"angular-material.js"::Nil) must_== 
        List("fobo", "angular-material", "1.0.1", "js", "angular-material.min.js")      
    }       
  }    
  
  //AJMaterial0100
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AJMaterial0100 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowInitParam(FoBoAJS.AJMaterial0100,"fobo"::"angular-material.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-material.js to fobo/angular-material/0.10.0/js/angular-material.min.js" in  {
      rewriteInitParam(FoBoAJS.AJMaterial0100,"fobo"::"angular-material.js"::Nil) must_== 
        List("fobo", "angular-material", "0.10.0", "js", "angular-material.min.js")      
    }       
  } 
  
  "With FoBoAJS.ToolKit.Init set to FoBoAJS.ToolKit.AJMaterial0100 the ResourceServer" should {    
    "allow  fobo/angular-material.js" in {
      allowToolKitInit(FoBoAJS.ToolKit.AJMaterial0100,"fobo"::"angular-material.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-material.js to fobo/angular-material/0.10.0/js/angular-material.min.js" in {
      rewriteToolKitInit(FoBoAJS.ToolKit.AJMaterial0100,"fobo"::"angular-material.js"::Nil) must_== 
        List("fobo", "angular-material", "0.10.0", "js", "angular-material.min.js")      
    }       
  } 
  
  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AJMaterial0100 the ResourceServer" should { 
    "allow  fobo/angular-material.js" in  {
      allowResource(FoBoAJS.Resource.AJMaterial0100,"fobo"::"angular-material.js"::Nil)  must_== true 
    }     
    "rewrit fobo/angular-material.js to fobo/angular-material/0.10.0/js/angular-material.min.js" in  {
     rewriteResource(FoBoAJS.Resource.AJMaterial0100,"fobo"::"angular-material.js"::Nil) must_== 
        List("fobo", "angular-material", "0.10.0", "js", "angular-material.min.js")      
    }       
  }      
  
  //AJSUIBootstrap020
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AJSUIBootstrap020 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowInitParam(FoBoAJS.AJSUIBootstrap020,"fobo"::"ui-bootstrap.js"::Nil) must_== true       
    }     
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.2.0/js/ui-bootstrap-0.2.0.min.js" in  {
      rewriteInitParam(FoBoAJS.AJSUIBootstrap020,"fobo"::"ui-bootstrap.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.2.0", "js", "ui-bootstrap-0.2.0.min.js")      
    }       
  } 
  
  "With FoBoAJS.ToolKit.Init set to FoBoAJS.ToolKit.AJSUIBootstrap020 the ResourceServer" should {    
    "allow  fobo/ui-bootstrap.js" in {
      allowToolKitInit(FoBoAJS.ToolKit.AJSUIBootstrap020,"fobo"::"ui-bootstrap.js"::Nil) must_== true       
    }     
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.2.0/js/ui-bootstrap-0.2.0.min.js" in {
      rewriteToolKitInit(FoBoAJS.ToolKit.AJSUIBootstrap020,"fobo"::"ui-bootstrap.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.2.0", "js", "ui-bootstrap-0.2.0.min.js")      
    }       
  } 
  
  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AJSUIBootstrap020 the ResourceServer" should { 
    "allow  fobo/ui-bootstrap.js" in  {
      allowResource(FoBoAJS.Resource.AJSUIBootstrap020,"fobo"::"ui-bootstrap.js"::Nil)  must_== true 
    }     
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.2.0/js/ui-bootstrap-0.2.0.min.js" in  {
     rewriteResource(FoBoAJS.Resource.AJSUIBootstrap020,"fobo"::"ui-bootstrap.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.2.0", "js", "ui-bootstrap-0.2.0.min.js")      
    }       
  }    
  
  //AJSUIBootstrap070
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AJSUIBootstrap070 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowInitParam(FoBoAJS.AJSUIBootstrap070,"fobo"::"ui-bootstrap.js"::Nil) must_== true       
    }     
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.7.0/js/ui-bootstrap-0.7.0.min.js" in  {
      rewriteInitParam(FoBoAJS.AJSUIBootstrap070,"fobo"::"ui-bootstrap.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.7.0", "js", "ui-bootstrap-0.7.0.min.js")      
    }       
  } 
  
  "With FoBoAJS.ToolKit.Init set to FoBoAJS.ToolKit.AJSUIBootstrap070 the ResourceServer" should {    
    "allow  fobo/ui-bootstrap.js" in {
      allowToolKitInit(FoBoAJS.ToolKit.AJSUIBootstrap070,"fobo"::"ui-bootstrap.js"::Nil) must_== true       
    }     
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.7.0/js/ui-bootstrap-0.7.0.min.js" in {
      rewriteToolKitInit(FoBoAJS.ToolKit.AJSUIBootstrap070,"fobo"::"ui-bootstrap.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.7.0", "js", "ui-bootstrap-0.7.0.min.js")      
    }       
  } 
  
  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AJSUIBootstrap070 the ResourceServer" should { 
    "allow  fobo/ui-bootstrap.js" in  {
      allowResource(FoBoAJS.Resource.AJSUIBootstrap070,"fobo"::"ui-bootstrap.js"::Nil)  must_== true 
    }     
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.7.0/js/ui-bootstrap-0.7.0.min.js" in  {
     rewriteResource(FoBoAJS.Resource.AJSUIBootstrap070,"fobo"::"ui-bootstrap.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.7.0", "js", "ui-bootstrap-0.7.0.min.js")      
    }       
  } 
  
  //AJSUIBootstrap0100
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AJSUIBootstrap0100 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowInitParam(FoBoAJS.AJSUIBootstrap0100,"fobo"::"ui-bootstrap.js"::Nil) must_== true       
    }     
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.10.0/js/ui-bootstrap-0.10.0.min.js" in  {
      rewriteInitParam(FoBoAJS.AJSUIBootstrap0100,"fobo"::"ui-bootstrap.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.10.0", "js", "ui-bootstrap-0.10.0.min.js")      
    }       
  } 
  
  "With FoBoAJS.ToolKit.Init set to FoBoAJS.ToolKit.AJSUIBootstrap0100 the ResourceServer" should {    
    "allow  fobo/ui-bootstrap.js" in {
      allowToolKitInit(FoBoAJS.ToolKit.AJSUIBootstrap0100,"fobo"::"ui-bootstrap.js"::Nil) must_== true       
    }     
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.10.0/js/ui-bootstrap-0.10.0.min.js" in {
      rewriteToolKitInit(FoBoAJS.ToolKit.AJSUIBootstrap0100,"fobo"::"ui-bootstrap.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.10.0", "js", "ui-bootstrap-0.10.0.min.js")      
    }       
  } 
  
  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AJSUIBootstrap0100 the ResourceServer" should { 
    "allow  fobo/ui-bootstrap.js" in  {
      allowResource(FoBoAJS.Resource.AJSUIBootstrap0100,"fobo"::"ui-bootstrap.js"::Nil)  must_== true 
    }     
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.10.0/js/ui-bootstrap-0.10.0.min.js" in  {
     rewriteResource(FoBoAJS.Resource.AJSUIBootstrap0100,"fobo"::"ui-bootstrap.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.10.0", "js", "ui-bootstrap-0.10.0.min.js")      
    }       
  }   
  
  //AJSNGGrid207
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AJSNGGrid207 the ResourceServer" should {
    "allow  fobo/ng-grid.js" in {
      allowInitParam(FoBoAJS.AJSNGGrid207,"fobo"::"ng-grid.js"::Nil) must_== true       
    }     
    "rewrit fobo/ng-grid.js to fobo/angular-ui/ng-grid/2.0.7/js/ng-grid.min.js" in  {
      rewriteInitParam(FoBoAJS.AJSNGGrid207,"fobo"::"ng-grid.js"::Nil) must_== 
        List("fobo", "angular-ui", "ng-grid", "2.0.7", "js", "ng-grid-2.0.7.min.js")      
    }       
  } 
  
  "With FoBoAJS.ToolKit.Init set to FoBoAJS.ToolKit.AJSNGGrid207 the ResourceServer" should {    
    "allow  fobo/ng-grid.js" in {
      allowToolKitInit(FoBoAJS.ToolKit.AJSNGGrid207,"fobo"::"ng-grid.js"::Nil) must_== true       
    }     
    "rewrit fobo/ng-grid.js to fobo/angular-ui/ng-grid/2.0.7/js/ng-grid.min.js" in {
      rewriteToolKitInit(FoBoAJS.ToolKit.AJSNGGrid207,"fobo"::"ng-grid.js"::Nil) must_== 
        List("fobo", "angular-ui", "ng-grid", "2.0.7", "js", "ng-grid-2.0.7.min.js")      
    }       
  } 
  
  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AJSNGGrid207 the ResourceServer" should { 
    "allow  fobo/ng-grid.js" in  {
      allowResource(FoBoAJS.Resource.AJSNGGrid207,"fobo"::"ng-grid.js"::Nil)  must_== true 
    }     
    "rewrit fobo/ng-grid.js to fobo/angular-ui/ng-grid/2.0.7/js/ng-grid.min.js" in  {
     rewriteResource(FoBoAJS.Resource.AJSNGGrid207,"fobo"::"ng-grid.js"::Nil) must_== 
        List("fobo", "angular-ui", "ng-grid", "2.0.7", "js", "ng-grid-2.0.7.min.js")      
    }       
  }   
   
  //AJSUIGrid307
    "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AJSUIGrid307 the ResourceServer" should {
    "allow  fobo/ui-grid.js" in {
      allowInitParam(FoBoAJS.AJSUIGrid307,"fobo"::"ui-grid.js"::Nil) must_== true       
    }     
    "rewrit fobo/ui-grid.js to fobo/angular-ui/ui-grid/3.0.7/js/ui-grid.min.js" in  {
      rewriteInitParam(FoBoAJS.AJSUIGrid307,"fobo"::"ui-grid.js"::Nil) must_== 
        List("fobo", "angular-ui", "ui-grid", "3.0.7", "js", "ui-grid.min.js")      
    }       
  } 
  
  "With FoBoAJS.ToolKit.Init set to FoBoAJS.ToolKit.AJSUIGrid307 the ResourceServer" should {    
    "allow  fobo/ui-grid.js" in {
      allowToolKitInit(FoBoAJS.ToolKit.AJSUIGrid307,"fobo"::"ui-grid.js"::Nil) must_== true       
    }     
    "rewrit fobo/ui-grid.js to fobo/angular-ui/ui-grid/3.0.7/js/ui-grid.min.js" in {
      rewriteToolKitInit(FoBoAJS.ToolKit.AJSUIGrid307,"fobo"::"ui-grid.js"::Nil) must_== 
        List("fobo", "angular-ui", "ui-grid", "3.0.7", "js", "ui-grid.min.js")      
    }       
  } 
  
  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AJSUIGrid307 the ResourceServer" should { 
    "allow  fobo/ui-grid.js" in  {
      allowResource(FoBoAJS.Resource.AJSUIGrid307,"fobo"::"ui-grid.js"::Nil)  must_== true 
    }     
    "rewrit fobo/ui-grid.js to fobo/angular-ui/ui-grid/3.0.7/js/ui-grid.min.js" in  {
     rewriteResource(FoBoAJS.Resource.AJSUIGrid307,"fobo"::"ui-grid.js"::Nil) must_== 
        List("fobo", "angular-ui", "ui-grid", "3.0.7", "js", "ui-grid.min.js")      
    }       
  }
  
  //AngularJS153i18n
  "With FoBoAJS.ToolKit.Init set to FoBoAJS.ToolKit.AngularJS153i18n the ResourceServer" should {    
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolKitInit(FoBoAJS.ToolKit.AngularJS153i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.5.3/i18n/angular-locale_sv-se.js" in {
      rewriteToolKitInit(FoBoAJS.ToolKit.AngularJS153i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_sv-se.js")      
    }       
  } 
  
  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AngularJS153i18n the ResourceServer" should { 
    "allow  fobo/angular-locale_sv-se.js" in  {
      allowResource(FoBoAJS.Resource.AngularJS153i18n,"fobo"::"angular-locale_sv-se.js"::Nil)  must_== true 
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.5.3/i18n/angular-locale_sv-se.js" in  {
     rewriteResource(FoBoAJS.Resource.AngularJS153i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_sv-se.js")      
    }       
  }    
  
  //AngularJS148i18n
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AngularJS148i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowInitParam(FoBoAJS.AngularJS148i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.8/i18n/angular-locale_sv-se.js" in  {
      rewriteInitParam(FoBoAJS.AngularJS148i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sv-se.js")      
    }       
  } 
  
  "With FoBoAJS.ToolKit.Init set to FoBoAJS.ToolKit.AngularJS148i18n the ResourceServer" should {    
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolKitInit(FoBoAJS.ToolKit.AngularJS148i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.8/i18n/angular-locale_sv-se.js" in {
      rewriteToolKitInit(FoBoAJS.ToolKit.AngularJS148i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sv-se.js")      
    }       
  } 
  
  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AngularJS148i18n the ResourceServer" should { 
    "allow  fobo/angular-locale_sv-se.js" in  {
      allowResource(FoBoAJS.Resource.AngularJS148i18n,"fobo"::"angular-locale_sv-se.js"::Nil)  must_== true 
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.8/i18n/angular-locale_sv-se.js" in  {
     rewriteResource(FoBoAJS.Resource.AngularJS148i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sv-se.js")      
    }       
  }  
  
  //AngularJS141i18n
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AngularJS141i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowInitParam(FoBoAJS.AngularJS141i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.1/i18n/angular-locale_sv-se.js" in  {
      rewriteInitParam(FoBoAJS.AngularJS141i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sv-se.js")      
    }       
  } 
  
  "With FoBoAJS.ToolKit.Init set to FoBoAJS.ToolKit.AngularJS141i18n the ResourceServer" should {    
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolKitInit(FoBoAJS.ToolKit.AngularJS141i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.1/i18n/angular-locale_sv-se.js" in {
      rewriteToolKitInit(FoBoAJS.ToolKit.AngularJS141i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sv-se.js")      
    }       
  } 
  
  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AngularJS141i18n the ResourceServer" should { 
    "allow  fobo/angular-locale_sv-se.js" in  {
      allowResource(FoBoAJS.Resource.AngularJS141i18n,"fobo"::"angular-locale_sv-se.js"::Nil)  must_== true 
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.1/i18n/angular-locale_sv-se.js" in  {
     rewriteResource(FoBoAJS.Resource.AngularJS141i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sv-se.js")      
    }       
  }  
  
  //AngularJS1315i18n
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AngularJS1315i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowInitParam(FoBoAJS.AngularJS1315i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.3.15/i18n/angular-locale_sv-se.js" in  {
      rewriteInitParam(FoBoAJS.AngularJS1315i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sv-se.js")      
    }       
  } 
  
  "With FoBoAJS.ToolKit.Init set to FoBoAJS.ToolKit.AngularJS1315i18n the ResourceServer" should {    
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolKitInit(FoBoAJS.ToolKit.AngularJS1315i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.3.15/i18n/angular-locale_sv-se.js" in {
      rewriteToolKitInit(FoBoAJS.ToolKit.AngularJS1315i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sv-se.js")      
    }       
  } 
  
  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AngularJS1315i18n the ResourceServer" should { 
    "allow  fobo/angular-locale_sv-se.js" in  {
      allowResource(FoBoAJS.Resource.AngularJS1315i18n,"fobo"::"angular-locale_sv-se.js"::Nil)  must_== true 
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.3.15/i18n/angular-locale_sv-se.js" in  {
     rewriteResource(FoBoAJS.Resource.AngularJS1315i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sv-se.js")      
    }       
  } 
  
  //AngularJS1219i18n
  "With FoBoAJS.InitParam.ToolKit set to FoBoAJS.AngularJS1219i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowInitParam(FoBoAJS.AngularJS1219i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.2.19/i18n/angular-locale_sv-se.js" in  {
      rewriteInitParam(FoBoAJS.AngularJS1219i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sv-se.js")      
    }       
  } 
  
  "With FoBoAJS.ToolKit.Init set to FoBoAJS.ToolKit.AngularJS1219i18n the ResourceServer" should {    
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolKitInit(FoBoAJS.ToolKit.AngularJS1219i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.2.19/i18n/angular-locale_sv-se.js" in {
      rewriteToolKitInit(FoBoAJS.ToolKit.AngularJS1219i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sv-se.js")      
    }       
  } 
  
  "With FoBoAJS.Resource.Init set to FoBoAJS.Resource.AngularJS1219i18n the ResourceServer" should { 
    "allow  fobo/angular-locale_sv-se.js" in  {
      allowResource(FoBoAJS.Resource.AngularJS1219i18n,"fobo"::"angular-locale_sv-se.js"::Nil)  must_== true 
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.2.19/i18n/angular-locale_sv-se.js" in  {
     rewriteResource(FoBoAJS.Resource.AngularJS1219i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sv-se.js")      
    }       
  } 
  
 
 //=== ToolKit.Init ==============//
  def allowToolKitInit(resource:FoBoAJS.ToolKit,path:List[String]) = {
    FoBoAJS.ToolKit.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteToolKitInit(resource:FoBoAJS.ToolKit,path:List[String]) = {
    FoBoAJS.ToolKit.Init=resource 
    ResourceServer.pathRewriter(path)
  }  
  
 //=== InitParam.ToolKit ===============// 
  def allowInitParam(resource:FoBoAJS.FoBoToolkit,path:List[String]) = {
    FoBoAJS.InitParam.ToolKit=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteInitParam(resource:FoBoAJS.FoBoToolkit,path:List[String]) = {
    FoBoAJS.InitParam.ToolKit=resource 
    ResourceServer.pathRewriter(path)
  } 
 
  //=== Resource.Init ===============//
  def allowResource(resource:FoBoAJS.Resource,path:List[String]) = {
    FoBoAJS.Resource.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteResource(resource:FoBoAJS.Resource,path:List[String]) = {
    FoBoAJS.Resource.Init=resource 
    ResourceServer.pathRewriter(path)
  }    
  
}


