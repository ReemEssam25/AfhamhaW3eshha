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

public class MainActivity extends AppCompatActivity  {

    FragmentManager fM;
    FragmentTransaction fT;
    Fragment frag;
    DrawerLayout drawer;
    NavigationView navigationView;

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


        }


    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else{
        super.onBackPressed();
    }
}

}
