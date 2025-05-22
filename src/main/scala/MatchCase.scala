object MatchCase {

  def main(args: Array[String]): Unit = {

    println("Basic Match Case")
    basicMatchCase(1)
    basicMatchCase(9)
    println(basicMatchCase2(3))
    println(basicMatchCase2(10))
    println("Is it a weekend?")
    println(isWeekend(6))
    println(isWeekend(7))
    println(isWeekend(1))
    println("Is it a weekend 2?")
    println(isWeekend2(6))
    println(isWeekend2(7))
    println(isWeekend2(1))
    println("Is it a weekend 3?")
    println(isWeekend3(6))
    println(isWeekend3(7))
    println(isWeekend3(4))
    println(isWeekend3(10))
    println("Is it a weekend 4?")
    println(isWeekend4(6))
    println(isWeekend4(7))
    println(isWeekend4(4))
    println(isWeekend4(10))

  }

  private def basicMatchCase(dayNumber: Int): Unit = {
    dayNumber match {
      case 1 => println("Monday")
      case 2 => println("Tuesday")
      case 3 => println("Wednesday")
      case 4 => println("Thursday")
      case 5 => println("Friday")
      case 6 => println("Saturday")
      case 7 => println("Sunday")
      case _ => println("Invalid day number")
    }
  }

  private def basicMatchCase2(dayNumber: Int): String = {
    dayNumber match {
      case 1 => "Monday"
      case 2 => "Tuesday"
      case 3 => "Wednesday"
      case 4 => "Thursday"
      case 5 => "Friday"
      case 6 => "Saturday"
      case 7 => "Sunday"
      case _ => "Invalid day number"
    }

  }

  private def isWeekend(dayNumber: Int): String = dayNumber match {
    case 6 => "Yes, it is a weekend"
    case 7 => "Yes, it is a weekend"
    case _ => "No, it is not a weekend"
  }

  private def isWeekend2(dayNumber: Int): String = dayNumber match {
    case 6 | 7 => "Yes, it is a weekend"
    case _ => "No, it is not a weekend"
  }

  private def isWeekend3(dayNumber: Int): String = dayNumber match {
    case 1 | 2 | 3 | 4 | 5 => "No, it is not a weekend"
    case 6 | 7 => "Yes, it is a weekend"
    case _ => "Invalid day number"
  }

  private def isWeekend4(dayNumber: Int): String = dayNumber match {
    case day if (day >= 1 && day <= 5) => "No, it is not a weekend"
    case day if (day == 6 || day == 7) => "Yes, it is a weekend"
    case _ => "Invalid day number"
  }
}
