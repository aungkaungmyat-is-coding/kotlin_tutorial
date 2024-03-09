fun main () {
    var text: String? = null

    text = "This variable is not null."
    val text2 = text ?: "This variable is null."
    println(text2)

//    var text2 = ""
//
//    if (text !== null) {
//        text2 = text
//    } else {
//        text2 = "This is null."
//    }
//    println(text2)

//    text = "Hello,World!"
//    println(text!!.length)

//    if (text !== null) {
//        println(text.length)
//    } else {
//        println("The value is null.")
//    }
}
