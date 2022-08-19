package uk.sky.kata.cleancode.constructor;

public class BankAccount {

    private double balance;
    private double interest;

    public BankAccount() {
    }

    public BankAccount(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Starting balance can't be less than 0");
        }

        this.balance = balance;
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
