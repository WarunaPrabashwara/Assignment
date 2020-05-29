object takehomesalary extends App {
  for (i <- 1 to 10) profit(i)

  def profit(i: Int) = {
    printf("profit when ticket price is  %d is %d \n",(i * 5),(180 - 20 * i) * (5 * i - 3) - 500 )
  }

}
