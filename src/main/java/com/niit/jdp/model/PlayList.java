/*
 * Author Name:
 * Date: 9/20/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp.model;

//import java.util.Objects;
public class PlayList {

    private int playListId;
    private String PlayListName;

    // create  No argument constructor
    public PlayList() {
    }

    // create parameterize constructor
    public PlayList(int playListId, String playListName) {
        this.playListId = playListId;
        PlayListName = playListName;
    }
}