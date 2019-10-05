package com.example.afhamhaw3eshha.Fragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.afhamhaw3eshha.Adapter.ArticleAdapter;
import com.example.afhamhaw3eshha.Model.Post;
import com.example.afhamhaw3eshha.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Z2zo2ah extends Fragment {

    private RecyclerView recyclerView;
    private ArticleAdapter adapter;
    List<Post> posts;
    List<Post> posts2;


    public Z2zo2ah() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_z2zo2ah, container, false);

        recyclerView = v.findViewById(R.id.Z2zo2a_RecycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        posts = new ArrayList<>();
        posts2 = new ArrayList<>();
        readArticles();
        return  v;
    }

    private void readArticles(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Articles");

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                posts.clear();
                posts2.clear();
                Post post1 = new Post("rrrrrrr", "eeeeeeeee,lklkp[spkp");
                posts.add(post1);
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    Post post2 = snapshot.getValue(Post.class);

                    assert post2 != null;
                    posts.add(post2);
                }
                for (int i = 0; i < posts.size(); i++) {
                    if (posts.get(i).getCategory() == "زقزوقة") ;
                    {
                        posts2.add(posts.get(i));
                    }
                }
                adapter = new ArticleAdapter(posts2, getContext());
                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });}}