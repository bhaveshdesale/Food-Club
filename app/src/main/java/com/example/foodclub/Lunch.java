package com.example.foodclub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Lunch extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<itemModel1> arrContacts2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);

        recyclerView = findViewById(R.id.recyclerViewlunch);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts2.add(new itemModel1(R.drawable.bhiindi, "Bhindi Masala", "60"));
        arrContacts2.add(new itemModel1(R.drawable.sev, "Sev Bhaji", "60"));
        arrContacts2.add(new itemModel1(R.drawable.veg, "Veg Cofta", "80" ));
        arrContacts2.add(new itemModel1(R.drawable.sev, "Sev Bhaji", "80"));
        arrContacts2.add(new itemModel1(R.drawable.chole, "Chole Bhature", "60"));
        arrContacts2.add(new itemModel1(R.drawable.dal, "Dal Tadake", "70"));
        arrContacts2.add(new itemModel1(R.drawable.specialthali, "Spetial Thali", "200"));

        // Create adapter instance
        RecyclerContactAdapter1 adapter = new RecyclerContactAdapter1(this, arrContacts2);

        // Set adapter to RecyclerView
        recyclerView.setAdapter(adapter);
    }
}
