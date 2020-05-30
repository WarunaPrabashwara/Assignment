
object q5 extends App {
  print("enter the number to take the sum of all even numbers less than it: ")
  var c: Int = scala.io.StdIn.readInt()
  if (c % 2 == 0) c = c
  else c = c - 1
  print(sumeven(c))

  def sumeven(c: Int): Int = c match {
    case x if (x == 0) => 0
    case x if (x >= 1) => x + sumeven(x - 2)
    case _             => 0

  }
}
