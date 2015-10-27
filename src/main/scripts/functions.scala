// input-less function
def function1 = "hi"

// function with a explicit return type
def function2: String = "hi"

println(function1)
println(function2)
//println(function2()) // won't compile as function2 not defined with parentheses

def multiplier(x: Int, y: Int): Int = {x * y}

println(multiplier(6,7))

// function with empty parentheses
def hi(): String = "hi"

println(hi) // can call without parentheses
println(hi())

def safeTrim(s: String): String = {
  if (s == null) return null
  s.trim()
}

// procedure with implicit return type
def log(d: Double) = println(f"Got value $d.2f")
// procedure with explicit return type, not Unit is similar to void in Java
def log2(d: Double): Unit = println(f"Got value $d.2f")

log(23.0)
log2(14.0)

def formatEuro(amt: Double) = f"£$amt%.2f"

// invoking with single parameter
println(formatEuro(3.4645))
// invoking with expression block
println(formatEuro{val rate = 1.32; 0.235 + 0.7123 + rate * 5.32})

// nested functions
def max(a: Int, b: Int, c:Int) = {
  def max(x:Int, y:Int) = if (x > y) x else y
  max(a, max(b,c))
}
println(max(42, 181, 19))

// function with named parameters
def greet(prefix: String, name: String) = s"$prefix $name"

// function parameter with default parameter value
def greet2(prefix: String = "", name: String) = s"$prefix$name"

def greet3(name: String, prefix: String = "") = s"$prefix$name"

println(greet("Ms", "Brown"))
println(greet(name = "Brown", prefix = "Mr"))
println(greet2(name = "Paul"))
println(greet3("Sarah"))

// function with vararg parameter using a "*"
def sum(items: Int*): Int = {
  var total = 0
  for (i <- items) total += i
  total
}

println(sum(10, 20, 30))
println(sum())

// function with a type parameter
def identity[A](a: A): A = a

val s = identity[String]("Bye")
println(s)

val d = identity[Double](2.465)
println(d)

def double(x: Int): Int = x * 2
println(double(5))

// function type (Int) => Int, indicating that it take a single int parameter and returns an int
val myDouble: (Int) => Int = double // or leave off the parentheses val myDouble: Int => Int = double

// assign a function with a wildcard operator
// val myDouble = double _ // same as above
println(myDouble(5))

// assign function to another variable
val myDoubleCopy = myDouble
println(myDoubleCopy(5))

def max(a: Int, b: Int) = if (a > b) a else b

// assigning a function with multiple parameters
val maximize: (Int, Int) => Int = max
// val maximize = max _
println(maximize(50,30))

// no args function
def logStart() = "=" * 50 + "\nStarting NOW\n" + "=" * 50
// no args function literal
val start: () => String = logStart
println(start())

// function literal
val greeter = (name: String) => s"Hello, $name"
val greeterCopy = greeter("World")
println(greeterCopy)

def safeStringOp(s: String, f: String => String) = {
  if (s != null) f(s) else s
}
println(safeStringOp("Ready", s => s.reverse))
println(safeStringOp(null, _.reverse)) // _ wildcard placeholder representing the first input parameter
println(safeStringOp("Ready", _.reverse)) // _ wildcard placeholder

val doubler: Int => Int = _ * 2
println(doubler(2))

def combination(x: Int, y:Int, f: (Int,Int) => Int) = f(x,y)
println(combination(23, 12, _ * _)) // use wildcard placeholders for first and second parameters

def factorOf(x: Int, y:Int) = y % x == 0 // function type (Int, Int) => Boolean
val f = factorOf _ // use wildcard placeholder instead of parameters
println(factorOf(7, 20))

// partially applied function contains some but not all the parameters for factorOf()
val multipleOf3 = factorOf(3, _:Int)
println(multipleOf3(78))

// another currying example
def anotherFactorOf(x: Int)(y:Int) = y % x == 0 // function type Int => Int => Boolean
val isEven = anotherFactorOf(2) _ // yields function of type Int => Boolean
println(isEven)
println("isEven: " + isEven(32))

// function using a by-name parameter means you can pass a value or function as a parameter value
def doubles(x: => Int) = {
  println("Now doubling "  + x)
  x * 2
}
println(doubles(5))

def f(i: Int) = {println(s"Hello from f($i)"); i}
println(doubles(f(2)))

// partial function a function that accepts a partial amount of all possible input values
val div: (Double, Double) => Double = {
  case (x, y) if y != 0 => x / y
}
//println(div(12, 0))

val statusHandler: Int => String = {
  case 200 => "Okay"
  case 400 => "Your Error"
  case 500 => "Our error"
}
//println(statusHandler(600)) // causes a MatchError

def safeStringOp2(s: String) (f: String => String) = {
  if (s != null) f(s) else s
}
val uuid = java.util.UUID.randomUUID().toString
val timedUUID = safeStringOp2(uuid) { s =>
  val now = System.currentTimeMillis
  val timed = s.take(24) + now
  timed.toUpperCase
}
println(timedUUID)
