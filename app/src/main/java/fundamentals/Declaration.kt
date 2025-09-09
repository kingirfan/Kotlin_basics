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

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + name.hashCode()
        return result
    }

}

sealed class Result
data class Success(val data: String) : Result()
data class Error(val message: String) : Result()
object Loading : Result()

fun handle(result: Result) = when (result) {
    is Success -> println("Data Success")
    is Error -> println("Data Error")
    is Loading -> println("Data Error")
}

fun handle1(result: Result) = when (result) {
    is Success -> println("Data Success")
    is Error -> println("Data Error")
    is Loading -> println("Data Error")
}

class Utils {
    companion object {
        fun printHello() {
            println("Hello from Companion Object!")
        }

        val appName = "MyApp"
    }
}







