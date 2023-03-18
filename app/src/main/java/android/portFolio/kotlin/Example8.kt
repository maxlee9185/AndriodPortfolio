package android.portFolio.kotlin

fun main(){
    var name : String = "이성현"
    var age : Int? = null
    var nickname : String? = null
    //name=null
    age=20

    var result = nickname ?: "값이 없음" //Elvis operator
    println(result)
    var size= result?.length

    result="값이 생김"
    size=result!!.length
    println(size)

}