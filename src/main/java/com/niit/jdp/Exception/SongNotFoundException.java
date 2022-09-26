/*
 * Author Name:sanyay
 * Date: 22/9/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp.Exception;


public class SongNotFoundException extends Exception {
    final String message;

    public SongNotFoundException(String str) {
        message = str;
    }

    @Override
    public String toString() {
        return ("Custom Exception Occurred : " + message);
    }
}
