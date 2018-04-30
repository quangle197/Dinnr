package com.csulb.cecsymemeteam.dinnr;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;

/**
 * Created by Jason on 3/15/2018.
 */

public class ReviewFactory {
    /**
     * takes a review from the reviews arraylist and turns it into something that the user can see on the profile page
     * @param context Lets it know what its dealing with
     * @param numOfReviews used in alternating reviews for clearer distinction
     */
    public static LinearLayout generateReview(Context context, Review r, int numOfReviews){
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
        usernameTxt.setText(r.getProfileName());
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
            if(i < r.getStarRating()) {
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
        dateTxt.setText(r.getDateCreated());
        temp.addView(dateTxt, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));
        params = (ViewGroup.MarginLayoutParams) dateTxt.getLayoutParams();
        params.rightMargin = 5;
        //=====================================================================================================================================================//

        //=====================================================================================================================================================//
        //Formatting for the user's comment's title
        TextView title = new TextView(context);
        title.setText(r.getTitleOfComment());
        title.setTypeface(Typeface.DEFAULT_BOLD);
        review.addView(title, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));
        params = (ViewGroup.MarginLayoutParams) title.getLayoutParams();
        params.leftMargin = 5;
        //=====================================================================================================================================================//*/

        //=====================================================================================================================================================//
        //Formatting for the user's comment
        TextView comment = new TextView(context);
        comment.setText(r.getComment());
        review.addView(comment, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));
        params = (ViewGroup.MarginLayoutParams) comment.getLayoutParams();
        params.leftMargin = 5;
        //=====================================================================================================================================================//*/
        return review;
    }

    /**
     * Generates a review and doesn't bother with the background
     * @param context Lets it know what its dealing with
     */
    public static LinearLayout generateReview(Context context, Review r){
        ViewGroup.MarginLayoutParams params;

        //=====================================================================================================================================================//
        //Formatting for the review container
        LinearLayout review = new LinearLayout(context);           //holds everything about the review
        review.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        review.setOrientation(LinearLayout.VERTICAL);
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
        usernameTxt.setText(r.getProfileName());
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
            if(i < r.getStarRating()) {
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
        dateTxt.setText(r.getDateCreated());
        temp.addView(dateTxt, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));
        params = (ViewGroup.MarginLayoutParams) dateTxt.getLayoutParams();
        params.rightMargin = 5;
        //=====================================================================================================================================================//

        //=====================================================================================================================================================//
        //Formatting for the user's comment's title
        TextView title = new TextView(context);
        title.setText(r.getTitleOfComment());
        title.setTypeface(Typeface.DEFAULT_BOLD);
        review.addView(title, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));
        params = (ViewGroup.MarginLayoutParams) title.getLayoutParams();
        params.leftMargin = 5;
        //=====================================================================================================================================================//*/

        //=====================================================================================================================================================//
        //Formatting for the user's comment
        TextView comment = new TextView(context);
        comment.setText(r.getComment());
        review.addView(comment, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));
        params = (ViewGroup.MarginLayoutParams) comment.getLayoutParams();
        params.leftMargin = 5;
        //=====================================================================================================================================================//*/
        return review;
    }
}
