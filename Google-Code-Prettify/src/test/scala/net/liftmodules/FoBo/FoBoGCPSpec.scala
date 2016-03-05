package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

object FoBoGCPSpec extends Specification {
  "FoBoGCPSpec Specification".title

  sequential
  
  //PrettifyJun2011
  "With FoBoGCP.InitParam.ToolKit set to FoBoGCP.PrettifyJun2011 the ResourceServer" should {
    "allow  fobo/prettify.js" in {
      allowInitParam(FoBoGCP.PrettifyJun2011,"fobo"::"prettify.js"::Nil) must_== true 
    } 
    "rewrit fobo/angular.js to fobo/pace/0.4.15/js/pace.min.js" in {
      rewriteInitParam(FoBoGCP.PrettifyJun2011,"fobo"::"prettify.js"::Nil) must_== 
        List("fobo", "google-code", "js", "prettify.js")
    }       
  }
  
  "With FoBoGCP.ToolKit.Init set to FoBoGCP.ToolKit.PrettifyJun2011 the ResourceServer" should {
    "allow  fobo/prettify.js" in {
      allowToolKitInit(FoBoGCP.ToolKit.PrettifyJun2011,"fobo"::"prettify.js"::Nil) must_== true 
    } 
    "rewrit fobo/angular.js to fobo/pace/0.4.15/js/pace.min.js" in {
      rewriteToolKitInit(FoBoGCP.ToolKit.PrettifyJun2011,"fobo"::"prettify.js"::Nil) must_== 
        List("fobo", "google-code", "js", "prettify.js")
    }       
  }   
  
  "With FoBoGCP.Resource.Init set to FoBoGCP.Resource.PrettifyJun2011 the ResourceServer" should {
    "allow  fobo/prettify.js" in {
      allowResource(FoBoGCP.Resource.PrettifyJun2011,"fobo"::"prettify.js"::Nil) must_== true 
    }     
    "rewrit rewrit fobo/prettify.js to fobo/google-code/js/prettify.js" in {
      rewriteResource(FoBoGCP.Resource.PrettifyJun2011,"fobo"::"prettify.js"::Nil) must_== 
        List("fobo", "google-code", "js", "prettify.js")
    }        
  }    
  
  
 //=== ToolKit.Init ==============//
  def allowToolKitInit(resource:FoBoGCP.ToolKit,path:List[String]) = {
    FoBoGCP.ToolKit.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteToolKitInit(resource:FoBoGCP.ToolKit,path:List[String]) = {
    FoBoGCP.ToolKit.Init=resource 
    ResourceServer.pathRewriter(path)
  }  
  
 //=== InitParam.ToolKit ===============// 
  def allowInitParam(resource:FoBoGCP.FoBoToolkit,path:List[String]) = {
    FoBoGCP.InitParam.ToolKit=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteInitParam(resource:FoBoGCP.FoBoToolkit,path:List[String]) = {
    FoBoGCP.InitParam.ToolKit=resource 
    ResourceServer.pathRewriter(path)
  } 
 
  //=== Resource.Init ===============//
  def allowResource(resource:FoBoGCP.Resource,path:List[String]) = {
    FoBoGCP.Resource.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteResource(resource:FoBoGCP.Resource,path:List[String]) = {
    FoBoGCP.Resource.Init=resource 
    ResourceServer.pathRewriter(path)
  } 
  
}