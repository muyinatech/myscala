val colourMap = Map("red" -> 0xFF0000, "green" -> 0xFF00, "blue" -> 0xFF)
println(colourMap("red"))
println(colourMap.contains("green"))

println("Pairs:")
for (pairs <- colourMap) {println(pairs)}

// convert a map to a list
println(Map("a" -> 1, "b" -> 2).toList);

