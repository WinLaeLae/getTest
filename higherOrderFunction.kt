package HelloWorld

fun main(args: Array<String>) {
    calculate(::sumFunc1)//give argument function type ,want call function name to give function name
    calculateTwo(9,13,::sumFunc);
    val cal= calculateThree()
    val res = cal(3,5);
    println("Result $res")
}

fun  sumFunc(a:Int,b:Int):Int{
    return a+b;
}
fun  calculate (func:(Int,Int)->Int){
    val result= func(2,6);
    println("Result: $result")
}
fun  sumFunc1(a:Int,b:Int):Int{
    return a-b;
}
fun  calculateTwo (a:Int, b:Int, func:(Int,Int)->Int){
    val i= func(2,6);
    var a = a;
    var b = b;

    println("Result: ${i+(a+b)}");
}
fun calculateThree(): (
(Int ,Int)->Int
){
    return ::sumFunc
}