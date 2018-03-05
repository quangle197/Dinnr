package com.csulb.cecsymemeteam.dinnr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MoreReviewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_reviews);
    }

    public void goBack(View v){
        startActivity(new Intent(this, MainActivity.class));
    }

    public void writeReview(View v){
        startActivity(new Intent(this, WriteReviewActivity.class));
    }
}
