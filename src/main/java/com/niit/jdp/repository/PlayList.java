/*
 * Author Name:
 * Date: 9/20/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp.repository;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class PlayList {
    int response;
    List<Song> songslist;
    int songIndex;

    public void playSong(List<Song> songslist) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        this.songslist = songslist;
        for (int i = 0; i < songslist.size(); i++) {
            songIndex = i;
            playSong(songslist.get(i).getFilepath());
        }

    }

    public void playSong(String songPath) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scanner = new Scanner(System.in);
        File file = new File(songPath);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String userResponse = "";

        while (!userResponse.equals("Q")) {
            System.out.println("P = play, V= Pause, S=Stop, L=Loop, R = Reset, Q = Quit,N = NextSong,O = previousSong");
            System.out.print("Enter your choice: ");

            userResponse = scanner.next();
            userResponse = userResponse.toUpperCase();


            switch (userResponse) {
                case "P": {
                    clip.start();
                    long clip_position = clip.getMicrosecondPosition();

                    break;
                }
                case "V": {
                    clip.stop();
                    long clip_position = clip.getMicrosecondPosition();
                    break;
                }
                case "S": {
                    clip.setMicrosecondPosition(0);
                    clip.stop();
                    break;
                }
                case "L": {
                    clip.start();
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                }

                case "R":
                    clip.setMicrosecondPosition(0);
                    break;

                case "Q":
                    clip.close();
                    break;
                case "N":
                    songIndex += 1;
                    clip.close();
                    playSong(songslist.get(songIndex).getFilepath());

                    break;
                case "O":
                    songIndex -= 1;
                    clip.close();
                    playSong(songslist.get(songIndex).getFilepath());
                    break;

                default:
                    System.err.println("PLEASE SELECT THE CORRECT OPTION");
                    userResponse = scanner.next();
                    userResponse = userResponse.toUpperCase();
            }
        }
    }

}
