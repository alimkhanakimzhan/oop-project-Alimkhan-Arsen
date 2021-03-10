package com.company.application;

import com.company.database.DBConnection;
import com.company.entities.Customer;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class Registration {
    Scanner in = new Scanner(System.in);

    public Customer signUp() {
        try {
            Customer customer = new Customer();
            DBConnection connection = new DBConnection();
            String SQL = "INSERT INTO customer (firstName, secondname, age, gender, balance, login, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement st = connection.getConnection().prepareStatement(SQL);
            System.out.println("Enter your login:");
            customer.setLogin(in.next());
            System.out.println("Enter your password:");
            customer.setPassword(in.next());
            System.out.println("Enter first name:");
            customer.setFirstName(in.next());
            System.out.println("Enter second name:");
            customer.setSecondName(in.next());
            System.out.println("Enter your age:");
            customer.setAge(in.nextInt());
            System.out.println("Enter your gender - male or female:");
            customer.setGender(in.next());
            System.out.println("Enter the desired amount for the deposit:");
            customer.setBalance(in.nextInt());
            st.setString(1, customer.getFirstName());
            st.setString(2, customer.getSecondName());
            st.setInt(3, customer.getAge());
            st.setString(4, customer.getGender());
            st.setInt(5, customer.getBalance());
            st.setString(6, customer.getLogin());
            st.setString(7, customer.getPassword());
            st.execute();
            return customer;
        } catch (Exception e) {
            e.printStackTrace();
            return new Customer();
        }
    }
}
