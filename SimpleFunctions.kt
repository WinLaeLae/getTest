fun main() {
    hello()
    println(sum())
    println(sum1(4,6))
    println(sum2(8,6))
    println(sum3(9,35))
    println(sumlambda(4,9))
    println(sumlambda1(6,8))
    println(sumFun(9,76))
}
fun hello (){// no return type  //same in java void mathod
    println("Hello...")
}
fun sum():Int{//return type
    return 2+89
}
fun sum1(num1:Int, num2:Int) : Int{ //two argument and return type
    return num1+num2
}
fun sum2(num3: Int,num4: Int): Double{     //pluse integer to dot to double
    return (num3+num4).toDouble()
}
fun sum3(num5: Int,num6: Int): Double = (num5+num6).toDouble()  //single line argument and return type
var sumlambda = {a : Int , b: Int -> a+b}   //no return type by symbol arrow key (Lambdas Function)
var sumlambda1 : (Int, Int ) -> Double= {x,y->(x+y).toDouble()} //double by arrow key symbol (Lambdas Function)
var sumFun=fun (a: Int, b: Int):Int{    //anonymous function no need function name
    return a+b
}