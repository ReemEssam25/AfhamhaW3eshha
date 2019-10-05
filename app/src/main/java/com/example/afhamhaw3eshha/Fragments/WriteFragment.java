package com.example.afhamhaw3eshha.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.afhamhaw3eshha.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */

public class WriteFragment extends Fragment {

    DatabaseReference reference;
   // FirebaseUser firebaseUser;

    EditText titleEditText, articleEditText, img;
    Button addButton;
    Spinner spinner;

    public WriteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_write, container, false);

        addButton = v.findViewById(R.id.add_Button);
        titleEditText = v.findViewById(R.id.title_EditText);
        articleEditText = v.findViewById(R.id.article_EditText);
        spinner = v.findViewById(R.id.spinner);

        spinner = (Spinner)v.findViewById(R.id.spinner);
        List<String> list = new ArrayList<String>();
        list.add("كبسولات السعادة");
        list.add("أنت حر");
        list.add("هن");
        list.add("أنت ومزاجك");
        list.add("اسمع غيرك");
        list.add("اختلاف مش خلاف");
        list.add("رؤى");
        list.add("ملف العدد");
        list.add("حوار العدد");
        list.add("زقزوقة");
        list.add("علي الأصل دور");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addArticle(titleEditText.getText().toString(), articleEditText.getText().toString(), String.valueOf(spinner.getSelectedItem()));
            }
        });

        return v;
    }

    private void addArticle(String title , String article /* , String img*/ , String category ){

        DatabaseReference reference1 = FirebaseDatabase.getInstance().getReference();

        HashMap <String , Object> hashMap = new HashMap<>();

        hashMap.put("title", title);
        hashMap.put("article", article);
        hashMap.put("img", "default");
        hashMap.put("likes" , "0");
        hashMap.put("category", category);

        reference1.child("Articles").push().setValue(hashMap);

    }

}
