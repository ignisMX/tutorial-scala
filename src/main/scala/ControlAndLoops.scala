object ControlAndLoops {

  def main(args: Array[String]): Unit = {

    println("isEven")
    println(isEven(2))
    println(isEven(3))

    println("isEvenOrOddOrZero")
    println(isEvenOrOddOrZero(0))
    println(isEvenOrOddOrZero(2))
    println(isEvenOrOddOrZero(3))

    println("whileLoop")
    whileLoop(1)
    whileLoop(5)

    println("forLoopWithRange")
    forLoopWithRange(10)
    forLoopWithRange(3)

    println("forLoopWithString")
    forLoopWithString("Republic of Devs")
    forLoopWithString("Keep Coding")

    println("calcDiscount")
    println(calcDiscount(10))
    println(calcDiscount(50))
    println(calcDiscount(100))
    println(calcDiscount(200))
  }

  private def isEven(number: Int): String = if (number % 2 == 0) "Even" else "Odd"

  private def isEvenOrOddOrZero(number: Int): String = {
    if (number == 0) "Zero"
    else if (number % 2 == 0) "Even"
    else "Odd"
  }

  private def whileLoop(number: Int): Unit = {
    var counter = number
    while (counter < 10) {
      println(s"$counter")
      counter += 1
    }
  }

  private def forLoopWithRange(number: Int): Unit = {

    val range = 1 to number
    for (element <- range) println(s"element: $element")
  }

  private def forLoopWithString(text: String): Unit = {
    for (element <- text) println(s"element: $element")
  }

  private def calcDiscount(price: Double): Double = {
    if (price < 50) price
    else if (price >= 50 && price < 100) price - price * 0.1
    else price - price * 0.15
  }
}
