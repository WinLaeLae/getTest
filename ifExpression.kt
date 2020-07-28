import java.util.*

fun main() {
    var scanner = Scanner(System.`in`)
    print("Enter data : ")
    var a = scanner.nextInt()
    readLine()
    if (a>0){
        println("Greater than Zero.")
    }
    else if (a > 5){
        println("Five")
    }
    else {
        println("None")
    }
    var returnValue:Any = if (a>0){
        a
    }
    else {
        "Non"
    }

}