package com.example.kotlin_basics.kotlin_basics.classes

class Dog(val name: String, val breed: String) {

    init {
        bark(name, breed)
    }

    fun bark(name: String, breed: String) {
        println("Barking")
    }
}