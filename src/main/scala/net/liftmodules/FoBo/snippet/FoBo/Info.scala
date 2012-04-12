package net.liftmodules.FoBo.snippet.FoBo

import net.liftmodules.FoBo.BuildInfo
import net.liftweb._
import util._
import common._
import http._
import Helpers._
import scala.xml.{NodeSeq,Text}

object Info extends StatefulSnippet with Loggable {
  
  def dispatch = {
    case "buildInfo" => buildInfo
  }
  
  def buildInfo = {
    "#name *+" #> BuildInfo.name &
    "#version *+" #> BuildInfo.version &
    "#shortVersion *+" #> (StringHelpers.splitAt(BuildInfo.version,"-SNAPSHOT")).head._1 &
    "#scalaVersion *+" #> BuildInfo.scalaVersion &
    "#sbtVersion *+" #> BuildInfo.sbtVersion    
  }
}