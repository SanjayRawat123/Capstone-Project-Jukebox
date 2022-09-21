/*
 * Author Name:
 * Date: 9/20/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp.model;

import java.util.Objects;

public class Song {

    private int songId;
    private String songName;
    private String albumName;
    private String genre;
    private String songPath;

    public Song() {
    }

    public Song(int songId, String songName, String albumName, String genre, String songPath) {
        this.songId = songId;
        this.songName = songName;
        this.albumName = albumName;
        this.genre = genre;
        this.songPath = songPath;
    }

    public int getSongId() {
        return songId;
    }

    public Song setSongId(int songId) {
        this.songId = songId;
        return this;
    }

    public String getSongName() {
        return songName;
    }

    public Song setSongName(String songName) {
        this.songName = songName;
        return this;
    }

    public String getAlbumName() {
        return albumName;
    }

    public Song setAlbumName(String albumName) {
        this.albumName = albumName;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public Song setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public String getSongPath() {
        return songPath;
    }

    public Song setSongPath(String songPath) {
        this.songPath = songPath;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return songId == song.songId && Objects.equals(songName, song.songName) && Objects.equals(albumName, song.albumName) && Objects.equals(genre, song.genre) && Objects.equals(songPath, song.songPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(songId, songName, albumName, genre, songPath);
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "songId=" + songId +
                ", songName='" + songName + '\'' +
                ", albumName='" + albumName + '\'' +
                ", genre='" + genre + '\'' +
                ", songPath='" + songPath + '\'' +
                '}';
    }
}
