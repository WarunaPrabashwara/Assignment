object q4 extends App {
print( "enter a number to see if it is odd") 
val a = scala.io.StdIn.readInt()
print(isodd(a)) 
def iseven(n:Int) :Boolean= n match {
case 0 => true
case _ =>isodd(n-1)
}
def isodd(n:Int) :Boolean	 =!(iseven(n))

  
}
