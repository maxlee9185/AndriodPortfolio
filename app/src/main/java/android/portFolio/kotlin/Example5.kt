package android.portFolio.kotlin

fun main(){

    max(10,2);
    isHoliday("수")
    isHoliday("토")
    for(i in 1..10 step(2)){
        print(i)
        print(".")
    }
    println()
    for(i in IntRange(1,10)) {
        print(i)
        print('.')
    }
    println()
    for (i in 1 until 11){
        print(i)
        print('.')
    }
}

//fun max(a:Int, b:Int){
//    var result= if(a>b) {
//        println(a)
//    }
//    else{
//        println(b)
//    }
//    println(result)
//}

fun max(a:Int, b:Int){
    var result=if(a>b)a else b
    println(result)
}

fun isHoliday(dayOfWeek:String){
    var result= when(val day=dayOfWeek){
        "월","화","수","목","금" ->true
        "토","일"->if(day=="토") "좋아" else "너무좋아"
        else->"안좋아"
    }
    println(result)


}


fun isHoliday2(dayOfWeek:Any){
    var result= when(val day=dayOfWeek){
        "월","화","수","목","금" ->true
        "토","일"->if(day=="토") "좋아" else "너무좋아"
        in 2..4 -> {}
        in listOf(1,3,4) -> {}
        else->"안좋아"
    }
    println(result)
}