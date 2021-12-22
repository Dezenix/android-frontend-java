package com.example.e_commerce_issue_20;

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

import java.util.List;

public class DelasAdapter extends RecyclerView.Adapter<DelasAdapter.MyViewHolder> {

    private final List<Deals> mData;
    private final Context context;
    private final LayoutInflater mInflater;

    public DelasAdapter(Context c,List<Deals> l){
        context = c;
        mData = l;
        mInflater =  LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public DelasAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.dealsitem,parent,false);
        return new DelasAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DelasAdapter.MyViewHolder holder, int position) {
        Deals deal = mData.get(position);
        Glide.with(context).load(Uri.parse(deal.getImgUrl())).into(holder.imgProduct);
        holder.cname.setText(deal.getCompanyName());
        holder.pname.setText(deal.getProductName());
        holder.price.setText(deal.getPrice());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    protected static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imgProduct;
        TextView cname, pname, price;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imgProduct = itemView.findViewById(R.id.dealImg);
            cname = itemView.findViewById(R.id.cname);
            pname = itemView.findViewById(R.id.pname);
            price = itemView.findViewById(R.id.price);
        }

    }
}
