package com.csulb.cecsymemeteam.dinnr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class NewAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);
        RadioButton female = (RadioButton) findViewById(R.id.femaleBtn);
        RadioButton male = (RadioButton) findViewById(R.id.maleBtn);
        RadioButton notAns = (RadioButton) findViewById(R.id.noAnsBtn);

    }

    public void goBack(View v){
        startActivity(new Intent(this, MainActivity.class));
    }

    public void createAccount(View v){
        startActivity(new Intent(this, MainActivity.class));
    }
}
