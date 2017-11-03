class Person (val name: String, private var _age: Int) {
  def age = if (_age < 0) 0 else _age

  def age_=(newAge : Int){
    if(newAge > 0) _age = newAge else _age = 0
  }

  private val names = name.split(" ")

  def firstName = names(0)
  def lastName = if(names.length>1)names(1) else ""

  override def toString = s"Person(name=$name, firstName=$firstName, lastName=$lastName, age=$age)"
}

val fred = new Person("Fred Smith", 18)
val mary = new Person("Mary Jane", -18)

mary.age = -2