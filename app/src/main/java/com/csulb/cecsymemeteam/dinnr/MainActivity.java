package com.csulb.cecsymemeteam.dinnr;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.content.Context;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    public static int index =0;
    public RestaurantProfile[] restaurants = new RestaurantProfile[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.main_restaurantPlaque);
        generateRestaurants(restaurants);
        mDrawerLayout =(DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout,R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        linearLayout.setOnTouchListener(new GestureListener(MainActivity.this)
        {

            @Override
            public void onSwipeRight()
            {
                index = (index + 1) % 3;
                changeProfile(index, restaurants);
            }
            public void onSwipeLeft()
            {
                index = Math.abs(index + 2) % 3;
                changeProfile(index, restaurants);
            }

        });
        ImageButton like =(ImageButton) findViewById(R.id.main_rightBtn);
        like.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                index = (index + 1) % 3;
                changeProfile(index, restaurants);
            }
        });
        ImageButton dislike =(ImageButton) findViewById(R.id.main_leftBtn);
        dislike.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                index = (index + 2) % 3;
                changeProfile(index, restaurants);
            }
        });
        //////////////////////////////////////////////////////////////////////////
        //                      Profile Button Listeners                        //
        //////////////////////////////////////////////////////////////////////////
        ImageButton profile = (ImageButton) findViewById(R.id.main_profileBtn);
        profile.setOnTouchListener(new GestureListener(MainActivity.this){
            @Override
            public void onSwipeRight()
            {
                index = (index + 1) % 3;
                changeProfile(index, restaurants);
            }
            public void onSwipeLeft() {
                index = Math.abs(index + 2) % 3;
                changeProfile(index, restaurants);
            }

            @Override
            public void onTap() {
                gotoProfile(findViewById(R.id.main_profileBtn));
            }
        });
        //////////////////////////////////////////////////////////////////////////
        //                   end of Profile Button Listeners                    //
        //////////////////////////////////////////////////////////////////////////
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void generateRestaurants(RestaurantProfile[] restaurants){
        restaurants[0] = new RestaurantProfile("Mcdonalds", "0.5 Miles", 4);
        restaurants[1] = new RestaurantProfile("Taco Bell", "2.0 Miles", 3);
        restaurants[2] = new RestaurantProfile("Inn N Out", "0.2 Miles", 5);
    }

    public void changeProfile(int index, RestaurantProfile[] restaurants){
        ImageView []setStar = {findViewById(R.id.main_star1),findViewById(R.id.main_star2),findViewById(R.id.main_star3),
                findViewById(R.id.main_star4),findViewById(R.id.main_star5)};
        ImageButton imgBtn = (ImageButton) findViewById(R.id.main_profileBtn);
        if(index == 0){
            imgBtn.setImageResource(R.drawable.mcdonalds);
        }
        else if(index == 1){
            imgBtn.setImageResource(R.drawable.tacobell);
        }
        else{
            imgBtn.setImageResource(R.drawable.innnout);
        }
        TextView restaurantDescription = (TextView) findViewById(R.id.main_restaurantDescriptionTxt);
        restaurantDescription.setText(restaurants[index].getName() + " " + restaurants[index].getDistance());
        for(int i = 0;i < restaurants[index].getStarRating();i++)
        {
            setStar[i].setImageResource(android.R.drawable.btn_star_big_on);

        }
        if(restaurants[index].getStarRating() <5)
        {
            for(int j=4;j>=restaurants[index].getStarRating();j--)
            {
                setStar[j].setImageResource(android.R.drawable.btn_star_big_off);
            }
        }
       // ImageView star = (ImageView)findViewById(R.id.main_star1);
       // star.setImageResource(android.R.drawable.btn_star_big_on);

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

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.login) {
            // Toast.makeText(this,"login",Toast.LENGTH_SHORT.show());
            startActivity(new Intent(this, LoginActivity.class));
        }
        if (id == R.id.newAccount) {
            // Toast.makeText(this,"login",Toast.LENGTH_SHORT.show());
            startActivity(new Intent(this, NewAccountActivity.class));
        }
        if (id == R.id.Favorite)
        {
            startActivity(new Intent(this, FavoritesActivity.class));
        }
        return false;
    }
}
