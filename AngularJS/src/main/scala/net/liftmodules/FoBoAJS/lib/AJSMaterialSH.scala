package net.liftmodules.FoBoAJS.lib

/**
 * @author peter
 */
class AJSMaterialSH extends ScriptHelper {
 
  def mdToastWrapMsg(msg:String, position:String="bottom left" ,theme:String=""):scala.xml.NodeSeq = {
    val initFunc = """showSimpleToast('%s','%s','%s');""".format(msg,position,theme)
    return <div ng-controller='LiftMsgToastCtrl' ng-init={initFunc}></div>
  }

  def mdToastWrapNSMsg(msg:scala.xml.NodeSeq, position:String="bottom left" ,theme:String=""):scala.xml.NodeSeq = {
    val initFunc = """showSimpleToast('%s','%s','%s');""".format(msg,position,theme)
    return <div ng-controller='LiftMsgToastCtrl' ng-init={initFunc}></div>
  }
  
}