package com.example.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;



public class DetaySayfasi extends AppCompatActivity {

    ImageView imageView;
    TextView landmarkText,countryText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay_sayfasi);

        imageView = findViewById(R.id.imageView);
        landmarkText = findViewById(R.id.landmarkNameText);
        countryText = findViewById(R.id.countryNameText);

        Intent i = getIntent();
        landmarkText.setText(i.getStringExtra("name"));
        countryText.setText(i.getStringExtra("country"));

        /*Hali hazırda mainactivity'de singleton objesi oluşturduğumuz için mevcut objeyi kullanacak */
        Vaybe vaybe = Vaybe.getInstance();
        imageView.setImageBitmap(vaybe.getChosenImage());
    }
}
