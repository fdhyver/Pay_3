package com.example.pay3;
//androidx platform library import provides support for for API version 28 and above.
import androidx.appcompat.app.AppCompatActivity;

/* These imports are from the android library that is built by google. to be able to
call each other. The documentation is all on google.*/
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
// These gms.wallet.xxxxx are used for payment client and processing. They are noted in the app build gradle.
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet;
import com.google.android.gms.wallet.WalletConstants;

/*AppCompatActivity is the overall hierarchy and wireframe setup of the app that will allow for
Activity3 to come after Activity2 and lets the app which way to navigate*/
public class Activity2 extends AppCompatActivity {
    /*uses the private variable Button  and PaymentsClient as local variables to be used later by a getter method
    to Check for the button for the next activity and to check if the payment has gone through.*/
    private Button button;
    private PaymentsClient paymentsClient;

    @SuppressLint("WrongViewCast")
    @Override
    //checks the instance of the continue activity button
    protected void onCreate(Bundle savedInstanceState) {
        /*calls the super class on Create to create a saving
        instance to the app to later save whether or
         not the instance was clicked or not clicked in the case of a button.*/
        super.onCreate(savedInstanceState);
        /* Set content view allows the image view to set the layout of a certain activity/page in the resources layout xml file*/
        setContentView(R.layout.activity_2);
        //sets the Layout of the rendering on page 2 of the app
     Wallet.WalletOptions walletOptions =
             /* WalletOptions.Builder is used  as a getter method to get build
              for all possible options in the wallet library so that the user is able
              to use the app with ease by being able to process multiple pieces of
              data provided by the uses with different purposes such as payment processing while doing id verification
              of the name, zip code, and credit card number*/
             new Wallet.WalletOptions.Builder()
                     /*Wallet environment gets set as a test environment per google guidelines without being registered.
                     when it's ready to be used for production the word TEST gets replaced by "production" word*/
             .setEnvironment(WalletConstants.ENVIRONMENT_TEST)
                     /*.build() is used to build the application and the instances as a whole to be able to tell later the paymentsClient
                      to apply the walletOptions from the google library. */
             .build();
     paymentsClient = Wallet.getPaymentsClient(
             this, walletOptions);

        // sets the onClickListener to listen for the action of clicking the button and call intent for Activity3
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            /*onClick tells the view to look for activity3 which is between brackets to tell the app where it is supposed to go and let Activity3 be rendered
             a View occupies a rectangular area on the screen and is responsible for drawing and event handling.
             */
            public void onClick(View v)
            {
                openActivity3();
            }
        });
    }

    public void showGooglePayButton (boolean userIsReadyToPay){
        if(userIsReadyToPay){
            /*here is to put the desired action when the user is ready to pay or all the information has been entered in the form
            i.e Update your UI to show the Google Pay button or
            googlePayButton.setVisibility(View.VISIBLE);
             */
        }else{
            /* in here it is for in case the user is not ready so that only when the user has filled out the form
            the button will appear
            i.e Google Pay is not supported.Do not show the button.*/
        }

    }

    /* Intent is what is used to render the following activity so in this case
    it is used to render Activity3 and close the previous activity/page.*/
    public void openActivity3() {
        //Intent calls the Activity 3 class to open the Activity with its xml Layout.
        Intent intent = new Intent(this, Activity3.class);
        /*calls the method intent from the new instance created to start the
        following activity/page of the app in this case it would be Activity3.*/
        startActivity(intent);
    }

}

