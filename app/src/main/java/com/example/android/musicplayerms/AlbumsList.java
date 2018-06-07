package com.example.android.musicplayerms;

public class AlbumsList {

    /**
     * Albums Title
     */
    private String mAlbumTitle;
    /**
     * Name of the artist
     */
    private String mAlbumAuthor;

    /**
     * Drawable resource ID - Album Icon
     */
    private int mItemImageId;
    /**
     * Create a new AlbumsList constructor
     *
     * @param author   is the Album author
     * @param title    is the title of the album
     * @param imageId  is drawable of album icon
     */
    public AlbumsList(String title, String author, int imageId) {

        mAlbumTitle = title;
        mAlbumAuthor = author;
        mItemImageId = imageId;
    }

    /**
     * Get the title of the album
     */
    public String getAlbumTitle() {

        return mAlbumTitle;
    }

    /**
     * Get the author of the album
     */
    public String getAlbumAuthor() {

        return  mAlbumAuthor;
    }

    /**
     * Get the album icon
     */
    public int getAlbumImageResourceId() {

        return mItemImageId;
    }

}
