package android.portFolio.kotlin

fun main(){
    var dog = Dog("baduk",9)
    println(dog.toString())
    println(dog.copy(age=2).toString())

    var cat:Cat = blueCat()

    var result = when (cat){
        is blueCat -> "BLUE"
        is redCat -> "RED"
    }

}

data class Dog(
    var name : String,
    var age : Int,
){
    override fun toString(): String {
        return "직접구현 " +"$name $age"
    }
}

sealed class Cat()

class blueCat : Cat()
class redCat : Cat()