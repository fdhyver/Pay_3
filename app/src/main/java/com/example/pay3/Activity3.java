package com.example.pay3;
//androidx platform library import provides support for for API version 28 and above.
import androidx.appcompat.app.AppCompatActivity;
/* These imports are from the android library that is built by google. to be able to
call each other. The documentation is all on google.*/
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


/*AppCompatActivity is the overall hierarchy and wireframe setup of the app that will allow for
Activity3 to come after Activity2 and lets the app which way to navigate*/
public class Activity3 extends AppCompatActivity {
    /*uses the private variable Button as a local variable to be used later by a getter method
     to Check for the button for the next activity.*/
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*calls the super class on Create to create a saving instance to the app to later
         save whether or not the instance was clicked or not clicked in the case of a button.*/
        super.onCreate(savedInstanceState);
        /* Set content view allows the image view to set the layout of a certain activity/page in the resources layout xml file*/
        setContentView(R.layout.activity_3);
        //This sets Image view 3 as part of the layout of  Activity 3
        ImageView myImageView =(ImageView) findViewById(R.id.imageView3);
        //after setting the image view it tells it to "draw" the pay2 picture
        myImageView.setImageResource(R.drawable.pay2);
        //btn3 is the button that allows the app to switch from the current activity to activity4
        button = (Button) findViewById(R.id.btn3);
// This listens to whether the btn3 is clicked and call activity4
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActivity4();
            }
        });
    }
// Intent is what is used to render the following activity so in this case it is used to render Activity4 and close the previous activity/page.
    public void openActivity4() {
        Intent intent = new Intent(this, Activity4.class);
         /*calls the method intent from the new instance created to start the
        following activity/page of the app in this case it would be Activity4.*/
        startActivity(intent);
    }
}