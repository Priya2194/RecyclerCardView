package com.example.recyclercardview.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclercardview.Models.VerticalitemModels;
import com.example.recyclercardview.R;

import java.util.List;

public class VerticalitemAdapters extends RecyclerView.Adapter<VerticalitemAdapters.MyViewHolder>
{
    Context context;
    List<VerticalitemModels> list;

    public VerticalitemAdapters()
    {
    }

    public VerticalitemAdapters(Context context, List<VerticalitemModels> list)
    {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(context).inflate(R.layout.verticalitem,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        holder.image.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.description.setText(list.get(position).getDescription());
        holder.rate.setText(list.get(position).getRate());
        holder.price.setText(list.get(position).getPrice());


    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageView image;
        TextView name,description,rate,price;
    public MyViewHolder(@NonNull View itemView)
    {
        super(itemView);

        image=itemView.findViewById(R.id.image);
        name=itemView.findViewById(R.id.name);
        description=itemView.findViewById(R.id.desc);
        rate=itemView.findViewById(R.id.rating);
        price=itemView.findViewById(R.id.price);
    }
}

}
