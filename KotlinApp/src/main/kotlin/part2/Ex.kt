package part2

fun main(){
//    코틀린_배열()
//    코틀린_list()
//    코틀린_set()
    코틀린_map()
}

fun 코틀린_배열(){
    val arr = arrayOf<Int>(1,2,3,4,5);


    for(i in 0 until arr.size){
        print(arr[i])
    }
    println()
    for(i in arr){
        print(i)
    }
}

fun 코틀린_list(){
    var list = mutableListOf<Int>(1,2,3);
    list.add(4);

    for(i in 0 until list.size){
        print(list[i]);
    }
    println()
    for(i in list){
        print(i)
    }
}

fun 코틀린_set(){
    var set = mutableSetOf<Int>(1,2,3,4,4);

    set.add(5);
    print(set)
}
fun 코틀린_map(){
    var map = mutableMapOf<String,Int>("a" to 1, "b" to 2, "c" to 3);
    map.put("d" , 4);
    for((key,value) in map){
        println("key : " + key + " value : " + value)
    }

}