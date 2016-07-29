package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

object FoBoSpec extends Specification  {
  "FoBoSpec Specification".title

  sequential
  
  
  //These tests in not meant to catch all errors but to making sure that the 
  //FoBo InitParam's has got initiated as expected, for instance to ensure that 
  //fobo sub modules is accessible. 
  
  //OBS! using 'test-only' instead of 'test' will fail some test as 'test-only' 
  //is treated as code is run in "devMode" while 'test' dose not assume this. 
 
  
  /*=================Angular ====================================*/
  
  //AngularJS153
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.AngularJS153 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowToolkitInit(FoBo.Toolkit.AngularJS153,"fobo"::"angular.js"::Nil) must_== true 
    } 
    "rewrit fobo/angular.js to fobo/angular-js/1.5.3/js/angular.min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.AngularJS153,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.5.3", "js", "angular.min.js")
    }       
  } 
    
  "With FoBo.Resource.Init set to FoBo.Resource.AngularJS153 the ResourceServer" should {    
    "allow  fobo/angular.js" in {
      allowResource(FoBo.Resource.AngularJS153,"fobo"::"angular.js"::Nil)  must_== true 
    } 
    "rewrit fobo/angular.js to fobo/angular-js/1.5.3/js/angular.min.js" in {
      rewriteResource(FoBo.Resource.AngularJS153,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.5.3", "js", "angular.min.js")
    }       
  }   
  
  //AngularJS148
  "With FoBo.InitParam.ToolKit set to FoBo.AngularJS148 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowInitParam(FoBo.AngularJS148,"fobo"::"angular.js"::Nil) must_== true 
    } 
    "rewrit fobo/angular.js to fobo/angular-js/1.4.8/js/angular.min.js" in {
      rewriteInitParam(FoBo.AngularJS148,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.8", "js", "angular.min.js")
    }       
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.AngularJS148 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowToolkitInit(FoBo.Toolkit.AngularJS148,"fobo"::"angular.js"::Nil) must_== true 
    } 
    "rewrit fobo/angular.js to fobo/angular-js/1.4.8/js/angular.min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.AngularJS148,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.8", "js", "angular.min.js")
    }       
  } 
    
  "With FoBo.Resource.Init set to FoBo.Resource.AngularJS148 the ResourceServer" should {    
    "allow  fobo/angular.js" in {
      allowResource(FoBo.Resource.AngularJS148,"fobo"::"angular.js"::Nil)  must_== true 
    } 
    "rewrit fobo/angular.js to fobo/angular-js/1.4.8/js/angular.min.js" in {
      rewriteResource(FoBo.Resource.AngularJS148,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.8", "js", "angular.min.js")
    }       
  }  
  
  //AngularJS141
  "With FoBo.InitParam.ToolKit set to FoBo.AngularJS141 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowInitParam(FoBo.AngularJS141,"fobo"::"angular.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.4.1/js/angular.min.js" in  {
      rewriteInitParam(FoBo.AngularJS141,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.1", "js", "angular.min.js")      
    }       
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.AngularJS141 the ResourceServer" should {    
    "allow  fobo/angular.js" in {
      allowToolkitInit(FoBo.Toolkit.AngularJS141,"fobo"::"angular.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.4.1/js/angular.min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.AngularJS141,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.1", "js", "angular.min.js")      
    }       
  }   
  
  "With FoBo.Resource.Init set to FoBoAJS.Resource.AngularJS141 the ResourceServer" should { 
    "allow  fobo/angular.js" in  {
      allowResource(FoBo.Resource.AngularJS141,"fobo"::"angular.js"::Nil)  must_== true 
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.4.1/js/angular.min.js" in  {
     rewriteResource(FoBo.Resource.AngularJS141,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.1", "js", "angular.min.js")      
    }       
  } 
  
  //AngularJS1315
  "With FoBo.InitParam.ToolKit set to FoBo.AngularJS1315 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowInitParam(FoBo.AngularJS1315,"fobo"::"angular.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.3.15/js/angular.min.js" in  {
      rewriteInitParam(FoBo.AngularJS1315,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.3.15", "js", "angular.min.js")      
    }       
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.AngularJS1315 the ResourceServer" should {    
    "allow  fobo/angular.js" in {
      allowToolkitInit(FoBo.Toolkit.AngularJS1315,"fobo"::"angular.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.3.15/js/angular.min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.AngularJS1315,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.3.15", "js", "angular.min.js")      
    }       
  } 
  
  "With FoBo.Resource.Init set to FoBo.Resource.AngularJS1315 the ResourceServer" should { 
    "allow  fobo/angular.js" in  {
      allowResource(FoBo.Resource.AngularJS1315,"fobo"::"angular.js"::Nil)  must_== true 
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.3.15/js/angular.min.js" in  {
     rewriteResource(FoBo.Resource.AngularJS1315,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.3.15", "js", "angular.min.js")      
    }       
  }
    
  //AngularJS1219
  "With FoBo.InitParam.ToolKit set to FoBo.AngularJS1219 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowInitParam(FoBo.AngularJS1219,"fobo"::"angular.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.2.19/js/angular.min.js" in  {
      rewriteInitParam(FoBo.AngularJS1219,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.2.19", "js", "angular.min.js")      
    }       
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.AngularJS1219 the ResourceServer" should {    
    "allow  fobo/angular.js" in {
      allowToolkitInit(FoBo.Toolkit.AngularJS1219,"fobo"::"angular.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.2.19/js/angular.min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.AngularJS1219,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.2.19", "js", "angular.min.js")      
    }       
  } 
  
  "With FoBo.Resource.Init set to FoBo.Resource.AngularJS1219 the ResourceServer" should { 
    "allow  fobo/angular.js" in  {
      allowResource(FoBo.Resource.AngularJS1219,"fobo"::"angular.js"::Nil)  must_== true 
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.2.19/js/angular.min.js" in  {
     rewriteResource(FoBo.Resource.AngularJS1219,"fobo"::"angular.js"::Nil) must_== 
        List("fobo", "angular-js", "1.2.19", "js", "angular.min.js")      
    }       
  }  
  
//   //AJMaterial110
//  "With FoBo.Toolkit.Init set to FoBo.Toolkit.AJMaterial110 the ResourceServer" should {    
//    "allow  fobo/angular-material.js" in {
//      allowToolkitInit(FoBo.Toolkit.AJMaterial110,"fobo"::"angular-material.js"::Nil) must_== true       
//    }     
//    "rewrit fobo/angular-material.js to fobo/angular-material/1.1.0/js/angular-material.min.js" in {
//      rewriteToolkitInit(FoBo.Toolkit.AJMaterial110,"fobo"::"angular-material.js"::Nil) must_== 
//        List("fobo", "angular-material", "1.1.0", "js", "angular-material.min.js")      
//    }       
//  } 
//  
//  "With FoBo.Resource.Init set to FoBo.Resource.AJMaterial110 the ResourceServer" should { 
//    "allow  fobo/angular-material.js" in  {
//      allowResource(FoBo.Resource.AJMaterial110,"fobo"::"angular-material.js"::Nil)  must_== true 
//    }     
//    "rewrit fobo/angular-material.js to fobo/angular-material/1.1.0/js/angular-material.min.js" in  {
//     rewriteResource(FoBo.Resource.AJMaterial110,"fobo"::"angular-material.js"::Nil) must_== 
//        List("fobo", "angular-material", "1.1.0", "js", "angular-material.min.js")      
//    }       
//  } 
  
  //AJMaterial108
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.AJMaterial108 the ResourceServer" should {    
    "allow  fobo/angular-material.js" in {
      allowToolkitInit(FoBo.Toolkit.AJMaterial108,"fobo"::"angular-material.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.8/js/angular-material.min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.AJMaterial108,"fobo"::"angular-material.js"::Nil) must_== 
        List("fobo", "angular-material", "1.0.8", "js", "angular-material.min.js")      
    }       
  } 
  
  "With FoBo.Resource.Init set to FoBo.Resource.AJMaterial108 the ResourceServer" should { 
    "allow  fobo/angular-material.js" in  {
      allowResource(FoBo.Resource.AJMaterial108,"fobo"::"angular-material.js"::Nil)  must_== true 
    }     
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.8/js/angular-material.min.js" in  {
     rewriteResource(FoBo.Resource.AJMaterial108,"fobo"::"angular-material.js"::Nil) must_== 
        List("fobo", "angular-material", "1.0.8", "js", "angular-material.min.js")      
    }       
  } 
  
  //AJMaterial101
  "With FoBo.InitParam.ToolKit set to FoBo.AJMaterial101 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowInitParam(FoBo.AJMaterial101,"fobo"::"angular-material.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.1/js/angular-material.min.js" in  {
      rewriteInitParam(FoBo.AJMaterial101,"fobo"::"angular-material.js"::Nil) must_== 
        List("fobo", "angular-material", "1.0.1", "js", "angular-material.min.js")      
    }       
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.AJMaterial101 the ResourceServer" should {    
    "allow  fobo/angular-material.js" in {
      allowToolkitInit(FoBo.Toolkit.AJMaterial101,"fobo"::"angular-material.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.1/js/angular-material.min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.AJMaterial101,"fobo"::"angular-material.js"::Nil) must_== 
        List("fobo", "angular-material", "1.0.1", "js", "angular-material.min.js")      
    }       
  } 
  
  "With FoBo.Resource.Init set to FoBo.Resource.AJMaterial101 the ResourceServer" should { 
    "allow  fobo/angular-material.js" in  {
      allowResource(FoBo.Resource.AJMaterial101,"fobo"::"angular-material.js"::Nil)  must_== true 
    }     
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.1/js/angular-material.min.js" in  {
     rewriteResource(FoBo.Resource.AJMaterial101,"fobo"::"angular-material.js"::Nil) must_== 
        List("fobo", "angular-material", "1.0.1", "js", "angular-material.min.js")      
    }       
  }
  
  //AJMaterial0100
  "With FoBo.InitParam.ToolKit set to FoBo.AJMaterial0100 the ResourceServer" should {
    "allow  fobo/angular-material.js" in {
      allowInitParam(FoBo.AJMaterial0100,"fobo"::"angular-material.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-material.js to fobo/angular-material/0.10.0/js/angular-material.min.js" in  {
      rewriteInitParam(FoBo.AJMaterial0100,"fobo"::"angular-material.js"::Nil) must_== 
        List("fobo", "angular-material", "0.10.0", "js", "angular-material.min.js")      
    }       
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.AJMaterial0100 the ResourceServer" should {    
    "allow  fobo/angular-material.js" in {
      allowToolkitInit(FoBo.Toolkit.AJMaterial0100,"fobo"::"angular-material.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-material.js to fobo/angular-material/0.10.0/js/angular-material.min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.AJMaterial0100,"fobo"::"angular-material.js"::Nil) must_== 
        List("fobo", "angular-material", "0.10.0", "js", "angular-material.min.js")      
    }       
  } 
  
  "With FoBo.Resource.Init set to FoBo.Resource.AJMaterial0100 the ResourceServer" should { 
    "allow  fobo/angular-material.js" in  {
      allowResource(FoBo.Resource.AJMaterial0100,"fobo"::"angular-material.js"::Nil)  must_== true 
    }     
    "rewrit fobo/angular-material.js to fobo/angular-material/0.10.0/js/angular-material.min.js" in  {
     rewriteResource(FoBo.Resource.AJMaterial0100,"fobo"::"angular-material.js"::Nil) must_== 
        List("fobo", "angular-material", "0.10.0", "js", "angular-material.min.js")      
    }       
  }    
  
  //AJSUIBootstrap020
  "With FoBo.InitParam.ToolKit set to FoBo.AJSUIBootstrap020 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowInitParam(FoBo.AJSUIBootstrap020,"fobo"::"ui-bootstrap.js"::Nil) must_== true       
    }     
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.2.0/js/ui-bootstrap-0.2.0.min.js" in  {
      rewriteInitParam(FoBo.AJSUIBootstrap020,"fobo"::"ui-bootstrap.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.2.0", "js", "ui-bootstrap-0.2.0.min.js")      
    }       
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.AJSUIBootstrap020 the ResourceServer" should {    
    "allow  fobo/ui-bootstrap.js" in {
      allowToolkitInit(FoBo.Toolkit.AJSUIBootstrap020,"fobo"::"ui-bootstrap.js"::Nil) must_== true       
    }     
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.2.0/js/ui-bootstrap-0.2.0.min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.AJSUIBootstrap020,"fobo"::"ui-bootstrap.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.2.0", "js", "ui-bootstrap-0.2.0.min.js")      
    }       
  } 
  
  "With FoBo.Resource.Init set to FoBo.Resource.AJSUIBootstrap020 the ResourceServer" should { 
    "allow  fobo/ui-bootstrap.js" in  {
      allowResource(FoBo.Resource.AJSUIBootstrap020,"fobo"::"ui-bootstrap.js"::Nil)  must_== true 
    }     
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.2.0/js/ui-bootstrap-0.2.0.min.js" in  {
     rewriteResource(FoBo.Resource.AJSUIBootstrap020,"fobo"::"ui-bootstrap.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.2.0", "js", "ui-bootstrap-0.2.0.min.js")      
    }       
  }    
  
  //AJSUIBootstrap070
  "With FoBo.InitParam.ToolKit set to FoBo.AJSUIBootstrap070 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowInitParam(FoBo.AJSUIBootstrap070,"fobo"::"ui-bootstrap.js"::Nil) must_== true       
    }     
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.7.0/js/ui-bootstrap-0.7.0.min.js" in  {
      rewriteInitParam(FoBo.AJSUIBootstrap070,"fobo"::"ui-bootstrap.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.7.0", "js", "ui-bootstrap-0.7.0.min.js")      
    }       
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.AJSUIBootstrap070 the ResourceServer" should {    
    "allow  fobo/ui-bootstrap.js" in {
      allowToolkitInit(FoBo.Toolkit.AJSUIBootstrap070,"fobo"::"ui-bootstrap.js"::Nil) must_== true       
    }     
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.7.0/js/ui-bootstrap-0.7.0.min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.AJSUIBootstrap070,"fobo"::"ui-bootstrap.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.7.0", "js", "ui-bootstrap-0.7.0.min.js")      
    }       
  } 
  
  "With FoBo.Resource.Init set to FoBo.Resource.AJSUIBootstrap070 the ResourceServer" should { 
    "allow  fobo/ui-bootstrap.js" in  {
      allowResource(FoBo.Resource.AJSUIBootstrap070,"fobo"::"ui-bootstrap.js"::Nil)  must_== true 
    }     
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.7.0/js/ui-bootstrap-0.7.0.min.js" in  {
     rewriteResource(FoBo.Resource.AJSUIBootstrap070,"fobo"::"ui-bootstrap.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.7.0", "js", "ui-bootstrap-0.7.0.min.js")      
    }       
  } 
  
  //AJSUIBootstrap0100
  "With FoBo.InitParam.ToolKit set to FoBo.AJSUIBootstrap0100 the ResourceServer" should {
    "allow  fobo/ui-bootstrap.js" in {
      allowInitParam(FoBo.AJSUIBootstrap0100,"fobo"::"ui-bootstrap.js"::Nil) must_== true       
    }     
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.10.0/js/ui-bootstrap-0.10.0.min.js" in  {
      rewriteInitParam(FoBo.AJSUIBootstrap0100,"fobo"::"ui-bootstrap.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.10.0", "js", "ui-bootstrap-0.10.0.min.js")      
    }       
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.AJSUIBootstrap0100 the ResourceServer" should {    
    "allow  fobo/ui-bootstrap.js" in {
      allowToolkitInit(FoBo.Toolkit.AJSUIBootstrap0100,"fobo"::"ui-bootstrap.js"::Nil) must_== true       
    }     
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.10.0/js/ui-bootstrap-0.10.0.min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.AJSUIBootstrap0100,"fobo"::"ui-bootstrap.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.10.0", "js", "ui-bootstrap-0.10.0.min.js")      
    }       
  } 
  
  "With FoBo.Resource.Init set to FoBo.Resource.AJSUIBootstrap0100 the ResourceServer" should { 
    "allow  fobo/ui-bootstrap.js" in  {
      allowResource(FoBo.Resource.AJSUIBootstrap0100,"fobo"::"ui-bootstrap.js"::Nil)  must_== true 
    }     
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.10.0/js/ui-bootstrap-0.10.0.min.js" in  {
     rewriteResource(FoBo.Resource.AJSUIBootstrap0100,"fobo"::"ui-bootstrap.js"::Nil) must_== 
        List("fobo", "angular-ui", "bootstrap", "0.10.0", "js", "ui-bootstrap-0.10.0.min.js")      
    }       
  } 
  
  //AJSNGGrid207
  "With FoBo.InitParam.ToolKit set to FoBo.AJSNGGrid207 the ResourceServer" should {
    "allow  fobo/ng-grid.js" in {
      allowInitParam(FoBo.AJSNGGrid207,"fobo"::"ng-grid.js"::Nil) must_== true       
    }     
    "rewrit fobo/ng-grid.js to fobo/angular-ui/ng-grid/2.0.7/js/ng-grid.min.js" in  {
      rewriteInitParam(FoBo.AJSNGGrid207,"fobo"::"ng-grid.js"::Nil) must_== 
        List("fobo", "angular-ui", "ng-grid", "2.0.7", "js", "ng-grid-2.0.7.min.js")      
    }       
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.AJSNGGrid207 the ResourceServer" should {    
    "allow  fobo/ng-grid.js" in {
      allowToolkitInit(FoBo.Toolkit.AJSNGGrid207,"fobo"::"ng-grid.js"::Nil) must_== true       
    }     
    "rewrit fobo/ng-grid.js to fobo/angular-ui/ng-grid/2.0.7/js/ng-grid.min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.AJSNGGrid207,"fobo"::"ng-grid.js"::Nil) must_== 
        List("fobo", "angular-ui", "ng-grid", "2.0.7", "js", "ng-grid-2.0.7.min.js")      
    }       
  } 
  
  "With FoBo.Resource.Init set to FoBo.Resource.AJSNGGrid207 the ResourceServer" should { 
    "allow  fobo/ng-grid.js" in  {
      allowResource(FoBo.Resource.AJSNGGrid207,"fobo"::"ng-grid.js"::Nil)  must_== true 
    }     
    "rewrit fobo/ng-grid.js to fobo/angular-ui/ng-grid/2.0.7/js/ng-grid.min.js" in  {
     rewriteResource(FoBo.Resource.AJSNGGrid207,"fobo"::"ng-grid.js"::Nil) must_== 
        List("fobo", "angular-ui", "ng-grid", "2.0.7", "js", "ng-grid-2.0.7.min.js")      
    }       
  } 
  
  //AJSUIGrid307
    "With FoBo.InitParam.ToolKit set to FoBo.AJSUIGrid307 the ResourceServer" should {
    "allow  fobo/ui-grid.js" in {
      allowInitParam(FoBo.AJSUIGrid307,"fobo"::"ui-grid.js"::Nil) must_== true       
    }     
    "rewrit fobo/ui-grid.js to fobo/angular-ui/ui-grid/3.0.7/js/ui-grid.min.js" in  {
      rewriteInitParam(FoBo.AJSUIGrid307,"fobo"::"ui-grid.js"::Nil) must_== 
        List("fobo", "angular-ui", "ui-grid", "3.0.7", "js", "ui-grid.min.js")      
    }       
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.AJSUIGrid307 the ResourceServer" should {    
    "allow  fobo/ui-grid.js" in {
      allowToolkitInit(FoBo.Toolkit.AJSUIGrid307,"fobo"::"ui-grid.js"::Nil) must_== true       
    }     
    "rewrit fobo/ui-grid.js to fobo/angular-ui/ui-grid/3.0.7/js/ui-grid.min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.AJSUIGrid307,"fobo"::"ui-grid.js"::Nil) must_== 
        List("fobo", "angular-ui", "ui-grid", "3.0.7", "js", "ui-grid.min.js")      
    }       
  } 
  
  "With FoBo.Resource.Init set to FoBo.Resource.AJSUIGrid307 the ResourceServer" should { 
    "allow  fobo/ui-grid.js" in  {
      allowResource(FoBo.Resource.AJSUIGrid307,"fobo"::"ui-grid.js"::Nil)  must_== true 
    }     
    "rewrit fobo/ui-grid.js to fobo/angular-ui/ui-grid/3.0.7/js/ui-grid.min.js" in  {
     rewriteResource(FoBo.Resource.AJSUIGrid307,"fobo"::"ui-grid.js"::Nil) must_== 
        List("fobo", "angular-ui", "ui-grid", "3.0.7", "js", "ui-grid.min.js")      
    }       
  }  
  
  //AngularJS153i18n
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.AngularJS153i18n the ResourceServer" should {    
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolkitInit(FoBo.Toolkit.AngularJS153i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.5.3/i18n/angular-locale_sv-se.js" in {
      rewriteToolkitInit(FoBo.Toolkit.AngularJS153i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_sv-se.js")      
    }       
  } 
  
  "With FoBo.Resource.Init set to FoBo.Resource.AngularJS153i18n the ResourceServer" should { 
    "allow  fobo/angular-locale_sv-se.js" in  {
      allowResource(FoBo.Resource.AngularJS153i18n,"fobo"::"angular-locale_sv-se.js"::Nil)  must_== true 
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.5.3/i18n/angular-locale_sv-se.js" in  {
     rewriteResource(FoBo.Resource.AngularJS153i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.5.3", "i18n", "angular-locale_sv-se.js")      
    }       
  }   
  
  //AngularJS148i18n
  "With FoBo.InitParam.ToolKit set to FoBo.AngularJS148i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowInitParam(FoBo.AngularJS148i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.8/i18n/angular-locale_sv-se.js" in  {
      rewriteInitParam(FoBo.AngularJS148i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sv-se.js")      
    }       
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.AngularJS148i18n the ResourceServer" should {    
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolkitInit(FoBo.Toolkit.AngularJS148i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.8/i18n/angular-locale_sv-se.js" in {
      rewriteToolkitInit(FoBo.Toolkit.AngularJS148i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sv-se.js")      
    }       
  } 
  
  "With FoBo.Resource.Init set to FoBo.Resource.AngularJS148i18n the ResourceServer" should { 
    "allow  fobo/angular-locale_sv-se.js" in  {
      allowResource(FoBo.Resource.AngularJS148i18n,"fobo"::"angular-locale_sv-se.js"::Nil)  must_== true 
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.8/i18n/angular-locale_sv-se.js" in  {
     rewriteResource(FoBo.Resource.AngularJS148i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.8", "i18n", "angular-locale_sv-se.js")      
    }       
  }   
  
  //AngularJS141i18n
  "With FoBo.InitParam.ToolKit set to FoBo.AngularJS141i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowInitParam(FoBo.AngularJS141i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.1/i18n/angular-locale_sv-se.js" in  {
      rewriteInitParam(FoBo.AngularJS141i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sv-se.js")      
    }       
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.AngularJS141i18n the ResourceServer" should {    
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolkitInit(FoBo.Toolkit.AngularJS141i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.1/i18n/angular-locale_sv-se.js" in {
      rewriteToolkitInit(FoBo.Toolkit.AngularJS141i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sv-se.js")      
    }       
  } 
  
  "With FoBo.Resource.Init set to FoBo.Resource.AngularJS141i18n the ResourceServer" should { 
    "allow  fobo/angular-locale_sv-se.js" in  {
      allowResource(FoBo.Resource.AngularJS141i18n,"fobo"::"angular-locale_sv-se.js"::Nil)  must_== true 
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.4.1/i18n/angular-locale_sv-se.js" in  {
     rewriteResource(FoBo.Resource.AngularJS141i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.4.1", "i18n", "angular-locale_sv-se.js")      
    }       
  }   
  
  
  //AngularJS1315i18n
  "With FoBo.InitParam.ToolKit set to FoBo.AngularJS1315i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowInitParam(FoBo.AngularJS1315i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.3.15/i18n/angular-locale_sv-se.js" in  {
      rewriteInitParam(FoBo.AngularJS1315i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sv-se.js")      
    }       
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.AngularJS1315i18n the ResourceServer" should {    
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolkitInit(FoBo.Toolkit.AngularJS1315i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.3.15/i18n/angular-locale_sv-se.js" in {
      rewriteToolkitInit(FoBo.Toolkit.AngularJS1315i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sv-se.js")      
    }       
  } 
  
  "With FoBo.Resource.Init set to FoBo.Resource.AngularJS1315i18n the ResourceServer" should { 
    "allow  fobo/angular-locale_sv-se.js" in  {
      allowResource(FoBo.Resource.AngularJS1315i18n,"fobo"::"angular-locale_sv-se.js"::Nil)  must_== true 
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.3.15/i18n/angular-locale_sv-se.js" in  {
     rewriteResource(FoBo.Resource.AngularJS1315i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.3.15", "i18n", "angular-locale_sv-se.js")      
    }       
  }   
  
  //AngularJS1219i18n
  "With FoBo.InitParam.ToolKit set to FoBo.AngularJS1219i18n the ResourceServer" should {
    "allow  fobo/angular-locale_sv-se.js" in {
      allowInitParam(FoBo.AngularJS1219i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.2.19/i18n/angular-locale_sv-se.js" in  {
      rewriteInitParam(FoBo.AngularJS1219i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sv-se.js")      
    }       
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.AngularJS1219i18n the ResourceServer" should {    
    "allow  fobo/angular-locale_sv-se.js" in {
      allowToolkitInit(FoBo.Toolkit.AngularJS1219i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== true       
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.2.19/i18n/angular-locale_sv-se.js" in {
      rewriteToolkitInit(FoBo.Toolkit.AngularJS1219i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sv-se.js")      
    }       
  } 
  
  "With FoBo.Resource.Init set to FoBo.Resource.AngularJS1219i18n the ResourceServer" should { 
    "allow  fobo/angular-locale_sv-se.js" in  {
      allowResource(FoBo.Resource.AngularJS1219i18n,"fobo"::"angular-locale_sv-se.js"::Nil)  must_== true 
    }     
    "rewrit fobo/angular-locale_sv-se.js to fobo/angular-js/1.2.19/i18n/angular-locale_sv-se.js" in  {
     rewriteResource(FoBo.Resource.AngularJS1219i18n,"fobo"::"angular-locale_sv-se.js"::Nil) must_== 
        List("fobo", "angular-js", "1.2.19", "i18n", "angular-locale_sv-se.js")      
    }       
  } 

  /*=================FontAwesome ====================================*/
  
  //FontAwesome321
  "With FoBo.InitParam.ToolKit set to FoBo.FontAwesome321 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowInitParam(FoBo.FontAwesome321,"fobo"::"font-awesome.css"::Nil) must_== true       
    }     
    "rewrit fobo/font-awesome.css to fobo/font-awesome/3.2.1/css/font-awesome-min.css" in  {
      rewriteInitParam(FoBo.FontAwesome321,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-min.css")      
    }       
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.FontAwesome321 the ResourceServer" should {    
    "allow  fobo/font-awesome.css" in {
      allowToolkitInit(FoBo.Toolkit.FontAwesome321,"fobo"::"font-awesome.css"::Nil) must_== true       
    }     
    "rewrit fobo/font-awesome.css to fobo/font-awesome/3.2.1/css/font-awesome-min.css" in {
      rewriteToolkitInit(FoBo.Toolkit.FontAwesome321,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-min.css")      
    }       
  } 
  
  "With FoBo.Resource.Init set to FoBo.Resource.FontAwesome321 the ResourceServer" should { 
    "allow  fobo/font-awesome.css" in  {
      allowResource(FoBo.Resource.FontAwesome321,"fobo"::"font-awesome.css"::Nil)  must_== true 
    }     
    "rewrit fobo/font-awesome.css to fobo/font-awesome/3.2.1/css/font-awesome-min.css" in  {
     rewriteResource(FoBo.Resource.FontAwesome321,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-min.css")      
    }       
  } 
  
  //FontAwesome410  
  "With FoBo.InitParam.ToolKit set to FoBo.FontAwesome410 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowInitParam(FoBo.FontAwesome410,"fobo"::"font-awesome.css"::Nil) must_== true       
    }     
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.1.0/css/font-awesome-min.css" in  {
      rewriteInitParam(FoBo.FontAwesome410,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.1.0", "css", "font-awesome.min.css")      
    }       
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.FontAwesome410 the ResourceServer" should {    
    "allow  fobo/font-awesome.css" in {
      allowToolkitInit(FoBo.Toolkit.FontAwesome410,"fobo"::"font-awesome.css"::Nil) must_== true       
    }     
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.1.0/css/font-awesome.min.css" in {
      rewriteToolkitInit(FoBo.Toolkit.FontAwesome410,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.1.0", "css", "font-awesome.min.css")      
    }       
  } 
  
  "With FoBo.Resource.Init set to FoBo.Resource.FontAwesome410 the ResourceServer" should { 
    "allow  fobo/font-awesome.css" in  {
      allowResource(FoBo.Resource.FontAwesome410,"fobo"::"font-awesome.css"::Nil)  must_== true 
    }     
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.1.0/css/font-awesome.min.css" in  {
     rewriteResource(FoBo.Resource.FontAwesome410,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.1.0", "css", "font-awesome.min.css")      
    }       
  }  
  
  //FontAwesome430
  "With FoBo.InitParam.ToolKit set to FoBo.FontAwesome430 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowInitParam(FoBo.FontAwesome430,"fobo"::"font-awesome.css"::Nil) must_== true       
    }     
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.3.0/css/font-awesome.min.css" in  {
      rewriteInitParam(FoBo.FontAwesome430,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.3.0", "css", "font-awesome.min.css")      
    }       
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.FontAwesome430 the ResourceServer" should {    
    "allow  fobo/font-awesome.css" in {
      allowToolkitInit(FoBo.Toolkit.FontAwesome430,"fobo"::"font-awesome.css"::Nil) must_== true       
    }     
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.3.0/css/font-awesome.min.css" in {
      rewriteToolkitInit(FoBo.Toolkit.FontAwesome430,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.3.0", "css", "font-awesome.min.css")      
    }       
  } 
  
  "With FoBo.Resource.Init set to FoBo.Resource.FontAwesome430 the ResourceServer" should { 
    "allow  fobo/font-awesome.css" in  {
      allowResource(FoBo.Resource.FontAwesome430,"fobo"::"font-awesome.css"::Nil)  must_== true 
    }     
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.3.0/css/font-awesome.min.css" in  {
     rewriteResource(FoBo.Resource.FontAwesome430,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.3.0", "css", "font-awesome.min.css")      
    }       
  }   
  
  //FontAwesome463
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.FontAwesome463 the ResourceServer" should {    
    "allow  fobo/font-awesome.css" in {
      allowToolkitInit(FoBo.Toolkit.FontAwesome463,"fobo"::"font-awesome.css"::Nil) must_== true       
    }     
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.6.3/css/font-awesome.min.css" in {
      rewriteToolkitInit(FoBo.Toolkit.FontAwesome463,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.6.3", "css", "font-awesome.min.css")      
    }       
  } 
  
  "With FoBo.Resource.Init set to FoBo.Resource.FontAwesome463 the ResourceServer" should { 
    "allow  fobo/font-awesome.css" in  {
      allowResource(FoBo.Resource.FontAwesome463,"fobo"::"font-awesome.css"::Nil)  must_== true 
    }     
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.6.3/css/font-awesome.min.css" in  {
     rewriteResource(FoBo.Resource.FontAwesome463,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.6.3", "css", "font-awesome.min.css")      
    }       
  }   
  
  /*=================Google-Code-Prettify ====================================*/
  
  //PrettifyJun2011
  "With FoBo.InitParam.ToolKit set to FoBo.PrettifyJun2011 the ResourceServer" should {
    "allow  fobo/prettify.js" in {
      allowInitParam(FoBo.PrettifyJun2011,"fobo"::"prettify.js"::Nil) must_== true       
    }     
    "rewrit fobo/prettify.js to fobo/google-code/js/prettify.js" in  {
      rewriteInitParam(FoBo.PrettifyJun2011,"fobo"::"prettify.js"::Nil) must_== 
        List("fobo", "google-code", "js", "prettify.js")      
    }       
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.PrettifyJun2011 the ResourceServer" should {    
    "allow  fobo/prettify.js" in {
      allowToolkitInit(FoBo.Toolkit.PrettifyJun2011,"fobo"::"prettify.js"::Nil) must_== true       
    }     
    "rewrit fobo/prettify.js to fobo/google-code/js/prettify.js" in {
      rewriteToolkitInit(FoBo.Toolkit.PrettifyJun2011,"fobo"::"prettify.js"::Nil) must_== 
        List("fobo", "google-code", "js", "prettify.js")      
    }       
  } 
  
  "With FoBo.Resource.Init set to FoBo.Resource.PrettifyJun2011 the ResourceServer" should { 
    "allow  fobo/prettify.js" in  {
      allowResource(FoBo.Resource.PrettifyJun2011,"fobo"::"prettify.js"::Nil)  must_== true 
    }     
    "rewrit fobo/prettify.js to fobo/google-code/js/prettify.js" in  {
     rewriteResource(FoBo.Resource.PrettifyJun2011,"fobo"::"prettify.js"::Nil) must_== 
        List("fobo", "google-code", "js", "prettify.js")      
    }       
  }     
  
  /*================= Pace ====================================*/
  
  //Pace102
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.Pace102 the ResourceServer" should {
    "allow  fobo/pace.js" in {
      allowToolkitInit(FoBo.Toolkit.Pace102,"fobo"::"pace.js"::Nil) must_== true 
    }     
    "rewrit fobo/pace.js to fobo/pace/1.0.2/js/pace.min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.Pace102,"fobo"::"pace.js"::Nil) must_== 
        List("fobo", "pace", "1.0.2", "js", "pace.min.js")
    }   
    "rewrit fobo/black/pace-theme-minimal.css to fobo/pace/1.0.2/css/themes/black/pace-theme-minimal.css" in {
      rewriteToolkitInit(FoBo.Toolkit.Pace102,"fobo"::"black"::"pace-theme-minimal.css"::Nil) must_== 
        List("fobo", "pace", "1.0.2", "css", "themes", "black", "pace-theme-minimal.css")
    }       
  }  
  
  "With FoBo.Resource.Init set to FoBo.Resource.Pace102 the ResourceServer" should {
    "allow  fobo/pace.js" in {
      allowResource(FoBo.Resource.Pace102,"fobo"::"pace.js"::Nil) must_== true 
    }     
    "rewrit fobo/pace.js to fobo/pace/1.0.2/js/pace.min.js" in {
      rewriteResource(FoBo.Resource.Pace102,"fobo"::"pace.js"::Nil) must_== 
        List("fobo", "pace", "1.0.2", "js", "pace.min.js")
    }   
    "rewrit fobo/black/pace-theme-minimal.css to fobo/pace/1.0.2/css/themes/black/pace-theme-minimal.css" in {
      rewriteResource(FoBo.Resource.Pace102,"fobo"::"black"::"pace-theme-minimal.css"::Nil) must_== 
        List("fobo", "pace", "1.0.2", "css", "themes", "black", "pace-theme-minimal.css")
    }       
  } 
  
  //Pace0415
  "With FoBo.InitParam.ToolKit set to FoBo.Pace0415 the ResourceServer" should {
    "allow  fobo/pace.js" in {
      allowInitParam(FoBo.Pace0415,"fobo"::"pace.js"::Nil) must_== true       
    }     
    "rewrit fobo/pace.js to fobo/pace/0.4.15/js/pace.min.js" in  {
      rewriteInitParam(FoBo.Pace0415,"fobo"::"pace.js"::Nil) must_== 
        List("fobo", "pace", "0.4.15", "js", "pace.min.js")      
    }       
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.Pace0415 the ResourceServer" should {    
    "allow  fobo/pace.js" in {
      allowToolkitInit(FoBo.Toolkit.Pace0415,"fobo"::"pace.js"::Nil) must_== true       
    }     
    "rewrit fobo/pace.js to fobo/pace/0.4.15/js/pace.min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.Pace0415,"fobo"::"pace.js"::Nil) must_== 
        List("fobo", "pace", "0.4.15", "js", "pace.min.js")      
    }       
  } 
  
  "With FoBo.Resource.Init set to FoBo.Resource.Pace0415 the ResourceServer" should { 
    "allow  fobo/pace.js" in  {
      allowResource(FoBo.Resource.Pace0415,"fobo"::"pace.js"::Nil)  must_== true 
    }     
    "rewrit fobo/pace.js to fobo/pace/0.4.15/js/pace.min.js" in  {
     rewriteResource(FoBo.Resource.Pace0415,"fobo"::"pace.js"::Nil) must_== 
        List("fobo", "pace", "0.4.15", "js", "pace.min.js")      
    }       
  }   
  
  /*=================Bootstrap ====================================*/
  
  //Bootstrap336
  "With FoBo.Resource.Init set to FoBo.Resource.Bootstrap336 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBo.Resource.Bootstrap336,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.6/js/bootstrap-min.js" in {
      rewriteResource(FoBo.Resource.Bootstrap336,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.3.6", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.Bootstrap336 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(FoBo.Toolkit.Bootstrap336,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.6/js/bootstrap-min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.Bootstrap336,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.3.6", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBo.InitParam.ToolKit set to FoBo.Bootstrap336 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowInitParam(FoBo.Bootstrap336,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.6/js/bootstrap-min.js" in {
      rewriteInitParam(FoBo.Bootstrap336,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.3.6", "js", "bootstrap.min.js")
    }       
  } 
  
  //Bootstrap335
  "With FoBo.Resource.Init set to FoBo.Resource.Bootstrap335 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBo.Resource.Bootstrap335,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.5/js/bootstrap-min.js" in {
      rewriteResource(FoBo.Resource.Bootstrap335,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.3.5", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.Bootstrap335 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(FoBo.Toolkit.Bootstrap335,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.5/js/bootstrap-min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.Bootstrap335,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.3.5", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBo.InitParam.ToolKit set to FoBo.Bootstrap335 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowInitParam(FoBo.Bootstrap335,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.5/js/bootstrap-min.js" in {
      rewriteInitParam(FoBo.Bootstrap335,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.3.5", "js", "bootstrap.min.js")
    }       
  }
  
  //Bootstrap320
  "With FoBo.Resource.Init set to FoBo.Resource.Bootstrap320 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBo.Resource.Bootstrap320,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.2.0/js/bootstrap-min.js" in {
      rewriteResource(FoBo.Resource.Bootstrap320,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.2.0", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBo.Toolkit.Init set to FoBoBs.Toolkit.Bootstrap320 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(FoBo.Toolkit.Bootstrap320,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.2.0/js/bootstrap-min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.Bootstrap320,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.2.0", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBo.InitParam.ToolKit set to FoBo.Bootstrap320 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowInitParam(FoBo.Bootstrap320,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.2.0/js/bootstrap-min.js" in {
      rewriteInitParam(FoBo.Bootstrap320,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.2.0", "js", "bootstrap.min.js")
    }       
  }  
  
  //Bootstrap311
  "With FoBo.Resource.Init set to FoBo.Resource.Bootstrap311 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBo.Resource.Bootstrap311,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.1.1/js/bootstrap-min.js" in {
      rewriteResource(FoBo.Resource.Bootstrap311,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.1.1", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.Bootstrap311 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(FoBo.Toolkit.Bootstrap311,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.1.1/js/bootstrap-min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.Bootstrap311,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.1.1", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBo.InitParam.ToolKit set to FoBo.Bootstrap311 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowInitParam(FoBo.Bootstrap311,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.1.1/js/bootstrap-min.js" in {
      rewriteInitParam(FoBo.Bootstrap311,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.1.1", "js", "bootstrap.min.js")
    }       
  }    
  
  //Bootstrap301
  "With FoBo.Resource.Init set to FoBo.Resource.Bootstrap301 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBo.Resource.Bootstrap301,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.0.1/js/bootstrap-min.js" in {
      rewriteResource(FoBo.Resource.Bootstrap301,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.0.1", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.Bootstrap301 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(FoBo.Toolkit.Bootstrap301,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.0.1/js/bootstrap-min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.Bootstrap301,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.0.1", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBo.InitParam.ToolKit set to FoBo.Bootstrap301 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowInitParam(FoBo.Bootstrap301,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.0.1/js/bootstrap-min.js" in {
      rewriteInitParam(FoBo.Bootstrap301,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.0.1", "js", "bootstrap.min.js")
    }       
  } 
  
  //Bootstrap232
  "With FoBo.Resource.Init set to FoBo.Resource.Bootstrap232 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBo.Resource.Bootstrap232,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.3.2/js/bootstrap-min.js" in {
      rewriteResource(FoBo.Resource.Bootstrap232,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "2.3.2", "js", "bootstrap-min.js")
    }       
  }
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.Bootstrap232 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(FoBo.Toolkit.Bootstrap232,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.3.2/js/bootstrap-min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.Bootstrap232,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "2.3.2", "js", "bootstrap-min.js")
    }       
  }
  
  "With FoBo.InitParam.ToolKit set to FoBo.Bootstrap232 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowInitParam(FoBo.Bootstrap232,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.3.2/js/bootstrap-min.js" in {
      rewriteInitParam(FoBo.Bootstrap232,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "2.3.2", "js", "bootstrap-min.js")
    }       
  } 
  
  /*=================JQuery and JQuery Migrate ====================================*/

  //JQuery300
  "With FoBo.Resource.Init set to FoBo.Resource.JQuery300 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBo.Resource.JQuery300,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/3.0.0/js/jquery-min.js" in {
      rewriteResource(FoBo.Resource.JQuery300,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "3.0.0", "js", "jquery-min.js")
    }        
  }   
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.JQuery300 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(FoBo.Toolkit.JQuery300,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/3.0.0/js/jquery-min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.JQuery300,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "3.0.0", "js", "jquery-min.js")
    }        
  }
  
  //JQuery224
  "With FoBo.Resource.Init set to FoBo.Resource.JQuery224 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBo.Resource.JQuery224,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/2.2.4/js/jquery-min.js" in {
      rewriteResource(FoBo.Resource.JQuery224,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "2.2.4", "js", "jquery-min.js")
    }        
  }   
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.JQuery224 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(FoBo.Toolkit.JQuery224,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/2.2.4/js/jquery-min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.JQuery224,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "2.2.4", "js", "jquery-min.js")
    }        
  } 
  
  //JQueryMigrate141
  "With FoBo.Resource.Init set to FoBo.Resource.JQueryMigrate141 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowResource(FoBo.Resource.JQueryMigrate141,"fobo"::"jquery-migrate.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.4.1/js/jquery-migrate-min.js" in {
      rewriteResource(FoBo.Resource.JQueryMigrate141,"fobo"::"jquery-migrate.js"::Nil) must_== 
        List("jquery-migrate", "1.4.1", "js", "jquery-migrate-min.js")
    }        
  }
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.JQueryMigrate141 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowToolkitInit(FoBo.Toolkit.JQueryMigrate141,"fobo"::"jquery-migrate.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.4.1/js/jquery-migrate-min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.JQueryMigrate141,"fobo"::"jquery-migrate.js"::Nil) must_== 
        List("jquery-migrate", "1.4.1", "js", "jquery-migrate-min.js")
    }        
  } 
    
  //JQueryMigrate121
  "With FoBo.Resource.Init set to FoBo.Resource.JQueryMigrate121 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowResource(FoBo.Resource.JQueryMigrate121,"fobo"::"jquery-migrate.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.2.1/js/jquery-migrate-min.js" in {
      rewriteResource(FoBo.Resource.JQueryMigrate121,"fobo"::"jquery-migrate.js"::Nil) must_== 
        List("jquery-migrate", "1.2.1", "js", "jquery-migrate-min.js")
    }        
  }
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.JQueryMigrate121 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowToolkitInit(FoBo.Toolkit.JQueryMigrate121,"fobo"::"jquery-migrate.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.2.1/js/jquery-migrate-min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.JQueryMigrate121,"fobo"::"jquery-migrate.js"::Nil) must_== 
        List("jquery-migrate", "1.2.1", "js", "jquery-migrate-min.js")
    }        
  }  
  
  "With FoBo.InitParam.ToolKit set to FoBo.JQueryMigrate121 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowJQInitParam(FoBo.JQueryMigrate121,"fobo"::"jquery-migrate.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.2.1/js/jquery-migrate-min.js" in {
      rewriteJQInitParam(FoBo.JQueryMigrate121,"fobo"::"jquery-migrate.js"::Nil) must_== 
        List("jquery-migrate", "1.2.1", "js", "jquery-migrate-min.js")
    }        
  }  
  
  //JQuery214
  "With FoBo.Resource.Init set to FoBo.Resource.JQuery214 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBo.Resource.JQuery214,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/2.1.4/js/jquery-min.js" in {
      rewriteResource(FoBo.Resource.JQuery214,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "2.1.4", "js", "jquery-min.js")
    }        
  }   
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.JQuery214 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(FoBo.Toolkit.JQuery214,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/2.1.4/js/jquery-min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.JQuery214,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "2.1.4", "js", "jquery-min.js")
    }        
  }  
  
  "With FoBo.InitParam.ToolKit set to FoBo.JQuery214 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowJQInitParam(FoBo.JQuery214,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/2.1.4/js/jquery-min.js" in {
      rewriteJQInitParam(FoBo.JQuery214,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "2.1.4", "js", "jquery-min.js")
    }        
  }   
  
  //JQuery211
  "With FoBo.Resource.Init set to FoBo.Resource.JQuery211 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBo.Resource.JQuery211,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/2.1.1/js/jquery-min.js" in {
      rewriteResource(FoBo.Resource.JQuery211,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "2.1.1", "js", "jquery-min.js")
    }        
  }  
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.JQuery211 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(FoBo.Toolkit.JQuery211,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/2.1.1/js/jquery-min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.JQuery211,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "2.1.1", "js", "jquery-min.js")
    }        
  }  
  
  "With FoBo.InitParam.ToolKit set to FoBo.JQuery211 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowJQInitParam(FoBo.JQuery211,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/2.1.1/js/jquery-min.js" in {
      rewriteJQInitParam(FoBo.JQuery211,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "2.1.1", "js", "jquery-min.js")
    }        
  }    
  
  //JQuery1113
  "With FoBo.Resource.Init set to FoBo.Resource.JQuery1113 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBo.Resource.JQuery1113,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/1.11.3/js/jquery-min.js" in {
      rewriteResource(FoBo.Resource.JQuery1113,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.11.3", "js", "jquery-min.js")
    }        
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.JQuery1113 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(FoBo.Toolkit.JQuery1113,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/1.11.3/js/jquery-min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.JQuery1113,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.11.3", "js", "jquery-min.js")
    }        
  }  
  
  "With FoBo.InitParam.ToolKit set to FoBo.JQuery1113 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowJQInitParam(FoBo.JQuery1113,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/1.11.3/js/jquery-min.js" in {
      rewriteJQInitParam(FoBo.JQuery1113,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.11.3", "js", "jquery-min.js")
    }        
  }   
  
  //JQuery1102
  "With FoBo.Resource.Init set to FoBo.Resource.JQuery1102 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBo.Resource.JQuery1102,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/1.10.2/js/jquery-min.js" in {
      rewriteResource(FoBo.Resource.JQuery1102,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.10.2", "js", "jquery-min.js")
    }        
  }  
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.JQuery1102 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(FoBo.Toolkit.JQuery1102,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/1.10.2/js/jquery-min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.JQuery1102,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.10.2", "js", "jquery-min.js")
    }        
  }  
  
  "With FoBo.InitParam.ToolKit set to FoBo.JQuery1102 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowJQInitParam(FoBo.JQuery1102,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/1.10.2/js/jquery-min.js" in {
      rewriteJQInitParam(FoBo.JQuery1102,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.10.2", "js", "jquery-min.js")
    }        
  }   
   
  //JQuery182
  "With FoBo.Resource.Init set to FoBo.Resource.JQuery182 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBo.Resource.JQuery182,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/1.8.2/js/jquery-min.js" in {
      rewriteResource(FoBo.Resource.JQuery182,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.8.2", "js", "jquery-min.js")
    }        
  }  
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.JQuery182 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(FoBo.Toolkit.JQuery182,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/1.8.2/js/jquery-min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.JQuery182,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.8.2", "js", "jquery-min.js")
    }        
  }  
  
  "With FoBo.InitParam.ToolKit set to FoBo.JQuery182 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowJQInitParam(FoBo.JQuery182,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/1.8.2/js/jquery-min.js" in {
      rewriteJQInitParam(FoBo.JQuery182,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.8.2", "js", "jquery-min.js")
    }        
  }   
  
  //JQuery191
  "With FoBo.Resource.Init set to FoBo.Resource.JQuery191 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBo.Resource.JQuery191,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/1.9.1/js/jquery-min.js" in {
      rewriteResource(FoBo.Resource.JQuery191,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.9.1", "js", "jquery-min.js")
    }        
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.JQuery191 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(FoBo.Toolkit.JQuery191,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/1.9.1/js/jquery-min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.JQuery191,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.9.1", "js", "jquery-min.js")
    }        
  }  
  
  "With FoBo.InitParam.ToolKit set to FoBo.JQuery191 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowJQInitParam(FoBo.JQuery191,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/1.9.1/js/jquery-min.js" in {
      rewriteJQInitParam(FoBo.JQuery191,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.9.1", "js", "jquery-min.js")
    }        
  }  
  
  //JQuery172
  "With FoBo.Resource.Init set to FoBo.Resource.JQuery172 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBo.Resource.JQuery172,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/1.7.2/js/jquery-min.js" in {
      rewriteResource(FoBo.Resource.JQuery172,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.7.2", "js", "jquery-min.js")
    }        
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.JQuery172 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(FoBo.Toolkit.JQuery172,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/1.7.2/js/jquery-min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.JQuery172,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.7.2", "js", "jquery-min.js")
    }        
  }  
  
  "With FoBo.InitParam.ToolKit set to FoBo.JQuery172 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowJQInitParam(FoBo.JQuery172,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/1.7.2/js/jquery-min.js" in {
      rewriteJQInitParam(FoBo.JQuery172,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.7.2", "js", "jquery-min.js")
    }        
  }     
  
  /*================= KineticJS ====================================*/
  
 //KineticJS510
  "With FoBo.InitParam.Toolkit set to FoBo.KineticJS510 the ResourceServer" should {
    "allow  fobo/kinetic.js" in {
      allowInitParam(FoBo.KineticJS510,"fobo"::"kinetic.js"::Nil) must_== true 
    } 
    "rewrit fobo/kinetic.js to fobo/kinetic/5.1.0/js/kineti.min.js" in {
      rewriteInitParam(FoBo.KineticJS510,"fobo"::"kinetic.js"::Nil) must_== 
        List("fobo", "kinetic", "5.1.0", "js", "kinetic.min.js")
    }       
  } 
  
  "With FoBo.Toolkit.Init set to FoBo.Toolkit.KineticJS510 the ResourceServer" should {
    "allow  fobo/kinetic.js" in {
      allowToolkitInit(FoBo.Toolkit.KineticJS510,"fobo"::"kinetic.js"::Nil) must_== true 
    } 
    "rewrit fobo/kinetic.js to fobo/kinetic/5.1.0/js/kineti.min.js" in {
      rewriteToolkitInit(FoBo.Toolkit.KineticJS510,"fobo"::"kinetic.js"::Nil) must_== 
        List("fobo", "kinetic", "5.1.0", "js", "kinetic.min.js")
    }       
  }
  
  "With FoBo.Resource.Init set to FoBo.Resource.KineticJS510 the ResourceServer" should {
    "allow  fobo/kinetic.js" in {
      allowResource(FoBo.Resource.KineticJS510,"fobo"::"kinetic.js"::Nil) must_== true 
    } 
    "rewrit fobo/kinetic.js to fobo/kinetic/5.1.0/js/kineti.min.js" in {
      rewriteResource(FoBo.Resource.KineticJS510,"fobo"::"kinetic.js"::Nil) must_== 
        List("fobo", "kinetic", "5.1.0", "js", "kinetic.min.js")
    }       
  }     
  
  /*===Highlight ===============================================================*/ 
  
  //HighlightJS930
  "With FoBo.Toolkit.Init set to FoBoHLRes.Toolkit.HighlightJS930 the ResourceServer" should {
    "allow  fobo/highlight/highlight.pack.js" in {
      allowToolkitInit(FoBo.Toolkit.HighlightJS930,"fobo"::"highlight"::"highlight.pack.js"::Nil) must_== true 
    }     
    "rewrit rewrit fobo/highlight/highlight.pack.js to fobo/highlight/9.3.0/js/highlight.pack.js" in {
      rewriteToolkitInit(FoBo.Toolkit.HighlightJS930,"fobo"::"highlight"::"highlight.pack.js"::Nil) must_== 
        List("fobo", "highlight", "9.3.0", "js", "highlight.pack.js")
    }        
  } 
  
  "With FoBo.Resource.Init set to FoBo.Resource.HighlightJS930 the ResourceServer" should {
    "allow  fobo/highlight/highlight.pack.js" in {
      allowResource(FoBo.Resource.HighlightJS930,"fobo"::"highlight"::"highlight.pack.js"::Nil) must_== true 
    }     
    "rewrit rewrit fobo/highlight/highlight.pack.js to fobo/highlight/9.3.0/js/highlight.pack.js" in {
      rewriteResource(FoBo.Resource.HighlightJS930,"fobo"::"highlight"::"highlight.pack.js"::Nil) must_== 
        List("fobo", "highlight", "9.3.0", "js", "highlight.pack.js")
    }        
  }     
  
 //=== Toolkit.Init ==============//
  def allowToolkitInit(resource:FoBo.Toolkit,path:List[String]) = {
    FoBo.Toolkit.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteToolkitInit(resource:FoBo.Toolkit,path:List[String]) = {
    FoBo.Toolkit.Init=resource 
    ResourceServer.pathRewriter(path)
  }  
  
  //=== Resource.Init ===============//
  def allowResource(resource:FoBo.Resource,path:List[String]) = {
    FoBo.Resource.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteResource(resource:FoBo.Resource,path:List[String]) = {
    FoBo.Resource.Init=resource 
    ResourceServer.pathRewriter(path)
  } 
  
 //=== InitParam.ToolKit (deprecated in v1.6) ===============// 
  def allowInitParam(resource:FoBo.FoBoToolkit,path:List[String]) = {
    FoBo.InitParam.ToolKit=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteInitParam(resource:FoBo.FoBoToolkit,path:List[String]) = {
    FoBo.InitParam.ToolKit=resource 
    ResourceServer.pathRewriter(path)
  } 
  
  def allowJQInitParam(resource:FoBo.FoBoJQuery,path:List[String]) = {
    FoBo.InitParam.JQuery=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteJQInitParam(resource:FoBo.FoBoJQuery,path:List[String]) = {
    FoBo.InitParam.JQuery=resource 
    ResourceServer.pathRewriter(path)
  }   
  
   
}


