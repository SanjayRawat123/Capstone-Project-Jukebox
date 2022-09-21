/*
 * Author Name:
 * Date: 9/20/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseService {

    private final String URL = "src/main/resources/song-database.sql";
    private final String USERNAME = "root";
    private final String PASSWORD = "Rawat@9756037495";
    private Connection databaseConnection;

    public DatabaseService(Connection connection) {

        this.databaseConnection = null;
    }

    public DatabaseService() {

    }

    public Connection getDatabaseConnection() {
        return databaseConnection;
    }

    public void connect() throws SQLException {
        databaseConnection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public void printConnectionStatus() {
        if (databaseConnection != null) {
            System.out.println("Database is connected");
        } else {
            System.err.println("Database is not connected");
        }
    }

    public void printConnectStatus() {
    }
}
