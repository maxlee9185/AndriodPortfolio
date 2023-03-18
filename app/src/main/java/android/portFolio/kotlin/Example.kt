package android.portFolio.kotlin

fun main(){
    println("Hello world" )
    var a = test(1,2)
    println(a)
    a=test(3,c=2)
    println(a)
    test2("이성현",nickname="나는성현",id="maxlee")
}

fun test(a: Int, b: Int =3, c: Int = 4) : Int {
    //println(a+b)
    return a+b+c
}

fun test2(name: String, nickname: String, id: String) = println(name+" "+nickname+" " +id)