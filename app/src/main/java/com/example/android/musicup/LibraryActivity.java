package com.example.android.musicup;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.GridView;


import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);


        ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album("Tu Hi Re","Hariharan", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Yaad Laagla","Ajay Atul", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Hossanna","Leon DSouza", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Yu Hi Re","Anirudha ", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Tere Bin","Sonu Nigam", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Jaane Kyun","Vishal Dadlani", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Rap God","Eminem", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Breathless","Shankar M", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Roja Jaaneman","Hariharan", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Muqaabla","Hariharan", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Teenage Dream","Katy Perry", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Kuch Khaas Hai","Mohit Chouhan", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Zingaat","Ajay Atul", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Kaisa hua","Vishal Mishra", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Bekhayaali","Sachet", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Apsara Aali","Ajay", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Dil Chahta Hai","Shankar", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Tanhayee","Sonu Nigam", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Zara Zara","Jayashree", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Wake Up Sid","Shankar M", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Mitwa","Shankar M", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Ye Ishq Hai","Shreya", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Challa","Romy", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Jagga Jiteya","Daler M", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Shape Of You","Ed Sheran", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Banjara","Irfaan", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Tum Hi Ho","Arijit", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Dilbar","Neha K", R.drawable.ic_audiotrack_light));
        albums.add(new Album("Raat Akeli Hai","Asha B", R.drawable.ic_audiotrack_light));


        AlbumAdapter albumAdapter = new AlbumAdapter(this,albums);
        GridView gridView = findViewById(R.id.album_grid);
        gridView.setAdapter(albumAdapter);
    }
}