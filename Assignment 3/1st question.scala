object q1 extends App {
print("enter the number to see if it is a prime: ") 
val c = scala.io.StdIn.readInt()
isprime(c, 2) 

def isprime(c: Int,d :Int):Any = {
if (c<2) print("false") 
else if (c==2) print("true") 
else if (c%d ==0) print("false") 
else if (d*d>c) print("true") 
else isprime(c, d+1)
} 
}
