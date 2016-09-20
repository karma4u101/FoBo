package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

import org.specs2.mutable.Specification

object FoBoPaSpec extends Specification {
  "FoBoPaSpec Specification".title

  sequential

  //Pace102
  "With FoBoPa.Toolkit.Init set to FoBoPa.Toolkit.Pace102 the ResourceServer" should {
    "allow  fobo/pace.js" in {
      allowToolkitInit(FoBoPa.Toolkit.Pace102, "fobo" :: "pace.js" :: Nil) must_== true
    }
    "rewrit fobo/pace.js to fobo/pace/1.0.2/js/pace.min.js" in {
      rewriteToolkitInit(FoBoPa.Toolkit.Pace102, "fobo" :: "pace.js" :: Nil) must_==
        List("fobo", "pace", "1.0.2", "js", "pace.min.js")
    }
    "rewrit fobo/black/pace-theme-minimal.css to fobo/pace/1.0.2/css/themes/black/pace-theme-minimal.css" in {
      rewriteToolkitInit(
        FoBoPa.Toolkit.Pace102,
        "fobo" :: "black" :: "pace-theme-minimal.css" :: Nil) must_==
        List("fobo",
             "pace",
             "1.0.2",
             "css",
             "themes",
             "black",
             "pace-theme-minimal.css")
    }
  }

  "With FoBoPa.Resource.Init set to FoBoPa.Resource.Pace102 the ResourceServer" should {
    "allow  fobo/pace.js" in {
      allowResource(FoBoPa.Resource.Pace102, "fobo" :: "pace.js" :: Nil) must_== true
    }
    "rewrit fobo/pace.js to fobo/pace/1.0.2/js/pace.min.js" in {
      rewriteResource(FoBoPa.Resource.Pace102, "fobo" :: "pace.js" :: Nil) must_==
        List("fobo", "pace", "1.0.2", "js", "pace.min.js")
    }
    "rewrit fobo/black/pace-theme-minimal.css to fobo/pace/1.0.2/css/themes/black/pace-theme-minimal.css" in {
      rewriteResource(
        FoBoPa.Resource.Pace102,
        "fobo" :: "black" :: "pace-theme-minimal.css" :: Nil) must_==
        List("fobo",
             "pace",
             "1.0.2",
             "css",
             "themes",
             "black",
             "pace-theme-minimal.css")
    }
  }

  //Pace0415
  "With FoBoPa.InitParam.ToolKit set to FoBoPa.Pace0415 the ResourceServer" should {
    "allow  fobo/pace.js" in {
      allowInitParam(FoBoPa.Pace0415, "fobo" :: "pace.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/pace/0.4.15/js/pace.min.js" in {
      rewriteInitParam(FoBoPa.Pace0415, "fobo" :: "pace.js" :: Nil) must_==
        List("fobo", "pace", "0.4.15", "js", "pace.min.js")
    }
  }

  "With FoBoPa.Toolkit.Init set to FoBoPa.Toolkit.Pace0415 the ResourceServer" should {
    "allow  fobo/pace.js" in {
      allowToolkitInit(FoBoPa.Toolkit.Pace0415, "fobo" :: "pace.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/pace/0.4.15/js/pace.min.js" in {
      rewriteToolkitInit(FoBoPa.Toolkit.Pace0415, "fobo" :: "pace.js" :: Nil) must_==
        List("fobo", "pace", "0.4.15", "js", "pace.min.js")
    }
  }

  "With FoBoPa.Resource.Init set to FoBoPa.Resource.Pace0415 the ResourceServer" should {
    "allow  fobo/pace.js" in {
      allowResource(FoBoPa.Resource.Pace0415, "fobo" :: "pace.js" :: Nil) must_== true
    }
    "rewrit fobo/angular.js to fobo/pace/0.4.15/js/pace.min.js" in {
      rewriteResource(FoBoPa.Resource.Pace0415, "fobo" :: "pace.js" :: Nil) must_==
        List("fobo", "pace", "0.4.15", "js", "pace.min.js")
    }
  }

  //=== Toolkit.Init ==============//
  def allowToolkitInit(resource: FoBoPa.Toolkit, path: List[String]) = {
    FoBoPa.Toolkit.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteToolkitInit(resource: FoBoPa.Toolkit, path: List[String]) = {
    FoBoPa.Toolkit.Init = resource
    ResourceServer.pathRewriter(path)
  }

  //=== InitParam.ToolKit ===============//
  def allowInitParam(resource: FoBoPa.PaToolkit, path: List[String]) = {
    FoBoPa.InitParam.ToolKit = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteInitParam(resource: FoBoPa.PaToolkit, path: List[String]) = {
    FoBoPa.InitParam.ToolKit = resource
    ResourceServer.pathRewriter(path)
  }

  //=== Resource.Init ===============//
  def allowResource(resource: FoBoPa.Resource, path: List[String]) = {
    FoBoPa.Resource.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: FoBoPa.Resource, path: List[String]) = {
    FoBoPa.Resource.Init = resource
    ResourceServer.pathRewriter(path)
  }

}
