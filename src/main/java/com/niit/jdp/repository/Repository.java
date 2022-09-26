/*
 *Author Name : Sanjay
 *
 *Date : 23-09-2022
 *Created With : IntelliJ IDEA Community Edition
 */
package com.niit.jdp.repository;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface Repository<T> {
    List<T> getAll(Connection connection) throws SQLException;

    T getById(Connection connection, int id) throws SQLException;

    boolean deleteById(Connection connection, int id) throws SQLException;
}



