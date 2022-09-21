/*
 * Author Name:
 * Date: 9/20/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static final String URL = "jdbc:mysql://localhost:3306/jukebox";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Rawat@9756037495";
    private Connection databaseConnection;

    public Connection getDatabaseConnection() {
        return databaseConnection;
    }

    public Database() {
        this.databaseConnection = null;
    }

    public boolean connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        databaseConnection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return databaseConnection != null;
    }

    public void printConnection() {
        if (databaseConnection != null)
            System.out.println("database connection");
        else
            System.out.println("data base not connect");
    }
}
