package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

object FoBoKiSpec extends Specification {
  "FoBoKiSpec Specification".title

  sequential 
  
  //KineticJS510
  "With FoBoKi.InitParam.ToolKit set to FoBoGCP.KineticJS510 the ResourceServer" should {
    "allow  fobo/kinetic.js" in {
      allowInitParam(FoBoKi.KineticJS510,"fobo"::"kinetic.js"::Nil) must_== true 
    } 
    "rewrit fobo/kinetic.js to fobo/kinetic/5.1.0/js/kineti.min.js" in {
      rewriteInitParam(FoBoKi.KineticJS510,"fobo"::"kinetic.js"::Nil) must_== 
        List("fobo", "kinetic", "5.1.0", "js", "kinetic.min.js")
    }       
  } 
  
  "With FoBoKi.Toolkit.Init set to FoBoKi.Toolkit.KineticJS510 the ResourceServer" should {
    "allow  fobo/kinetic.js" in {
      allowToolkitInit(FoBoKi.Toolkit.KineticJS510,"fobo"::"kinetic.js"::Nil) must_== true 
    } 
    "rewrit fobo/kinetic.js to fobo/kinetic/5.1.0/js/kineti.min.js" in {
      rewriteToolkitInit(FoBoKi.Toolkit.KineticJS510,"fobo"::"kinetic.js"::Nil) must_== 
        List("fobo", "kinetic", "5.1.0", "js", "kinetic.min.js")
    }       
  }
  
  "With FoBoKi.Resource.Init set to FoBoKi.Resource.KineticJS510 the ResourceServer" should {
    "allow  fobo/kinetic.js" in {
      allowResource(FoBoKi.Resource.KineticJS510,"fobo"::"kinetic.js"::Nil) must_== true 
    } 
    "rewrit fobo/kinetic.js to fobo/kinetic/5.1.0/js/kineti.min.js" in {
      rewriteResource(FoBoKi.Resource.KineticJS510,"fobo"::"kinetic.js"::Nil) must_== 
        List("fobo", "kinetic", "5.1.0", "js", "kinetic.min.js")
    }       
  }   
  
 //=== Toolkit.Init ==============//
  def allowToolkitInit(resource:FoBoKi.Toolkit,path:List[String]) = {
    FoBoKi.Toolkit.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteToolkitInit(resource:FoBoKi.Toolkit,path:List[String]) = {
    FoBoKi.Toolkit.Init=resource 
    ResourceServer.pathRewriter(path)
  }  
  
 //=== InitParam.ToolKit ===============// 
  def allowInitParam(resource:FoBoKi.FoBoToolkit,path:List[String]) = {
    FoBoKi.InitParam.ToolKit=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteInitParam(resource:FoBoKi.FoBoToolkit,path:List[String]) = {
    FoBoKi.InitParam.ToolKit=resource 
    ResourceServer.pathRewriter(path)
  } 
 
  //=== Resource.Init ===============//
  def allowResource(resource:FoBoKi.Resource,path:List[String]) = {
    FoBoKi.Resource.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteResource(resource:FoBoKi.Resource,path:List[String]) = {
    FoBoKi.Resource.Init=resource 
    ResourceServer.pathRewriter(path)
  } 
    
  
}