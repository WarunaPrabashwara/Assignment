object q6 extends App {
def fib(n:Int) :Int = n match {
    case 0 => 0
    case x if(x==1) =>n
    case x => fib(x-1) + fib(x-2)
} 

def printfib(n1:Int, n:Int=0):Any ={
 if(n1 >= n) {
print(fib(n) +" ") 
printfib(n1, n+1)
} 
} 

print ("Enter number to see the fibonacci numbers upto it") 
var num: Int = scala.io.StdIn.readInt() 
printfib(num) 

}
