package com.example.a207_1.mylaptop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.GridLayout;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    ArrayList<Specification> menu = new ArrayList<>();

    RecyclerView rvLaptop;
    RecyclerAdapter adapter;

    Specification specification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        rvLaptop = (RecyclerView) findViewById(R.id.rvlaptop);
        rvLaptop.setHasFixedSize(true);
        rvLaptop.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerAdapter(this, menu);
        rvLaptop.setAdapter(adapter);
    }
}
