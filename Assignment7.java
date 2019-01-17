package com.example.marclus.sicsr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Assignment7 extends AppCompatActivity implements View.OnClickListener {
    EditText edt[];
    Spinner city;
    Button submit;
    CheckBox chk[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment7);

        //Edit text
        edt = new EditText[]{findViewById(R.id.name), findViewById(R.id.email)};

        //Button
        submit = findViewById(R.id.submit);

        //Checkbox
        chk = new CheckBox[]{findViewById(R.id.chk1), findViewById(R.id.chk2), findViewById(R.id.chk3), findViewById(R.id.chk4)};

        String cities[] = new String[]{"Mumbai", "Pune", "Kolkata", "Delhi"};
        //Spinner
        city = findViewById(R.id.city);

        ArrayAdapter <String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, cities); // object of arrayAdapter created

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // set the item layout for items of spinner

        city.setAdapter(arrayAdapter); // set said arrayAdapter for a spinner


        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String name, email, cityStr;
        ArrayList <String> course = new ArrayList<>();

        name = edt[0].getText().toString();
        email = edt[1].getText().toString();
        cityStr = city.getSelectedItem().toString();

        for(int i=0; i<chk.length; i++){
            if(chk[i].isChecked()){
                course.add(chk[i].getText().toString());
            }
        }

        Intent i = new Intent(this, Display.class);
        i.putExtra("name", name);
        i.putExtra("email", email);
        i.putExtra("city", cityStr);
        i.putExtra("course", course);
        i.putExtra("flag", 1);
        startActivity(i);
    }
}
