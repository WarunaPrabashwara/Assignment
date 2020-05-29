
object 1 extends App{
print "enter the number to see if it is a prime"
val a=scala.io.StdIn.readInt()
  isprime(a, 2) 
    def isprime(c: Int,d :Int) = {
           if(c<2) print "false" 
           if (c==2) print "true" 
            if(c%d ==0) print "false" 
           if (d*d>c) print "true" 
           isprime( n, d+1)
  } 
}
