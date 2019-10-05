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

import com.example.afhamhaw3eshha.Fragments.Ala_ElAsl_Dwar;
import com.example.afhamhaw3eshha.Fragments.AntaWMzagk;
import com.example.afhamhaw3eshha.Fragments.ArticleFragment;
import com.example.afhamhaw3eshha.Fragments.E5tlaf_Mesh_5laf;
import com.example.afhamhaw3eshha.Fragments.ElKol;
import com.example.afhamhaw3eshha.Fragments.Esm3_8erak;
import com.example.afhamhaw3eshha.Fragments.Hwar_El3dd;
import com.example.afhamhaw3eshha.Fragments.Mlf_El3dd;
import com.example.afhamhaw3eshha.Fragments.Ro2a;
import com.example.afhamhaw3eshha.Fragments.Z2zo2ah;
import com.example.afhamhaw3eshha.Fragments.anta7or;
import com.example.afhamhaw3eshha.Fragments.hapinessCapsols;
import com.example.afhamhaw3eshha.Fragments.hun;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    FragmentManager fM;
    FragmentTransaction fT;
    Fragment frag;
    DrawerLayout drawer;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fM = getSupportFragmentManager();
        fT = fM.beginTransaction();
        frag = new ArticleFragment();
        fT.replace(R.id.container, frag , "any tag");
        fT.commit();

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
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else{
        super.onBackPressed();
    }
}

//any thing
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch(menuItem.getItemId()){
            case R.id.كبسولات_السعادة:
                getSupportFragmentManager().beginTransaction().replace(R.id.drawer_layout,new hapinessCapsols()).commit();
                break;
            case R.id.انت_حر:
                getSupportFragmentManager().beginTransaction().replace(R.id.drawer_layout,new anta7or()).commit();
                break;
            case R.id.هن:
                getSupportFragmentManager().beginTransaction().replace(R.id.drawer_layout,new hun()).commit();
                break;
            case R.id.انت_ومزاجك:
                getSupportFragmentManager().beginTransaction().replace(R.id.drawer_layout,new AntaWMzagk()).commit();
                break;
            case R.id.اسمع_غيرك:
                getSupportFragmentManager().beginTransaction().replace(R.id.drawer_layout,new Esm3_8erak()).commit();
                break;
            case R.id.اختلاف_مش_خلاف:
                getSupportFragmentManager().beginTransaction().replace(R.id.drawer_layout,new E5tlaf_Mesh_5laf()).commit();
                break;
            case R.id.رؤى:
                getSupportFragmentManager().beginTransaction().replace(R.id.drawer_layout,new Ro2a()).commit();
                break;
            case R.id.ملف_العدد:
                getSupportFragmentManager().beginTransaction().replace(R.id.drawer_layout,new Mlf_El3dd()).commit();
                break;
            case R.id.حوار_العدد:
                getSupportFragmentManager().beginTransaction().replace(R.id.drawer_layout,new Hwar_El3dd()).commit();
                break;
            case R.id.زقزوقة:
                getSupportFragmentManager().beginTransaction().replace(R.id.drawer_layout,new Z2zo2ah()).commit();
                break;
            case R.id.علي_الأصل_دور:
                getSupportFragmentManager().beginTransaction().replace(R.id.drawer_layout,new Ala_ElAsl_Dwar()).commit();
                break;
            case R.id.الكل:
                getSupportFragmentManager().beginTransaction().replace(R.id.drawer_layout,new ElKol()).commit();
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
