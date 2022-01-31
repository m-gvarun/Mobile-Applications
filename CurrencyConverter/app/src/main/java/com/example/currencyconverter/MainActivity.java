package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import com.example.currencyconverter.R;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    Spinner sp1,sp2;
    EditText ed1;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1 = findViewById(R.id.s1);
        sp2 = findViewById(R.id.s2);

        ed1 = findViewById(R.id.e1);
        b = findViewById(R.id.b1);

        String [] from = {"USD"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad1);

        String [] to = {"Indian Rupee" , "Srilankan Rupee"};
        ArrayAdapter ad2 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double total;
                Double amount = Double.parseDouble(ed1.getText().toString());

                if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Indian Rupee")
                {
                    total = amount / 74.99;
                    Toast.makeText(getApplicationContext(),total.toString(),Toast.LENGTH_LONG).show();
                }

                else if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Srilankan Rupee")
                {
                    total = amount / 201.40;
                    Toast.makeText(getApplicationContext(),total.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}