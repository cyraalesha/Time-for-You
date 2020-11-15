package com.example.timeforyou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private static int TIME_OUT = 3000; //Time to launch the another activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final android.view.View myLayout = findViewById(R.id.login);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                android.content.Intent i = new android.content.Intent(MainActivity.this, loginpage.class);
                startActivity(i);
                finish();
            }
        }, TIME_OUT);
    }
};