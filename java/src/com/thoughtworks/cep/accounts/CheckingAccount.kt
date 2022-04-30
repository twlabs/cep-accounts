package com.thoughtworks.cep.accounts

class CheckingAccount(amount: Long) {
    fun balance(): Long {
        throw UnsupportedOperationException()
    }

    fun withdraw(amount: Int) {
        throw UnsupportedOperationException()
    }

    fun deposit(amount: Int) {
        throw UnsupportedOperationException()
    }
}