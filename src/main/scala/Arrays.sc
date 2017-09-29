import scala.collection.mutable.ArrayBuffer

def printArray(array : Array[_]) : Unit = {
  for(element <- array)
    println(element)
}

// an array of ten integers, initialised with zero
printArray(new Array[Int](10))

// a string array with 10 elements initialized with null values
printArray(new Array[String](10))

// a string array with two string elements
printArray(Array("Hello", "World"))

val b = new ArrayBuffer[Int]
printArray(b.toArray)

// adds a new element at the end of the array buffer
printArray((b += 1).toArray)

// adds multiple elements at the end of the array buffer
printArray((b += (1,2,3,4,5)).toArray)

// adds a collection at the end of the array buffer
printArray((b ++= Array(6,7,8,9)).toArray)

// removes 5 element from the end of the array buffer
b.trimEnd(5)
printArray(b.toArray)

// adds 6 to the 2nd position in the array buffer
b.insert(2,6)
printArray(b.toArray)

// removes the element on the second position
b.remove(2)
printArray(b.toArray)

b += (1,2,3,4,5)

// traverse the loop with a for loop
for(i <- 0 until b.length){
  println(b(i))
}

// traverse the loop with a for by 2
for(i <- 0 until b.length by 2)
  println(b(i))

// traverse the loop backwards
for(i <- b.length -1 until -1 by -1)
  println(b(i))

// traverse more cleaner way
for(i <- b.indices.reverse)
  println(b(i))



