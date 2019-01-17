package com.example.marclus.sicsr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        display = findViewById(R.id.display);
        Intent i = getIntent();
        display.setText("Hello "+i.getExtras().getString("username"));
    }
}
