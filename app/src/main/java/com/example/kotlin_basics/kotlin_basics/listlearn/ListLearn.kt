package com.example.kotlin_basics.kotlin_basics.listlearn

fun main() {
    val fruits = mutableListOf("Apple", "Banana", "Cherry", "Orange", "Melon")
    fruits.add("grapes")
    fruits.remove("Apple")
    val check = fruits.contains("Cherry")
    if (check)
        println("Cherry available")
    else
        println("Cherry Not available")

    val numbers = mutableListOf(1,2,3,4,5,6,7)

    for (i in 0 until numbers.size) { // Iterates from 0 up to (not including) fruits.size
        println("Fruit at index $i: ${numbers[i]}")
    }


}