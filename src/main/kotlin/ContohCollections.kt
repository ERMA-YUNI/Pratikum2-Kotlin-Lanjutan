fun printAll(strings: Collection<String>){
    for (s in strings) println("$s")
    println()
}
fun main(args: Array<String>){
    val stringList = listOf("one","two","one")
    println(stringList)
    val stringSet = setOf("one","two","three")
    println(stringSet)
}