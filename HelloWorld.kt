package HelloWorld

import java.util.*

fun main(args: Array<String>) {
    var a: Int = 10;
    var str: String = "Hello !!"
    a = 15;
    val b = 11;
    //  b =12; // can not change value (Same final key)

    var c = "3";
    var d = c.toInt();// parse to integer

    println(a);
    println(str);
    println("value of a is $a"); //can output string + variable with $
    println(" Sum of a  and b is ${a + b}"); // can calculate String and two var a and b With ${}
    var scanner = Scanner(System.`in`);
    println("Please Enter Data: ");
    var s = readLine();// to get data  from scanner
    println(s);
    println("Please Enter Data: ");
    var i = scanner.nextInt(); // to get Integer data from scanner
    println(i);
}