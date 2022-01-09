package com.example.musicly;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import com.bumptech.glide.Glide;


public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ViewHolder> {
    
    private Context c;
    private ArrayList<PopularModal> list;
    private LayoutInflater inflater;


    public PopularAdapter(Context c, ArrayList<PopularModal> list){
        this.c = c;
        this.list = list;
        inflater = LayoutInflater.from(c);
    }

    @NonNull
    @Override
    public PopularAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.popular,parent,false);
        return new PopularAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularAdapter.ViewHolder holder, int position) {
        PopularModal pm = list.get(position);
        holder.name.setText(pm.getName());
        Glide.with(c).load(Uri.parse(pm.getImg())).into(holder.poster);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        ImageView poster;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name_of_song);
            poster = itemView.findViewById(R.id.img);
        }
    }
}
