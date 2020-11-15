package com.example.timeforyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class loginpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        android.widget.Button signup = findViewById(R.id.signup);
        signup.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(android.view.View v) {
                Intent activity2Intent = new Intent(getApplicationContext(), signuppage.class);
                startActivity(activity2Intent);
            }
        });
    }
}