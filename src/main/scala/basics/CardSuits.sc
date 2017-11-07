object CardSuits extends Enumeration{
  val Club = Value("♣")
  val Diamond = Value("♦")
  val Heart = Value("♥")
  val Spade = Value("♠")
}

for(s <- CardSuits.values) println(s)