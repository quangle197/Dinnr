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
            listOfRestaurants.peek().generateGenericReviews();
            //Wendy's
            listOfRestaurants.push(new RestaurantProfile("Wendy's", "1351 Redwood Dr", "1.7 Miles", 2, R.drawable.wendys));
            listOfRestaurants.peek().generateGenericReviews();
            listOfRestaurants.peek().generateGenericReviews();
            listOfRestaurants.peek().generateGenericReviews();
            //Dunkin' Donuts
            listOfRestaurants.push(new RestaurantProfile("Dunkin' Donuts", "7323 Nutt Way", "1.3 Miles", 3, R.drawable.dunkind));
            listOfRestaurants.peek().generateGenericReviews();
            //Chick-fil-A
            listOfRestaurants.push(new RestaurantProfile("Chick-fil-A", "1734 Sunday Street", "2.1 Miles", 4, R.drawable.chickfila));
            listOfRestaurants.peek().generateGenericReviews();
            listOfRestaurants.peek().generateGenericReviews();
            //Arby's
            listOfRestaurants.push(new RestaurantProfile("Arby's", "46132 Main Road", "2.2 Miles", 4, R.drawable.arby));
            listOfRestaurants.peek().generateGenericReviews();
            //Chipotle Mexican Grill
            listOfRestaurants.push(new RestaurantProfile("Chipotle Mexican Grill", "16254 Spicy Street", "1.8 Miles", 5, R.drawable.chipotle));
            listOfRestaurants.peek().generateGenericReviews();
            listOfRestaurants.peek().generateGenericReviews();
            //Papa John's
            listOfRestaurants.push(new RestaurantProfile("Papa John's", "14512 Plastic Way", "0.8 Miles", 3, R.drawable.papaj));
            listOfRestaurants.peek().generateGenericReviews();
            //Hardee's
            listOfRestaurants.push(new RestaurantProfile("Hardee's", "5895 Star Street", "0.6 Miles", 2, R.drawable.hardee));
            listOfRestaurants.peek().generateGenericReviews();
            //Popeyes Louisiana Kitchen
            listOfRestaurants.push(new RestaurantProfile("Popeyes Louisiana Kitchen", "37546 Louisiana Way", "1.9 Miles", 5, R.drawable.popeye));
            listOfRestaurants.peek().generateGenericReviews();
            //Wingstop
            listOfRestaurants.push(new RestaurantProfile("Wingstop", "8114 Lemonpepper Dr", "2.6 Miles", 4, R.drawable.wingstop));
            listOfRestaurants.peek().generateGenericReviews();
            listOfRestaurants.peek().generateGenericReviews();
            //Panda Express
            listOfRestaurants.push(new RestaurantProfile("Panda Express", "3966 Bamboo Boulevard", "0.3 Miles", 3, R.drawable.pandae));
            listOfRestaurants.peek().generateGenericReviews();
            //Domino's Pizza
            listOfRestaurants.push(new RestaurantProfile("Domino's Pizza", "1836 Gray Dr", "2.5 Miles", 2, R.drawable.domino));
            listOfRestaurants.peek().generateGenericReviews();
            //Dairy Queen
            listOfRestaurants.push(new RestaurantProfile("Dairy Queen", "19943 Milk Ava", "2.6 Miles", 2, R.drawable.dairyqueen));
            listOfRestaurants.peek().generateGenericReviews();
            //Panera Bread
            listOfRestaurants.push(new RestaurantProfile("Panera Bread", "19948 White Ave", "1.2 Miles", 3, R.drawable.panera));
            listOfRestaurants.peek().generateGenericReviews();
            listOfRestaurants.peek().generateGenericReviews();
            listOfRestaurants.peek().generateGenericReviews();
            //Sonic Drive-In
            listOfRestaurants.push(new RestaurantProfile("Sonic Drive-In", "15764 Top Road", "3.5 Miles", 4, R.drawable.sonic));
            listOfRestaurants.peek().generateGenericReviews();
            listOfRestaurants.peek().generateGenericReviews();

            //Jack in the Box
            listOfRestaurants.push(new RestaurantProfile("Jack in the Box", "7762 Box Dr", "0.5 Miles", 4, R.drawable.jack));
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
