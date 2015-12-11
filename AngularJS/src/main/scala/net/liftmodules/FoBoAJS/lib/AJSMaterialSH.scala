package net.liftmodules.FoBoAJS.lib

import net.liftweb.util._

/**
 * ==Angular Material Design Script Helper==
 * Angular Material Design script helper is a helper class that implements some commonly 
 * used material design component script functions.
 * 
 */
class AJSMaterialSH extends ScriptHelper {
 
  //due to the use of default arguments we can't use overloaded functions (same name) as the compiler can't handle it
  /**
   * Wraps a lift message in a Material Design Toast component.
   * 
   * '''Example'''
   * In your "app js" file you you can set up the toast themes like this.
   * {{{
   * app.config(function($mdThemingProvider) {
   *  :
   *  $mdThemingProvider.theme('error-toast').primaryPalette('red').accentPalette('orange');
   *  $mdThemingProvider.theme('warning-toast').primaryPalette('orange').accentPalette('deep-orange');
   *  $mdThemingProvider.theme('success-toast').primaryPalette('green');
   * });
   * }}}
   * 
   * In your "app css" file you could set up something like this.
   * {{{
   *  md-toast.md-success-toast-theme {
   *    background-color: #5cb85c;
   *  }
   *  md-toast.md-warning-toast-theme {
   *    background-color: #f0ad4e;
   *  }
   *  md-toast.md-error-toast-theme {
   *    background-color: #d9534f;
   *  }
   * }}}
   * 
   * In your Scala code you could wrap the message in a Toast like this.
   * {{{
   * import net.liftmodules.FoBoAJS.lib.{AJSMaterialSH => msh}
   *   :
   *   :
   *   S.notice(msh.mdToastWrapMsg(msg,theme="success-toast"))
   *   :
   *   S.error(msh.mdToastWrapMsg(msg,theme="error-toast"))
   * }}}
   * 
   * 
   * @param String msg - The message to display.
   * @param String position - The position of the toast message. If not provided defaults to 'bottom left' 
   * @param String theme - The color theme to use for the Toast component. If not provided some none 
   *        theme specific color will be used.
   * @return scala.xml.NodeSeq   
   */
  def mdToastWrapMsg(msg:String, position:String="bottom left" ,theme:String=""):scala.xml.NodeSeq = {
    val initFunc = """showSimpleToast('%s','%s','%s');""".format(msg,position,theme)
    return <div ng-controller='LiftMsgToastCtrl' ng-init={initFunc}></div>
  }

  /**
   * Wraps a lift message in a Material Design Toast component.
   * 
   * '''Example'''
   * In your "app js" file you you can set up the toast themes like this.
   * {{{
   * app.config(function($mdThemingProvider) {
   *  :
   *  $mdThemingProvider.theme('error-toast').primaryPalette('red').accentPalette('orange');
   *  $mdThemingProvider.theme('warning-toast').primaryPalette('orange').accentPalette('deep-orange');
   *  $mdThemingProvider.theme('success-toast').primaryPalette('green');
   * });
   * }}}
   * 
   * In your "app css" file you could set up something like this.
   * {{{
   *  md-toast.md-success-toast-theme {
   *    background-color: #5cb85c;
   *  }
   *  md-toast.md-warning-toast-theme {
   *    background-color: #f0ad4e;
   *  }
   *  md-toast.md-error-toast-theme {
   *    background-color: #d9534f;
   *  }
   * }}}
   * 
   * In your Scala code you could wrap the message in a Toast like this.
   * {{{
   * import net.liftmodules.FoBoAJS.lib.{AJSMaterialSH => msh}
   *   :
   *   :
   *   S.notice(msh.mdToastWrapNSMsg(msg,theme="success-toast"))
   *   :
   *   S.error(msh.mdToastWrapNSMsg(msg,theme="error-toast"))
   * }}}
   * 
   * 
   * @param scala.xml.NodeSeq msg - The message to display.
   * @param String position - The position of the toast message. If not provided defaults to 'bottom left' 
   * @param String theme - The color theme to use for the Toast component. If not provided some none 
   *        theme specific color will be used.
   * @return scala.xml.NodeSeq   
   */  
  def mdToastWrapNSMsg(msg:scala.xml.NodeSeq, position:String="bottom left" ,theme:String=""):scala.xml.NodeSeq = {
    val initFunc = """showSimpleToast('%s','%s','%s');""".format(msg,position,theme)
    return <div ng-controller='LiftMsgToastCtrl' ng-init={initFunc}></div>
  }
  
  /**
   * Wraps a lift message in a Material Design Toast component.
   * 
   * '''Example'''
   * In your "app js" file you you can set up the toast themes like this.
   * {{{
   * app.config(function($mdThemingProvider) {
   *  :
   *  $mdThemingProvider.theme('error-toast').primaryPalette('red').accentPalette('orange');
   *  $mdThemingProvider.theme('warning-toast').primaryPalette('orange').accentPalette('deep-orange');
   *  $mdThemingProvider.theme('success-toast').primaryPalette('green');
   * });
   * }}}
   * 
   * In your "app css" file you could set up something like this.
   * {{{
   *  md-toast.md-success-toast-theme {
   *    background-color: #5cb85c;
   *  }
   *  md-toast.md-warning-toast-theme {
   *    background-color: #f0ad4e;
   *  }
   *  md-toast.md-error-toast-theme {
   *    background-color: #d9534f;
   *  }
   * }}}
   * 
   * In your Scala code you could wrap the message in a Toast like this.
   * {{{
   * import net.liftmodules.FoBoAJS.lib.{AJSMaterialSH => msh}
   *   :
   *   :
   *   S.notice(msh.mdToastWrapFEMsg(vi,theme="success-toast"))
   *   :
   *   S.error(msh.mdToastWrapFEMsg(vi,theme="error-toast"))
   * }}}
   * 
   * 
   * @param List[FieldError] vi - The message to display.
   * @param String position - The position of the toast message. If not provided defaults to 'bottom left' 
   * @param String theme - The color theme to use for the Toast component. If not provided some none 
   *        theme specific color will be used.
   * @return scala.xml.NodeSeq   
   */   
  def mdToastWrapFEMsg(vi: List[FieldError], position:String="bottom left" ,theme:String=""):scala.xml.NodeSeq = {
    val msg:scala.xml.NodeSeq = (vi.map{ i => i.msg}).lift(0).getOrElse(<span>Something whent wrong!</span>);
    val initFunc = """showSimpleToast('%s','%s','%s');""".format(msg,position,theme)
    return <div ng-controller='LiftMsgToastCtrl' ng-init={initFunc}></div>
  }  
  
}