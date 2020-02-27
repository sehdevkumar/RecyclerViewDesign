package com.example.recyclerviewdesign;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class usersAdapter extends  RecyclerView.Adapter<usersAdapter.viewholder> {
  Context context;
  List<users> list;
    LayoutInflater layoutInflater;
    public usersAdapter(Context context, List<users> list) {
        this.context=context;
        this.list=list;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        layoutInflater =  LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.layoutdesign,parent,false);
        viewholder viewholder = new viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull final viewholder holder, int position) {
        final users users = list.get(position);
        holder.id.setText(""+users.getId());
        holder.title.setText(""+users.getName());
        holder.img.setImageDrawable(users.getImg());

        holder.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(context,com.example.recyclerviewdesign.view.class);
                it.putExtra("url",users.getUrls());
                context.startActivity(it);
            }
        });
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(context,com.example.recyclerviewdesign.view.class);
                it.putExtra("url",users.getUrls());
                context.startActivity(it);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView id,title;
        ImageView img;

        public viewholder(@NonNull View itemView) {
            super(itemView);
          id = itemView.findViewById(R.id.id);
          title = itemView.findViewById(R.id.title);
          img =itemView.findViewById(R.id.img);
        }
    }
}