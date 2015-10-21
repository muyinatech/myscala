object MyTuple {

  def main(args: Array[String]) {
    val info = (5, "Korben", true)
    println(info._2) // Korben

    val red = "red" -> "Oxff0000"
    println(red)
    println(red._2)

    val reversed = red._2 -> red._1
    println(reversed)
  }

}
