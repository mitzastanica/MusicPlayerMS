package com.example.android.musicplayerms;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class AllSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_items);

        // Create the list of songs
        ArrayList<AllSongsList> songs = new ArrayList<AllSongsList>();

        songs.add(new AllSongsList(getString(R.string.nameOfTheSong1), getString(R.string.nameOfTheFirstArtist), R.drawable.play_icon));
        songs.add(new AllSongsList(getString(R.string.nameOfTheSong2), getString(R.string.nameOfTheFirstArtist), R.drawable.play_icon));
        songs.add(new AllSongsList(getString(R.string.nameOfTheSong3), getString(R.string.nameOfTheFirstArtist), R.drawable.play_icon));
        songs.add(new AllSongsList(getString(R.string.nameOfTheSong4), getString(R.string.nameOfTheFirstArtist), R.drawable.play_icon));
        songs.add(new AllSongsList(getString(R.string.nameOfTheSong5), getString(R.string.nameOfTheFirstArtist), R.drawable.play_icon));
        songs.add(new AllSongsList(getString(R.string.nameOfTheSong6), getString(R.string.nameOfTheFirstArtist), R.drawable.play_icon));
        songs.add(new AllSongsList(getString(R.string.nameOfTheSong7), getString(R.string.nameOfTheFirstArtist), R.drawable.play_icon));
        songs.add(new AllSongsList(getString(R.string.nameOfTheSong8), getString(R.string.nameOfTheFirstArtist), R.drawable.play_icon));
        songs.add(new AllSongsList(getString(R.string.nameOfTheSong9), getString(R.string.nameOfTheFirstArtist), R.drawable.play_icon));
        songs.add(new AllSongsList(getString(R.string.nameOfTheSong10), getString(R.string.nameOfTheFirstArtist), R.drawable.play_icon));
        songs.add(new AllSongsList(getString(R.string.nameOfTheSong11), getString(R.string.nameOfTheFirstArtist), R.drawable.play_icon));
        songs.add(new AllSongsList(getString(R.string.nameOfTheSong12), getString(R.string.nameOfTheFirstArtist), R.drawable.play_icon));

        // Create an {@link SongAdapter}, whose data source is a list of Songs.
        // This list item layout contains two {@link TextView}and a single (@link ImageView), which the adapter will set to
        // display a list of songs.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // content_items layout file.
        ListView listView = findViewById(R.id.content);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each song in the list of songs.
        listView.setAdapter(adapter);

    }
}
