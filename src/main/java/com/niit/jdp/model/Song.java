/*
 * Author Name:Sanjay
 * Date: 10/4/2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.niit.jdp.model;

import java.util.Objects;

public class Song {
    //these are attribute
    private int id;
    private String name;
    private String duration;
    private String albumName;
    private String artistName;
    private String genre;

    //non-parameter constructor
    public Song() {
    }

    //parameter constructor
    public Song(int id, String name, String duration, String albumName, String artistName, String genre) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.albumName = albumName;
        this.artistName = artistName;
        this.genre = genre;
    }

    //setter getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtistName() {
        return artistName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        return id == song.id && Objects.equals(name, song.name) && Objects.equals(duration, song.duration) && Objects.equals(albumName, song.albumName) && Objects.equals(artistName, song.artistName) && Objects.equals(genre, song.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, duration, albumName, artistName, genre);
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", albumName='" + albumName + '\'' +
                ", artistName='" + artistName + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}

