fun main() {
    var tasks = arrayOf<String>()     //Empty array to store tasks
    while (true) {
        println("to do list menu---")
        println("1.Add task")
        println("2.View tasks")
        println("3.Delete task")
        println("4.Exit")
        print("Enter your choice: ")
        when (readLine()?.toIntOrNull()){
            1 -> {
                print("Enter task: ")
                val task = readLine() ?: ""
                tasks +=task //Append to array
                println("Task added")
            }
            2 -> {
                println("Your tasks")
                tasks.forEachIndexed{Index,task ->
                println("${Index+1}. $task")
                }
                }
            4 -> {
                println("Exiting")
                return
            }
        }
        }
}
