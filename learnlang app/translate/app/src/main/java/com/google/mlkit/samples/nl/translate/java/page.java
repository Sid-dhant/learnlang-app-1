package com.google.mlkit.samples.nl.translate.java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.mlkit.samples.nl.translate.R;

public class page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button b1=findViewById(R.id.button);
        Button b2=findViewById(R.id.button2);
        Button b3=findViewById(R.id.button3);
        setContentView(R.layout.activity_page);
        getSupportActionBar().setTitle("Welcome");

    }
    public void tra(View view){
        Intent i=new Intent(page.this,MainActivity.class);
        startActivity(i);
    }
    public void Cou(View view){
        Intent c=new Intent(page.this,MainCourse.class);
        startActivity(c);
    }
    public void rec(View view){
        Intent l=getPackageManager().getLaunchIntentForPackage("com.google.mlkit.showcase.translate");
        l.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(l);
    }
}