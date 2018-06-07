package com.example.android.musicplayerms;

public class AllSongsList {

    /**
     * Song Title
     */
    private String mSongTitle;
    /**
     * Song artist
     */
    private String mSongAuthor;

    /**
     * Drawable resource ID - Play Icon
     */
    private int mItemImageId;
    /**
     * Create a new AllSongsList constructor
     *
     * @param author   is the song author
     * @param title    is the title of a song
     * @param imageId  is drawable of play icon
     */
    public AllSongsList(String title, String author, int imageId) {

        mSongTitle = title;
        mSongAuthor = author;
        mItemImageId = imageId;
    }

    /**
     * Get the title of the song
     */
    public String getTitle() {

        return mSongTitle;
    }

    /**
     * Get the author of the song
     */
    public String getAuthor() {

        return mSongAuthor;
    }

    /**
     * Get the play icon
     */
    public int getImageResourceId() {

        return mItemImageId;
    }

}


