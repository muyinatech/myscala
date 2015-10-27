case class Character(name: String, isThief: Boolean) {
}

val h = Character("Hadrian", true)

var r = h.copy(name = "Royce")

println(h == r)
println(h.toString)


// case classes include the following auto generated case classes
/*
apply - factory method for instantiating the class
copy - returns a copy of the instance with any requested changes. The parameters are the class's fields with the default values set to the current field values.
equals - returns true if every field in another instance match every field in this instance.
hashCode - returns a hash code of the instance's fields
toString - renders the class's name and fields to a String
unapply - extracts the instance into a tuple of its fields, making it possible to use class instances for pattern matching
 */
