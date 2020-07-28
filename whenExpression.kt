package HelloWorld

import java.util.*

fun main(args: Array<String>) {
    println("Please Enter Someting: ");
    var somethingScanner = readLine();

    when (somethingScanner) {
        "sun" -> println(somethingScanner);
        "Hey","Hello","Good Morning","John","Mart" -> println("Hello $somethingScanner")
        else -> println("None");
    }

    var scanner= Scanner (System.`in`);
    println("Please Enter Number:");
    var inputNum = scanner.nextInt();

    var result = when(inputNum){
        1 -> "One"
        3 -> "Two"
        in 3..8 -> "Between 3 and 8"
        10,12,14,16,22,20 -> "Even" //
        else ->"None"
    }
    println("$result");
    println(result)
}