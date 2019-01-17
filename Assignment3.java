package com.example.marclus.sicsr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Assignment3 extends AppCompatActivity {RadioGroup rg;
    Button con;
    EditText et;
    TextView result;
    //TextView binary,decimal,octal,hexadecimal;
    CheckBox  dec,oct,bin,hex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment3);

        et=findViewById(R.id.editText);
        rg=findViewById(R.id.radiogroup);
        con=findViewById(R.id.button);
        dec=findViewById(R.id.checkBox);
        oct=findViewById(R.id.checkBox2);
        bin=findViewById(R.id.checkBox3 );
        hex=findViewById(R.id.checkBox4);
        result = findViewById(R.id.result);



        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = "";
                if(et.getText().toString().isEmpty()) {
                    et.setError("please enter number format");
                }
                else if (!oct.isChecked() && !hex.isChecked() && !dec.isChecked() && !bin.isChecked()) {
                    Toast.makeText(getApplicationContext(), "please select the number format", Toast.LENGTH_LONG).show();

                }
                else
                {
                    int id = rg.getCheckedRadioButtonId();

                    switch (id) {
                        case R.id.Decimal:
                            String regex2 = "^[0-9]*$";
                            if (et.getText().toString().trim().matches(regex2)) {
                                if (dec.isChecked()) {

                                    String value = et.getText().toString();

                                    Toast.makeText(getApplicationContext(), "Decimal", Toast.LENGTH_LONG).show();
//                                     decimal.setText("Decimal : "+value);
                                    res += "\nDecimal: "+ value;

                                }
                                if (oct.isChecked()) {
                                    String value = et.getText().toString();
                                    int decimal = Integer.parseInt(value);
                                    String DecToOCt = Integer.toOctalString(decimal);
                                    Toast.makeText(getApplicationContext(), "Octal"+ DecToOCt, Toast.LENGTH_LONG).show();
//                                    Octal.setText("Octal : "+DecToOCt);
                                    res += "\nOctal: "+ DecToOCt;



                                }
                                if (hex.isChecked()) {
                                    String value = et.getText().toString();
                                    int decimal = Integer.parseInt(value);
                                    String DecTohex = Integer.toHexString(decimal);
                                    Toast.makeText(getApplicationContext(), "HexaDecimal", Toast.LENGTH_LONG).show();
//                                    hexadecimal.setText("HexaDecimal : "+DecTohex);
                                    res += "\nHexa: "+ DecTohex;
                                }
                                if (bin.isChecked()) {
                                    String value = et.getText().toString();
                                    int decimal = Integer.parseInt(value);
                                    String DecToBin = Integer.toBinaryString(decimal);
                                    Toast.makeText(getApplicationContext(), " Binary", Toast.LENGTH_LONG).show();
//                                    binary.setText("Binary : "+DecToBin);
                                    res += "\nBinary: "+ DecToBin;
                                }
                            } else {
                                et.setError("Invalid Decimal Number");
                            }
                            break;

                        case R.id.Binary:

                            String regexString = "^[01]+$";
                            if (et.getText().toString().trim().matches(regexString)) {


                                if (bin.isChecked()) {
                                    String value = et.getText().toString();
                                    Toast.makeText(getApplicationContext(), "Binary", Toast.LENGTH_LONG).show();
                                    //binary.setText("Binary : "+value);
                                    res += "\nBinary: "+ value;
                                }

                                if (dec.isChecked()) {
                                    String value = et.getText().toString();
                                    int deci = Integer.parseInt(value, 2);
                                    Toast.makeText(getApplicationContext(), "Decimal", Toast.LENGTH_LONG).show();
                                    //decimal.setText("Decimal : "+deci);
                                    res += "\nDecimal: "+ deci;

                                }
                                if (oct.isChecked()) {
                                    String value = et.getText().toString();
                                    int decimal = Integer.parseInt(value, 2);
                                    String deci = Integer.toOctalString(decimal);
                                    Toast.makeText(getApplicationContext(), "Octal", Toast.LENGTH_LONG).show();
                                    //octal.setText("Octal : "+deci);
                                    res += "\nOctal: "+ deci;

                                }
                                if (hex.isChecked()) {
                                    String value = et.getText().toString();
                                    int decimal = Integer.parseInt(value, 2);
                                    String deci = Integer.toHexString(decimal);
                                    Toast.makeText(getApplicationContext(), "HexaDecimal", Toast.LENGTH_LONG).show();
                                    //hexadecimal.setText("HexaDecimal : "+deci);
                                    res += "\nHex: "+ deci;

                                }
                            } else {
                                et.setError("Invalid  Binary value");
                            }


                            break;

                        case R.id.Octal:
                            String regex = "^[1-7][0-7]*$";
                            if (et.getText().toString().trim().matches(regex)) {
                                if (dec.isChecked()) {
                                    String value = et.getText().toString();
                                    int decimal1 = Integer.parseInt(value, 8);
                                    Toast.makeText(getApplicationContext(), "Decimal", Toast.LENGTH_LONG).show();
                                    //decimal.setText("Decimal : "+decimal1);
                                    res += "\nDecimal: "+ decimal1;

                                }
                                if (oct.isChecked()) {
                                    String value = et.getText().toString();
                                    Toast.makeText(getApplicationContext(), "Octal", Toast.LENGTH_LONG).show();
                                    //octal.setText("Octal : "+value);
                                    res += "\nOctal: "+ value;
                                }
                                if(bin.isChecked())
                                {
                                    String value1=et.getText().toString();
                                    int decimal1=Integer.parseInt(value1);
                                    String deci1=Integer.toBinaryString(decimal1);
                                    Toast.makeText(getApplicationContext(),"Binary",Toast.LENGTH_LONG).show();
                                    //binary.setText("Binary : "+deci1);
                                    res += "\nBinary: "+ deci1;
                                }

                                if (hex.isChecked()) {
                                    String value = et.getText().toString();
                                    int decimal = Integer.parseInt(value, 8);
                                    String deci = Integer.toHexString(decimal);

                                    Toast.makeText(getApplicationContext(), "HexaDecimal" , Toast.LENGTH_LONG).show();
                                    //hexadecimal.setText("HexaDecimal : "+deci);
                                    res += "\nHex: "+ deci;

                                }


                            } else {

                                et.setError("Invalid octal value");
                            }


                            break;

                        case R.id.HexaDecimal:
                            String regex1 = "^[0-9A-Fa-f]+$";
                            if (et.getText().toString().trim().matches(regex1)) {
                                if (dec.isChecked()) {
                                    String value = et.getText().toString();
                                    int decimal1 = Integer.parseInt(value, 16);
                                    Toast.makeText(getApplicationContext(), "Decimal is ", Toast.LENGTH_LONG).show();
                                    //decimal.setText("Decimal : "+decimal1);
                                    res += "\nDecimal: "+ decimal1;

                                }
                                if (hex.isChecked()) {
                                    String value = et.getText().toString();
                                    Toast.makeText(getApplicationContext(), "HexaDecimal", Toast.LENGTH_LONG).show();
                                    //hexadecimal.setText("HexaDecimal : "+value);
                                    res += "\nHex: "+ value;
                                }

                                if (bin.isChecked()) {
                                    String value = et.getText().toString();
                                    int decimal = Integer.parseInt(value, 16);
                                    String deci = Integer.toBinaryString(decimal);
                                    Toast.makeText(getApplicationContext(), "Binary", Toast.LENGTH_LONG).show();
                                    //binary.setText("Binary : "+deci);
                                    res += "\nBinary: "+ deci;

                                }
                                if (oct.isChecked()) {
                                    String value = et.getText().toString();
                                    int decimal = Integer.parseInt(value, 16);
                                    String deci = Integer.toOctalString(decimal);
                                    Toast.makeText(getApplicationContext(), "Octal", Toast.LENGTH_LONG).show();
                                    //octal.setText("Octal : "+deci);
                                    res += "\nOctal: "+ deci;

                                }
                            } else {
                                et.setError("Invalid Hexadecimal Value");
                            }
                            break;
                    }

                }
                result.setText(res);
            }

        });

    }
}
