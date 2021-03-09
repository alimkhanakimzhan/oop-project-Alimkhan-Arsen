package com.company;

import com.company.repositories.Registration;

import java.util.Scanner;

public class Application {
    public void toRun(){
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
                1 - Log in
                2 - Exit""");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()){
            case 1:
                Registration reg = new Registration();
                break;
            case 2:
                break;
            default:
                System.out.println("Please, enter a number");
                toRun();
        }
    }
    //object
    //object of connection


    //menu

    //switch/case




    //methods





    //exceptions methods--->exception class







}
