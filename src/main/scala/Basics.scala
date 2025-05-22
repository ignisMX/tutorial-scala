object Basics {
  def main(args: Array[String]): Unit = {
    val name = "Keep coding"
    println(name.head)
    println(name.tail)
    println("Keep coding".take(5))
    println(1 + 2 * 3)
    println((1 + 2) * 3)
    if (2 > 1) println("Greater") else println("lesser")

    // String Interpolation
    val personName = "John"
    val personAge = 30
    val personCountry = "Mexico"
    val messageOne = s"message is: $personName, $personAge, $personCountry"
    println(messageOne)
    val messageTwo = s"message is: $personName, ${personAge + 10}, $personCountry"
    println(messageTwo)

    // Format Interpolation
    val height = 1.95
    val messageThree = f"$height%2.1f"
    println(messageThree)

    // Raw Interpolation
    val messageFour = raw"message is: $personName \n , $personAge \n , $personCountry \n"
    println(messageFour)
  }
}
