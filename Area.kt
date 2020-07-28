import java.util.*

fun main() {
    var scanner = Scanner(System.`in`)
    println("Enter Name of Figure that you want to compute:" +
            "\n square or rectangle or parallelogram or triangle or trapezoid or regularpolygon or circle:")
    var something: String? = readLine()
    when (something) {
        "square" -> {
            println("Enter the number of square : ")
            var sq = scanner.nextInt()
            square1(sq)

        }
        "rectangle" -> {
            println("Enter the number of rectangle :")
            var sq = scanner.nextInt()
            var sq1 = scanner.nextInt()
            rectan(sq, sq1)
        }
        "parallelogram" -> {
            println("Enter the number of parallelogram :")
            var sq = scanner.nextInt()
            var sq1 = scanner.nextInt()
            var sp2 = scanner.nextInt()
            parallelogram(sq, sq1, sp2)
        }
        "triangle" -> {
            println("Enter the number of triangle:")
            var sq=scanner.nextInt()
            var sq1 = scanner.nextInt()
            var sp2 = scanner.nextInt()
            var sq2 = scanner.nextInt()
            triangle(sq,sq1,sp2,sq2)

        }
        "trapezoid" -> {
            println("Enter the number of parallelogram :")
            var sq = scanner.nextInt()
            var sq1 = scanner.nextInt()
            var sp1 = scanner.nextInt()
            var sp2 = scanner.nextInt()
            trapezoid(sq,sq1,sp1,sp2)

        }
        "regularpolygon" -> {
            println("Enter the number of regularpolygon :")
            var sq = scanner.nextInt()
            var sq1 = scanner.nextInt()
            var sp2 = scanner.nextInt()
            regularpolygon(sq,sq1,sp2)

        }
        "circle" -> {
            println("Enter the number of circle :")
            var sq = scanner.nextInt()
            var sq1 = scanner.nextInt()
            circle(sq,sq1)
        }
        else -> print("Unknown")
    }
}
fun square1(h: Int) {
        var squareperi = 4 * h
        println("The parameter of square $squareperi")
        var squarearea = h*h
        println("The area of square $squarearea")

    }

fun rectan(h: Int, v: Int) {
        var rectangleperi =(2 * h) + (2 * v)
        println("The parameter of square $rectangleperi")
        var rectanglearea = h * v
        println("The area of square $rectanglearea")
    }

fun parallelogram(h: Int, v: Int ,m: Int) {
        var parallelogramperi = (2 * v) + (2 * h)
        println("The parameter of parallerlogram $parallelogramperi")
        var parallelogramarea = h * m
        println("The area of parallelogram $parallelogramarea")
    }
fun triangle(h:Int, v:Int ,m: Int , n :Int){
    var triangleperi = h+n+m
    println("The parameter of Triangle $triangleperi")
    var trianlearea= (1/2)*h*v
    println("The area of Triangle $trianlearea")

}
fun trapezoid(h:Int, v:Int ,m: Int , n:Int ){
    var trapezoidperi = v+h+m+n
    println("The parameter of trapezoid $trapezoidperi")
    var trapezoidarea=(1/2)*(h*v)
    println("The area of trapezoid $trapezoidarea")

}
fun regularpolygon(a:Int, p:Int ,s: Int){
    var regularpolyperi=p*s
    println("The perameter of regularpolygon $regularpolyperi")
    var regularpolyarea=(1/2)*a*p
    println("The area of regularpolygon $regularpolyarea")

}
fun circle(r:Int, d:Int){
    var circleperi=(22/7)*d
    println("The perameter of circle $circleperi")
    var circlearea=(22/7)*r*r
    println("The area of circle $circlearea")

}