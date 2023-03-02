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
//    var benz = Car("Mercedes Benz",  "E300","KCC 153T" ,0)
//    var toyota = Car("Toyota","Hilux","KCX 456",0)
//        benz.start()
//        println(benz.speed)
//        benz.accelerates(45)
//        benz.accelerates(72)
//        print(benz.speed)
//        benz.decelerates(-20)
//      var mybook = Book("Born a crime" , "Trevor Noah" , 300,"John Maury")
//          println(mybook.title)
//          println(mybook.author)
////
//
//
//
//
//}
//class Car(var make: String , var model: String, var registration:String ,var speed:Int){
// fun start(){
//     println("vroom vroom")
// }
//fun accelerates(acceleration:Int) :Int{
//    speed += acceleration
//    return speed
//
//     }
// fun decelerates(deceleration:Int) :Int {
//     speed -=deceleration
//     return speed
//       }
//}
//fun hoot(){
//    println("piiiiiiii")
//}
//
//fun stop(stop:Int) :Int{


//data class Book(var title:String, var author:String,var pages:Int ,var publisher:String){
//
//data class Agestats(var maxAge:Int ,var minAge:String ,var avgAge :Double)
//
//fun calculate(age: Array<Int>): Agestats{
//    val min= age.min()
//    val max= age.max()
//    val avg= age.average()
//    val stats = Agestats(max, min ,avg)
//    return stats


class Human(var name:String, var age:Int ,var weight:Int){

    fun eat(foodweight: Int){
        println("I am eating $foodweight kgs of food ")
    }

//    companion object {
//        fun speak(s: String) {
//
//        }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age += 1


    }    }

data class Student(var firstname :String, var lastname:String,var email:String,var Phonenumber:String,var password:String ){


}




