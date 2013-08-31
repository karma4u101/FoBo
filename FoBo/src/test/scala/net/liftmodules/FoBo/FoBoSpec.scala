package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

object FoBoSpec extends Specification  {
  "FoBoSpec Specification".title

  //These tests in not meant to catch all errors but to making sure that the 
  //FoBo InitParam's has got initiated as expected, for instance to ensure that 
  //fobo sub modules is accessible. 
  
  //OBS! using 'test-only' instead of 'test' will fail some test as 'test-only' 
  //is treated as code is run in "devMode" while 'test' dose not assume this. 
  
  //AngularJS
  "With FoBo.InitParam.ToolKit set to FoBo.AngularJS106 the ResourceServer.pathRewriter" should {
    "rewrit fobo/angular.js to fobo/angular-js/1.0.6/js/angular.min.js" in {
      rewriteAngularJS106 must_== List("fobo", "angular-js", "1.0.6", "js", "angular.min.js")
    }       
  } 
  
  "With FoBo.InitParam.ToolKit set to FoBo.AJSUIBootstrap020 the ResourceServer.pathRewriter" should {
    "rewrit fobo/ui-bootstrap.js to fobo/angular-ui/bootstrap/0.2.0/js/ui-bootstrap-0.2.0.min.js" in {
      rewriteAJSUIBootstrap020 must_== List("fobo", "angular-ui", "bootstrap", "0.2.0", "js", "ui-bootstrap-0.2.0.min.js")
    }       
  }   
 
  "With FoBo.InitParam.ToolKit set to FoBo.AJSNGGrid204 the ResourceServer.pathRewriter" should {
    "rewrit fobo/ng-grid.js to fobo/angular-ui/0.2.0/js/ng-grid-2.0.4.min.js" in {
      rewriteAJSNGGrid204 must_== List("fobo", "angular-ui","ng-grid", "2.0.4", "js", "ng-grid-2.0.4.min.js")
    }       
  } 
  
  //Knockout
  "With FoBo.InitParam.ToolKit set to FoBo.Knockout200 the ResourceServer.pathRewriter" should {
    "rewrit fobo/knockout.js to fobo/knockout/2.0.0/js/knockout-2.0.0.js" in {
      rewriteKnockout200JS must_== List("fobo", "knockout", "2.0.0", "js", "knockout-2.0.0.js")
    }       
  } 
  
  "With FoBo.InitParam.ToolKit set to FoBo.Knockout210 the ResourceServer.pathRewriter" should {
    "rewrit fobo/knockout.js to fobo/knockout/2.1.0/js/knockout-2.1.0.js" in {
      rewriteKnockout210JS must_== List("fobo", "knockout", "2.1.0", "js", "knockout-2.1.0.js")
    }       
  }  
  
  "With FoBo.InitParam.ToolKit set to FoBo.Knockout221 the ResourceServer.pathRewriter" should {
    "rewrit fobo/knockout.js to fobo/knockout/2.2.1/js/knockout-2.2.1.js" in {
      rewriteKnockout221JS must_== List("fobo", "knockout", "2.2.1", "js", "knockout-2.2.1.js")
    }       
  }    
  
  //JQuery
     "With FoBo.InitParam.JQuery set to FoBo.JQuery1102 the ResourceServer.pathRewriter" should {
    "rewrit fobo/jquery.js to jquery/1.10.2/js/jquery-min.js" in {
      rewriteJQuery1102JS must_== List("jquery", "1.10.2", "js", "jquery-min.js")
    }                             
  }
   /*  
   "With FoBo.InitParam.JQuery set to FoBo.JQuery191 the ResourceServer.pathRewriter" should {
    "rewrit fobo/jquery.js to jquery/1.9.1/js/jquery-min.js" in {
      rewriteJQuery191JS must_== List("jquery", "1.9.1", "js", "jquery-min.js")
    }                             
  }
   
  "With FoBo.InitParam.JQuery set to FoBo.JQuery182 the ResourceServer.pathRewriter" should {
    "rewrit fobo/jquery.js to jquery/1.8.2/js/jquery-min.js" in {
      rewriteJQuery182JS must_== List("jquery", "1.8.2", "js", "jquery-min.js")
    }                             
  } 
  
  "With FoBo.InitParam.JQuery set to FoBo.JQuery172 the ResourceServer.pathRewriter" should {
    "rewrit fobo/jquery.js to jquery/1.7.2/js/jquery-min.js" in {
      rewriteJQuery172JS must_== List("jquery", "1.7.2", "js", "jquery-min.js")
    }       
  }   
  */
  
  //DataTables
  "With FoBo.InitParam.ToolKit set to FoBo.DataTables190 the ResourceServer.pathRewriter" should {
    "rewrit fobo/jquery.dataTables.js to fobo/knockout/1.9.0/js/jquery.dataTables.js" in {
      rewriteDataTables190JS must_== List("fobo", "datatables", "1.9.0", "js", "jquery.dataTables.js")
    }       
  }  
  
  
  //FontAwesome
  "With FoBo.InitParam.ToolKit set to FoBo.FontAwesome200 the ResourceServer.pathRewriter" should {
    "rewrit fobo/font-awesome.css to fobo/font-awesome/2.0.0/css/font-awesome.css" in {
      rewriteFontAwesome200CSS must_== List("fobo", "font-awesome", "2.0.0", "css", "font-awesome-min.css")
    }       
  }  
  
  "With FoBo.InitParam.ToolKit set to FoBo.FontAwesome200TB222 the ResourceServer.pathRewriter" should {
    "rewrit fobo/font-awesome.css to fobo/font-awesome/2.0.0/css/font-awesome.css" in {
      rewriteFontAwesome200TB222CSS must_== List("fobo", "font-awesome", "2.0.0", "css", "font-awesome-min.css")
    }       
  }   
  
  "With FoBo.InitParam.ToolKit set to FoBo.FontAwesome300 the ResourceServer.pathRewriter" should {
    "rewrit fobo/font-awesome.css to fobo/font-awesome/3.0.0/css/font-awesome.css" in {
      rewriteFontAwesome300CSS must_== List("fobo", "font-awesome", "3.0.0", "css", "font-awesome-min.css")
    }       
  }
  
  "With FoBo.InitParam.ToolKit set to FoBo.FontAwesome321 the ResourceServer.pathRewriter" should {
    "rewrit fobo/font-awesome.css to fobo/font-awesome/3.2.1/css/font-awesome.css" in {
      rewriteFontAwesome321CSS must_== List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-min.css")
    }       
  }  
  
  
  
  //Foundation
  "With FoBo.InitParam.ToolKit set to FoBo.Foundation215 the ResourceServer.pathRewriter" should {
    "rewrit fobo/foundation.js to fobo/foundation/2.1.5/js/foundation.js" in {
      rewriteFoundation215JS must_== List("fobo", "foundation", "2.1.5", "js", "foundation.js")
    }       
  }   
  
  
  
  //google-code-prettify
  "With FoBo.InitParam.ToolKit set to FoBo.PrettifyJun2011 the ResourceServer.pathRewriter" should {
    "rewrit fobo/prettify.js to fobo/google-code/js/prettify.js" in {
      rewritePrettifyJun2011JS must_== List("fobo", "google-code", "js", "prettify.js")
    }       
  }  
  
  
  //JQuery-Mobile
  "With FoBo.InitParam.ToolKit set to FoBo.JQueryMobile110 the ResourceServer.pathRewriter" should {
    "rewrit fobo/jquery.mobile.js to fobo/jquery-mobile/1.1.0/js/jquery.mobile-1.1.0.js" in {
      rewriteJQueryMobile110JS must_== List("fobo", "jquery-mobile", "1.1.0", "js", "jquery.mobile-1.1.0.js")
    }       
  }    
  
  //Bootstrap
  "With FoBo.InitParam.ToolKit set to FoBo.Bootstrap210 the ResourceServer.pathRewriter" should {
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.1.0/js/bootstrap-all.js" in {
      rewriteBootstrap210JS must_== List("fobo", "bootstrap", "2.1.0", "js", "bootstrap-all.js")
    }       
  } 
  
  "With FoBo.InitParam.ToolKit set to FoBo.Bootstrap220 the ResourceServer.pathRewriter" should {
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.2.0/js/bootstrap-all.js" in {
      rewriteBootstrap220JS must_== List("fobo", "bootstrap", "2.2.0", "js", "bootstrap-all.js")
    }       
  } 
  
  "With FoBo.InitParam.ToolKit set to FoBo.Bootstrap222 the ResourceServer.pathRewriter" should {
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.2.2/js/bootstrap-all.js" in {
      rewriteBootstrap222JS must_== List("fobo", "bootstrap", "2.2.2", "js", "bootstrap-all.js")
    }       
  }  
  
  "With FoBo.InitParam.ToolKit set to FoBo.Bootstrap230 the ResourceServer.pathRewriter" should {
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.3.0/js/bootstrap-all-min.js" in {
      rewriteBootstrap230JS must_== List("fobo", "bootstrap", "2.3.0", "js", "bootstrap-all-min.js")
    }       
  } 
  
  "With FoBo.InitParam.ToolKit set to FoBo.Bootstrap231 the ResourceServer.pathRewriter" should {
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.3.1/js/bootstrap-all-min.js" in {
      rewriteBootstrap231JS must_== List("fobo", "bootstrap", "2.3.1", "js", "bootstrap-all-min.js")
    }       
  }
  
  "With FoBo.InitParam.ToolKit set to FoBo.Bootstrap232 the ResourceServer.pathRewriter" should {
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.3.2/js/bootstrap-min.js" in {
      rewriteBootstrap232JS must_== List("fobo", "bootstrap", "2.3.2", "js", "bootstrap-min.js")
    }       
  }  
  
  //AngularJS
  //rewriteAngularJS106
  def rewriteAngularJS106 = {
    FoBo.InitParam.ToolKit=FoBo.AngularJS106
    ResourceServer.pathRewriter("fobo"::"angular.js"::Nil)
  }  
  
  def rewriteAJSUIBootstrap020 = {
    FoBo.InitParam.ToolKit=FoBo.AJSUIBootstrap020
    ResourceServer.pathRewriter("fobo"::"ui-bootstrap.js"::Nil)
  }   
  
  def rewriteAJSNGGrid204 = {
    FoBo.InitParam.ToolKit=FoBo.AJSNGGrid204
    ResourceServer.pathRewriter("fobo"::"ng-grid.js"::Nil)
  }    
  
    //Knockout
  def rewriteKnockout200JS = {
    FoBo.InitParam.ToolKit=FoBo.Knockout200
    ResourceServer.pathRewriter("fobo"::"knockout.js"::Nil)
  }
  
  def rewriteKnockout210JS = {
    FoBo.InitParam.ToolKit=FoBo.Knockout210
    ResourceServer.pathRewriter("fobo"::"knockout.js"::Nil)
  } 
  
  def rewriteKnockout221JS = {
    FoBo.InitParam.ToolKit=FoBo.Knockout221
    ResourceServer.pathRewriter("fobo"::"knockout.js"::Nil)
  }  
  
  
  //JQuery
   def rewriteJQuery1102JS = {
    FoBo.InitParam.JQuery=FoBo.JQuery1102
    ResourceServer.pathRewriter("fobo"::"jquery.js"::Nil)
  } 
   /*
  def rewriteJQuery191JS = {
    FoBo.InitParam.JQuery=FoBo.JQuery191
    ResourceServer.pathRewriter("fobo"::"jquery.js"::Nil)
  } 
  
  def rewriteJQuery182JS = {
    FoBo.InitParam.JQuery=FoBo.JQuery182
    ResourceServer.pathRewriter("fobo"::"jquery.js"::Nil)
  } 
  
  def rewriteJQuery172JS = {
    FoBo.InitParam.JQuery=FoBo.JQuery172
    ResourceServer.pathRewriter("fobo"::"jquery.js"::Nil)
  }  
  */
  
  //Datatables
  def rewriteDataTables190JS = {
    FoBo.InitParam.ToolKit=FoBo.DataTables190
    ResourceServer.pathRewriter("fobo"::"jquery.dataTables.js"::Nil)
  }
  
  
  ////FontAwesome
  def rewriteFontAwesome200CSS = {
    FoBo.InitParam.ToolKit=FoBo.FontAwesome200
    ResourceServer.pathRewriter("fobo"::"font-awesome.css"::Nil)
  }
 
  def rewriteFontAwesome200TB222CSS = {
    FoBo.InitParam.ToolKit=FoBo.FontAwesome200TB222
    ResourceServer.pathRewriter("fobo"::"font-awesome.css"::Nil)
  }  
  
  def rewriteFontAwesome300CSS = {
    FoBo.InitParam.ToolKit=FoBo.FontAwesome300
    ResourceServer.pathRewriter("fobo"::"font-awesome.css"::Nil)
  }
  
  def rewriteFontAwesome321CSS = {
    FoBo.InitParam.ToolKit=FoBo.FontAwesome321
    ResourceServer.pathRewriter("fobo"::"font-awesome.css"::Nil)
  }  
  
  
  
  //Foundation
  def rewriteFoundation215JS = {
    FoBo.InitParam.ToolKit=FoBo.Foundation215
    ResourceServer.pathRewriter("fobo"::"foundation.js"::Nil)
  }  
  
  
  
  //PrettifyJun2011
  def rewritePrettifyJun2011JS = {
    FoBo.InitParam.ToolKit=FoBo.PrettifyJun2011
    ResourceServer.pathRewriter("fobo"::"prettify.js"::Nil)
  }   
  
  
  
  //JQueryMobile
  def rewriteJQueryMobile110JS = {
    FoBo.InitParam.ToolKit=FoBo.JQueryMobile110
    ResourceServer.pathRewriter("fobo"::"jquery.mobile.js"::Nil)
  }   
  
  
  
  //Bootstrap
  def rewriteBootstrap210JS = {
    FoBo.InitParam.ToolKit=FoBo.Bootstrap210
    ResourceServer.pathRewriter("fobo"::"bootstrap.js"::Nil)
  }
  
   def rewriteBootstrap220JS = {
    FoBo.InitParam.ToolKit=FoBo.Bootstrap220
    ResourceServer.pathRewriter("fobo"::"bootstrap.js"::Nil)
  } 
   
   def rewriteBootstrap222JS = {
    FoBo.InitParam.ToolKit=FoBo.Bootstrap222
    ResourceServer.pathRewriter("fobo"::"bootstrap.js"::Nil)
  } 
   
   def rewriteBootstrap230JS = {
    FoBo.InitParam.ToolKit=FoBo.Bootstrap230
    ResourceServer.pathRewriter("fobo"::"bootstrap.js"::Nil)
  } 
   
   def rewriteBootstrap231JS = {
    FoBo.InitParam.ToolKit=FoBo.Bootstrap231
    ResourceServer.pathRewriter("fobo"::"bootstrap.js"::Nil)
  } 
   
   def rewriteBootstrap232JS = {
    FoBo.InitParam.ToolKit=FoBo.Bootstrap232
    ResourceServer.pathRewriter("fobo"::"bootstrap.js"::Nil)
  }    
  
   
}


