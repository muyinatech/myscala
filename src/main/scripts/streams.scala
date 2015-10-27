// stream is a lazy collection

def inc(i :Int): Stream[Int] = Stream.cons(i, inc(i+1))
val s = inc(1)

println(s)

val l = s.take(5).toList
println(l)

println(s)

def inc2(head: Int): Stream[Int] = head #:: inc(head + 1)
val r = inc(10).take(10).toList
println(r)

