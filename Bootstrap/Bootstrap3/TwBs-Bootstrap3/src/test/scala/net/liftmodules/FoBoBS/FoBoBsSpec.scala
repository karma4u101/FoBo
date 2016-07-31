
package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

object FoBoBsSpec extends Specification {
  "FoBoBsSpec Specification".title
  
  sequential   
  
 //Bootstrap337
  "With FoBoBs.Resource.Init set to FoBoBs.Resource.Bootstrap337 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBoBs.Resource.Bootstrap337,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.7/js/bootstrap-min.js" in {
      rewriteResource(FoBoBs.Resource.Bootstrap337,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.3.7", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBoBs.Toolkit.Init set to FoBoBs.Toolkit.Bootstrap337 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(FoBoBs.Toolkit.Bootstrap337,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.7/js/bootstrap-min.js" in {
      rewriteToolkitInit(FoBoBs.Toolkit.Bootstrap337,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.3.7", "js", "bootstrap.min.js")
    }       
  }
  
  //Bootstrap336
  "With FoBoBs.Resource.Init set to FoBoBs.Resource.Bootstrap336 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBoBs.Resource.Bootstrap336,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.6/js/bootstrap-min.js" in {
      rewriteResource(FoBoBs.Resource.Bootstrap336,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.3.6", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBoBs.Toolkit.Init set to FoBoBs.Toolkit.Bootstrap336 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(FoBoBs.Toolkit.Bootstrap336,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.6/js/bootstrap-min.js" in {
      rewriteToolkitInit(FoBoBs.Toolkit.Bootstrap336,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.3.6", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBoBs.InitParam.ToolKit set to FoBoBs.Bootstrap336 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowInitParam(FoBoBs.Bootstrap336,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.6/js/bootstrap-min.js" in {
      rewriteInitParam(FoBoBs.Bootstrap336,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.3.6", "js", "bootstrap.min.js")
    }       
  } 
  
  //Bootstrap335
  "With FoBoBs.Resource.Init set to FoBoBs.Resource.Bootstrap335 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBoBs.Resource.Bootstrap335,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.5/js/bootstrap-min.js" in {
      rewriteResource(FoBoBs.Resource.Bootstrap335,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.3.5", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBoBs.Toolkit.Init set to FoBoBs.Toolkit.Bootstrap335 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(FoBoBs.Toolkit.Bootstrap335,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.5/js/bootstrap-min.js" in {
      rewriteToolkitInit(FoBoBs.Toolkit.Bootstrap335,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.3.5", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBoBs.InitParam.ToolKit set to FoBoBs.Bootstrap335 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowInitParam(FoBoBs.Bootstrap335,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.3.5/js/bootstrap-min.js" in {
      rewriteInitParam(FoBoBs.Bootstrap335,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.3.5", "js", "bootstrap.min.js")
    }       
  }
  
  //Bootstrap320
  "With FoBoBs.Resource.Init set to FoBoBs.Resource.Bootstrap320 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBoBs.Resource.Bootstrap320,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.2.0/js/bootstrap-min.js" in {
      rewriteResource(FoBoBs.Resource.Bootstrap320,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.2.0", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBoBs.Toolkit.Init set to FoBoBs.Toolkit.Bootstrap320 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(FoBoBs.Toolkit.Bootstrap320,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.2.0/js/bootstrap-min.js" in {
      rewriteToolkitInit(FoBoBs.Toolkit.Bootstrap320,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.2.0", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBoBs.InitParam.ToolKit set to FoBoBs.Bootstrap320 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowInitParam(FoBoBs.Bootstrap320,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.2.0/js/bootstrap-min.js" in {
      rewriteInitParam(FoBoBs.Bootstrap320,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.2.0", "js", "bootstrap.min.js")
    }       
  }  
  
  //Bootstrap311
  "With FoBoBs.Resource.Init set to FoBoBs.Resource.Bootstrap311 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBoBs.Resource.Bootstrap311,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.1.1/js/bootstrap-min.js" in {
      rewriteResource(FoBoBs.Resource.Bootstrap311,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.1.1", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBoBs.Toolkit.Init set to FoBoBs.Toolkit.Bootstrap311 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(FoBoBs.Toolkit.Bootstrap311,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.1.1/js/bootstrap-min.js" in {
      rewriteToolkitInit(FoBoBs.Toolkit.Bootstrap311,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.1.1", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBoBs.InitParam.ToolKit set to FoBoBs.Bootstrap311 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowInitParam(FoBoBs.Bootstrap311,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.1.1/js/bootstrap-min.js" in {
      rewriteInitParam(FoBoBs.Bootstrap311,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.1.1", "js", "bootstrap.min.js")
    }       
  }    
  
  //Bootstrap301
  "With FoBoBs.Resource.Init set to FoBoBs.Resource.Bootstrap301 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowResource(FoBoBs.Resource.Bootstrap301,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.0.1/js/bootstrap-min.js" in {
      rewriteResource(FoBoBs.Resource.Bootstrap301,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.0.1", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBoBs.Toolkit.Init set to FoBoBs.Toolkit.Bootstrap301 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowToolkitInit(FoBoBs.Toolkit.Bootstrap301,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.0.1/js/bootstrap-min.js" in {
      rewriteToolkitInit(FoBoBs.Toolkit.Bootstrap301,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.0.1", "js", "bootstrap.min.js")
    }       
  }
  
  "With FoBoBs.InitParam.ToolKit set to FoBoBs.Bootstrap301 the ResourceServer" should {
    "allow  fobo/bootstrap.js" in {
      allowInitParam(FoBoBs.Bootstrap301,"fobo"::"bootstrap.js"::Nil) must_== true 
    }    
    "rewrit fobo/bootstrap.js to fobo/bootstrap/3.0.1/js/bootstrap-min.js" in {
      rewriteInitParam(FoBoBs.Bootstrap301,"fobo"::"bootstrap.js"::Nil) must_== 
        List("fobo", "bootstrap", "3.0.1", "js", "bootstrap.min.js")
    }       
  }   
  
 //=== Toolkit.Init ==============//
  def allowToolkitInit(resource:FoBoBs.Toolkit,path:List[String]) = {
    FoBoBs.Toolkit.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteToolkitInit(resource:FoBoBs.Toolkit,path:List[String]) = {
    FoBoBs.Toolkit.Init=resource 
    ResourceServer.pathRewriter(path)
  }  
  
 //=== InitParam.Toolkit ===============// 
  def allowInitParam(resource:FoBoBs.FoBoToolkit,path:List[String]) = {
    FoBoBs.InitParam.ToolKit=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteInitParam(resource:FoBoBs.FoBoToolkit,path:List[String]) = {
    FoBoBs.InitParam.ToolKit=resource 
    ResourceServer.pathRewriter(path)
  } 
 
  //=== Resource.Init ===============//
  def allowResource(resource:FoBoBs.Resource,path:List[String]) = {
    FoBoBs.Resource.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteResource(resource:FoBoBs.Resource,path:List[String]) = {
    FoBoBs.Resource.Init=resource 
    ResourceServer.pathRewriter(path)
  }   
  
 
}