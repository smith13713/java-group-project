/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    private static final String DB_PROTO = System.getenv("dvdrental_DB_PROTO");
    private static final String DB_HOST = System.getenv("dvdrental_DB_HOST");
    private static final String DB_PORT = System.getenv("dvdrental_DB_PORT");
    private static final String DB_NAME = System.getenv("dvdrental_DB_NAME");
    private static final String DB_USER = System.getenv("dvdrental_DB_USERNAME");
    private static final String DB_PASSWORD = System.getenv("dvdrental_DB_PASSWORD");

    private static final String DB_URL = DB_PROTO + "://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME;

    public static Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            throw new SQLException("Database connection failed: " + e.getMessage(), e);
        }
    }
}
