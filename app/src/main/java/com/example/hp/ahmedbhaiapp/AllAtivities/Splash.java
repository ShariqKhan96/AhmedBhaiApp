package com.example.hp.ahmedbhaiapp.AllAtivities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hp.ahmedbhaiapp.Common.common;
import com.example.hp.ahmedbhaiapp.R;

public class Splash extends AppCompatActivity {


    @Override
    protected void onStart() {
        super.onStart();

        SharedPreferences preferences = getSharedPreferences(common.sharedPreferences, MODE_PRIVATE);
        if (preferences.getString(common.nameField, "Empty").equals("Empty")) {
            Intent intent = new Intent(Splash.this, Login.class);
            startActivity(intent);
            finish();

        } else {
            Intent intent = new Intent(Splash.this, Home.class);
            startActivity(intent);
            finish();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
}
