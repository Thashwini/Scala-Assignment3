
object GenerateFibonacciSeries extends App{
  def fibonacci(x:Int):Int = x match{
    case x if(x==0) => 0
    case x if(x==1) => 1
    case x => fibonacci(x-1)+fibonacci(x-2)
  }
  def fibonacciSeries(x:Int):Any ={
    if (x>0) fibonacciSeries(x-1)
    print(fibonacci(x))
    print(",")
  }
  
  fibonacciSeries(3)
}




















