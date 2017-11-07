class Point(x: Int, y:Int) extends java.awt.Point(x,y)

object Point{
  def apply(x: Int, y: Int) = new Point(x,y)
}

val testPoint = Point(12,23)
testPoint.distance(23,34)