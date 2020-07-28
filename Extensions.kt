package HelloWorld

fun main(args: Array<String>) {
    var str= "ABCDEFG"
    println(str.lowercase())

    var one =null
   println( one!!.str())//!! is not null avilable (will get NullPointerException)
}
fun uppercase(input:String):String{
    return  input.toUpperCase()
}
fun String.lowercase():String{
    return toLowerCase()
}

//any is data type ,func,object
fun Any?.str() :String{//? is null avilable(will not get NullPointerException but it will continute runing next
    return toString()
}