abstract class UnitConversion{
   def convert(unitFrom : Double) : Double
}

object InchesToCmConversion extends UnitConversion{
  override def convert(unitFrom: Double): Double = unitFrom * 2.54
}

object GallonToLitre extends UnitConversion{
  override def convert(unitFrom: Double): Double = unitFrom * 4.54
}

object MilesToKilometers extends UnitConversion {
  override def convert(unitFrom: Double): Double = unitFrom * 1.609
}

InchesToCmConversion.convert(2)
GallonToLitre.convert(3)
MilesToKilometers.convert(3)
