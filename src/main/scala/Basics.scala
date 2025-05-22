object Basics {
  def main(args: Array[String]): Unit = {
    val name = "Keep coding"
    println(name.head)
    println(name.tail)
    println("Keep coding".take(5))
    println(1 + 2 * 3)
    println((1 + 2) * 3)
    if (2 > 1) println("Greater") else println("lesser")

    val personName = "John"
    val personAge = 30
    val personCountry = "Mexico"
    val message = s"message is: $personName, $personAge, $personCountry"
    println(message)
  }
}
