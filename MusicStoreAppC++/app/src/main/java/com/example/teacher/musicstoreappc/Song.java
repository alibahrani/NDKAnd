package com.example.teacher.musicstoreappc;

/** Louise Rennick example of music Store App
 * Created by teacher on 9/29/2016.
 */

public class Song {
    private long id;
    private String title;
    private String artist;

    public Song(long songID, String songTitle, String songArtist)
    {
        id= songID;
        title= songTitle;
        artist= songArtist;
    }

    public long getID()
    {
        return id;
    }
    public String getTitle()
    {
        return title;
    }
    public String getArtist()
    {
        return title;
    }


}
