package com.jideani.veggies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VegAdapter extends RecyclerView.Adapter<VegAdapter.VegRowHolder> {

    ArrayList<Vegetable> vegData;
    Context context;

    public VegAdapter(ArrayList<Vegetable> vegData, Context context){
        this.context = context;
        this.vegData = vegData;
    }

    @NonNull
    @Override
    public VegRowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.veg_row, parent,false);
        return new VegRowHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VegRowHolder holder, int position) {

        holder.txtVegName.setText(vegData.get(position).getImage());
        holder.imgVeg.setImageResource(vegData.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return vegData.size();
    }

    class VegRowHolder extends RecyclerView.ViewHolder {

        TextView txtVegName;
        ImageView imgVeg;
        public VegRowHolder(@NonNull View itemView) {
            super(itemView);

            txtVegName = itemView.findViewById(R.id.txt_veg_name);
            imgVeg = itemView.findViewById(R.id.img_veg);
        }
    }
}
