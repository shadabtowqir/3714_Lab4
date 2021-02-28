package com.example.Lab3Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }

    public void contactLaunchAction(View view){

        switch (view.getId()){
            case R.id.b1:
                Intent i1= new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(i1);
                break;
            case R.id.b2:
                Intent i2= new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 987458962"));
                startActivity(i2);
                break;
            case R.id.b3:
                Intent i3= new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 37.228466, -80.423014"));
                startActivity(i3);
        }
    }
}