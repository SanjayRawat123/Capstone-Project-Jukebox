
package com.niit.jdp.service;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MusicPlayerService {
    public void play(Connection connection, String songPath) throws SQLException {

        int playlistID;
        try (Statement statement = connection.createStatement()) {
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("Select playlist ID to play your song : ");
            playlistID = input.nextInt();
            statement.executeQuery("SELECT * FROM `playlist` WHERE playlist_id = '" + playlistID + "'");
        }
        if (playlistID == 101) {
            songPath = "src/main/resources/songs/effect-inspiring-energetic-dubstep-soundaudio.wav";
        } else if (playlistID == 102) {
            songPath = "src/main/resources/songs/Kesariya(PagalWorld.com.se).wav";
        } else if (playlistID == 103) {
            songPath = "src/main/resources/songs/mixkit-playful-10.wav";
        } else if (playlistID == 104) {
            songPath = "src/main/resources/songs/musie-sentimental-soundaudio.wav";
        } else if (playlistID == 105) {
            songPath = "src/main/resources/songs/tuesday-glitch-soft-hip-hop-118327.wav";
        }
        File songFile = new File(songPath);
        try {
            // 3. an object of the AudioInputStream class
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(songFile);
            // 4. get a clip object from the AudioSystem
            Clip clip = AudioSystem.getClip();
            // 5. use the clip object to open the audio input stream
            clip.open(audioInputStream);
            // 6. set a loop for the sound file
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            // 7. start the sound file
            clip.start();
            // 8. pause the current thread for the time the song is being played
            long songDurationInMilliseconds = clip.getMicrosecondLength() / 1000L;
            Thread.sleep(songDurationInMilliseconds);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException exception) {
            System.err.println(exception.getMessage());
            exception.printStackTrace();
        } catch (InterruptedException e) {
            System.err.println("song thread was interrupted");
        }
    }
}