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
  "With fobogcpres.Resource.init set to fobogcpres.Resource.PrettifyJun2011 the ResourceServer" should {
    "allow  fobo/prettify.js" in {
      allowResource(fobogcpres.Resource.PrettifyJun2011,
                    "fobo" :: "prettify.js" :: Nil) must_== true
    }
    "rewrit rewrit fobo/prettify.js to fobo/google-code/js/prettify.js" in {
      rewriteResource(fobogcpres.Resource.PrettifyJun2011,
                      "fobo" :: "prettify.js" :: Nil) must_==
        List("fobo", "google-code", "js", "prettify.js")
    }
  }

  //=== Resource.init ===============//
  def allowResource(resource: fobogcpres.Resource, path: List[String]) = {
    fobogcpres.Resource.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: fobogcpres.Resource, path: List[String]) = {
    fobogcpres.Resource.init = resource
    ResourceServer.pathRewriter(path)
  }

}
