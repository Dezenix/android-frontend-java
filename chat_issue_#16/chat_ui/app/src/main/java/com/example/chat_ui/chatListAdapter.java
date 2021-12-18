package com.example.chat_ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class chatListAdapter extends RecyclerView.Adapter<chatListAdapter.ViewHolder> {

    private final List<chats> mData;
    private final Context mcontext;
    private final LayoutInflater mInflater;

    public chatListAdapter(Context context, List<chats> data){
        this.mcontext = context;
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.chat_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Picasso.with(mcontext).load(Uri.parse(mData.get(position).getProfilePic())).into(holder.profilePic);
        holder.name.setText(mData.get(position).getName());
        holder.message.setText(mData.get(position).getMessage());
        holder.time.setText(mData.get(position).getTime());
        holder.onechat.setOnClickListener(v -> {
            Intent intent = new Intent(mcontext,chatActivity.class);
            intent.putExtra("Name",mData.get(position).getName());
            intent.putExtra("Pic",mData.get(position).getProfilePic());
            mcontext.startActivity(intent);
        });

        if(!mData.get(position).getIsNew()){
            holder.dot.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView profilePic;
        TextView name;
        TextView message;
        TextView time;
        ImageView dot;
        LinearLayout onechat;

        public ViewHolder(View listItem){
            super(listItem);

            profilePic = (CircleImageView) listItem.findViewById(R.id.profile_pic_chat);
            name = (TextView) listItem.findViewById(R.id.personName);
            message = (TextView) listItem.findViewById(R.id.latestMesage);
            time  = (TextView) listItem.findViewById(R.id.time);
            dot = (ImageView) listItem.findViewById(R.id.new_message);
            onechat = (LinearLayout) listItem.findViewById(R.id.person);
        }
    }
}
