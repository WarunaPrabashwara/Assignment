object q3 extends App{
def sum(n:Int):Int = n match {
     case n if (n==0) => 0
     case n if (n>=1) => n+sum(n-1)
     case _ => return 0 ;
}
print("enter a number to take the sum upto it")
val a = scala.io.StdIn.readInt()
println("sum is:" +sum(a)) ;
}
