
object Conversions {
  def inchesToCentimeters(cm : Double) =  cm * 2.54
  def gallonsToLitre(gallon : Double) = gallon * 4.54
  def milesToKilometers(miles : Double) = miles * 1.609
}

Conversions.inchesToCentimeters(3)
Conversions.gallonsToLitre(2)
Conversions.milesToKilometers(4)