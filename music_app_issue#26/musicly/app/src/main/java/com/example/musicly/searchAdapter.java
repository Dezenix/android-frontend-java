package com.example.musicly;

import android.content.Context;
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

public class searchAdapter extends RecyclerView.Adapter<searchAdapter.ViewHolder> {
    
    private final Context c;
    private final ArrayList<PopularModal> list;
    private final LayoutInflater inflater;
    private final int[] colors;
    private int count = 0;


    public searchAdapter(Context c, ArrayList<PopularModal> list){
        this.c = c;
        this.list = list;
        inflater = LayoutInflater.from(c);
        colors = new int[6];
        colors[0] = c.getResources().getColor(R.color.orange);
        colors[1] = c.getResources().getColor(R.color.pink);
        colors[2] = c.getResources().getColor(R.color.blue);
        colors[3] = c.getResources().getColor(R.color.teal_700);
        colors[4] = c.getResources().getColor(R.color.purple);
        colors[5] = c.getResources().getColor(R.color.gray);
    }

    @NonNull
    @Override
    public searchAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.serachitem,parent,false);
        return new searchAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull searchAdapter.ViewHolder holder, int position) {
        holder.con.setCardBackgroundColor(colors[count % 6]);
        PopularModal pm = list.get(position);
        holder.name.setText(pm.getName());
        Glide.with(c).load(Uri.parse(pm.getImg())).into(holder.poster);
        count++;
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

            name = itemView.findViewById(R.id.name_of_cat);
            poster = itemView.findViewById(R.id.img);
            con = itemView.findViewById(R.id.con);
        }
    }
}
