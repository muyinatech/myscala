class Car(val make: String, var reserved: Boolean) {
  def reserve(r: Boolean): Unit = {
    reserved = r
  }
}

val t = new Car("Toyota", false)
println(t.reserved)
t.reserve(true)
println(s"My ${t.make} is now reserved? ${t.reserved}")

val t2 = new Car(reserved = false, make = "Tesla") // using named parameters
println(s"make: ${t.reserved}")

class Lotus(val color: String, reserved: Boolean) extends Car("Lotus", reserved)

val lotus = new Lotus("Silver", false)
println(s"Requested a ${lotus.color} ${lotus.make}")

class Car2(val make: String, var reserved: Boolean = true, val year: Int = 2015) {
  // class with input parameters and default values
  override def toString = s"$year $make reserved = $reserved"
}

val a = new Car2("Acura")
println(a)

val b = new Car2("Lexus", year = 2010)
println(b)

val c = new Car2(reserved = false, make = "Porsche")
println(c)

class Singular[A](element: A) extends Traversable[A] {
  def foreach[B](f: A => B) = f(element)
}

val p = new Singular("Planes")
p foreach println

println(s"p.head: ${p.head}")

// accessing the Traversable.head method available by extends

abstract class Listener {
  def trigger
}

val myListener = new Listener {
  def trigger {
    println(s"Trigger at ${new java.util.Date}")
  }
}
myListener.trigger

class Listening {
  var listener: Listener = null

  def register(l: Listener) {
    listener = l
  }

  def sendNotification() {
    listener.trigger
  }
}

val notification = new Listening()
notification.register(new Listener {
  // using an anonymous class
  def trigger {
    println(s"Trigger at ${new java.util.Date}")
  }
})
notification.sendNotification()

// class with overloaded methods
class Printer(msg: String) {
  def print(s: String): Unit = println(s"$msg: $s")

  def print(l: Seq[String]): Unit = print(l.mkString(", "))
}

new Printer("Today's report").print("Foggy" :: "Rainy" :: "Hot" :: Nil)

// class with apply method
class Multiplier(factor: Int) {
  def apply(input: Int) = input * factor // like default method
}

val tripleMe = new Multiplier(3)

val tripled = tripleMe.apply(10)

val tripled2 = tripleMe(10)

// used without apply method name

// class with lazy value
class RandomPoint {
  val x = {
    println("creating x"); util.Random.nextInt
  }
  lazy val y = { // initialized when the field is accessed
    println("now y"); util.Random.nextInt
  }
}

val r = new RandomPoint()
println(s"Location is ${r.x}, ${r.y}")

