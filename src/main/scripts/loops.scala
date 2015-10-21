// for with to for inclusive
for (x <- 1 to 7) { println(s"Day $x:")}

// for with until for exclusive
for (x <- 1 until 7) { println(s"Day $x:")}

val numNames = Array("zero", "one", "two")
for(i <- numNames) { println(i)}

// for loop with yield to return a collection of expression return values
val numList = for (i <- 1 to 5) yield i
println("numList: " + numList)

// for loop with iterator guard
val threes = for (i <- 1 to 20 if i % 3 == 0) yield i
println(s"threes: $threes")

// for loop with multiple iterator guards, work like nested for loops
val quote = "Faith,Hope,,Charity"
for {
  t <- quote.split(",")
  if t != null
  if t.nonEmpty
}
{ println(t)}

for { x <- 1 to 2
y <- 1 to 3}
{println(s"($x, $y)")}

// for loop with value binding
val powersOf2 = for (i <- 0 to 8; pow = 1 << i) yield pow
println(powersOf2)

var e = 10; while (e > 0) e -= 1
println(s"e: $e")

do println(s"Here I am, e = $e") while (e > 0)
