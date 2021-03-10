package com.company.transactions;

import com.company.entities.Customer;

public class Credit<T extends Comparable<T>> extends Transaction implements IntTransaction {
    private int creditSum = 0;

    public Credit(Customer customer) {
        super(customer);
    }

    @Override
    public int makeOperation(int sum, Comparable value) {
        customer.setBalance(customer.getBalance() + sum);
        creditSum += sum;
        getHistory().add("Credit amount: " + sum + " with an annual percentage - " + value + "%\n");
        return creditSum;
    }
}
