package com.example.myapplication_123;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private ArrayList<Car> items;

    CarAdapter(Context context, ArrayList<Car> items) {
        this.items = items;
        this.inflater = LayoutInflater.from(context);
    }
    public CarAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.cars, parent,
                false);
        return new ViewHolder(view);

    }
    @Override
    public void onBindViewHolder(@NonNull CarAdapter.ViewHolder holder, int position) {
        Car cars = items.get(position);
        holder.imageView.setImageResource(cars.getImage());
        holder.nameView.setText(cars.getNameCar());
    }
    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imageView;
        final TextView nameView;
        ViewHolder(View view){
            super(view);
            imageView = view.findViewById(R.id.imageView2);
            nameView = view.findViewById(R.id.textView);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.i("RecyclerView","element click");
                    Toast.makeText(view.getContext(), "You click!", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
