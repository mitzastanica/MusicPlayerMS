package com.example.android.musicplayerms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the All SongS category
        TextView allSongs = findViewById(R.id.all_songs_list);

        // Set a click listener on that View
        allSongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the All SongS category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AllSongsActivity}
                Intent AllSongsIntent = new Intent(MainActivity.this, AllSongsActivity.class);

                // Start the new activity
                startActivity(AllSongsIntent);
            }
        });

        // Find the View that shows the AlbumS category
        TextView allAlbums = findViewById(R.id.albums_list);

        // Set a click listener on that View
        allAlbums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the All SongS category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumsActivity}
                Intent AllAlbumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);

                // Start the new activity
                startActivity(AllAlbumsIntent);
            }
        });

        // Find the View that shows the ArtistS category
        TextView allArtists = findViewById(R.id.artists_list);

        // Set a click listener on that View
        allArtists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the All SongS category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistsActivity}
                Intent AllArtistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(AllArtistsIntent);
            }
        });
    }
}
