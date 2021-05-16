package com.jideani.veggies;

import android.content.Intent;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements VegAdapter.MyClickInterface{

    RecyclerView recyclerView;
    ArrayList<Vegetable> veg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        veg = new ArrayList<>();

        veg.add(new Vegetable("Asparagus", R.drawable.asparagus));
        veg.add(new Vegetable("Broccoli", R.drawable.brocoli));
        veg.add(new Vegetable("Carrot", R.drawable.carrot));
        veg.add(new Vegetable("Ginger", R.drawable.ginger));
        veg.add(new Vegetable("Mushroom", R.drawable.mushroom));
        veg.add(new Vegetable("Onion", R.drawable.onions));
        veg.add(new Vegetable("Peas", R.drawable.peas));
        veg.add(new Vegetable("Tomato", R.drawable.tomato));

        VegAdapter vegAdapter = new VegAdapter(veg, this, this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(vegAdapter);
    }

    @Override
    public void onItemClick(int positionOfTheVeg) {
        Toast.makeText(this, "Clicked " + veg.get(positionOfTheVeg).getName(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, VegetableInfo.class);
        intent.putExtra("image", veg.get(positionOfTheVeg).getImage());
        intent.putExtra("name", veg.get(positionOfTheVeg).getName());
        startActivity(intent);
    }
}