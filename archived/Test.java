package com.company;

import com.company.database.DBConnection;

import java.sql.SQLException;

public class Test {

    public static void main(String[] args) throws SQLException {
        DBConnection dbConnection = DBConnection.getInstance();
        Application app = new Application();
        app.toRun();
    }
}
