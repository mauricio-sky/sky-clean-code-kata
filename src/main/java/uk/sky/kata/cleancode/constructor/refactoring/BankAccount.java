package uk.sky.kata.cleancode.constructor.refactoring;

public class BankAccount {

    private double balance;
    private double interest;

    public BankAccount() {
    }

    public BankAccount(double balance) {
        this(balance, 0.01);
    }

    public BankAccount(double balance, double interest) {
        if (interest < 0) {
            throw new IllegalArgumentException("Starting balance can't be less than 0");
        }

        if (balance < 0) {
            throw new IllegalArgumentException("Starting balance can't be less than 0");
        }

        this.balance = balance;
        this.interest = interest;
    }
}
