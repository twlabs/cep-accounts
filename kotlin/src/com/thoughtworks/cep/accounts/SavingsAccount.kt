package com.thoughtworks.cep.accounts

class SavingsAccount(openingBalance: Long = 0) {
    fun balance(): Long {
        throw UnsupportedOperationException()
    }

    fun deposit(amount: Int) {
        throw UnsupportedOperationException()
    }
}