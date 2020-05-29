
object q4 extends App {
  val a = scala.io.StdIn.readInt()
  def oddeven(n: Int): Boolean = if (n < 2) (n % 2 == 0) else (oddeven(n - 2))

  if (oddeven(a) == true)
    print("Number is even!")
  else
    print("Number is odd!")
}
