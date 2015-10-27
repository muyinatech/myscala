trait HtmlUtils {
  def removeMarkup(input: String) = {
    input.replaceAll("""</?\w[^>]*>""","") // match < zero or / or word character [A-Za-z0-9_] or any character not >
      .replaceAll("<.*>","")
  }
}

trait SafeStringUtils {
  // returns a trimmed string wrapped in an Option
  def trimToNone(s: String): Option[String] = {
    Option(s) map(_.trim) filterNot(_.isEmpty)
  }
}

// class extends more than one trait
class Page(val s: String) extends SafeStringUtils with HtmlUtils {
  def asPlainText: String = {
    trimToNone(s) map removeMarkup getOrElse "n/a"
  }
}

println(new Page("<html><body><h1>Introduction</h1</body></html>").asPlainText)

println(new Page(" ").asPlainText)

println(new Page(null).asPlainText)

trait Base {override def toString = "Base"}

class A extends Base {override def toString = "A->" + super.toString}

trait B extends Base {override def toString = "B->" + super.toString}

trait C extends Base {override def toString = "C->" + super.toString}

class D extends A with B with C {override def toString = "D->" + super.toString}

println(new D())

// defining a self type
class E {def hi = "hi"}

trait F { self: E =>
  override def toString = "B: " + hi
}

// class G extends F // not allowed
class G extends E with F

class TestSuite(suiteName: String) {def start() {}}

trait RandomSeeded { self: TestSuite =>
  def randomStart(): Unit = {
    util.Random.setSeed(System.currentTimeMillis)
    self.start()
  }
}

class IdSpec extends TestSuite("ID Tests") with RandomSeeded {
  def testId()
}
