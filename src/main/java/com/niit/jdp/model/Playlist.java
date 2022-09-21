/*
 * Author Name:
 * Date: 9/20/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp.model;

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

}
