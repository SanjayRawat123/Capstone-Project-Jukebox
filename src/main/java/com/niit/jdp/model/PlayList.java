/*
 * Author Name:Sanjay
 * Date: 04/10/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp.model;

import java.util.Objects;

public class PlayList {
    private int playListId;
    private String playListName;


    public PlayList() {
    }

    public PlayList(String playListName, int playListId) {
        this.playListName = playListName;
        this.playListId = playListId;
    }

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    public int getPlayListId() {
        return playListId;
    }

    public void setPlayListId(int playListId) {
        this.playListId = playListId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayList)) return false;
        PlayList playList = (PlayList) o;
        return playListId == playList.playListId && Objects.equals(playListName, playList.playListName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playListName, playListId);
    }
    @Override
    public String toString() {
        return "PlayList{" +
                "playListName='" + playListName + '\'' +
                ", playListId=" + playListId +
                '}';
    }

}

