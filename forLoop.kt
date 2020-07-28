fun main() {
    for (a:Int in 1..6){
        println("$a")
    }
    for (a:Int in 1..36 step 2){
        print("$a ")
    }
    for (a:Int in 55 downTo 1){
        println("$a ")
    }
    for (a:Int in 46 downTo 2 step 4){
        println("$a ")
    }
    var arrNumber= arrayOf(1,2,3,4,5,6,7)
    for(arr in arrNumber){
        print("$arr")
    }
    for (index:Int in arrNumber.indices){
        println("$index ")
        print("${arrNumber[index]}")
    }
    for ((index:Int, value:Int)
    in arrNumber.withIndex()){
        println("$index value : $value")
    }

    var str = "Android"
    for (a:Char in str){
        print("$a ")
    }

    var x = 10
    while (x>0){
        println("$x ")
        x--
    }
    var y = 5
    do {
        print("$y ")
        y++ 
    }while ( y <10)
}