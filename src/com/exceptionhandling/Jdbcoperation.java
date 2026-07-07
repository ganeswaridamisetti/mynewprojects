package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcoperation {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Step 1: Load Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Step 2: Establish Connection
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/batch71",
                "root",
                "Ganeswari@2026");

        // Step 3: Create Statement
        Statement s = con.createStatement();

        // Step 4: Execute Query
        String sql = "SELECT * FROM emp";
        ResultSet rs = s.executeQuery(sql);

        // Step 5: Display Data
        while (rs.next()) {
            System.out.println(rs.getInt(1));
        }

        // Step 6: Close Resources
        rs.close();
        s.close();
        con.close();
    }
}