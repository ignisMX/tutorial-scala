object Functions {

  def main(args: Array[String]): Unit = {
    println(isEven(3))
    println(isEven(4))

    println(namedArguments(1, "Republic of devs"))
    println(namedArguments(text = "Republic of devs", number = 1))

    println(defaultValue(1, "Keep coding"))
    println(defaultValue(text = "Keep coding", number = 2))
    println(defaultValue(number = 3))
    println(defaultValue(3))
  }

  private def isEven(number: Int): Boolean = {
    number % 2 == 0
  }

  private def namedArguments(number: Int, text: String): String = s"$number - $text"

  private def defaultValue(number: Int, text: String = "Republic of devs"): String = s"$number - $text"

  //this function does not have implementation.
  //it is abstract. Should not be called
  private def abstractFunction(number: Int): Int = ???
}
