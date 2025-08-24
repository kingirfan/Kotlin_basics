package collections

fun main() {

    val employee = listOf(
        Employee("hello", "hello", 2022),
        Employee("irfan", "irfuu", 2002),
        Employee("king", "learn", 1990),
        Employee("checking", "hello", 1991),
        Employee("checking", null, 1991),
    )

//    print(employee.minBy { it.year })
    findByLastName(employee, "hello")

    var listOfNot = employee.mapNotNull { it.lastName }
    print(listOfNot)

}

fun findByLastName(employeeList: List<Employee>, lastName: String) {
    val newList = mutableListOf<Employee>()
    val newListOf = listOf(1, 3, 5, 7)

    for ((index, number) in newListOf.withIndex()) {
        println("$index , $number")
    }


//    employeeList.forEach {
//        if(it.lastName == lastName)
//        {
//            newList.add(it)
//        }
//
//    }
//
//    print(newList.size)
}

data class Employee(val firstName: String, val lastName: String?, val year: Int)
