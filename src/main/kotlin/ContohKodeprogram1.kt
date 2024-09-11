fun main(args: Array<String>) {
    if (15 > 5)
        println("True")
    println("the program continues here...")
    val a:Int = 5
    val b:Int = 2
    var max: Int

    if (a > b ) {
        max = a
    } else {
        max = b
    }
    println("Maximun of or  b is " + max)

    var myVar: Int = 0
    if (myVar == 0) {
        myVar = 1
        }else if(myVar == 1) {
        myVar = 0
    }else {
        myVar = -1
    }
    println("nilai myvar adalah : " + myVar)

    println("\nEnter a number : ")
    val intnumber = readLine()!!.toInt()
    if (intnumber > 5)
        println("The Number you entered is greater than 5!")
    println("thanks for the input!")
    }
