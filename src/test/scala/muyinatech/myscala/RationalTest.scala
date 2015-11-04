package muyinatech.myscala

import org.scalatest.FunSuite

class RationalTest extends FunSuite {

  test("") {
    val r = new Rational(3, 4)
    val r2 = new Rational(5,6)
  //  val r2 = new Rational(6, 0)
    val r3 = r + r2
    println(r3)
    println(r3.numerator)
    println(r3.denominator)

    val r4 = new Rational(5)
    println(r4)

    println(new Rational(66, 42))

    println(r + 3)
  }

}
