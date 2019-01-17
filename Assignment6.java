package com.example.marclus.sicsr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Assignment6 extends AppCompatActivity implements View.OnClickListener {

    EditText edt[];
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment6);
        edt = new EditText[]{findViewById(R.id.name), findViewById(R.id.contact), findViewById(R.id.email), findViewById(R.id.username), findViewById(R.id.password)};
        submit = findViewById(R.id.register);

        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        boolean check = false;
        for(int i=0; i<edt.length; i++){
            if(edt[i].equals("") || edt[i].length()==0){
                edt[i].setError("Enter Some value");
                check = false;
                break;
            } else {
                check = true;
            }
        }
        if(check) {
            Intent i = new Intent(this, Login.class);
            i.putExtra("username", edt[3].getText().toString());
            i.putExtra("password", edt[4].getText().toString());
            startActivity(i);
        }
    }
}
