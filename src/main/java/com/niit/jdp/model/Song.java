/*
 * Author Name:
 * Date: 9/20/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp.model;

import java.util.Objects;

public class Song {
    //list field
    private int songId;
    private String songName;
    private String artist;
    private String duration;
    ;
    private String album;
    private String genre;
    private String filepath;

    // create no argument constructor
    public Song() {
    }
    // create parameterize constructor

    public Song(int songId, String songName, String artist, String duration,
                String album,
                String genre, String filepath) {
        this.songId = songId;
        this.songName = songName;
        this.artist = artist;
        this.duration = duration;
        this.album = album;
        this.genre = genre;
        this.filepath = filepath;
    }

    // override equal , hashcode,and toString method

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return songId == song.songId && Objects.equals(songName, song.songName) && Objects.equals(artist, song.artist) && Objects.equals(duration, song.duration) && Objects.equals(album, song.album) && Objects.equals(genre, song.genre) && Objects.equals(filepath, song.filepath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(songId, songName, artist, duration, album, genre, filepath);
    }

    @Override
    public String toString() {
        return "Song{" +
                "songId=" + songId +
                ", songName='" + songName + '\'' +
                ", artist='" + artist + '\'' +
                ", duration='" + duration + '\'' +
                ", album='" + album + '\'' +
                ", genre='" + genre + '\'' +
                ", filepath='" + filepath + '\'' +
                '}';
    }
}
