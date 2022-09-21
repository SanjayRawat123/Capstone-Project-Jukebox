/*
 * Author Name:
 * Date: 9/20/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp.model;

import java.util.Objects;

public class Playlist {

    private int songId;
    private String songName;
    private String albumName;
    private String genre;
    private String songPath;

    public int getSongId() {
        return songId;
    }

    public Playlist setSongId(int songId) {
        this.songId = songId;
        return this;
    }

    public String getSongName() {
        return songName;
    }

    public Playlist setSongName(String songName) {
        this.songName = songName;
        return this;
    }

    public String getAlbumName() {
        return albumName;
    }

    public Playlist setAlbumName(String albumName) {
        this.albumName = albumName;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public Playlist setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public String getSongPath() {
        return songPath;
    }

    public Playlist setSongPath(String songPath) {
        this.songPath = songPath;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Playlist playlist = (Playlist) o;
        return songId == playlist.songId && Objects.equals(songName, playlist.songName) && Objects.equals(albumName, playlist.albumName) && Objects.equals(genre, playlist.genre) && Objects.equals(songPath, playlist.songPath);
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
