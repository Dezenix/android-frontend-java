package com.example.musicly;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PlaysAdapter extends RecyclerView.Adapter<PlaysAdapter.ViewHolder> {
    
    private Context c;
    private ArrayList<PopularModal> list;
    private LayoutInflater inflater;


    public PlaysAdapter(Context c, ArrayList<PopularModal> list){
        this.c = c;
        this.list = list;
        inflater = LayoutInflater.from(c);
    }

    @NonNull
    @Override
    public PlaysAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recent,parent,false);
        return new PlaysAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaysAdapter.ViewHolder holder, int position) {
        PopularModal pm = list.get(position);
        holder.name.setText(pm.getName());
        Glide.with(c).load(Uri.parse(pm.getImg())).into(holder.poster);
        holder.con.setOnClickListener(v -> {
            Intent intent = new Intent(c,music_play.class);
            intent.putExtra("Name",pm.getName());
            intent.putExtra("Img",pm.getImg());
            c.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        ImageView poster;
        CardView con;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name_of_song);
            poster = itemView.findViewById(R.id.song_post);
            con = itemView.findViewById(R.id.con);
        }
    }
}
