package android.portFolio.kotlin

fun main(){
    var list= mutableListOf(1,2,3,4,5)
    list.add(7)
    list.addAll(listOf(8,9))
    println(list)


    println(list.map({it*10}).joinToString("/"))

    var list2 = listOf(1,2,3)
    //list.add(7)

    println(list.joinToString (",") )

    val map= mutableMapOf((1 to "안녕"),(2 to "hello"))
    map.put(3 , "응")
    map[4]="hohoho"

    println(map)

    var diverse= listOf(1,"하이")

}

