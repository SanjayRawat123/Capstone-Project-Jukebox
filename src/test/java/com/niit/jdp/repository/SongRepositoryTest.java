/*
 * Author Name: sanjay
 *
 * Date: 23/9/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp.repository;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class SongRepositoryTest {
    SongRepository songRepository = null;
    Song song;
    DatabaseService databaseService = new DatabaseService();


    @BeforeEach
    void setUp() {
        songRepository = new SongRepository();
        song = new Song();
        databaseService = new DatabaseService();

    }

    @AfterEach
    void tearDown() {
        songRepository = null;
        song = null;
    }


    @Test
    void getSongByIdSuccess() throws SQLException, ClassNotFoundException {
        databaseService.connect();
        Connection connection = databaseService.getConnection();
        Song output = songRepository.getById(connection, song.getSongId());
        Song expectedOutput = songRepository.getById(connection, output.getSongId());
        Assertions.assertEquals(expectedOutput, output);
    }

    @Test
    void getSongByIdFailure() throws SQLException, ClassNotFoundException {
        databaseService.connect();
        Connection connection = databaseService.getConnection();
        Song expectedOutput = songRepository.getById(connection, song.getSongId());
        boolean output = songRepository.deleteById(connection, song.getSongId());
        Assertions.assertNotEquals(expectedOutput, output);
    }

}
