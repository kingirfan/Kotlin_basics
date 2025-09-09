package com.example.kotlin_basics.kotlin_basics.bank_account

class BankAccount(var accountHolder: String, var balance: Double) {

    private val transactionHistory = mutableListOf<String>();
    fun depositAmount(amount: Double) {
        balance += amount
        transactionHistory.add("$accountHolder deposited $amount to the account")
    }

    fun withDrawAmount(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            transactionHistory.add("$accountHolder withdraw $amount from the account")
        } else
            print("Cannot with $amount from $accountHolder")
    }

    fun transactionHistory() {
        for (transaction in transactionHistory) {
            println(transaction)
        }
    }
}