import muyinatech.myscala.SimpleClass
import org.scalatest.FunSuite

class SimpleClassSuite extends FunSuite {

  test("") {
    val t = new SimpleClass()
    t.add(100)
    println(t.getCount)
  }

}
