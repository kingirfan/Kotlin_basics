package com.example.kotlin_basics.kotlin_basics.bank_account

fun main(){
    var irfanBankDetails = BankAccount("Irfan", 1000.0)

    irfanBankDetails.withDrawAmount(6000.0)
    irfanBankDetails.depositAmount(500.00)

    irfanBankDetails.transactionHistory()
    println("${irfanBankDetails.accountHolder} balance is ${irfanBankDetails.balance}")

}