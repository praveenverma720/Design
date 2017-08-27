package com.praveen.design;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
/**
 * Created by PRAVEEN on 27/08/2017.
 */
public class LoginActivity extends AppCompatActivity {

//    Typeface custom_fonts = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Bold.ttf");
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setting default screen to login.xml
        setContentView(R.layout.activity_login);

        ImageButton im = (ImageButton) findViewById(R.id.CAbtn);
       // TextView myTextView = (TextView) findViewById(R.id.sign_up_tv);
       // myTextView.setTypeface(custom_fonts);

       // TextView registerScreen = (TextView) findViewById(R.id.email_et);

        // Listening to register new account link
        im.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Switching to Register screen
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }

}
