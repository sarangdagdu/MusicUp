package com.example.android.musicup;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * Represents a single album entry from Music Library
 */
public class Album {
    private String albumTitle;
    private String albumArtist;
    private int albumArt;


    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public void setAlbumArtist(String albumArtist) {
        this.albumArtist = albumArtist;
    }

    public void setAlbumArt(int albumArt) {
        this.albumArt = albumArt;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public String getAlbumArtist() {
        return albumArtist;
    }

    public int getAlbumArt() {
        return albumArt;
    }


    public Album(String albumTitle, String albumArtist, int albumArt) {
        this.albumTitle = albumTitle;
        this.albumArtist = albumArtist;
        this.albumArt = albumArt;
    }
}
