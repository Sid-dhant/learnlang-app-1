package com.google.mlkit.samples.nl.translate.java;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.mlkit.samples.nl.translate.R;

public class MainRUSSIAN extends AppCompatActivity {

    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_russian);
        //getActionBar().hide();
        navigationView=findViewById(R.id.navigation_view);
        drawerLayout=findViewById(R.id.drawer_layout);
        toolbar=findViewById(R.id.toolbar);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(MainRUSSIAN.this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        //toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.course1:
                        gotoUrl("https://www.udemy.com/course/ultimate-russian-language-course/?--=&utm_source=adwords&utm_medium=udemyads&utm_campaign=LongTail_la.EN_cc.INDIA&utm_content=deal4584&utm_term=_._ag_118445032537_._ad_618853564450_._kw__._de_c_._dm__._pl__._ti_dsa-1212271230479_._li_9147869_._pd__._&matchtype=&gclid=Cj0KCQjwpPKiBhDvARIsACn-gzAeKbN0B4tq2_0zCDN-k5a21hgRWDhTU-qDjxyNTlB1ihTJRUENbuAaAnQ4EALw_wcB");
                        break;
                    case R.id.course2:
                        gotoUrl("https://www.udemy.com/course/ultimate-russian-language-course/?--=&utm_source=adwords&utm_medium=udemyads&utm_campaign=LongTail_la.EN_cc.INDIA&utm_content=deal4584&utm_term=_._ag_118445032537_._ad_618853564450_._kw__._de_c_._dm__._pl__._ti_dsa-1212271230479_._li_9147869_._pd__._&matchtype=&gclid=Cj0KCQjwpPKiBhDvARIsACn-gzAeKbN0B4tq2_0zCDN-k5a21hgRWDhTU-qDjxyNTlB1ihTJRUENbuAaAnQ4EALw_wcB");
                        break;
                    case R.id.course3:
                        gotoUrl("https://alison.com/tag/russian-language?utm_source=google&utm_medium=cpc&utm_campaign=PPC_Tier-4_First-Click_Courses-_Broad_&utm_adgroup=Tag_Russian-Language&gclid=Cj0KCQjwpPKiBhDvARIsACn-gzBQiUMasbdWS9Pybc4DYZSO-rtHLU2M_7Mh6vR4SEhRB6eTj10Gkw0aApalEALw_wcB");
                        break;
                    case R.id.course4:
                        gotoUrl("https://pll.harvard.edu/course/intensive-intermediate-russian?delta=0");
                        break;
                    case R.id.logout:
                        Intent f=new Intent(MainRUSSIAN.this,MainLog.class);
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