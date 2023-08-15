package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void defaultAccountCreationTest() {
        Account account = new Account();
        assertEquals(6, account.getId().length());
        assertTrue(account.getStatus());
        assertEquals(Account.Zone.ZONE_1, account.getZone());
        assertEquals(0.00, account.getBalance());
    }

    @Test
    void customAccountCreationTest() {
        Account account = new Account(false, Account.Zone.ZONE_3, 125.95);
        assertEquals(6, account.getId().length());
        assertFalse(account.getStatus());
        assertEquals(Account.Zone.ZONE_3, account.getZone());
        assertEquals(125.95, account.getBalance());
    }

    @Test
    void negativeBalanceTest() {
        assertThrows(IllegalArgumentException.class, () -> new Account(false, Account.Zone.ZONE_3, -200));
    }
}
