package com.example.Lab3Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView res;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        res= (TextView) findViewById(R.id.resultText);

        Bundle b1= getIntent().getExtras();

        int result= b1.getInt("result");

        String op= b1.getString("operation");

        res.setText(op+": "+result);
    }
}