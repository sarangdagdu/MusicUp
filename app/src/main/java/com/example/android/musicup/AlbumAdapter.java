package com.example.android.musicup;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumAdapter  extends ArrayAdapter<Album> {
    public AlbumAdapter(Activity context, ArrayList<Album> objects) {
        super(context, 0, objects);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View gridView = convertView;
        if (gridView == null) {
            gridView = LayoutInflater.from(getContext()).inflate(
                    R.layout.album_item, parent, false);
        }


        //ge the current item to be populated
        Album album = getItem(position);

        //set the things
        TextView artistTextView = gridView.findViewById(R.id.album_artist);
        artistTextView.setText(album.getAlbumArtist());

        TextView titleTextView = gridView.findViewById(R.id.album_title);
        titleTextView.setText(album.getAlbumTitle());

        ImageView albumArtImageView = gridView.findViewById(R.id.album_art);
        albumArtImageView.setImageResource(album.getAlbumArt());



        return gridView;
    }
}
