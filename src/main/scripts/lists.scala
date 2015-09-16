val numNames = Array("zero", "one", "two") // type Array[String] is inferred
val fruit = List("apples", "oranges", "pears", "bananas", "pineapples") // type List[String] is inferred, immutable linked list
println(fruit) // print list
println(fruit.size)
println(fruit(1)) // oranges
println("Head of the list: " + fruit.head) // print head of the list
println("Tail of the list: " + fruit.tail) // print tail (rest of the list except the first element) of the list
println("The list is empty?: " + fruit.isEmpty) // is list empty
println("List length: " + List(1,2,3).length)
println("Reverse list: " + fruit.reverse)
printf("Indices of the list: " + fruit.indices)
for(i <- fruit) { println(fruit)}
print("numNames: ")
numNames.foreach( (c: String) => print(c + " "))
println()
val sizes = numNames.map((c: String) => c.size)
for(i <- sizes) { println(i)}

println("Take first 2 elements: " + (fruit take 2))
println("Take except the first 2 elements: " + (fruit drop 2))
println("Split at index 2, into two lists: " + (fruit splitAt 2))

val List(a,b,c,d,e) = fruit // match a list of 5 elements and bind elements to the pattern variables a,b,c,d,e
println(a) // print first
println(b) // print second
println(c) // print third

val a2 :: b2 :: rest = fruit // match a list of 2 or more elements and bind elements to the pattern variables a2, b2, rest
println(a2) // print first
println(b2) // print second
println(rest) // print third

val empty = Nil // define a empty list
val empty2: List[Nothing] = List()  // define a empty list
val nums = 1 :: (2 :: (3 :: (4 :: Nil))) // cons operator, list extension of left operand
val num2 = 1 :: 2 :: 3 :: 4 :: Nil // same as previous, as the :: operator associates to the right
println(nums)

// Two dimensional list with type declaration
val list: List[List[Int]] =
  List(
    List(1, 0, 0),
    List(0, 1, 0),
    List(0, 0, 1)
  )
println(list)
println("Flatten list: " + list.flatten) // flatten two dimensional array into a single list, can only be applied to lists whose elements are all lists.

println(List(1,2) ::: List(3,4,5)) // concatenate lists, ::: associates to the right

val abcde :List[String] = List("a", "b", "c", "d", "e")
val zipped = abcde.indices zip abcde
println("zipped: " + zipped) // zip takes two list and forms a list of pairs
println((abcde take 2) zip fruit) // different length list, any unmatched elements are dropped
println(abcde.zipWithIndex) // pair every element with its position in the list
println("unzipped: " + zipped.unzip)

println(abcde.toString())
println(abcde mkString ("[", "," ,"]")) // with prefix string, separator string, post string
println(abcde mkString "") // no strings in between elements

val arr = abcde.toArray // convert list to an array

val numbers = List(32, 95, 24, 21, 17)
println(numbers.reduce((a: Int, b: Int) => a + b))