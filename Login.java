package com.example.marclus.sicsr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {

    EditText edt[];
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edt = new EditText[]{findViewById(R.id.username), findViewById(R.id.password)};
        submit = findViewById(R.id.login);

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
            }
            else{
                check = true;
            }
        }
        if(check){
            String user, pass;
            Intent i;
            i = getIntent();
            user = i.getExtras().getString("username");
            pass = i.getExtras().getString("password");

            if (edt[0].getText().toString().equals(user) && edt[1].getText().toString().equals(pass)){
                i = new Intent(this, Display.class);
                i.putExtra("username", user);
                i.putExtra("flag", 0);
                startActivity(i);
            } else {
                Toast.makeText(this, "Username or Password is wrong", Toast.LENGTH_SHORT).show();
            }
        }

    }
}
