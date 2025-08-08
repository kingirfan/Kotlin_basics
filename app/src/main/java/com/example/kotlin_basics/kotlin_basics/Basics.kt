package com.example.kotlin_basics.kotlin_basics

import com.example.kotlin_basics.kotlin_basics.classes.Dog

data class CoffeeDetails(val sugarCount: Int, val name: String, val size: Int, val creamAmount: Int)

fun main() {

//    print("Enter the Age")
//    val getAge = readln().toInt()
//
//    if (getAge > 17)
//        print("Working")
//    else
//        print("Not Working")
//    askCoffee()
//    println(maths())

//    constructorCall()
    val coffeeDetails = CoffeeDetails(1, "irfan", 12, 0)
    makeCoffee(coffeeDetails)

}

fun constructorCall() {
    println("Enter the name")
    val nameIs = readln()

    println("Enter the bread")
    val breedIs = readln()

    val dogClass = Dog(nameIs, breedIs)

    println(dogClass.name)
    println(dogClass.breed)
}

fun maths(): Int {
    println("Enter the first number")
    val firstNumber = readln().toInt()
    println("Enter the second number")
    val secondNumber = readln().toInt()

    return firstNumber + secondNumber
}


fun askCoffee() {
    println("Enter the name")
    val nameIs = readln()
    println("Enter the sugar count")
    val sugarCount = readln().toInt()
//    makeCoffee(name = nameIs, sugar = sugarCount)
}

fun makeCoffee(coffeeDetails: CoffeeDetails) {
    if (coffeeDetails.sugarCount == 1) {
        println("Coffe with ${coffeeDetails.sugarCount} of tea spoons for ${coffeeDetails.name}")
    } else if (coffeeDetails.sugarCount == 0) {
        println("Coffe with no sugar for ${coffeeDetails.name}")
    }
}