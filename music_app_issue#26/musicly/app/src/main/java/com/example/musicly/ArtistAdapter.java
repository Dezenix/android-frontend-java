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

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ArtistAdapter extends RecyclerView.Adapter<ArtistAdapter.ViewHolder> {
    
    private final Context c;
    private final ArrayList<PopularModal> list;
    private final LayoutInflater inflater;


    public ArtistAdapter(Context c, ArrayList<PopularModal> list){
        this.c = c;
        this.list = list;
        inflater = LayoutInflater.from(c);
    }

    @NonNull
    @Override
    public ArtistAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.artist,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArtistAdapter.ViewHolder holder, int position) {
        PopularModal pm = list.get(position);
        holder.name.setText(pm.getName());
        Glide.with(c).load(Uri.parse(pm.getImg())).into(holder.poster);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        ImageView poster;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.artist_name);
            poster = itemView.findViewById(R.id.artist_img);
        }
    }
}
