object Hello {
  println("in Hello")
  def hi = "hi"
}

object HtmlUtils {
  def removeMarkup(input: String) = {
    input.replaceAll("""</?\w[^>]*>""","") // match < zero or / or word character [A-Za-z0-9_] or any character not >
      .replaceAll("<.*>","")
  }
}

println(Hello.hi)
println(Hello.hi)

val html = "<html><body><h1>Introduction</h1></body></html>"

val text = HtmlUtils.removeMarkup(html)
println(text)