package com.priyankgandhi.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {

    private ImageView petImageView;
    private TextView petName, petBio;
    private Bundle extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_bio);


        petImageView = findViewById(R.id.imageViewID);
        petName = findViewById(R.id.nameID);
        petBio = findViewById(R.id.bioTextID);

        extras = getIntent().getExtras();
        if(extras != null){
            String name = extras.getString("Name");
            String bio = extras.getString("Bio");
            setup(name,bio);
        }
    }

    private void setup(String name, String bio) {
        if(name.equals("Kitty")){
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.icon_lg_cat));
            petName.setText(name);
            petBio.setText(bio);
        }else{
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.icon_lg_dog));
            petName.setText(name);
            petBio.setText(bio);
        }

    }
}