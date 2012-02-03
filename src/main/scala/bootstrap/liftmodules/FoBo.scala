package net.liftmodules 
package FoBo 
  
object FoBo {
  def init() {
    net.liftweb.http.ResourceServer.allow {
      case  "fobo" :: _ :: Nil => true
      case  "fobo" :: _ :: _ :: Nil => true
      case  "fobo" :: _ :: _ :: _ :: Nil => true
    } 
    
  }
}

