package com.example.android.musicplayerms;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_items);

        // Create the list of albums
        ArrayList<ArtistsList> artists = new ArrayList<ArtistsList>();

        artists.add(new ArtistsList(getString(R.string.nameOfTheFirstArtist), getString(R.string.genre_type), R.drawable.artist_cover));

        // Create an {@link ArtistAdapter}, whose data source is a list of Artists.
        // This list item layout contains two {@link TextView}and a single (@link ImageView), which the adapter will set to
        // display a list of artists.
        ArtistAdapter adapter = new ArtistAdapter(this, artists);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // content_items layout file.
        ListView listView = findViewById(R.id.content);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each artist in the list of artists.
        listView.setAdapter(adapter);
    }
}
