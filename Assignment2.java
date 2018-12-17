package com.example.marclus.sicsr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Assignment2 extends AppCompatActivity implements View.OnClickListener{
    Button functions[], numbers[];
    EditText display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment2);

        functions =new Button[]{findViewById(R.id.addition), findViewById(R.id.subtraction), findViewById(R.id.multiplication), findViewById(R.id.divide), findViewById(R.id.equal), findViewById(R.id.clear)};
        // function button array 0 = add, 1 = sub, 2 = mul, 3 = div, 4 = equal;

        for(int i=0; i<functions.length; i++){
            functions[i].setOnClickListener(this);
        } // onClick Listener set for function numbers

        numbers = new Button[]{findViewById(R.id.num0), findViewById(R.id.num1), findViewById(R.id.num2), findViewById(R.id.num3), findViewById(R.id.num4), findViewById(R.id.num5), findViewById(R.id.num6), findViewById(R.id.num7), findViewById(R.id.num8), findViewById(R.id.num9), findViewById(R.id.period)};
        // number buttons array created
        for(int i=0; i<numbers.length; i++){
            numbers[i].setOnClickListener(this);
        } // onClickListener set for all the number buttons

        display = findViewById(R.id.EditText1);

    }

    String displayNum = null;
    int lastOperation = 0;
    boolean startBit = true;
    double ans = 0, num = 0;

    double add(double num1, double num2){
        return(num1+num2);
    }

    double sub(double num1, double num2){
        return(num1-num2);
    }

    double mul(double num1, double num2){
        return (num1*num2);
    }

    double div(double num1, double num2){
        if(num2 != 0) {
            return (num1/num2);
        }
        return(1);
    }

    void lastOp(){
        switch(lastOperation){
            case 1:
                displayNum = "" + add(ans, num);
                break;
            case 2:
                displayNum = "" + sub(ans, num);
                break;
            case 3:
                displayNum = "" + mul(ans, num);
                break;
            case 4:
                displayNum = "" + div(ans, num);
                break;
        }
    }


    @Override
    public void onClick(View v) {

        displayNum = display.getText().toString();
        if(displayNum.length()>0){
            num = Double.parseDouble(displayNum);
        }
        switch (v.getId()){

            case R.id.num0:
                displayNum = displayNum + "0";
                break;
            case R.id.num1:
                displayNum = displayNum + "1";
                break;
            case R.id.num2:
                displayNum = displayNum + "2";
                break;
            case R.id.num3:
                displayNum = displayNum + "3";
                break;
            case R.id.num4:
                displayNum = displayNum + "4";
                break;
            case R.id.num5:
                displayNum = displayNum + "5";
                break;
            case R.id.num6:
                displayNum = displayNum + "6";
                break;
            case R.id.num7:
                displayNum = displayNum + "7";
                break;
            case R.id.num8:
                displayNum = displayNum + "8";
                break;
            case R.id.num9:
                displayNum = displayNum + "9";
                break;
            case R.id.period:
                if(displayNum.indexOf('.') == -1){
                    displayNum = displayNum + ".";
                }
                break;


            // function buttons implementation here
            case R.id.addition:
                ans = add(ans, num);
                lastOperation = 1;
                startBit = false;
                displayNum = "";
                break;

            case R.id.subtraction:
                if(startBit){
                    ans = num;
                    lastOperation = 2;
                    startBit = false;
                    displayNum = "";
                    break;
                }
                ans = sub(ans, num);
                lastOperation = 2;
                startBit = false;
                displayNum = "";
                break;

            case R.id.multiplication:
                if(startBit){
                    ans = 1;
                    startBit = false;
                }

                ans = mul(ans, num);
                lastOperation = 3;
                displayNum = "";
                break;

            case R.id.divide:
                if(startBit){
                    ans = num;
                    lastOperation = 4;
                    startBit = false;
                    displayNum = "";
                    break;
                }

                ans = div(ans, num);
                lastOperation = 4;
                displayNum = "";
                break;
            case R.id.clear:
                displayNum = "";
                num = 0;
                lastOperation = 0;
                startBit = true;
                break;
            case R.id.equal:
                lastOp();
                lastOperation = 0;
                ans = 0;
                startBit = true;
                break;
        }
        display.setText(displayNum);
    }
}
