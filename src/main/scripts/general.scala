/**
 * Created by Tosin on 10/02/14.
 */

val msg = "Hello World" // val once initialized, it cannot be reassigned, also the type String is inferred by the sting literal
println(msg)

var greeting = "Hello, World"
println(greeting)

greeting = "Hello World Part 2" // var can be reassigned
println(greeting)

// Simple function
def max(x:Int, y:Int): Int = if (x > y) x else y // one statement no need for curly braces
println(max(100,2))

println("Hello, " + args(0) + "!" ) // retrieve a command line argument

