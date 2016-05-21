package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

object FoBoPaSpec extends Specification {
  "FoBoPaSpec Specification".title

  sequential
      
  
  //HighlightJS930
  "With FoBoHL.Toolkit.Init set to FoBoHL.Toolkit.HighlightJS930 the ResourceServer" should {
    "allow  fobo/highlight/highlight.pack.js" in {
      allowToolkitInit(FoBoHL.Toolkit.HighlightJS930,"fobo"::"highlight"::"highlight.pack.js"::Nil) must_== true 
    }     
    "rewrit rewrit fobo/highlight/highlight.pack.js to fobo/highlight/9.3.0/js/highlight.pack.js" in {
      rewriteToolkitInit(FoBoHL.Toolkit.HighlightJS930,"fobo"::"highlight"::"highlight.pack.js"::Nil) must_== 
        List("fobo", "highlight", "9.3.0", "js", "highlight.pack.js")
    }        
  } 
  
  "With FoBoHL.Resource.Init set to FoBoHL.Resource.HighlightJS930 the ResourceServer" should {
    "allow  fobo/highlight/highlight.pack.js" in {
      allowResource(FoBoHL.Resource.HighlightJS930,"fobo"::"highlight"::"highlight.pack.js"::Nil) must_== true 
    }     
    "rewrit rewrit fobo/highlight/highlight.pack.js to fobo/highlight/9.3.0/js/highlight.pack.js" in {
      rewriteResource(FoBoHL.Resource.HighlightJS930,"fobo"::"highlight"::"highlight.pack.js"::Nil) must_== 
        List("fobo", "highlight", "9.3.0", "js", "highlight.pack.js")
    }        
  }   
  
 //=== Toolkit.Init ==============//
  def allowToolkitInit(resource:FoBoHL.Toolkit,path:List[String]) = {
    FoBoHL.Toolkit.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteToolkitInit(resource:FoBoHL.Toolkit,path:List[String]) = {
    FoBoHL.Toolkit.Init=resource 
    ResourceServer.pathRewriter(path)
  }  
 
  //=== Resource.Init ===============//
  def allowResource(resource:FoBoHL.Resource,path:List[String]) = {
    FoBoHL.Resource.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteResource(resource:FoBoHL.Resource,path:List[String]) = {
    FoBoHL.Resource.Init=resource 
    ResourceServer.pathRewriter(path)
  }    
  
}