package com.example.marclus.sicsr;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button assign1, assign2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        assign1 = findViewById(R.id.assignment1);
        assign2 = findViewById(R.id.assignment2);

        assign1.setOnClickListener(this);
        assign2.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.assignment1:
                this.startActivity(new Intent(this, Assignment1.class));
                break;
            case R.id.assignment2:
                this.startActivity(new Intent(this, Assignment2.class));
                break;
        }
    }
}
