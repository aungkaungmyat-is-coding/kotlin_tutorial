fun main() {
    sayHello("Aung Kaung Myat", 20)

    val internetConnection = true
    if(internetConnection){
        getData("You have an internet connection!")
    } else {
        showMessage()
    }
}

fun sayHello(name: String, age: Int) {
    println("Hello, $name and your age is $age")
}

fun getData(data: String) {
    println("Data: $data")
}

fun showMessage() {
    println("There is no internet connection!")
}
