class Calculator(a:Int , b:Int) {   //primary constructor
    var c= a+b  //can't be print here
    init {      //to print use init
        var c:Int=a+b
        println(c)
    }           //init plot ony use in primary constructor  //init plot start when an object created
    companion object {  //same in java static
        var value = 10
    }
}
class Sum {
    constructor(a: Int,b: Int){
        var c =a+b
        println(c)   //can be print here
    }
}

fun main() {
    var calculator = Calculator(4,5)
    Sum(3,5)
    Calculator.value
}