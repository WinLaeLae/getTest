package HelloWorld

class Person{
  //  lateinit var  can use only object data type

    var name:String=""// asign
    var age: Int = 0//asign
    lateinit var address:String // no need to asign  in class




    fun setValue(name:String,age:Int){
        this.name=name;
        this.age=age
        println("Name $name Age: $age")
    }
}

fun main(args: Array<String>) {
    var person=Person()// creat object but no need to use New Keyword
    person.setValue("Ma Ma ", 22)
}