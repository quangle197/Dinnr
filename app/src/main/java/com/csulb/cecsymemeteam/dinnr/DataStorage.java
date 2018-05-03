package com.csulb.cecsymemeteam.dinnr;

import android.widget.RemoteViews;

import java.util.ArrayList;
import java.util.Stack;

/*
    Lmao this is just a dummy class to hold all the runtime variables and makes it easier for activities to access them outside of doing troublesome stuff like using an actual database or using intents
 */
public class DataStorage {
    private static boolean loggedIn = false;
    private static boolean beenGenerated = false;

    private static String loginName = "";
    private static Stack<RestaurantProfile> listOfRestaurants = new Stack<>();
    private static ArrayList<RestaurantProfile> queue = new ArrayList<>();


    public static void generateRestaurants(){
        if(!beenGenerated) {
            //Mcdonalds should have 2 reviews
            listOfRestaurants.push(new RestaurantProfile("Mcdonalds", "420 Blaze Street", "0.5 Miles", 4, R.drawable.mcdonalds));
            listOfRestaurants.peek().generateGenericReviews();

            //Tacobell should have 4 reviews

            listOfRestaurants.push(new RestaurantProfile("Taco Bell", "6523 Flavor Town", "2.0 Miles", 3, R.drawable.innnout));
            listOfRestaurants.peek().generateGenericReviews();
            listOfRestaurants.peek().generateGenericReviews();

            //Inn and out should have 3 reviews
            listOfRestaurants.push(new RestaurantProfile("Inn N Out", "2102 Lazy Ave", "0.2 Miles", 5, R.drawable.tacobell));
            listOfRestaurants.peek().generateGenericReviews();
            listOfRestaurants.peek().generateGenericReviews();
            listOfRestaurants.peek().generateGenericReviews();

            //Subway
            listOfRestaurants.push(new RestaurantProfile("Subway", "1225 Sub Way", "0.4 Miles", 4, R.drawable.subway));
            listOfRestaurants.peek().generateGenericReviews();
            listOfRestaurants.peek().generateGenericReviews();
            listOfRestaurants.peek().generateGenericReviews();
            listOfRestaurants.peek().generateGenericReviews();


            //KFC
            listOfRestaurants.push(new RestaurantProfile("KFC", "6432 Blackstone Dr", "1.4 Miles", 2, R.drawable.kfc));
            listOfRestaurants.peek().generateGenericReviews();
            listOfRestaurants.peek().generateGenericReviews();

            //Burger King
            listOfRestaurants.push(new RestaurantProfile("Burger King", "422 Blaze Street", "0.5 Miles", 4, R.drawable.burger_king));
            listOfRestaurants.peek().generateGenericReviews();

            //Pizza Hut
            listOfRestaurants.push(new RestaurantProfile("Pizza Hut", "68 Rando Road", "0.8 Miles", 3, R.drawable.pizza_hut));
            listOfRestaurants.peek().generateGenericReviews();
            listOfRestaurants.peek().generateGenericReviews();
            listOfRestaurants.peek().generateGenericReviews();


            //Starbucks
            listOfRestaurants.push(new RestaurantProfile("Starbucks", "19943 White Ave", "1.1 Miles", 4, R.drawable.starbucks));
            listOfRestaurants.peek().generateGenericReviews();
            beenGenerated = true;
        }
    }

    public static ArrayList<Review> getListOfReviews(){
        return listOfRestaurants.peek().getListOfReviews();
    }

    public static RestaurantProfile getRestaurant(){
        return listOfRestaurants.peek();
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        DataStorage.loggedIn = loggedIn;
    }

    public static String getLoginName() {
        return loginName;
    }

    public static void setLoginName(String loginName) {
        DataStorage.loginName = loginName;
    }

    public static Stack<RestaurantProfile> getListOfRestaurants() {
        return listOfRestaurants;
    }

    public static void setListOfRestaurants(Stack<RestaurantProfile> listOfRestaurants) {
        DataStorage.listOfRestaurants = listOfRestaurants;
    }

    public static ArrayList<RestaurantProfile> getQueue() {
        return queue;
    }

    public static void setQueue(ArrayList<RestaurantProfile> queue) {
        DataStorage.queue = queue;
    }

    public static boolean isBeenGenerated() {
        return beenGenerated;
    }

    public static void setBeenGenerated(boolean beenGenerated) {
        DataStorage.beenGenerated = beenGenerated;
    }
}
