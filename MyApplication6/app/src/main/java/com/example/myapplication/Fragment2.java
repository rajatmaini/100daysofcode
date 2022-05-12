package com.example.myapplication;
import com.example.myapplication.Database;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Fragment2 extends Fragment {
    Button b;
    EditText e;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);
        b = view.findViewById(R.id.buttonSubmit);
        e = view.findViewById(R.id.Insertion);
        b.setOnClickListener(view1 -> {
            String str = e.getText().toString();
            Database b = new Database(this.getContext(),null,null,3);
            b.insert(str,2000);
        });
        return view;
    }
}