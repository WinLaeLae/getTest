import java.util.*

fun main() {
    calculate(::sumFunc)
    calculateOne(8,46, ::sumFunc)
    user()
    lambFunc(lambda)
}
fun sumFunc(a:Int, b:Int):Int{
    return a+b
}
fun calculate(function: (Int, Int)-> Int){
    val result : Int = sumFunc(9,4)
    println("Result: $result")
}
fun calculateOne(a: Int,b: Int, function: (Int, Int) -> Int){
    val result:Int = function(a,b)
    println("Result : $result")
}
fun user() {
    println("Enter Number One")
    var scanner = Scanner(System.`in`)
    var x = scanner.nextInt()
    println("Enter Number Tow")
    var y = scanner.nextInt()
    calculateOne(x,y,::sumFunc)
    calculateOne(x,y, ::subfunc)
    calculateOne(x,y, ::multfunc)
    calculateOne(x,y, ::divdfunc)
    calculateOne(x,y, ::remafunc)
}
fun subfunc(x:Int, y:Int):Int{
    return x-y
}
fun multfunc(x:Int, y:Int):Int{
    return x*y
}
fun divdfunc(x:Int, y:Int):Int{
    return x/y
}
fun remafunc(x:Int, y:Int):Int{
    return x%y
}
fun calculateTwo(a: Int,b: Int, func: (Int, Int) -> Int){
    val result:Int = func(a,b)
    println("Result : $result")
}
var lambda = { a: Int,b: Int -> a+b}
fun lambFunc(func: (Int,Int) -> Int){
    var result = func(4,6)
    println("lambda : $result")
}