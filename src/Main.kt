fun main() {
    println("Hello World")

    val product = Product("Apple")
    println(product)
    println("Name: ${product.name}")
}

class Product(val name: String)