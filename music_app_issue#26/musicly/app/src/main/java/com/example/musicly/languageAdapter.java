package com.example.musicly;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class languageAdapter extends RecyclerView.Adapter<languageAdapter.ViewHolder> {

    private Context c;
    private ArrayList<String> list;
    private LayoutInflater inflater;


    public languageAdapter(Context c, ArrayList<String> list){
        this.c = c;
        this.list = list;
        inflater = LayoutInflater.from(c);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.language,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(list.get(position));
        holder.con.setOnClickListener(v -> {
            if(holder.con.getStrokeColor() == c.getResources().getColor(R.color.white)){
                holder.con.setStrokeColor(c.getResources().getColor(R.color.pink));
            }else{
                holder.con.setStrokeColor(c.getResources().getColor(R.color.white));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        MaterialCardView con;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            con = itemView.findViewById(R.id.container);
        }
    }
}
