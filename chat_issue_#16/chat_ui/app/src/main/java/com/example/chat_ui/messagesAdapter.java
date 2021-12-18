package com.example.chat_ui;

import android.content.Context;
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

public class messagesAdapter extends RecyclerView.Adapter<messagesAdapter.ViewHolder> {

    private final List<messages> mData;
    private final Context mcontext;
    private final LayoutInflater mInflater;

    public messagesAdapter(Context context, List<messages> data){
        this.mcontext = context;
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
    }

    @NonNull
    @Override
    public messagesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.message_item, parent, false);
        return new messagesAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull messagesAdapter.ViewHolder holder, int position) {
        if(mData.get(position).isNewDate()){
            holder.date.setText(mData.get(position).getDate());
            holder.date.setVisibility(View.VISIBLE);
        }else{
            holder.date.setVisibility(View.GONE);
        }

        if(mData.get(position).isTextMessage()){
            if(mData.get(position).isSender()){
                holder.senderMessage.setText(mData.get(position).getText());
                holder.senderTime.setText(mData.get(position).getTime());
                holder.sender.setVisibility(View.VISIBLE);
            }else{
                holder.receiverMessage.setText(mData.get(position).getText());
                holder.receiverTime.setText(mData.get(position).getTime());
                holder.receive.setVisibility(View.VISIBLE);
            }
        }else{
            holder.sender.setVisibility(View.GONE);
            holder.receive.setVisibility(View.GONE);
        }

        if(mData.get(position).isImageMessage()){
            if(mData.get(position).isSender()){
                Picasso.with(mcontext).load(Uri.parse(mData.get(position).getImgUrl())).placeholder(R.drawable.placeholder).into(holder.senderImage);
                holder.senderImgTime.setText(mData.get(position).getTime());
                holder.senderImgCon.setVisibility(View.VISIBLE);
            }else{
                Picasso.with(mcontext).load(Uri.parse(mData.get(position).getImgUrl())).placeholder(R.drawable.placeholder).into(holder.receiverImage);
                holder.receiveImgTime.setText(mData.get(position).getTime());
                holder.receiverImgCon.setVisibility(View.VISIBLE);
            }
        }else{
            holder.senderImgCon.setVisibility(View.GONE);
            holder.receiverImgCon.setVisibility(View.GONE);
        }

        if(mData.get(position).isVideoMessage()){
            if(mData.get(position).isSender()){
                Picasso.with(mcontext).load(Uri.parse(mData.get(position).getVideoUrl())).placeholder(R.drawable.placeholder).into(holder.senderVideo);
                holder.senderVidTime.setText(mData.get(position).getTime());
                holder.senderVidCon.setVisibility(View.VISIBLE);
            }else{
                Picasso.with(mcontext).load(Uri.parse(mData.get(position).getVideoUrl())).placeholder(R.drawable.placeholder).into(holder.receiveVideo);
                holder.receiveVidTime.setText(mData.get(position).getTime());
                holder.receiveVidCon.setVisibility(View.VISIBLE);
            }
        }else{
            holder.senderVidCon.setVisibility(View.GONE);
            holder.receiveVidCon.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView date, receiverMessage, receiverTime,senderMessage,senderTime,senderImgTime,receiveImgTime,receiveVidTime,senderVidTime;
        LinearLayout receive,sender,senderImgCon,receiverImgCon,senderVidCon,receiveVidCon;
        ImageView senderImage,receiverImage,senderVideo,receiveVideo;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            date = (TextView) itemView.findViewById(R.id.date);
            receiverMessage = (TextView) itemView.findViewById(R.id.receiverMessage);
            receiverTime = (TextView) itemView.findViewById(R.id.receiverTime);
            senderMessage = (TextView) itemView.findViewById(R.id.senderMessage);
            senderTime = (TextView) itemView.findViewById(R.id.senderTime);
            senderImgTime = (TextView) itemView.findViewById(R.id.senderImgTime);
            receiveImgTime = (TextView) itemView.findViewById(R.id.receiveImgTime);
            receiveVidTime = (TextView) itemView.findViewById(R.id.receiveVidTime);
            senderVidTime = (TextView) itemView.findViewById(R.id.senderVidTime);

            receive = (LinearLayout) itemView.findViewById(R.id.receive);
            sender = (LinearLayout) itemView.findViewById(R.id.sender);
            senderImgCon = (LinearLayout) itemView.findViewById(R.id.senderImgCon);
            receiverImgCon = (LinearLayout) itemView.findViewById(R.id.receiverImgCon);
            senderVidCon = (LinearLayout) itemView.findViewById(R.id.senderVidCon);
            receiveVidCon = (LinearLayout) itemView.findViewById(R.id.receiveVidCon);

            senderImage = (ImageView) itemView.findViewById(R.id.senderImage);
            receiverImage = (ImageView) itemView.findViewById(R.id.receiverImage);
            senderVideo = (ImageView) itemView.findViewById(R.id.senderVideo);
            receiveVideo = (ImageView) itemView.findViewById(R.id.receiveVideo);
        }
    }
}
