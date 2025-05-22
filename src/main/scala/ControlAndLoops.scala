object ControlAndLoops {

  def main(args: Array[String]): Unit = {

    println("isEven")
    println(isEven(2))
    println(isEven(3))

    println("isEvenOrOddOrZero")
    println(isEvenOrOddOrZero(0))
    println(isEvenOrOddOrZero(2))
    println(isEvenOrOddOrZero(3))
  }

  private def isEven(number: Int):String = if(number % 2 == 0) "Even" else "Odd"

  private def isEvenOrOddOrZero(number: Int):String = {
    if(number == 0) "Zero"
    else if (number % 2 == 0) "Even"
    else "Odd"
  }
}
