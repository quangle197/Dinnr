package com.csulb.cecsymemeteam.dinnr;

import java.util.ArrayList;

/*
    Lmao this is just a dummy class to hold all the runtime variables and makes it easier for activities to access them outside of doing troublesome stuff like using an actual database or using intents
 */
public class DataStorage {
    public static boolean loggedIn = false;
    public static String loginName = "";
    public static ArrayList<RestaurantProfile> listOfRestaurants = new ArrayList<>();
    public static int restaurantIndex = 0;

    public static void generateRestaurants(ArrayList<RestaurantProfile> listOfRestaurants){
        //Mcdonalds should have 2 reviews
        listOfRestaurants.add(new RestaurantProfile("Mcdonalds", "420 Blaze Street","0.5 Miles", 4, R.drawable.mcdonalds));
        listOfRestaurants.get(listOfRestaurants.size() - 1).generateGenericReviews();

        //Tacobell should have 4 reviews
        listOfRestaurants.add(new RestaurantProfile("Taco Bell", "6523 Flavor Town","2.0 Miles", 3, R.drawable.innnout));
        listOfRestaurants.get(listOfRestaurants.size() - 1).generateGenericReviews();
        listOfRestaurants.get(listOfRestaurants.size() - 1).generateGenericReviews();

        //Inn and out should have 3 reviews
        listOfRestaurants.add(new RestaurantProfile("Inn N Out", "2102 Lazy Ave","0.2 Miles", 5, R.drawable.tacobell));
        listOfRestaurants.get(listOfRestaurants.size() - 1).generateGenericReviews();
        listOfRestaurants.get(listOfRestaurants.size() - 1).generateGenericReviews();
        listOfRestaurants.get(listOfRestaurants.size() - 1).generateGenericReviews();
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

    public static ArrayList<RestaurantProfile> getListOfRestaurants() {
        return listOfRestaurants;
    }

    public static void setListOfRestaurants(ArrayList<RestaurantProfile> listOfRestaurants) {
        DataStorage.listOfRestaurants = listOfRestaurants;
    }

    public static int getRestaurantIndex() {
        return restaurantIndex;
    }

    public static void setRestaurantIndex(int restaurantIndex) {
        DataStorage.restaurantIndex = restaurantIndex;
    }
}
