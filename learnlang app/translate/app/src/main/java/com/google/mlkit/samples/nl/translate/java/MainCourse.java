package com.google.mlkit.samples.nl.translate.java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.mlkit.samples.nl.translate.R;

public class MainCourse extends AppCompatActivity {
    ImageView sp,man,ger,por,fre,rus,ara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_course);
        getSupportActionBar().setTitle("Welcome to Course");
        sp=findViewById(R.id.SPANISH);
        man=findViewById(R.id.MANDARIN);
        ger=findViewById(R.id.GERMAN);
        por=findViewById(R.id.PORTUGUESE);
        fre=findViewById(R.id.FRENCH);
        rus=findViewById(R.id.RUSSIAN);
        ara=findViewById(R.id.ARABIC);
        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(MainCourse.this,MainSPANISH.class);
                startActivity(i1);

            }
        });
        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(MainCourse.this,MainMANDARIN.class);
                startActivity(i2);
            }
        });
        ger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(MainCourse.this,MainGERMAN.class);
                startActivity(i3);

            }
        });
        por.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(MainCourse.this,MainPORTUGUESE.class);
                startActivity(i4);

            }
        });
        fre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5=new Intent(MainCourse.this,MainFRENCH.class);
                startActivity(i5);

            }
        });
        rus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6=new Intent(MainCourse.this,MainRUSSIAN.class);
                startActivity(i6);

            }
        });
        ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7=new Intent(MainCourse.this,MainARABIC.class);
                startActivity(i7);

            }
        });

    }
}