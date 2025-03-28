class Personb(var name:String,var age:Int,var gender:String){ //Constructor
    fun printDetails(){
        println("Name $name age $age gender $gender")
    }
}
fun main(){
    //Initializing the object
    var person1 = Personb("John",25,"Male")
    //calling the method
    person1.printDetails()
}
