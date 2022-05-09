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

public class MelihPersonal extends AppCompatActivity{

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_melih_personal);



        listView= (ListView) findViewById(R.id.melihPersonelLv);

        ArrayList<String> arrayList= new ArrayList<>();

        arrayList.add("Personal Information");
        arrayList.add(" ");
        arrayList.add("Name : Mustafa Melih Yılmaz");
        arrayList.add("--------");
        arrayList.add("Age : 20");
        arrayList.add("--------");
        arrayList.add("Department : Software Engineering");
        arrayList.add("--------");
        arrayList.add("Skills \\/");
        arrayList.add("-Java");
        arrayList.add("-Python");
        arrayList.add("-Android App Development");
        arrayList.add("-Unity");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);

    }

}