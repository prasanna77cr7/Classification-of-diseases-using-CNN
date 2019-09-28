package com.example.lenovo520.diseaseprediction;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

public class splash_activity extends AppCompatActivity {
    private static int SPLASH_SCREEN_TIME_OUT=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(splash_activity.this,
                        MainActivity.class);

                startActivity(i);

                finish();
                }
        }, SPLASH_SCREEN_TIME_OUT);
    }
}
