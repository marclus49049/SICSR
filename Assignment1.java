package com.example.marclus.sicsr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Assignment1 extends AppCompatActivity implements View.OnClickListener{
    Button add, sub, div, mul;
    EditText num1, num2;
    TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment1);

        //Buttons Added
        add = findViewById(R.id.addition);
        sub = findViewById(R.id.subtraction);
        mul = findViewById(R.id.multiplication);
        div = findViewById(R.id.division);

        //EditText
        num1 = findViewById(R.id.EditText1);
        num2 = findViewById(R.id.EditText2);
        answer = findViewById(R.id.TextView1);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
    }

    int number1, number2, ans = 0, flag = 0;

    @Override
    public void onClick(View v) {
        number1 = Integer.parseInt(num1.getText().toString());
        number2 = Integer.parseInt(num2.getText().toString());
        switch(v.getId()){
            case R.id.addition:
                ans = number1 + number2;
                break;
            case R.id.subtraction:
                ans = number1-number2;
                break;
            case R.id.multiplication:
                ans = number1*number2;
                break;
            case R.id.division:
                if(number2 == 0){
                    answer.setText("Cant Divide By Zero");
                    flag = 1;
                } else {
                    ans = number1/number2;
                }
                break;
        }
        if (flag != 1){
            answer.setText(""+ans);
        }

    }
}
