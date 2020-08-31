package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class convertCurrency extends AppCompatActivity {
    EditText e1 , e2;
    TextView t1 , t2;
    Button b1 , b2, b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_currency);
        e1=(EditText) findViewById(R.id.editTextNumberDecimal);
        t1=(TextView) findViewById(R.id.textView2);
        b1=(Button) findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float i1 = Float.parseFloat(e1.getText().toString());
                Float i3 = i1/155;
                t1.setText(Float.toString(i3));
            }
        });
        b3=(Button) findViewById(R.id.button5);
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                e1.getText().clear();
                e2.getText().clear();
                t1.setText(" GDP  ");
                t2.setText(" NRS  ");
            }
        });
        e2=(EditText) findViewById(R.id.editTextNumberDecimal3);
        t2=(TextView) findViewById(R.id.textView3);
        b2=(Button) findViewById(R.id.button4);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float i2 = Float.parseFloat(e2.getText().toString());
                Float i4 = i2*155;
                t2.setText(Float.toString(i4));
            }
        });
    }
}