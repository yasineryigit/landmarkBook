package com.example.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        //landmarkBook adında String tutacak array oluşturduk
        ArrayList<String> landmarkNames = new ArrayList<>();

        landmarkNames.add("Times Square");
        landmarkNames.add("Sydney Opera");
        landmarkNames.add("Galata Tower");
        landmarkNames.add("Niagara Waterfall");

        ArrayAdapter adapter1 = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,landmarkNames);

        listView.setAdapter(adapter1);


    }
}
