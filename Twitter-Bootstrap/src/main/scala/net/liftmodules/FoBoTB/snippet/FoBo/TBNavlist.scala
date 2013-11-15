package net.liftmodules.FoBoTB.snippet.FoBo

import net.liftweb._
import http._
import common._
import common.Box._
import http.{S, LiftRules}
import sitemap._
import util.Helpers
import xml._

/**
 * ==TBNavList Snippet Bootstrap v2.x==
 * 
 * This snippet object transforms lift SiteMap menu items associated with specified loc 
 * group name's into Twitter Bootsrap Navlist items including nav-header label items and menu dividers from SiteMap entries.
 * 
 * See also the TBLocInfo object in [[net.liftmodules.FoBo]] for various, simple to use, SiteMap manipulation functions.  
 * 
 * '''Snippet Usage:'''
 * {{{<span data-lift="FoBo.TBNavlist.builder?group=[LocGroup name]"></span>}}}
 * 
 * 
 * '''Snippet Params:'''
 * 
 *  - '''Param''' ''group'' - The LocGroup name   
 * 
 * '''Result:''' The above will result in 
 * {{{
 *   <u l class="nav nav-list">...lift SiteMap items associated with the locGroup name...</u l> 
 * }}} 
 * This will be expand into a twitter bootstrap navlist's built from the named 
 * Lift menu locGroup content.
 * 
 * '''Example - Navlist''' Invoke with something like this 
 * {{{<d i v class="well" style="max-width: 340px; padding: 8px 0;">	
      <span data-lift="FoBo.TBNavlist.builder?group=nl1"></span>
 * </d i v>}}}
 * 
 * '''Result:''' This will create a Navlist with menu entries associated with the LocGroup 'nl1'.
 * 
 */
trait TBNavlist extends FlexMenuBuilder with DispatchSnippet {

  // a hack to use structural typing to get around the private[http] on Loc.buildItem
  //type StructBuildItem = {def buildItem(kids: List[MenuItem], current: Boolean, path: Boolean): Box[MenuItem]}  
  
  def dispatch: DispatchIt = overridenDispatch orElse net.liftweb.builtin.snippet.Menu.dispatch

  def overridenDispatch: DispatchIt = {
    case "builder" => ignore => render
  }  
  
  override def expandAll = true
  override def linkToSelf = true
  
  override def renderOuterTag(inner: NodeSeq, top: Boolean): NodeSeq = {
    if (top){
      <ul class="nav nav-list">{inner}</ul>
    }else{
      <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu" >{inner}</ul>
    }
  }
  
  //item.current may halp in setting <li class="active"> on it
  override def renderSelfLinked(item: MenuItem, renderInner: Seq[MenuItem] => NodeSeq): Elem =
    buildInnerTag(<xml:group>{renderLink(item.uri, item.text, item.path,
        item.current)}{renderInner(item.kids)}</xml:group>, item.path, item.current)  
        
  override def renderLink(uri: NodeSeq, text: NodeSeq, path: Boolean, current: Boolean): NodeSeq =
    <a href={uri}>{text}</a>
  
  override def updateForPath(nodes: Elem, path: Boolean): Elem = nodes
  
  override def updateForCurrent(nodes: Elem, current: Boolean): Elem = nodes  
  
  //override def updateTBForCurrent(nodes: NodeSeq, current: Boolean): Elem = nodes  

  override def renderPlaceholder(item: MenuItem, renderInner: Seq[MenuItem] => NodeSeq): Elem =
   buildTBInnerTag(<li class='dropdown'><a href='#' class='dropdown-toggle' data-toggle='dropdown' id='content-dropdown'><span>{item.text}</span> <b class='caret'></b></a>{renderInner(item.kids)}</li>,
      item.path, item.current)        
    
//    buildTBInnerTag(<xml:group><li class='dropdown'><a href='#' class='dropdown-toggle' data-toggle='dropdown' id='content-dropdown'><span>{item.text}</span> <b class='caret'></b></a>{renderInner(item.kids)}</li></xml:group>,
//      item.path, item.current)    
      
//  override def renderPlaceholder(item: MenuItem, renderInner: Seq[MenuItem] => NodeSeq): Elem =
//    buildInnerTag(<xml:group><span>{item.text}</span>{renderInner(item.kids)}</xml:group>,
//      item.path, item.current)            
        
  override def buildItemMenu[A](loc: Loc[A], currLoc: Box[Loc[_]], expandAll: Boolean): List[MenuItem] = {
    val kids: List[MenuItem] = if (expandAll) loc.buildKidMenuItems(loc.menu.kids) else Nil

    loc.asInstanceOf[StructBuildItem].buildItem(kids, currLoc == Full(loc), currLoc == Full(loc)).toList
  }    
  
  override def emptyGroup: NodeSeq = NodeSeq.Empty
  
  override def emptyMenu: NodeSeq =  Text("No Navigation Defined.")
  
  override def emptyPlaceholder: NodeSeq = NodeSeq.Empty
  
  override def buildInnerTag(contents: NodeSeq, path: Boolean, current: Boolean): Elem = {
    if(current){
      updateForCurrent(updateForPath(<li class="active">{ contents }</li>, path), current)
    }else{
      updateForCurrent(updateForPath(<li>{ contents }</li>, path), current)
    }
  }
  
  def buildTBNavHeader(contents: NodeSeq, path: Boolean, current: Boolean): Elem = 
    updateForCurrent(updateForPath(<li class="nav-header">{ contents }</li>, path), current)

  def buildTBDivider(contents: NodeSeq, path: Boolean, current: Boolean): Elem = 
    updateForCurrent(updateForPath(<li class="divider"></li>, path), current)      
      
  def buildTBInnerTag(contents: NodeSeq, path: Boolean, current: Boolean): Elem =
    updateForCurrent(updateForPath({contents}.asInstanceOf[Elem], path), current)   
    
  override def renderSelf(item: MenuItem): NodeSeq = <span>{item.text}</span>        
  
  override def renderSelfNotLinked(item: MenuItem, renderInner: Seq[MenuItem] => NodeSeq): Elem =
    buildInnerTag(<xml:group>{renderSelf(item)}{renderInner(item.kids)}</xml:group>, item.path, item.current)  
  
  override def renderItemInPath(item: MenuItem, renderInner: Seq[MenuItem] => NodeSeq): Elem =
    buildInnerTag(<xml:group>{renderLink(item.uri, item.text, item.path,
        item.current)}{renderInner(item.kids)}</xml:group>, item.path, item.current)  
   
  override def renderItem(item: MenuItem, renderInner: Seq[MenuItem] => NodeSeq): Elem = {
    renderItemWithInfo(item.info, renderInner, item) 
  }

  private def renderItemWithInfo(info: List[net.liftweb.common.Box[Function0[_]]], renderInner: Seq[MenuItem] => NodeSeq, item: MenuItem): Elem = {
    
    def buildWithInfo(f: Function0[_], renderInner: Seq[MenuItem] => NodeSeq, item: MenuItem): Elem = {
      if (f().equals("divider")) {
        buildTBDivider(<xml:group></xml:group>, item.path, item.current)
      } else if (f().equals("nav-header")) {
        buildTBNavHeader(<xml:group>{ item.text }</xml:group>, item.path, item.current)
      } else {
        //Unknown function value do the default thingy
        buildInnerTag(<xml:group>{ renderLink(item.uri, item.text, item.path, item.current) }{ renderInner(item.kids) }</xml:group>, item.path, item.current)
      }
    }
    //http://lift.la/scala-option-lift-box-and-how-to-make-your-co //should probably rewrite this using for comprehension 
    info match {
      case head :: Nil => {
        head match {
          case Full(f) => {
            buildWithInfo(f, renderInner, item)
          }
          case Empty => {
            //hmmm a empty list 
            buildInnerTag(<xml:group>{ renderLink(item.uri, item.text, item.path, item.current) }{ renderInner(item.kids) }</xml:group>, item.path, item.current)
          }
          case Failure(message, _, _) => {
            //something got wrong 
            buildInnerTag(<xml:group>{ renderLink(item.uri, item.text, item.path, item.current) }{ renderInner(item.kids) }</xml:group>, item.path, item.current)
          }
        }
      }
        case head :: tail => {
        head match {
          case Full(f) => {
            buildWithInfo(f, renderInner, item)
          }
          case Empty =>
          case Failure(message, _, _) => ""
        }
        //info list has more elements
        renderItemWithInfo(tail, renderInner, item)
      }
      case Nil => {
        //there was no info
        //var c = item.current
        buildInnerTag(<xml:group>{ renderLink(item.uri, item.text, item.path, item.current) }{ renderInner(item.kids) }</xml:group>, item.path, item.current)
      }
      
    }
  }     

}

object TBNavlist extends TBNavlist