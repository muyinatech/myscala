val set1 = Set(10, 20, 30, 40)
println("Sum: " + set1.sum)
println("Min: " + set1.min)
println("Max: " + set1.max)
println("Head:" + set1.head)
println("Tail:" + set1.tail)
println("Check if set is empty : " + set1.isEmpty)

val sum = set1.reduce((a: Int, b: Int) => a + b)
println(sum)

val fruit1 = Set("apples", "oranges", "pears")
val fruit2 = Set("mangoes", "banana")

val buf = new StringBuilder
fruit1.addString(buf)
println("fruit1 addString: " + buf.toString)

val buf2 = new StringBuilder
fruit1.addString(buf2, ",")
println("fruit1 addString with ,: " + buf2.toString)

// Concatenate two sets
var fruit = fruit1 ++ fruit2
println("fruit1 ++ fruit2 : " + fruit)

// use two sets with ++ as method
fruit = fruit1.++(fruit2)
println("fruit1.++(fruit2) : " + fruit)

val num1 = Set(5, 6, 9, 20, 30, 45)
val num2 = Set(50, 60, 9, 20, 35, 55)

// intersection find common elements between two sets
println("num1.&(num2) : " + num1.&(num2))
println("num1.intersect(num2) : " + num1.intersect(num2))

// create a new set with given additional element
println("num1.+(10) : " + num1.+(10))

// create a new set with given element removed
println("num1.-(9) : " + num1.-(9))

println("num1.contains(30) : " + num1.contains(30))

// return the difference between num1 and num2, the elements in num2 that are not found in num2
println("num1.&~(num2) : " + num1.&~(num2))

// create a new set with given additional element
println("num1.+(51, 33, 94) : " + num1.+(51, 33, 94))

println("num2.-(60, 35) : " + num1.-(60, 35))

// Convert set into a map
println(Set(1 -> true, 3 -> true).toMap)