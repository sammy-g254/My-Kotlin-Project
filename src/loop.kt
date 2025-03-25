/*Whilw loop loops through a block of code as long as the specified
condition is true:
while(condition){
//block of code to be executed
} */
fun main(){
var x=1
while(x<=10){
    println(x)
    x=x+1
    }

/*do...while
do{
//block of code to be executed
}while(condition)
*/
var pin:string
do{
    println("Enter your 4-digit pin")
    pin=readLine()
    }while(pin.length!=4 || pin.toIntOrNull()==null)
    println("Pin accepted")

//Simple counter using do while
var counter=1
do{
    println("counter: $counter")
    counter++
    }while(counter<=10)

}
