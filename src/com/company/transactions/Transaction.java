package com.company.transactions;

import com.company.entities.Customer;

import java.util.ArrayList;

public class Transaction<T extends Comparable<T>> {
    private int operCount = 0;
    private final ArrayList<T> history;
    Customer customer;

    public Transaction(Customer customer) {
        this.customer = customer;
        history = new ArrayList<>();
    }

    public ArrayList<T> getHistory() {
        return history;
    }

    public int getOperCount() {
        return operCount;
    }

    public void setOperCount(int operCount) {
        this.operCount = operCount;
    }
}
