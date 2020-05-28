
object CheckEvenOdd extends App{
  def findEvenOdd(x:Int):Boolean=x match{
    case x if(x%2==0) => true
    case x => findOdd(x)
   
  }
  def findOdd(x:Int):Boolean=x match{
    case x if(x%2>0) => false
  }
  def printEO(x:Int):Unit={
    if(findEvenOdd(x)) print("Even\n") else print("Odd")
  }
  printEO(8)
  printEO(3)
}










