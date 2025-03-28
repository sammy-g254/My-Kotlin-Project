/*Create a class for a person with the following attributes
name, age, gender
Create an object of the class and initialize it with its values
And a method called printDetails() in the person class
that prints the details of the person */
class Person{
    var name: String=""
    var age: Int=0
    var gender: String=""
    fun printDetails(){
        println("Your name is $name age $age and gender is $gender")
    }
}
fun main(){
    var person=Person()
    person.name="John"
    person.age=25
    person.gender="Male"
    person.printDetails()

}