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

public class MainMANDARIN extends AppCompatActivity {
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mandarin);
        //getActionBar().hide();
        navigationView=findViewById(R.id.navigation_view);
        drawerLayout=findViewById(R.id.drawer_layout);
        toolbar=findViewById(R.id.toolbar);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(MainMANDARIN.this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.course1:
                        gotoUrl("https://www.henryharvin.com/PPC/mandarin-language-course?utm_source=google&utm_medium=cpc&utm_campaign=mandarin_language_search&gclid=CjwKCAjwge2iBhBBEiwAfXDBR1H5PoDayQGxHbsGcR_eM8nRZqZGA6Tl78QuToeETkFmGEUHEWQJYhoC8QwQAvD_BwE");
                        break;
                    case R.id.course2:
                        gotoUrl("https://www.coursera.org/courses?query=mandarin&utm_source=gg&utm_medium=sem&utm_campaign=B2C_INDIA_google-it-support_FTCOF_professional-certificates_PMax-arte-NRL_greater_than_14D&utm_content=B2C&campaignid=18968559034&adgroupid=&device=c&keyword=&matchtype=&network=x&devicemodel=&adpostion=&creativeid=&hide_mobile_promo&gclid=CjwKCAjwge2iBhBBEiwAfXDBRwT7gUqhAp2s25vwYqgem7hIvjRSBWxbT1lareAKwmTAfx64B9ItPBoC23YQAvD_BwE");
                        break;
                    case R.id.course3:
                        gotoUrl("https://www.chinesezerotohero.com/");
                        break;
                    case R.id.course4:
                        gotoUrl("https://www.udemy.com/course/learnchineseforbeginners/?utm_source=adwords&utm_medium=udemyads&utm_campaign=DSA_Catchall_la.EN_cc.INDIA&utm_content=deal4584&utm_term=_._ag_82569850245_._ad_533220805577_._kw__._de_c_._dm__._pl__._ti_aud-669140681723%3Adsa-392130681248_._li_9147871_._pd__._&matchtype=&gclid=CjwKCAjwge2iBhBBEiwAfXDBR-u8U6A9qpCw24aipLiAmPD2R2qJl6-Irbn-q9I1UjOXWhzCcqnYNhoC0jMQAvD_BwE");
                        break;
                    case R.id.logout:
                        Intent f=new Intent(MainMANDARIN.this,MainLog.class);
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