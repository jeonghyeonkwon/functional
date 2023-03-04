package part4

fun main(){
    val products = mutableListOf<Product>()
    products.add(Product("반팔티",15000))
    products.add(Product("긴팔티",20000))
    products.add(Product("핸드폰 케이스",15000))
    products.add(Product("후드티",30000))
    products.add(Product("바지",25000))
    커스텀_필터(products)
}

fun 커스텀_필터(products: List<Product>){
    val result:List<Product> = fFilter({ p -> p.price < 20000 } , products)
    result.forEach { res -> println(res.name)}

    val result2:List<Int> = fFilter({n -> n % 2==0}, mutableListOf(1,2,3,4,5,6,7,8,9,10))
    result2.forEach {res -> println(res)}

}

fun <T>fFilter(fn : (T) -> Boolean , list:List<T>):List<T>{
    val res = mutableListOf<T>()

    for (obj in list){
        if(fn(obj)) res.add(obj)
    }
    return res
}