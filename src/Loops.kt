fun main() {
    for (i in 1..10) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }

    for (i in 10 downTo 1) {
        println(i)
    }

    for (i in 1..10 step 2) {
        println(i)
    }

    whileLoopExample()
}

fun whileLoopExample() {
    var number = 0
//    while (number < 10) println(++number)
//    while (number < 10) println(number++)
//    while (number < 10) {
//        println("Number: $number")
//        number++
//    }
    while (number < 10) {
        if (number == 7) {
            continue
        }
        println(number)
        number++
    }
}
