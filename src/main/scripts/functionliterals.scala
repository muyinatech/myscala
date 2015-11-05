val greeter = (name: String) => s"Hello, $name" // function literal
val greeterCopy = greeter("World") // using function value
println(greeterCopy)

var increase = (x: Int) => x + 1 // function literal
println(increase(10))

increase = (x: Int) => {  // use curly braces if a function literal has more that one statement
  println("We")
  println("are")
  println("here!")
  x + 1
}
println(increase(10))

val someNumbers = List(-11, -10, -5, 0, 5, 10)
someNumbers.foreach((x: Int) => println(x)) // pass function literal to foreach method

val filteredNumbers = someNumbers.filter((x: Int) => x > 0) // pass function literal to foreach method
//filteredNumbers.foreach((x: Int) => println(x))
//filteredNumbers.foreach(x => println(x)) // leave off parameter types and parentheses on parameter
//filteredNumbers.foreach(println _) // using wildcard placeholder same as above code
filteredNumbers.foreach(println)