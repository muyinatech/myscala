import muyinatech.myscala.User
import org.scalatest.FunSuite

class UserSuite extends FunSuite {

  test("") {
    val u = new User("Joe Bloggs")
    println(u.greet)
    println(u.toString)
  }

}
