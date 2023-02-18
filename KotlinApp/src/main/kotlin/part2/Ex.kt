package part2

fun main(){
    es6에서_리스트_순회()
}

fun es6에서_리스트_순회(){
    val arr = arrayOf<Int>(1,2,3,4,5);


    for(i in 0 until arr.size){
        print(arr[i])
    }
    println()
    for(i in arr){
        print(i)
    }
}