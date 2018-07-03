package com.londonappbrewery.destini;

import android.net.sip.SipSession;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyView;
    Button buttonTop;
    Button buttonBot;
    int storyStage = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        storyView = findViewById(R.id.storyTextView);
        buttonTop = findViewById(R.id.buttonTop);
        buttonBot = findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (storyStage == 1) {
                    storyView.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonBot.setText(R.string.T3_Ans2);
                    storyStage = 3;
                } else if (storyStage == 3) {
                    storyView.setText(R.string.T6_End);
                    buttonTop.setVisibility(View.GONE); //put this into a function maybe
                    buttonBot.setVisibility(View.GONE);
                } else if (storyStage == 2) {
                    storyView.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonBot.setText(R.string.T3_Ans2);
                    storyStage = 3;
                }

            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        buttonBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (storyStage == 1) {
                    storyView.setText(R.string.T2_Story);
                    buttonTop.setText(R.string.T2_Ans1);
                    buttonBot.setText(R.string.T2_Ans2);
                    storyStage = 2;
                } else if (storyStage == 2) {
                    storyView.setText(R.string.T4_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBot.setVisibility(View.GONE);
                } else if (storyStage == 3) {
                    storyView.setText(R.string.T5_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBot.setVisibility(View.GONE);
                }

            }
        });


    }

}
