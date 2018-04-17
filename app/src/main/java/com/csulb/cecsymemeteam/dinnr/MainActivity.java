package com.csulb.cecsymemeteam.dinnr;

import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Context;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //private final GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.layout.activity_main);

        linearLayout.setOnTouchListener(new GestureListener(MainActivity.this)
        {
            @Override
            public void onSwipeRight()
            {
                Toast.makeText(MainActivity.this, "swipe right", Toast.LENGTH_SHORT).show();
            }
            public void onSwipeLeft()
            {
                Toast.makeText(MainActivity.this, "swipe left", Toast.LENGTH_SHORT).show();
            }
        });
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
