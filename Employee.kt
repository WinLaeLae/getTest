package HelloWorld

open class  Employee{ // super class used Open keyword
}

class  Developer : Employee() {

}
enum class  Days{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FIRDAY,
    SATURDAY
}

fun main(args: Array<String>) {
    println(Days.MONDAY);
}