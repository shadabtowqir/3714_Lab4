package com.example.Lab3Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    Calculator calc;
    TextView res;
    int result;
    private static final String LOG_NAME= MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1= (EditText) findViewById(R.id.num1);
        e2= (EditText) findViewById(R.id.num2);
        res= (TextView) findViewById(R.id.result);

        Toast.makeText(this, "onCreate finished", Toast.LENGTH_SHORT).show();
        Log.i(LOG_NAME, "onCreate finished");
    }

    public void add2(View view){
        int number1= Integer.parseInt(e1.getText().toString());
        int number2= Integer.parseInt(e2.getText().toString());

        calc= new Calculator(number1, number2);

        result= calc.add();

        res.setText(result+"");
    }

    public void calculate(View view){
        int number1= Integer.parseInt(e1.getText().toString());
        int number2= Integer.parseInt(e2.getText().toString());

        calc= new Calculator(number1, number2);

        Intent i1= new Intent(this, ResultActivity.class);

        switch(view.getId()){
            case R.id.addButton:
                i1.putExtra("result", calc.add());
                i1.putExtra("operation", "Addition");
                break;

            case R.id.subButton:
                i1.putExtra("result", calc.sub());
                i1.putExtra("operation", "Subtraction");
                break;

            case R.id.mulButton:
                i1.putExtra("result", calc.mul());
                i1.putExtra("operation", "Multiplication");
                break;

            case R.id.divButton:
                i1.putExtra("result", calc.div());
                i1.putExtra("operation", "Division");
        }

        startActivity(i1);
    }

    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("result", result);
        Toast.makeText(this, "onSaveInstanceState finished", Toast.LENGTH_SHORT).show();
        Log.i(LOG_NAME, "onSaveInstanceState finished");
    }

    @Override
    public void onRestoreInstanceState(Bundle inState){
        super.onRestoreInstanceState(inState);
        int result= inState.getInt("result");
        this.result= result;
        res.setText(result+"");
        Toast.makeText(this, "onRestoreInstanceState finished", Toast.LENGTH_SHORT).show();
        Log.i(LOG_NAME, "onRestoreInstanceState finished");
    }

    public void switchActivity(View view){
        Intent i1= new Intent(this, ContactActivity.class);
        startActivity(i1);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart finished", Toast.LENGTH_SHORT).show();
        Log.i(LOG_NAME, "onStart finished");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume finished", Toast.LENGTH_SHORT).show();
        Log.i(LOG_NAME, "onResume finished");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause finished", Toast.LENGTH_SHORT).show();
        Log.i(LOG_NAME, "onPause finished");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop finished", Toast.LENGTH_SHORT).show();
        Log.i(LOG_NAME, "onStop finished");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart finished", Toast.LENGTH_SHORT).show();
        Log.i(LOG_NAME, "onRestart finished");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy finished", Toast.LENGTH_SHORT).show();
        Log.i(LOG_NAME, "onDestroy finished");
    }
}