fun main() {
    val max = getMax(400, 500, 300)
    println(max)
}

fun getMax(a: Int, b: Int) = if (a > b) a else b

fun getMax(a: Double, b: Double) = if (a > b) a else b

fun getMax(a: Int, b: Int, c: Int): Int {
    return if (a >= b && a >= c) {
        a // return a
    } else if (b >= a && b >= c) {
        b // return b
    } else {
        c // return c
    }
}
