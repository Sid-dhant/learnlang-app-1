package com.google.mlkit.samples.nl.translate.java;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
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

public class MainSPANISH extends AppCompatActivity {
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_spanish);
        //getActionBar().hide();
        navigationView=findViewById(R.id.navigation_view);
        drawerLayout=findViewById(R.id.drawer_layout);
        toolbar=findViewById(R.id.toolbar);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(MainSPANISH.this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        //toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.course1:
                        gotoUrl("https://www.henryharvin.com/ppc3/spanish-language-course?utm_source=google&utm_medium=cpc&utm_campaign=spanish_search&gclid=Cj0KCQjwpPKiBhDvARIsACn-gzBMAzocZetR9kKPltVCGMmwFMqvRuH_1HwEP_NwKoWVu7Xr-OZ0rvwaAii1EALw_wcB");
                        break;
                    case R.id.course2:
                        gotoUrl("https://www.udemy.com/course/el-metodo-spanish-1/?--=&utm_source=adwords&utm_medium=udemyads&utm_campaign=LongTail_la.EN_cc.INDIA&utm_content=deal4584&utm_term=_._ag_118445032537_._ad_618853564450_._kw__._de_c_._dm__._pl__._ti_dsa-1212271230479_._li_9147871_._pd__._&matchtype=&gclid=Cj0KCQjwpPKiBhDvARIsACn-gzB2e_FZ646eKH2TNyTYiAl20rf52t3XEBHcTqu3Ux71sebK5H8tzCMaAoWmEALw_wcB");
                        break;
                    case R.id.course3:
                        gotoUrl("https://www.myspanishlesson.co.uk/?gclid=Cj0KCQjwpPKiBhDvARIsACn-gzD7Er3hjmdDdkvxrtBqRmJJLIOy5xy033CkUiNwuBA5rmH2KCjMu_AaAp_eEALw_wcB");
                        break;
                    case R.id.course4:
                        gotoUrl("https://preply.com/en/online/spanish-tutors?campaignid=15011166904&network=g&adgroupid=128173593749&keyword=spanish%20learn&matchtype=b&creative=588871780752&targetid=kwd-11058890&placement=&loc_physical_ms=9147869&device=c&utm_source=google&utm_medium=cpc&utm_term=spanish%20learn&utm_campaign=stu_sem_generic_web_0_eng_in_multiplesub_xx&hsa_acc=8549349749&hsa_cam=15011166904&hsa_grp=128173593749&hsa_ad=588871780752&hsa_src=g&hsa_tgt=kwd-11058890&hsa_kw=spanish%20learn&hsa_mt=b&hsa_net=adwords&hsa_ver=3&gclid=Cj0KCQjwpPKiBhDvARIsACn-gzDedyp7vO3xYvaQDXUf4DozVY5I8LGO9oVkWdATELI9xbgRDBU5BrEaArxnEALw_wcB");
                        break;
                    case R.id.logout:
                        Intent f=new Intent(MainSPANISH.this,MainLog.class);
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