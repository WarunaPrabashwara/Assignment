object 5 extends App{
val a=scala.io.StdIn.readInt()
 sumeven(a) 
k:Int=0
    def sumeven(n: Int) = {
      if(n>0){
      if (n%2==0) n=n+sumeven(n-2) 
       if(n%2==1){ sumeven(n-1)  k=1}
if (k=1)
print n
else print n-a
   } 
  } 
