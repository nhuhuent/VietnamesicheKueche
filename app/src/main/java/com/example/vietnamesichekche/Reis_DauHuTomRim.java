package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Reis_DauHuTomRim extends AppCompatActivity {

    ImageView dauhutomrimImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reis_dau_hu_tom_rim);

        // back button
        dauhutomrimImg =(ImageView) findViewById(R.id.left_back_3);
        dauhutomrimImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIcon = new Intent(Reis_DauHuTomRim.this, Reis_Gerichte.class);
                startActivity(backIcon);
            }
        });
    }
}