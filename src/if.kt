fun main() {
/*if is used to specify a block of code to be executed if a set of conditions is true */
val condition = true
if (condition) {
    // code to be executed if the condition is true
    }
    else {
        // code to be executed if the condition is false
        }

val age=20
if(age>18){
    println("you are adult")
    }
    else{
        println("you are minor")
        }

val correctusername="admin"
val correctpassword="1234"
        print("enter username:")
val username=readLine()
print("enter password:")
val password=readLine()
if(username==correctusername&&password==correctpassword){
    println("welcome $username")
    }
    else{
        println("invalid username or password")
        }



    //Program that checks if a user is eligible for driving
    //?. (safe call operator) prevents operations on nullvalues
    //toIntOrNull() - converts string to integer safely (returns null if conversion fails)
    print ("enter your age:")
    val age2=readLine()
    if(age2?.toIntOrNull() ?: 0 > 18){
        println("you are eligible for driving")
        }
        else{
            println("you are not eligible for driving")
            }


//A program to ask user for a number then checks if its even or odd
print ("Enter a number")
val num=readLine()
if(num?.toIntOrNull() ?: 0 % 2 == 0){
    println("Number is even")
    }
    else{
        println("Number is odd")
        }
}