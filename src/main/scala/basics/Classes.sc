//--------------------------------------
// Classes
//--------------------------------------


// Creating a simple class

val myCounter = new Counter()

// Use the class
val fred = new Person

myCounter.increment()
println(myCounter.current)

class Counter {

  private var value = 0

  def increment() {
    value += 1
  }

  def current() = value
}

class Person {
  var age = 0
}

println(fred.age)
fred.age = 15

println(fred.age)