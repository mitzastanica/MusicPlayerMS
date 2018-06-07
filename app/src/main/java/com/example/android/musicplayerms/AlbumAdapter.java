package com.example.android.musicplayerms;

import android.widget.ArrayAdapter;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import android.widget.ImageView;
import android.widget.TextView;

public class AlbumAdapter extends ArrayAdapter<AlbumsList> {

    private static final String LOG_TAG = AlbumAdapter.class.getSimpleName();

    /**
     * @param context      The current context. Used to inflate the layout file.
     * @param  albums     List of albums to display in a list
     */
    public AlbumAdapter(Activity context, ArrayList<AlbumsList> albums) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, albums);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.album_items, parent, false);
        }

        // Get the {@link AlbumList} object located at this position in the list
        AlbumsList currentAlbum = getItem(position);
        // Find the ImageView in the album_items.xml layout with the ID album_icon
        ImageView iconAlbumView = listItemView.findViewById(R.id.album_icon);
        // Get the image resource ID from the current AlbumsList object and
        // set the image to album_icon
        assert currentAlbum != null;
        iconAlbumView.setImageResource(currentAlbum.getAlbumImageResourceId());

        // Find the TextView in the album_items.xml layout with the ID album_name_view
        TextView albumTitleTextView = listItemView.findViewById(R.id.album_name_view);
        // Get the version name from the current AlbumsList object and
        // set this text on the name TextView
        albumTitleTextView.setText(currentAlbum.getAlbumTitle());

        // Find the TextView in the album_items.xml layout with the ID artist_album_name_view
        TextView albumAuthorTextView = listItemView.findViewById(R.id.artist_album_name_view);
        // Get the version number from the current AlbumsList object and
        // set this text on the number TextView
        albumAuthorTextView.setText(currentAlbum.getAlbumAuthor());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
