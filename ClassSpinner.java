package com.example.marclus.sicsr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class ClassSpinner extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    Spinner spin;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_spinner);

        spin = findViewById(R.id.spin);

        String items[] = new String[]{"Item1","Item2","Item3","Item4","Item5" }; // Items Array

        ArrayAdapter <String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items); // object of arrayAdapter created

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // set the item layout for items of spinner

        spin.setAdapter(arrayAdapter); // set said arrayAdapter for a spinner

        spin.setOnItemSelectedListener(this);
//        btn = findViewById(R.id.btn);
//
//        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
