package com.example.marclus.sicsr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class Assignment4 extends AppCompatActivity implements View.OnClickListener {

    EditText number;
    Button submit;
    Spinner operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment4);

        number = findViewById(R.id.getNumber);

        operation = findViewById(R.id.operation);

        String operations[] = new String[]{"Sum of digits", "Reverse", "Check Prime"};

        ArrayAdapter <String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, operations);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        operation.setAdapter(arrayAdapter);

        submit = findViewById(R.id.submit);

        submit.setOnClickListener(this);
    }

    int num = 0;
    @Override
    public void onClick(View v) {
        int op = operation.getSelectedItemPosition();
        if(number.getText().length()>0){
            num = Integer.parseInt(number.getText().toString());
        }
    }
}
