package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

object FoBoFASpec extends Specification {
  "FoBoFASpec Specification".title

  sequential
  
  //FontAwesome450 
  "With FoBoFA.ToolKit.Init set to FoBoFA.ToolKit.FontAwesome450 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowToolKitInit(FoBoFA.ToolKit.FontAwesome450,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.5.0/css/font-awesome.css" in {
      rewriteToolKitInit(FoBoFA.ToolKit.FontAwesome450,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.5.0", "css", "font-awesome.min.css")
    }       
  }   
  
  "With FoBoFA.Resource.Init set to FoBoFA.Resource.FontAwesome450 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowResource(FoBoFA.Resource.FontAwesome450,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.5.0/css/font-awesome.css" in {
      rewriteResource(FoBoFA.Resource.FontAwesome450,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.5.0", "css", "font-awesome.min.css")
    }       
  }    
  
  //FontAwesome430
  "With FoBoFA.InitParam.ToolKit set to FoBoFA.FontAwesome430 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowInitParam(FoBoFA.FontAwesome430,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.3.0/css/font-awesome.css" in {
      rewriteInitParam(FoBoFA.FontAwesome430,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.3.0", "css", "font-awesome.min.css")
    }       
  }  
  
  "With FoBoFA.ToolKit.Init set to FoBoFA.ToolKit.FontAwesome430 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowToolKitInit(FoBoFA.ToolKit.FontAwesome430,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.3.0/css/font-awesome.css" in {
      rewriteToolKitInit(FoBoFA.ToolKit.FontAwesome430,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.3.0", "css", "font-awesome.min.css")
    }       
  } 
  
  "With FoBoFA.Resource.Init set to FoBoFA.Resource.FontAwesome430 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowResource(FoBoFA.Resource.FontAwesome430,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.3.0/css/font-awesome.css" in {
      rewriteResource(FoBoFA.Resource.FontAwesome430,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.3.0", "css", "font-awesome.min.css")
    }       
  }  
  
  //FontAwesome410
  "With FoBoFA.InitParam.ToolKit set to FoBoFA.FontAwesome410 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowInitParam(FoBoFA.FontAwesome410,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.1.0/css/font-awesome.css" in {
      rewriteInitParam(FoBoFA.FontAwesome410,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.1.0", "css", "font-awesome.min.css")
    }       
  }  
  
  "With FoBoFA.ToolKit.Init set to FoBoFA.ToolKit.FontAwesome410 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowToolKitInit(FoBoFA.ToolKit.FontAwesome410,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.1.0/css/font-awesome.min.css" in {
      rewriteToolKitInit(FoBoFA.ToolKit.FontAwesome410,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.1.0", "css", "font-awesome.min.css")
    }       
  } 
  
  "With FoBoFA.Resource.Init set to FoBoFA.Resource.FontAwesome410 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowResource(FoBoFA.Resource.FontAwesome410,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.1.0/css/font-awesome.css" in {
      rewriteResource(FoBoFA.Resource.FontAwesome410,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.1.0", "css", "font-awesome.min.css")
    }       
  }  

  //FontAwesome403
  "With FoBoFA.InitParam.ToolKit set to FoBoFA.FontAwesome403 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowInitParam(FoBoFA.FontAwesome403,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.0.3/css/font-awesome.css" in {
      rewriteInitParam(FoBoFA.FontAwesome403,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.0.3", "css", "font-awesome.min.css")
    }       
  }  
  
  "With FoBoFA.ToolKit.Init set to FoBoFA.ToolKit.FontAwesome403 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowToolKitInit(FoBoFA.ToolKit.FontAwesome403,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.0.3/css/font-awesome.css" in {
      rewriteToolKitInit(FoBoFA.ToolKit.FontAwesome403,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.0.3", "css", "font-awesome.min.css")
    }       
  } 
  
  "With FoBoFA.Resource.Init set to FoBoFA.Resource.FontAwesome403 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowResource(FoBoFA.Resource.FontAwesome403,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.0.3/css/font-awesome.css" in {
      rewriteResource(FoBoFA.Resource.FontAwesome403,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.0.3", "css", "font-awesome.min.css")
    }       
  }  
  
  //FontAwesome321
  "With FoBoFA.InitParam.ToolKit set to FoBoFA.FontAwesome321 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowInitParam(FoBoFA.FontAwesome321,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/3.2.1/css/font-awesome-min.css" in {
      rewriteInitParam(FoBoFA.FontAwesome321,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-min.css")
    }       
  }  
  
  "With FoBoFA.ToolKit.Init set to FoBoFA.ToolKit.FontAwesome321 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowToolKitInit(FoBoFA.ToolKit.FontAwesome321,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/3.2.1/css/font-awesome-min.css" in {
      rewriteToolKitInit(FoBoFA.ToolKit.FontAwesome321,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-min.css")
    }       
  } 
  
  "With FoBoFA.Resource.Init set to FoBoFA.Resource.FontAwesome321 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowResource(FoBoFA.Resource.FontAwesome321,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/3.2.1/css/font-awesome-min.css" in {
      rewriteResource(FoBoFA.Resource.FontAwesome321,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-min.css")
    }       
  }     
  
  
 //=== ToolKit.Init ==============//
  def allowToolKitInit(resource:FoBoFA.ToolKit,path:List[String]) = {
    FoBoFA.ToolKit.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteToolKitInit(resource:FoBoFA.ToolKit,path:List[String]) = {
    FoBoFA.ToolKit.Init=resource 
    ResourceServer.pathRewriter(path)
  }  
  
 //=== InitParam.ToolKit ===============// 
  def allowInitParam(resource:FoBoFA.FAToolkit,path:List[String]) = {
    FoBoFA.InitParam.ToolKit=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteInitParam(resource:FoBoFA.FAToolkit,path:List[String]) = {
    FoBoFA.InitParam.ToolKit=resource 
    ResourceServer.pathRewriter(path)
  } 
 
  //=== Resource.Init ===============//
  def allowResource(resource:FoBoFA.Resource,path:List[String]) = {
    FoBoFA.Resource.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteResource(resource:FoBoFA.Resource,path:List[String]) = {
    FoBoFA.Resource.Init=resource 
    ResourceServer.pathRewriter(path)
  }     
  
}