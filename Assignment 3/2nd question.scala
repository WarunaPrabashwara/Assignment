object 2 extends App{
print "enter the number to take prime numbers upto that" 
val a=scala.io.StdIn.readInt()
  printprime(a) 
def printprime(n :Int) ={
      for(i:Int=2 ; i<n-1 ;i ++) 
          if(isprime(i))  print ( i + " ") 
def isprime(n :Int):Boolean ={
      if(n<=1) return false ;
      for( i :Int =2 ;i<n;i++)  if (n%i ==0) return false 
return true
} 
}   
}
