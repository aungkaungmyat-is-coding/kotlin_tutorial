fun main() {
    val result = sum(100, 2000, 204343, 3535)
    println(result)

    forEachExample(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
}

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers) {
        result += number
    }
    return result
}

fun forEachExample(vararg numbers: Int) {
    numbers.forEach { println(it) }
}
