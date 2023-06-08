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

public class MainPORTUGUESE extends AppCompatActivity {

    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_portuguese);
        //getActionBar().hide();
        navigationView=findViewById(R.id.navigation_view);
        drawerLayout=findViewById(R.id.drawer_layout);
        toolbar=findViewById(R.id.toolbar);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(MainPORTUGUESE.this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        //toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.course1:
                        gotoUrl("https://www.udemy.com/course/complete-portuguese-course/?utm_source=adwords&utm_medium=udemyads&utm_campaign=DSA_Catchall_la.EN_cc.INDIA&utm_content=deal4584&utm_term=_._ag_82569850245_._ad_533220805577_._kw__._de_c_._dm__._pl__._ti_aud-669140681723%3Adsa-392130681248_._li_9147869_._pd__._&matchtype=&gclid=Cj0KCQjwpPKiBhDvARIsACn-gzB_9MYS_AaYeY5B_JltNYEU6SRnOjiQEqHYunpMSTdu1-XSoDl_0QkaAnVbEALw_wcB");
                        break;
                    case R.id.course2:
                        gotoUrl("https://alison.com/course/portuguese-for-beginners?utm_source=google&utm_medium=cpc&utm_campaign=PPC_Tier-4_First-Click_Courses-_Broad_&utm_adgroup=Course-4336_Portuguese-for-Beginners&gclid=Cj0KCQjwpPKiBhDvARIsACn-gzD0mdpl3TKPPzh85SyJ5MA7BjLuursGFICX6Ak5d4rBfMAtWMzYuTgaAsMQEALw_wcB");
                        break;
                    case R.id.course3:
                        gotoUrl("https://www.languageinternational.com/courses-portuguese-intermediate");
                        break;
                    case R.id.course4:
                        gotoUrl("https://spanport.washington.edu/intermediate-portuguese");
                        break;
                    case R.id.logout:
                        Intent f=new Intent(MainPORTUGUESE.this,MainLog.class);
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