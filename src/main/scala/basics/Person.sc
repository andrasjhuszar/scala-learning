class Person (val name: String, private var _age: Int) {

  println(s"Constructing a person $name with age $age")

  def age = if (_age < 0) 0 else _age
  def age_=(newAge : Int){

    if(newAge > 0){
      _age = newAge
    } else{
      _age = 0
    }
  }

  def firstName = name.split(" ")(0)
  def lastName = if(name.split(" ").length>1)name.split(" ")(1) else ""
}

val fred = new Person("Fred Smith", 18)
val mary = new Person("Mary Jane", -18)

fred.firstName
fred.lastName
fred.name
fred.age

mary.firstName
mary.lastName
mary.name
mary.age

mary.age = -2
