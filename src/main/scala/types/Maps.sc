import com.sun.java.swing.action.AlignCenterAction

//--------------------------------------
// Define a map (mutable & immutable)
//--------------------------------------
val scoresImmutable = Map("Alice" -> 10, "Matt" -> 3, "Andrew" -> 4 )
val scoresMutable = scala.collection.mutable.Map("Alice" -> 10, "Matt" -> 3, "Andrew" -> 4)

//--------------------------------------
// Accessing elements from the map
//--------------------------------------

// not safe, if the key does not exist NoSuchElement exception is thrown
var aliceScores = scoresImmutable("Alice")
aliceScores = scoresMutable("Alice")

// safe way, second parameter is a default value if the key does not exist
aliceScores = scoresImmutable.getOrElse("Alice", 0)
var aliceScoresWrongKey = scoresMutable.getOrElse("Alive", -1)

// Constructs a mutable or immutable map with a default value
var scores1 = scoresMutable.withDefaultValue(50)
val scores2 = scoresImmutable.withDefaultValue(60)

// Accessing values from the map
val tomScore = scores1("Tom")
val katScore = scores2("Kat")

scores1 = scores1 + ("Pattrick" -> 32, "Shaun" -> 43)
scores1 += ("Fred" -> 33)
scores1 -= "Pattrick"
scores1 = scores1 - "Alice"

// Traverse a map
for((key, value) <- scores1) println(key + " " + value)

// Construct a reverse map
val reverseMap = for ((key, value) <- scores1) yield (value, key)
for((key, value) <- reverseMap) println(key + " " + value)

val tuple = ("Andrew", 123, "9961")

tuple._1

val pricelist = Map[String, Double]("Tie" -> 12.50, "Scarf" -> 19.90, "Shoes" -> 50)
val discountedPriceLsit = for ((key, value) <- pricelist) yield (key, 0.90 * value )

for((key, value) <- discountedPriceLsit) println(key + " " + value)