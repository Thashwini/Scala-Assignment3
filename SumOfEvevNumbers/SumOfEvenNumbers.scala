
object SumOfEvenNumbers extends App{
  def sumOfEven(n:Int,x:Int=2):Int= x match{
    case x if(x>=n) => 0
    case x => x+sumOfEven(n,x+2)
  }
  println(sumOfEven(10))

}
