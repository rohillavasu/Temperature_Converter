package com.example.temperature_converter_bharatintern;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

import com.example.temperature_converter_bharatintern.R;

public class MainActivity extends AppCompatActivity {
    private Button ctof,ftoc;
    private TextView result;
    private EditText enterTemp;
    double result0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ctof=findViewById(R.id.cTof);
        ftoc=findViewById(R.id.fToc);
        result=findViewById(R.id.result);
        enterTemp=findViewById(R.id.enterTemp);
        ctof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp=Double.parseDouble(enterTemp.getText().toString());
                result0=(temp*1.8)+32;
                result.setText(String.valueOf(result0));
            }
        });
        ftoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp=Double.parseDouble(enterTemp.getText().toString());
                result0=(temp-32)/1.8;
                result.setText(String.valueOf(result0));
            }
        });

    }
}