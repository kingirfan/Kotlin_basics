package com.example.kotlin_basics.kotlin_basics.extension_learn

import kotlinx.coroutines.launch
import kotlinx.coroutines.supervisorScope

fun main() {
    /*print(5.square())
    print("Kotlin is awesome".reversedWords())
    print("hello".replaceFirstChar { it.uppercase() })*/

    var person = Person()
    var newPerson  = with(person) {
        name = "Irfan"
        age = 35
    }

    println(newPerson.toString())


}

fun Int.square() = this * this

fun String.reversedWords() = this.split(" ").reversed().joinToString(" ")


class Person {
    var name: String = ""
    var age: Int = 0

    override fun toString(): String {
        return "$name : $age"
    }
}



