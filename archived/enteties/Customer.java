package com.company.enteties;

public class Customer extends Person {

    public Customer(int age, int id, int salary, String fullName, String password) {
        super(age, id, salary, fullName, password);
    }


    public int getAge(){
        return super.getAge();
    }
}
