package com.company.entities;

import com.company.database.DBConnection;

import java.sql.SQLException;

public class Employee {
    private int sum = 0;

    DBConnection con = new DBConnection();

    public Employee() throws SQLException {
    }

    public String getAdLogin() {
        return "admin";
    }

    public String getAdPass() {
        return "admin";
    }

    public void customersList() {
        try {
            con.setRs(con.getConnection().createStatement().executeQuery("select * from customer"));
            while (con.getRs().next()) {
                System.out.println(con.getRs().getInt("id") + "\t\t" + con.getRs().getString("firstname")
                        + "\t\t" + con.getRs().getString("secondname") + "\t\t" + con.getRs().getInt("age")
                        + "\t\t" + con.getRs().getString("gender") + "\t\t" + con.getRs().getInt("balance"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int totalBalance() {
        try {
            con.setRs(con.getConnection().createStatement().executeQuery("select * from customer"));
            while (con.getRs().next()) {
                sum += con.getRs().getInt("balance");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sum;
    }

}
