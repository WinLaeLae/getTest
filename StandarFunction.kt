package HelloWorld

fun main(args: Array<String>) {
    var str = "Hello world"

    str.let {
        println("$it !!!")//it is str and not new a sign


        var a = 2
        var b = 3
        a = a.let { it + 2 }.let {
            val i = it;i
        }// need return type but no need to declare return type // i return
        println(a)

        //        // run
        str = run {
            var str = "Hello!!!" // value override if you can use when you want to change value
            str
        } //last stame is return str
        println(str)
        //also
        var c = 1
        c = c.also { it - 1 }
        println(c)
        //apply
        data class Person(var name: String, var age: Int)

        var person = Person("Ma Ma ", 22)
        println(person.name)
        println(person.age)

        person.apply {
            this.name = "John"
            this.age = 21
        }
        println(person.name)
        println(person.age)
    }
}

