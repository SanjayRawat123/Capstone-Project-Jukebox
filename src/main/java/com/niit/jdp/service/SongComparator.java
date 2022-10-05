/*
 * Author Name:Sanjay
 * Date: 10/4/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp.service;

import com.niit.jdp.model.Song;

import java.util.Comparator;

public class SongComparator implements Comparator<Song> {

    @Override
    public int compare(Song o1, Song o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

