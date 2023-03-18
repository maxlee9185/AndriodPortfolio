package android.portFolio.kotlin

fun main(){
    val user = person("이성현", age=30)
    //user.age=29
    user.job = "Free"
    println(user.name)
    //println(user.age)
    val user2 = kid(name="최지수",28, "Dancer")
    println(user2.job)
}
open class person (open var name : String, private var age : Int, open var job : String="Samsung")

class kid(override var name: String, age: Int, override var job:String): person(name, age, job){
    var gender: String = "female"

    init{
        println("initializing...")
    }
    //secondary constructor
    constructor(name:String, age:Int, job:String, gender:String): this(name,age,job){
        this.gender=gender
    }
}