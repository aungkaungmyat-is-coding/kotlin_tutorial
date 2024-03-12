fun main() {
    var number = 1
    val lastNumber = 20
    var evenNumberCounter = 0

    while (number <= lastNumber) {
        number++
        if (!isEvenNumber(number)) {
            continue
        }
        evenNumberCounter++
        println(number)
    }
    println("Total number of even numbers: $evenNumberCounter")
//    for (i in 1..10) {
//        println(i)
//    }
//
//    for (i in 1 until 10) {
//        println(i)
//    }
//
//    for (i in 10 downTo 1) {
//        println(i)
//    }
//
//    for (i in 1..10 step 2) {
//        println(i)
//    }
//
//    whileLoopExample()
}

//fun whileLoopExample() {
//    var number = 0
////    while (number < 10) println(++number)
////    while (number < 10) println(number++)
////    while (number < 10) {
////        println("Number: $number")
////        number++
////    }
//    while (number < 10) {
//        if (number == 7) {
//            continue
//        }
//        println(number)
//        number++
//    }
//}

fun isEvenNumber(number: Int): Boolean {
    if ((number % 2) == 0) {
        return true
    } else {
        return false
    }
}
