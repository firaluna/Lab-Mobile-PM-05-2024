package com.example.tgsprak3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {
    private ArrayList<Model> posts;
    public PostAdapter(ArrayList<Model>posts){
        this.posts = posts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model post = posts.get(position);
        holder.iv_user.setImageResource(post.getImageUser());
        holder.iv_post.setImageResource(post.getImageFeeds());
        holder.tv_username.setText(post.getUsername());
        holder.tv_caption.setText(post.getCaption());

        holder.iv_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.context, activityStory.class);
                intent.putExtra("model",post);
                holder.context.startActivity(intent);
            }
        });

        holder.tv_username.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.context, activityProfile.class);
                intent.putExtra("model",post);
                holder.context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
         ImageView iv_user, iv_post;
         TextView tv_username, tv_caption;
         Context context;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_user = itemView.findViewById(R.id.profil);
            iv_post = itemView.findViewById(R.id.post);
            tv_username = itemView.findViewById(R.id.uname);
            tv_caption = itemView.findViewById(R.id.capt);
            context = itemView.getContext();
        }
    }
}