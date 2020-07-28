class Person {
    lateinit var name: String  //lateinit is assign the value
    var age: Int = 0 //must be assign a value

    fun setValue(name: String, age: Int) {
        this.name = name
        this.age = age
        println("Name : $name \n Age : $age")

    }
}
fun main() {
    var person = Person()
    person.setValue("Aung Ye Zaw", 26)
}