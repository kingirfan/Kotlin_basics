package com.example.kotlin_basics.kotlin_basics.enum_learn

fun main() {

    val chk = Check()
    chk.logError("hello")

}

class Check : Logger{
    override fun log(message: String) {
        TODO("Not yet implemented")
    }

    override fun logError(error: String) {
        println("Hello")
    }

}

interface Logger {
    fun log(message: String) // abstract method

    // default implementation
    fun logError(error: String) {
        println("ERROR: $error")
    }
}