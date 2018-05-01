package com.csulb.cecsymemeteam.dinnr;

import android.graphics.drawable.Drawable;
import android.widget.ImageButton;

import java.util.ArrayList;

/**
 * Created by Jason on 2/28/2018.
 * The purpose of this class is to store the attributes of a restaurant
 */

public class RestaurantProfile{
    public String name;
    public String address;
    public String distance;
    public int starRating;
    public int refToImg;
    public ArrayList<Review> listOfReviews;

    public RestaurantProfile(String name, String address, String distance, int starRating, int refToImg){
        this.name = name;
        this.address = address;
        this.distance = distance;
        this.starRating = starRating;
        this.refToImg = refToImg;
        listOfReviews = new ArrayList<>();
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

    public int getRefToImg() {
        return refToImg;
    }

    public void setRefToImg(int refToImg) {
        this.refToImg = refToImg;
    }

    public ArrayList<Review> getListOfReviews() {
        return listOfReviews;
    }

    public void setListOfReviews(ArrayList<Review> listOfReviews) {
        this.listOfReviews = listOfReviews;
    }


    public void addReview(Review r)
    {
        listOfReviews.add(r);
    }

    public void addReview(Review r, int index)
    {
        listOfReviews.add(index, r);
    }

    public void generateGenericReviews(){
        listOfReviews.add(new Review());
        listOfReviews.add(new Review());
    }
}
