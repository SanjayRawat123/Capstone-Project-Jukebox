/*
 * Author Name:
 * Date: 9/20/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp.model;

import java.util.Objects;


public class PlayList {

    private int playListId;
    private String playListName;

    // create  No argument constructor
    public PlayList() {
    }

    // create parameterize constructor
    public PlayList(int playListId, String playListName) {
        this.playListId = playListId;
        this.playListName = playListName;
    }

    // define  setter  and getter method for field
    public int getPlayListId() {
        return playListId;
    }

    public PlayList setPlayListId(int playListId) {
        this.playListId = playListId;
        return this;
    }

    public String getPlayListName() {
        return playListName;
    }

    public PlayList setPlayListName(String playListName) {
        this.playListName = playListName;
        return this;
    }

    // override  the equal and hashcode method


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayList playList = (PlayList) o;
        return playListId == playList.playListId && Objects.equals(playListName, playList.playListName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playListId, playListName);
    }

    //override the toString method
    @Override
    public String toString() {
        return "PlayList{" +
                "playListId=" + playListId +
                ", PlayListName='" + playListName + '\'' +
                '}';
    }
}