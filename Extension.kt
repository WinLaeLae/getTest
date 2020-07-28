fun main() {
    var str= "ABCDEF"
    println(str.lowercase())
    var one = null
    println(one.str()) //null did't accept
    println(one!!.str()) //!! is not null

}
fun uppercase(input: String): String {
    return input.toUpperCase()
}
fun String.lowercase(): String{
    return toLowerCase()
}
fun Any?.str() : String {  //? must be added to accept null
    return toString()
}