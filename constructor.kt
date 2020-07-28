package HelloWorld

class Calculator constructor(a:Int,b:Int){//primary Constructor type // can not directly output print data in class
   // var c = a+b// can call with .
    init {// if you want to output in Primary Constructor that you can use init{} block // init begin run when create object
        var c= a+b
    println(c)
    }
    companion object {// to got call from fun main this value
        var value=10
    }
}
class Student (name:String,age:Int){// this also primary constructor ,this not use Constructor Keyword
    init {
        println("Student Info $name $age")
    }
}

class Sum{
    constructor(a:Int,b: Int){// Secondary Constructor type ,and will get warring
        var c= a+b;
        println(c)
    }
}
fun main(args: Array<String>) {
   // var calculator= Calculator(4,5);
   // println(calculator.c)
    Calculator(5,6)// use init so no need to create object to call other class
   // var cal = Sum(6,4);
    Sum(6,4)// secondary Con used so no need to create object to call that class
    println(Calculator.value)// can call other class's value
    Student("Hla Hla", 22)
}