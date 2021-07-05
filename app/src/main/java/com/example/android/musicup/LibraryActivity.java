package com.example.android.musicup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(new Album("Tu Hi Re","Hariharan", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Tu Hi Re","Hariharan", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Tu Hi Re","Hariharan", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Tu Hi Re","Hariharan", R.drawable.ic_audiotrack_light));

        AlbumAdapter albumAdapter = new AlbumAdapter(this,albums);
        GridView gridView = findViewById(R.id.album_grid);
        gridView.setAdapter(albumAdapter);
    }
}