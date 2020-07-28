import java.util.*

fun main() {
    println("Enter Something:")
    var something : String? = readLine()

    when (something){
        "sun" -> println(something)
        else -> print("None")

    }
    var scanner = Scanner(System.`in`)
    println("Enter Number:")
    var inputNumber:Int = scanner.nextInt()
    var result:String = when ( inputNumber) {
        1 -> "one"
        2 -> "two"
        in 3..8 -> "between 3 and 8"
        10,12,14 -> "Even"
        else -> "None"
    }
    println("$result")

}