package com.example.marclus.sicsr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class Assignment4 extends AppCompatActivity implements View.OnClickListener {

    EditText number;
    Button submit;
    Spinner operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment4);

        number = findViewById(R.id.getNumber);

        operation = findViewById(R.id.operation);

        String operations[] = new String[]{"Sum of digits", "Reverse", "Check Prime", "Harshad number", "Happy Number"};

        ArrayAdapter <String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, operations);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        operation.setAdapter(arrayAdapter);

        submit = findViewById(R.id.submit);

        submit.setOnClickListener(this);
    }

    int sum(int num){
        int sum=0, mod=0;
        while(num!=0){
            mod = num % 10;
            sum = sum + mod;
            num = num / 10;
        }
        return(sum);
    }

    int reverse(int num){
        int reverse = 0, mod = 0;
        while(num!=0){
            mod = num%10;
            reverse = (reverse*10) + mod;
            num = num / 10;
        }
        return(reverse);
    }

    boolean Prime(int num){
        boolean isPrime = true;
        for(int i=2; i<num; i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        return(isPrime);
    }

    boolean Happy(int num){
        int temp = num, sum = 0, mod, counter = 0;

        while(true){
            mod = temp%10;
            sum += mod * mod;
            temp = temp/10;

            if(temp == 0){
                temp = sum;
                if(sum == 1){
                    return(true);
                } else if (counter == 10){
                    break;
                }
                sum = 0;
                counter++;
            }

        }
        return(false);

    }

    int num = 0;
    @Override
    public void onClick(View v) {
        int op = operation.getSelectedItemPosition();
        try{

            if(number.getText().length()>0){
                num = Integer.parseInt(number.getText().toString());
                switch (op){
                    case 0:
                        Toast.makeText(this, "Sum of "+num+" is "+sum(num), Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        Toast.makeText(this, "Reverse of "+num+" is "+reverse(num), Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        if(Prime(num)){
                            Toast.makeText(this, num+" is a Prime Number", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(this, num+" is not a Prime Number", Toast.LENGTH_LONG).show();
                        }
                        break;
                    case 3:
                        if(num%sum(num) == 0){
                            Toast.makeText(this, num+" is a Harshad Number", Toast.LENGTH_SHORT).show();
                        } else{
                            Toast.makeText(this, num+" is not a Harshad Number", Toast.LENGTH_SHORT).show();
                        }
                        break;
                    case 4:
                        if(Happy(num)){
                            Toast.makeText(this, num+" is a Happy Number", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(this, num+" is not a Happy Number", Toast.LENGTH_SHORT).show();
                        }
                        break;
                }
            } else{
                Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show();
            }
        } catch (NumberFormatException e){
            Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show();
        }
    }
}
