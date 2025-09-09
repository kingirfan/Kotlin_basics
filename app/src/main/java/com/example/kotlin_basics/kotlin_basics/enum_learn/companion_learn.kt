package com.example.kotlin_basics.kotlin_basics.enum_learn

fun main() {
    Utils.helloUser()
}

class Utils {
    companion object {
        const val APP_NAME = "MyApp"

        fun greetUser(name: String) {
            println("Hello, $name! Welcome to $APP_NAME")
        }

        fun helloUser(){
            println("Hello world")
        }
    }
}