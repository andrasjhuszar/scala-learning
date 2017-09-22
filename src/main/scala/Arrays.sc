import scala.collection.mutable.ArrayBuffer

def printArray(array : Array[_]) : Unit = {
  for(element <- array)
    println(element)
}

def printArrayBuffer(array : ArrayBuffer[_]) : Unit = {
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
printArrayBuffer(b)

// adds a new element at the end of the array buffer
printArrayBuffer(b += 1)

// adds multiple elements at the end of the array buffer
printArrayBuffer(b += (1,2,3,4,5))

// adds a collection at the end of the array buffer
printArrayBuffer(b ++= Array(6,7,8,9))

// removes 5 element from the end of the array buffer
b.trimEnd(5)
printArrayBuffer(b)

// adds 6 to the 2nd position in the array buffer
b.insert(2,6)
printArrayBuffer(b)

// removes the element on the second position
b.remove(2)
printArrayBuffer(b)

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



