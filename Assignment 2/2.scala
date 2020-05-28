
object takehomesalary extends App {

  def best_profit() = {
    var For_100: Int = 100 * (20 - 3);
    var For_120: Int = 120 * (15 - 3);
    var For_140: Int = 140 * (10 - 3);

    if (cost(For_100) > cost(For_120) && cost (For_100) > cost(For_140)) {
      print("best price is 20 ")
      print(
        " profit from 100,120,140 people respectively"
          + cost(For_100) + "," +
          cost(For_120) + "," +
          cost(For_140)
      )
    } else {
      if (cost(For_120) > cost(For_140)) {
        print("best ticket price is 15 ")
        print(
          " profit from 100,120,140 people respectively"
            + cost(For_100) + "," +
            cost(For_120) + "," +
            cost(For_140)
        )
      } else {
        print("best ticket price is 10 ")
        print(
          " profit from 100,120,140 people respectively"
            + cost(For_100) + "," +
            cost(For_120) + "," +
            cost(For_140)
        )
      }
    }
  }
  def cost(k: Int) = (k - 500);

  best_profit()
}
