package com.example.recyclercardview.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclercardview.Models.HorizontalitemModel;
import com.example.recyclercardview.R;

import java.util.List;

public class HorizontalitemAdapter extends RecyclerView.Adapter<HorizontalitemAdapter.ViewHolder>
{
    Context context;
    List<HorizontalitemModel> horizontalitemModelList;

    public HorizontalitemAdapter(Context context, List<HorizontalitemModel> horizontalitemModelList) {
        this.context = context;
        this.horizontalitemModelList = horizontalitemModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontalitem,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.imageView.setImageResource(horizontalitemModelList.get(position).getImage());
        holder.name.setText(horizontalitemModelList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return horizontalitemModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView name;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);

            imageView=itemView.findViewById(R.id.hor_img);
            name=itemView.findViewById(R.id.hor_txt);

        }
    }
}
