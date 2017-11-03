val bmw = new Car("BMW", "7")
val bmw2017 = new Car("BMW", "7", 2017)
val bmw2018 = new Car("BMW", "7", 2018, "ABCD123")

class Car (manufacturer : String, modelName : String,  var modelYear : Int = -1, var licensePlate : String = ""){
  override def toString = s"Car(modelYear=$modelYear, licensePlate=$licensePlate, manufacturer=$manufacturer, modelName=$modelName)"
}
