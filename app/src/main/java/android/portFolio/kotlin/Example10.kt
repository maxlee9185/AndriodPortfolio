package android.portFolio.kotlin

fun main(){

//lambda function
    val a = fun(bb:Int){ println("hello")}
    val b : (Int)->Int ={it*10}
    val c : (Int, String, Boolean) -> String ={_,b,_ ->b}
    val d = {i:Int, j:Int -> i*j}

    hello(29,b)

    val extension = ExtensionFunc()
    extension.hi()
}

fun hello(a:Int, b:(Int)->Int){
    println(a)
    println(b(20))
}

fun ExtensionFunc.hi() { println("hi") }

class ExtensionFunc(){
    fun hello(){println("hello")}
    fun gg(){}
}