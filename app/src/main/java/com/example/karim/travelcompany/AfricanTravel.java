package com.example.karim.travelcompany;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AfricanTravel extends AppCompatActivity {

    Button travel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_african_travel);
        travel=(Button) findViewById(R.id.anotherTravels);
        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent travel2=new Intent(AfricanTravel.this,AnotherTravels.class);
                startActivity(travel2);
            }
        });



    }
}
