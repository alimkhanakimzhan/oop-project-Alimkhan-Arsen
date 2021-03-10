package com.company;

import com.company.application.Application;

import java.sql.SQLException;

public class Test {

    public static void main(String[] args) throws SQLException {
        Application app = new Application();
        app.start();
    }
}
