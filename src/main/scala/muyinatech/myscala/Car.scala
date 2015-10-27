package muyinatech.myscala

class Car(val make: String, var reserved: Boolean) {
  def reserve(r: Boolean): Unit = {
    reserved = r
  }
}
