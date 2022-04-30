package com.thoughtworks.cep.accounts

class SavingsAccount(amount: Long) {
    fun balance(): Long {
        throw UnsupportedOperationException()
    }

    fun deposit(amount: Int) {
        throw UnsupportedOperationException()
    }
}