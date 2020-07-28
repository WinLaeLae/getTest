package HelloWorld

fun main(args: Array<String>) {
    hello();
    println("Two Num sum : ${sum()}")
    println("${sumNum(3, 8)}");
    println("${sum(6, 8)}");
    println("${name("Jhon", "Smith")}");
    var h = sumLambda(4, 5);
    println(h);
    var x = sumLam(6,8)
    println(x)
lambFunc(lambda);
}

fun hello() {
    println("Hello....");
}

fun sum(): Int { // No Return Function type and same void in java
    return 4 + 4;
}

fun sumNum(num1: Int, num2: Int): Int {// return Function type
    return num1 + num2;
}

fun sum(num1: Int, num2: Int): Double {
    return (num1 + num2).toDouble();// pase Int to Double value
}

fun name(firstName: String, secondName: String): String = (firstName + secondName);// for retrun single line
var sumLambda = { a: Int, b: Int -> a + b };//no return (Lambdas function type)
var sumLam: (Int, Int) -> Int =// define return type is true (Integer)(Lambdas function type)
{a,b ->a+b}
var sumLamDouble: (Int, Int) -> Double =// define return type is true (Double)(Lambdas function type)
        {a,b ->(a+b).toDouble()}

var sumFun = fun (a:Int,b:Int):Int{//Anonymous function is no need function Name
    return a+b;
}

var lambda = {a:Int,b:Int ->a+b}
fun lambFunc(func:(Int,Int)->Int){
    var result=func(4,6)
    println("Lambda: $result")
}