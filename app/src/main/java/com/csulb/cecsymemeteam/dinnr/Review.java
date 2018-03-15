package com.csulb.cecsymemeteam.dinnr;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Jason on 2/28/2018.
 * Stores a review. Profile of person reviewing, star rating, and what they said
 */

public class Review{
    private String profileName;
    private String profileLink;
    private String comment;
    private int starRating;
    private String dateCreated;

    public Review(String profileName, String profileLink, String comment, int starRating){
        this.profileName = profileName;
        this.profileLink = profileLink;
        this.comment = comment;
        this.starRating = starRating;
        /**
         * generates date in the format Month/Day/Year
         */
        SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
        dateCreated = date.format(Calendar.getInstance().getTime());
    }

    public Review(){
        this("PickleRick69", "https://www.google.com", "My teacher said to my I'm a failure, that I'll never amount to anything. I scoffed at him. Shocked, my teacher asked what's so funny, my future is on the line. \"Well...you see professor\" I say as the teacher prepares to laugh at my answer, rebuttal at hand. \"I watch Rick and Morty.\" The class is shocked, they merely watch pleb shows like the big bang theory to feign intelligence, not grasping the humor. \"...how? I can't even understand it's sheer nuance and subtlety.\" \"Well you see...WUBBA LUBBA DUB DUB!\" One line student laughs in the back, I turn to see a who this fellow genius is. It's none other than Albert Einstein", 4);
    }

    public String getProfileName() {
        return profileName;
    }

    public String getProfileLink() {
        return profileLink;
    }

    public String getComment() {
        return comment;
    }

    public int getStarRating() {
        return starRating;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void editReview(String newComment, int newStarRating){
        comment = newComment;
        starRating = newStarRating;
    }
}
