package com.thoughtworks.cep.accounts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckingAccountTest {

  @Test
  public void checkBalance() {
    var account = new CheckingAccount(100);
    assertThrows(UnsupportedOperationException.class, () -> account.balance());
  }

}
