package com.auction;

public class BadCode {
    /** The current balance of the account. */
    private int balance;

    private static final int MAGIC_HUNDRED = 100;

    public BadCode(final int initialBalance) {
        this.balance = initialBalance;
    }

    public int deposit(final int amount) {
        System.out.println("amount: " + amount);
        int x = MAGIC_HUNDRED;
        balance = balance + amount;
        return balance;
    }

    public int withdraw(final int amount) {
        balance = balance - amount;
        return balance;
    }

    public int getBalance() {
        return balance;
    }
}
