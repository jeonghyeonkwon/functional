package part4

fun main(){
    val products = mutableListOf<Product>()
    products.add(Product("반팔티",15000))
    products.add(Product("긴팔티",20000))
    products.add(Product("핸드폰 케이스",15000))
    products.add(Product("후드티",30000))
    products.add(Product("바지",25000))
}

fun 커스텀_필터(product: Product){
    fFilter({ p -> p.price < 2000 } , product)
}

fun <T>fFilter(fn : (T) -> Boolean , list:List<T>):List<T>{
    val res = mutableListOf<T>()

    for (obj in list){
        if(fn(obj)) res.add(obj)
    }
    return res
}