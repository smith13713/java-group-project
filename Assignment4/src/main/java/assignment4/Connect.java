/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    private static final String DB_URL = "jdbc:mariadb://localhost:3306/u24570525_u24664155_northwind";
//    Make sure you are using your name and password****
    private static final String DB_USER = "root"; // Replace with your DB username
    private static final String DB_PASSWORD = "u24664155";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
}
