package com.company.transactions;

import com.company.entities.Customer;

public class Payment<T extends Comparable<T>> extends Transaction implements IntTransaction {
    public Payment(Customer customer) {
        super(customer);
    }

    @Override
    public int makeOperation(int sum, Comparable value) {
        customer.setBalance(customer.getBalance() - sum);
        setOperCount(getOperCount() + 1);
        getHistory().add("Payment name: " + value + ". Payment sum: " + sum + "\n");
        return customer.getBalance();
    }
}
