package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

import org.specs2.mutable.Specification

object FoBoTetSpec extends Specification {
  "FoBoTetSpec Specification".title

  sequential

  //Tether140
  "With FoBoTet.Toolkit.Init set to FoBoTet.Toolkit.Tether140 the ResourceServer" should {
    "allow  fobo/tether.js" in {
      allowToolkitInit(FoBoTet.Toolkit.Tether140, "fobo" :: "tether.js" :: Nil) must_== true
    }
    "rewrit fobo/tether.js to fobo/tether/1.4.0/js/tether.min.js" in {
      rewriteToolkitInit(FoBoTet.Toolkit.Tether140,
                         "fobo" :: "tether.js" :: Nil) must_==
        List("fobo", "tether", "1.4.0", "js", "tether.min.js")
    }
  }

  "With FoBoTet.Resource.Init set to FoBoTet.Resource.Tether140 the ResourceServer" should {
    "allow  fobo/tether.js" in {
      allowResource(FoBoTet.Resource.Tether140, "fobo" :: "tether.js" :: Nil) must_== true
    }
    "rewrit fobo/tether.js to fobo/tether/1.4.0/js/tether.min.js" in {
      rewriteResource(FoBoTet.Resource.Tether140, "fobo" :: "tether.js" :: Nil) must_==
        List("fobo", "tether", "1.4.0", "js", "tether.min.js")
    }
  }

  //=== Toolkit.Init ==============//
  def allowToolkitInit(resource: FoBoTet.Toolkit, path: List[String]) = {
    FoBoTet.Toolkit.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteToolkitInit(resource: FoBoTet.Toolkit, path: List[String]) = {
    FoBoTet.Toolkit.Init = resource
    ResourceServer.pathRewriter(path)
  }

  //=== Resource.Init ===============//
  def allowResource(resource: FoBoTet.Resource, path: List[String]) = {
    FoBoTet.Resource.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: FoBoTet.Resource, path: List[String]) = {
    FoBoTet.Resource.Init = resource
    ResourceServer.pathRewriter(path)
  }

}
