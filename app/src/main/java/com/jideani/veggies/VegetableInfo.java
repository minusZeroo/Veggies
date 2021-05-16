package com.jideani.veggies;

import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class VegetableInfo extends AppCompatActivity {

    ImageView img;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable_info);

        img = findViewById(R.id.imgCircled);
        txt = findViewById(R.id.veg);

        Intent intent = getIntent();

        img.setImageResource(intent.getIntExtra("image", R.drawable.ic_launcher_foreground));
        txt.setText(intent.getStringExtra("name"));
    }
}