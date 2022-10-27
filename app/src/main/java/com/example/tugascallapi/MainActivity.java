package com.example.tugascallapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String KEY = "TYPE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mBRelax = findViewById(R.id.m_btn_relax);
        Button mBEdu = findViewById(R.id.m_btn_edu);
        Button mBSocial = findViewById(R.id.m_btn_social);
        Button mBRecreation = findViewById(R.id.m_btn_recreational);
        Button mBCha = findViewById(R.id.m_btn_charity);
        Button mBDiy = findViewById(R.id.m_btn_diy);
        Button mBCook = findViewById(R.id.m_btn_cooking);
        Button mBBusy = findViewById(R.id.m_btn_busywork);
        Button mBMusic = findViewById(R.id.m_btn_music);

        mBRelax.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(),DetailActivity.class);
            intent.putExtra(KEY,mBRelax.getText());
            startActivity(intent);
        });

        mBEdu.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), DetailActivity.class);
            intent.putExtra(KEY,mBEdu.getText());
            startActivity(intent);
        });

        mBSocial.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(),DetailActivity.class);
            intent.putExtra(KEY,mBSocial.getText());
            startActivity(intent);
        });

        mBRecreation.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), DetailActivity.class);
            intent.putExtra(KEY, mBRecreation.getText());
            startActivity(intent);
        });

        mBCha.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), DetailActivity.class);
            intent.putExtra(KEY,mBCha.getText());
            startActivity(intent);
        });

        mBCook.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), DetailActivity.class);
            intent.putExtra(KEY,mBCook.getText());
            startActivity(intent);
        });

        mBBusy.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(),DetailActivity.class);
            intent.putExtra(KEY,mBBusy.getText());
            startActivity(intent);
        });

        mBMusic.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), DetailActivity.class);
            intent.putExtra(KEY, mBMusic.getText());
            startActivity(intent);
        });

        mBDiy.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), DetailActivity.class);
            intent.putExtra(KEY,mBDiy.getText());
            startActivity(intent);
        });
    }
}