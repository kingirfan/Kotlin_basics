package fundamentals

fun main() {
    val emp1 = Employee("irfan", 1)
    val emp2 = Employee("irfuu", 2)
    val emp3 = Employee("irfuu", 2)

    println(emp1)
    println(emp1 == emp2)
    println(emp2 == emp3)

}


class Employee(val name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return obj.name == name && obj.id == id
        }
        return false
    }

    override fun toString(): String {
        return "Employee(id=$id, name=$name)"
    }

}