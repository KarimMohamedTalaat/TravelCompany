package com.example.karim.travelcompany;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AnotherTravels extends AppCompatActivity {

    private ListView listOfTravels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another_travels);

        listOfTravels = (ListView) findViewById(R.id.listViewTravels);

        String [] trips = {"Egypt - Pyramids","Egypt - Sharm Elsheikh","Paris - Eiffel Tower","London",
                "Spain - Santiague Bernabue","Tunisa","Moroco","Italy - Bisa Tower","Dubai - Burj Khalifa",
                "Shoubra Faculty of Engineering","Al-Ahly Staduim"};

        ArrayAdapter<String>adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,trips);
        listOfTravels.setAdapter(adapter);

        listOfTravels.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {
                if(index == 0)
                    Toast.makeText(AnotherTravels.this,"0 clicked",Toast.LENGTH_LONG).show();

                else if(index == 1)
                    Toast.makeText(AnotherTravels.this,"1 clicked",Toast.LENGTH_LONG).show();

                else
                    Toast.makeText(AnotherTravels.this,"other item clicked",Toast.LENGTH_LONG).show();
            }
        });
    }
}
