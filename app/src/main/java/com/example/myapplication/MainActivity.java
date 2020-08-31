package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    private static EditText editTextTextPersonName;
    private Button button;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertWeight();
            }
        });
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertCurrency();
            }
        });
    }
    public void convertCurrency(){
        Intent intent = new Intent(this, convertCurrency.class);
        startActivity(intent);
    }
    public void convertWeight(){
        Intent intent2 = new Intent(this, convertWeight.class);
        startActivity(intent2);
    }
}