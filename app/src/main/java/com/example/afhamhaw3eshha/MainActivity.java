package com.example.afhamhaw3eshha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.afhamhaw3eshha.Fragments.WriteFragment;

public class MainActivity extends AppCompatActivity {

    FragmentManager fM;
    FragmentTransaction fT;
    Fragment frag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fM = getSupportFragmentManager();
        fT = fM.beginTransaction();
        frag = new WriteFragment();
        fT.replace(R.id.container, frag , "any tag");
        fT.commit();


    }
}
