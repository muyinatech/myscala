//import collection.mutable._ //import entire contents of package
import collection.mutable.{Queue, ArrayBuffer} // import group
import collection.mutable.{Map=>MutMap} // import alias

val b = new ArrayBuffer[String]
println(b += "Hello")

val m2 = MutMap(2 -> 3)
println(m2)
