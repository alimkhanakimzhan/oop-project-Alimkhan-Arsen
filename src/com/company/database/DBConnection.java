package com.company.database;

import java.sql.*;

public class DBConnection {
    private Connection connection = null;
    private ResultSet rs = null;
    Statement stmt = null;

    public DBConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/bankingSystem";
            String username = "postgres";
            String password = "twix1867";
            this.connection = DriverManager.getConnection(url, username, password);
            stmt = connection.createStatement();
        } catch (ClassNotFoundException e) {
            System.out.println("Database Connection Creation Failed: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return this.connection;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }
}
