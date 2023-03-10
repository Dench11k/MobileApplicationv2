package com.example.myapplication_123;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class Fragment3 extends Fragment {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view1 = inflater.inflate(R.layout.fragment_3,container,false);
        RecyclerView recyclerView = (RecyclerView) view1.findViewById(R.id.RecyclerView);
        ArrayList<Car> arrayList = new ArrayList<>();
        for (int i = 0; i < 30; i++){
            arrayList.add(new Car(R.drawable.granta,"Lada Granta"));
            arrayList.add(new Car(R.drawable.vesta,"Lada Vesta"));
            arrayList.add(new Car(R.drawable.m8,"BMW M8"));
            arrayList.add(new Car(R.drawable.gelen,"Mercedes-Benz G-класс"));
            arrayList.add(new Car(R.drawable.rols,"Rolls-Royce Cullinan"));
            arrayList.add(new Car(R.drawable.miura,"Lamborghini Miura"));
            arrayList.add(new Car(R.drawable.urus,"Lamborghini Urus"));
            arrayList.add(new Car(R.drawable.bux,"УАЗ-452"));
        }
        LinearLayoutManager layoutManager = new
                LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        CarAdapter adapter = new CarAdapter(getActivity(),arrayList);
        recyclerView.setAdapter( adapter);
        return view1;
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);


    }
}