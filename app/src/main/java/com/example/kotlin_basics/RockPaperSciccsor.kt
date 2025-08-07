package com.example.kotlin_basics

fun main() {
    var enterChoice = 0
    var computerChoice = ""
    var playerChoice = ""
    var playerScore = 0
    var computerScore = 0
    var winner = ""

    println("Rock, Paper or Scissor. Enter Your Choice")
    enterChoice = readln().toInt()

    while (enterChoice in 1..3) {
        when (enterChoice) {
            1 ->
                playerChoice = "Rock"

            2 ->
                playerChoice = "Paper"

            3 ->
                playerChoice = "Scissor"
        }
        println("Player Choice Is $playerChoice")
        val randomNumber = (1..3).random()

        when (randomNumber) {
            1 -> computerChoice = "Rock"
            2 -> computerChoice = "Paper"
            3 -> computerChoice = "Scissor"
        }

        println("Computer Choice Is $computerChoice ")

        winner = when {
            playerChoice == computerChoice -> "Tie"
            playerChoice == "Rock" && computerChoice == "Scissor" -> "Player"
            playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
            playerChoice == "Scissor" && computerChoice == "Paper" -> "Player"
            else -> "Computer"
        }

        when (winner) {
            "Player" -> {
                println("Player wins this round!")
                playerScore++
            }

            "Computer" -> {
                println("Computer wins this round!")
                computerScore++
            }

            else -> println("It's a Tie!")
        }
        println("Enter Player choice .. Again")
        enterChoice = readln().toInt()
    }
    println("Player Score: $playerScore")
    println("Computer Score: $computerScore")

    val finalWinner = when {
        playerScore > computerScore -> "Player is the overall winner!"
        computerScore > playerScore -> "Computer is the overall winner!"
        else -> "It's a tie overall!"
    }

    println(finalWinner)

}