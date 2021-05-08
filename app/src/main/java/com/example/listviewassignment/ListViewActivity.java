package com.example.listviewassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {
    ListView listView;
    ListViewAdapter adapter;
    String [] listItems = {"Bananas","Oranges","Avocados","Pineapples","Watermelons","Grapes","Mangoes","Apples","Guavas","Lemons"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = (ListView) findViewById(R.id.listView);
        adapter = new ListViewAdapter(this, listItems);
        listView.setAdapter(adapter);
    }
}