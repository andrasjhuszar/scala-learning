class Time(val hrs : Int, val minutes : Int){

  private val timeInMinutes = hrs * 60 - 1 + minutes

  def before(other : Time) : Boolean = {
    timeInMinutes < other.hrs * 60 - 1 + other.minutes
  }
}

var firstTime = new Time(12,30)
var secondTime = new Time(12,35)

firstTime.before(secondTime)
secondTime.before(firstTime)

firstTime.hrs
