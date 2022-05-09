package com.example.mobilproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class UmutProfileActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private ImageView imageView1;
    private ImageView mapsView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umut_profile);
        imageView1 = (ImageView) findViewById(R.id.linkedin_u);
        mapsView = (ImageView) findViewById(R.id.maps_u);


        button = (Button) findViewById(R.id.umutProfilePersonal);
        //button2 = (Button) findViewById(R.id.melihProfileGit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUmutPersonActivity();
            }
        });

        mapsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMapsViewActivity();
            }
        });


    }
    public void openUmutPersonActivity(){
        Intent intent = new Intent(this, UmutPersonal.class);
        startActivity(intent);
    }
    public void openBrowser(View view){

        String url = (String)view.getTag();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        intent.setData(Uri.parse(url));

        startActivity(intent);
    }

    public void openMapsViewActivity(){
        Intent intent = new Intent(this, UmutMapsView.class);
        startActivity(intent);
    }

}