package HelloWorld

fun main(args: Array<String>) {
    for (a in 1..6) {
        // println(a); // auto increadement
        println("A value is $a");
    }
    for (a in 1..10 step 2) {// step is add "+2"
        println("$a");
    }
    for (a in 10 downTo 1 step 3) { // will output 10 to 1 downto is "-1"
        println("$a");
    }
    var arrNum = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (arr in arrNum) {
        println("$arr");
    }
    for (index in arrNum.indices) {
        println("$index");//out put array Index
        println("${arrNum[index]}") //output array value
    }


    for ((index,value)in arrNum.withIndex()){ // will outut key , value
        println("$index Value : $value");
    }
    var str = "Android"
    for ( a in str){
        println(a)
    }
    var x = 10 ;
    while (x>0){
        println(x)
        x--
    }
    do {
        println(x)
    }while (x<10)
}