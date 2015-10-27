val info = (5, "fred", true)
println(info._1)
println(info._2)
println(info._3)

val red = "red" -> "Oxff0000"
println(red)
val reversed = red._2 -> red._1 // -> method returns a 2-element tuple
println(reversed)
