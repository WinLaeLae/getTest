package HelloWorld

fun main(args: Array<String>) {
    var a = 10;
    if (a> 0){
        println(" Greater Than zero!")
    }else if (a> 5){
        println("Greater Than  Five !")
    }
    else{
        println(" None, A value is $a")
    }
// can sign after Condition (Any is data type and need to  use if () {} else{}
     var returnValue = if (a > 0 ) {
        a
    }else{ "None";
     }

    println(returnValue);
}