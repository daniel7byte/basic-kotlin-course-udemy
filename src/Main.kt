fun main() {
    println("Hello World")

    val product = Product("Apple", 3000.00)
    val product1 = Product(name = "Blueberry")

    println("Product == Product1 ${product == product1}")

    val productA = Product("Pear", 55.0)
    val productB = Product("Pear", 55.0)

    println("Product == Product1 ${productA == productB}") // with data class => true ; without data => false

    productA.price = 554.0
    productB.price = 990.0

    println("Product == Product1 ${productA == productB}") // override

    println(product)
    println("Name: ${product.name} & Price: ${product.price}")

    println(product1)
    println("Name: ${product1.name} & Price: ${product1.price}")

    product1.price = 30.00;
    println("Name: ${product1.name} & Price: ${product1.price}")

    product1.price = null
    println("Name: ${product1.name} & Price: ${product1.price}")

    if (product1.price == null) {
        product1.price = 999.0
    }
    println("Name: ${product1.name} & Price: ${product1.price}")

}

data class Product(val name: String, var price: Double? = 55.5) {
    override fun equals (other: Any?) : Boolean {
        other ?: return false
        if (other === this) return true
        if(this.javaClass != other.javaClass) return false
        other as Product
        return this.name == other.name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}