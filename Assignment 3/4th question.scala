object 4 extends App{
val a=scala.io.StdIn.readInt()
     def oddeven(n: Int) = {
if (n < 2)
        return (n % 2 == 0)
    return (oddeven(n - 2))
         } 
if(oddeven(a)==true)
      print "Number is even!"
else:
      print "Number is odd!"
}
