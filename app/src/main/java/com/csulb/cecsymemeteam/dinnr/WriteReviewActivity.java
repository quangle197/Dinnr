package com.csulb.cecsymemeteam.dinnr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WriteReviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_review);
        Button send = findViewById(R.id.writeReview_sendBtn);
        final EditText title = findViewById(R.id.writeReview_titleTxtField);
        final EditText comment = findViewById(R.id.writeReview_reviewTxtField);
        send.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Review r = new Review("Anonymous","google.com",title.getText().toString(),
                        comment.getText().toString(), 4);
                DataStorage.getRestaurant().addReview(r);
                sendReview(view);
            }

        });

    }


    public void goBack(View v){
        startActivity(new Intent(this, ProfileActivity.class));
    }
    public void sendReview(View v)
    {
        startActivity(new Intent(this, ProfileActivity.class));
    }
}
