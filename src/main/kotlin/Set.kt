fun main(args: Array<String>) {
     val numbers = setOf(1,2,3,4)
    println("numbers of element: ${numbers.size}")
    if (numbers.contains(1)) println("1 is in the set")

     val numbersBackwards = setOf(4,3,1)
    println("the set are equal: ${numbers == numbersBackwards}")

    println(numbers.first() == numbersBackwards.first())
    println(numbers.first() == numbersBackwards.last())

    val string = hashSetOf("a", "b", "c", "c")
    println("my set values are" +string)

}