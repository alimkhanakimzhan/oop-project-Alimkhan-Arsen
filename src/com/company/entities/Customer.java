package com.company.entities;

public class Customer extends Person {
    private int balance;

    public Customer(){}

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
