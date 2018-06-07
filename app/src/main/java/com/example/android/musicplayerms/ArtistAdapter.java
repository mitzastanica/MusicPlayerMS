package com.example.android.musicplayerms;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<ArtistsList> {

    private static final String LOG_TAG = ArtistAdapter.class.getSimpleName();

    /**
     * @param context      The current context. Used to inflate the layout file.
     * @param  artists     List of artists to display in a list
     */
    public ArtistAdapter(Activity context, ArrayList<ArtistsList> artists) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, artists);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.artist_items, parent, false);
        }

        // Get the {@link ArtistsList} object located at this position in the list
        ArtistsList currentArtist = getItem(position);
        // Find the ImageView in the artist_items.xml layout with the ID genre_icon
        ImageView iconArtistView = listItemView.findViewById(R.id.genre_icon);
        // Get the image resource ID from the current ArtistsList object and
        // set the image to genre_icon
        assert currentArtist != null;
        iconArtistView.setImageResource(currentArtist.getArtistImageResourceId());

        // Find the TextView in the artist_items.xml layout with the ID artist_type_name_view
        TextView artistTitleTextView = listItemView.findViewById(R.id.artist_type_name_view);
        // Get the version name from the current ArtistsList object and
        // set this text on the name TextView
        artistTitleTextView.setText(currentArtist.getArtistTitle());

        // Find the TextView in the artist_items.xml layout with the ID genre_name_view
        TextView genreTypeTextView = listItemView.findViewById(R.id.genre_name_view);
        // Get the version number from the current ArtistsList object and
        // set this text on the number TextView
        genreTypeTextView.setText(currentArtist.getGenreType());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
