package com.example.mobilproje;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;

import java.util.ArrayList;
import java.util.List;

public class FiratPersonal extends AppCompatActivity{

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firat_personal);



        listView= (ListView) findViewById(R.id.firatPersonelLv);

        ArrayList<String> arrayList= new ArrayList<>();

        arrayList.add("Personal Information");
        arrayList.add(" ");
        arrayList.add("Name : Fırat SADIKOĞLU");
        arrayList.add("--------");
        arrayList.add("Age : 24");
        arrayList.add("--------");
        arrayList.add("Department : Software Engineering");
        arrayList.add("--------");
        arrayList.add("Skills \\/");
        arrayList.add("-Java");
        arrayList.add("-Python");
        arrayList.add("-Android App Development");
        arrayList.add("-Machine Learning");
        arrayList.add("-Data Visualization");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);

    }

}