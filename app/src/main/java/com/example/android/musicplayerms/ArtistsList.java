package com.example.android.musicplayerms;

public class ArtistsList {

    /**
     * Artist Name
     */
    private String mArtistTitle;
    /**
     * Genre Type
     */
    private String mGenreType;

    /**
     * Drawable resource ID - Artist Icon
     */
    private int mItemImageId;
    /**
     * Create a new ArtistList constructor
     *
     * @param genre   is the genre type
     * @param artist    is the name of the artist
     * @param imageId  is drawable of artist icon
     */
    public ArtistsList(String artist, String genre, int imageId) {

        mArtistTitle = artist;
        mGenreType = genre;
        mItemImageId = imageId;
    }

    /**
     * Get the title of the album
     */
    public String getArtistTitle() {

        return  mArtistTitle;
    }

    /**
     * Get the author of the album
     */
    public String getGenreType() {

        return  mGenreType;
    }

    /**
     * Get the album icon
     */
    public int getArtistImageResourceId() {

        return mItemImageId;
    }

}
