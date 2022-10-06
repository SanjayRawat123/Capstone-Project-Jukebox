package com.niit.jdp.service;/*
 * Author Name:
 * Date: 10/4/2022
 * Created With: IntelliJ IDEA Community Edition
 */

import com.niit.jdp.model.Song;

import java.util.List;


public interface SongInterface {
    //  abstraction method
    public List<Song> getSongSearchBySongName(List<Song> songList, String songName) throws SongNotFound;
}

