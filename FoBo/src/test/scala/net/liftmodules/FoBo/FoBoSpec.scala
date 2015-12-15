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
  "With FoBo.InitParam.ToolKit set to FoBo.AngularJS148 the ResourceServer.pathRewriter" should {
    "rewrit fobo/angular.js to fobo/angular-js/1.4.8/js/angular.min.js" in {
      rewriteAngularJS148 must_== List("fobo", "angular-js", "1.4.8", "js", "angular.min.js")
    }       
  }
  
  "With FoBo.InitParam.ToolKit set to FoBo.AngularJS141 the ResourceServer.pathRewriter" should {
    "rewrit fobo/angular.js to fobo/angular-js/1.4.1/js/angular.min.js" in {
      rewriteAngularJS141 must_== List("fobo", "angular-js", "1.4.1", "js", "angular.min.js")
    }       
  }  
  
  "With FoBo.InitParam.ToolKit set to FoBo.AJSUIBootstrap0100 the ResourceServer.pathRewriter" should {
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.10.0/js/ui-bootstrap-0.10.0.min.js" in {
      rewriteAJSUIBootstrap0100 must_== List("fobo", "angular-ui", "bootstrap", "0.10.0", "js", "ui-bootstrap-0.10.0.min.js")
    }       
  }   
 
  "With FoBo.InitParam.ToolKit set to FoBo.AJSNGGrid207 the ResourceServer.pathRewriter" should {
    "rewrit fobo/ng-grid.js to fobo/angular-ui/ng-grid/2.0.7/ng-grid-2.0.7.min.js" in {
      rewriteAJSNGGrid207 must_== List("fobo", "angular-ui","ng-grid", "2.0.7", "js", "ng-grid-2.0.7.min.js")
    }       
  } 
  
  //Angular Material
  "With FoBo.InitParam.ToolKit set to FoBo.AJMaterial100 the ResourceServer.pathRewriter" should {
    "rewrit fobo/angular-material.js to fobo/angular-material/1.0.0/js/angular-material.min.js" in {
      rewriteAJMaterial100JS must_== List("fobo", "angular-material", "1.0.0", "js", "angular-material.min.js")
    }      
    "rewrit fobo/angular-material.css to fobo/angular-material/1.0.0/js/angular-material.min.css" in {
      rewriteAJMaterial100CSS must_== List("fobo", "angular-material", "1.0.0", "css", "angular-material.min.css")
    }    
  }    
    
  //FontAwesome
  "With FoBo.InitParam.ToolKit set to FoBo.FontAwesome321 the ResourceServer.pathRewriter" should {
    "rewrit fobo/font-awesome.css to fobo/font-awesome/3.2.1/css/font-awesome.css" in {
      rewriteFontAwesome321CSS must_== List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-min.css")
    }       
  } 
  
  "With FoBo.InitParam.ToolKit set to FoBo.FontAwesome410 the ResourceServer.pathRewriter" should {
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.1.0/css/font-awesome.css" in {
      rewriteFontAwesome410CSS must_== List("fobo", "font-awesome", "4.1.0", "css", "font-awesome.min.css")
    }       
  }  
  
  "With FoBo.InitParam.ToolKit set to FoBo.FontAwesome410 the ResourceServer.pathRewriter" should {
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.1.0/css/font-awesome.css" in {
      rewriteFontAwesome430CSS must_== List("fobo", "font-awesome", "4.3.0", "css", "font-awesome.min.css")
    }       
  }   
   
  //google-code-prettify
  "With FoBo.InitParam.ToolKit set to FoBo.PrettifyJun2011 the ResourceServer.pathRewriter" should {
    "rewrit fobo/prettify.js to fobo/google-code/js/prettify.js" in {
      rewritePrettifyJun2011JS must_== List("fobo", "google-code", "js", "prettify.js")
    }       
  }  
    
  
  //Bootstrap
  "With FoBo.InitParam.ToolKit set to FoBo.Bootstrap232 the ResourceServer.pathRewriter" should {
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.3.2/js/bootstrap-min.js" in {
      rewriteBootstrap232JS must_== List("fobo", "bootstrap", "2.3.2", "js", "bootstrap-min.js")
    }       
  }
  
  "With FoBo.InitParam.ToolKit set to FoBo.Bootstrap320 the ResourceServer.pathRewriter" should {
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.2.0/js/bootstrap-min.js" in {
      rewriteBootstrap320JS must_== List("fobo", "bootstrap", "3.2.0", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBo.InitParam.ToolKit set to FoBo.Bootstrap336 the ResourceServer.pathRewriter" should {
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.6/js/bootstrap-min.js" in {
      rewriteBootstrap336JS must_== List("fobo", "bootstrap", "3.3.6", "js", "bootstrap.min.js")
    }       
  }  
  
  //Bootstrap336
  
  /////////////////////////////////////////////////////////////////////////////////////////////////////
 
  //JQuery and JQuery Migrate
  "With FoBo.InitParam.JQuery the ResourceServer.pathRewriter" should {

    "having the initparam set to FoBo.JQuery191 rewrit fobo/jquery.js to jquery/1.9.1/js/jquery-min.js" in  {
      rewriteJQuery191JS must_== List("jquery", "1.9.1", "js", "jquery-min.js") 
    }
    "having the initparam's set to FoBo.JQuery191 and FoBo.JQueryMigrate121 rewrit fobo/jquery.js to jquery/1.9.1/js/jquery-min.js" in  {
      rewriteJQuery191JSMigrate must_== List("jquery", "1.9.1", "js", "jquery-min.js") 
    }    
    "having the initparam's set to FoBo.JQuery191 and FoBo.JQueryMigrate121 rewrit fobo/jquery-migrate.js to jquery-migrate/1.2.1/js/jquery-migrate-min.js" in {
      rewriteJQueryMigrate121JS must_== List("jquery-migrate", "1.2.1", "js", "jquery-migrate-min.js") 
    }     
    "having the initparam set to FoBo.JQuery1102 rewrit fobo/jquery.js to jquery/1.10.2/js/jquery-min.js" in {
      rewriteJQuery1102JS must_== List("jquery", "1.10.2", "js", "jquery-min.js")
    }
    "having the initparam set to FoBo.JQuery214 rewrit fobo/jquery.js to jquery/2.1.4/js/jquery-min.js" in {
      rewriteJQuery214JS must_== List("jquery", "2.1.4", "js", "jquery-min.js")
    }    
  }   
  
  
  //Angular Material 
 def rewriteAJMaterial100JS = {
    FoBo.InitParam.ToolKit=FoBo.AJMaterial100
    ResourceServer.pathRewriter("fobo"::"angular-material.js"::Nil)
  }
 def rewriteAJMaterial100CSS = {
    FoBo.InitParam.ToolKit=FoBo.AJMaterial100
    ResourceServer.pathRewriter("fobo"::"angular-material.css"::Nil)
  }
 
  //AngularJS
  def rewriteAngularJS148 = {
    FoBo.InitParam.ToolKit=FoBo.AngularJS148
    ResourceServer.pathRewriter("fobo"::"angular.js"::Nil)
  } 
  
  def rewriteAngularJS141 = {
    FoBo.InitParam.ToolKit=FoBo.AngularJS141
    ResourceServer.pathRewriter("fobo"::"angular.js"::Nil)
  }   
  
  def rewriteAngularJS1315 = {
    FoBo.InitParam.ToolKit=FoBo.AngularJS1315
    ResourceServer.pathRewriter("fobo"::"angular.js"::Nil)
  }  
  
  def rewriteAJSUIBootstrap0100 = {
    FoBo.InitParam.ToolKit=FoBo.AJSUIBootstrap0100
    ResourceServer.pathRewriter("fobo"::"ui-bootstrap.js"::Nil)
  }   
  
  def rewriteAJSNGGrid207 = {
    FoBo.InitParam.ToolKit=FoBo.AJSNGGrid207
    ResourceServer.pathRewriter("fobo"::"ng-grid.js"::Nil)
  }    
   
  //JQuery Migrate
  def rewriteJQueryMigrate121JS = {
     //FoBo.InitParam.JQuery=FoBo.JQuery191
     FoBo.InitParam.JQuery=FoBo.JQueryMigrate121
     ResourceServer.pathRewriter("fobo"::"jquery-migrate.js"::Nil)  
  }  
  
  //JQuery
  def rewriteJQuery214JS = {
    FoBo.InitParam.JQuery=FoBo.JQuery214
    ResourceServer.pathRewriter("fobo"::"jquery.js"::Nil)
  } 
  
  def rewriteJQuery1102JS = {
    FoBo.InitParam.JQuery=FoBo.JQuery1102
    ResourceServer.pathRewriter("fobo"::"jquery.js"::Nil)
  } 
   
  def rewriteJQuery191JSMigrate =  {
    FoBo.InitParam.JQuery=FoBo.JQuery191
    FoBo.InitParam.JQuery=FoBo.JQueryMigrate121
    ResourceServer.pathRewriter("fobo"::"jquery.js"::Nil)
  } 
 
  def rewriteJQuery191JS =  {
    FoBo.InitParam.JQuery=FoBo.JQuery191
    ResourceServer.pathRewriter("fobo"::"jquery.js"::Nil)
  }   
  
  def rewriteJQuery182JS = {
    FoBo.InitParam.JQuery=FoBo.JQuery182
    ResourceServer.pathRewriter("fobo"::"jquery.js"::Nil)
  } 
  
  def rewriteJQuery172JS =  {
    FoBo.InitParam.JQuery=FoBo.JQuery172
    ResourceServer.pathRewriter("fobo"::"jquery.js"::Nil)
  }  
  
  
  ////FontAwesome
  def rewriteFontAwesome321CSS = {
    FoBo.InitParam.ToolKit=FoBo.FontAwesome321
    ResourceServer.pathRewriter("fobo"::"font-awesome.css"::Nil)
  }  
   
   def rewriteFontAwesome410CSS = {
    FoBo.InitParam.ToolKit=FoBo.FontAwesome410
    ResourceServer.pathRewriter("fobo"::"font-awesome.css"::Nil)
  }    

   def rewriteFontAwesome430CSS = {
    FoBo.InitParam.ToolKit=FoBo.FontAwesome430
    ResourceServer.pathRewriter("fobo"::"font-awesome.css"::Nil)
  }   
  
  //PrettifyJun2011
  def rewritePrettifyJun2011JS = {
    FoBo.InitParam.ToolKit=FoBo.PrettifyJun2011
    ResourceServer.pathRewriter("fobo"::"prettify.js"::Nil)
  }   
  
  //Bootstrap   
   def rewriteBootstrap232JS = {
    FoBo.InitParam.ToolKit=FoBo.Bootstrap232
    ResourceServer.pathRewriter("fobo"::"bootstrap.js"::Nil)
  } 
   
   def rewriteBootstrap320JS = {
    FoBo.InitParam.ToolKit=FoBo.Bootstrap320
    ResourceServer.pathRewriter("fobo"::"bootstrap.js"::Nil)
  }    
  
   def rewriteBootstrap336JS = {
    FoBo.InitParam.ToolKit=FoBo.Bootstrap336
    ResourceServer.pathRewriter("fobo"::"bootstrap.js"::Nil)
  }    
     
   
}


