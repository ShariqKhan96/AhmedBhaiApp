package com.example.hp.ahmedbhaiapp.AllAtivities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hp.ahmedbhaiapp.Common.common;
import com.example.hp.ahmedbhaiapp.R;

public class Login extends AppCompatActivity {

    EditText userName, userPass;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = findViewById(R.id.userName);
        userPass = findViewById(R.id.userPass);

        loginButton = findViewById(R.id.login);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(TextUtils.isEmpty(userName.getText().toString()) && TextUtils.isEmpty(userPass.getText().toString()))) {

                    SharedPreferences.Editor prefs = getSharedPreferences(common.sharedPreferences, MODE_PRIVATE).edit();
                    prefs.putString(common.nameField, userName.getText().toString());
                    prefs.apply();

                    Intent intent = new Intent(Login.this, Home.class);
                    startActivity(intent);
                    finish();

                } else {
                    Toast.makeText(Login.this, "Fill in the fields", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
