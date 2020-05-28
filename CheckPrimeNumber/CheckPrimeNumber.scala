
object CheckPrimeNumber extends App{
  def gcd(a:Int,b:Int):Int=b match{
    case 0 => a
    case b if (b>a)=> gcd(b,a)
    case _ => gcd(b,a%b)
  }
  def findPrimeNumber(n:Int,x:Int=2):Boolean = x match{
    case x if(x==n) => true
    case x if gcd(n,x)>1 => false
    case x => findPrimeNumber(n,x+1)
  }
  println(findPrimeNumber(5))
  println(findPrimeNumber(8))
}

