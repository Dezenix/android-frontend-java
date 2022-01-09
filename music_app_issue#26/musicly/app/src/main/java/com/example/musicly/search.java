package com.example.musicly;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class search extends Fragment {


    public search() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search,container,false);

        DummyData data = new DummyData();
        data.setSearchcat();

        RecyclerView list = view.findViewById(R.id.searchList);
        searchAdapter sa = new searchAdapter(getContext(),data.getSearchcat());

        list.setLayoutManager(new GridLayoutManager(getContext(),2));
        list.setAdapter(sa);

        return view;
    }
}