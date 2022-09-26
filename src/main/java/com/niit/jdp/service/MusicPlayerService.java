package com.niit.jdp.service;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MusicPlayerService {
    /**
     * It takes the playlist ID as input and plays the song corresponding to that playlist ID
     *
     * @param connection The connection object that is used to connect to the database.
     * @param songPath   The path of the song file.
     */
    public void play(Connection connection, String songPath) throws SQLException {

        int songID;
        try (Statement statement = connection.createStatement()) {
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("Select Song ID to play your song : ");
            songID = input.nextInt();
            //  statement.executeQuery("SELECT * FROM `playlist` WHERE song_id = '" + songID + "'");
        }
        if (songID == 101) {
            songPath = "src/main/resources/songs/effect.wav";
        } else if (songID == 102) {
            songPath = "src/main/resources/songs/Kesariya(PagalWorld.com.se).wav";
        } else if (songID == 103) {
            songPath = "src/main/resources/songs/mixkit-playful-10.wav";
        } else if (songID == 104) {
            songPath = "src/main/resources/songs/musie-sentimental-soundaudio.wav";
        } else if (songID == 105) {
            songPath = "src/main/resources/songs/tuesday-glitch-soft-hip-hop-118327.wav";
        }
        File songFile = new File(songPath);
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(songFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            Scanner sc = new Scanner(System.in);
            int input;
            int temp = 0;
            long clippo = 0;

            while (temp == 0) {
                System.out.println("\nEnter your Choice\n------- ---- -------\n1.Pause\n2.Resume\n3.Restart\n4.Forward by 5s\n5.Backwards by 5s\n6.Stop and Exit");
                input = sc.nextInt();
                switch (input) {
                    case 1: {
                        clippo = clip.getMicrosecondPosition();
                        clip.stop();
                        System.out.println("---------------");
                        System.out.println("Song Paused");
                        System.out.println("---------------");
                        break;
                    }
                    case 2: {
                        clip.setMicrosecondPosition(clippo);
                        clip.start();
                        System.out.println("---------------");
                        System.out.println("Song Resumed");
                        System.out.println("---------------");
                        break;
                    }
                    case 3: {
                        clip.setMicrosecondPosition(0);
                        clip.start();
                        System.out.println("---------------");
                        System.out.println("Song Restarted");
                        System.out.println("---------------");
                        break;
                    }
                    case 4: {
                        System.out.println("---------------");
                        System.out.println("Forwarding by 5s");
                        System.out.println("---------------");
                        clip.setMicrosecondPosition(clip.getMicrosecondPosition() + 5000000);
                        break;
                    }
                    case 5: {
                        System.out.println("---------------");
                        System.out.println("Back-warding by 5s");
                        System.out.println("---------------");
                        clip.setMicrosecondPosition(clip.getMicrosecondPosition() - 5000000);
                        break;
                    }
                    case 6: {
                        clip.stop();
                        System.out.println("Stop and Exit");
                        break;
                    }
                    default: {
                        System.out.println("Invalid Choice!!");
                        break;
                    }
                }
            }
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException exception) {
            exception.printStackTrace();
        }
    }
}