package com.csulb.cecsymemeteam.dinnr;

import android.graphics.drawable.Drawable;
import android.widget.ImageButton;

/**
 * Created by Jason on 2/28/2018.
 * The purpose of this class is to store the attributes of a restaurant
 */

public class RestaurantProfile{
    public String name;
    public String distance;
    public int starRating;
    public Drawable img;

    public RestaurantProfile(String name, String distance, int starRating){
        this.name = name;
        this.distance = distance;
        this.starRating = starRating;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public Drawable getImg() {
        return img;
    }

    public void setImg(Drawable img) {
        this.img = img;
    }
}
