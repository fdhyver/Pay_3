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
public class MainActivity extends AppCompatActivity {
    //uses the private variable Button to Check for the button  object to get to the next activity/Page of the app.
    private Button button;
    @Override

    /*This protected void onCreate class uses the bundle savedInstanceState
     to create the state of whether the state of the action is true
    i.e if the button is clicked it creates an instance of the button being
     clicked and uses the bundle to set the state as clicked to execute the action of the button. */
    protected void onCreate(Bundle savedInstanceState)
    {
        /*calls the super class on Create to create a saving
         instance to the app to later save whether or not the instance was clicked or not clicked in the case of a button.*/
        super.onCreate(savedInstanceState);
        //sets the Layout of the rendering on page 2 of the app
        setContentView(R.layout.activity_main);
        //sets the image viewer object for the app with image view
        ImageView myImageView = findViewById(R.id.imageView1);
        //sets the image called pay1 under drawables for the user to see
        myImageView.setImageResource(R.drawable.total);
        //uses the variable button to find the object button called btn1
        button = (Button) findViewById(R.id.btn1);
        /* sets the onClickListener to listen for the action of clicking the button and call intent for being
        able to open Activity 2 and 3 from the Main activity being the parent Activity.*/
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                /* the below command between brackets tell the program which application activities to open from
                the parameters set under the Main_Activity.Java file to open activity 2 and activity 3*/
                { openActivity3 ();}
                openActivity2();

            }
        });
    }

    /*This public void class sets up the reference for the program to know that the activity 3 XML file layout
    and corresponding drawables have to be accessed to create the image view and show the activity*/
    public void openActivity3() {
        Intent intent = new Intent(this, Activity3.class);
        /*StartActivity intent calls the intent method which is part of the google library to start a new activity
        and delete the process of the previous one*/
        startActivity(intent);
    }
    /*This public void class sets up the reference for the program to know that the activity 2 XML file layout
   and corresponding drawables have to be accessed to create the image view and show the activity*/
    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
         /*calls the method intent from the new instance created to start the
        following activity/page of the app in this case it would be Activity2.*/
        startActivity(intent);
    }

}
