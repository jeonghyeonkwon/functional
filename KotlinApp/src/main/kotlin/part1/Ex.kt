

fun main(){
//    일급_함수()
//    고차_함수1()
//    고차_함수2()
    클로저()
}

fun 일급_함수(){
    val add5 : (Int) -> Int = { x -> x + 5}
    println(add5.toString())
    println(add5(5))

    val f1 : () -> () -> Unit = { { println(1) } }
    println(f1())

    val f2 = f1()
    println(f2)
    println(f2())
}

fun 고차_함수1(){
    val apply1 = { num : Int, fnc : (Int)->Int -> fnc(num) }
    val apply2 = { fn : (Int) -> Int -> fn(1) }
    val add2 = { num : Int -> num + 2}
    println(apply1(1,add2))
    println(apply2(add2))
}
fun 고차_함수2(){
    times({i->i+1}, 10)
}
fun times(fn : (Int)->Int, num : Int){
    var i = -1;
    while (++i < num) println(fn(i));
}


fun 클로저(){
    val add10 = addMaker(10);
    println(add10(20));
}
fun addMaker(x:Int):(Int)-> Int{
    return fun(y:Int) : Int{
        return x+y;
    }
}