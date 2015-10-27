val msg = "Hello World" // val once initialized, it cannot be reassigned, also the type String is inferred by the sting literal
println(msg)

var greeting = "Hello, World"
println(greeting)

greeting = "Hello World Part 2" // var can be reassigned
println(greeting)

val word1 = "from" // optional type, then type inference
val word2: String = "to" // explicit type

val character = 'c' // char literal

// convert String to Int
val one = "1".toInt

println("character.getClass: " + character.getClass) // return type of variable
println("isInstanceOf: " + "Test".isInstanceOf[String])

// Simple function
def max(x:Int, y:Int): Int = if (x > y) x else y // one statement no need for curly braces
println("max: " + max(100,2))

// simple expression
val x = 5 * 20

// simple expression block
val amount = { val x = 5 * 20; x + 10 } // last expression is the return value
println("amount: " + amount)

// match expression
val num1 = 10
val num2 = 20
val maxNumber = num1 > num2 match {
  case true => num1;
  case false => num2;
}
println("maxNumber: " + maxNumber)

val status = 500

val message = status match{
  case 200 =>
    "ok"
  case 400 =>
    println("400 Error")
  case 500 =>
    println("500 Error")
}

val currentDay = "MON2"
// match expression with wildcard case
val kindOfDay = currentDay match {
  case "MON" | "TUE" | "WED" | "THU" | "FRI" =>
    "weekday"
  case "SAT" | "SUN" =>
    "weekend"
  case _ => // wildcard case
    "unknown"
}
println(kindOfDay)

// match expression with value binding expression
val anotherStatus = currentDay match {
  case "MON" | "TUE" | "WED" | "THU" | "FRI" =>
    "weekday"
  case "SAT" | "SUN" =>
    "weekend"
  case other => {
    println(other)
    println(s"Couldn't parse $other")
    -1
  }
}

val response: String = null

// match expression with pattern guard adds an if expression to value-binding pattern
val result = response match {
  case s if s != null => println(s"Received '$s'")
  case s => println("Error! Received a null response")
}

// match expression using pattern variables, by matching the type of input
val a: Int = 12180

val b: Any = a
val c = b match {
  case a: String => "s'x'"
  case a: Double => f"$x%.2f"
  case a: Float => f"$x%.2f"
  case a: Long => s"${x}l"
  case a: Int => s"${x}i"
}
println(s"c: $c")

// tuple declaration
// val (myVar1: Int, myVar2: String) = Pair(40, "Foo")
val (myVar1, myVar2) = Pair(40, "Foo")

