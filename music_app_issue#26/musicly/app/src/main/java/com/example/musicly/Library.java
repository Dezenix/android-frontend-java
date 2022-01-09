package com.example.musicly;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Library extends Fragment {


    public Library() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_library, container, false);
        DummyData data = new DummyData();
        data.setPlaylist();

        RecyclerView list = view.findViewById(R.id.list);
        LibraryAdapter la = new LibraryAdapter(getContext(),data.getPlaylist());
        list.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        list.setAdapter(la);

        return view;
    }
}