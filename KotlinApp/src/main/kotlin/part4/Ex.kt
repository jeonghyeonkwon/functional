package part4

fun main(){
    val products = mutableListOf<Product>()
    products.add(Product("반팔티",15000))
    products.add(Product("긴팔티",20000))
    products.add(Product("핸드폰 케이스",15000))
    products.add(Product("후드티",30000))
    products.add(Product("바지",25000))

//    커스텀_맵(products)
//    커스텀_필터(products)
//    커스텀_리듀서(products)

}

fun 커스텀_맵(products: List<Product>){
    val result = fMap({p->p.name},products);
    result.forEach{s-> println(s)}

    val result2 = fMap({p->p.price},products)
    result2.forEach{i->println(i)}

}
fun <T, V>fMap(fn : (T) -> V, list:List<T>) : List<V>{
    val res = mutableListOf<V>();
    for(obj in list){
        res.add(fn(obj))
    }
    return res;
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

fun 커스텀_리듀서(products:List<Product>){
    val add = {a:Int,b:Int -> a+b}
    val numList = mutableListOf(1,2,3,4,5)
    fReducer(add,0, numList)
}
fun fReducer(fn:Any,acc:Any,iter:List<Int>){
    
}