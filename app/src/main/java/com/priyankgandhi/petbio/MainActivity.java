package com.priyankgandhi.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView catView, DogView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        catView = findViewById(R.id.catID);
        DogView = findViewById(R.id.dogID);

        catView.setOnClickListener(this);
        DogView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.catID:
                Intent catIntent = new Intent(MainActivity.this,BioActivity.class);
                catIntent.putExtra("Name","Kitty");
                catIntent.putExtra("Bio","Great Cat. Loves people and meows a lot");
                startActivity(catIntent);
                Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.dogID:
                Intent dogIntent = new Intent(MainActivity.this, BioActivity.class);
                dogIntent.putExtra("Name", "Dufus");
                dogIntent.putExtra("Bio", "Great Dog. Loves People, barks and eats a lot");
                startActivity(dogIntent);
                Toast.makeText(MainActivity.this,"Clicked",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}