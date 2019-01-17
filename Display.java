package com.example.marclus.sicsr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;

public class Display extends AppCompatActivity {

    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        display = findViewById(R.id.display);
        Intent i = getIntent();
        if(i.getExtras().getInt("flag") == 0){
            display.setText("Hello "+i.getExtras().getString("username"));
        } else if (i.getExtras().getInt("flag") == 1){
            String displayStr;
            displayStr = "Name: "+ i.getExtras().getString("name")+"\nEmail: "+ i.getExtras().getString("email")+ "\nCity: "+i.getExtras().getString("city") + "\nCourses :";
            ArrayList <String> aList = i.getExtras().getStringArrayList("course");
            Iterator itr = aList.iterator();
            while(itr.hasNext()){
                displayStr +="\n" + itr.next().toString();
            }
            display.setText(displayStr);
        }

    }
}
