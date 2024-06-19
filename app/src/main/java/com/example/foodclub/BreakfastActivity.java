package com.example.foodclub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class BreakfastActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Button btndone;
    ArrayList<itemModel1> arrContacts = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);

        recyclerView = findViewById(R.id.recyclerViewbreakfast);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new itemModel1(R.drawable.tea,"Bhavesh", "7507272464"));
        arrContacts.add(new itemModel1(R.drawable.poha, "Saurabh", "7507272464"));
        arrContacts.add(new itemModel1(R.drawable.pavvada, "Ganesh", "7507272464"));
        arrContacts.add(new itemModel1(R.drawable.kachori, "Harshal", "7507272464"));
        arrContacts.add(new itemModel1(R.drawable.samosa, "Bhavesh", "7507272464"));
//        arrContacts.add(new itemModel1(R.drawable.img, "Bhavesh", "7507272464"));
//        arrContacts.add(new itemModel1(R.drawable.img, "Bhavesh", "7507272464"));
//        arrContacts.add(new itemModel1(R.drawable.img, "Bhavesh", "7507272464"));
//        arrContacts.add(new itemModel1(R.drawable.img, "Bhavesh", "7507272464"));
//        arrContacts.add(new itemModel1(R.drawable.img, "Bhavesh", "7507272464"));

        // Create adapter instance
        RecyclerContactAdapter1 adapter = new RecyclerContactAdapter1(this, arrContacts);

        // Set adapter to RecyclerView
        recyclerView.setAdapter(adapter);
    }
}