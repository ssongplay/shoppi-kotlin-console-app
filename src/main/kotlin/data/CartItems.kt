package data

// project 전역에서 사용되는 것이므로 싱글턴 객체로 만드는 것이 적합함
object CartItems {
    private val mutableProducts = mutableMapOf<Product, Int>()
    val products: Map<Product, Int> = mutableProducts

    fun addProduct(product: Product) {
        mutableProducts[product]?.let {
            mutableProducts[product] = it + 1
        }?:kotlin.run{
            mutableProducts[product] = 1
        }
    }

}