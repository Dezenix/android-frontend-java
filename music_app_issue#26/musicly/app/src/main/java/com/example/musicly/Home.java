package com.example.musicly;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Objects;

public class Home extends Fragment {

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_home, container, false);

        View includedLayout = view.findViewById(R.id.played);
        TextView cat = includedLayout.findViewById(R.id.cat);
        cat.setText("Recently Played");

        View includedLayout2 = view.findViewById(R.id.artist);
        TextView cat2 = includedLayout2.findViewById(R.id.cat);
        cat2.setText("Popular Artist");

        DummyData data = new DummyData();
        data.setArtist();
        data.setPopular();
        data.setRecent();

        RecyclerView popular,recent,artist;

        popular = view.findViewById(R.id.popularList);
        recent = view.findViewById(R.id.recentList);
        artist = view.findViewById(R.id.artistList);

        PopularAdapter pa = new PopularAdapter(getContext(),data.getPopular());
        PlaysAdapter rpa = new PlaysAdapter(getContext(),data.getRecent());
        ArtistAdapter aa = new ArtistAdapter(getContext(),data.getArtist());

        popular.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        popular.setAdapter(pa);

        recent.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        recent.setAdapter(rpa);

        artist.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        artist.setAdapter(aa);

        return view;
    }
}