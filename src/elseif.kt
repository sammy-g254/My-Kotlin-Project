fun main (){
    println("Enter your marks")
    val marks=readLine()?.toIntOrNull()
    if (marks!=null && marks in 1..100){
        if(marks>=90){
            println("GRADE A")
        }else if(marks>=80){
            println("GRADE B")
        }else if(marks>=70){
            println("GRADE C")
        }else if(marks>=60){
            println("GRADE D")
        }else if(marks>=50){
            println("GRADE E")
        }else{
            println("GRADE F")
                            }
        }
        else{
            println("Invalid marks! Enter a number between 1 and 100")  
        }
}