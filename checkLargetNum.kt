package HelloWorld

import java.util.*

fun main(args: Array<String>) {
    println("Please Enter Num ONe");

    var secanner = Scanner(System.`in`);
    var num1 = secanner.nextInt();
    println("Please Enter Num Two");
    var num2 = secanner.nextInt();
    println("Please Enter Num Three");
    var num3 = secanner.nextInt();

    var largest = if (num1 > num2) {

        if (num1 > num3) {
            num1
        } else {
            "not largest num"
        }
    } else if (num2 > num3) {
        num2
    } else {
        num3
    }
println( "The Larget number : $largest")


    var larNum = if (num1> num2 && num1>num3){
        num1;
    }else if (num2>num1 && num2 > num3){
        num2;
    }else{
        num3;
    }

    println( "The Larget number : $larNum") ;


    var x =11;
    if(x in 1..10){ // during 1 to 10 number
         println(" X value is $x");
    }

}