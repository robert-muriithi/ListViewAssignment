package com.example.listviewassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {
    ListView listViewItem;
    ListViewAdapter adapter;
    String [] listItems = {"Bananas","Oranges","Avocados","Pineapples","Watermelons","Grapes","Mangoes","Apples","Guavas","Lemons","Tomatoes","Passion fruits","Berries"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listViewItem = (ListView) findViewById(R.id.listView);
        adapter = new ListViewAdapter(this, listItems);
        listViewItem.setAdapter(adapter);


        listViewItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),ListItemDetailsActivity.class);
                startActivity(intent);
            }
        });


    }
}