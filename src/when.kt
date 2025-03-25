fun main(){
    //when statement for marks 
    println("Enter your marks")
    val marks = readLine()?.toIntOrNull()
    if (marks == null || marks !in 0..100) {  
        println("Enter a valid input between 0 and 100")
    } else {
        when {
            marks >= 90 -> println("GRADE A")
            marks >= 80 -> println("GRADE B")
            marks >= 70 -> println("GRADE C")
            marks >= 60 -> println("GRADE D")
            else -> println("GRADE F")
        }
    }

//Write a program that asks users to enter a number and prints the corrresponding days of the week

println("Enter a number between 1 and 7")
val day = readLine()?.toIntOrNull()
if (day == null || day !in 1..7) {
    println("Enter a valid input between 1 and 7")
    } else {
        when (day) {
            1 -> println("Monday")
            2 -> println("Tuesday")
            3 -> println("Wednesday")
            4 -> println("Thursday")
            5 -> println("Friday")
            6 -> println("Saturday")
            7 -> println("Sunday")
            }
            }
            
            
/*Write a program that asks users for their age and determines the movie ticket price based on their age
e.g. age in 5 .. 12 ->500
<5 = 200
5-12 = 500
13-60 = 1000
>60 = 700 */
println("Enter your age")
val age = readLine()?.toIntOrNull()
if (age == null || age !in 0..100) {
    println("Enter a valid input between 0 and 100")
    } else {
        when {
            age in 0..4 -> println("Ticket price is Ksh.200")
            age in 5..12 -> println("Ticket price is Ksh.500")
            age in 13..60 -> println("Ticket price is Ksh.1000")
            else -> println("Ticket price is Ksh.700")
            }
            }


}