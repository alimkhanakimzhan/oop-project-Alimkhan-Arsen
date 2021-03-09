package com.company.operations;

public class Deposit implements IntOperation{
    private int deposit;

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    @Override
    public int makeOperation(int sum) {
        return 0;
    }
}
