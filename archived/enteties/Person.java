package com.company.enteties;

public class Person {
    private int age,id,salary;
    private String fullName,password;


    public Person(int age, int id, int salary, String fullName, String password) {
        this.age = age;
        this.id = id;
        this.salary = salary;
        this.fullName = fullName;
        this.password = password;
    }
    public Person(int i, int age, int salary, String name, String fullName, String password) {
        this.age = age;
        this.salary = salary;
        this.fullName = fullName;
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                ", fullName='" + fullName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
