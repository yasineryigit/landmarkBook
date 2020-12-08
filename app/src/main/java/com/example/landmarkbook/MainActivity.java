package com.example.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Intent i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = findViewById(R.id.listView);

        //landmarkBook adında String tutacak array oluşturduk
        final ArrayList<String> landmarkNames = new ArrayList<>();

        landmarkNames.add("Times Square");
        landmarkNames.add("Sydney Opera");
        landmarkNames.add("Galata Tower");
        landmarkNames.add("Niagara Waterfall");

        ArrayAdapter adapter1 = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,landmarkNames);

        listView.setAdapter(adapter1);

        final ArrayList<String> countriesName = new ArrayList();
        countriesName.add("USA");
        countriesName.add("Austrillia");
        countriesName.add("Turkey");
        countriesName.add("Canada");

        Bitmap times = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.time);
        Bitmap sydney = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.sydney);
        Bitmap galata = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.galata);
        Bitmap niagara = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.niagara);

        final ArrayList<Bitmap> resimler = new ArrayList<>();
        resimler.add(times);
        resimler.add(sydney);
        resimler.add(galata);
        resimler.add(niagara);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    i1 = new Intent(MainActivity.this,DetaySayfasi.class);
                    i1.putExtra("name",landmarkNames.get(position));
                    i1.putExtra("country",countriesName.get(position));


                    Vaybe vaybe = Vaybe.getInstance();
                    vaybe.setChosenImage(resimler.get(position));


                    startActivity(i1);


            }
        });

    }


}
