
fun main() {
    //Functions ae blocks of reusable code that performs a specific Task
    println("Hello from fun main()")
    //Calling the function
    greet()
    //Calling the function with argument
    myfunction("John")
    //Calling the function with argument
    myfunction2("John", 25)
}
//Calling a Function
fun greet() {
    println("Hello, good morning")
    }
//A function with parameters
//Parameters are ways of passing information to a function
fun myfunction(fname:String){
    println("Hello, good morning $fname")
}
//A function with multiple parameters
fun myfunction2(fname:String,age:Int){
    println("Hello, good morning $fname you are $age years old")
}
//A function with a return keyword
//The one below adds two numbers
fun add(a:Int,b:Int):Int{
    return a+b
}
//This one multiplies
fun multiply(x:Int,y:Int):Int{
    return x*y
}
//This identifies wheter a number is even or not (using logical operators returning true or false)
fun isEven(z:Int):Boolean{
    return z%2==0
}
//This finds the largest of three numbers
fun largest(a:Int,b:Int,c:Int):Int{
    if(a>b && a>c){
        return a
        }else if(b>a && b>c){
            return b
            }else{
                return c
                }
                }