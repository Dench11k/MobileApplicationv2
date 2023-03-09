package com.example.myapplication_123;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class CustomListAdapter extends ArrayAdapter<Car> {
    private LayoutInflater inflater;
    private int layout;
    private ArrayList<Car> items;

    public CustomListAdapter(Context context, int resource, ArrayList<Car> obj) {
        super(context, resource, obj);
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(this.layout, parent, false);
        ImageView imageView = view.findViewById(R.id.imageView2);
        TextView nameView = view.findViewById(R.id.textView);
        imageView.setImageResource(getItem(position).getImage());
        nameView.setText(getItem(position).getNameCar());
        return view;
    }
}
