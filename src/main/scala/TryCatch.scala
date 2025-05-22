object TryCatch {

  def main(args: Array[String]): Unit = {

    println("tryToConnectTo")
    tryToConnectTo("Earth")
    tryToConnectTo("Mars")
    tryToConnectTo("Moon")
    println("tryToConnectTo2")
    println(tryToConnectTo2("Earth"))
    println(tryToConnectTo2("Mars"))
    println(tryToConnectTo2("Moon"))
  }

  private def connectTo(planet: String): String = {
    planet match {
      case "Earth" => "Connected!"
      case "Mars" => throw new RuntimeException("No connection to Mars")
      case unknown => throw new IllegalArgumentException(s"$unknown is not a valid planet")
    }
  }

  private def tryToConnectTo(planet: String): Unit = {
    var result = ""
    try {
      result = connectTo(planet)
      println(result)
    } catch {
      case e: IllegalArgumentException => println(s"IllegalArgumentException: ${e.getMessage}")
      case e: RuntimeException => println(s"Could not connect to $planet: ${e.getMessage}")
    }
    finally {
      println(s"result is '$result'")
    }
  }

  private def tryToConnectTo2(planet: String): String = try {
    connectTo(planet)
  } catch {
    case e: IllegalArgumentException => s"IllegalArgumentException: ${e.getMessage}"
    case e: RuntimeException => s"Could not connect to $planet: ${e.getMessage}"
  }
}
