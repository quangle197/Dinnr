package com.csulb.cecsymemeteam.dinnr;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Context;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //private final GestureDetector gestureDetector;
    public RestaurantProfile[] restaurants = new RestaurantProfile[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.main_restaurantPlaque);
        generateRestaurants(restaurants);
        linearLayout.setOnTouchListener(new GestureListener(MainActivity.this)
        {
            int index = 0;
            @Override
            public void onSwipeRight()
            {
                index = (index + 1) % 3;
                changeProfile(index, restaurants);
            }
            public void onSwipeLeft()
            {
                index = (index + 1) % 3;
                changeProfile(index, restaurants);
            }

        });
    }

    private void generateRestaurants(RestaurantProfile[] restaurants){
        restaurants[0] = new RestaurantProfile("Mcdonalds", "0.5 Miles", 4);
        restaurants[1] = new RestaurantProfile("Taco Bell", "2.0 Miles", 3);
        restaurants[2] = new RestaurantProfile("Inn N Out", "0.2 Miles", 5);
    }

    public void changeProfile(int index, RestaurantProfile[] restaurants){
        ImageButton imgBtn = (ImageButton) findViewById(R.id.main_profileBtn);
        if(index == 0){
            imgBtn.setImageResource(R.drawable.mcdonalds);
        }
        else if(index == 1){
            imgBtn.setImageResource(R.drawable.tacoBell);
        }
        else{
            imgBtn.setImageResource(R.drawable.innnout);
        }
        TextView restaurantDescription = (TextView) findViewById(R.id.main_restaurantDescriptionTxt);
        restaurantDescription.setText(restaurants[index].getName() + " " + restaurants[index].getDistance());
    }

    public void gotoFavorites(View v){
        startActivity(new Intent(this, FavoritesActivity.class));
    }

    public void gotoSettings(View v){
        startActivity(new Intent(this, SettingsActivity.class));
    }

    public void gotoProfile(View v){
        startActivity(new Intent(this, ProfileActivity.class));
    }
}
