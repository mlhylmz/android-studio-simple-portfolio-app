package com.example.mobilproje;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class UmutPersonal extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umut_personal);



        listView= (ListView) findViewById(R.id.umutPersonelLv);

        ArrayList<String> arrayList= new ArrayList<>();

        arrayList.add("Personal Information");
        arrayList.add(" ");
        arrayList.add("Name : Umut Yüksel");
        arrayList.add("--------");
        arrayList.add("Age : 22");
        arrayList.add("--------");
        arrayList.add("Department : Software Engineering");
        arrayList.add("--------");
        arrayList.add("Skills \\/");
        arrayList.add("-Java");
        arrayList.add("-SQL");
        arrayList.add("-Android App Development");
        arrayList.add("-C#");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);
        }
}