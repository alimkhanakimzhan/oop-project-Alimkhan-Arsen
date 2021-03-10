package com.company.application;

import com.company.entities.Customer;
import com.company.entities.Employee;
import com.company.transactions.*;

import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class Application {
    Scanner in = new Scanner(System.in);

    public void start() throws SQLException {
        System.out.println("""

                 ____  ____       _       _____   ____  ____  ___  ____    ______        _       ____  _____  ___  ____  \s
                |_   ||   _|     / \\     |_   _| |_  _||_  _||_  ||_  _|  |_   _ \\      / \\     |_   \\|_   _||_  ||_  _| \s
                  | |__| |      / _ \\      | |     \\ \\  / /    | |_/ /      | |_) |    / _ \\      |   \\ | |    | |_/ /   \s
                  |  __  |     / ___ \\     | |   _  \\ \\/ /     |  __'.      |  __'.   / ___ \\     | |\\ \\| |    |  __'.   \s
                 _| |  | |_  _/ /   \\ \\_  _| |__/ | _|  |_    _| |  \\ \\_   _| |__) |_/ /   \\ \\_  _| |_\\   |_  _| |  \\ \\_ \s
                |____||____||____| |____||________||______|  |____||____| |_______/|____| |____||_____|\\____||____||____|\s
                                                                                                                         \s""");
        System.out.println();
        System.out.println("""
                  __  __ ___ _  _ _   _\s
                 |  \\/  | __| \\| | | | |
                 | |\\/| | _|| .` | |_| |
                 |_|  |_|___|_|\\_|\\___/\s
                                       \s
                1 - Sign up as a Customer
                2 - Sign in as an Employee
                3 - Exit""");
        switch (in.nextInt()) {
            case 1:
                System.out.println("Creating new account...");
                Registration reg = new Registration();
                Customer customer;
                customer = reg.signUp();
                customerApp(customer);
                break;
            case 2:
                System.out.println("Signing in to an employee account...");
                Employee employee = new Employee();
                System.out.println("Enter admin's login:");
                String log = in.next();
                System.out.println("Enter admin's password:");
                String pas = in.next();
                if (employee.getAdLogin().equals(log) && employee.getAdPass().equals(pas)) {
                    employeeApp(employee);
                } else {
                    System.out.println("Wrong login or password");
                    start();
                    break;
                }
            case 3:
                break;
            default:
                System.out.println("Wrong number, please, try again");
                start();
                break;
        }
    }

    public void customerApp(Customer customer) {
        Credit credit = new Credit(customer);
        Deposit deposit = new Deposit(customer);
        Payment payment = new Payment(customer);
        Random rn = new Random();
        int value;
        boolean flag = true;
        while (flag) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Welcome, " + customer.getFirstName() + " " + customer.getSecondName() + "!");
            System.out.println("-----------------------------------------------------");
            System.out.println("  __  __ ___ _  _ _   _ \n" +
                    " |  \\/  | __| \\| | | | |\n" +
                    " | |\\/| | _|| .` | |_| |\n" +
                    " |_|  |_|___|_|\\_|\\___/ \n" +
                    "                        ");
            System.out.println("""
                    1 - Check a balance
                    2 - Take credit
                    3 - Make deposit
                    4 - Make payment
                    5 - View operation history
                    6 - Exit""");
            switch (in.nextInt()) {
                case 1:
                    System.out.println("Your balance: " + customer.getBalance() + " tenge");
                    break;
                case 2:
                    value = rn.nextInt(30) + 10;
                    System.out.println("Please, enter the credit sum:");
                    credit.makeOperation(in.nextInt(), value);
                    break;
                case 3:
                    value = rn.nextInt(30) + 10;
                    System.out.println("Please, enter the deposit sum:");
                    deposit.makeOperation(in.nextInt(), value);
                    break;
                case 4:
                    System.out.println("Please, enter the payment name:");
                    String s = in.next();
                    System.out.println("Please, enter the payment sum:");
                    payment.makeOperation(in.nextInt(), s);
                    break;
                case 5:
                    System.out.println("Credits' history:");
                    System.out.println(credit.getHistory());
                    System.out.println("Deposits' history:");
                    System.out.println(deposit.getHistory());
                    System.out.println("Payments' history:");
                    System.out.println(payment.getHistory());
                    break;
                case 6:
                    flag = false;
                default:
                    System.out.println("Wrong number, please, try again");
                    break;
            }
        }
    }

    public void employeeApp(Employee employee) {
        boolean flag = true;
        while (flag) {
            System.out.println("==========================");
            System.out.println("  __  __ ___ _  _ _   _ \n" +
                    " |  \\/  | __| \\| | | | |\n" +
                    " | |\\/| | _|| .` | |_| |\n" +
                    " |_|  |_|___|_|\\_|\\___/ \n" +
                    "                        ");
            System.out.println("""
                    1 - Show customers' table
                    2 - Show the total amount of customer balances
                    3 - Exit""");
            switch (in.nextInt()) {
                case 1:
                    System.out.println("Customers' table");
                    System.out.println("ID\t\tFirst Name\tSecond Name\tAge\t\tGender\t\tBalance (tenge)");
                    System.out.println("---------------------------------------------------------------");
                    employee.customersList();
                    break;
                case 2:
                    System.out.println("Total amount of customer balances: " + employee.totalBalance() + " tenge");
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong number, please, try again");
                    break;
            }
        }
    }
}
