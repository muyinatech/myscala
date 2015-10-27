package muyinatech.myscala

class User(val name: String) {

  def greet: String = s"Hello from $name"

  override def toString = s"User($name)"

}
