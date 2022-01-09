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

import de.hdodenhof.circleimageview.CircleImageView;

public class LibraryAdapter extends RecyclerView.Adapter<LibraryAdapter.ViewHolder> {

    private Context c;
    private ArrayList<LibraryModal> list;
    private LayoutInflater inflater;


    public LibraryAdapter(Context c, ArrayList<LibraryModal> list){
        this.c = c;
        this.list = list;
        inflater = LayoutInflater.from(c);
    }

    @NonNull
    @Override
    public LibraryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.library,parent,false);
        return new LibraryAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LibraryAdapter.ViewHolder holder, int position) {
        LibraryModal pm = list.get(position);
        holder.name.setText(pm.getName());
        holder.type.setText(pm.getType());
        Glide.with(c).load(Uri.parse(pm.getImg())).into(holder.poster);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name,type;
        CircleImageView poster;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            poster = itemView.findViewById(R.id.symbol);
            type = itemView.findViewById(R.id.type);
        }
    }
}
