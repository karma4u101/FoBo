object sandbox {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  abstract sealed trait ToolKit
  object ToolKit extends ToolKit {
    //var Init:ToolKit = null //replace with List below
    //we dont actually need the saved ToolKit objects (for now)
    //so lets just save the object name, we can easely change this if we need to
    private type TKL = List[String] //List[ToolKit]
    private var tkl:TKL = List()
    def Init:TKL = tkl
    def Init_=(t:ToolKit):TKL = {
      tkl = if (tkl contains t.toString) tkl else t.toString :: tkl
      tkl
    }
    case object X1 extends ToolKit {
       println("X1");
    }
    case object X2 extends ToolKit {
       println("X2");
    }
  }
  
  ToolKit.Init=ToolKit.X1                         //> X1
                                                  //| res0: sandbox.ToolKit.TKL = List(X1)
  ToolKit.Init = ToolKit.X1                       //> res1: sandbox.ToolKit.TKL = List(X1)
  ToolKit.Init=ToolKit.X2                         //> X2
                                                  //| res2: sandbox.ToolKit.TKL = List(X2, X1)
  
}