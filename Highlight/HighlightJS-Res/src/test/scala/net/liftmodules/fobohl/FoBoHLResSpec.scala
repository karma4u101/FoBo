package net.liftmodules

import net.liftweb._
import http._

import org.specs2.mutable.Specification

object FoBoHLResSpec extends Specification {
  "FoBoHLResSpec Specification".title

  sequential

  //HighlightJS930
  "With fobohlres.Resource.init set to fobohlres.Resource.HighlightJS930 the ResourceServer" should {
    "allow  fobo/highlight/highlight.pack.js" in {
      allowResource(
        fobohlres.Resource.HighlightJS930,
        "fobo" :: "highlight" :: "highlight.pack.js" :: Nil) must_== true
    }
    "rewrit rewrit fobo/highlight/highlight.pack.js to fobo/highlight/9.3.0/js/highlight.pack.js" in {
      rewriteResource(
        fobohlres.Resource.HighlightJS930,
        "fobo" :: "highlight" :: "highlight.pack.js" :: Nil) must_==
        List("fobo", "highlight", "9.3.0", "js", "highlight.pack.js")
    }
  }

  //=== Resource.init ===============//
  def allowResource(resource: fobohlres.Resource, path: List[String]) = {
    fobohlres.Resource.init = resource
    ResourceServer.allowedPaths(path)
  }

  def rewriteResource(resource: fobohlres.Resource, path: List[String]) = {
    fobohlres.Resource.init = resource
    ResourceServer.pathRewriter(path)
  }

}
