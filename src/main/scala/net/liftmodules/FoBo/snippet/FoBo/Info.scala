package net.liftmodules.FoBo.snippet.FoBo

import net.liftmodules.FoBo.lib.BuildInfo
import net.liftweb._
import util._
import common._
import http._
import Helpers._
import scala.xml.{NodeSeq,Text}

/**
 * ==Info Snippet==
 * 
 * This snippet object contains transform functions containing some FoBo Information  
 * 
 * '''Example''' Invoke with 
 * {{{ <span data-lift="FoBo.Info.buildInfo" id="shortVersion">v</span> }}} 
 * '''Result:''' This will append the current FoBo version in place of the snippet invocation:
 * {{{ <span>vX.Y.Z</span> }}}  
 * For more examples see the individual transform functions.
 */
object Info extends StatefulSnippet with Loggable {
  
  def dispatch = {
    case "buildInfo" => buildInfo
  }
  
  /**
   * This transform function uses [[net.liftmodules.FoBo.lib.BuildInfo]] to give you access to 
   * some FoBo build info via css selectors.
   * 
   * '''Example''' Invoke with  
   * {{{ <span data-lift="FoBo.Info.buildInfo" id="id parameter">What ever: </span> }}} 
   *
   * '''Result:''' This will append the data of the id parameter in place of the snippet invocation:
   * {{{ <span>What ever: The corresponding id parameter data</span> }}}  
   * 
   * '''Id parameters'''
   *  - name - The sbt build name parameter
   *  - version - The sbt version parameter
   *  - shortVersion - The sbt version parameter stripped from ev. "-SNAPSHOT" part.
   *  - scalaVersion - The sbt scala version parameter.
   *  - sbtVersion - The sbt version.
   */
  def buildInfo = {
    "#name *+" #> BuildInfo.name &
    "#version *+" #> BuildInfo.version &
    "#shortVersion *+" #> (BuildInfo.version.replace("-SNAPSHOT","").split("-")).last &
    "#scalaVersion *+" #> BuildInfo.scalaVersion &
    "#sbtVersion *+" #> BuildInfo.sbtVersion    
  }
}