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

public class SongAdapter extends ArrayAdapter<AllSongsList> {

    private static final String LOG_TAG = SongAdapter.class.getSimpleName();

    /**
     * @param context      The current context. Used to inflate the layout file.
     * @param  songs     List of songs to display in a list
     */
    public SongAdapter(Activity context, ArrayList<AllSongsList> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_items, parent, false);
        }

        // Get the {@link SongList} object located at this position in the list
        AllSongsList currentSong = getItem(position);
        // Find the ImageView in the song_items.xml layout with the ID song_icon
        ImageView iconSongView = listItemView.findViewById(R.id.song_icon);
        // Get the image resource ID from the current AllSongsList object and
        // set the image to song_icon
        assert currentSong != null;
        iconSongView.setImageResource(currentSong.getImageResourceId());

        // Find the TextView in the song_items.xml layout with the ID song_name_view
        TextView songTitleTextView = listItemView.findViewById(R.id.song_name_view);
        // Get the version name from the current AllSongsList object and
        // set this text on the name TextView
        songTitleTextView.setText(currentSong.getTitle());

        // Find the TextView in the song_items.xml layout with the ID artist_name_view
        TextView songAuthorTextView = listItemView.findViewById(R.id.artist_name_view);
        // Get the version number from the current AllSongsList object and
        // set this text on the number TextView
        songAuthorTextView.setText(currentSong.getAuthor());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
