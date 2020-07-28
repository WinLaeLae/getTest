package ExampleTest

import java.util.*

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`);
    println("Please Enter two Number to Sum")
    var n1=scanner.nextInt();
    println("Please Enter two Number to Sum")
    var n2=scanner.nextInt();
    println("Please Enet three Num to Sum")
    var n3=scanner.nextInt();
    calculate(::sumNum,n3,n1,n2);
    calDiv(::div,n3,n1,n2);
    calMul(::mult,n1,n2,n3)
}
fun sumNum(a:Int, b: Int): Int{
    return  a+b;
}
fun calculate(sum:(Int,Int)->Int,c: Int,n1:Int, n2:Int){
    var sumTotal=sum(n1,n2)+c;
    println("Total Sum $sumTotal")
}
fun div(a:Int, b:Int):Int{
    return a/b;
}
fun calDiv(div:(Int,Int) ->Int,n3:Int,n1: Int,n2: Int){
    var div= div((n1+n3),n2);
    println("Div result $div")
}
fun  mult(a: Int,b: Int) :Int{
    return a*b;
}
fun calMul(mult:(Int,Int)->Int,n1:Int,n2: Int,n3: Int){
    var mult= mult(n1,(n2+n3));
    println("Total Mult : $mult")
}