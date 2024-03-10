fun main() {
    sendMessage("AKM")
}

fun sendMessage(name: String = "Aung Kaung Myat", message: String = sendText()) {
    println("Name: $name and message: $message")
}

fun sendText() = "Some text!"
