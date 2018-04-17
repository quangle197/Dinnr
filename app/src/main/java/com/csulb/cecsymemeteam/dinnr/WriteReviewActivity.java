package com.csulb.cecsymemeteam.dinnr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WriteReviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_review);

    }

    public void goBack(View v){
        startActivity(new Intent(this, ProfileActivity.class));
    }
    public void sendReview(View v){
        startActivity(new Intent(this, ProfileActivity.class));
    }
}
