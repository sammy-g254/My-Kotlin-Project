class car{
    //A class is a blueprint for creating objects
    //It can contain properties (variables) and functions (methods)
    var brand:String=""
    var model:String=""
    var year:String=""
    fun displayinfo(){
        println("This is a $brand $model from $year")
    }
}
fun main(){
    //Creating an object (an instance) from the class
    val mycar = car()
    mycar.brand="Mitsubishi"
    mycar.model="Lancer"
    mycar.year="2015"
    println("Brand: ${mycar.brand}, Model: ${mycar.model}, Year: ${mycar.year}")
    mycar.displayinfo()
}
