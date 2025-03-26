//Array is a colllection of items
fun main(){
    val labs = arrayOf("Chrome","Firefox","Safari","Opera")
//Accessing arrays by its index inside square brackets
    println(labs[0])
    println(labs[1])
    println(labs[2])
    //Changing an array element
    labs[0] = "Edge"
    println(labs[0])
    //Checking the size of an array
    println(labs.size)
    //Looping through an Arrayfor (lab in labs){
    println(labs)
    //Now the array contents instead of the object itself
    println(labs.joinToString(" "))
    println("looping using forEach")
    //forEach function
    labs.forEach {x: String->
        println(x)
    }
    val prices= arrayOf(20,37,29,56)
    prices.forEach {
        println(it)
    }
    //indices property
    val fruits = arrayOf("apples","bananas","cherry","dates")
    for(x in fruits.indices){
        println("INDEX $x :${fruits[x]}")
    }
    //Iterating with withIndex()
    for((index,value) in fruits.withIndex())
        println("At index $index is $value")
}