package com.example.pay3;

//androidx platform library import provides support for for API version 28 and above.
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
/*AppCompatActivity is the overall hierarchy and wireframe setup of the app that will allow for
Activity3 to come after Activity2 and lets the app which way to navigate*/
public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         /*calls the super class on Create to create a saving instance to the app to later
         save whether or not the instance was clicked or not clicked in the case of a button.*/
        super.onCreate(savedInstanceState);
        /* Set content view allows the image view to set the layout of a certain activity/page in the resources layout xml file*/
        setContentView(R.layout.activity_4);
    }
}
