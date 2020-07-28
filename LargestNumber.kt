import java.util.*

fun main() {
    var max = 0
    print("Enter number one : ")
    var scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    print("Enter number one : ")
    var b = scanner.nextInt()
    print("Enter number one : ")
    var c = scanner.nextInt()
   if (a > b && a >c){
       max = a
   }
    else if (b > a && b>c){
       max = b
   }
    else
       max = c
    println("The Greatest Number is $max")

}