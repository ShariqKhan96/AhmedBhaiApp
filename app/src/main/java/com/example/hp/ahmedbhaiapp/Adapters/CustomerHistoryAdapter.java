package com.example.hp.ahmedbhaiapp.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hp.ahmedbhaiapp.Model.Cloth;
import com.example.hp.ahmedbhaiapp.R;

import java.util.ArrayList;

/**
 * Created by hp on 6/15/2018.
 */

public class CustomerHistoryAdapter extends RecyclerView.Adapter<CustomerHistoryAdapter.MyViewHolder> {
    private ArrayList<Cloth> arrayList = new ArrayList<>();
    private Context context;

    public CustomerHistoryAdapter(ArrayList<Cloth> cloths, Context context) {
        this.arrayList = cloths;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomerHistoryAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomerHistoryAdapter.MyViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView price;
        TextView color;
        TextView size;
        TextView shelfNo;
        ImageView clothImage;


        MyViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.cloth_name);
            price = itemView.findViewById(R.id.price);
            color = itemView.findViewById(R.id.cloth_color);
            shelfNo = itemView.findViewById(R.id.cloth_shift);
            size = itemView.findViewById(R.id.coth_size);
            clothImage = itemView.findViewById(R.id.clothImage);


        }
    }
}

