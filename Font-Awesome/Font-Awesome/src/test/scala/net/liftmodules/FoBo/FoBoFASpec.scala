package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

object FoBoFASpec extends Specification {
  "FoBoFASpec Specification".title

  sequential
  
  //FontAwesome463 
  "With FoBoFA.Toolkit.Init set to FoBoFA.Toolkit.FontAwesome463 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowToolkitInit(FoBoFA.Toolkit.FontAwesome463,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.6.3/css/font-awesome.css" in {
      rewriteToolkitInit(FoBoFA.Toolkit.FontAwesome463,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.6.3", "css", "font-awesome.min.css")
    }       
  }   
  
  "With FoBoFA.Resource.Init set to FoBoFA.Resource.FontAwesome463 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowResource(FoBoFA.Resource.FontAwesome463,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.6.3/css/font-awesome.css" in {
      rewriteResource(FoBoFA.Resource.FontAwesome463,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.6.3", "css", "font-awesome.min.css")
    }       
  }    
  
  //FontAwesome430
  "With FoBoFA.InitParam.Toolkit set to FoBoFA.FontAwesome430 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowInitParam(FoBoFA.FontAwesome430,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.3.0/css/font-awesome.css" in {
      rewriteInitParam(FoBoFA.FontAwesome430,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.3.0", "css", "font-awesome.min.css")
    }       
  }  
  
  "With FoBoFA.Toolkit.Init set to FoBoFA.Toolkit.FontAwesome430 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowToolkitInit(FoBoFA.Toolkit.FontAwesome430,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.3.0/css/font-awesome.css" in {
      rewriteToolkitInit(FoBoFA.Toolkit.FontAwesome430,"fobo"::"font-awesome.css"::Nil) must_== 
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
  "With FoBoFA.InitParam.Toolkit set to FoBoFA.FontAwesome410 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowInitParam(FoBoFA.FontAwesome410,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.1.0/css/font-awesome.css" in {
      rewriteInitParam(FoBoFA.FontAwesome410,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.1.0", "css", "font-awesome.min.css")
    }       
  }  
  
  "With FoBoFA.Toolkit.Init set to FoBoFA.Toolkit.FontAwesome410 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowToolkitInit(FoBoFA.Toolkit.FontAwesome410,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.1.0/css/font-awesome.min.css" in {
      rewriteToolkitInit(FoBoFA.Toolkit.FontAwesome410,"fobo"::"font-awesome.css"::Nil) must_== 
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
  "With FoBoFA.InitParam.Toolkit set to FoBoFA.FontAwesome403 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowInitParam(FoBoFA.FontAwesome403,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.0.3/css/font-awesome.css" in {
      rewriteInitParam(FoBoFA.FontAwesome403,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "4.0.3", "css", "font-awesome.min.css")
    }       
  }  
  
  "With FoBoFA.Toolkit.Init set to FoBoFA.Toolkit.FontAwesome403 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowToolkitInit(FoBoFA.Toolkit.FontAwesome403,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.0.3/css/font-awesome.css" in {
      rewriteToolkitInit(FoBoFA.Toolkit.FontAwesome403,"fobo"::"font-awesome.css"::Nil) must_== 
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
  "With FoBoFA.InitParam.Toolkit set to FoBoFA.FontAwesome321 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowInitParam(FoBoFA.FontAwesome321,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/3.2.1/css/font-awesome-min.css" in {
      rewriteInitParam(FoBoFA.FontAwesome321,"fobo"::"font-awesome.css"::Nil) must_== 
        List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-min.css")
    }       
  }  
  
  "With FoBoFA.Toolkit.Init set to FoBoFA.Toolkit.FontAwesome321 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowToolkitInit(FoBoFA.Toolkit.FontAwesome321,"fobo"::"font-awesome.css"::Nil) must_== true 
    } 
    "rewrit fobo/font-awesome.css to fobo/font-awesome/3.2.1/css/font-awesome-min.css" in {
      rewriteToolkitInit(FoBoFA.Toolkit.FontAwesome321,"fobo"::"font-awesome.css"::Nil) must_== 
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
  
  
 //=== Toolkit.Init ==============//
  def allowToolkitInit(resource:FoBoFA.Toolkit,path:List[String]) = {
    FoBoFA.Toolkit.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteToolkitInit(resource:FoBoFA.Toolkit,path:List[String]) = {
    FoBoFA.Toolkit.Init=resource 
    ResourceServer.pathRewriter(path)
  }  
  
 //=== InitParam.Toolkit ===============// 
  def allowInitParam(resource:FoBoFA.FAToolkit,path:List[String]) = {
    FoBoFA.InitParam.Toolkit=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteInitParam(resource:FoBoFA.FAToolkit,path:List[String]) = {
    FoBoFA.InitParam.Toolkit=resource 
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