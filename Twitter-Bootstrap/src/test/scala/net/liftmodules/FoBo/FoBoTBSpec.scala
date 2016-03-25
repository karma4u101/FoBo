package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

object FoBoTBSpec extends Specification  {
  "FoBoTBSpec Specification".title
  
  sequential
  
  //Bootstrap232
  "With FoBoTB.Resource.Init set to FoBoTB.Resource.Bootstrap232 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBoTB.Resource.Bootstrap232,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.css to fobo/bootstrap/2.3.2/css/bootstrap-min.css" in {
       rewriteResource(FoBoTB.Resource.Bootstrap232,"fobo"::"bootstrap.css"::Nil) must_== 
         List("fobo", "bootstrap", "2.3.2", "css", "bootstrap-min.css")
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.3.2/js/bootstrap-min.js" in {
      rewriteResource(FoBoTB.Resource.Bootstrap232,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "2.3.2", "js", "bootstrap-min.js")
    }       
  } 
 
  "With FoBoTB.ToolKit.Init set to FoBoTB.ToolKit.Bootstrap232 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolKitInit(FoBoTB.ToolKit.Bootstrap232,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.css to fobo/bootstrap/2.3.2/css/bootstrap-min.css" in {
       rewriteToolKitInit(FoBoTB.ToolKit.Bootstrap232,"fobo"::"bootstrap.css"::Nil) must_== 
         List("fobo", "bootstrap", "2.3.2", "css", "bootstrap-min.css")
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.3.2/js/bootstrap-min.js" in {
      rewriteToolKitInit(FoBoTB.ToolKit.Bootstrap232,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "2.3.2", "js", "bootstrap-min.js")
    }       
  }   
  
  "With FoBoTB.InitParam.ToolKit set to FoBoTB.Bootstrap232 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowInitParam(FoBoTB.Bootstrap232,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.css to fobo/bootstrap/2.3.2/css/bootstrap-min.css" in {
       rewriteInitParam(FoBoTB.Bootstrap232,"fobo"::"bootstrap.css"::Nil) must_== 
         List("fobo", "bootstrap", "2.3.2", "css", "bootstrap-min.css")
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/2.3.2/js/bootstrap-min.js" in {
      rewriteInitParam(FoBoTB.Bootstrap232,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "2.3.2", "js", "bootstrap-min.js")
    }       
  }   
  
  

 //=== ToolKit.Init ==============//
  def allowToolKitInit(resource:FoBoTB.ToolKit,path:List[String]) = {
    FoBoTB.ToolKit.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteToolKitInit(resource:FoBoTB.ToolKit,path:List[String]) = {
    FoBoTB.ToolKit.Init=resource 
    ResourceServer.pathRewriter(path)
  }  
  
 //=== InitParam.ToolKit ===============// 
  def allowInitParam(resource:FoBoTB.FoBoToolkit,path:List[String]) = {
    FoBoTB.InitParam.ToolKit=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteInitParam(resource:FoBoTB.FoBoToolkit,path:List[String]) = {
    FoBoTB.InitParam.ToolKit=resource 
    ResourceServer.pathRewriter(path)
  } 
 
  //=== Resource.Init ===============//
  def allowResource(resource:FoBoTB.Resource,path:List[String]) = {
    FoBoTB.Resource.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteResource(resource:FoBoTB.Resource,path:List[String]) = {
    FoBoTB.Resource.Init=resource 
    ResourceServer.pathRewriter(path)
  }    
  
}


