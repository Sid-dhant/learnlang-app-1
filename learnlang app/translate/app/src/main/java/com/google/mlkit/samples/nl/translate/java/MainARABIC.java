package com.google.mlkit.samples.nl.translate.java;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;
import com.google.mlkit.samples.nl.translate.R;

public class MainARABIC extends AppCompatActivity {
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_arabic);
        //getActionBar().hide();
        navigationView=findViewById(R.id.navigation_view);
        drawerLayout=findViewById(R.id.drawer_layout);
        toolbar=findViewById(R.id.toolbar);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(MainARABIC.this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        //toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.course1:
                        gotoUrl("https://www.udemy.com/course/arabic-language-the-complete-course-6-levels-4-courses/?--=&utm_source=adwords&utm_medium=udemyads&utm_campaign=LongTail_la.EN_cc.INDIA&utm_content=deal4584&utm_term=_._ag_118445032537_._ad_618853564450_._kw__._de_c_._dm__._pl__._ti_dsa-1212271230479_._li_9147869_._pd__._&matchtype=&gclid=Cj0KCQjwpPKiBhDvARIsACn-gzDR9uBZ6ciibBvlspcdnFxT6Pot6hYqIcS1T3R80MJnfTEA7-28DigaAjdyEALw_wcB");
                        break;
                    case R.id.course2:
                        gotoUrl("https://www.madinaharabic.com/arabic-language-course/lessons/");
                        break;
                    case R.id.course3:
                        gotoUrl("https://www.soas.ac.uk/study/find-course/arabic-modern-standard-intermediate-course");
                        break;
                    case R.id.course4:
                        gotoUrl("https://www.17-minute-languages.com/en/intermediate-arabic/");
                        break;
                    case R.id.logout:
                        Intent f=new Intent(MainARABIC.this,MainLog.class);
                        startActivity(f);
                        finish();
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }

    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}