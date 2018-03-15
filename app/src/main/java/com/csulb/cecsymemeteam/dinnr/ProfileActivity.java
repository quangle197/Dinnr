package com.csulb.cecsymemeteam.dinnr;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import android.widget.WrapperListAdapter;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {
    private int numOfReviews = 0;
    private ArrayList<Review> reviews = new ArrayList<Review>();                  //we need to retrieve this via a database
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        LinearLayout scrollView = findViewById(R.id.reviewsLinearLayout);

        //Grabs 7 reviews (from a database or whatever) and creates it on screen so that the user can view them
        for(int i = 0; i < 7; i++){
            reviews.add(new Review());
            scrollView.addView(ReviewFactory.generateReview(this, reviews.get(i),numOfReviews), new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            numOfReviews++;
        }
    }

    /**
     * Directs users to the write review activity
     * @param v
     */
    public void writeReview(View v){
        startActivity(new Intent(this, WriteReviewActivity.class));
    }

    /**
     * Directs users to another page where they can see reviews more clearly
     * @param v
     */
    public void gotoMoreReviews(View v){
        startActivity(new Intent(this, MoreReviewsActivity.class));
    }

    /**
     * Directs users back to the main activity
     * @param v
     */
    public void goBack(View v){
        startActivity(new Intent(this, MainActivity.class));
    }
}
