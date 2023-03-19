package android.portFolio.kotlin

fun main(){
    println(check("1"))
    println(check("이성현"))
    println(check(true))
    cast(1)

    val name : String = "안녕"
    val a : Int = 1
    val isHigh : Boolean = true

    println(name+" "+a.toString()+" "+isHigh.toString())
    println ("is exactly same as")
    println("$name $a $isHigh")
}

//fun check(a:Any) : String{
//    return if(a is Int) {"숫자"}
//    else if(a is String) {"문자"}
//    else {"몰라요"}
//}

fun check(a:Any) : String{
    return when (a) {
        is Int -> {"숫자"}
        is String -> {"문자"}
        else -> {"몰라요"}
    }
}

fun cast(a:Any){
    val result = (a as? String) ?: "실패" //type casting failure elvis operator
    println(result)
}