/*
 *Author Name : Sanjay
 *
 *Date : 23-09-2022
 *Created With : IntelliJ IDEA Community Edition
 */
package com.niit.jdp.model;

import java.util.Objects;

public class Song {
    private Song song;
    private int songId;
    private String songName;
    private String artistName;
    private String albumName;
    private String genre;
    private String duration;
    private String songPath;

    public Song() {
    }


    public Song(int songId, String songName, String albumName, String genre, String duration, String artistName, String songPath) {
        this.songId = songId;
        this.songName = songName;
        this.artistName = artistName;
        this.albumName = albumName;
        this.genre = genre;
        this.duration = duration;
        this.songPath = songPath;
    }

    public Song(Song song) {
        this.song = song;
    }

    public Song(int songId, String songName, String artistName, String genre, String duration, String songPath) {


    }


    public Song getSong() {
        return song;
    }

    public Song setSong(Song song) {
        this.song = song;
        return this;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }


    public Song setAlbumName(String albumName) {
        this.albumName = albumName;
        return this;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSongPath() {
        return songPath;
    }

    public void setSongPath(String songPath) {
        this.songPath = songPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song1 = (Song) o;
        return songId == song1.songId && Objects.equals(song, song1.song) && Objects.equals(songName, song1.songName) && Objects.equals(artistName, song1.artistName) && Objects.equals(albumName, song1.albumName) && Objects.equals(genre, song1.genre) && Objects.equals(duration, song1.duration) && Objects.equals(songPath, song1.songPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(song, songId, songName, artistName, albumName, genre, duration, songPath);
    }


    @Override
    public String toString() {
        return "Song{" +
                "song=" + song +
                ", songId=" + songId +
                ", songName='" + songName + '\'' +
                ", artistName='" + artistName + '\'' +
                ", albumName='" + albumName + '\'' +
                ", genre='" + genre + '\'' +
                ", duration='" + duration + '\'' +
                ", songPath='" + songPath + '\'' +
                '}';
    }



}