package com.example.alc5dayschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAboutAndela(View view) {
        Intent i  = new Intent(MainActivity.this,AboutAlcActivity.class);
        startActivity(i);
    }

    public void openMyProfile(View view) {
        Intent i  = new Intent(MainActivity.this,MyProfile.class);
        startActivity(i);
    }
}
