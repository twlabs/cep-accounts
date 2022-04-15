package com.thoughtworks.cep.accounts;

public class CheckingAccount {
  public CheckingAccount(long amount) {}

  long balance() {
    throw new UnsupportedOperationException();
  }

  void withdraw(int amount) {
    throw new UnsupportedOperationException();
  }

  void deposit(int amount) {
    throw new UnsupportedOperationException();
  }
}
