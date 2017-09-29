import scala.collection.mutable.ArrayBuffer

def printArray(array : Array[_]) : Unit = {
  for(element <- array)
    println(element)
}

val a = Array(2,3,5,7,11)
printArray(a)

// multiply all element of the array by 2
// it creates a new array, don't modify the original array
val transformedA = for (elem <- a) yield 2 * elem
printArray(transformedA)

val transformAOnlyEven = for (elem <- a if elem % 2 == 0) yield elem * 2
printArray(transformAOnlyEven)

val arrayWithNegatives = Array(1,-2,3,4,-5,9,-1,-2)

// filter out only positive elements
val onlyPositives = for ( elem <- arrayWithNegatives if elem >= 0) yield elem
printArray(onlyPositives)

val arrayBufferWithNegatives = ArrayBuffer(1,-2,3,4,-5,9,-1,-2)

//modify the original array
val indicesOfNegatives = for(i <- arrayBufferWithNegatives.indices if arrayBufferWithNegatives(i) < 0 ) yield i

for(elem <- indicesOfNegatives.reverse) arrayBufferWithNegatives.remove(elem)
printArray(arrayBufferWithNegatives.toArray)

val anotherArrayBufferWithNegatives = ArrayBuffer(1,-2,3,4,-5,9,-1,-2)

// getting a sum of an ArrayBuffer
val sum = ArrayBuffer(1,2,3,4,5,6).sum

// getting the max elemnt of an ArrayBuffer, min is similar
val maxElement = ArrayBuffer(1,2,3,4,5,6,3,5,6,42,45,6,7,8).max

// sorting an ArrayBuffer
val sortedArrayBuffer = ArrayBuffer(1,2.3,4,2,1,8,7,6,5,6,7,8,1).sorted
printArray(sortedArrayBuffer.toArray)

