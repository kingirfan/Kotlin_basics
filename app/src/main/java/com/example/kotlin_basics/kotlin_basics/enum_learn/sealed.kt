package com.example.kotlin_basics.kotlin_basics.enum_learn

sealed class Result

data class Success(val data: String) : Result()
data class Error(val message: String) : Result()
object Laoding : Result()


fun  handleSealedClass(result : Result){
    when(result){
        is Error -> TODO()
        Laoding -> TODO()
        is Success -> TODO()
    }
}

