fun main(args: Array<String>) {
    val arrayList = arrayListOf(1, 2, 3)
    print("ArrayList array : ")
    for(item in arrayList){
        print("$item ")
    }
    print("\n")
    arrayList += 9
    println("tambah kan elemen 9 dalam arrayList :")
    println(arrayList)

    arrayList.reverse()
    println("reverse arrayList : ")
    println(arrayList)

    arrayList += 1
    println("remove last elemen in arrayList :")
    println(arrayList)

    arrayList +=(1..5)
    println("add range in arrayList : ")
    println(arrayList)

    }
