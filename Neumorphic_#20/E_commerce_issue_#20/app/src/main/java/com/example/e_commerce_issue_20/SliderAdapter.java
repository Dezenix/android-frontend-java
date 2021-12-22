package com.example.e_commerce_issue_20;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.MyViewHolder> {

    private final List<String> mData;
    private final Context context;
    private final LayoutInflater mInflater;

    public SliderAdapter(List<String> mData, Context context) {
        this.mData = mData;
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public SliderAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.slideritem, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SliderAdapter.MyViewHolder holder, int position) {
        Glide.with(context).load(Uri.parse(mData.get(position))).into(holder.poster);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    protected static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView poster;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            poster = (ImageView) itemView.findViewById(R.id.imgPoster);
        }
    }
}
