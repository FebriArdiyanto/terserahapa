package com.febri.coba2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecycleActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private recycleAdapter adapter;
    private ArrayList<model> modelArrayList;

    private void addData() {
        modelArrayList = new ArrayList<>();
        modelArrayList.add(new model("Kepeng", "P123","092361", R.drawable.febri));
        modelArrayList.add(new model("Febri", "P123","092361", R.drawable.kepeng));
        modelArrayList.add(new model("lubna", "P123","092361", R.drawable.febri));
        modelArrayList.add(new model("Rodiyah", "P123","092361", R.drawable.kepeng));
        modelArrayList.add(new model("Reiky", "P123","092361", R.drawable.kepeng));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        adapter = new recycleAdapter(modelArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }


}