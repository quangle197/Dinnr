package com.csulb.cecsymemeteam.dinnr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void goBack(View v){
        startActivity(new Intent(this, MainActivity.class));
    }

    public void login(View v){
        startActivity(new Intent(this, LoginActivity.class));
    }

    public void createAccount(View v){
        startActivity(new Intent(this, NewAccountActivity.class));
    }
}
