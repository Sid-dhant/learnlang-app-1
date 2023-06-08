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

public class MainGERMAN extends AppCompatActivity {
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_german);
        //getActionBar().hide();
        navigationView=findViewById(R.id.navigation_view);
        drawerLayout=findViewById(R.id.drawer_layout);
        toolbar=findViewById(R.id.toolbar);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(MainGERMAN.this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        //toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.course1:
                        gotoUrl("https://www.udemy.com/course/complete-german-course-learn-german-for-beginners/?utm_source=adwords&utm_medium=udemyads&utm_campaign=LongTail_la.EN_cc.INDIA&utm_content=deal4584&utm_term=_._ag_118445032537_._ad_533094112755_._kw__._de_c_._dm__._pl__._ti_dsa-1212271230479_._li_9147869_._pd__._&matchtype=&gclid=Cj0KCQjwpPKiBhDvARIsACn-gzA2cg4htj76bXV95eqwWvq7qyLcJzDIGeNdZKgTDecQfi3igTavmfQaAgNNEALw_wcB");
                        break;
                    case R.id.course2:
                        gotoUrl("https://alison.com/course/basic-german-language-skills-revised?utm_source=google&utm_medium=cpc&utm_campaign=PPC_Tier-4_First-Click_Courses-_Broad_&utm_adgroup=Course-1802_Basic-German-Language-Skills-Revised&gclid=Cj0KCQjwpPKiBhDvARIsACn-gzBaBpB4v8CwAuIUHwkgVIjdUnw6WFW2RLXBDWMetcB6MxE_NcNT8LUaAp2zEALw_wcB");
                        break;
                    case R.id.course3:
                        gotoUrl("https://www.languagepantheon.com/batches/online?gclid=Cj0KCQjwpPKiBhDvARIsACn-gzAgkWeWi7yfbJZGtOinx-LJpoqLXWwCqA5NW9VAoNJRv4AvNveyDpQaAtmzEALw_wcB");
                        break;
                    case R.id.course4:
                        gotoUrl("https://www.rwbuder.com/course?gclid=Cj0KCQjwpPKiBhDvARIsACn-gzBOMRZi3wY2LpDuXm6VkONLngSOkGrhcC_6xcGkZrtaRwV55mitPksaAhIxEALw_wcB");
                        break;
                    case R.id.logout:
                        Intent f=new Intent(MainGERMAN.this,MainLog.class);
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