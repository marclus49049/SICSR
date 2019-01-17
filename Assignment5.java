package com.example.marclus.sicsr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Assignment5 extends AppCompatActivity implements View.OnClickListener {
    TextView tv,tv1,tv2;
    Button b1;
    Spinner spin,spin1,spin2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment5);
        tv = findViewById(R.id.textview);
        tv1 = findViewById(R.id.textView1);
        tv2 = findViewById(R.id.textView2);
        spin = findViewById(R.id.spinner);
        spin1 = findViewById(R.id.spinner2);
        spin2 = findViewById(R.id.spinner3);
        b1 = findViewById(R.id.button);
        String country[] = new String[]{"India","Australia","Canada"};
        ArrayAdapter<String> ad =new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,country);
        ad.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spin.setAdapter(ad);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getSelectedItem().toString().equals("India"))
                {
                    String state[] = new String[]{"Gujarat","Rajasthan","Maharashtra"};
                    ArrayAdapter<String> ad1 = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, state);
                    ad1.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    spin1.setAdapter(ad1);
                }
                else if(parent.getSelectedItem().toString().equals("Australia"))
                {
                    String state[] = new String[]{"South Australia","Western Australia","QueensLand"};
                    ArrayAdapter<String> ad1 = new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,state);
                    ad1.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    spin1.setAdapter(ad1);
                }
                else if(parent.getSelectedItem().toString().equals("Canada"))
                {
                    String state[] = new String[]{"Ontario","Alberta","Nova Scotia"};
                    ArrayAdapter<String> ad1 = new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,state);
                    ad1.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    spin1.setAdapter(ad1);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(spin1.getSelectedItem().toString().equals("Gujarat"))
                {
                    String city[] = new String[]{"Ahemedabad","Surat","Baroda"};
                    ArrayAdapter<String> ad2 = new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,city);
                    ad2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    spin2.setAdapter(ad2);
                }
                else if(spin1.getSelectedItem().toString().equals("Maharashtra"))
                {
                    String city[] = new String[]{"Pune","Mumbai","Nagpur"};
                    ArrayAdapter<String> ad2 = new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,city);
                    ad2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    spin2.setAdapter(ad2);
                }
                else if(spin1.getSelectedItem().toString().equals("Rajasthan"))
                {
                    String city[] = new String[]{"Udaipur","Jaipur","Jesalmer"};
                    ArrayAdapter<String> ad2 = new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,city);
                    ad2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    spin2.setAdapter(ad2);
                }

                if(spin1.getSelectedItem().toString().equals("South Australia"))
                {
                    String city[] = new String[]{"Adelaide","Port Lincoln","Clare"};
                    ArrayAdapter<String> ad2 = new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,city);
                    ad2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    spin2.setAdapter(ad2);
                }
                else if(spin1.getSelectedItem().toString().equals("Western Australia"))
                {
                    String city[] = new String[]{"Perth","Bunbury","Albany"};
                    ArrayAdapter<String> ad2 = new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,city);
                    ad2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    spin2.setAdapter(ad2);
                }
                else if(spin1.getSelectedItem().toString().equals("QueensLand"))
                {
                    String city[] = new String[]{"Mackay","Townsville","Gladstone"};
                    ArrayAdapter<String> ad2 = new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,city);
                    ad2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    spin2.setAdapter(ad2);
                }

                if(spin1.getSelectedItem().toString().equals("Ontario"))
                {
                    String city[] = new String[]{"Toronto","Hamilton","Windsor"};
                    ArrayAdapter<String> ad2 = new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,city);
                    ad2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    spin2.setAdapter(ad2);
                }
                else if(spin1.getSelectedItem().toString().equals("Alberta"))
                {
                    String city[] = new String[]{"Edmonton","Camrose","Brooks"};
                    ArrayAdapter<String> ad2 = new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,city);
                    ad2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    spin2.setAdapter(ad2);
                }
                else if(spin1.getSelectedItem().toString().equals("Nova Scotia"))
                {
                    System.out.print("in nova scotia");
                    String city[] = new String[]{"Lunenburg","Truro","Digby"};
                    ArrayAdapter<String> ad2 = new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,city);
                    ad2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    spin2.setAdapter(ad2);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        b1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
//        String s1=spin.getSelectedItem().toString();
//        String s2 = spin1.getSelectedItem().toString();
//        String s3 = spin2.getSelectedItem().toString();
        Toast.makeText(this, "Country: "+spin.getSelectedItem().toString()+" State: "+spin1.getSelectedItem().toString()+" City: "+spin2.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
    }
}
