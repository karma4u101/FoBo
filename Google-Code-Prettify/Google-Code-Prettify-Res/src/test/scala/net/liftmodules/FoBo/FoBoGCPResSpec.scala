package net.liftmodules

import net.liftweb._
import util.{Props}
import http._
import common._

import org.specs2.mutable.Specification

object FoBoGCPResSpec extends Specification {
  "FoBoGCPResSpec Specification".title

  sequential

  //PrettifyJun2011
  "With FoBoGCPRes.Resource.Init set to FoBoGCPRes.Resource.PrettifyJun2011 the ResourceServer" should {
    "allow  fobo/prettify.js" in {
      allowResource(FoBoGCPRes.Resource.PrettifyJun2011,
                    "fobo" :: "prettify.js" :: Nil) must_== true
    }
    "rewrit rewrit fobo/prettify.js to fobo/google-code/js/prettify.js" in {
      rewriteResource(FoBoGCPRes.Resource.PrettifyJun2011,
                      "fobo" :: "prettify.js" :: Nil) must_==
        List("fobo", "google-code", "js", "prettify.js")
    }
  }

  //=== Resource.Init ===============//
  def allowResource(resource: FoBoGCPRes.Resource, path: List[String]) = {
    FoBoGCPRes.Resource.Init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: FoBoGCPRes.Resource, path: List[String]) = {
    FoBoGCPRes.Resource.Init = resource
    ResourceServer.pathRewriter(path)
  }

}
