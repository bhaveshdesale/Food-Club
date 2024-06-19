package com.example.foodclub;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cardview extends AppCompatActivity {
    View breakfast;
    View lunch;
    View dinner;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview);
        breakfast=findViewById(R.id.breakfast);
        lunch=findViewById(R.id.lunch);
        dinner=findViewById(R.id.dinner);
        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(cardview.this,BreakfastActivity.class);
                startActivity(intent);

            }
        });
        lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(cardview.this,Lunch.class);
                startActivity(intent);



            }
        });
        dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(cardview.this,dinner.class);
                startActivity(intent);

            }
        });
    }
}