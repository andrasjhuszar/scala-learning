class Person {

  var privateAge = 0

  def age = privateAge
  def age_=(newValue: Int) {
    if (newValue < 0) privateAge = 0
    else privateAge = newValue
  }

}

val fred = new Person
fred.age

fred.age = 19
fred.age

fred.age = -34
fred.age
