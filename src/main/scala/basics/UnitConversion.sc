class UnitConversion(val factor : Double){

  private def convert(value : Double) : Double = value * factor

  def apply(value: Double) = convert(value)
}

object InchesToCmConversion extends UnitConversion(2.54)
object GallonToLitre extends UnitConversion(4.54)
object MilesToKilometers extends UnitConversion(1.609)

InchesToCmConversion.apply(2)
GallonToLitre.apply(3)
MilesToKilometers.apply(3)