package com.febri.coba2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class listviewActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listnegara;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        listnegara = findViewById(R.id.list_negara);
        adapter = ArrayAdapter.createFromResource(this, R.array.negara, android.R.layout.simple_list_item_1);
        listnegara.setAdapter(adapter);
        listnegara.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, adapter.getItem(position), Toast.LENGTH_SHORT).show();
    }
}