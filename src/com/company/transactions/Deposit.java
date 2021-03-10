package com.company.transactions;

import com.company.entities.Customer;

public class Deposit<T extends Comparable<T>> extends Transaction implements IntTransaction {

    public Deposit(Customer customer) {
        super(customer);
    }

    @Override
    public int makeOperation(int sum, Comparable value) {
        customer.setBalance(customer.getBalance() + sum);
        super.setOperCount(super.getOperCount() + 1);
        getHistory().add("Deposit amount: " + sum + " with an annual percentage - " + value + "%\n");
        return customer.getBalance();
    }
}
