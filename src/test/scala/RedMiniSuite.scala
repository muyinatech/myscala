import muyinatech.myscala.{Mini, AbstractCar, RedMini}
import org.scalatest.FunSuite

class RedMiniSuite extends FunSuite{

  test("") {
    val m: AbstractCar = new RedMini(2005)
    println(m.color);

    val redMini: AbstractCar = new Mini(2005, "Red")
    println(s"Got a ${redMini.color} Mini")
  }
}
