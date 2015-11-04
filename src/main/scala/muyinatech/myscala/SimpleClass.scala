package muyinatech.myscala

class SimpleClass {

  private var count = 0 // type inferred
  def add(i: Integer) { count += i } // curly braces no equals infers return type Unit
  def getCount = { count } // return count with implicit type
}
