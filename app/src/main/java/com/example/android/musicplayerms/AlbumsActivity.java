package com.example.android.musicplayerms;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_items);

        // Create the list of albums
        ArrayList<AlbumsList> albums = new ArrayList<AlbumsList>();

        albums.add(new AlbumsList(getString(R.string.album_name), getString(R.string.nameOfTheFirstArtist), R.drawable.album_cover));

        // Create an {@link AlbumAdapter}, whose data source is a list of Albums.
        // This list item layout contains two {@link TextView}and a single (@link ImageView), which the adapter will set to
        // display a list of albums.
        AlbumAdapter adapter = new AlbumAdapter(this, albums);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // content_items layout file.
        ListView listView = findViewById(R.id.content);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each album in the list of albums.
        listView.setAdapter(adapter);

    }
}
