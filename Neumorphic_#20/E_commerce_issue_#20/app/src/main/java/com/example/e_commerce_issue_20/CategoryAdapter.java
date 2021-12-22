package com.example.e_commerce_issue_20;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyViewHolder> {

    private final List<Category> mData;
    private final Context context;
    private final LayoutInflater mInflater;

    public CategoryAdapter(Context c,List<Category> l){
        context = c;
        mData = l;
        mInflater =  LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.category,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //Picasso.with(context).load(Uri.parse(mData.get(position).getUrl())).into(holder.img);
        Glide.with(context).load(Uri.parse(mData.get(position).getUrl())).into(holder.img);
        holder.title.setText(mData.get(position).getName());
        holder.title.setTextColor(Color.parseColor(mData.get(position).getColor()));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    protected static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView title;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.cateImg);
            title = itemView.findViewById(R.id.catTitle);
        }
    }

}
