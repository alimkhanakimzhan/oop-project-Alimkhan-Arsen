package com.company.transactions;

public interface IntTransaction<T extends Comparable<T>> {

    int makeOperation(int sum, T value);
}
