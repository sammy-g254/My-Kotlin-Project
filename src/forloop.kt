fun main(){
/* for loop
for(items in collection){
//Code to execute
} */
// for loop - list of students
var students = listOf("John", "Mary", "David", "Emma");
for (x in students){
    println(x);
}
//Loop through an array
var numbers = arrayOf(1, 2, 3, 4, 5);
for (x in numbers){
    println(x);
    }
    //Loop through a range
    for (x in 1..5){
        println(x);
        }
        //Loop through a range with a step 1..10 step 2
        for (x in 1..10 step 2){
            println(x);
            }


}