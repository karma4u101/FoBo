package net.liftmodules.FoBoAJS.lib

import net.liftweb.util._

/**
 * @author peter
 */
class AJSMaterialSH extends ScriptHelper {
 
  //due to the use of default arguments we can't use overloaded functions (same name) as the compiler can't handle it
  
  def mdToastWrapMsg(msg:String, position:String="bottom left" ,theme:String=""):scala.xml.NodeSeq = {
    val initFunc = """showSimpleToast('%s','%s','%s');""".format(msg,position,theme)
    return <div ng-controller='LiftMsgToastCtrl' ng-init={initFunc}></div>
  }

  def mdToastWrapNSMsg(msg:scala.xml.NodeSeq, position:String="bottom left" ,theme:String=""):scala.xml.NodeSeq = {
    val initFunc = """showSimpleToast('%s','%s','%s');""".format(msg,position,theme)
    return <div ng-controller='LiftMsgToastCtrl' ng-init={initFunc}></div>
  }
  
  def mdToastWrapFEMsg(vi: List[FieldError], position:String="bottom left" ,theme:String=""):scala.xml.NodeSeq = {
    val msg:scala.xml.NodeSeq = (vi.map{ i => i.msg}).lift(0).getOrElse(<span>Something whent wrong!</span>);
    val initFunc = """showSimpleToast('%s','%s','%s');""".format(msg,position,theme)
    return <div ng-controller='LiftMsgToastCtrl' ng-init={initFunc}></div>
  }  
  
}