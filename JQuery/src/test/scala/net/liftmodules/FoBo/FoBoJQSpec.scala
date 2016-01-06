package net.liftmodules

import net.liftweb._
import net.liftweb.http._
import net.liftweb.common._
import org.specs2.mutable.Specification

object FoBoJQSpec extends Specification {
  "FoBoJQSpec Specification".title

  sequential
  
  "With FoBoJQ.InitParam.JQuery set to FoBoJQ.JQuery191 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowJQuery191 must_== true 
    }
    "rewrit fobo/jquery.js to jquery/1.9.1/js/jquery-min.js" in  {
      rewriteJQuery191JS must_== List("jquery", "1.9.1", "js", "jquery-min.js") 
    } 
  } 
  
  "With FoBoJQ.InitParam.JQuery set to FoBoJQ.JQueryMigrate121 the ResourceServer" should {
    "allow  fobo/jquery-migrate.js" in {
      allowJQueryMigrate121 must_== true 
    }
    "rewrit fobo/jquery-migrate.js to jquery-migrate/1.2.1/js/jquery-migrate-min.js" in {
      rewriteJQueryMigrate121JS must_== List("jquery-migrate", "1.2.1", "js", "jquery-migrate-min.js") 
    }        
  }
  
  "With FoBoJQ.InitParam.JQuery set to FoBoJQ.JQuery1102 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowJQuery1102 must_== true 
    } 
    "rewrit fobo/jquery.js to jquery/1.10.2/js/jquery-min.js" in {
      rewriteJQuery1102JS must_== List("jquery", "1.10.2", "js", "jquery-min.js")
    }   
  }  
  
  "With FoBoJQ.InitParam.JQuery set to FoBoJQ.JQuery214 the ResourceServer" should {
    "allow  fobo/jquery.js" in {
      allowJQuery214 must_== true 
    } 
    "rewrit fobo/jquery.js to jquery/2.1.4/js/jquery-min.js" in {
      rewriteJQuery214JS must_== List("jquery", "2.1.4", "js", "jquery-min.js")
    }    
  }  
  
  
  def allowJQueryMigrate121 = {
    ResourceServer 
    FoBoJQ.InitParam.JQuery=FoBoJQ.JQueryMigrate121
    ResourceServer.allowedPaths("fobo"::"jquery-migrate.js"::Nil)
  }   
  def rewriteJQueryMigrate121JS = {
     FoBoJQ.InitParam.JQuery=FoBoJQ.JQueryMigrate121
     ResourceServer.pathRewriter("fobo"::"jquery-migrate.js"::Nil)  
  } 
  
  def allowJQuery214 = {
    ResourceServer 
    FoBoJQ.InitParam.JQuery=FoBoJQ.JQuery214
    ResourceServer.allowedPaths("fobo"::"jquery.js"::Nil)
  }  
  def rewriteJQuery214JS = {
    FoBoJQ.InitParam.JQuery=FoBoJQ.JQuery214
    ResourceServer.pathRewriter("fobo"::"jquery.js"::Nil)
  } 
  
  def allowJQuery1102 = {
    ResourceServer 
    FoBoJQ.InitParam.JQuery=FoBoJQ.JQuery1102
    ResourceServer.allowedPaths("fobo"::"jquery.js"::Nil)
  }  
  def rewriteJQuery1102JS = {
    FoBoJQ.InitParam.JQuery=FoBoJQ.JQuery1102
    ResourceServer.pathRewriter("fobo"::"jquery.js"::Nil)
  } 
  
  def allowJQuery191 = {
    ResourceServer 
    FoBoJQ.InitParam.JQuery=FoBoJQ.JQuery191
    ResourceServer.allowedPaths("fobo"::"jquery.js"::Nil)
  }  
  def rewriteJQuery191JS =  {
    FoBoJQ.InitParam.JQuery=FoBoJQ.JQuery191
    ResourceServer.pathRewriter("fobo"::"jquery.js"::Nil)
  }   
  
  def allowJQuery182 = {
    ResourceServer 
    FoBoJQ.InitParam.JQuery=FoBoJQ.JQuery182
    ResourceServer.allowedPaths("fobo"::"jquery.js"::Nil)
  }  
  def rewriteJQuery182JS = {
    FoBoJQ.InitParam.JQuery=FoBoJQ.JQuery182
    ResourceServer.pathRewriter("fobo"::"jquery.js"::Nil)
  } 
  
  def allowJQuery172 = {
    ResourceServer 
    FoBoJQ.InitParam.JQuery=FoBoJQ.JQuery172
    ResourceServer.allowedPaths("fobo"::"jquery.js"::Nil)
  }  
  def rewriteJQuery172JS =  {
    FoBoJQ.InitParam.JQuery=FoBoJQ.JQuery172
    ResourceServer.pathRewriter("fobo"::"jquery.js"::Nil)
  }   
  
}