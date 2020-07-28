package ExampleTest

import java.util.*

fun main(args: Array<String>) {
    println("Please Enter What do you want calculate! ")
    var s = Scanner(System.`in`);
    var shape= readLine()

    if (shape=="square"){
        println("Please Enter square's Lenght")
        var s2 = Scanner(System.`in`)
        var n1= s2.nextInt()
        calSquare(::squarePerimeter,n1,::squareArea)
    }
    else if (shape=="rectangle"){
        println("Please Enter Rectangle's Lenght")
        var r=Scanner(System.`in`)
        var length=r.nextInt()
        println("Please Enter Rectangle's Width")
        var width= r.nextInt()
        calRectangle(::rectanglePerimeter,length,width,::rectangleArea);
    }
    else if (shape=="parallelogram" ){
        println("Please Enter Prarallelogram's Lenght")
        var p=Scanner(System.`in`)
        var a=p.nextInt()
        println("Please Enter Prarallelogram's Base")
        var b= p.nextInt()
        println("Please Enter Prarallelogram's Height ")
        var h=p.nextInt()
        calparallelogram(::parallelogramPerimeter,a,b,::parallelogramArea,h);
    }else if (shape=="triangle"){
        println("Please Enter Triangle's side")
        var s =Scanner(System.`in`)
        var a=s.nextInt();
        println("Please Enter Triangle's height")
        var h= s.nextInt()
        println("Please Enter Triangle's Base")
        var b=s.nextInt()
        println("Please Enter Triangle's side")
        var c= s.nextInt()
        caltriangle(::trianglePerimeter,a,b,h,c,::triangleArea)

    }else if (shape=="trapezoid"){
        println("Please Enter Triangle's side")
        var s =Scanner(System.`in`)
        var a=s.nextInt();
        println("Please Enter Triangle's height")
        var h= s.nextInt()
        println("Please Enter Triangle's Base1")
        var b1=s.nextInt()
        println("Please Enter Triangle's Base2")
        var b2=s.nextInt()
        println("Please Enter Triangle's side")
        var c= s.nextInt()
       calTrapezoid(::trapezoidPerimeter,a,b1,b2,c,::trapezoidArea,h)

    }else if( shape=="regular polygon"){
        println("Please Enter total side Number")
        var scan= Scanner(System.`in`)
        var n= scan.nextInt()
        println("Please Enter  side lenght")
        var s=scan.nextInt()
        println("Please Enter apothem num")
        var a= scan.nextInt()
        calRegularPolygon(::regularPolygonPer,n,s,::regularPolygonAre,a)

    }else if (shape=="circle"){
        println("Please Enter radial")
        var scan=Scanner(System.`in`)
        var r=scan.nextInt()
        calCircle(::circlePerimeter,r,::circleArea)
    }

    else{
        println("Please Enter shae name")
    }


}
// square
fun squarePerimeter(i: Int):Int{
    return  4*i;
}
fun squareArea(i: Int):Int{
    return  i*i;
}
fun calSquare(p:(i:Int)->Int,n1:Int,a:(x:Int)->Int){
    var perimeter =p(n1);
    println("Perimeter of Square is $perimeter");
    var area= a(n1)
    println("Area of Square is $area");
}
//Rectangle

fun rectanglePerimeter(l:Int,w:Int):Int{
    return (2*(l+w));
}
fun rectangleArea(l: Int,w: Int):Int{
    return (l*w);
}
fun  calRectangle(rec:(l:Int,w:Int)->Int,l:Int,w: Int,area:(l:Int,w:Int)->Int){
    var perimeter=rec(l,w);
    println(" Perimeter of Rectangle is $perimeter");
    var area= area(l, w);
    println(" Area of Rectangle is $area");
}
// parallelogram
fun parallelogramPerimeter (a: Int,b:Int):Int{
    return 2*(a+b);
}
fun parallelogramArea (b: Int,h:Int):Int{
    return (b*h);
}
fun calparallelogram(parall:(a:Int,b:Int)->Int,a:Int,b: Int,area: (Int, Int) -> Int,h:Int){
    var perimeter= parall(a,b);
    println("Perimeter of Parallelogram is $perimeter");
    var area= area(b,h)
    println("Area of Parallelogram is $area");
}
// Triangle
 fun trianglePerimeter(a:Int, b: Int,c:Int):Int{
    return (a+b+c)
}
fun triangleArea(b: Int,h: Int):Double{
    return (0.5*(b*h))
}

fun caltriangle(peri:(Int,Int,Int)->Int,a: Int,b: Int,h: Int,c: Int,area:(Int,Int)->Double){
    var perimeter= peri(a,b,c)
    println("Perimeter of Triangle is $perimeter");
    var area=area(b,h);
    println("Area of Triangle is $area");

}

//Trapezoid
fun trapezoidPerimeter(a: Int,b1:Int,c: Int,b2:Int):Int{
    return (a+b1+c+b2)
}
fun trapezoidArea(b1:Int,h: Int,b2:Int):Int{
    return (1/2*(b1+b2)*h)
}
fun calTrapezoid(pri:(Int,Int,Int,Int)->Int,a: Int,b1: Int,b2: Int,c: Int,area:(Int,Int,Int)->Int,h: Int){
    var perimeter= pri(a,b1,b2,c);
    println(" Perimeter of Trapezoid is $perimeter");
    var area=area(b1,b2,h)
    println("Area of Trapezoid is $area");
}

//Regular Polygon
fun regularPolygonPer(n:Int,s:Int):Int{
    return (n*s);
}
fun regularPolygonAre(p:Int,a: Int):Int{
    return (1/2*(a*p))
}
fun calRegularPolygon(p:(Int,Int)->Int,n: Int, s: Int,area:(Int,Int)->Int,a: Int){
    var perimeter= p(n,s);
    println("Perimeter of RegularPolygon is $perimeter")
    var area= area(a,perimeter);
    println("Area of RegularPolygon is $area")

}
// Circle
fun circlePerimeter(pi:Double,r:Int):Double{
    return (2*pi*r)
}
fun circleArea(pi:Double,r:Int):Double{
    return (pi*(r*r))
}
fun calCircle(p:(Double,Int)->Double,r: Int,area: (Double, Int) -> Double){
    val pi=3.14;
    var perimeter= p(pi,r);
    println("Perimeter of Circle is $perimeter");
    var area=area(pi,r)
    println("Area of Circle is $area");
}