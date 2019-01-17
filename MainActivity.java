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

    Button assign[], classBtn[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        assign = new Button[]{findViewById(R.id.assignment1), findViewById(R.id.assignment2), findViewById(R.id.assignment3), findViewById(R.id.assignment4), findViewById(R.id.assignment5), findViewById(R.id.assignment6), findViewById(R.id.assignment7)};

        classBtn = new Button[]{findViewById(R.id.CheckBox), findViewById(R.id.RadioButton), findViewById(R.id.Spinner)};

        for(int i=0; i < assign.length; i++){
            assign[i].setOnClickListener(this);
        }
        for(int i=0; i < classBtn.length; i++){
            classBtn[i].setOnClickListener(this);
        }


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
            case R.id.CheckBox:
                this.startActivity(new Intent(this, ClassCheckBox.class));
                break;
            case R.id.RadioButton:
                this.startActivity(new Intent(this, ClassRadioButton.class));
                break;
            case R.id.Spinner:
                this.startActivity(new Intent(this, ClassSpinner.class));
                break;
            case R.id.assignment3:
                this.startActivity(new Intent(this, Assignment3.class));
                break;
            case R.id.assignment4:
                this.startActivity(new Intent(this, Assignment4.class));
                break;
            case R.id.assignment5:
                this.startActivity(new Intent(this, Assignment5.class));
                break;
            case R.id.assignment6:
                this.startActivity(new Intent(this, Assignment6.class));
                break;
            case R.id.assignment7:
                this.startActivity(new Intent(this, Assignment7.class));
                break;
        }
    }
}
