package android.portFolio.kotlin

lateinit var text : String
//var text : String? = null

val test : Int by lazy{
    println("initializing")
    100
}
fun main(){
    text = "name"
    println("main start")
    println("first call $test")
    println("second call $test")
}