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

    /**
     * takes a review from the reviews arraylist and turns it into something that the user can see on the profile page
     * @param context Lets it know what its dealing with
     * @param numOfReviews used in alternating reviews for clearer distinction
     */
    public LinearLayout generateReview(Context context, int numOfReviews){
        ViewGroup.MarginLayoutParams params;

        //=====================================================================================================================================================//
        //Formatting for the review container
        LinearLayout review = new LinearLayout(context);           //holds everything about the review
        review.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        review.setOrientation(LinearLayout.VERTICAL);
        if(numOfReviews % 2 == 0) {
            review.setBackgroundResource(R.color.reviewsBackground);
        }
        //=====================================================================================================================================================//

        //=====================================================================================================================================================//
        //Formatting for the container for the stars and date
        LinearLayout temp = new LinearLayout(context);             //contains the user's star rating and the date when the review was created
        temp.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        temp.setOrientation(LinearLayout.HORIZONTAL);
        review.addView(temp);
        //=====================================================================================================================================================//

        //=====================================================================================================================================================//
        //Formatting for the user's username
        TextView usernameTxt = new TextView(context);
        usernameTxt.setText(getProfileName());
        usernameTxt.setTypeface(Typeface.DEFAULT_BOLD);
        temp.addView(usernameTxt, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));
        params = (ViewGroup.MarginLayoutParams) usernameTxt.getLayoutParams();
        params.leftMargin = 5;
        params.rightMargin = 10;
        //=====================================================================================================================================================//

        //=====================================================================================================================================================//
        //Formatting for the stars, and graphics generation
        ImageView[] stars = new ImageView[5];
        for(int i = 0; i < stars.length; i++){
            stars[i] = new ImageView(context);
            if(i < getStarRating()) {
                stars[i].setImageResource(android.R.drawable.btn_star_big_on);
            }
            else {
                stars[i].setImageResource(android.R.drawable.btn_star_big_off);
            }
            temp.addView(stars[i], new LinearLayout.LayoutParams(30, 30, 1f));
        }
        params = (ViewGroup.MarginLayoutParams) stars[0].getLayoutParams();
        params.leftMargin = 5;
        //=====================================================================================================================================================//

        //=====================================================================================================================================================//
        //Formatting for the space between the rating stars and date
        Space space = new Space(context);                          //space between the stars and date created
        temp.addView(space, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1000f));
        //=====================================================================================================================================================//

        //=====================================================================================================================================================//
        //Formatting for the date textfield
        TextView dateTxt = new TextView(context);
        dateTxt.setText(getDateCreated());
        temp.addView(dateTxt, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));
        params = (ViewGroup.MarginLayoutParams) dateTxt.getLayoutParams();
        params.rightMargin = 5;
        //=====================================================================================================================================================//

        //=====================================================================================================================================================//
        //Formatting for the user's comment
        TextView comment = new TextView(context);
        comment.setText(getComment());
        review.addView(comment, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));
        params = (ViewGroup.MarginLayoutParams) comment.getLayoutParams();
        params.leftMargin = 5;
        //=====================================================================================================================================================//*/
        return review;
    }

    public void editReview(String newComment, int newStarRating){
        comment = newComment;
        starRating = newStarRating;
    }
}
