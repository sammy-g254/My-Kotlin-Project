fun main(){
    //operators
    //arithmetic operators: +,-, *, /, %
    val a=30
    val b=5
    println("The sum of $a and $b is ${a+b}")
    println("The difference of $a and $b is ${a-b}")
    println("The product of $a and $b is ${a*b}")
    println("The division of $a and $b is ${a/b}")
    println("The modulus of $a and $b is ${a%b}")
    //comparison operators : ==, !=, >, <, >=, <=
    val c=30
    val d=5
    println("$c is equal to $d is ${c==d}")
    println("$c is not equal to $d is ${c!=d}")
    println("$c is greater than $d is ${c>d}")
    println("$c is less than $d is ${c<d}")
    println("$c is greater than or equal to $d is ${c>=d}")
    println("$c is less than or equal to $d is ${c<=d}")
    //logical operators: &&, ||, !
    val e=true
    val f=false
    println("$e and $f is ${e&&f}")
    println("$e or $f is ${e||f}")
    println("Not $e is ${!e}")
    //assignment operators: =, +=, -=, *=, /=, %=, <<=, >>=
    var g=10
    //Incremeny by 5
    g+=5
    println("The value of g is $g")
    //Decrement by 5
    g-=5
    println("The value of g is $g")
    //Multiplication by 5
    g*=5
    println("The value of g is $g")
    
}