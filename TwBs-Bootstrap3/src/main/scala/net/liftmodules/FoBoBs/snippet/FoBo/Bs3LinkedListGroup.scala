package net.liftmodules.FoBoBs.snippet.FoBo

import net.liftweb._
import http._
import common._
import common.Box._
import http.{S, LiftRules}
import sitemap._
import util.Helpers
import xml._

/**
 * ==Bs3LinkedListGroup Snippet Bootstrap v3.x==
 * 
 * This snippet object transforms lift SiteMap menu items associated with a specified loc 
 * group name's into a collection of Bootstrap list group items.
 * 
 * This is a simple but flexible list group item snippet that can be used when constructing list group menus.
 * The current implementation is flat and dose not support transformation of Lift PlaceHolder's and submenu's as for example 
 * the BsNavbar dose nor dose it support transformations into menu headers or menu dividers as the Bootstrap v2 TBNavlist 
 * but you can of course add your own menu section header's between loc groups in the list group as shown in the example below.      
 * 
 * '''Snippet Usage:'''
 * {{{<span data-lift="FoBo.Bs3LinkedListGroup.builder?group=[LocGroup name]"></span>}}}
 * 
 * 
 * '''Snippet Params:'''
 * 
 *  - '''Param''' ''group'' - The LocGroup name   
 * 
 * '''Result:''' The above will result in 
 * {{{
 *   <a class="list-group-item active" href="[current active loc link url]">[Loc link text]</a>
 *   <a class="list-group-item" href="[loc link url]">[Loc link text]</a>
 *    :
 * }}} 
 * This will be expand into a twitter bootstrap navlist's built from the named 
 * Lift menu locGroup content.
 * 
 * '''Example - Linked list group''' with several linked list (loc) groups combined and enclosed in a list group div with a 
 * application specific styled menu section header before the last group. 
 * {{{<d i v class="list-group">	
      <span data-lift="FoBo.Bs3LinkedListGroup.builder?group=lg1"></span>
      <span data-lift="FoBo.Bs3LinkedListGroup.builder?group=user"></span>
      <span class="list-group-item mylgheader">Example menu section header</span>
      <span data-lift="FoBo.Bs3LinkedListGroup.builder?group=lg2"></span>
       :
 * </d i v>}}}
 * 
 * '''Result:''' This will create a list group of linked items associated with the specified 
 * LocGroup names 'lg1, user, lg2, ...'.
 * 
 */
trait Bs3LinkedListGroup extends FlexMenuBuilder with DispatchSnippet {

  def dispatch: DispatchIt = overridenDispatch orElse net.liftweb.builtin.snippet.Menu.dispatch

  def overridenDispatch: DispatchIt = {
    case "builder" => ignore => render
  }  
  
  override def expandAll = true
  override def linkToSelf = true
  
  override def renderOuterTag(inner: NodeSeq, top: Boolean): NodeSeq = inner
  
  override def renderSelfLinked(item: MenuItem, renderInner: Seq[MenuItem] => NodeSeq): Elem =
    renderLink(item.uri, item.text, item.path,item.current).asInstanceOf[Elem]
        
  override def renderLink(uri: NodeSeq, text: NodeSeq, path: Boolean, current: Boolean): NodeSeq = {
    if(current){
      <a class="list-group-item active" href={uri}>{text}</a>
    }else{
      <a class="list-group-item" href={uri}>{text}</a>
    }
  }
  
  override def updateForPath(nodes: Elem, path: Boolean): Elem = nodes
  
  override def updateForCurrent(nodes: Elem, current: Boolean): Elem = nodes  

  override def renderPlaceholder(item: MenuItem, renderInner: Seq[MenuItem] => NodeSeq): Elem =       
      updateForCurrent(updateForPath({item}.asInstanceOf[Elem], item.path), item.current)           
        
  override def buildItemMenu[A](loc: Loc[A], currLoc: Box[Loc[_]], expandAll: Boolean): List[MenuItem] = {
    val kids: List[MenuItem] = if (expandAll) loc.buildKidMenuItems(loc.menu.kids) else Nil
    
    loc.asInstanceOf[StructBuildItem].buildItem(kids, currLoc == Full(loc), currLoc == Full(loc)).toList
  }    
  
  override def emptyGroup: NodeSeq = NodeSeq.Empty
  
  override def emptyMenu: NodeSeq =  Text("No Navigation Defined.")
  
  override def emptyPlaceholder: NodeSeq = NodeSeq.Empty
  
  override def buildInnerTag(contents: NodeSeq, path: Boolean, current: Boolean): Elem = {
      updateForCurrent(updateForPath( {contents}.asInstanceOf[Elem], path), current)
  }
  
  override def renderSelf(item: MenuItem): NodeSeq = <span>{item.text}</span>        
  
  override def renderSelfNotLinked(item: MenuItem, renderInner: Seq[MenuItem] => NodeSeq): Elem =
    buildInnerTag(<xml:group>{renderSelf(item)}{renderInner(item.kids)}</xml:group>, item.path, item.current)  
  
  override def renderItemInPath(item: MenuItem, renderInner: Seq[MenuItem] => NodeSeq): Elem =
    buildInnerTag(<xml:group>{renderLink(item.uri, item.text, item.path,
        item.current)}{renderInner(item.kids)}</xml:group>, item.path, item.current)  
   
  override def renderItem(item: MenuItem, renderInner: Seq[MenuItem] => NodeSeq): Elem = {
    renderLink(item.uri, item.text, item.path, item.current).asInstanceOf[Elem]
    
  }      

}

object Bs3LinkedListGroup extends Bs3LinkedListGroup 