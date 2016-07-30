package net.liftmodules

import net.liftweb._
import net.liftweb.http._
import net.liftweb.common._
import org.specs2.mutable.Specification

object FoBoJQSpec extends Specification {
  "FoBoJQSpec Specification".title

  sequential
  
  //JQuery310
  "With FoBoJQ.Resource.Init set to FoBoJQ.Resource.JQuery310 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBoJQ.Resource.JQuery310,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/3.1.0/js/jquery-min.js" in {
      rewriteResource(FoBoJQ.Resource.JQuery310,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "3.1.0", "js", "jquery-min.js")
    }        
  }   
  
  "With FoBoJQ.Toolkit.Init set to FoBoJQ.Toolkit.JQuery310 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(FoBoJQ.Toolkit.JQuery310,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery-migrate/3.1.0/js/jquery-min.js" in {
      rewriteToolkitInit(FoBoJQ.Toolkit.JQuery310,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "3.1.0", "js", "jquery-min.js")
    }        
  } 
  
  //JQueryMigrate300
  "With FoBoJQ.Resource.Init set to FoBoJQ.Resource.JQueryMigrate300 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowResource(FoBoJQ.Resource.JQueryMigrate300,"fobo"::"jquery-migrate.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery-migrate.js to jquery-migrate/3.0.0/js/jquery-migrate-min.js" in {
      rewriteResource(FoBoJQ.Resource.JQueryMigrate300,"fobo"::"jquery-migrate.js"::Nil) must_== 
        List("jquery-migrate", "3.0.0", "js", "jquery-migrate-min.js")
    }        
  }
  
  "With FoBoJQ.Toolkit.Init set to FoBoJQ.Toolkit.JQueryMigrate300 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowToolkitInit(FoBoJQ.Toolkit.JQueryMigrate300,"fobo"::"jquery-migrate.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery-migrate.js to jquery-migrate/3.0.0/js/jquery-migrate-min.js" in {
      rewriteToolkitInit(FoBoJQ.Toolkit.JQueryMigrate300,"fobo"::"jquery-migrate.js"::Nil) must_== 
        List("jquery-migrate", "3.0.0", "js", "jquery-migrate-min.js")
    }        
  } 
  
  //JQuery300
  "With FoBoJQ.Resource.Init set to FoBoJQ.Resource.JQuery300 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBoJQ.Resource.JQuery300,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/3.0.0/js/jquery-min.js" in {
      rewriteResource(FoBoJQ.Resource.JQuery300,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "3.0.0", "js", "jquery-min.js")
    }        
  }   
  
  "With FoBoJQ.Toolkit.Init set to FoBoJQ.Toolkit.JQuery300 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(FoBoJQ.Toolkit.JQuery300,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery-migrate/3.0.0/js/jquery-min.js" in {
      rewriteToolkitInit(FoBoJQ.Toolkit.JQuery300,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "3.0.0", "js", "jquery-min.js")
    }        
  } 
  
  //JQuery224
  "With FoBoJQ.Resource.Init set to FoBoJQ.Resource.JQuery212 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBoJQ.Resource.JQuery224,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/2.2.4/js/jquery-min.js" in {
      rewriteResource(FoBoJQ.Resource.JQuery224,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "2.2.4", "js", "jquery-min.js")
    }        
  }   
  
  "With FoBoJQ.Toolkit.Init set to FoBoJQ.Toolkit.JQuery224 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(FoBoJQ.Toolkit.JQuery224,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery-migrate/2.2.4/js/jquery-min.js" in {
      rewriteToolkitInit(FoBoJQ.Toolkit.JQuery224,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "2.2.4", "js", "jquery-min.js")
    }        
  } 
  
  //JQueryMigrate141
  "With FoBoJQ.Resource.Init set to FoBoJQ.Resource.JQueryMigrate141 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowResource(FoBoJQ.Resource.JQueryMigrate141,"fobo"::"jquery-migrate.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.4.1/js/jquery-migrate-min.js" in {
      rewriteResource(FoBoJQ.Resource.JQueryMigrate141,"fobo"::"jquery-migrate.js"::Nil) must_== 
        List("jquery-migrate", "1.4.1", "js", "jquery-migrate-min.js")
    }        
  }
  
  "With FoBoJQ.Toolkit.Init set to FoBoJQ.Toolkit.JQueryMigrate141 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowToolkitInit(FoBoJQ.Toolkit.JQueryMigrate141,"fobo"::"jquery-migrate.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.4.1/js/jquery-migrate-min.js" in {
      rewriteToolkitInit(FoBoJQ.Toolkit.JQueryMigrate141,"fobo"::"jquery-migrate.js"::Nil) must_== 
        List("jquery-migrate", "1.4.1", "js", "jquery-migrate-min.js")
    }        
  }      
  
  //JQueryMigrate121
  "With FoBoJQ.Resource.Init set to FoBoJQ.Resource.JQueryMigrate121 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowResource(FoBoJQ.Resource.JQueryMigrate121,"fobo"::"jquery-migrate.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.2.1/js/jquery-migrate-min.js" in {
      rewriteResource(FoBoJQ.Resource.JQueryMigrate121,"fobo"::"jquery-migrate.js"::Nil) must_== 
        List("jquery-migrate", "1.2.1", "js", "jquery-migrate-min.js")
    }        
  }
  
  "With FoBoJQ.Toolkit.Init set to FoBoJQ.Toolkit.JQueryMigrate121 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowToolkitInit(FoBoJQ.Toolkit.JQueryMigrate121,"fobo"::"jquery-migrate.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.2.1/js/jquery-migrate-min.js" in {
      rewriteToolkitInit(FoBoJQ.Toolkit.JQueryMigrate121,"fobo"::"jquery-migrate.js"::Nil) must_== 
        List("jquery-migrate", "1.2.1", "js", "jquery-migrate-min.js")
    }        
  }  
  
  "With FoBoJQ.InitParam.ToolKit set to FoBoJQ.JQueryMigrate121 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowInitParam(FoBoJQ.JQueryMigrate121,"fobo"::"jquery-migrate.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.2.1/js/jquery-migrate-min.js" in {
      rewriteInitParam(FoBoJQ.JQueryMigrate121,"fobo"::"jquery-migrate.js"::Nil) must_== 
        List("jquery-migrate", "1.2.1", "js", "jquery-migrate-min.js")
    }        
  }  
  
  //JQuery214
  "With FoBoJQ.Resource.Init set to FoBoJQ.Resource.JQuery214 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBoJQ.Resource.JQuery214,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/2.1.4/js/jquery-min.js" in {
      rewriteResource(FoBoJQ.Resource.JQuery214,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "2.1.4", "js", "jquery-min.js")
    }        
  }   
  
  "With FoBoJQ.Toolkit.Init set to FoBoJQ.Toolkit.JQuery214 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(FoBoJQ.Toolkit.JQuery214,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery-migrate/2.1.4/js/jquery-min.js" in {
      rewriteToolkitInit(FoBoJQ.Toolkit.JQuery214,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "2.1.4", "js", "jquery-min.js")
    }        
  }  
  
  "With FoBoJQ.InitParam.ToolKit set to FoBoJQ.JQuery214 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowInitParam(FoBoJQ.JQuery214,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery-migrate/2.1.4/js/jquery-min.js" in {
      rewriteInitParam(FoBoJQ.JQuery214,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "2.1.4", "js", "jquery-min.js")
    }        
  }   
  
  //JQuery211
  "With FoBoJQ.Resource.Init set to FoBoJQ.Resource.JQuery211 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBoJQ.Resource.JQuery211,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/2.1.1/js/jquery-min.js" in {
      rewriteResource(FoBoJQ.Resource.JQuery211,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "2.1.1", "js", "jquery-min.js")
    }        
  }  
  
  "With FoBoJQ.Toolkit.Init set to FoBoJQ.Toolkit.JQuery211 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(FoBoJQ.Toolkit.JQuery211,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery-migrate/2.1.1/js/jquery-min.js" in {
      rewriteToolkitInit(FoBoJQ.Toolkit.JQuery211,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "2.1.1", "js", "jquery-min.js")
    }        
  }  
  
  "With FoBoJQ.InitParam.ToolKit set to FoBoJQ.JQuery211 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowInitParam(FoBoJQ.JQuery211,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery-migrate/2.1.1/js/jquery-min.js" in {
      rewriteInitParam(FoBoJQ.JQuery211,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "2.1.1", "js", "jquery-min.js")
    }        
  }    
  
  //JQuery1113
  "With FoBoJQ.Resource.Init set to FoBoJQ.Resource.JQuery1113 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBoJQ.Resource.JQuery1113,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/1.11.3/js/jquery-min.js" in {
      rewriteResource(FoBoJQ.Resource.JQuery1113,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.11.3", "js", "jquery-min.js")
    }        
  } 
  
  "With FoBoJQ.Toolkit.Init set to FoBoJQ.Toolkit.JQuery1113 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(FoBoJQ.Toolkit.JQuery1113,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery-migrate/1.11.3/js/jquery-min.js" in {
      rewriteToolkitInit(FoBoJQ.Toolkit.JQuery1113,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.11.3", "js", "jquery-min.js")
    }        
  }  
  
  "With FoBoJQ.InitParam.ToolKit set to FoBoJQ.JQuery1113 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowInitParam(FoBoJQ.JQuery1113,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery-migrate/1.11.3/js/jquery-min.js" in {
      rewriteInitParam(FoBoJQ.JQuery1113,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.11.3", "js", "jquery-min.js")
    }        
  }   
  
  //JQuery1102
  "With FoBoJQ.Resource.Init set to FoBoJQ.Resource.JQuery1102 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBoJQ.Resource.JQuery1102,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/1.10.2/js/jquery-min.js" in {
      rewriteResource(FoBoJQ.Resource.JQuery1102,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.10.2", "js", "jquery-min.js")
    }        
  }  
  
  "With FoBoJQ.Toolkit.Init set to FoBoJQ.Toolkit.JQuery1102 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(FoBoJQ.Toolkit.JQuery1102,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery-migrate/1.10.2/js/jquery-min.js" in {
      rewriteToolkitInit(FoBoJQ.Toolkit.JQuery1102,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.10.2", "js", "jquery-min.js")
    }        
  }  
  
  "With FoBoJQ.InitParam.ToolKit set to FoBoJQ.JQuery1102 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowInitParam(FoBoJQ.JQuery1102,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery-migrate/1.10.2/js/jquery-min.js" in {
      rewriteInitParam(FoBoJQ.JQuery1102,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.10.2", "js", "jquery-min.js")
    }        
  }   
  
  //JQuery191
  "With FoBoJQ.Resource.Init set to FoBoJQ.Resource.JQuery191 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBoJQ.Resource.JQuery191,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/1.9.1/js/jquery-min.js" in {
      rewriteResource(FoBoJQ.Resource.JQuery191,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.9.1", "js", "jquery-min.js")
    }        
  } 
  
  "With FoBoJQ.Toolkit.Init set to FoBoJQ.Toolkit.JQuery191 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(FoBoJQ.Toolkit.JQuery191,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery-migrate/1.9.1/js/jquery-min.js" in {
      rewriteToolkitInit(FoBoJQ.Toolkit.JQuery191,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.9.1", "js", "jquery-min.js")
    }        
  }  
  
  "With FoBoJQ.InitParam.ToolKit set to FoBoJQ.JQuery191 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowInitParam(FoBoJQ.JQuery191,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery-migrate/1.9.1/js/jquery-min.js" in {
      rewriteInitParam(FoBoJQ.JQuery191,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.9.1", "js", "jquery-min.js")
    }        
  }  
  
  //JQuery182
  "With FoBoJQ.Resource.Init set to FoBoJQ.Resource.JQuery182 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBoJQ.Resource.JQuery182,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/1.8.2/js/jquery-min.js" in {
      rewriteResource(FoBoJQ.Resource.JQuery182,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.8.2", "js", "jquery-min.js")
    }        
  }  
  
  "With FoBoJQ.Toolkit.Init set to FoBoJQ.Toolkit.JQuery182 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(FoBoJQ.Toolkit.JQuery182,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery-migrate/1.8.2/js/jquery-min.js" in {
      rewriteToolkitInit(FoBoJQ.Toolkit.JQuery182,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.8.2", "js", "jquery-min.js")
    }        
  }  
  
  "With FoBoJQ.InitParam.ToolKit set to FoBoJQ.JQuery182 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowInitParam(FoBoJQ.JQuery182,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery-migrate/1.8.2/js/jquery-min.js" in {
      rewriteInitParam(FoBoJQ.JQuery182,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.8.2", "js", "jquery-min.js")
    }        
  }    
  
  //JQuery172
  "With FoBoJQ.Resource.Init set to FoBoJQ.Resource.JQuery172 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowResource(FoBoJQ.Resource.JQuery172,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery/1.7.2/js/jquery-min.js" in {
      rewriteResource(FoBoJQ.Resource.JQuery172,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.7.2", "js", "jquery-min.js")
    }        
  } 
  
  "With FoBoJQ.Toolkit.Init set to FoBoJQ.Toolkit.JQuery172 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowToolkitInit(FoBoJQ.Toolkit.JQuery172,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery-migrate/1.7.2/js/jquery-min.js" in {
      rewriteToolkitInit(FoBoJQ.Toolkit.JQuery172,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.7.2", "js", "jquery-min.js")
    }        
  }  
  
  "With FoBoJQ.InitParam.ToolKit set to FoBoJQ.JQuery172 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowInitParam(FoBoJQ.JQuery172,"fobo"::"jquery.js"::Nil) must_== true 
    }     
    "rewrit fobo/jquery.js to jquery-migrate/1.7.2/js/jquery-min.js" in {
      rewriteInitParam(FoBoJQ.JQuery172,"fobo"::"jquery.js"::Nil) must_== 
        List("jquery", "1.7.2", "js", "jquery-min.js")
    }        
  }   
  
 //=== Toolkit.Init ==============//
  def allowToolkitInit(resource:FoBoJQ.Toolkit,path:List[String]) = {
    FoBoJQ.Toolkit.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteToolkitInit(resource:FoBoJQ.Toolkit,path:List[String]) = {
    FoBoJQ.Toolkit.Init=resource 
    ResourceServer.pathRewriter(path)
  }  
 
  //=== Resource.Init ===============//
  def allowResource(resource:FoBoJQ.Resource,path:List[String]) = {
    FoBoJQ.Resource.Init=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteResource(resource:FoBoJQ.Resource,path:List[String]) = {
    FoBoJQ.Resource.Init=resource 
    ResourceServer.pathRewriter(path)
  }  
  
 //=== InitParam.ToolKit ===============// 
  def allowInitParam(resource:FoBoJQ.FoBoJQ,path:List[String]) = {
    FoBoJQ.InitParam.JQuery=resource 
    ResourceServer.allowedPaths(path)
  } 
 
  def rewriteInitParam(resource:FoBoJQ.FoBoJQ,path:List[String]) = {
    FoBoJQ.InitParam.JQuery=resource 
    ResourceServer.pathRewriter(path)
  }    
  
}