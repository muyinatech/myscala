import muyinatech.myscala.Car
import org.scalatest.FunSuite

class CarSuite extends FunSuite {

  test("") {
    val t = new Car("Toyota", false)
    println(t.reserved)
    t.reserve(true)
    println(s"My ${t.make} is now reserved? ${t.reserved}")
  }

}
