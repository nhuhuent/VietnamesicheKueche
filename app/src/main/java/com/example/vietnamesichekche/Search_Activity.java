package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Search_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_activity);

        // back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}