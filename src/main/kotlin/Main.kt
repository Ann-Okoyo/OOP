import javax.swing.AbstractListModel

fun main(){
    var man = Human("Ann",20,54)
        man.eat(8)
    println(man.weight)
        man.speak("I love music")
        man.birthday()
         println(man.age)
    var ann = Student("Wakahia","Okoyo","annmuyale@gmail.com" ,"075678901","8987")
        println(ann.Phonenumber)
        println(ann.lastname)


    }




class Human(var name:String, var age:Int ,var weight:Int){

    fun eat(foodweight: Int){
        println("I am eating $foodweight kgs of food ")
    }


    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age += 1


    }    }

data class Student(var firstname :String, var lastname:String,var email:String,var Phonenumber:String,var password:String ){


}




