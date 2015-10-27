val nums = collection.mutable.Buffer(1) // initialise mutable Buffer with a single element, no need to specify type
for (i <- 2 to 10) nums += i
println(nums)

val nums2 = collection.mutable.Buffer[Int]() // initialise empty mutable Buffer
for (i <- 1 to 10) nums2 += i
println(nums2)

// convert list back to an immutable list
val l = nums2.toList

val m = Map("AAPL" -> 597 ,"MSFT" -> 40)

// convert to mutable Buffer
val b = m.toBuffer

// add entry to Buffer
b += ("GOOG" -> 521)
println("Buffer: " + b)

// convert back to an immutable map
val map = b.toMap
println("Map: " + map)

val list = b.toList
println("List: " + list)

val set = b.toSet
println("Set: " + set)


// using collection builder
// use a builder if you are only building a mutable collection iteratively in order to convert it to an immutable collection.
val set1 = Set.newBuilder[Char]
set1 += 'h'
set1 ++= List('e', 'l', 'l', 'o')
println("set1: " + set1.result)
