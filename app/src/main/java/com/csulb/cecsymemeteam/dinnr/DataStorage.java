package com.csulb.cecsymemeteam.dinnr;

import java.util.ArrayList;

/*
    Lmao this is just a dummy class to hold all the runtime variables and makes it easier for activities to access them outside of doing troublesome stuff like using an actual database or using intents
 */
public class DataStorage {
    public static boolean loggedIn;
    public static String loginName;
    public static ArrayList<Review> listOfReviews;
    public static ArrayList<RestaurantProfile> listOfRestaurants;

    public static void main(String[] args){
        loggedIn = false;
        loginName = "";
        listOfReviews = new ArrayList<>();
        listOfRestaurants = new ArrayList<>();
        listOfReviews.add(new Review());
    }
}
