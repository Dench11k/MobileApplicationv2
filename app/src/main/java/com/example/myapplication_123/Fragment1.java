package com.example.myapplication_123;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Fragment1 extends Fragment implements View.OnClickListener {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view1 = inflater.inflate(R.layout.fragment_1,container,false);
        Button button = (Button) view1.findViewById(R.id.button);
        Button button2 = (Button) view1.findViewById(R.id.button2);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);

        return view1;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                getParentFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.fragmentContainerView,Fragment2.class,null).commit();
                break;
            case R.id.button2:
                getParentFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.fragmentContainerView,Fragment3.class,null).commit();
                break;
        }
    }
}