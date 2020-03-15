package com.example.doggoboo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    //This is the variable for setting the required time of the splash screen.
    public static int SPLASH_TIMER = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //This sets the window in full screen mode
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main); //binds MainActivity.class with activity_main.xml

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //switches from splashscreen to main menu of the app
                Intent i=new Intent(MainActivity.this,MenuScreen.class);

                startActivity(i);
                finish();

            }
        },SPLASH_TIMER);


    }
}
