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
 * ==Bs3NavLiList Snippet Bootstrap v3.x==
 * 
 * This snippet object transforms lift SiteMap menu items associated with a specified loc 
 * group name's into a collection of list items.
 * 
 * This is a simple but flexible list item snippet that can be used when constructing li list menus.
 * In addition to normal menu loc items the TBNavLiList dose also support menu headers and dividers 
 * from SiteMap entries, see TBLocInfo the object in [[net.liftmodules.FoBo]] for various, simple to use, 
 * SiteMap manipulation functions.
 * 
 * '''Snippet Usage:'''
 * {{{<span data-lift="FoBo.Bs3NavLiList.builder?group=[LocGroup name]"></span>}}}
 * 
 * 
 * '''Snippet Params:'''
 * 
 *  - '''Param''' ''group'' - The LocGroup name   
 * 
 * '''Result:''' The above will result in 
 * {{{
 *   < l i class="active"><a href="[current active loc link url]" class="">[Loc link text]</a></l i >
 *   < l i class=""><a href="[loc link url]" class="">[Loc link text]</a></l i >
 *    :
 * }}} 
 * This will be expand into a list's built from the named Lift menu locGroup content.
 * 
 * '''Example - A nav menu''' with one (loc) group  
 * {{{< u l class="nav " >	
 *      <span data-lift="FoBo.Bs3NavLiList.builder?group=nav1"></span>
 *     :
 * </u l >}}}
 * 
 * '''Result:''' This will create a list of linked items associated with the specified 
 * LocGroup name 'nav1'.
 * @since v1.2
 */
trait Bs3NavLiList extends FlexMenuBuilder with DispatchSnippet {

  def dispatch: DispatchIt = overridenDispatch orElse net.liftweb.builtin.snippet.Menu.dispatch

  def overridenDispatch: DispatchIt = {
    case "builder" => ignore => render
  }  
  
  override def expandAll = true
  override def linkToSelf = true
  
  override def renderOuterTag(inner: NodeSeq, top: Boolean): NodeSeq = inner
  
  override def renderSelfLinked(item: MenuItem, renderInner: Seq[MenuItem] => NodeSeq): Elem =
    buildInnerTag(<xml:group>{renderLink(item.uri, item.text, item.path,
        item.current)}{renderInner(item.kids)}</xml:group>, item.path, item.current)  
        
  override def renderLink(uri: NodeSeq, text: NodeSeq, path: Boolean, current: Boolean): NodeSeq = {
    if(current){
      <a class="active" href={uri}>{text}</a>
    }else{
      <a class="" href={uri}>{text}</a>
    }
  }
  
  def renderLinkWithTarget(uri: NodeSeq, text: NodeSeq, path: Boolean, current: Boolean,f: Function0[_]): NodeSeq = {
    val t:String = f().asInstanceOf[String] 
    if(current){
      <a class="active" target={t} href={uri}>{text}</a>
    }else{
      <a class="" target={t} href={uri}>{text}</a>
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
  
  
  override def renderSelf(item: MenuItem): NodeSeq = <span>{item.text}</span>        
  
  override def renderSelfNotLinked(item: MenuItem, renderInner: Seq[MenuItem] => NodeSeq): Elem =
    buildInnerTag(<xml:group>{renderSelf(item)}{renderInner(item.kids)}</xml:group>, item.path, item.current)  
  
  override def renderItemInPath(item: MenuItem, renderInner: Seq[MenuItem] => NodeSeq): Elem =
    buildInnerTag(<xml:group>{renderLink(item.uri, item.text, item.path,
        item.current)}{renderInner(item.kids)}</xml:group>, item.path, item.current)  
   
  override def renderItem(item: MenuItem, renderInner: Seq[MenuItem] => NodeSeq): Elem = {
    renderItemWithInfo(item.info, renderInner, item) 
    //renderLink(item.uri, item.text, item.path, item.current).asInstanceOf[Elem]
  }    
  
  
  private def renderItemWithInfo(info: List[net.liftweb.common.Box[Function0[_]]], renderInner: Seq[MenuItem] => NodeSeq, item: MenuItem): Elem = {
    
    def buildWithInfo(f: Function0[_], renderInner: Seq[MenuItem] => NodeSeq, item: MenuItem): Elem = {
      if (f().equals("divider")) {
        buildTBDivider(<xml:group></xml:group>, item.path, item.current)
      } else if (f().equals("nav-header")) {
        buildTBNavHeader(<xml:group>{ item.text }</xml:group>, item.path, item.current)
      } else if (f().equals("_blank") || f().equals("_self") || f().equals("_parent") || f().equals("_top")  ){
        renderLinkWithTarget(item.uri, item.text, item.path, item.current, f ).asInstanceOf[Elem]
      } else {
        //Unknown function value do the default thingy
        renderLink(item.uri, item.text, item.path, item.current).asInstanceOf[Elem]
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

object Bs3NavLiList extends Bs3NavLiList


