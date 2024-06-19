package com.example.foodclub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class dinner extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<itemModel3> arrContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);
        recyclerView = findViewById(R.id.recyclerViewdinner);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new itemModel3(R.drawable.sev, "Sev Bhaji", "100","Monday"));
        arrContacts.add(new itemModel3(R.drawable.specialthali, "Special Thali", "200","Tuesday"));
        arrContacts.add(new itemModel3(R.drawable.veg, "Veg pulav", "80","Wednesday"));
        arrContacts.add(new itemModel3(R.drawable.dal, "Sev Bhaji", "100","thrusday"));
        arrContacts.add(new itemModel3(R.drawable.chole, "Special Thali", "200","Friday"));
        arrContacts.add(new itemModel3(R.drawable.specialthali, "Veg pulav", "80","sunday"));
        RecyclerContactAdapter3 adapter = new RecyclerContactAdapter3(this, arrContacts);
        recyclerView.setAdapter(adapter);
    }
}