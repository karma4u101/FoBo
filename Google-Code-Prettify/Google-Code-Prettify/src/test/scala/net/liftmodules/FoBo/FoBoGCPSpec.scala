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
  "With FoBoGCP.InitParam.Toolkit set to FoBoGCP.PrettifyJun2011 the ResourceServer" should {
    "allow  fobo/prettify.js" in {
      allowInitParam(FoBoGCP.PrettifyJun2011,"fobo"::"prettify.js"::Nil) must_== true 
    } 
    "rewrit fobo/angular.js to fobo/pace/0.4.15/js/pace.min.js" in {
      rewriteInitParam(FoBoGCP.PrettifyJun2011,"fobo"::"prettify.js"::Nil) must_== 
        List("fobo", "google-code", "js", "prettify.js")
    }       
  }
  
  "With FoBoGCP.Toolkit.Init set to FoBoGCP.Toolkit.PrettifyJun2011 the ResourceServer" should {
    "allow  fobo/prettify.js" in {
      allowToolkitInit(FoBoGCP.Toolkit.PrettifyJun2011,"fobo"::"prettify.js"::Nil) must_== true 
    } 
    "rewrit fobo/angular.js to fobo/pace/0.4.15/js/pace.min.js" in {
      rewriteToolkitInit(FoBoGCP.Toolkit.PrettifyJun2011,"fobo"::"prettify.js"::Nil) must_== 
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
  
  
 //=== Toolkit.Init ==============//
  def allowToolkitInit(resource:FoBoGCP.Toolkit,path:List[String]) = {
    FoBoGCP.Toolkit.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteToolkitInit(resource:FoBoGCP.Toolkit,path:List[String]) = {
    FoBoGCP.Toolkit.Init=resource 
    ResourceServer.pathRewriter(path)
  }  
  
 //=== InitParam.Toolkit ===============// 
  def allowInitParam(resource:FoBoGCP.FoBoToolkit,path:List[String]) = {
    FoBoGCP.InitParam.Toolkit=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteInitParam(resource:FoBoGCP.FoBoToolkit,path:List[String]) = {
    FoBoGCP.InitParam.Toolkit=resource 
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