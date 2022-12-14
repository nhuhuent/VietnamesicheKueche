package com.example.vietnamesichekche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Reis_DauHuSotCa_Activity extends AppCompatActivity {

    ImageView dauhusotcaImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reis_dau_hu_sot_ca);

        // back button
        dauhusotcaImg =(ImageView) findViewById(R.id.left_back_7);
        dauhusotcaImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIcon = new Intent(Reis_DauHuSotCa_Activity.this, Reis_Gerichte_Activity.class);
                startActivity(backIcon);
            }
        });
    }
}