package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

object FoBoFAAPISpec extends Specification {
  "FoBoFAAPISpec Specification".title

  sequential
  
  "With FoBoFA.InitParam.ToolKit set to FoBoFA.FontAwesome321 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowFontAwesome321 must_== true 
    }    
    "rewrit fobo/font-awesome.css to fobo/font-awesome/3.2.1/css/font-awesome.css" in {
      rewriteFontAwesome321CSS must_== List("fobo", "font-awesome", "3.2.1", "css", "font-awesome-min.css")
    }       
  } 
  
  "With FoBoFA.InitParam.ToolKit set to FoBoFA.FontAwesome410 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowFontAwesome410 must_== true 
    }     
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.1.0/css/font-awesome.css" in {
      rewriteFontAwesome410CSS must_== List("fobo", "font-awesome", "4.1.0", "css", "font-awesome.min.css")
    }       
  }  
  
  "With FoBoFA.InitParam.ToolKit set to FoBoFA.FontAwesome410 the ResourceServer" should {
    "allow  fobo/font-awesome.css" in {
      allowFontAwesome430 must_== true 
    }     
    "rewrit fobo/font-awesome.css to fobo/font-awesome/4.1.0/css/font-awesome.css" in {
      rewriteFontAwesome430CSS must_== List("fobo", "font-awesome", "4.3.0", "css", "font-awesome.min.css")
    }       
  }    
  
  def allowFontAwesome321 = {
    ResourceServer 
    FoBoFA.InitParam.ToolKit=FoBoFA.FontAwesome321
    ResourceServer.allowedPaths("fobo"::"font-awesome.css"::Nil)
  }    
  def rewriteFontAwesome321CSS = {
    FoBoFA.InitParam.ToolKit=FoBoFA.FontAwesome321
    ResourceServer.pathRewriter("fobo"::"font-awesome.css"::Nil)
  }  
   
  def allowFontAwesome410 = {
    ResourceServer 
    FoBoFA.InitParam.ToolKit=FoBoFA.FontAwesome410
    ResourceServer.allowedPaths("fobo"::"font-awesome.css"::Nil)
  }  
  def rewriteFontAwesome410CSS = {
    FoBoFA.InitParam.ToolKit=FoBoFA.FontAwesome410
    ResourceServer.pathRewriter("fobo"::"font-awesome.css"::Nil)
  }    

  def allowFontAwesome430 = {
    ResourceServer 
    FoBoFA.InitParam.ToolKit=FoBoFA.FontAwesome430
    ResourceServer.allowedPaths("fobo"::"font-awesome.css"::Nil)
  }  
  def rewriteFontAwesome430CSS = {
    FoBoFA.InitParam.ToolKit=FoBoFA.FontAwesome430
    ResourceServer.pathRewriter("fobo"::"font-awesome.css"::Nil)
  }   
  
}