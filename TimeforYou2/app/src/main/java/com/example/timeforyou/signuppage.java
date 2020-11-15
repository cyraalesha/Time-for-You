package com.example.timeforyou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class signuppage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        private FirebaseAuth mAuth;
        mAuth = FirebaseAuth.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuppage);

    }
}

