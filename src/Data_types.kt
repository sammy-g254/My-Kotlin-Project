fun main() {
    //strings represent a sequence of characters
    val fname = "Mark"
    val hobbie:String="reading"
    println("My name is $fname and I like $hobbie")
    
    /*Numeric datatypes */
    //Int - whole numbers
    val age:Int=25
    println("My age is $age")
    //Double - numbers with decimal places
    val height:Double=1.75
    println("My height is $height")
    //Float - numbers with decimal places (must end with f)
    val weight:Float=65.5f
    println("My weight is $weight")
    //Byte - whole numbers
    val num:Byte=124
    println("My number is $num")
    //Short - whole numbers
    val num1:Short=25
    println("My short number is $num1")
    //Long - whole numbers
    val num2:Long=1000000000
    println("My long number is $num2")
    //Char - single character (in single quotes)
    val firstLetter:Char='A'
    println("First letter is $firstLetter")
    //Boolean - true or false
    val isAdmin:Boolean=true
    println("Is admin $isAdmin")
    //Array - collection of values of the same type
    val modules= arrayOf("HTML","CSS","PYTHON","DJANGO","JAVA","KOTLIN")
    println("The modules available are ${modules.joinToString()}")
    //Type conversion toDouble(), toInt(), toString(), toFloat()
    val a:Float=33.3076F
    println(a)
    val b:Int=a.toInt()
    println(b)
}