fun main() {
    //Lambda expression is an anonymous function that can be assigned to a variable
    val sum:(Int,Int)->Int = { a,b -> a+b}
    println(sum(40,90))
    //Lambda expression that multiplies two numbers
    val multiply:(Int,Int)->Int = { a,b -> a*b}
    println("The product of 5 and 4 is ${multiply(40,90)}")
    val greet:(String)->String={name->"Hello $name"}
    println(greet("Paul"))
}