package com.niit.jdp.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DatabaseServiceTest {

    //object define
    DatabaseService databaseService;

    @BeforeEach
    void setUp() {
        // object initialization
        databaseService = new DatabaseService();
    }

    @AfterEach
    void tearDown() {
        // assigning value null to object
        databaseService = null;
    }

    @Test
    void connect() {
        assertTrue(databaseService.printConnectionStatus());
        // assertFalse(databaseService.printConnectionStatus());
    }
}