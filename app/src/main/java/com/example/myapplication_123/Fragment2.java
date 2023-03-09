package com.example.myapplication_123;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class Fragment2 extends Fragment {
    ListView listview;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view1 = inflater.inflate(R.layout.fragment_2,container,false);
        listview = (ListView) view1.findViewById(R.id.listview);
        ArrayList<Car> arrayList = new ArrayList<>();
        for (int i = 0; i < 26; i++){
            arrayList.add(new Car(R.drawable.granta,"Lada Granta"));
            arrayList.add(new Car(R.drawable.vesta,"Lada Vesta"));
            arrayList.add(new Car(R.drawable.m8,"BMW M8"));
            arrayList.add(new Car(R.drawable.gelen,"Mercedes-Benz G-класс"));
            arrayList.add(new Car(R.drawable.rols,"Rolls-Royce Cullinan"));
            arrayList.add(new Car(R.drawable.miura,"Lamborghini Miura"));
            arrayList.add(new Car(R.drawable.urus,"Lamborghini Urus"));
            arrayList.add(new Car(R.drawable.bux,"УАЗ-452"));
        }
        CustomListAdapter adapter = new CustomListAdapter(getActivity(),
                R.layout.cars, arrayList);
        listview.setAdapter( adapter);

        return view1;
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);


    }

}