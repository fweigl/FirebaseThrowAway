package com.example.firebasethrowaway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mylibrary.MyClass;
import com.google.firebase.FirebaseApp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseApp.initializeApp(this);

        MyClass myClass;
    }
}
