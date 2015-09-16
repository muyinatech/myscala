val colourMap = Map("red" -> 0xFF0000, "green" -> 0xFF00, "blue" -> 0xFF)
println(colourMap("red"))
println(colourMap.contains("green"))
for (pairs <- colourMap) {println(pairs)}
