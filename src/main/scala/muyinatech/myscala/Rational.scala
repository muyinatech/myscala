package muyinatech.myscala

class Rational(n: Int, d: Int) {
  // has two class parameters
  require(d != 0) // throw IllegalArgument exception if d is zero
  println("Created " + n + "/" + d)
  // any code placed in the class body which isn't a field or method declaration,
  // is placed into the primary constructor

  // public fields which are assigned from class parameters this code will be placed in the primary constructor
  private val g = gcd(n.abs, d.abs)
  val numerator = n / g
  val denominator = d / g

  def this(n: Int) = this(n, 1) // auxiliary constructor, first statement has to be this(...) a call to the primary or another auxiliary constructor

  override def toString = numerator + "/" + denominator

  def +(that: Rational) = new Rational(numerator * that.denominator + that.numerator * denominator, denominator * that.denominator)

  def +(i: Int) = new Rational(numerator + i * denominator, denominator) // overloaded method

  def *(that: Rational) = new Rational(numerator * that.numerator, denominator * that.denominator)

  def lessThan(that: Rational) = this.numerator * that.denominator < that.numerator * this.denominator // this keyword not required

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b) // recursive methods require result type

}

