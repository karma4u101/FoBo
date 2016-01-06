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
 
  
  //AngularJS
  "With FoBo.InitParam.ToolKit set to FoBo.AngularJS148 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowAngularJS148 must_== true 
    }   
    "rewrit fobo/angular.js to fobo/angular-js/1.4.8/js/angular.min.js" in {
      rewriteAngularJS148 must_== List("fobo", "angular-js", "1.4.8", "js", "angular.min.js")
    }       
  }
  
  "With FoBo.InitParam.ToolKit set to FoBo.AngularJS141 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowAngularJS141 must_== true 
    }     
    "rewrit fobo/angular.js to fobo/angular-js/1.4.1/js/angular.min.js" in {
      rewriteAngularJS141 must_== List("fobo", "angular-js", "1.4.1", "js", "angular.min.js")
    }       
  }  
  
  "With FoBo.InitParam.ToolKit set to FoBo.AJSUIBootstrap0100 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowAJSUIBootstrap0100 must_== true 
    }     
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.10.0/js/ui-bootstrap-0.10.0.min.js" in {
      rewriteAJSUIBootstrap0100 must_== List("fobo", "angular-ui", "bootstrap", "0.10.0", "js", "ui-bootstrap-0.10.0.min.js")
    }       
  }   
 
  "With FoBo.InitParam.ToolKit set to FoBo.AJSNGGrid207 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowAJSNGGrid207 must_== true 
    }    
    "rewrit fobo/ng-grid.js to fobo/angular-ui/ng-grid/2.0.7/ng-grid-2.0.7.min.js" in {
      rewriteAJSNGGrid207 must_== List("fobo", "angular-ui","ng-grid", "2.0.7", "js", "ng-grid-2.0.7.min.js")
    }       
  } 
  
  //Angular UI Grid
  "With FoBo.InitParam.ToolKit set to FoBo.AJSUIGrid307 the ResourceServer" should {
    "allow  fobo/angular.js" in {
      allowAJSUIGrid307 must_== true 
    }    
    "rewrit fobo/ui-grid.js to fobo/angular-ui/ui-grid/3.0.7/js/ui-grid.min.js" in {
      rewriteAJSUIGrid307Js must_== List("fobo", "angular-ui", "ui-grid", "3.0.7", "js", "ui-grid.min.js")
    }      
    "rewrit fobo/ui-grid.css to fobo/angular-ui/ui-grid/3.0.7/css/ui-grid.min.css" in {
      rewriteAJSUIGrid307Css must_== List("fobo", "angular-ui", "ui-grid", "3.0.7", "css", "ui-grid.min.css")
    }    
  }   
  
  //Angular Material
  "With FoBo.InitParam.ToolKit set to FoBo.AJMaterial101 the ResourceServer" should {
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
    
  "With FoBo.InitParam.ToolKit set to FoBo.AJMaterial0100 the ResourceServer" should {
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
  
  //FontAwesome
  "With FoBo.InitParam.ToolKit set to FoBo.FontAwesome321 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowFontAwesome321 must_== true 
    }    
    "rewrit fobo/font-awesome.css to fobo/font-awesome/3.2.1/css/font-awesome.css" in {
      rewriteFontAwesome321CSS must_== List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-min.css")
    }       
  } 
  
  "With FoBo.InitParam.ToolKit set to FoBo.FontAwesome410 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowFontAwesome410 must_== true 
    }     
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.1.0/css/font-awesome.css" in {
      rewriteFontAwesome410CSS must_== List("fobo", "font-awesome", "4.1.0", "css", "font-awesome.min.css")
    }       
  }  
  
  "With FoBo.InitParam.ToolKit set to FoBo.FontAwesome410 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowFontAwesome430 must_== true 
    }     
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.1.0/css/font-awesome.css" in {
      rewriteFontAwesome430CSS must_== List("fobo", "font-awesome", "4.3.0", "css", "font-awesome.min.css")
    }       
  }   
   
  //google-code-prettify
  "With FoBo.InitParam.ToolKit set to FoBo.PrettifyJun2011 the ResourceServer" should {
    "allow  fobo/prettify.js" in {
      allowPrettifyJun2011 must_== true 
    }     
    "rewrit fobo/prettify.js to fobo/google-code/js/prettify.js" in {
      rewritePrettifyJun2011JS must_== List("fobo", "google-code", "js", "prettify.js")
    }       
  }  
    
  //Pace
  "With FoBo.InitParam.ToolKit set to FoBo.Pace0415 the ResourceServer" should {
    "allow  fobo/pace.js" in {
      allowPace0415 must_== true 
    }     
    "rewrit fobo/pace.js to fobo/pace/0.4.15/js/pace.min.js" in {
      rewritePace0415JS must_== List("fobo", "pace", "0.4.15", "js", "pace.min.js")
    }       
  }  
  
  //Bootstrap
  "With FoBo.InitParam.ToolKit set to FoBo.Bootstrap232 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowBootstrap232 must_== true 
    }     
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.3.2/js/bootstrap-min.js" in {
      rewriteBootstrap232JS must_== List("fobo", "bootstrap", "2.3.2", "js", "bootstrap-min.js")
    }       
  }
  
  "With FoBo.InitParam.ToolKit set to FoBo.Bootstrap320 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowBootstrap320 must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.2.0/js/bootstrap-min.js" in {
      rewriteBootstrap320JS must_== List("fobo", "bootstrap", "3.2.0", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBo.InitParam.ToolKit set to FoBo.Bootstrap336 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowBootstrap336 must_== true 
    }
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.6/js/bootstrap-min.js" in {
      rewriteBootstrap336JS must_== List("fobo", "bootstrap", "3.3.6", "js", "bootstrap.min.js")
    }       
  }  
  
  /////////////////////////////////////////////////////////////////////////////////////////////////////
 
  //JQuery and JQuery Migrate
  "With FoBo.InitParam.JQuery set to FoBo.JQuery191 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowJQuery191 must_== true 
    }
    "rewrit fobo/jquery.js to jquery/1.9.1/js/jquery-min.js" in  {
      rewriteJQuery191JS must_== List("jquery", "1.9.1", "js", "jquery-min.js") 
    } 
  } 
  
  "With FoBo.InitParam.JQuery set to FoBo.JQueryMigrate121 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowJQueryMigrate121 must_== true 
    }
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.2.1/js/jquery-migrate-min.js" in {
      rewriteJQueryMigrate121JS must_== List("jquery-migrate", "1.2.1", "js", "jquery-migrate-min.js") 
    }        
  }
  
  "With FoBo.InitParam.JQuery set to FoBo.JQuery1102 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowJQuery1102 must_== true 
    } 
    "rewrit fobo/jquery.js to jquery/1.10.2/js/jquery-min.js" in {
      rewriteJQuery1102JS must_== List("jquery", "1.10.2", "js", "jquery-min.js")
    }  
  }  
  
  "With FoBo.InitParam.JQuery set to FoBo.JQuery214 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowJQuery214 must_== true 
    } 
    "rewrit fobo/jquery.js to jquery/2.1.4/js/jquery-min.js" in {
      rewriteJQuery214JS must_== List("jquery", "2.1.4", "js", "jquery-min.js")
    }    
  }   
  
  //Kinetic
  "With FoBo.InitParam.ToolKit set to FoBo.KineticJS510 the ResourceServer" should {
    "allow  fobo/kinetic.js" in {
      allowKineticJS510 must_== true 
    }     
    "rewrit fobo/kinetic.js to fobo/kinetic/5.1.0/js/kinetic.js" in {
      rewriteKineticJS510 must_== List("fobo", "kinetic", "5.1.0", "js", "kinetic.min.js")
    }       
  } 
  
  //Angular Material 
  def allowAJMaterial101 = {
    ResourceServer
    FoBo.InitParam.ToolKit=FoBo.AJMaterial101
    ResourceServer.allowedPaths("fobo"::"angular-material.js"::Nil)
  }  
  def rewriteAJMaterial101JS = {
    FoBo.InitParam.ToolKit=FoBo.AJMaterial101
    ResourceServer.pathRewriter("fobo"::"angular-material.js"::Nil)
  }
  def rewriteAJMaterial101CSS = {
    FoBo.InitParam.ToolKit=FoBo.AJMaterial101
    ResourceServer.pathRewriter("fobo"::"angular-material.css"::Nil)
  }
 
 def allowAJMaterial0100 = {
    ResourceServer
    FoBo.InitParam.ToolKit=FoBo.AJMaterial0100
    ResourceServer.allowedPaths("fobo"::"angular-material.js"::Nil)
  }  
  
  def rewriteAJMaterial0100JS = {
    ResourceServer
    FoBo.InitParam.ToolKit=FoBo.AJMaterial0100
    ResourceServer.pathRewriter("fobo"::"angular-material.js"::Nil)
  }
  
  def rewriteAJMaterial0100CSS = {
    ResourceServer
    FoBo.InitParam.ToolKit=FoBo.AJMaterial0100
    ResourceServer.pathRewriter("fobo"::"angular-material.css"::Nil)
  }    
  //Angular UI Grid
  def allowAJSUIGrid307 = {
    ResourceServer
    FoBo.InitParam.ToolKit=FoBo.AJSUIGrid307
    ResourceServer.allowedPaths("fobo"::"ui-grid.js"::Nil)
  }  
  def rewriteAJSUIGrid307Js = {
    FoBo.InitParam.ToolKit=FoBo.AJSUIGrid307
    ResourceServer.pathRewriter("fobo"::"ui-grid.js"::Nil)
  }  
  def rewriteAJSUIGrid307Css = {
    FoBo.InitParam.ToolKit=FoBo.AJSUIGrid307
    ResourceServer.pathRewriter("fobo"::"ui-grid.css"::Nil)
  } 
  
  //AngularJS
  def allowAngularJS148 = {
    ResourceServer 
    FoBo.InitParam.ToolKit=FoBo.AngularJS148
    ResourceServer.allowedPaths("fobo"::"angular.js"::Nil)
  }
  def rewriteAngularJS148 = {
    ResourceServer 
    FoBo.InitParam.ToolKit=FoBo.AngularJS148
    ResourceServer.pathRewriter("fobo"::"angular.js"::Nil)
  } 
  
  def allowAngularJS141 = {
    ResourceServer 
    FoBo.InitParam.ToolKit=FoBo.AngularJS141
    ResourceServer.allowedPaths("fobo"::"angular.js"::Nil)
  }  
  def rewriteAngularJS141 = {
    FoBo.InitParam.ToolKit=FoBo.AngularJS141
    ResourceServer.pathRewriter("fobo"::"angular.js"::Nil)
  }   
  
  def allowAngularJS1315 = {
    ResourceServer 
    FoBo.InitParam.ToolKit=FoBo.AngularJS1315
    ResourceServer.allowedPaths("fobo"::"angular.js"::Nil)
  }  
  def rewriteAngularJS1315 = {
    FoBo.InitParam.ToolKit=FoBo.AngularJS1315
    ResourceServer.pathRewriter("fobo"::"angular.js"::Nil)
  }  
  
  def allowAJSUIBootstrap0100 = {
    ResourceServer 
    FoBo.InitParam.ToolKit=FoBo.AJSUIBootstrap0100
    ResourceServer.allowedPaths("fobo"::"ui-bootstrap.js"::Nil)
  }   
  def rewriteAJSUIBootstrap0100 = {
    FoBo.InitParam.ToolKit=FoBo.AJSUIBootstrap0100
    ResourceServer.pathRewriter("fobo"::"ui-bootstrap.js"::Nil)
  }   
  
  def allowAJSNGGrid207 = {
    ResourceServer 
    FoBo.InitParam.ToolKit=FoBo.AJSNGGrid207
    ResourceServer.allowedPaths("fobo"::"ng-grid.js"::Nil)
  }  
  def rewriteAJSNGGrid207 = {
    FoBo.InitParam.ToolKit=FoBo.AJSNGGrid207
    ResourceServer.pathRewriter("fobo"::"ng-grid.js"::Nil)
  }    
   
  //JQuery Migrate
  def allowJQueryMigrate121 = {
    ResourceServer 
    FoBo.InitParam.JQuery=FoBo.JQueryMigrate121
    ResourceServer.allowedPaths("fobo"::"jquery-migrate.js"::Nil)
  }   
  def rewriteJQueryMigrate121JS = {
     FoBo.InitParam.JQuery=FoBo.JQueryMigrate121
     ResourceServer.pathRewriter("fobo"::"jquery-migrate.js"::Nil)  
  }  
  
  //JQuery
  def allowJQuery214 = {
    ResourceServer 
    FoBo.InitParam.JQuery=FoBo.JQuery214
    ResourceServer.allowedPaths("fobo"::"jquery.js"::Nil)
  }  
  def rewriteJQuery214JS = {
    FoBo.InitParam.JQuery=FoBo.JQuery214
    ResourceServer.pathRewriter("fobo"::"jquery.js"::Nil)
  } 
  
  def allowJQuery1102 = {
    ResourceServer 
    FoBo.InitParam.JQuery=FoBo.JQuery1102
    ResourceServer.allowedPaths("fobo"::"jquery.js"::Nil)
  }  
  def rewriteJQuery1102JS = {
    FoBo.InitParam.JQuery=FoBo.JQuery1102
    ResourceServer.pathRewriter("fobo"::"jquery.js"::Nil)
  } 
  
  def allowJQuery191 = {
    ResourceServer 
    FoBo.InitParam.JQuery=FoBo.JQuery191
    ResourceServer.allowedPaths("fobo"::"jquery.js"::Nil)
  }  
  def rewriteJQuery191JS =  {
    FoBo.InitParam.JQuery=FoBo.JQuery191
    ResourceServer.pathRewriter("fobo"::"jquery.js"::Nil)
  }   
  
  def allowJQuery182 = {
    ResourceServer 
    FoBo.InitParam.JQuery=FoBo.JQuery182
    ResourceServer.allowedPaths("fobo"::"jquery.js"::Nil)
  }  
  def rewriteJQuery182JS = {
    FoBo.InitParam.JQuery=FoBo.JQuery182
    ResourceServer.pathRewriter("fobo"::"jquery.js"::Nil)
  } 
  
  def allowJQuery172 = {
    ResourceServer 
    FoBo.InitParam.JQuery=FoBo.JQuery172
    ResourceServer.allowedPaths("fobo"::"jquery.js"::Nil)
  }  
  def rewriteJQuery172JS =  {
    FoBo.InitParam.JQuery=FoBo.JQuery172
    ResourceServer.pathRewriter("fobo"::"jquery.js"::Nil)
  }  
    
  ////FontAwesome
  def allowFontAwesome321 = {
    ResourceServer 
    FoBo.InitParam.ToolKit=FoBo.FontAwesome321
    ResourceServer.allowedPaths("fobo"::"font-awesome.css"::Nil)
  }    
  def rewriteFontAwesome321CSS = {
    FoBo.InitParam.ToolKit=FoBo.FontAwesome321
    ResourceServer.pathRewriter("fobo"::"font-awesome.css"::Nil)
  }  
   
  def allowFontAwesome410 = {
    ResourceServer 
    FoBo.InitParam.ToolKit=FoBo.FontAwesome410
    ResourceServer.allowedPaths("fobo"::"font-awesome.css"::Nil)
  }  
  def rewriteFontAwesome410CSS = {
    FoBo.InitParam.ToolKit=FoBo.FontAwesome410
    ResourceServer.pathRewriter("fobo"::"font-awesome.css"::Nil)
  }    

  def allowFontAwesome430 = {
    ResourceServer 
    FoBo.InitParam.ToolKit=FoBo.FontAwesome430
    ResourceServer.allowedPaths("fobo"::"font-awesome.css"::Nil)
  }  
  def rewriteFontAwesome430CSS = {
    FoBo.InitParam.ToolKit=FoBo.FontAwesome430
    ResourceServer.pathRewriter("fobo"::"font-awesome.css"::Nil)
  }   
  
  //PrettifyJun2011
  def allowPrettifyJun2011 = {
    ResourceServer 
    FoBo.InitParam.ToolKit=FoBo.PrettifyJun2011
    ResourceServer.allowedPaths("fobo"::"prettify.js"::Nil)
  }   
  def rewritePrettifyJun2011JS = {
    FoBo.InitParam.ToolKit=FoBo.PrettifyJun2011
    ResourceServer.pathRewriter("fobo"::"prettify.js"::Nil)
  }   
  //Pace
  def allowPace0415 = {
    ResourceServer 
    FoBo.InitParam.ToolKit=FoBo.Pace0415
    ResourceServer.allowedPaths("fobo"::"pace.js"::Nil)
  }   
  def rewritePace0415JS = {
    FoBo.InitParam.ToolKit=FoBo.Pace0415
    ResourceServer.pathRewriter("fobo"::"pace.js"::Nil)
  }
  
  //Kinetic
  def allowKineticJS510 = {
    ResourceServer
    FoBo.InitParam.ToolKit=FoBo.KineticJS510
    ResourceServer.allowedPaths("fobo"::"kinetic.js"::Nil)
  }  
  def rewriteKineticJS510 = {
    FoBo.InitParam.ToolKit=FoBo.KineticJS510
    ResourceServer.pathRewriter("fobo"::"kinetic.js"::Nil)
  }
  
  //Bootstrap 
  def allowBootstrap232 = {
    ResourceServer 
    FoBo.InitParam.ToolKit=FoBo.Bootstrap232
    ResourceServer.allowedPaths("fobo"::"bootstrap.js"::Nil)
  }  
  def rewriteBootstrap232JS = {
    FoBo.InitParam.ToolKit=FoBo.Bootstrap232
    ResourceServer.pathRewriter("fobo"::"bootstrap.js"::Nil)
  } 
   
  def allowBootstrap320 = {
    ResourceServer 
    FoBo.InitParam.ToolKit=FoBo.Bootstrap320
    ResourceServer.allowedPaths("fobo"::"bootstrap.js"::Nil)
  }  
  def rewriteBootstrap320JS = {
    FoBo.InitParam.ToolKit=FoBo.Bootstrap320
    ResourceServer.pathRewriter("fobo"::"bootstrap.js"::Nil)
  }    
    
  def allowBootstrap336 = {
    ResourceServer //.apply() make sure it is a fresh resource server ?? or we need to find a way to get one
    FoBo.InitParam.ToolKit=FoBo.Bootstrap336
    ResourceServer.allowedPaths("fobo"::"bootstrap.js"::Nil)
  }
  def rewriteBootstrap336JS = {
    FoBo.InitParam.ToolKit=FoBo.Bootstrap336
    ResourceServer.pathRewriter("fobo"::"bootstrap.js"::Nil)
  }    
     
   
}


