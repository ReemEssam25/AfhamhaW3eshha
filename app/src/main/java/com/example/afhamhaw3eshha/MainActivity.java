package com.example.afhamhaw3eshha;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.afhamhaw3eshha.Fragments.ArticleFragment;
import com.example.afhamhaw3eshha.Fragments.WriteFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    FragmentManager fM;
    FragmentTransaction fT;
    Fragment frag;
    DrawerLayout drawer;
    NavigationView navigationView;
    public static final String CATEGORY_EXTRA="categoryExtra";

    Button homeButton , writeButton , aboutButton , profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fM = getSupportFragmentManager();
        fT = fM.beginTransaction();
        frag = new ArticleFragment();
        fT.replace(R.id.container, frag , "any tag");
        fT.commit();

        homeButton = findViewById(R.id.home_Button);
        writeButton = findViewById(R.id.write_Button);
        aboutButton = findViewById(R.id.about_Button);
        profileButton = findViewById(R.id.profile_Button);


        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fM = getSupportFragmentManager();
                fT = fM.beginTransaction();
                frag = new ArticleFragment();
                fT.replace(R.id.container, frag , "any tag");
                fT.commit();
            }
        });

        writeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fM1 = getSupportFragmentManager();
                FragmentTransaction fT1 = fM1.beginTransaction();
                frag = new WriteFragment();
                fT1.replace(R.id.container, frag , "any tag");
                fT1.commit();
            }
        });


        Button menuBtn = findViewById(R.id.menu_Button);
        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawer = (DrawerLayout)findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this , drawer , toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



        }


    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.END)){
            drawer.closeDrawer(GravityCompat.END);
        }else{
        super.onBackPressed();
    }
}

//any thing
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch(menuItem.getItemId()){
            case R.id.capsolat_elS3ada:
                Bundle bundle = new Bundle();
                bundle.putString(CATEGORY_EXTRA, "jhj");
                ArticleFragment fragment=new ArticleFragment();
                fragment.setArguments(bundle);

                FragmentManager fM = getSupportFragmentManager();
                FragmentTransaction fT = fM.beginTransaction();
                Fragment frag = new ArticleFragment();
                fT.replace(R.id.container, frag , "any tag");
                fT.commit();
                break;

            case R.id.anta_7or:

                Bundle bundle2 = new Bundle();
                bundle2.putString(CATEGORY_EXTRA, "casolat_els3ada");
                ArticleFragment fragment2=new ArticleFragment();
                fragment2.setArguments(bundle2);

                FragmentManager fM2 = getSupportFragmentManager();
                FragmentTransaction fT2 = fM2.beginTransaction();
                Fragment frag2 = new ArticleFragment();
                fT2.replace(R.id.container, frag2 , "any tag");
                fT2.commit();
                break;
            case R.id.hunna:
                Bundle bundle3 = new Bundle();
                bundle3.putString(CATEGORY_EXTRA, "jhj");
                ArticleFragment fragment3=new ArticleFragment();
                fragment3.setArguments(bundle3);

                FragmentManager fM3 = getSupportFragmentManager();
                FragmentTransaction fT3 = fM3.beginTransaction();
                Fragment frag3 = new ArticleFragment();
                fT3.replace(R.id.container, frag3 , "any tag");
                fT3.commit();
                break;
            case R.id.anta_wMzagk:
                Bundle bundle4 = new Bundle();
                bundle4.putString(CATEGORY_EXTRA, "jhj");
                ArticleFragment fragment4=new ArticleFragment();
                fragment4.setArguments(bundle4);

                FragmentManager fM4 = getSupportFragmentManager();
                FragmentTransaction fT4 = fM4.beginTransaction();
                Fragment frag4 = new ArticleFragment();
                fT4.replace(R.id.container, frag4 , "any tag");
                fT4.commit();
                break;
            case R.id.esm3_8erak:
                Bundle bundle5 = new Bundle();
                bundle5.putString(CATEGORY_EXTRA, "jhj");
                ArticleFragment fragment5=new ArticleFragment();
                fragment5.setArguments(bundle5);

                FragmentManager fM5 = getSupportFragmentManager();
                FragmentTransaction fT5 = fM5.beginTransaction();
                Fragment frag5 = new ArticleFragment();
                fT5.replace(R.id.container, frag5 , "any tag");
                fT5.commit();
                break;

            case R.id.e5tlaf_mesh_5laf:
                Bundle bundle6 = new Bundle();
                bundle6.putString(CATEGORY_EXTRA, "jhj");
                ArticleFragment fragment6=new ArticleFragment();
                fragment6.setArguments(bundle6);

                FragmentManager fM6 = getSupportFragmentManager();
                FragmentTransaction fT6 = fM6.beginTransaction();
                Fragment frag6 = new ArticleFragment();
                fT6.replace(R.id.container, frag6 , "any tag");
                fT6.commit();
                break;
            case R.id.ro2a:
                Bundle bundle7 = new Bundle();
                bundle7.putString(CATEGORY_EXTRA, "jhj");
                ArticleFragment fragment7=new ArticleFragment();
                fragment7.setArguments(bundle7);

                FragmentManager fM7 = getSupportFragmentManager();
                FragmentTransaction fT7 = fM7.beginTransaction();
                Fragment frag7 = new ArticleFragment();
                fT7.replace(R.id.container, frag7 , "any tag");
                fT7.commit();
                break;
            case R.id.mlf_el3dd:
                Bundle bundle8 = new Bundle();
                bundle8.putString(CATEGORY_EXTRA, "jhj");
                ArticleFragment fragment8=new ArticleFragment();
                fragment8.setArguments(bundle8);

                FragmentManager fM8 = getSupportFragmentManager();
                FragmentTransaction fT8 = fM8.beginTransaction();
                Fragment frag8 = new ArticleFragment();
                fT8.replace(R.id.container, frag8 , "any tag");
                fT8.commit();
                break;
            case R.id.hwar_el3dd:
                Bundle bundle9 = new Bundle();
                bundle9.putString(CATEGORY_EXTRA, "jhj");
                ArticleFragment fragment9=new ArticleFragment();
                fragment9.setArguments(bundle9);

                FragmentManager fM9 = getSupportFragmentManager();
                FragmentTransaction fT9 = fM9.beginTransaction();
                Fragment frag9 = new ArticleFragment();
                fT9.replace(R.id.container, frag9 , "any tag");
                fT9.commit();
                break;
            case R.id.za2zo2a:
                Bundle bundle10 = new Bundle();
                bundle10.putString(CATEGORY_EXTRA, "jhj");
                ArticleFragment fragment10=new ArticleFragment();
                fragment10.setArguments(bundle10);

                FragmentManager fM10 = getSupportFragmentManager();
                FragmentTransaction fT10 = fM10.beginTransaction();
                Fragment frag10 = new ArticleFragment();
                fT10.replace(R.id.container, frag10 , "any tag");
                fT10.commit();
                break;
            case R.id.aal_asl_dawr:
                Bundle bundle11 = new Bundle();
                bundle11.putString(CATEGORY_EXTRA, "jhj");
                ArticleFragment fragment11=new ArticleFragment();
                fragment11.setArguments(bundle11);

                FragmentManager fM11 = getSupportFragmentManager();
                FragmentTransaction fT11 = fM11.beginTransaction();
                Fragment frag11 = new ArticleFragment();
                fT11.replace(R.id.container, frag11 , "any tag");
                fT11.commit();
                break;
        }
        drawer.closeDrawer(GravityCompat.END);
        return true;
    }
}
