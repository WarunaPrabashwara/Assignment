
object q2 extends App {
print("enter the number to see prime numbers upto it: ") 
var c = scala.io.StdIn.readInt()
var k:Int = c-1
for (i<- 2 to c) {
if(isprime(k, 2) ) println (k) 
k=k-1
} 
def isprime(c: Int,d :Int):Boolean = {
if (c<2) return false
else if (c==2) return true
else if (c%d ==0) return false
else if (d*d>c) return true
else isprime(c, d+1)
} 
}

