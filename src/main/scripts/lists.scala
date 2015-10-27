val numNames = Array("zero", "one", "two") // type Array[String] is inferred
val fruit = List("apples", "oranges", "pears", "bananas", "pineapples") // type List[String] is inferred, immutable linked list
println(fruit) // print list
println(fruit.size)
println(fruit(1)) // oranges
println("Head of the list: " + fruit.head) // print head of the list
println("Tail of the list: " + fruit.tail) // print tail (rest of the list except the first element) of the list
println("The list is empty?: " + fruit.isEmpty) // is list empty
println("List length: " + List(1, 2, 3).length)
println("Reverse list: " + fruit.reverse)
printf("Indices of the list: " + fruit.indices)
for (i <- fruit) {
  println(fruit)
}
print("numNames: ")
numNames.foreach((c: String) => print(c + " "))
println()
val sizes = numNames.map((c: String) => c.size)
for (i <- sizes) {
  println(i)
}

println("Take first 2 elements: " + (fruit take 2))
println("Take except the first 2 elements: " + (fruit drop 2))
println("Split at index 2, into two lists: " + (fruit splitAt 2))

val List(a, b, c, d, e) = fruit // match a list of 5 elements and bind elements to the pattern variables a,b,c,d,e
println(a) // print first
println(b) // print second
println(c) // print third

val a2 :: b2 :: rest = fruit // match a list of 2 or more elements and bind elements to the pattern variables a2, b2, rest
println(a2) // print first
println(b2) // print second
println(rest) // print third

val empty = Nil // define a empty list
val empty2: List[Nothing] = List() // define a empty list
val nums = 1 :: (2 :: (3 :: (4 :: Nil))) // cons operator, list extension of left operand
val num2 = 1 :: 2 :: 3 :: 4 :: Nil // same as previous, as the :: operator associates to the right
println(nums)
println("num2 cubed: " + num2.map(n => n * n * n))
println("num2 min: " + num2.map(n => n * n * n))
println("num2 max: " + num2.map(n => n * n * n))

// Two dimensional list with type declaration
val list: List[List[Int]] =
  List(
    List(1, 0, 0),
    List(0, 1, 0),
    List(0, 0, 1)
  )
println(list)
println("Flatten list: " + list.flatten) // flatten two dimensional array into a single list, can only be applied to lists whose elements are all lists.

println(List(1, 2) ::: List(3, 4, 5)) // prepends a list to another, ::: (cons operator) associates to the right

val abcde: List[String] = List("a", "b", "c", "d", "e")
val zipped = abcde.indices zip abcde
println("zipped: " + zipped) // zip takes two list and forms a list of pairs
println((abcde take 2) zip fruit) // different length list, any unmatched elements are dropped
println(abcde.zipWithIndex) // pair every element with its position in the list
println("unzipped: " + zipped.unzip)

println(abcde.toString())
println(abcde mkString("[", ",", "]")) // with prefix string, separator string, post string
println(abcde mkString "") // no strings in between elements

val arr = abcde.toArray // convert list to an array

// reduce to sum list
val numbers = List(32, 95, 24, 21, 17)
println(numbers.reduce((a: Int, b: Int) => a + b))
println(numbers.forall(_ < 40)) // returns true if every element is less than 40
println("numbers: " + numbers.sum)

val fruits = List.fill(3)("apples") // Repeats apples three times.
println("fruits : " + fruits)

val squares = List.tabulate(6)(n => n * n) // Populate list with the result of the function
println("squares : " + squares)

println(List(1, 2) == List(1, 2))

// Return list containing only distinct elements
println(List(3, 5, 4, 3, 4).distinct)

val fruit1 = "apples" :: "oranges" :: "pears" :: "strawberries" :: "guavas" :: Nil
val fruit2 = "mangoes" :: "banana" :: Nil

println("List.concat(fruit1, fruit2): " + List.concat(fruit1, fruit2))

// drops the first 2 elments from the list
println("fruit1.drop(2):" + fruit1.drop(2))

println("numbers.filter(_ > 30):" + numbers filter (_ > 30))

// convert a list of list into a single test
println("flatten: " + List(List(1, 2), List(3, 4)).flatten)

println("partition: " + List(1, 2, 3, 4, 5).partition(_ < 3))
//println("partition: " + List(1,2,3,4,5) partition(_ < 3)) // without dot notation

println("reverse: " + List(1, 2, 3, 4, 5).reverse)

// return segment of list from item at index 1 up to and not including item at index 3
println("slice: " + List(1, 2, 3, 4, 5) slice(1, 3))

println("sortBy: " + fruit1.sortBy(_.size))

// extract the first elements of the list
println("take: " + List(2, 3, 5, 7, 11, 13) take 3)

println("collect:" + List(0, 1, 0, 1, 1) collect { case 1 => "ok"})

// applies split method to each element and flattens the result into a list
val drinks = List("milk,tea", "coffee, cocoa")
println(drinks flatMap (_.split(',')))
println(drinks map (_.toUpperCase))

// Convert a list to a String
println(List(2, 5, 5, 3, 2).toString)

// Convert a list to a set
println(List(2, 5, 5, 3, 2).toSet)

val statuses = List(500, 404)

val msg = statuses.head match {
  case x if x < 500 => "okay"
  case _ => "whoah, an error"
}
println(s"msg: $msg")

val msg2 = statuses match {
  case x if x contains 500 => "has error"
  case _ => "okay"
}
println(s"msg2: $msg2")






