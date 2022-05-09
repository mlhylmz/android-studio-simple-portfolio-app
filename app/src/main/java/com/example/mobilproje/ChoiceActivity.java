package com.example.mobilproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ChoiceActivity extends AppCompatActivity {
    private ImageView imageView;
    private ImageView imageView2;
    private ImageView imageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.firatPp);
        imageView2 = (ImageView) findViewById(R.id.melihPp);
        imageView3 = (ImageView) findViewById(R.id.umutPp);


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFiratProfileActivity();
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMelihProfileActivity();
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openUmutProfileActivity(); }
        });


    }
    public void openFiratProfileActivity(){
        Intent intent = new Intent(this, FiratProfileActivity.class);
        startActivity(intent);
    }

    public void openMelihProfileActivity(){
        Intent intent = new Intent(this, MelihProfileActivity.class);
        startActivity(intent);
    }

    public void openUmutProfileActivity(){
        Intent intent = new Intent(this, UmutProfileActivity.class);
        startActivity(intent);
    }
}