package com.example.marclus.sicsr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ClassRadioButton extends AppCompatActivity implements View.OnClickListener {


    Button btn;
    android.widget.RadioButton chk[];
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_radio_button);

        chk = new android.widget.RadioButton[]{findViewById(R.id.chk1), findViewById(R.id.chk2), findViewById(R.id.chk3)};
        rg = findViewById(R.id.rg1);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(this);
    }
    String s1;
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn:
                if(chk[0].isChecked()){
                    s1 = chk[0].getText().toString();
                }

                if(chk[1].isChecked()){
                    s1 = chk[1].getText().toString();
                }

                if(chk[2].isChecked()){
                    s1 = chk[2].getText().toString();
                }

                Toast.makeText(this, s1, Toast.LENGTH_LONG).show();
                break;
        }
        RadioButton rg1 = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
        Toast.makeText(this, "This is using radio Group"+rg1.getText().toString() , Toast.LENGTH_SHORT).show();
    }
}
