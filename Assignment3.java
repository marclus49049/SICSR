package com.example.marclus.sicsr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;

public class Assignment3 extends AppCompatActivity {

    RadioGroup group;
    CheckBox chk[];
    Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment3);

        group = findViewById(R.id.rg1);

        chk = new CheckBox[]{findViewById(R.id.chkBinary),findViewById(R.id.chkOctal),findViewById(R.id.chkDecimal),findViewById(R.id.chkHex)};

        convert = findViewById(R.id.convert);
    }
}
