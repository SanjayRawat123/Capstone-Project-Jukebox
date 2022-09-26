/*
 * Author Name:Sanjay
 * Date: 22/09/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp.Exception;


public class PlaylistNotFoundException extends Exception {

    final String message;

    public PlaylistNotFoundException(String str) {

        message = str;
    }

    @Override
    public String toString() {
        return ("Custom Exception Occurred : " + message);
    }
}
